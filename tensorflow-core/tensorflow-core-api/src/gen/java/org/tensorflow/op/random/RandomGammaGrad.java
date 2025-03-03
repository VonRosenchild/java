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

package org.tensorflow.op.random;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Computes the derivative of a Gamma random sample w.r.t. `alpha`.
 * 
 * @param <T> data type for {@code output()} output
 */
public final class RandomGammaGrad<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new RandomGammaGrad operation.
   * 
   * @param scope current scope
   * @param alpha 
   * @param sample 
   * @return a new instance of RandomGammaGrad
   */
  public static <T extends Number> RandomGammaGrad<T> create(Scope scope, Operand<T> alpha, Operand<T> sample) {
    OperationBuilder opBuilder = scope.env().opBuilder("RandomGammaGrad", scope.makeOpName("RandomGammaGrad"));
    opBuilder.addInput(alpha.asOutput());
    opBuilder.addInput(sample.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RandomGammaGrad<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private RandomGammaGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
