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

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Output a fact about factorials.
 */
@Operator(group = "math")
public final class Fact extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new Fact operation.
   * 
   * @param scope current scope
   * @return a new instance of Fact
   */
  public static Fact create(Scope scope) {
    OperationBuilder opBuilder = scope.env().opBuilder("Fact", scope.makeOpName("Fact"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Fact(opBuilder.build());
  }
  
  /**
   */
  public Output<String> fact() {
    return fact;
  }
  
  @Override
  public Output<String> asOutput() {
    return fact;
  }
  
  private Output<String> fact;
  
  private Fact(Operation operation) {
    super(operation);
    int outputIdx = 0;
    fact = operation.output(outputIdx++);
  }
}
