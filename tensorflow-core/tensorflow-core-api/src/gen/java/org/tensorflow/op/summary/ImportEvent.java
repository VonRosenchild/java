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

package org.tensorflow.op.summary;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 */
public final class ImportEvent extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new ImportEvent operation.
   * 
   * @param scope current scope
   * @param writer 
   * @param event 
   * @return a new instance of ImportEvent
   */
  public static ImportEvent create(Scope scope, Operand<?> writer, Operand<String> event) {
    OperationBuilder opBuilder = scope.env().opBuilder("ImportEvent", scope.makeOpName("ImportEvent"));
    opBuilder.addInput(writer.asOutput());
    opBuilder.addInput(event.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ImportEvent(opBuilder.build());
  }
  
  
  private ImportEvent(Operation operation) {
    super(operation);
  }
}
