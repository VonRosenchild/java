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

package org.tensorflow.op.strings;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Converts each string in the input Tensor to its hash mod by a number of buckets.
 * <p>
 * The hash function is deterministic on the content of the string within the
 * process.
 * <p>
 * Note that the hash function may change from time to time.
 * This functionality will be deprecated and it's recommended to use
 * `tf.string_to_hash_bucket_fast()` or `tf.string_to_hash_bucket_strong()`.
 */
@Operator(group = "strings")
public final class ToHashBucket extends PrimitiveOp implements Operand<Long> {
  
  /**
   * Factory method to create a class wrapping a new ToHashBucket operation.
   * 
   * @param scope current scope
   * @param stringTensor 
   * @param numBuckets The number of buckets.
   * @return a new instance of ToHashBucket
   */
  public static ToHashBucket create(Scope scope, Operand<String> stringTensor, Long numBuckets) {
    OperationBuilder opBuilder = scope.env().opBuilder("StringToHashBucket", scope.makeOpName("ToHashBucket"));
    opBuilder.addInput(stringTensor.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_buckets", numBuckets);
    return new ToHashBucket(opBuilder.build());
  }
  
  /**
   * A Tensor of the same shape as the input `string_tensor`.
   */
  public Output<Long> output() {
    return output;
  }
  
  @Override
  public Output<Long> asOutput() {
    return output;
  }
  
  private Output<Long> output;
  
  private ToHashBucket(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
