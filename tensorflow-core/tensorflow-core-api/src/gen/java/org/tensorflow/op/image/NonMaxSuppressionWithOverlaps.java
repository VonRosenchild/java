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

package org.tensorflow.op.image;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Greedily selects a subset of bounding boxes in descending order of score,
 * <p>
 * pruning away boxes that have high overlaps
 * with previously selected boxes.  Bounding boxes with score less than
 * `score_threshold` are removed. N-by-n overlap values are supplied as square matrix,
 * which allows for defining a custom overlap criterium (eg. intersection over union,
 * intersection over area, etc.).
 * <p>
 * The output of this operation is a set of integers indexing into the input
 * collection of bounding boxes representing the selected boxes.  The bounding
 * box coordinates corresponding to the selected indices can then be obtained
 * using the `tf.gather operation`.  For example:
 * <p>
 *   selected_indices = tf.image.non_max_suppression_with_overlaps(
 *       overlaps, scores, max_output_size, overlap_threshold, score_threshold)
 *   selected_boxes = tf.gather(boxes, selected_indices)
 */
@Operator(group = "image")
public final class NonMaxSuppressionWithOverlaps extends PrimitiveOp implements Operand<Integer> {
  
  /**
   * Factory method to create a class wrapping a new NonMaxSuppressionWithOverlaps operation.
   * 
   * @param scope current scope
   * @param overlaps A 2-D float tensor of shape `[num_boxes, num_boxes]` representing
   * the n-by-n box overlap values.
   * @param scores A 1-D float tensor of shape `[num_boxes]` representing a single
   * score corresponding to each box (each row of boxes).
   * @param maxOutputSize A scalar integer tensor representing the maximum number of
   * boxes to be selected by non max suppression.
   * @param overlapThreshold A 0-D float tensor representing the threshold for deciding whether
   * boxes overlap too.
   * @param scoreThreshold A 0-D float tensor representing the threshold for deciding when to remove
   * boxes based on score.
   * @return a new instance of NonMaxSuppressionWithOverlaps
   */
  public static NonMaxSuppressionWithOverlaps create(Scope scope, Operand<Float> overlaps, Operand<Float> scores, Operand<Integer> maxOutputSize, Operand<Float> overlapThreshold, Operand<Float> scoreThreshold) {
    OperationBuilder opBuilder = scope.env().opBuilder("NonMaxSuppressionWithOverlaps", scope.makeOpName("NonMaxSuppressionWithOverlaps"));
    opBuilder.addInput(overlaps.asOutput());
    opBuilder.addInput(scores.asOutput());
    opBuilder.addInput(maxOutputSize.asOutput());
    opBuilder.addInput(overlapThreshold.asOutput());
    opBuilder.addInput(scoreThreshold.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new NonMaxSuppressionWithOverlaps(opBuilder.build());
  }
  
  /**
   * A 1-D integer tensor of shape `[M]` representing the selected
   * indices from the boxes tensor, where `M <= max_output_size`.
   */
  public Output<Integer> selectedIndices() {
    return selectedIndices;
  }
  
  @Override
  public Output<Integer> asOutput() {
    return selectedIndices;
  }
  
  private Output<Integer> selectedIndices;
  
  private NonMaxSuppressionWithOverlaps(Operation operation) {
    super(operation);
    int outputIdx = 0;
    selectedIndices = operation.output(outputIdx++);
  }
}
