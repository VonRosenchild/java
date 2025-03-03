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

package org.tensorflow.op.core;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Perform a quantized matrix multiplication of  `a` by the matrix `b` with bias
 * add and relu fusion.
 * <p>
 * The inputs must be two-dimensional matrices and 1D bias vector. And the inner
 * dimension of `a` (after being transposed if `transpose_a` is non-zero) must
 * match the outer dimension of `b` (after being transposed if `transposed_b` is
 * non-zero). Then do broadcast add operation with bias values on the matrix
 * mulplication result. The bias size must match inner dimension of `b`. Then do
 * relu activation to get non-negative result.
 * 
 * @param <V> data type for {@code out()} output
 */
public final class QuantizedMatMulWithBiasAndRelu<V> extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.QuantizedMatMulWithBiasAndRelu}
   */
  public static class Options {
    
    /**
     * @param transposeA If true, `a` is transposed before multiplication.
     */
    public Options transposeA(Boolean transposeA) {
      this.transposeA = transposeA;
      return this;
    }
    
    /**
     * @param transposeB If true, `b` is transposed before multiplication.
     */
    public Options transposeB(Boolean transposeB) {
      this.transposeB = transposeB;
      return this;
    }
    
    /**
     * @param inputQuantMode Input data quantization mode. Either MIN_FIRST(default) or SCALED.
     */
    public Options inputQuantMode(String inputQuantMode) {
      this.inputQuantMode = inputQuantMode;
      return this;
    }
    
    private Boolean transposeA;
    private Boolean transposeB;
    private String inputQuantMode;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new QuantizedMatMulWithBiasAndRelu operation.
   * 
   * @param scope current scope
   * @param a A matrix to be multiplied. Must be a two-dimensional tensor of type `quint8`.
   * @param b A matrix to be multiplied and must be a two-dimensional tensor of type `qint8`.
   * @param bias A 1D bias tensor with size matching with inner dimension of `b` (after being
   * transposed if `transposed_b` is non-zero).
   * @param minA The float value that the lowest quantized `a` value represents.
   * @param maxA The float value that the highest quantized `a` value represents.
   * @param minB The float value that the lowest quantized `b` value represents.
   * @param maxB The float value that the highest quantized `b` value represents.
   * @param Toutput 
   * @param options carries optional attributes values
   * @return a new instance of QuantizedMatMulWithBiasAndRelu
   */
  public static <V, T, U> QuantizedMatMulWithBiasAndRelu<V> create(Scope scope, Operand<T> a, Operand<U> b, Operand<Float> bias, Operand<Float> minA, Operand<Float> maxA, Operand<Float> minB, Operand<Float> maxB, Class<V> Toutput, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedMatMulWithBiasAndRelu", scope.makeOpName("QuantizedMatMulWithBiasAndRelu"));
    opBuilder.addInput(a.asOutput());
    opBuilder.addInput(b.asOutput());
    opBuilder.addInput(bias.asOutput());
    opBuilder.addInput(minA.asOutput());
    opBuilder.addInput(maxA.asOutput());
    opBuilder.addInput(minB.asOutput());
    opBuilder.addInput(maxB.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Toutput", DataType.fromClass(Toutput));
    if (options != null) {
      for (Options opts : options) {
        if (opts.transposeA != null) {
          opBuilder.setAttr("transpose_a", opts.transposeA);
        }
        if (opts.transposeB != null) {
          opBuilder.setAttr("transpose_b", opts.transposeB);
        }
        if (opts.inputQuantMode != null) {
          opBuilder.setAttr("input_quant_mode", opts.inputQuantMode);
        }
      }
    }
    return new QuantizedMatMulWithBiasAndRelu<V>(opBuilder.build());
  }
  
  /**
   * @param transposeA If true, `a` is transposed before multiplication.
   */
  public static Options transposeA(Boolean transposeA) {
    return new Options().transposeA(transposeA);
  }
  
  /**
   * @param transposeB If true, `b` is transposed before multiplication.
   */
  public static Options transposeB(Boolean transposeB) {
    return new Options().transposeB(transposeB);
  }
  
  /**
   * @param inputQuantMode Input data quantization mode. Either MIN_FIRST(default) or SCALED.
   */
  public static Options inputQuantMode(String inputQuantMode) {
    return new Options().inputQuantMode(inputQuantMode);
  }
  
  /**
   */
  public Output<V> out() {
    return out;
  }
  
  /**
   * The float value that the lowest quantized output value represents.
   */
  public Output<Float> minOut() {
    return minOut;
  }
  
  /**
   * The float value that the highest quantized output value represents.
   */
  public Output<Float> maxOut() {
    return maxOut;
  }
  
  private Output<V> out;
  private Output<Float> minOut;
  private Output<Float> maxOut;
  
  private QuantizedMatMulWithBiasAndRelu(Operation operation) {
    super(operation);
    int outputIdx = 0;
    out = operation.output(outputIdx++);
    minOut = operation.output(outputIdx++);
    maxOut = operation.output(outputIdx++);
  }
}
