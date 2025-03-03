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

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Compute the cumulative sum of the tensor `x` along `axis`.
 * <p>
 * By default, this op performs an inclusive cumsum, which means that the first
 * element of the input is identical to the first element of the output:
 * <pre>{@code
 * tf.cumsum([a, b, c])  # => [a, a + b, a + b + c]
 * }</pre>
 * By setting the `exclusive` kwarg to `True`, an exclusive cumsum is
 * performed instead:
 * <pre>{@code
 * tf.cumsum([a, b, c], exclusive=True)  # => [0, a, a + b]
 * }</pre>
 * By setting the `reverse` kwarg to `True`, the cumsum is performed in the
 * opposite direction:
 * <pre>{@code
 * tf.cumsum([a, b, c], reverse=True)  # => [a + b + c, b + c, c]
 * }</pre>
 * This is more efficient than using separate `tf.reverse` ops.
 * <p>
 * The `reverse` and `exclusive` kwargs can also be combined:
 * <pre>{@code
 * tf.cumsum([a, b, c], exclusive=True, reverse=True)  # => [b + c, c, 0]
 * }</pre>
 * 
 * 
 * @param <T> data type for {@code out()} output
 */
@Operator(group = "math")
public final class Cumsum<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.math.Cumsum}
   */
  public static class Options {
    
    /**
     * @param exclusive If `True`, perform exclusive cumsum.
     */
    public Options exclusive(Boolean exclusive) {
      this.exclusive = exclusive;
      return this;
    }
    
    /**
     * @param reverse A `bool` (default: False).
     */
    public Options reverse(Boolean reverse) {
      this.reverse = reverse;
      return this;
    }
    
    private Boolean exclusive;
    private Boolean reverse;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new Cumsum operation.
   * 
   * @param scope current scope
   * @param x A `Tensor`. Must be one of the following types: `float32`, `float64`,
   * `int64`, `int32`, `uint8`, `uint16`, `int16`, `int8`, `complex64`,
   * `complex128`, `qint8`, `quint8`, `qint32`, `half`.
   * @param axis A `Tensor` of type `int32` (default: 0). Must be in the range
   * `[-rank(x), rank(x))`.
   * @param options carries optional attributes values
   * @return a new instance of Cumsum
   */
  public static <T, U extends Number> Cumsum<T> create(Scope scope, Operand<T> x, Operand<U> axis, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("Cumsum", scope.makeOpName("Cumsum"));
    opBuilder.addInput(x.asOutput());
    opBuilder.addInput(axis.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.exclusive != null) {
          opBuilder.setAttr("exclusive", opts.exclusive);
        }
        if (opts.reverse != null) {
          opBuilder.setAttr("reverse", opts.reverse);
        }
      }
    }
    return new Cumsum<T>(opBuilder.build());
  }
  
  /**
   * @param exclusive If `True`, perform exclusive cumsum.
   */
  public static Options exclusive(Boolean exclusive) {
    return new Options().exclusive(exclusive);
  }
  
  /**
   * @param reverse A `bool` (default: False).
   */
  public static Options reverse(Boolean reverse) {
    return new Options().reverse(reverse);
  }
  
  /**
   */
  public Output<T> out() {
    return out;
  }
  
  @Override
  public Output<T> asOutput() {
    return out;
  }
  
  private Output<T> out;
  
  private Cumsum(Operation operation) {
    super(operation);
    int outputIdx = 0;
    out = operation.output(outputIdx++);
  }
}
