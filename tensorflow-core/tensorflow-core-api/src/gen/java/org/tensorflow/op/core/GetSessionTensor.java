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
 * Get the value of the tensor specified by its handle.
 * 
 * @param <T> data type for {@code value()} output
 */
@Operator
public final class GetSessionTensor<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new GetSessionTensor operation.
   * 
   * @param scope current scope
   * @param handle The handle for a tensor stored in the session state.
   * @param dtype The type of the output value.
   * @return a new instance of GetSessionTensor
   */
  public static <T> GetSessionTensor<T> create(Scope scope, Operand<String> handle, Class<T> dtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("GetSessionTensor", scope.makeOpName("GetSessionTensor"));
    opBuilder.addInput(handle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    return new GetSessionTensor<T>(opBuilder.build());
  }
  
  /**
   * The tensor for the given handle.
   */
  public Output<T> value() {
    return value;
  }
  
  @Override
  public Output<T> asOutput() {
    return value;
  }
  
  private Output<T> value;
  
  private GetSessionTensor(Operation operation) {
    super(operation);
    int outputIdx = 0;
    value = operation.output(outputIdx++);
  }
}
