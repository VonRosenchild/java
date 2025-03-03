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

package org.tensorflow.op.quantization;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Quantizes then dequantizes a tensor.
 * <p>
 * This is almost identical to QuantizeAndDequantizeV2, except that num_bits is a
 * tensor, so its value can change during training.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "quantization")
public final class QuantizeAndDequantize<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.quantization.QuantizeAndDequantize}
   */
  public static class Options {
    
    /**
     * @param signedInput 
     */
    public Options signedInput(Boolean signedInput) {
      this.signedInput = signedInput;
      return this;
    }
    
    /**
     * @param rangeGiven 
     */
    public Options rangeGiven(Boolean rangeGiven) {
      this.rangeGiven = rangeGiven;
      return this;
    }
    
    /**
     * @param narrowRange 
     */
    public Options narrowRange(Boolean narrowRange) {
      this.narrowRange = narrowRange;
      return this;
    }
    
    private Boolean signedInput;
    private Boolean rangeGiven;
    private Boolean narrowRange;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new QuantizeAndDequantize operation.
   * 
   * @param scope current scope
   * @param input 
   * @param inputMin 
   * @param inputMax 
   * @param numBits 
   * @param options carries optional attributes values
   * @return a new instance of QuantizeAndDequantize
   */
  public static <T extends Number> QuantizeAndDequantize<T> create(Scope scope, Operand<T> input, Operand<T> inputMin, Operand<T> inputMax, Operand<Integer> numBits, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizeAndDequantizeV3", scope.makeOpName("QuantizeAndDequantize"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(inputMin.asOutput());
    opBuilder.addInput(inputMax.asOutput());
    opBuilder.addInput(numBits.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.signedInput != null) {
          opBuilder.setAttr("signed_input", opts.signedInput);
        }
        if (opts.rangeGiven != null) {
          opBuilder.setAttr("range_given", opts.rangeGiven);
        }
        if (opts.narrowRange != null) {
          opBuilder.setAttr("narrow_range", opts.narrowRange);
        }
      }
    }
    return new QuantizeAndDequantize<T>(opBuilder.build());
  }
  
  /**
   * @param signedInput 
   */
  public static Options signedInput(Boolean signedInput) {
    return new Options().signedInput(signedInput);
  }
  
  /**
   * @param rangeGiven 
   */
  public static Options rangeGiven(Boolean rangeGiven) {
    return new Options().rangeGiven(rangeGiven);
  }
  
  /**
   * @param narrowRange 
   */
  public static Options narrowRange(Boolean narrowRange) {
    return new Options().narrowRange(narrowRange);
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private QuantizeAndDequantize(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
