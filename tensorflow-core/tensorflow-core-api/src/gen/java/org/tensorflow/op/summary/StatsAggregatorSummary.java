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
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Produces a summary of any statistics recorded by the given statistics manager.
 */
public final class StatsAggregatorSummary extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new StatsAggregatorSummary operation.
   * 
   * @param scope current scope
   * @param iterator 
   * @return a new instance of StatsAggregatorSummary
   */
  public static StatsAggregatorSummary create(Scope scope, Operand<?> iterator) {
    OperationBuilder opBuilder = scope.env().opBuilder("StatsAggregatorSummary", scope.makeOpName("StatsAggregatorSummary"));
    opBuilder.addInput(iterator.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new StatsAggregatorSummary(opBuilder.build());
  }
  
  /**
   */
  public Output<String> summary() {
    return summary;
  }
  
  @Override
  public Output<String> asOutput() {
    return summary;
  }
  
  private Output<String> summary;
  
  private StatsAggregatorSummary(Operation operation) {
    super(operation);
    int outputIdx = 0;
    summary = operation.output(outputIdx++);
  }
}
