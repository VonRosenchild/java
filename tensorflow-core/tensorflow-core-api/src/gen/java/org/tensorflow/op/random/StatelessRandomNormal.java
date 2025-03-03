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

package org.tensorflow.op.random;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Outputs deterministic pseudorandom values from a normal distribution.
 * <p>
 * The generated values will have mean 0 and standard deviation 1.
 * <p>
 * The outputs are a deterministic function of `shape` and `seed`.
 * 
 * @param <V> data type for {@code output()} output
 */
@Operator(group = "random")
public final class StatelessRandomNormal<V extends Number> extends PrimitiveOp implements Operand<V> {
  
  /**
   * Factory method to create a class wrapping a new StatelessRandomNormal operation.
   * 
   * @param scope current scope
   * @param shape The shape of the output tensor.
   * @param seed 2 seeds (shape [2]).
   * @param dtype The type of the output.
   * @return a new instance of StatelessRandomNormal
   */
  public static <V extends Number, T extends Number, U extends Number> StatelessRandomNormal<V> create(Scope scope, Operand<T> shape, Operand<U> seed, Class<V> dtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("StatelessRandomNormal", scope.makeOpName("StatelessRandomNormal"));
    opBuilder.addInput(shape.asOutput());
    opBuilder.addInput(seed.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    return new StatelessRandomNormal<V>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new StatelessRandomNormal operation using default output types.
   * 
   * @param scope current scope
   * @param shape The shape of the output tensor.
   * @param seed 2 seeds (shape [2]).
   * @return a new instance of StatelessRandomNormal
   */
  public static <T extends Number, U extends Number> StatelessRandomNormal<Float> create(Scope scope, Operand<T> shape, Operand<U> seed) {
    return create(scope, shape, seed, Float.class);
  }
  
  /**
   * Random values with specified shape.
   */
  public Output<V> output() {
    return output;
  }
  
  @Override
  public Output<V> asOutput() {
    return output;
  }
  
  private Output<V> output;
  
  private StatelessRandomNormal(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
