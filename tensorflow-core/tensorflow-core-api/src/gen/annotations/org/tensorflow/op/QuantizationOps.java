package org.tensorflow.op;

import org.tensorflow.Operand;
import org.tensorflow.op.quantization.Dequantize;
import org.tensorflow.op.quantization.FakeQuantWithMinMaxArgs;
import org.tensorflow.op.quantization.FakeQuantWithMinMaxArgsGradient;
import org.tensorflow.op.quantization.FakeQuantWithMinMaxVars;
import org.tensorflow.op.quantization.FakeQuantWithMinMaxVarsGradient;
import org.tensorflow.op.quantization.FakeQuantWithMinMaxVarsPerChannel;
import org.tensorflow.op.quantization.FakeQuantWithMinMaxVarsPerChannelGradient;
import org.tensorflow.op.quantization.Quantize;
import org.tensorflow.op.quantization.QuantizeAndDequantize;
import org.tensorflow.op.quantization.QuantizeDownAndShrinkRange;
import org.tensorflow.op.quantization.RequantizationRange;
import org.tensorflow.op.quantization.Requantize;

/**
 * An API for building {@code quantization} operations as {@link Op Op}s
 *
 * @see {@link Ops}
 */
public final class QuantizationOps {
  private final Scope scope;

  QuantizationOps(Scope scope) {
    this.scope = scope;
  }

  /**
   * Builds an {@link Dequantize} operation
   *
   * @param input 
   * @param minRange The minimum scalar value possibly produced for the input.
   * @param maxRange The maximum scalar value possibly produced for the input.
   * @param options carries optional attributes values
   * @return a new instance of Dequantize
   * @see org.tensorflow.op.quantization.Dequantize
   */
  public <T> Dequantize dequantize(Operand<T> input, Operand<Float> minRange,
      Operand<Float> maxRange, Dequantize.Options... options) {
    return Dequantize.create(scope, input, minRange, maxRange, options);
  }

  /**
   * Builds an {@link Quantize} operation
   *
   * @param input 
   * @param minRange The minimum scalar value possibly produced for the input.
   * @param maxRange The maximum scalar value possibly produced for the input.
   * @param T 
   * @param options carries optional attributes values
   * @return a new instance of Quantize
   * @see org.tensorflow.op.quantization.Quantize
   */
  public <T> Quantize<T> quantize(Operand<Float> input, Operand<Float> minRange,
      Operand<Float> maxRange, Class<T> T, Quantize.Options... options) {
    return Quantize.create(scope, input, minRange, maxRange, T, options);
  }

  /**
   * Builds an {@link FakeQuantWithMinMaxVars} operation
   *
   * @param inputs 
   * @param min 
   * @param max 
   * @param options carries optional attributes values
   * @return a new instance of FakeQuantWithMinMaxVars
   * @see org.tensorflow.op.quantization.FakeQuantWithMinMaxVars
   */
  public FakeQuantWithMinMaxVars fakeQuantWithMinMaxVars(Operand<Float> inputs, Operand<Float> min,
      Operand<Float> max, FakeQuantWithMinMaxVars.Options... options) {
    return FakeQuantWithMinMaxVars.create(scope, inputs, min, max, options);
  }

  /**
   * Builds an {@link FakeQuantWithMinMaxVarsPerChannel} operation
   *
   * @param inputs 
   * @param min 
   * @param max 
   * @param options carries optional attributes values
   * @return a new instance of FakeQuantWithMinMaxVarsPerChannel
   * @see org.tensorflow.op.quantization.FakeQuantWithMinMaxVarsPerChannel
   */
  public FakeQuantWithMinMaxVarsPerChannel fakeQuantWithMinMaxVarsPerChannel(Operand<Float> inputs,
      Operand<Float> min, Operand<Float> max,
      FakeQuantWithMinMaxVarsPerChannel.Options... options) {
    return FakeQuantWithMinMaxVarsPerChannel.create(scope, inputs, min, max, options);
  }

  /**
   * Builds an {@link QuantizeAndDequantize} operation
   *
   * @param input 
   * @param inputMin 
   * @param inputMax 
   * @param numBits 
   * @param options carries optional attributes values
   * @return a new instance of QuantizeAndDequantize
   * @see org.tensorflow.op.quantization.QuantizeAndDequantize
   */
  public <T extends Number> QuantizeAndDequantize<T> quantizeAndDequantize(Operand<T> input,
      Operand<T> inputMin, Operand<T> inputMax, Operand<Integer> numBits,
      QuantizeAndDequantize.Options... options) {
    return QuantizeAndDequantize.create(scope, input, inputMin, inputMax, numBits, options);
  }

