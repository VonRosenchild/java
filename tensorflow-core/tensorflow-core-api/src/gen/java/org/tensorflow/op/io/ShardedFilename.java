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

package org.tensorflow.op.io;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Generate a sharded filename. The filename is printf formatted as
 * <p>
 *    %s-%05d-of-%05d, basename, shard, num_shards.
 */
@Operator(group = "io")
public final class ShardedFilename extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new ShardedFilename operation.
   * 
   * @param scope current scope
   * @param basename 
   * @param shard 
   * @param numShards 
   * @return a new instance of ShardedFilename
   */
  public static ShardedFilename create(Scope scope, Operand<String> basename, Operand<Integer> shard, Operand<Integer> numShards) {
    OperationBuilder opBuilder = scope.env().opBuilder("ShardedFilename", scope.makeOpName("ShardedFilename"));
    opBuilder.addInput(basename.asOutput());
    opBuilder.addInput(shard.asOutput());
    opBuilder.addInput(numShards.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ShardedFilename(opBuilder.build());
  }
  
  /**
   */
  public Output<String> filename() {
    return filename;
  }
  
  @Override
  public Output<String> asOutput() {
    return filename;
  }
  
  private Output<String> filename;
  
  private ShardedFilename(Operation operation) {
    super(operation);
    int outputIdx = 0;
    filename = operation.output(outputIdx++);
  }
}
