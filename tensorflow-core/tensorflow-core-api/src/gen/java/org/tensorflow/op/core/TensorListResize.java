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
 * Resizes the list.
 * <p>
 * 
 * input_handle: the input list
 * size: size of the output list
 * 
 */
@Operator
public final class TensorListResize extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new TensorListResize operation.
   * 
   * @param scope current scope
   * @param inputHandle 
   * @param size 
   * @return a new instance of TensorListResize
   */
  public static TensorListResize create(Scope scope, Operand<?> inputHandle, Operand<Integer> size) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorListResize", scope.makeOpName("TensorListResize"));
    opBuilder.addInput(inputHandle.asOutput());
    opBuilder.addInput(size.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TensorListResize(opBuilder.build());
  }
  
  /**
   */
  public Output<?> outputHandle() {
    return outputHandle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) outputHandle;
  }
  
  private Output<?> outputHandle;
  
  private TensorListResize(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputHandle = operation.output(outputIdx++);
  }
}
