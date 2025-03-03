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
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Convert JSON-encoded Example records to binary protocol buffer strings.
 * <p>
 * This op translates a tensor containing Example records, encoded using
 * the [standard JSON
 * mapping](https://developers.google.com/protocol-buffers/docs/proto3#json),
 * into a tensor containing the same records encoded as binary protocol
 * buffers. The resulting tensor can then be fed to any of the other
 * Example-parsing ops.
 */
@Operator(group = "io")
public final class DecodeJsonExample extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new DecodeJsonExample operation.
   * 
   * @param scope current scope
   * @param jsonExamples Each string is a JSON object serialized according to the JSON
   * mapping of the Example proto.
   * @return a new instance of DecodeJsonExample
   */
  public static DecodeJsonExample create(Scope scope, Operand<String> jsonExamples) {
    OperationBuilder opBuilder = scope.env().opBuilder("DecodeJSONExample", scope.makeOpName("DecodeJsonExample"));
    opBuilder.addInput(jsonExamples.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new DecodeJsonExample(opBuilder.build());
  }
  
  /**
   * Each string is a binary Example protocol buffer corresponding
   * to the respective element of `json_examples`.
   */
  public Output<String> binaryExamples() {
    return binaryExamples;
  }
  
  @Override
  public Output<String> asOutput() {
    return binaryExamples;
  }
  
  private Output<String> binaryExamples;
  
  private DecodeJsonExample(Operation operation) {
    super(operation);
    int outputIdx = 0;
    binaryExamples = operation.output(outputIdx++);
  }
}
