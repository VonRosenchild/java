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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Flush the quantile summaries from each quantile stream resource.
 * <p>
 * An op that outputs a list of quantile summaries of a quantile stream resource.
 * Each summary Tensor is rank 2, containing summaries (value, weight, min_rank, 
 * max_rank) for a single feature.
 */
public final class BoostedTreesFlushQuantileSummaries extends PrimitiveOp implements Iterable<Operand<Float>> {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesFlushQuantileSummaries operation.
   * 
   * @param scope current scope
   * @param quantileStreamResourceHandle resource handle referring to a QuantileStreamResource.
   * @param numFeatures 
   * @return a new instance of BoostedTreesFlushQuantileSummaries
   */
  public static BoostedTreesFlushQuantileSummaries create(Scope scope, Operand<?> quantileStreamResourceHandle, Long numFeatures) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesFlushQuantileSummaries", scope.makeOpName("BoostedTreesFlushQuantileSummaries"));
    opBuilder.addInput(quantileStreamResourceHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_features", numFeatures);
    return new BoostedTreesFlushQuantileSummaries(opBuilder.build());
  }
  
  /**
   */
  public List<Output<Float>> summaries() {
    return summaries;
  }
  
  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<Float>> iterator() {
    return (Iterator) summaries.iterator();
  }
  
  private List<Output<Float>> summaries;
  
  @SuppressWarnings("unchecked")
  private BoostedTreesFlushQuantileSummaries(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int summariesLength = operation.outputListLength("summaries");
    summaries = Arrays.asList((Output<Float>[])operation.outputList(outputIdx, summariesLength));
    outputIdx += summariesLength;
  }
}
