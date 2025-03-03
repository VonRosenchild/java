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

package org.tensorflow.op.linalg;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Computes the reverse mode backpropagated gradient of the Cholesky algorithm.
 * <p>
 * For an explanation see "Differentiation of the Cholesky algorithm" by
 * Iain Murray http://arxiv.org/abs/1602.07527.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "linalg")
public final class CholeskyGrad<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new CholeskyGrad operation.
   * 
   * @param scope current scope
   * @param l Output of batch Cholesky algorithm l = cholesky(A). Shape is `[..., M, M]`.
   * Algorithm depends only on lower triangular part of the innermost matrices of
   * this tensor.
   * @param grad df/dl where f is some scalar function. Shape is `[..., M, M]`.
   * Algorithm depends only on lower triangular part of the innermost matrices of
   * this tensor.
   * @return a new instance of CholeskyGrad
   */
  public static <T extends Number> CholeskyGrad<T> create(Scope scope, Operand<T> l, Operand<T> grad) {
    OperationBuilder opBuilder = scope.env().opBuilder("CholeskyGrad", scope.makeOpName("CholeskyGrad"));
    opBuilder.addInput(l.asOutput());
    opBuilder.addInput(grad.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new CholeskyGrad<T>(opBuilder.build());
  }
  
  /**
   * Symmetrized version of df/dA . Shape is `[..., M, M]`
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private CholeskyGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