  /**
   * Builds an {@link FakeQuantWithMinMaxVarsPerChannelGradient} operation
   *
   * @param gradients Backpropagated gradients above the FakeQuantWithMinMaxVars operation,
   * @param inputs Values passed as inputs to the FakeQuantWithMinMaxVars operation, shape
   * @param min 
   * @param max 
   * @param options carries optional attributes values
   * @return a new instance of FakeQuantWithMinMaxVarsPerChannelGradient
   * @see org.tensorflow.op.quantization.FakeQuantWithMinMaxVarsPerChannelGradient
   */
  public FakeQuantWithMinMaxVarsPerChannelGradient fakeQuantWithMinMaxVarsPerChannelGradient(
      Operand<Float> gradients, Operand<Float> inputs, Operand<Float> min, Operand<Float> max,
      FakeQuantWithMinMaxVarsPerChannelGradient.Options... options) {
    return FakeQuantWithMinMaxVarsPerChannelGradient.create(scope, gradients, inputs, min, max, options);
  }

  /**
   * Builds an {@link FakeQuantWithMinMaxArgs} operation
   *
   * @param inputs 
   * @param options carries optional attributes values
   * @return a new instance of FakeQuantWithMinMaxArgs
   * @see org.tensorflow.op.quantization.FakeQuantWithMinMaxArgs
   */
  public FakeQuantWithMinMaxArgs fakeQuantWithMinMaxArgs(Operand<Float> inputs,
      FakeQuantWithMinMaxArgs.Options... options) {
    return FakeQuantWithMinMaxArgs.create(scope, inputs, options);
  }

  /**
   * Builds an {@link Requantize} operation
   *
   * @param input 
   * @param inputMin The float value that the minimum quantized input value represents.
   * @param inputMax The float value that the maximum quantized input value represents.
   * @param requestedOutputMin The float value that the minimum quantized output value represents.
   * @param requestedOutputMax The float value that the maximum quantized output value represents.
   * @param outType The type of the output. Should be a lower bit depth than Tinput.
   * @return a new instance of Requantize
   * @see org.tensorflow.op.quantization.Requantize
   */
  public <U, T> Requantize<U> requantize(Operand<T> input, Operand<Float> inputMin,
      Operand<Float> inputMax, Operand<Float> requestedOutputMin, Operand<Float> requestedOutputMax,
      Class<U> outType) {
    return Requantize.create(scope, input, inputMin, inputMax, requestedOutputMin, requestedOutputMax, outType);
  }

  /**
   * Builds an {@link FakeQuantWithMinMaxArgsGradient} operation
   *
   * @param gradients Backpropagated gradients above the FakeQuantWithMinMaxArgs operation.
   * @param inputs Values passed as inputs to the FakeQuantWithMinMaxArgs operation.
   * @param options carries optional attributes values
   * @return a new instance of FakeQuantWithMinMaxArgsGradient
   * @see org.tensorflow.op.quantization.FakeQuantWithMinMaxArgsGradient
   */
  public FakeQuantWithMinMaxArgsGradient fakeQuantWithMinMaxArgsGradient(Operand<Float> gradients,
      Operand<Float> inputs, FakeQuantWithMinMaxArgsGradient.Options... options) {
    return FakeQuantWithMinMaxArgsGradient.create(scope, gradients, inputs, options);
  }

  /**
   * Builds an {@link FakeQuantWithMinMaxVarsGradient} operation
   *
   * @param gradients Backpropagated gradients above the FakeQuantWithMinMaxVars operation.
   * @param inputs Values passed as inputs to the FakeQuantWithMinMaxVars operation.
   * @param min 
   * @param max 
   * @param options carries optional attributes values
   * @return a new instance of FakeQuantWithMinMaxVarsGradient
   * @see org.tensorflow.op.quantization.FakeQuantWithMinMaxVarsGradient
   */
  public FakeQuantWithMinMaxVarsGradient fakeQuantWithMinMaxVarsGradient(Operand<Float> gradients,
      Operand<Float> inputs, Operand<Float> min, Operand<Float> max,
      FakeQuantWithMinMaxVarsGradient.Options... options) {
    return FakeQuantWithMinMaxVarsGradient.create(scope, gradients, inputs, min, max, options);
  }

  /**
   * Builds an {@link QuantizeDownAndShrinkRange} operation
   *
   * @param input 
   * @param inputMin The float value that the minimum quantized input value represents.
   * @param inputMax The float value that the maximum quantized input value represents.
   * @param outType The type of the output. Should be a lower bit depth than Tinput.
   * @return a new instance of QuantizeDownAndShrinkRange
   * @see org.tensorflow.op.quantization.QuantizeDownAndShrinkRange
   */
  public <U, T> QuantizeDownAndShrinkRange<U> quantizeDownAndShrinkRange(Operand<T> input,
      Operand<Float> inputMin, Operand<Float> inputMax, Class<U> outType) {
    return QuantizeDownAndShrinkRange.create(scope, input, inputMin, inputMax, outType);
  }

  /**
   * Builds an {@link RequantizationRange} operation
   *
   * @param input 
   * @param inputMin The float value that the minimum quantized input value represents.
   * @param inputMax The float value that the maximum quantized input value represents.
   * @return a new instance of RequantizationRange
   * @see org.tensorflow.op.quantization.RequantizationRange
   */
  public <T> RequantizationRange requantizationRange(Operand<T> input, Operand<Float> inputMin,
      Operand<Float> inputMax) {
    return RequantizationRange.create(scope, input, inputMin, inputMax);
  }
}
