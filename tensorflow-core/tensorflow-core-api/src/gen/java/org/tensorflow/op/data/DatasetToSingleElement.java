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

import java.util.Arrays;
import java.util.Iterator;
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
 * Outputs the single element from the given dataset.
 */
public final class DatasetToSingleElement extends PrimitiveOp implements Iterable<Operand<Object>> {
  
  /**
   * Factory method to create a class wrapping a new DatasetToSingleElement operation.
   * 
   * @param scope current scope
   * @param dataset A handle to a dataset that contains a single element.
   * @param outputTypes 
   * @param outputShapes 
   * @return a new instance of DatasetToSingleElement
   */
  public static DatasetToSingleElement create(Scope scope, Operand<?> dataset, List<Class<?>> outputTypes, List<Shape> outputShapes) {
    OperationBuilder opBuilder = scope.env().opBuilder("DatasetToSingleElement", scope.makeOpName("DatasetToSingleElement"));
    opBuilder.addInput(dataset.asOutput());
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
    return new DatasetToSingleElement(opBuilder.build());
  }
  
  /**
   * The components of the single element of `input`.
   */
  public List<Output<?>> components() {
    return components;
  }
  
  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<Object>> iterator() {
    return (Iterator) components.iterator();
  }
  
  private List<Output<?>> components;
  
  private DatasetToSingleElement(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int componentsLength = operation.outputListLength("components");
    components = Arrays.asList(operation.outputList(outputIdx, componentsLength));
    outputIdx += componentsLength;
  }
}
