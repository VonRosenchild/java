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

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Computes gradients for SparseSegmentSqrtN.
 * <p>
 * Returns tensor "output" with same shape as grad, except for dimension 0 whose
 * value is output_dim0.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "sparse")
public final class SparseSegmentSqrtNGrad<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new SparseSegmentSqrtNGrad operation.
   * 
   * @param scope current scope
   * @param grad gradient propagated to the SparseSegmentSqrtN op.
   * @param indices indices passed to the corresponding SparseSegmentSqrtN op.
   * @param segmentIds segment_ids passed to the corresponding SparseSegmentSqrtN op.
   * @param outputDim0 dimension 0 of "data" passed to SparseSegmentSqrtN op.
   * @return a new instance of SparseSegmentSqrtNGrad
   */
  public static <T extends Number, U extends Number> SparseSegmentSqrtNGrad<T> create(Scope scope, Operand<T> grad, Operand<U> indices, Operand<Integer> segmentIds, Operand<Integer> outputDim0) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseSegmentSqrtNGrad", scope.makeOpName("SparseSegmentSqrtNGrad"));
    opBuilder.addInput(grad.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(segmentIds.asOutput());
    opBuilder.addInput(outputDim0.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new SparseSegmentSqrtNGrad<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private SparseSegmentSqrtNGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
