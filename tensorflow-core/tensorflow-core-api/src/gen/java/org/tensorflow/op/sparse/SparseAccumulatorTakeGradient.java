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

package org.tensorflow.op.sparse;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Extracts the average sparse gradient in a SparseConditionalAccumulator.
 * <p>
 * The op will blocks until sufficient (i.e., more than num_required)
 * gradients have been accumulated. If the accumulator has already
 * aggregated more than num_required gradients, it will return its
 * average of the accumulated gradients.  Also automatically increments
 * the recorded global_step in the accumulator by 1, and resets the
 * aggregate to 0.
 * 
 * @param <T> data type for {@code values()} output
 */
@Operator(group = "sparse")
public final class SparseAccumulatorTakeGradient<T> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new SparseAccumulatorTakeGradient operation.
   * 
   * @param scope current scope
   * @param handle The handle to a SparseConditionalAccumulator.
   * @param numRequired Number of gradients required before we return an aggregate.
   * @param dtype The data type of accumulated gradients. Needs to correspond to the type
   * of the accumulator.
   * @return a new instance of SparseAccumulatorTakeGradient
   */
  public static <T> SparseAccumulatorTakeGradient<T> create(Scope scope, Operand<String> handle, Operand<Integer> numRequired, Class<T> dtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseAccumulatorTakeGradient", scope.makeOpName("SparseAccumulatorTakeGradient"));
    opBuilder.addInput(handle.asOutput());
    opBuilder.addInput(numRequired.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    return new SparseAccumulatorTakeGradient<T>(opBuilder.build());
  }
  
  /**
   * Indices of the average of the accumulated sparse gradients.
   */
  public Output<Long> indices() {
    return indices;
  }
  
  /**
   * Values of the average of the accumulated sparse gradients.
   */
  public Output<T> values() {
    return values;
  }
  
  /**
   * Shape of the average of the accumulated sparse gradients.
   */
  public Output<Long> shape() {
    return shape;
  }
  
  private Output<Long> indices;
  private Output<T> values;
  private Output<Long> shape;
  
  private SparseAccumulatorTakeGradient(Operation operation) {
    super(operation);
    int outputIdx = 0;
    indices = operation.output(outputIdx++);
    values = operation.output(outputIdx++);
    shape = operation.output(outputIdx++);
  }
}
