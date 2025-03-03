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
 * Creates a dataset that changes the batch size.
 * <p>
 * Creates a dataset that changes the batch size of the dataset to current batch
 * size // num_workers.
 */
public final class RebatchDataset extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.RebatchDataset}
   */
  public static class Options {
    
    /**
     * @param useFallback 
     */
    public Options useFallback(Boolean useFallback) {
      this.useFallback = useFallback;
      return this;
    }
    
    private Boolean useFallback;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new RebatchDataset operation.
   * 
   * @param scope current scope
   * @param inputDataset A variant tensor representing the input dataset.
   * @param numReplicas A scalar representing the number of replicas to distribute this batch across. As
   * a result of this transformation the current batch size would end up being
   * divided  by this parameter.
   * @param outputTypes 
   * @param outputShapes 
   * @param options carries optional attributes values
   * @return a new instance of RebatchDataset
   */
  public static RebatchDataset create(Scope scope, Operand<?> inputDataset, Operand<Long> numReplicas, List<Class<?>> outputTypes, List<Shape> outputShapes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("RebatchDataset", scope.makeOpName("RebatchDataset"));
    opBuilder.addInput(inputDataset.asOutput());
    opBuilder.addInput(numReplicas.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    DataType[] outputTypesArray = new DataType[outputTypes.size()];
    for (int i = 0; i < outputTypesArray.length; ++i) {
      outputTypesArray[i] = DataType.fromClass(outputTypes.get(i));
    }
    opBuilder.setAttr("output_types", outputTypesArray);
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0; i < outputShapesArray.length; ++i) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.useFallback != null) {
          opBuilder.setAttr("use_fallback", opts.useFallback);
        }
      }
    }
    return new RebatchDataset(opBuilder.build());
  }
  
  /**
   * @param useFallback 
   */
  public static Options useFallback(Boolean useFallback) {
    return new Options().useFallback(useFallback);
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) handle;
  }
  
  private Output<?> handle;
  
  private RebatchDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
