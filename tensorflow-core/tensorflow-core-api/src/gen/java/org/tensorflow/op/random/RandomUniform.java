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
 * Outputs random values from a uniform distribution.
 * <p>
 * The generated values follow a uniform distribution in the range `[0, 1)`. The
 * lower bound 0 is included in the range, while the upper bound 1 is excluded.
 * 
 * @param <U> data type for {@code output()} output
 */
@Operator(group = "random")
public final class RandomUniform<U extends Number> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.random.RandomUniform}
   */
  public static class Options {
    
    /**
     * @param seed If either `seed` or `seed2` are set to be non-zero, the random number
     * generator is seeded by the given seed.  Otherwise, it is seeded by a
     * random seed.
     */
    public Options seed(Long seed) {
      this.seed = seed;
      return this;
    }
    
    /**
     * @param seed2 A second seed to avoid seed collision.
     */
    public Options seed2(Long seed2) {
      this.seed2 = seed2;
      return this;
    }
    
    private Long seed;
    private Long seed2;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new RandomUniform operation.
   * 
   * @param scope current scope
   * @param shape The shape of the output tensor.
   * @param dtype The type of the output.
   * @param options carries optional attributes values
   * @return a new instance of RandomUniform
   */
  public static <U extends Number, T extends Number> RandomUniform<U> create(Scope scope, Operand<T> shape, Class<U> dtype, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("RandomUniform", scope.makeOpName("RandomUniform"));
    opBuilder.addInput(shape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    if (options != null) {
      for (Options opts : options) {
        if (opts.seed != null) {
          opBuilder.setAttr("seed", opts.seed);
        }
        if (opts.seed2 != null) {
          opBuilder.setAttr("seed2", opts.seed2);
        }
      }
    }
    return new RandomUniform<U>(opBuilder.build());
  }
  
  /**
   * @param seed If either `seed` or `seed2` are set to be non-zero, the random number
   * generator is seeded by the given seed.  Otherwise, it is seeded by a
   * random seed.
   */
  public static Options seed(Long seed) {
    return new Options().seed(seed);
  }
  
  /**
   * @param seed2 A second seed to avoid seed collision.
   */
  public static Options seed2(Long seed2) {
    return new Options().seed2(seed2);
  }
  
  /**
   * A tensor of the specified shape filled with uniform random values.
   */
  public Output<U> output() {
    return output;
  }
  
  @Override
  public Output<U> asOutput() {
    return output;
  }
  
  private Output<U> output;
  
  private RandomUniform(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
