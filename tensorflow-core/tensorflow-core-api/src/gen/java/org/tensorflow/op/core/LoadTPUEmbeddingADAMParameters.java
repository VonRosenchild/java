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
 * Load ADAM embedding parameters.
 * <p>
 * An op that loads optimization parameters into HBM for embedding. Must be
 * preceded by a ConfigureTPUEmbeddingHost op that sets up the correct
 * embedding table configuration. For example, this op is used to install
 * parameters that are loaded from a checkpoint before a training loop is
 * executed.
 */
public final class LoadTPUEmbeddingADAMParameters extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.LoadTPUEmbeddingADAMParameters}
   */
  public static class Options {
    
    /**
     * @param tableId 
     */
    public Options tableId(Long tableId) {
      this.tableId = tableId;
      return this;
    }
    
    /**
     * @param tableName 
     */
    public Options tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }
    
    private Long tableId;
    private String tableName;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new LoadTPUEmbeddingADAMParameters operation.
   * 
   * @param scope current scope
   * @param parameters Value of parameters used in the ADAM optimization algorithm.
   * @param momenta Value of momenta used in the ADAM optimization algorithm.
   * @param velocities Value of velocities used in the ADAM optimization algorithm.
   * @param numShards 
   * @param shardId 
   * @param options carries optional attributes values
   * @return a new instance of LoadTPUEmbeddingADAMParameters
   */
  public static LoadTPUEmbeddingADAMParameters create(Scope scope, Operand<Float> parameters, Operand<Float> momenta, Operand<Float> velocities, Long numShards, Long shardId, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("LoadTPUEmbeddingADAMParameters", scope.makeOpName("LoadTPUEmbeddingADAMParameters"));
    opBuilder.addInput(parameters.asOutput());
    opBuilder.addInput(momenta.asOutput());
    opBuilder.addInput(velocities.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_shards", numShards);
    opBuilder.setAttr("shard_id", shardId);
    if (options != null) {
      for (Options opts : options) {
        if (opts.tableId != null) {
          opBuilder.setAttr("table_id", opts.tableId);
        }
        if (opts.tableName != null) {
          opBuilder.setAttr("table_name", opts.tableName);
        }
      }
    }
    return new LoadTPUEmbeddingADAMParameters(opBuilder.build());
  }
  
  /**
   * @param tableId 
   */
  public static Options tableId(Long tableId) {
    return new Options().tableId(tableId);
  }
  
  /**
   * @param tableName 
   */
  public static Options tableName(String tableName) {
    return new Options().tableName(tableName);
  }
  
  
  private LoadTPUEmbeddingADAMParameters(Operation operation) {
    super(operation);
  }
}
