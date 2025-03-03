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
 * Serializes the tree handle to a proto
 */
public final class TensorForestTreeSerialize extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new TensorForestTreeSerialize operation.
   * 
   * @param scope current scope
   * @param treeHandle Handle to the tree resource to be serialized.
   * @return a new instance of TensorForestTreeSerialize
   */
  public static TensorForestTreeSerialize create(Scope scope, Operand<?> treeHandle) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorForestTreeSerialize", scope.makeOpName("TensorForestTreeSerialize"));
    opBuilder.addInput(treeHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TensorForestTreeSerialize(opBuilder.build());
  }
  
  /**
   * Serialied proto string of the tree resource.
   */
  public Output<String> treeConfig() {
    return treeConfig;
  }
  
  @Override
  public Output<String> asOutput() {
    return treeConfig;
  }
  
  private Output<String> treeConfig;
  
  private TensorForestTreeSerialize(Operation operation) {
    super(operation);
    int outputIdx = 0;
    treeConfig = operation.output(outputIdx++);
  }
}
