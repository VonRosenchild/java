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

package org.tensorflow.op.data;

import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.Shape;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 */
public final class IteratorFromStringHandle extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.data.IteratorFromStringHandle}
   */
  public static class Options {
    
    /**
     * @param outputShapes 
     */
    public Options outputShapes(List<Shape> outputShapes) {
      this.outputShapes = outputShapes;
      return this;
    }
    
    private List<Shape> outputShapes;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new IteratorFromStringHandle operation.
   * 
   * @param scope current scope
   * @param stringHandle 
   * @param outputTypes 
   * @param options carries optional attributes values
   * @return a new instance of IteratorFromStringHandle
   */
  public static IteratorFromStringHandle create(Scope scope, Operand<String> stringHandle, List<Class<?>> outputTypes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("IteratorFromStringHandleV2", scope.makeOpName("IteratorFromStringHandle"));
    opBuilder.addInput(stringHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    DataType[] outputTypesArray = new DataType[outputTypes.size()];
    for (int i = 0; i < outputTypesArray.length; ++i) {
      outputTypesArray[i] = DataType.fromClass(outputTypes.get(i));
    }
    opBuilder.setAttr("output_types", outputTypesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.outputShapes != null) {
          Shape[] outputShapesArray = new Shape[opts.outputShapes.size()];
          for (int i = 0; i < outputShapesArray.length; ++i) {
            outputShapesArray[i] = opts.outputShapes.get(i);
          }
          opBuilder.setAttr("output_shapes", outputShapesArray);
        }
      }
    }
    return new IteratorFromStringHandle(opBuilder.build());
  }
  
  /**
   * @param outputShapes 
   */
  public static Options outputShapes(List<Shape> outputShapes) {
    return new Options().outputShapes(outputShapes);
  }
  
  /**
   */
  public Output<?> resourceHandle() {
    return resourceHandle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) resourceHandle;
  }
  
  private Output<?> resourceHandle;
  
  private IteratorFromStringHandle(Operation operation) {
    super(operation);
    int outputIdx = 0;
    resourceHandle = operation.output(outputIdx++);
  }
}
