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

package org.tensorflow.op.math;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the index with the smallest value across dimensions of a tensor.
 * <p>
 * Note that in case of ties the identity of the return value is not guaranteed.
 * <p>
 * Usage:
 *   <pre>{@code
 *   import tensorflow as tf
 *   a = [1, 10, 26.9, 2.8, 166.32, 62.3]
 *   b = tf.math.argmin(input = a)
 *   c = tf.keras.backend.eval(b)
 *   # c = 0
 *   # here a[0] = 1 which is the smallest element of a across axis 0
 *   }</pre>
 * 
 * 
 * @param <V> data type for {@code output()} output
 */
@Operator(group = "math")
public final class ArgMin<V extends Number> extends PrimitiveOp implements Operand<V> {
  
  /**
   * Factory method to create a class wrapping a new ArgMin operation.
   * 
   * @param scope current scope
   * @param input 
   * @param dimension int32 or int64, must be in the range `[-rank(input), rank(input))`.
   * Describes which dimension of the input Tensor to reduce across. For vectors,
   * use dimension = 0.
   * @param outputType 
   * @return a new instance of ArgMin
   */
  public static <V extends Number, T, U extends Number> ArgMin<V> create(Scope scope, Operand<T> input, Operand<U> dimension, Class<V> outputType) {
    OperationBuilder opBuilder = scope.env().opBuilder("ArgMin", scope.makeOpName("ArgMin"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(dimension.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("output_type", DataType.fromClass(outputType));
    return new ArgMin<V>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new ArgMin operation using default output types.
   * 
   * @param scope current scope
   * @param input 
   * @param dimension int32 or int64, must be in the range `[-rank(input), rank(input))`.
   * Describes which dimension of the input Tensor to reduce across. For vectors,
   * use dimension = 0.
   * @return a new instance of ArgMin
   */
  public static <T, U extends Number> ArgMin<Long> create(Scope scope, Operand<T> input, Operand<U> dimension) {
    return create(scope, input, dimension, Long.class);
  }
  
  /**
   */
  public Output<V> output() {
    return output;
  }
  
  @Override
  public Output<V> asOutput() {
    return output;
  }
  
  private Output<V> output;
  
  private ArgMin(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
