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
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Deserialize bucket boundaries and ready flag into current QuantileAccumulator.
 * <p>
 * An op that deserializes bucket boundaries and are boundaries ready flag into current QuantileAccumulator.
 */
public final class BoostedTreesQuantileStreamResourceDeserialize extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesQuantileStreamResourceDeserialize operation.
   * 
   * @param scope current scope
   * @param quantileStreamResourceHandle resource handle referring to a QuantileStreamResource.
   * @param bucketBoundaries float; List of Rank 1 Tensors each containing the bucket boundaries for a feature.
   * @return a new instance of BoostedTreesQuantileStreamResourceDeserialize
   */
  public static BoostedTreesQuantileStreamResourceDeserialize create(Scope scope, Operand<?> quantileStreamResourceHandle, Iterable<Operand<Float>> bucketBoundaries) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesQuantileStreamResourceDeserialize", scope.makeOpName("BoostedTreesQuantileStreamResourceDeserialize"));
    opBuilder.addInput(quantileStreamResourceHandle.asOutput());
    opBuilder.addInputList(Operands.asOutputs(bucketBoundaries));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BoostedTreesQuantileStreamResourceDeserialize(opBuilder.build());
  }
  
  
  private BoostedTreesQuantileStreamResourceDeserialize(Operation operation) {
    super(operation);
  }
}
