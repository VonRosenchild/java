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
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Flush the summaries for a quantile stream resource.
 * <p>
 * An op that flushes the summaries for a quantile stream resource.
 */
public final class BoostedTreesQuantileStreamResourceFlush extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.BoostedTreesQuantileStreamResourceFlush}
   */
  public static class Options {
    
    /**
     * @param generateQuantiles bool; If True, the output will be the num_quantiles for each stream where the ith
     * entry is the ith quantile of the input with an approximation error of epsilon.
     * Duplicate values may be present.
     * If False, the output will be the points in the histogram that we got which roughly
     * translates to 1/epsilon boundaries and without any duplicates.
     * Default to False.
     */
    public Options generateQuantiles(Boolean generateQuantiles) {
      this.generateQuantiles = generateQuantiles;
      return this;
    }
    
    private Boolean generateQuantiles;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesQuantileStreamResourceFlush operation.
   * 
   * @param scope current scope
   * @param quantileStreamResourceHandle resource handle referring to a QuantileStreamResource.
   * @param numBuckets int; approximate number of buckets unless using generate_quantiles.
   * @param options carries optional attributes values
   * @return a new instance of BoostedTreesQuantileStreamResourceFlush
   */
  public static BoostedTreesQuantileStreamResourceFlush create(Scope scope, Operand<?> quantileStreamResourceHandle, Operand<Long> numBuckets, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesQuantileStreamResourceFlush", scope.makeOpName("BoostedTreesQuantileStreamResourceFlush"));
    opBuilder.addInput(quantileStreamResourceHandle.asOutput());
    opBuilder.addInput(numBuckets.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.generateQuantiles != null) {
          opBuilder.setAttr("generate_quantiles", opts.generateQuantiles);
        }
      }
    }
    return new BoostedTreesQuantileStreamResourceFlush(opBuilder.build());
  }
  
  /**
   * @param generateQuantiles bool; If True, the output will be the num_quantiles for each stream where the ith
   * entry is the ith quantile of the input with an approximation error of epsilon.
   * Duplicate values may be present.
   * If False, the output will be the points in the histogram that we got which roughly
   * translates to 1/epsilon boundaries and without any duplicates.
   * Default to False.
   */
  public static Options generateQuantiles(Boolean generateQuantiles) {
    return new Options().generateQuantiles(generateQuantiles);
  }
  
  
  private BoostedTreesQuantileStreamResourceFlush(Operation operation) {
    super(operation);
  }
}
