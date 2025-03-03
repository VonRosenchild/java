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
 * Outputs random integers from a uniform distribution.
 * <p>
 * The generated values are uniform integers in the range `[minval, maxval)`.
 * The lower bound `minval` is included in the range, while the upper bound
 * `maxval` is excluded.
 * <p>
 * The random integers are slightly biased unless `maxval - minval` is an exact
 * power of two.  The bias is small for values of `maxval - minval` significantly
 * smaller than the range of the output (either `2^32` or `2^64`).
 * 
 * @param <U> data type for {@code output()} output
 */
public final class StatefulUniformInt<U> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Factory method to create a class wrapping a new StatefulUniformInt operation.
   * 
   * @param scope current scope
   * @param resource The handle of the resource variable that stores the state of the RNG.
   * @param algorithm The RNG algorithm.
   * @param shape The shape of the output tensor.
   * @param minval Minimum value (inclusive, scalar).
   * @param maxval Maximum value (exclusive, scalar).
   * @return a new instance of StatefulUniformInt
   */
  public static <U, T> StatefulUniformInt<U> create(Scope scope, Operand<?> resource, Operand<Long> algorithm, Operand<T> shape, Operand<U> minval, Operand<U> maxval) {
    OperationBuilder opBuilder = scope.env().opBuilder("StatefulUniformInt", scope.makeOpName("StatefulUniformInt"));
    opBuilder.addInput(resource.asOutput());
    opBuilder.addInput(algorithm.asOutput());
    opBuilder.addInput(shape.asOutput());
    opBuilder.addInput(minval.asOutput());
    opBuilder.addInput(maxval.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new StatefulUniformInt<U>(opBuilder.build());
  }
  
  /**
   * Random values with specified shape.
   */
  public Output<U> output() {
    return output;
  }
  
  @Override
  public Output<U> asOutput() {
    return output;
  }
  
  private Output<U> output;
  
  private StatefulUniformInt(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
