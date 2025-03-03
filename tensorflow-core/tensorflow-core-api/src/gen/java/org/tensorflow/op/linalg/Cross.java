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
 * Compute the pairwise cross product.
 * <p>
 * `a` and `b` must be the same shape; they can either be simple 3-element vectors,
 * or any shape where the innermost dimension is 3. In the latter case, each pair
 * of corresponding 3-element vectors is cross-multiplied independently.
 * 
 * @param <T> data type for {@code product()} output
 */
@Operator(group = "linalg")
public final class Cross<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Cross operation.
   * 
   * @param scope current scope
   * @param a A tensor containing 3-element vectors.
   * @param b Another tensor, of same type and shape as `a`.
   * @return a new instance of Cross
   */
  public static <T extends Number> Cross<T> create(Scope scope, Operand<T> a, Operand<T> b) {
    OperationBuilder opBuilder = scope.env().opBuilder("Cross", scope.makeOpName("Cross"));
    opBuilder.addInput(a.asOutput());
    opBuilder.addInput(b.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Cross<T>(opBuilder.build());
  }
  
  /**
   * Pairwise cross product of the vectors in `a` and `b`.
   */
  public Output<T> product() {
    return product;
  }
  
  @Override
  public Output<T> asOutput() {
    return product;
  }
  
  private Output<T> product;
  
  private Cross(Operation operation) {
    super(operation);
    int outputIdx = 0;
    product = operation.output(outputIdx++);
  }
}
