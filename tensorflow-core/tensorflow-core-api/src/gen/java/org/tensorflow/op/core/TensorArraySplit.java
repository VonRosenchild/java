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
 * Split the data from the input value into TensorArray elements.
 * <p>
 * Assuming that `lengths` takes on values
 * <p>
 *   <pre>{@code
 * (n0, n1, ..., n(T-1))}</pre>
 * and that `value` has shape
 * <p>
 *   <pre>{@code
 * (n0 + n1 + ... + n(T-1) x d0 x d1 x ...)}</pre>
 * ,
 * <p>
 * this splits values into a TensorArray with T tensors.
 * <p>
 * TensorArray index t will be the subtensor of values with starting position
 * <p>
 *   <pre>{@code
 * (n0 + n1 + ... + n(t-1), 0, 0, ...)}</pre>
 * and having size
 * <p>
 *   <pre>{@code
 * nt x d0 x d1 x ...}</pre>
 * 
 */
@Operator
public final class TensorArraySplit extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Factory method to create a class wrapping a new TensorArraySplit operation.
   * 
   * @param scope current scope
   * @param handle The handle to a TensorArray.
   * @param value The concatenated tensor to write to the TensorArray.
   * @param lengths The vector of lengths, how to split the rows of value into the
   * TensorArray.
   * @param flowIn A float scalar that enforces proper chaining of operations.
   * @return a new instance of TensorArraySplit
   */
  public static <T> TensorArraySplit create(Scope scope, Operand<?> handle, Operand<T> value, Operand<Long> lengths, Operand<Float> flowIn) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorArraySplitV3", scope.makeOpName("TensorArraySplit"));
    opBuilder.addInput(handle.asOutput());
    opBuilder.addInput(value.asOutput());
    opBuilder.addInput(lengths.asOutput());
    opBuilder.addInput(flowIn.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TensorArraySplit(opBuilder.build());
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
  
  private TensorArraySplit(Operation operation) {
    super(operation);
    int outputIdx = 0;
    flowOut = operation.output(outputIdx++);
  }
}
