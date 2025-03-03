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
 * Greedily selects a subset of bounding boxes in descending order of score,
 * <p>
 * This operation performs non_max_suppression on the inputs per batch, across
 * all classes.
 * Prunes away boxes that have high intersection-over-union (IOU) overlap
 * with previously selected boxes.  Bounding boxes are supplied as
 * [y1, x1, y2, x2], where (y1, x1) and (y2, x2) are the coordinates of any
 * diagonal pair of box corners and the coordinates can be provided as normalized
 * (i.e., lying in the interval [0, 1]) or absolute.  Note that this algorithm
 * is agnostic to where the origin is in the coordinate system. Also note that
 * this algorithm is invariant to orthogonal transformations and translations
 * of the coordinate system; thus translating or reflections of the coordinate
 * system result in the same boxes being selected by the algorithm.
 * The output of this operation is the final boxes, scores and classes tensor
 * returned after performing non_max_suppression.
 */
@Operator
public final class CombinedNonMaxSuppression extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.CombinedNonMaxSuppression}
   */
  public static class Options {
    
    /**
     * @param padPerClass If false, the output nmsed boxes, scores and classes
     * are padded/clipped to `max_total_size`. If true, the
     * output nmsed boxes, scores and classes are padded to be of length
     * `max_size_per_class`*`num_classes`, unless it exceeds `max_total_size` in
     * which case it is clipped to `max_total_size`. Defaults to false.
     */
    public Options padPerClass(Boolean padPerClass) {
      this.padPerClass = padPerClass;
      return this;
    }
    
    /**
     * @param clipBoxes If true, assume the box coordinates are between [0, 1] and clip the output boxes
     * if they fall beyond [0, 1]. If false, do not do clipping and output the box
     * coordinates as it is.
     */
    public Options clipBoxes(Boolean clipBoxes) {
      this.clipBoxes = clipBoxes;
      return this;
    }
    
    private Boolean padPerClass;
    private Boolean clipBoxes;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new CombinedNonMaxSuppression operation.
   * 
   * @param scope current scope
   * @param boxes A 4-D float tensor of shape `[batch_size, num_boxes, q, 4]`. If `q` is 1 then 
   * same boxes are used for all classes otherwise, if `q` is equal to number of 
   * classes, class-specific boxes are used.
   * @param scores A 3-D float tensor of shape `[batch_size, num_boxes, num_classes]`
   * representing a single score corresponding to each box (each row of boxes).
   * @param maxOutputSizePerClass A scalar integer tensor representing the maximum number of 
   * boxes to be selected by non max suppression per class
   * @param maxTotalSize A scalar representing maximum number of boxes retained over all classes.
   * @param iouThreshold A 0-D float tensor representing the threshold for deciding whether
   * boxes overlap too much with respect to IOU.
   * @param scoreThreshold A 0-D float tensor representing the threshold for deciding when to remove
   * boxes based on score.
   * @param options carries optional attributes values
   * @return a new instance of CombinedNonMaxSuppression
   */
  public static CombinedNonMaxSuppression create(Scope scope, Operand<Float> boxes, Operand<Float> scores, Operand<Integer> maxOutputSizePerClass, Operand<Integer> maxTotalSize, Operand<Float> iouThreshold, Operand<Float> scoreThreshold, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("CombinedNonMaxSuppression", scope.makeOpName("CombinedNonMaxSuppression"));
    opBuilder.addInput(boxes.asOutput());
    opBuilder.addInput(scores.asOutput());
    opBuilder.addInput(maxOutputSizePerClass.asOutput());
    opBuilder.addInput(maxTotalSize.asOutput());
    opBuilder.addInput(iouThreshold.asOutput());
    opBuilder.addInput(scoreThreshold.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.padPerClass != null) {
          opBuilder.setAttr("pad_per_class", opts.padPerClass);
        }
        if (opts.clipBoxes != null) {
          opBuilder.setAttr("clip_boxes", opts.clipBoxes);
        }
      }
    }
    return new CombinedNonMaxSuppression(opBuilder.build());
  }
  
  /**
   * @param padPerClass If false, the output nmsed boxes, scores and classes
   * are padded/clipped to `max_total_size`. If true, the
   * output nmsed boxes, scores and classes are padded to be of length
   * `max_size_per_class`*`num_classes`, unless it exceeds `max_total_size` in
   * which case it is clipped to `max_total_size`. Defaults to false.
   */
  public static Options padPerClass(Boolean padPerClass) {
    return new Options().padPerClass(padPerClass);
  }
  
  /**
   * @param clipBoxes If true, assume the box coordinates are between [0, 1] and clip the output boxes
   * if they fall beyond [0, 1]. If false, do not do clipping and output the box
   * coordinates as it is.
   */
  public static Options clipBoxes(Boolean clipBoxes) {
    return new Options().clipBoxes(clipBoxes);
  }
  
  /**
   * A [batch_size, max_detections, 4] float32 tensor 
   * containing the non-max suppressed boxes.
   */
  public Output<Float> nmsedBoxes() {
    return nmsedBoxes;
  }
  
  /**
   * A [batch_size, max_detections] float32 tensor 
   * containing the scores for the boxes.
   */
  public Output<Float> nmsedScores() {
    return nmsedScores;
  }
  
  /**
   * A [batch_size, max_detections] float32 tensor 
   * containing the classes for the boxes.
   */
  public Output<Float> nmsedClasses() {
    return nmsedClasses;
  }
  
  /**
   * A [batch_size] int32 tensor indicating the number of
   * valid detections per batch item. Only the top num_detections[i] entries in
   * nms_boxes[i], nms_scores[i] and nms_class[i] are valid. The rest of the
   * entries are zero paddings.
   */
  public Output<Integer> validDetections() {
    return validDetections;
  }
  
  private Output<Float> nmsedBoxes;
  private Output<Float> nmsedScores;
  private Output<Float> nmsedClasses;
  private Output<Integer> validDetections;
  
  private CombinedNonMaxSuppression(Operation operation) {
    super(operation);
    int outputIdx = 0;
    nmsedBoxes = operation.output(outputIdx++);
    nmsedScores = operation.output(outputIdx++);
    nmsedClasses = operation.output(outputIdx++);
    validDetections = operation.output(outputIdx++);
  }
}
