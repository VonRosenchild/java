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
 * Computes the number of incomplete elements in the given barrier.
 */
@Operator
public final class BarrierIncompleteSize extends PrimitiveOp implements Operand<Integer> {
  
  /**
   * Factory method to create a class wrapping a new BarrierIncompleteSize operation.
   * 
   * @param scope current scope
   * @param handle The handle to a barrier.
   * @return a new instance of BarrierIncompleteSize
   */
  public static BarrierIncompleteSize create(Scope scope, Operand<String> handle) {
    OperationBuilder opBuilder = scope.env().opBuilder("BarrierIncompleteSize", scope.makeOpName("BarrierIncompleteSize"));
    opBuilder.addInput(handle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BarrierIncompleteSize(opBuilder.build());
  }
  
  /**
   * The number of incomplete elements (i.e. those with some of their value
   * components not set) in the barrier.
   */
  public Output<Integer> size() {
    return size;
  }
  
  @Override
  public Output<Integer> asOutput() {
    return size;
  }
  
  private Output<Integer> size;
  
  private BarrierIncompleteSize(Operation operation) {
    super(operation);
    int outputIdx = 0;
    size = operation.output(outputIdx++);
  }
}
