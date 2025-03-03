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
 * Forwards the input to the output.
 * <p>
 * This operator represents the loop termination condition used by the
 * "pivot" switches of a loop.
 */
@Operator
public final class LoopCond extends PrimitiveOp implements Operand<Boolean> {
  
  /**
   * Factory method to create a class wrapping a new LoopCond operation.
   * 
   * @param scope current scope
   * @param input A boolean scalar, representing the branch predicate of the Switch op.
   * @return a new instance of LoopCond
   */
  public static LoopCond create(Scope scope, Operand<Boolean> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("LoopCond", scope.makeOpName("LoopCond"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new LoopCond(opBuilder.build());
  }
  
  /**
   * The same tensor as `input`.
   */
  public Output<Boolean> output() {
    return output;
  }
  
  @Override
  public Output<Boolean> asOutput() {
    return output;
  }
  
  private Output<Boolean> output;
  
  private LoopCond(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
