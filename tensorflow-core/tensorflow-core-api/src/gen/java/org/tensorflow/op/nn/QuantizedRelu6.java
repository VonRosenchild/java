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

package org.tensorflow.op.nn;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Computes Quantized Rectified Linear 6: `min(max(features, 0), 6)`
 * 
 * @param <U> data type for {@code activations()} output
 */
@Operator(group = "nn")
public final class QuantizedRelu6<U> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new QuantizedRelu6 operation.
   * 
   * @param scope current scope
   * @param features 
   * @param minFeatures The float value that the lowest quantized value represents.
   * @param maxFeatures The float value that the highest quantized value represents.
   * @param outType 
   * @return a new instance of QuantizedRelu6
   */
  public static <U, T> QuantizedRelu6<U> create(Scope scope, Operand<T> features, Operand<Float> minFeatures, Operand<Float> maxFeatures, Class<U> outType) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedRelu6", scope.makeOpName("QuantizedRelu6"));
    opBuilder.addInput(features.asOutput());
    opBuilder.addInput(minFeatures.asOutput());
    opBuilder.addInput(maxFeatures.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    return new QuantizedRelu6<U>(opBuilder.build());
  }
  
  /**
   * Has the same output shape as "features".
   */
  public Output<U> activations() {
    return activations;
  }
  
  /**
   * The float value that the lowest quantized value represents.
   */
  public Output<Float> minActivations() {
    return minActivations;
  }
  
  /**
   * The float value that the highest quantized value represents.
   */
  public Output<Float> maxActivations() {
    return maxActivations;
  }
  
  private Output<U> activations;
  private Output<Float> minActivations;
  private Output<Float> maxActivations;
  
  private QuantizedRelu6(Operation operation) {
    super(operation);
    int outputIdx = 0;
    activations = operation.output(outputIdx++);
    minActivations = operation.output(outputIdx++);
    maxActivations = operation.output(outputIdx++);
  }
}
