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
 * Resize `images` to `size` using area interpolation.
 * <p>
 * Input images can be of different types but output images are always float.
 * <p>
 * The range of pixel values for the output image might be slightly different
 * from the range for the input image because of limited numerical precision.
 * To guarantee an output range, for example `[0.0, 1.0]`, apply
 * `tf.clip_by_value` to the output.
 * <p>
 * Each output pixel is computed by first transforming the pixel's footprint into
 * the input tensor and then averaging the pixels that intersect the footprint. An
 * input pixel's contribution to the average is weighted by the fraction of its
 * area that intersects the footprint.  This is the same as OpenCV's INTER_AREA.
 */
@Operator(group = "image")
public final class ResizeArea extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.image.ResizeArea}
   */
  public static class Options {
    
    /**
     * @param alignCorners If true, the centers of the 4 corner pixels of the input and output tensors are
     * aligned, preserving the values at the corner pixels. Defaults to false.
     */
    public Options alignCorners(Boolean alignCorners) {
      this.alignCorners = alignCorners;
      return this;
    }
    
    private Boolean alignCorners;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ResizeArea operation.
   * 
   * @param scope current scope
   * @param images 4-D with shape `[batch, height, width, channels]`.
   * @param size = A 1-D int32 Tensor of 2 elements: `new_height, new_width`.  The
   * new size for the images.
   * @param options carries optional attributes values
   * @return a new instance of ResizeArea
   */
  public static <T extends Number> ResizeArea create(Scope scope, Operand<T> images, Operand<Integer> size, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ResizeArea", scope.makeOpName("ResizeArea"));
    opBuilder.addInput(images.asOutput());
    opBuilder.addInput(size.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.alignCorners != null) {
          opBuilder.setAttr("align_corners", opts.alignCorners);
        }
      }
    }
    return new ResizeArea(opBuilder.build());
  }
  
  /**
   * @param alignCorners If true, the centers of the 4 corner pixels of the input and output tensors are
   * aligned, preserving the values at the corner pixels. Defaults to false.
   */
  public static Options alignCorners(Boolean alignCorners) {
    return new Options().alignCorners(alignCorners);
  }
  
  /**
   * 4-D with shape
   * `[batch, new_height, new_width, channels]`.
   */
  public Output<Float> resizedImages() {
    return resizedImages;
  }
  
  @Override
  public Output<Float> asOutput() {
    return resizedImages;
  }
  
  private Output<Float> resizedImages;
  
  private ResizeArea(Operation operation) {
    super(operation);
    int outputIdx = 0;
    resizedImages = operation.output(outputIdx++);
  }
}
