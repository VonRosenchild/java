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
 */
public final class ExperimentalMatchingFilesDataset extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new ExperimentalMatchingFilesDataset operation.
   * 
   * @param scope current scope
   * @param patterns 
   * @return a new instance of ExperimentalMatchingFilesDataset
   */
  public static ExperimentalMatchingFilesDataset create(Scope scope, Operand<String> patterns) {
    OperationBuilder opBuilder = scope.env().opBuilder("ExperimentalMatchingFilesDataset", scope.makeOpName("ExperimentalMatchingFilesDataset"));
    opBuilder.addInput(patterns.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ExperimentalMatchingFilesDataset(opBuilder.build());
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
  
  private ExperimentalMatchingFilesDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
