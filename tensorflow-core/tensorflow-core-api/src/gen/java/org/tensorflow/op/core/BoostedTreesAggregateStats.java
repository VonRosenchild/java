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

/**
 * Aggregates the summary of accumulated stats for the batch.
 * <p>
 * The summary stats contains gradients and hessians accumulated for each node, feature dimension id and bucket.
 */
public final class BoostedTreesAggregateStats extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesAggregateStats operation.
   * 
   * @param scope current scope
   * @param nodeIds int32; Rank 1 Tensor containing node ids for each example, shape [batch_size].
   * @param gradients float32; Rank 2 Tensor (shape=[batch_size, logits_dimension]) with gradients for each example.
   * @param hessians float32; Rank 2 Tensor (shape=[batch_size, hessian_dimension]) with hessians for each example.
   * @param feature int32; Rank 2 feature Tensors (shape=[batch_size, feature_dimension]).
   * @param maxSplits int; the maximum number of splits possible in the whole tree.
   * @param numBuckets int; equals to the maximum possible value of bucketized feature.
   * @return a new instance of BoostedTreesAggregateStats
   */
  public static BoostedTreesAggregateStats create(Scope scope, Operand<Integer> nodeIds, Operand<Float> gradients, Operand<Float> hessians, Operand<Integer> feature, Long maxSplits, Long numBuckets) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesAggregateStats", scope.makeOpName("BoostedTreesAggregateStats"));
    opBuilder.addInput(nodeIds.asOutput());
    opBuilder.addInput(gradients.asOutput());
    opBuilder.addInput(hessians.asOutput());
    opBuilder.addInput(feature.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("max_splits", maxSplits);
    opBuilder.setAttr("num_buckets", numBuckets);
    return new BoostedTreesAggregateStats(opBuilder.build());
  }
  
  /**
   * output Rank 4 Tensor (shape=[splits, feature_dimension, buckets, logits_dimension + hessian_dimension])
   * containing accumulated stats for each node, feature dimension and bucket.
   */
  public Output<Float> statsSummary() {
    return statsSummary;
  }
  
  @Override
  public Output<Float> asOutput() {
    return statsSummary;
  }
  
  private Output<Float> statsSummary;
  
  private BoostedTreesAggregateStats(Operation operation) {
    super(operation);
    int outputIdx = 0;
    statsSummary = operation.output(outputIdx++);
  }
}
