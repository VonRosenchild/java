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
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Makes the summary of accumulated stats for the batch.
 * <p>
 * The summary stats contains gradients and hessians accumulated into the corresponding node and bucket for each example.
 */
public final class BoostedTreesMakeStatsSummary extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesMakeStatsSummary operation.
   * 
   * @param scope current scope
   * @param nodeIds int32 Rank 1 Tensor containing node ids, which each example falls into for the requested layer.
   * @param gradients float32; Rank 2 Tensor (shape=[#examples, 1]) for gradients.
   * @param hessians float32; Rank 2 Tensor (shape=[#examples, 1]) for hessians.
   * @param bucketizedFeaturesList int32 list of Rank 1 Tensors, each containing the bucketized feature (for each feature column).
   * @param maxSplits int; the maximum number of splits possible in the whole tree.
   * @param numBuckets int; equals to the maximum possible value of bucketized feature.
   * @return a new instance of BoostedTreesMakeStatsSummary
   */
  public static BoostedTreesMakeStatsSummary create(Scope scope, Operand<Integer> nodeIds, Operand<Float> gradients, Operand<Float> hessians, Iterable<Operand<Integer>> bucketizedFeaturesList, Long maxSplits, Long numBuckets) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesMakeStatsSummary", scope.makeOpName("BoostedTreesMakeStatsSummary"));
    opBuilder.addInput(nodeIds.asOutput());
    opBuilder.addInput(gradients.asOutput());
    opBuilder.addInput(hessians.asOutput());
    opBuilder.addInputList(Operands.asOutputs(bucketizedFeaturesList));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("max_splits", maxSplits);
    opBuilder.setAttr("num_buckets", numBuckets);
    return new BoostedTreesMakeStatsSummary(opBuilder.build());
  }
  
  /**
   * output Rank 4 Tensor (shape=[#features, #splits, #buckets, 2]) containing accumulated stats put into the corresponding node and bucket. The first index of 4th dimension refers to gradients, and the second to hessians.
   */
  public Output<Float> statsSummary() {
    return statsSummary;
  }
  
  @Override
  public Output<Float> asOutput() {
    return statsSummary;
  }
  
  private Output<Float> statsSummary;
  
  private BoostedTreesMakeStatsSummary(Operation operation) {
    super(operation);
    int outputIdx = 0;
    statsSummary = operation.output(outputIdx++);
  }
}
