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

package org.tensorflow.op.io;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Writes contents to the file at input filename. Creates file and recursively
 * <p>
 * creates directory if not existing.
 */
@Operator(group = "io")
public final class WriteFile extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new WriteFile operation.
   * 
   * @param scope current scope
   * @param filename scalar. The name of the file to which we write the contents.
   * @param contents scalar. The content to be written to the output file.
   * @return a new instance of WriteFile
   */
  public static WriteFile create(Scope scope, Operand<String> filename, Operand<String> contents) {
    OperationBuilder opBuilder = scope.env().opBuilder("WriteFile", scope.makeOpName("WriteFile"));
    opBuilder.addInput(filename.asOutput());
    opBuilder.addInput(contents.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new WriteFile(opBuilder.build());
  }
  
  
  private WriteFile(Operation operation) {
    super(operation);
  }
}
