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
 * Creates a Tensor by indexing into the TensorList.
 * <p>
 * Each row in the produced Tensor corresponds to the element in the TensorList
 * specified by the given index (see `tf.gather`).  
 * <p>
 * input_handle: The input tensor list.
 * indices: The indices used to index into the list.
 * values: The tensor.
 * 
 * @param <T> data type for {@code values()} output
 */
@Operator
public final class TensorListGather<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new TensorListGather operation.
   * 
   * @param scope current scope
   * @param inputHandle 
   * @param indices 
   * @param elementShape 
   * @param elementDtype 
   * @return a new instance of TensorListGather
   */
  public static <T> TensorListGather<T> create(Scope scope, Operand<?> inputHandle, Operand<Integer> indices, Operand<Integer> elementShape, Class<T> elementDtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorListGather", scope.makeOpName("TensorListGather"));
    opBuilder.addInput(inputHandle.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(elementShape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("element_dtype", DataType.fromClass(elementDtype));
    return new TensorListGather<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> values() {
    return values;
  }
  
  @Override
  public Output<T> asOutput() {
    return values;
  }
  
  private Output<T> values;
  
  private TensorListGather(Operation operation) {
    super(operation);
    int outputIdx = 0;
    values = operation.output(outputIdx++);
  }
}
