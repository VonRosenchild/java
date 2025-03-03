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
import org.tensorflow.op.annotation.Operator;

/**
 */
@Operator
public final class StringLower extends PrimitiveOp implements Operand<String> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.StringLower}
   */
  public static class Options {
    
    /**
     * @param encoding 
     */
    public Options encoding(String encoding) {
      this.encoding = encoding;
      return this;
    }
    
    private String encoding;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new StringLower operation.
   * 
   * @param scope current scope
   * @param input 
   * @param options carries optional attributes values
   * @return a new instance of StringLower
   */
  public static StringLower create(Scope scope, Operand<String> input, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("StringLower", scope.makeOpName("StringLower"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.encoding != null) {
          opBuilder.setAttr("encoding", opts.encoding);
        }
      }
    }
    return new StringLower(opBuilder.build());
  }
  
  /**
   * @param encoding 
   */
  public static Options encoding(String encoding) {
    return new Options().encoding(encoding);
  }
  
  /**
   */
  public Output<String> output() {
    return output;
  }
  
  @Override
  public Output<String> asOutput() {
    return output;
  }
  
  private Output<String> output;
  
  private StringLower(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
