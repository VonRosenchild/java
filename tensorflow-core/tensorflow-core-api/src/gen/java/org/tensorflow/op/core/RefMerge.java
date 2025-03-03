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
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Forwards the value of an available tensor from `inputs` to `output`.
 * <p>
 * `Merge` waits for at least one of the tensors in `inputs` to become available.
 * It is usually combined with `Switch` to implement branching.
 * <p>
 * `Merge` forwards the first tensor for become available to `output`, and sets
 * `value_index` to its index in `inputs`.
 * 
 * @param <T> data type for {@code output()} output
 */
public final class RefMerge<T> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new RefMerge operation.
   * 
   * @param scope current scope
   * @param inputs The input tensors, exactly one of which will become available.
   * @return a new instance of RefMerge
   */
  public static <T> RefMerge<T> create(Scope scope, Iterable<Operand<T>> inputs) {
    OperationBuilder opBuilder = scope.env().opBuilder("RefMerge", scope.makeOpName("RefMerge"));
    opBuilder.addInputList(Operands.asOutputs(inputs));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RefMerge<T>(opBuilder.build());
  }
  
  /**
   * Will be set to the available input tensor.
   */
  public Output<T> output() {
    return output;
  }
  
  /**
   * The index of the chosen input tensor in `inputs`.
   */
  public Output<Integer> valueIndex() {
    return valueIndex;
  }
  
  private Output<T> output;
  private Output<Integer> valueIndex;
  
  private RefMerge(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
    valueIndex = operation.output(outputIdx++);
  }
}
