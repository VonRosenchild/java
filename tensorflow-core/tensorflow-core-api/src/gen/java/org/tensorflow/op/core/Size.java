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
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the size of a tensor.
 * <p>
 * This operation returns an integer representing the number of elements in
 * `input`.
 * <p>
 * For example:
 * <pre>{@code
 * # 't' is [[[1, 1,, 1], [2, 2, 2]], [[3, 3, 3], [4, 4, 4]]]]
 * size(t) ==> 12
 * }</pre>
 * 
 * 
 * @param <U> data type for {@code output()} output
 */
@Operator
public final class Size<U extends Number> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Factory method to create a class wrapping a new Size operation.
   * 
   * @param scope current scope
   * @param input 
   * @param outType 
   * @return a new instance of Size
   */
  public static <U extends Number, T> Size<U> create(Scope scope, Operand<T> input, Class<U> outType) {
    OperationBuilder opBuilder = scope.env().opBuilder("Size", scope.makeOpName("Size"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    return new Size<U>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new Size operation using default output types.
   * 
   * @param scope current scope
   * @param input 
   * @return a new instance of Size
   */
  public static <T> Size<Integer> create(Scope scope, Operand<T> input) {
    return create(scope, input, Integer.class);
  }
  
  /**
   */
  public Output<U> output() {
    return output;
  }
  
  @Override
  public Output<U> asOutput() {
    return output;
  }
  
  private Output<U> output;
  
  private Size(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
