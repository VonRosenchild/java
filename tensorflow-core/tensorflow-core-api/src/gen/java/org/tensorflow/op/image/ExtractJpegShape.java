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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Extract the shape information of a JPEG-encoded image.
 * <p>
 * This op only parses the image header, so it is much faster than DecodeJpeg.
 * 
 * @param <T> data type for {@code imageShape()} output
 */
@Operator(group = "image")
public final class ExtractJpegShape<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new ExtractJpegShape operation.
   * 
   * @param scope current scope
   * @param contents 0-D. The JPEG-encoded image.
   * @param outputType (Optional) The output type of the operation (int32 or int64).
   * Defaults to int32.
   * @return a new instance of ExtractJpegShape
   */
  public static <T extends Number> ExtractJpegShape<T> create(Scope scope, Operand<String> contents, Class<T> outputType) {
    OperationBuilder opBuilder = scope.env().opBuilder("ExtractJpegShape", scope.makeOpName("ExtractJpegShape"));
    opBuilder.addInput(contents.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("output_type", DataType.fromClass(outputType));
    return new ExtractJpegShape<T>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new ExtractJpegShape operation using default output types.
   * 
   * @param scope current scope
   * @param contents 0-D. The JPEG-encoded image.
   * @return a new instance of ExtractJpegShape
   */
  public static ExtractJpegShape<Integer> create(Scope scope, Operand<String> contents) {
    return create(scope, contents, Integer.class);
  }
  
  /**
   * 1-D. The image shape with format [height, width, channels].
   */
  public Output<T> imageShape() {
    return imageShape;
  }
  
  @Override
  public Output<T> asOutput() {
    return imageShape;
  }
  
  private Output<T> imageShape;
  
  private ExtractJpegShape(Operation operation) {
    super(operation);
    int outputIdx = 0;
    imageShape = operation.output(outputIdx++);
  }
}
