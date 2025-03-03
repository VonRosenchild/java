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

import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Computes quantized depthwise Conv2D with Bias and Relu.
 * 
 * @param <V> data type for {@code output()} output
 */
public final class QuantizedDepthwiseConv2DWithBiasAndRelu<V> extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.QuantizedDepthwiseConv2DWithBiasAndRelu}
   */
  public static class Options {
    
    /**
     * @param dilations List of dilation values.
     */
    public Options dilations(List<Long> dilations) {
      this.dilations = dilations;
      return this;
    }
    
    private List<Long> dilations;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new QuantizedDepthwiseConv2DWithBiasAndRelu operation.
   * 
   * @param scope current scope
   * @param input The original input tensor.
   * @param filter The original filter tensor.
   * @param bias The original bias tensor.
   * @param minInput The float value that the minimum quantized input value represents.
   * @param maxInput The float value that the maximum quantized input value represents.
   * @param minFilter The float value that the minimum quantized filter value represents.
   * @param maxFilter The float value that the maximum quantized filter value represents.
   * @param outType The type of the output.
   * @param strides List of stride values.
   * @param padding 
   * @param options carries optional attributes values
   * @return a new instance of QuantizedDepthwiseConv2DWithBiasAndRelu
   */
  public static <V, T, U> QuantizedDepthwiseConv2DWithBiasAndRelu<V> create(Scope scope, Operand<T> input, Operand<U> filter, Operand<Float> bias, Operand<Float> minInput, Operand<Float> maxInput, Operand<Float> minFilter, Operand<Float> maxFilter, Class<V> outType, List<Long> strides, String padding, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedDepthwiseConv2DWithBiasAndRelu", scope.makeOpName("QuantizedDepthwiseConv2DWithBiasAndRelu"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(filter.asOutput());
    opBuilder.addInput(bias.asOutput());
    opBuilder.addInput(minInput.asOutput());
    opBuilder.addInput(maxInput.asOutput());
    opBuilder.addInput(minFilter.asOutput());
    opBuilder.addInput(maxFilter.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    long[] stridesArray = new long[strides.size()];
    for (int i = 0; i < stridesArray.length; ++i) {
      stridesArray[i] = strides.get(i);
    }
    opBuilder.setAttr("strides", stridesArray);
    opBuilder.setAttr("padding", padding);
    if (options != null) {
      for (Options opts : options) {
        if (opts.dilations != null) {
          long[] dilationsArray = new long[opts.dilations.size()];
          for (int i = 0; i < dilationsArray.length; ++i) {
            dilationsArray[i] = opts.dilations.get(i);
          }
          opBuilder.setAttr("dilations", dilationsArray);
        }
      }
    }
    return new QuantizedDepthwiseConv2DWithBiasAndRelu<V>(opBuilder.build());
  }
  
  /**
   * @param dilations List of dilation values.
   */
  public static Options dilations(List<Long> dilations) {
    return new Options().dilations(dilations);
  }
  
  /**
   * The output tensor.
   */
  public Output<V> output() {
    return output;
  }
  
  /**
   * The float value that the minimum quantized output value represents.
   */
  public Output<Float> minOutput() {
    return minOutput;
  }
  
  /**
   * The float value that the maximum quantized output value represents.
   */
  public Output<Float> maxOutput() {
    return maxOutput;
  }
  
  private Output<V> output;
  private Output<Float> minOutput;
  private Output<Float> maxOutput;
  
  private QuantizedDepthwiseConv2DWithBiasAndRelu(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
    minOutput = operation.output(outputIdx++);
    maxOutput = operation.output(outputIdx++);
  }
}
