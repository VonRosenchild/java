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
 * An op enabling differentiation of TPU Embeddings.
 * <p>
 * This op simply returns its first input, which is assumed to have been sliced
 * from the Tensors returned by TPUEmbeddingDequeueActivations. The presence of
 * this op, and its first argument being a trainable Variable, enables automatic
 * differentiation of graphs containing embeddings via the TPU Embedding Python
 * libraries.
 */
public final class TPUEmbeddingActivations extends PrimitiveOp implements Operand<Float> {
  
  /**
   * Factory method to create a class wrapping a new TPUEmbeddingActivations operation.
   * 
   * @param scope current scope
   * @param embeddingVariable A trainable variable, enabling optimizers to find this op.
   * @param slicedActivations The embedding activations Tensor to return.
   * @param tableId The id of the table in the embedding layer configuration from which
   * these activations were computed.
   * @param lookupId Identifier of the set of embedding indices which produced these
   * activations.
   * @return a new instance of TPUEmbeddingActivations
   */
  public static TPUEmbeddingActivations create(Scope scope, Operand<Float> embeddingVariable, Operand<Float> slicedActivations, Long tableId, Long lookupId) {
    OperationBuilder opBuilder = scope.env().opBuilder("TPUEmbeddingActivations", scope.makeOpName("TPUEmbeddingActivations"));
    opBuilder.addInput(embeddingVariable.asOutput());
    opBuilder.addInput(slicedActivations.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("table_id", tableId);
    opBuilder.setAttr("lookup_id", lookupId);
    return new TPUEmbeddingActivations(opBuilder.build());
  }
  
  /**
   */
  public Output<Float> output() {
    return output;
  }
  
  @Override
  public Output<Float> asOutput() {
    return output;
  }
  
  private Output<Float> output;
  
  private TPUEmbeddingActivations(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
