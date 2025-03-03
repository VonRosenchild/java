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

/**
 * Returns a `RaggedTensor` containing the specified sequences of numbers.
 * <p>
 * 
 * Returns a `RaggedTensor` `result` composed from `rt_dense_values` and
 * `rt_nested_splits`, such that
 * `result[i] = range(starts[i], limits[i], deltas[i])`.
 * <pre>{@code
 * >>> (rt_nested_splits, rt_dense_values) = gen_ragged_ops.ragged_range(
 * ...     starts=[2, 5, 8], limits=[3, 5, 12], deltas=1)
 * >>> result = ragged.from_nested_row_splits(rt_dense_values, rt_nested_splits)
 * >>> print result.eval().tolist()
 * [[2],               # result[0] = range(2, 3)
 *  [],                # result[1] = range(5, 5)
 *  [8, 9, 10, 11]]    # result[2] = range(8, 12)
 * }</pre>
 * The input tensors `starts`, `limits`, and `deltas` may be scalars or vectors.
 * The vector inputs must all have the same size.  Scalar inputs are broadcast
 * to match the size of the vector inputs.
 * 
 * @param <U> data type for {@code rtNestedSplits()} output
 * @param <T> data type for {@code rtDenseValues()} output
 */
public final class RaggedRange<U extends Number, T extends Number> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new RaggedRange operation.
   * 
   * @param scope current scope
   * @param starts The starts of each range.
   * @param limits The limits of each range.
   * @param deltas The deltas of each range.
   * @param Tsplits 
   * @return a new instance of RaggedRange
   */
  public static <U extends Number, T extends Number> RaggedRange<U, T> create(Scope scope, Operand<T> starts, Operand<T> limits, Operand<T> deltas, Class<U> Tsplits) {
    OperationBuilder opBuilder = scope.env().opBuilder("RaggedRange", scope.makeOpName("RaggedRange"));
    opBuilder.addInput(starts.asOutput());
    opBuilder.addInput(limits.asOutput());
    opBuilder.addInput(deltas.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Tsplits", DataType.fromClass(Tsplits));
    return new RaggedRange<U, T>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new RaggedRange operation using default output types.
   * 
   * @param scope current scope
   * @param starts The starts of each range.
   * @param limits The limits of each range.
   * @param deltas The deltas of each range.
   * @return a new instance of RaggedRange
   */
  public static <T extends Number> RaggedRange<Long, T> create(Scope scope, Operand<T> starts, Operand<T> limits, Operand<T> deltas) {
    return create(scope, starts, limits, deltas, Long.class);
  }
  
  /**
   * The `row_splits` for the returned `RaggedTensor`.
   */
  public Output<U> rtNestedSplits() {
    return rtNestedSplits;
  }
  
  /**
   * The `flat_values` for the returned `RaggedTensor`.
   */
  public Output<T> rtDenseValues() {
    return rtDenseValues;
  }
  
  private Output<U> rtNestedSplits;
  private Output<T> rtDenseValues;
  
  private RaggedRange(Operation operation) {
    super(operation);
    int outputIdx = 0;
    rtNestedSplits = operation.output(outputIdx++);
    rtDenseValues = operation.output(outputIdx++);
  }
}
