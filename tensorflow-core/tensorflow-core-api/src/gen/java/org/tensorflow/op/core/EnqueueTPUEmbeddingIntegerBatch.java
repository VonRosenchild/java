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
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * An op that enqueues a list of input batch tensors to TPUEmbedding.
 */
public final class EnqueueTPUEmbeddingIntegerBatch extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.EnqueueTPUEmbeddingIntegerBatch}
   */
  public static class Options {
    
    /**
     * @param deviceOrdinal The TPU device to use. Should be >= 0 and less than the number
     * of TPU cores in the task on which the node is placed.
     */
    public Options deviceOrdinal(Long deviceOrdinal) {
      this.deviceOrdinal = deviceOrdinal;
      return this;
    }
    
    private Long deviceOrdinal;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new EnqueueTPUEmbeddingIntegerBatch operation.
   * 
   * @param scope current scope
   * @param batch A list of 1D tensors, one for each embedding table, containing the
   * indices into the tables.
   * @param modeOverride A string input that overrides the mode specified in the
   * TPUEmbeddingConfiguration. Supported values are {'unspecified', 'inference',
   * 'training', 'backward_pass_only'}. When set to 'unspecified', the mode set
   * in TPUEmbeddingConfiguration is used, otherwise mode_override is used.
   * @param options carries optional attributes values
   * @return a new instance of EnqueueTPUEmbeddingIntegerBatch
   */
  public static EnqueueTPUEmbeddingIntegerBatch create(Scope scope, Iterable<Operand<Integer>> batch, Operand<String> modeOverride, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("EnqueueTPUEmbeddingIntegerBatch", scope.makeOpName("EnqueueTPUEmbeddingIntegerBatch"));
    opBuilder.addInputList(Operands.asOutputs(batch));
    opBuilder.addInput(modeOverride.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.deviceOrdinal != null) {
          opBuilder.setAttr("device_ordinal", opts.deviceOrdinal);
        }
      }
    }
    return new EnqueueTPUEmbeddingIntegerBatch(opBuilder.build());
  }
  
  /**
   * @param deviceOrdinal The TPU device to use. Should be >= 0 and less than the number
   * of TPU cores in the task on which the node is placed.
   */
  public static Options deviceOrdinal(Long deviceOrdinal) {
    return new Options().deviceOrdinal(deviceOrdinal);
  }
  
  
  private EnqueueTPUEmbeddingIntegerBatch(Operation operation) {
    super(operation);
  }
}
