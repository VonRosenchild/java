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
import org.tensorflow.op.annotation.Operator;

/**
 * Outputs a `Summary` protocol buffer with scalar values.
 * <p>
 * The input `tags` and `values` must have the same shape.  The generated summary
 * has a summary value for each tag-value pair in `tags` and `values`.
 */
@Operator(group = "summary")
public final class ScalarSummary extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new ScalarSummary operation.
   * 
   * @param scope current scope
   * @param tags Tags for the summary.
   * @param values Same shape as `tags.  Values for the summary.
   * @return a new instance of ScalarSummary
   */
  public static <T extends Number> ScalarSummary create(Scope scope, Operand<String> tags, Operand<T> values) {
    OperationBuilder opBuilder = scope.env().opBuilder("ScalarSummary", scope.makeOpName("ScalarSummary"));
    opBuilder.addInput(tags.asOutput());
    opBuilder.addInput(values.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ScalarSummary(opBuilder.build());
  }
  
  /**
   * Scalar.  Serialized `Summary` protocol buffer.
   */
  public Output<String> summary() {
    return summary;
  }
  
  @Override
  public Output<String> asOutput() {
    return summary;
  }
  
  private Output<String> summary;
  
  private ScalarSummary(Operation operation) {
    super(operation);
    int outputIdx = 0;
    summary = operation.output(outputIdx++);
  }
}
