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

/**
 * Serializes the tree ensemble to a proto.
 */
public final class BoostedTreesSerializeEnsemble extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesSerializeEnsemble operation.
   * 
   * @param scope current scope
   * @param treeEnsembleHandle Handle to the tree ensemble.
   * @return a new instance of BoostedTreesSerializeEnsemble
   */
  public static BoostedTreesSerializeEnsemble create(Scope scope, Operand<?> treeEnsembleHandle) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesSerializeEnsemble", scope.makeOpName("BoostedTreesSerializeEnsemble"));
    opBuilder.addInput(treeEnsembleHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BoostedTreesSerializeEnsemble(opBuilder.build());
  }
  
  /**
   * Stamp token of the tree ensemble resource.
   */
  public Output<Long> stampToken() {
    return stampToken;
  }
  
  /**
   * Serialized proto of the ensemble.
   */
  public Output<String> treeEnsembleSerialized() {
    return treeEnsembleSerialized;
  }
  
  private Output<Long> stampToken;
  private Output<String> treeEnsembleSerialized;
  
  private BoostedTreesSerializeEnsemble(Operation operation) {
    super(operation);
    int outputIdx = 0;
    stampToken = operation.output(outputIdx++);
    treeEnsembleSerialized = operation.output(outputIdx++);
  }
}
