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

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Makes its input available to the next iteration.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class NextIteration<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new NextIteration operation.
   * 
   * @param scope current scope
   * @param data The tensor to be made available to the next iteration.
   * @return a new instance of NextIteration
   */
  public static <T> NextIteration<T> create(Scope scope, Operand<T> data) {
    OperationBuilder opBuilder = scope.env().opBuilder("NextIteration", scope.makeOpName("NextIteration"));
    opBuilder.addInput(data.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new NextIteration<T>(opBuilder.build());
  }
  
  /**
   * The same tensor as `data`.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private NextIteration(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
