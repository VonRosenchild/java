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
import org.tensorflow.types.UInt8;

/**
 * Decode and Crop a JPEG-encoded image to a uint8 tensor.
 * <p>
 * The attr `channels` indicates the desired number of color channels for the
 * decoded image.
 * <p>
 * Accepted values are:
 * <ul>
 * <li>
 * 0: Use the number of channels in the JPEG-encoded image.
 * </li>
 * <li>
 * 1: output a grayscale image.
 * </li>
 * <li>
 * 3: output an RGB image.
 * </li>
 * </ul>
 * If needed, the JPEG-encoded image is transformed to match the requested number
 * of color channels.
 * <p>
 * The attr `ratio` allows downscaling the image by an integer factor during
 * decoding.  Allowed values are: 1, 2, 4, and 8.  This is much faster than
 * downscaling the image later.
 * <p>
 * It is equivalent to a combination of decode and crop, but much faster by only
 * decoding partial jpeg image.
 */
@Operator(group = "image")
public final class DecodeAndCropJpeg extends PrimitiveOp implements Operand<UInt8> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.image.DecodeAndCropJpeg}
   */
  public static class Options {
    
    /**
     * @param channels Number of color channels for the decoded image.
     */
    public Options channels(Long channels) {
      this.channels = channels;
      return this;
    }
    
    /**
     * @param ratio Downscaling ratio.
     */
    public Options ratio(Long ratio) {
      this.ratio = ratio;
      return this;
    }
    
    /**
     * @param fancyUpscaling If true use a slower but nicer upscaling of the
     * chroma planes (yuv420/422 only).
     */
    public Options fancyUpscaling(Boolean fancyUpscaling) {
      this.fancyUpscaling = fancyUpscaling;
      return this;
    }
    
    /**
     * @param tryRecoverTruncated If true try to recover an image from truncated input.
     */
    public Options tryRecoverTruncated(Boolean tryRecoverTruncated) {
      this.tryRecoverTruncated = tryRecoverTruncated;
      return this;
    }
    
    /**
     * @param acceptableFraction The minimum required fraction of lines before a truncated
     * input is accepted.
     */
    public Options acceptableFraction(Float acceptableFraction) {
      this.acceptableFraction = acceptableFraction;
      return this;
    }
    
    /**
     * @param dctMethod string specifying a hint about the algorithm used for
     * decompression.  Defaults to "" which maps to a system-specific
     * default.  Currently valid values are ["INTEGER_FAST",
     * "INTEGER_ACCURATE"].  The hint may be ignored (e.g., the internal
     * jpeg library changes to a version that does not have that specific
     * option.)
     */
    public Options dctMethod(String dctMethod) {
      this.dctMethod = dctMethod;
      return this;
    }
    
    private Long channels;
    private Long ratio;
    private Boolean fancyUpscaling;
    private Boolean tryRecoverTruncated;
    private Float acceptableFraction;
    private String dctMethod;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new DecodeAndCropJpeg operation.
   * 
   * @param scope current scope
   * @param contents 0-D.  The JPEG-encoded image.
   * @param cropWindow 1-D.  The crop window: [crop_y, crop_x, crop_height, crop_width].
   * @param options carries optional attributes values
   * @return a new instance of DecodeAndCropJpeg
   */
  public static DecodeAndCropJpeg create(Scope scope, Operand<String> contents, Operand<Integer> cropWindow, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("DecodeAndCropJpeg", scope.makeOpName("DecodeAndCropJpeg"));
    opBuilder.addInput(contents.asOutput());
    opBuilder.addInput(cropWindow.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.channels != null) {
          opBuilder.setAttr("channels", opts.channels);
        }
        if (opts.ratio != null) {
          opBuilder.setAttr("ratio", opts.ratio);
        }
        if (opts.fancyUpscaling != null) {
          opBuilder.setAttr("fancy_upscaling", opts.fancyUpscaling);
        }
        if (opts.tryRecoverTruncated != null) {
          opBuilder.setAttr("try_recover_truncated", opts.tryRecoverTruncated);
        }
        if (opts.acceptableFraction != null) {
          opBuilder.setAttr("acceptable_fraction", opts.acceptableFraction);
        }
        if (opts.dctMethod != null) {
          opBuilder.setAttr("dct_method", opts.dctMethod);
        }
      }
    }
    return new DecodeAndCropJpeg(opBuilder.build());
  }
  
  /**
   * @param channels Number of color channels for the decoded image.
   */
  public static Options channels(Long channels) {
    return new Options().channels(channels);
  }
  
  /**
   * @param ratio Downscaling ratio.
   */
  public static Options ratio(Long ratio) {
    return new Options().ratio(ratio);
  }
  
  /**
   * @param fancyUpscaling If true use a slower but nicer upscaling of the
   * chroma planes (yuv420/422 only).
   */
  public static Options fancyUpscaling(Boolean fancyUpscaling) {
    return new Options().fancyUpscaling(fancyUpscaling);
  }
  
  /**
   * @param tryRecoverTruncated If true try to recover an image from truncated input.
   */
  public static Options tryRecoverTruncated(Boolean tryRecoverTruncated) {
    return new Options().tryRecoverTruncated(tryRecoverTruncated);
  }
  
  /**
   * @param acceptableFraction The minimum required fraction of lines before a truncated
   * input is accepted.
   */
  public static Options acceptableFraction(Float acceptableFraction) {
    return new Options().acceptableFraction(acceptableFraction);
  }
  
  /**
   * @param dctMethod string specifying a hint about the algorithm used for
   * decompression.  Defaults to "" which maps to a system-specific
   * default.  Currently valid values are ["INTEGER_FAST",
   * "INTEGER_ACCURATE"].  The hint may be ignored (e.g., the internal
   * jpeg library changes to a version that does not have that specific
   * option.)
   */
  public static Options dctMethod(String dctMethod) {
    return new Options().dctMethod(dctMethod);
  }
  
  /**
   * 3-D with shape `[height, width, channels]`..
   */
  public Output<UInt8> image() {
    return image;
  }
  
  @Override
  public Output<UInt8> asOutput() {
    return image;
  }
  
  private Output<UInt8> image;
  
  private DecodeAndCropJpeg(Operation operation) {
    super(operation);
    int outputIdx = 0;
    image = operation.output(outputIdx++);
  }
}
