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

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns which elements of x are NaN.
 * <p>
 * @compatibility(numpy)
 * Equivalent to np.isnan
 * @end_compatibility
 */
@Operator(group = "math")
public final class IsNan extends PrimitiveOp implements Operand<Boolean> {
  
  /**
   * Factory method to create a class wrapping a new IsNan operation.
   * 
   * @param scope current scope
   * @param x 
   * @return a new instance of IsNan
   */
  public static <T extends Number> IsNan create(Scope scope, Operand<T> x) {
    OperationBuilder opBuilder = scope.env().opBuilder("IsNan", scope.makeOpName("IsNan"));
    opBuilder.addInput(x.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new IsNan(opBuilder.build());
  }
  
  /**
   */
  public Output<Boolean> y() {
    return y;
  }
  
  @Override
  public Output<Boolean> asOutput() {
    return y;
  }
  
  private Output<Boolean> y;
  
  private IsNan(Operation operation) {
    super(operation);
    int outputIdx = 0;
    y = operation.output(outputIdx++);
  }
}
