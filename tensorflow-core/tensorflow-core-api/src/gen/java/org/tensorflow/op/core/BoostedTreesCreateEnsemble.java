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
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Creates a tree ensemble model and returns a handle to it.
 */
public final class BoostedTreesCreateEnsemble extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesCreateEnsemble operation.
   * 
   * @param scope current scope
   * @param treeEnsembleHandle Handle to the tree ensemble resource to be created.
   * @param stampToken Token to use as the initial value of the resource stamp.
   * @param treeEnsembleSerialized Serialized proto of the tree ensemble.
   * @return a new instance of BoostedTreesCreateEnsemble
   */
  public static BoostedTreesCreateEnsemble create(Scope scope, Operand<?> treeEnsembleHandle, Operand<Long> stampToken, Operand<String> treeEnsembleSerialized) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesCreateEnsemble", scope.makeOpName("BoostedTreesCreateEnsemble"));
    opBuilder.addInput(treeEnsembleHandle.asOutput());
    opBuilder.addInput(stampToken.asOutput());
    opBuilder.addInput(treeEnsembleSerialized.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BoostedTreesCreateEnsemble(opBuilder.build());
  }
  
  
  private BoostedTreesCreateEnsemble(Operation operation) {
    super(operation);
  }
}
