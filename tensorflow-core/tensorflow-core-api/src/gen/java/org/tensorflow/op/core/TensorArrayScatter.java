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
 * Scatter the data from the input value into specific TensorArray elements.
 * <p>
 * `indices` must be a vector, its length must match the first dim of `value`.
 */
@Operator
public final class TensorArrayScatter extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Factory method to create a class wrapping a new TensorArrayScatter operation.
   * 
   * @param scope current scope
   * @param handle The handle to a TensorArray.
   * @param indices The locations at which to write the tensor elements.
   * @param value The concatenated tensor to write to the TensorArray.
   * @param flowIn A float scalar that enforces proper chaining of operations.
   * @return a new instance of TensorArrayScatter
   */
  public static <T> TensorArrayScatter create(Scope scope, Operand<?> handle, Operand<Integer> indices, Operand<T> value, Operand<Float> flowIn) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorArrayScatterV3", scope.makeOpName("TensorArrayScatter"));
    opBuilder.addInput(handle.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(value.asOutput());
    opBuilder.addInput(flowIn.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TensorArrayScatter(opBuilder.build());
  }
  
  /**
   * A float scalar that enforces proper chaining of operations.
   */
  public Output<Float> flowOut() {
    return flowOut;
  }
  
  @Override
  public Output<Float> asOutput() {
    return flowOut;
  }
  
  private Output<Float> flowOut;
  
  private TensorArrayScatter(Operation operation) {
    super(operation);
    int outputIdx = 0;
    flowOut = operation.output(outputIdx++);
  }
}
