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
 */
@Operator
public final class ScaleAndTranslate extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.ScaleAndTranslate}
   */
  public static class Options {
    
    /**
     * @param kernelType 
     */
    public Options kernelType(String kernelType) {
      this.kernelType = kernelType;
      return this;
    }
    
    /**
     * @param antialias 
     */
    public Options antialias(Boolean antialias) {
      this.antialias = antialias;
      return this;
    }
    
    private String kernelType;
    private Boolean antialias;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ScaleAndTranslate operation.
   * 
   * @param scope current scope
   * @param images 
   * @param size 
   * @param scale 
   * @param translation 
   * @param options carries optional attributes values
   * @return a new instance of ScaleAndTranslate
   */
  public static <T extends Number> ScaleAndTranslate create(Scope scope, Operand<T> images, Operand<Integer> size, Operand<Float> scale, Operand<Float> translation, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ScaleAndTranslate", scope.makeOpName("ScaleAndTranslate"));
    opBuilder.addInput(images.asOutput());
    opBuilder.addInput(size.asOutput());
    opBuilder.addInput(scale.asOutput());
    opBuilder.addInput(translation.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.kernelType != null) {
          opBuilder.setAttr("kernel_type", opts.kernelType);
        }
        if (opts.antialias != null) {
          opBuilder.setAttr("antialias", opts.antialias);
        }
      }
    }
    return new ScaleAndTranslate(opBuilder.build());
  }
  
  /**
   * @param kernelType 
   */
  public static Options kernelType(String kernelType) {
    return new Options().kernelType(kernelType);
  }
  
  /**
   * @param antialias 
   */
  public static Options antialias(Boolean antialias) {
    return new Options().antialias(antialias);
  }
  
  /**
   */
  public Output<Float> resizedImages() {
    return resizedImages;
  }
  
  @Override
  public Output<Float> asOutput() {
    return resizedImages;
  }
  
  private Output<Float> resizedImages;
  
  private ScaleAndTranslate(Operation operation) {
    super(operation);
    int outputIdx = 0;
    resizedImages = operation.output(outputIdx++);
  }
}
