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

package org.tensorflow.op.sparse;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Computes the sum along sparse segments of a tensor.
 * <p>
 * Like `SparseSegmentSum`, but allows missing ids in `segment_ids`. If an id is
 * misisng, the `output` tensor at that position will be zeroed.
 * <p>
 * Read
 * [the section on segmentation](https://tensorflow.org/api_docs/python/tf/sparse#Segmentation)
 * for an explanation of segments.
 * <p>
 * For example:
 * <pre>{@code
 * c = tf.constant([[1,2,3,4], [-1,-2,-3,-4], [5,6,7,8]])
 * 
 * tf.sparse_segment_sum_with_num_segments(
 *     c, tf.constant([0, 1]), tf.constant([0, 0]), num_segments=3)
 * # => [[0 0 0 0]
 * #     [0 0 0 0]
 * #     [0 0 0 0]]
 * 
 * tf.sparse_segment_sum_with_num_segments(c,
 *                                         tf.constant([0, 1]),
 *                                         tf.constant([0, 2],
 *                                         num_segments=4))
 * # => [[ 1  2  3  4]
 * #     [ 0  0  0  0]
 * #     [-1 -2 -3 -4]
 * #     [ 0  0  0  0]]
 * }</pre>
 * 
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "sparse")
public final class SparseSegmentSumWithNumSegments<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new SparseSegmentSumWithNumSegments operation.
   * 
   * @param scope current scope
   * @param data 
   * @param indices A 1-D tensor. Has same rank as `segment_ids`.
   * @param segmentIds A 1-D tensor. Values should be sorted and can be repeated.
   * @param numSegments Should equal the number of distinct segment IDs.
   * @return a new instance of SparseSegmentSumWithNumSegments
   */
  public static <T extends Number, U extends Number, V extends Number> SparseSegmentSumWithNumSegments<T> create(Scope scope, Operand<T> data, Operand<U> indices, Operand<Integer> segmentIds, Operand<V> numSegments) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseSegmentSumWithNumSegments", scope.makeOpName("SparseSegmentSumWithNumSegments"));
    opBuilder.addInput(data.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(segmentIds.asOutput());
    opBuilder.addInput(numSegments.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new SparseSegmentSumWithNumSegments<T>(opBuilder.build());
  }
  
  /**
   * Has same shape as data, except for dimension 0 which
   * has size `num_segments`.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private SparseSegmentSumWithNumSegments(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
