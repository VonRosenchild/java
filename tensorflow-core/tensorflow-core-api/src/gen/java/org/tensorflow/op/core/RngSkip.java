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
 * Advance the counter of a counter-based RNG.
 * <p>
 * The state of the RNG after
 * `rng_skip(n)` will be the same as that after `stateful_uniform([n])`
 * (or any other distribution). The actual increment added to the
 * counter is an unspecified implementation detail.  
 */
public final class RngSkip extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new RngSkip operation.
   * 
   * @param scope current scope
   * @param resource The handle of the resource variable that stores the state of the RNG.
   * @param algorithm The RNG algorithm.
   * @param delta The amount of advancement.
   * @return a new instance of RngSkip
   */
  public static RngSkip create(Scope scope, Operand<?> resource, Operand<Long> algorithm, Operand<Long> delta) {
    OperationBuilder opBuilder = scope.env().opBuilder("RngSkip", scope.makeOpName("RngSkip"));
    opBuilder.addInput(resource.asOutput());
    opBuilder.addInput(algorithm.asOutput());
    opBuilder.addInput(delta.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RngSkip(opBuilder.build());
  }
  
  
  private RngSkip(Operation operation) {
    super(operation);
  }
}
