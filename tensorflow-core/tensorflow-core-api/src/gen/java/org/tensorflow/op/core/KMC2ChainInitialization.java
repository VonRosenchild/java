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
 * Returns the index of a data point that should be added to the seed set.
 * <p>
 * Entries in distances are assumed to be squared distances of candidate points to
 * the already sampled centers in the seed set. The op constructs one Markov chain
 * of the k-MC^2 algorithm and returns the index of one candidate point to be added
 * as an additional cluster center.
 */
public final class KMC2ChainInitialization extends PrimitiveOp implements Operand<Long> {
  
  /**
   * Factory method to create a class wrapping a new KMC2ChainInitialization operation.
   * 
   * @param scope current scope
   * @param distances Vector with squared distances to the closest previously sampled cluster center
   * for each candidate point.
   * @param seed Scalar. Seed for initializing the random number generator.
   * @return a new instance of KMC2ChainInitialization
   */
  public static KMC2ChainInitialization create(Scope scope, Operand<Float> distances, Operand<Long> seed) {
    OperationBuilder opBuilder = scope.env().opBuilder("KMC2ChainInitialization", scope.makeOpName("KMC2ChainInitialization"));
    opBuilder.addInput(distances.asOutput());
    opBuilder.addInput(seed.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new KMC2ChainInitialization(opBuilder.build());
  }
  
  /**
   * Scalar with the index of the sampled point.
   */
  public Output<Long> index() {
    return index;
  }
  
  @Override
  public Output<Long> asOutput() {
    return index;
  }
  
  private Output<Long> index;
  
  private KMC2ChainInitialization(Operation operation) {
    super(operation);
    int outputIdx = 0;
    index = operation.output(outputIdx++);
  }
}
