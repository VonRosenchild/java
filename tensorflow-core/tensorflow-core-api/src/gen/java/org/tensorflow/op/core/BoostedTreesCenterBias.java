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
 * Calculates the prior from the training data (the bias) and fills in the first node with the logits' prior. Returns a boolean indicating whether to continue centering.
 */
public final class BoostedTreesCenterBias extends PrimitiveOp implements Operand<Boolean> {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesCenterBias operation.
   * 
   * @param scope current scope
   * @param treeEnsembleHandle Handle to the tree ensemble.
   * @param meanGradients A tensor with shape=[logits_dimension] with mean of gradients for a first node.
   * @param meanHessians A tensor with shape=[logits_dimension] mean of hessians for a first node.
   * @param l1 l1 regularization factor on leaf weights, per instance based.
   * @param l2 l2 regularization factor on leaf weights, per instance based.
   * @return a new instance of BoostedTreesCenterBias
   */
  public static BoostedTreesCenterBias create(Scope scope, Operand<?> treeEnsembleHandle, Operand<Float> meanGradients, Operand<Float> meanHessians, Operand<Float> l1, Operand<Float> l2) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesCenterBias", scope.makeOpName("BoostedTreesCenterBias"));
    opBuilder.addInput(treeEnsembleHandle.asOutput());
    opBuilder.addInput(meanGradients.asOutput());
    opBuilder.addInput(meanHessians.asOutput());
    opBuilder.addInput(l1.asOutput());
    opBuilder.addInput(l2.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BoostedTreesCenterBias(opBuilder.build());
  }
  
  /**
   * Bool, whether to continue bias centering.
   */
  public Output<Boolean> continueCentering() {
    return continueCentering;
  }
  
  @Override
  public Output<Boolean> asOutput() {
    return continueCentering;
  }
  
  private Output<Boolean> continueCentering;
  
  private BoostedTreesCenterBias(Operation operation) {
    super(operation);
    int outputIdx = 0;
    continueCentering = operation.output(outputIdx++);
  }
}
