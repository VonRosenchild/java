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
 * Decode web-safe base64-encoded strings.
 * <p>
 * Input may or may not have padding at the end. See EncodeBase64 for padding.
 * Web-safe means that input must use - and _ instead of + and /.
 */
@Operator(group = "io")
public final class DecodeBase64 extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new DecodeBase64 operation.
   * 
   * @param scope current scope
   * @param input Base64 strings to decode.
   * @return a new instance of DecodeBase64
   */
  public static DecodeBase64 create(Scope scope, Operand<String> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("DecodeBase64", scope.makeOpName("DecodeBase64"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new DecodeBase64(opBuilder.build());
  }
  
  /**
   * Decoded strings.
   */
  public Output<String> output() {
    return output;
  }
  
  @Override
  public Output<String> asOutput() {
    return output;
  }
  
  private Output<String> output;
  
  private DecodeBase64(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
