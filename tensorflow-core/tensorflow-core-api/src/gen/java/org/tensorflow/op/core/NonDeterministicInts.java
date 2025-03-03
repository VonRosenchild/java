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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Non-deterministically generates some integers.
 * <p>
 * This op may use some OS-provided source of non-determinism (e.g. an RNG), so each execution will give different results.
 * 
 * @param <U> data type for {@code output()} output
 */
public final class NonDeterministicInts<U> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Factory method to create a class wrapping a new NonDeterministicInts operation.
   * 
   * @param scope current scope
   * @param shape The shape of the output tensor.
   * @param dtype The type of the output.
   * @return a new instance of NonDeterministicInts
   */
  public static <U, T> NonDeterministicInts<U> create(Scope scope, Operand<T> shape, Class<U> dtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("NonDeterministicInts", scope.makeOpName("NonDeterministicInts"));
    opBuilder.addInput(shape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    return new NonDeterministicInts<U>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new NonDeterministicInts operation using default output types.
   * 
   * @param scope current scope
   * @param shape The shape of the output tensor.
   * @return a new instance of NonDeterministicInts
   */
  public static <T> NonDeterministicInts<Long> create(Scope scope, Operand<T> shape) {
    return create(scope, shape, Long.class);
  }
  
  /**
   * Non-deterministic integer values with specified shape.
   */
  public Output<U> output() {
    return output;
  }
  
  @Override
  public Output<U> asOutput() {
    return output;
  }
  
  private Output<U> output;
  
  private NonDeterministicInts(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
