/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.signal;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Real-valued fast Fourier transform.
 * <p>
 * Computes the 1-dimensional discrete Fourier transform of a real-valued signal
 * over the inner-most dimension of `input`.
 * <p>
 * Since the DFT of a real signal is Hermitian-symmetric, `signal.Rfft` only returns the
 * `fft_length / 2 + 1` unique components of the FFT: the zero-frequency term,
 * followed by the `fft_length / 2` positive-frequency terms.
 * <p>
 * Along the axis `signal.Rfft` is computed on, if `fft_length` is smaller than the
 * corresponding dimension of `input`, the dimension is cropped. If it is larger,
 * the dimension is padded with zeros.
 */
@Operator(group = "signal")
public final class Rfft extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new Rfft operation.
   * 
   * @param scope current scope
   * @param input A float32 tensor.
   * @param fftLength An int32 tensor of shape [1]. The FFT length.
   * @return a new instance of Rfft
   */
  public static Rfft create(Scope scope, Operand<Float> input, Operand<Integer> fftLength) {
    OperationBuilder opBuilder = scope.env().opBuilder("RFFT", scope.makeOpName("Rfft"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(fftLength.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Rfft(opBuilder.build());
  }
  
  /**
   * A complex64 tensor of the same rank as `input`. The inner-most
   *   dimension of `input` is replaced with the `fft_length / 2 + 1` unique
   *   frequency components of its 1D Fourier transform.
   * <p>
   * @compatibility(numpy)
   * Equivalent to np.fft.rfft
   * @end_compatibility
   */
  public Output<?> output() {
    return output;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) output;
  }
  
  private Output<?> output;
  
  private Rfft(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
