package org.tensorflow.op;

import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Shape;
import org.tensorflow.op.train.AccumulatorApplyGradient;
import org.tensorflow.op.train.AccumulatorNumAccumulated;
import org.tensorflow.op.train.AccumulatorSetGlobalStep;
import org.tensorflow.op.train.AccumulatorTakeGradient;
import org.tensorflow.op.train.ApplyAdadelta;
import org.tensorflow.op.train.ApplyAdagrad;
import org.tensorflow.op.train.ApplyAdagradDa;
import org.tensorflow.op.train.ApplyAdam;
import org.tensorflow.op.train.ApplyAddSign;
import org.tensorflow.op.train.ApplyCenteredRmsProp;
import org.tensorflow.op.train.ApplyFtrl;
import org.tensorflow.op.train.ApplyGradientDescent;
import org.tensorflow.op.train.ApplyMomentum;
import org.tensorflow.op.train.ApplyPowerSign;
import org.tensorflow.op.train.ApplyProximalAdagrad;
import org.tensorflow.op.train.ApplyProximalGradientDescent;
import org.tensorflow.op.train.ApplyRmsProp;
import org.tensorflow.op.train.ConditionalAccumulator;
import org.tensorflow.op.train.GenerateVocabRemapping;
import org.tensorflow.op.train.MergeV2Checkpoints;
import org.tensorflow.op.train.NegTrain;
import org.tensorflow.op.train.PreventGradient;
import org.tensorflow.op.train.ResourceApplyAdadelta;
import org.tensorflow.op.train.ResourceApplyAdagrad;
import org.tensorflow.op.train.ResourceApplyAdagradDa;
import org.tensorflow.op.train.ResourceApplyAdam;
import org.tensorflow.op.train.ResourceApplyAddSign;
import org.tensorflow.op.train.ResourceApplyCenteredRmsProp;
import org.tensorflow.op.train.ResourceApplyFtrl;
import org.tensorflow.op.train.ResourceApplyGradientDescent;
import org.tensorflow.op.train.ResourceApplyMomentum;
import org.tensorflow.op.train.ResourceApplyPowerSign;
import org.tensorflow.op.train.ResourceApplyProximalAdagrad;
import org.tensorflow.op.train.ResourceApplyProximalGradientDescent;
import org.tensorflow.op.train.ResourceApplyRmsProp;
import org.tensorflow.op.train.ResourceSparseApplyAdadelta;
import org.tensorflow.op.train.ResourceSparseApplyAdagrad;
import org.tensorflow.op.train.ResourceSparseApplyAdagradDa;
import org.tensorflow.op.train.ResourceSparseApplyCenteredRmsProp;
import org.tensorflow.op.train.ResourceSparseApplyFtrl;
import org.tensorflow.op.train.ResourceSparseApplyMomentum;
import org.tensorflow.op.train.ResourceSparseApplyProximalAdagrad;
import org.tensorflow.op.train.ResourceSparseApplyProximalGradientDescent;
import org.tensorflow.op.train.ResourceSparseApplyRmsProp;
import org.tensorflow.op.train.Restore;
import org.tensorflow.op.train.RestoreSlice;
import org.tensorflow.op.train.Save;
import org.tensorflow.op.train.SaveSlices;
import org.tensorflow.op.train.SdcaFprint;
import org.tensorflow.op.train.SdcaShrinkL1;
import org.tensorflow.op.train.SparseApplyAdadelta;
import org.tensorflow.op.train.SparseApplyAdagrad;
import org.tensorflow.op.train.SparseApplyAdagradDa;
import org.tensorflow.op.train.SparseApplyCenteredRmsProp;
import org.tensorflow.op.train.SparseApplyFtrl;
import org.tensorflow.op.train.SparseApplyMomentum;
import org.tensorflow.op.train.SparseApplyProximalAdagrad;
import org.tensorflow.op.train.SparseApplyProximalGradientDescent;
import org.tensorflow.op.train.SparseApplyRmsProp;
import org.tensorflow.op.train.TileGrad;

/**
 * An API for building {@code train} operations as {@link Op Op}s
 *
 * @see {@link Ops}
 */
public final class TrainOps {
  private final Scope scope;

  TrainOps(Scope scope) {
    this.scope = scope;
  }

  /**
   * Builds an {@link ResourceSparseApplyAdagradDa} operation
   *
   * @param var Should be from a Variable().
   * @param gradientAccumulator Should be from a Variable().
   * @param gradientSquaredAccumulator Should be from a Variable().
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param lr Learning rate. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param globalStep Training step number. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyAdagradDa
   * @see org.tensorflow.op.train.ResourceSparseApplyAdagradDa
   */
  public <T, U extends Number> ResourceSparseApplyAdagradDa resourceSparseApplyAdagradDa(
      Operand<?> var, Operand<?> gradientAccumulator, Operand<?> gradientSquaredAccumulator,
      Operand<T> grad, Operand<U> indices, Operand<T> lr, Operand<T> l1, Operand<T> l2,
      Operand<Long> globalStep, ResourceSparseApplyAdagradDa.Options... options) {
    return ResourceSparseApplyAdagradDa.create(scope, var, gradientAccumulator, gradientSquaredAccumulator, grad, indices, lr, l1, l2, globalStep, options);
  }

  /**
   * Builds an {@link ResourceSparseApplyAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyAdagrad
   * @see org.tensorflow.op.train.ResourceSparseApplyAdagrad
   */
  public <T, U extends Number> ResourceSparseApplyAdagrad resourceSparseApplyAdagrad(Operand<?> var,
      Operand<?> accum, Operand<T> lr, Operand<T> grad, Operand<U> indices,
      ResourceSparseApplyAdagrad.Options... options) {
    return ResourceSparseApplyAdagrad.create(scope, var, accum, lr, grad, indices, options);
  }

  /**
   * Builds an {@link ApplyMomentum} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param grad The gradient.
   * @param momentum Momentum. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ApplyMomentum
   * @see org.tensorflow.op.train.ApplyMomentum
   */
  public <T> ApplyMomentum<T> applyMomentum(Operand<T> var, Operand<T> accum, Operand<T> lr,
      Operand<T> grad, Operand<T> momentum, ApplyMomentum.Options... options) {
    return ApplyMomentum.create(scope, var, accum, lr, grad, momentum, options);
  }

  /**
   * Builds an {@link AccumulatorApplyGradient} operation
   *
   * @param handle The handle to a accumulator.
   * @param localStep The local_step value at which the gradient was computed.
   * @param gradient A tensor of the gradient to be accumulated.
   * @return a new instance of AccumulatorApplyGradient
   * @see org.tensorflow.op.train.AccumulatorApplyGradient
   */
  public <T> AccumulatorApplyGradient accumulatorApplyGradient(Operand<String> handle,
      Operand<Long> localStep, Operand<T> gradient) {
    return AccumulatorApplyGradient.create(scope, handle, localStep, gradient);
  }

  /**
   * Builds an {@link ApplyAddSign} operation
   *
   * @param var Should be from a Variable().
   * @param m Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param alpha Must be a scalar.
   * @param signDecay Must be a scalar.
   * @param beta Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyAddSign
   * @see org.tensorflow.op.train.ApplyAddSign
   */
  public <T> ApplyAddSign<T> applyAddSign(Operand<T> var, Operand<T> m, Operand<T> lr,
      Operand<T> alpha, Operand<T> signDecay, Operand<T> beta, Operand<T> grad,
      ApplyAddSign.Options... options) {
    return ApplyAddSign.create(scope, var, m, lr, alpha, signDecay, beta, grad, options);
  }

  /**
   * Builds an {@link ResourceApplyAddSign} operation
   *
   * @param var Should be from a Variable().
   * @param m Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param alpha Must be a scalar.
   * @param signDecay Must be a scalar.
   * @param beta Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyAddSign
   * @see org.tensorflow.op.train.ResourceApplyAddSign
   */
  public <T> ResourceApplyAddSign resourceApplyAddSign(Operand<?> var, Operand<?> m, Operand<T> lr,
      Operand<T> alpha, Operand<T> signDecay, Operand<T> beta, Operand<T> grad,
      ResourceApplyAddSign.Options... options) {
    return ResourceApplyAddSign.create(scope, var, m, lr, alpha, signDecay, beta, grad, options);
  }

  /**
   * Builds an {@link ApplyAdam} operation
   *
   * @param var Should be from a Variable().
   * @param m Should be from a Variable().
   * @param v Should be from a Variable().
   * @param beta1Power Must be a scalar.
   * @param beta2Power Must be a scalar.
   * @param lr Scaling factor. Must be a scalar.
   * @param beta1 Momentum factor. Must be a scalar.
   * @param beta2 Momentum factor. Must be a scalar.
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyAdam
   * @see org.tensorflow.op.train.ApplyAdam
   */
  public <T> ApplyAdam<T> applyAdam(Operand<T> var, Operand<T> m, Operand<T> v,
      Operand<T> beta1Power, Operand<T> beta2Power, Operand<T> lr, Operand<T> beta1,
      Operand<T> beta2, Operand<T> epsilon, Operand<T> grad, ApplyAdam.Options... options) {
    return ApplyAdam.create(scope, var, m, v, beta1Power, beta2Power, lr, beta1, beta2, epsilon, grad, options);
  }

  /**
   * Builds an {@link SaveSlices} operation
   *
   * @param filename Must have a single element. The name of the file to which we write the
   * @param tensorNames Shape `[N]`. The names of the tensors to be saved.
   * @param shapesAndSlices Shape `[N]`.  The shapes and slice specifications to use when
   * @param data `N` tensors to save.
   * @return a new instance of SaveSlices
   * @see org.tensorflow.op.train.SaveSlices
   */
  public SaveSlices saveSlices(Operand<String> filename, Operand<String> tensorNames,
      Operand<String> shapesAndSlices, Iterable<Operand<?>> data) {
    return SaveSlices.create(scope, filename, tensorNames, shapesAndSlices, data);
  }

  /**
   * Builds an {@link AccumulatorTakeGradient} operation
   *
   * @param handle The handle to an accumulator.
   * @param numRequired Number of gradients required before we return an aggregate.
   * @param dtype The data type of accumulated gradients. Needs to correspond to the type
   * @return a new instance of AccumulatorTakeGradient
   * @see org.tensorflow.op.train.AccumulatorTakeGradient
   */
  public <T> AccumulatorTakeGradient<T> accumulatorTakeGradient(Operand<String> handle,
      Operand<Integer> numRequired, Class<T> dtype) {
    return AccumulatorTakeGradient.create(scope, handle, numRequired, dtype);
  }

  /**
   * Builds an {@link NegTrain} operation
   *
   * @param wIn input word embedding.
   * @param wOut output word embedding.
   * @param examples A vector of word ids.
   * @param labels A vector of word ids.
   * @param lr 
   * @param vocabCount Count of words in the vocabulary.
   * @param numNegativeSamples Number of negative samples per example.
   * @return a new instance of NegTrain
   * @see org.tensorflow.op.train.NegTrain
   */
  public NegTrain negTrain(Operand<Float> wIn, Operand<Float> wOut, Operand<Integer> examples,
      Operand<Integer> labels, Operand<Float> lr, List<Long> vocabCount, Long numNegativeSamples) {
    return NegTrain.create(scope, wIn, wOut, examples, labels, lr, vocabCount, numNegativeSamples);
  }

  /**
   * Builds an {@link ResourceSparseApplyRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var, ms and mom.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyRmsProp
   * @see org.tensorflow.op.train.ResourceSparseApplyRmsProp
   */
  public <T, U extends Number> ResourceSparseApplyRmsProp resourceSparseApplyRmsProp(Operand<?> var,
      Operand<?> ms, Operand<?> mom, Operand<T> lr, Operand<T> rho, Operand<T> momentum,
      Operand<T> epsilon, Operand<T> grad, Operand<U> indices,
      ResourceSparseApplyRmsProp.Options... options) {
    return ResourceSparseApplyRmsProp.create(scope, var, ms, mom, lr, rho, momentum, epsilon, grad, indices, options);
  }

  /**
   * Builds an {@link SparseApplyProximalAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyProximalAdagrad
   * @see org.tensorflow.op.train.SparseApplyProximalAdagrad
   */
  public <T, U extends Number> SparseApplyProximalAdagrad<T> sparseApplyProximalAdagrad(
      Operand<T> var, Operand<T> accum, Operand<T> lr, Operand<T> l1, Operand<T> l2,
      Operand<T> grad, Operand<U> indices, SparseApplyProximalAdagrad.Options... options) {
    return SparseApplyProximalAdagrad.create(scope, var, accum, lr, l1, l2, grad, indices, options);
  }

  /**
   * Builds an {@link ResourceApplyAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyAdagrad
   * @see org.tensorflow.op.train.ResourceApplyAdagrad
   */
  public <T> ResourceApplyAdagrad resourceApplyAdagrad(Operand<?> var, Operand<?> accum,
      Operand<T> lr, Operand<T> grad, ResourceApplyAdagrad.Options... options) {
    return ResourceApplyAdagrad.create(scope, var, accum, lr, grad, options);
  }

  /**
   * Builds an {@link ResourceApplyFtrl} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param linear Should be from a Variable().
   * @param grad The gradient.
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regulariation. Must be a scalar.
   * @param l2 L2 shrinkage regulariation. Must be a scalar.
   * @param l2Shrinkage 
   * @param lrPower Scaling factor. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyFtrl
   * @see org.tensorflow.op.train.ResourceApplyFtrl
   */
  public <T> ResourceApplyFtrl resourceApplyFtrl(Operand<?> var, Operand<?> accum,
      Operand<?> linear, Operand<T> grad, Operand<T> lr, Operand<T> l1, Operand<T> l2,
      Operand<T> l2Shrinkage, Operand<T> lrPower, ResourceApplyFtrl.Options... options) {
    return ResourceApplyFtrl.create(scope, var, accum, linear, grad, lr, l1, l2, l2Shrinkage, lrPower, options);
  }

  /**
   * Builds an {@link SparseApplyMomentum} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param momentum Momentum. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyMomentum
   * @see org.tensorflow.op.train.SparseApplyMomentum
   */
  public <T, U extends Number> SparseApplyMomentum<T> sparseApplyMomentum(Operand<T> var,
      Operand<T> accum, Operand<T> lr, Operand<T> grad, Operand<U> indices, Operand<T> momentum,
      SparseApplyMomentum.Options... options) {
    return SparseApplyMomentum.create(scope, var, accum, lr, grad, indices, momentum, options);
  }

  /**
   * Builds an {@link ApplyAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyAdagrad
   * @see org.tensorflow.op.train.ApplyAdagrad
   */
  public <T> ApplyAdagrad<T> applyAdagrad(Operand<T> var, Operand<T> accum, Operand<T> lr,
      Operand<T> grad, ApplyAdagrad.Options... options) {
    return ApplyAdagrad.create(scope, var, accum, lr, grad, options);
  }

  /**
   * Builds an {@link ResourceApplyRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyRmsProp
   * @see org.tensorflow.op.train.ResourceApplyRmsProp
   */
  public <T> ResourceApplyRmsProp resourceApplyRmsProp(Operand<?> var, Operand<?> ms,
      Operand<?> mom, Operand<T> lr, Operand<T> rho, Operand<T> momentum, Operand<T> epsilon,
      Operand<T> grad, ResourceApplyRmsProp.Options... options) {
    return ResourceApplyRmsProp.create(scope, var, ms, mom, lr, rho, momentum, epsilon, grad, options);
  }

  /**
   * Builds an {@link ApplyProximalAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyProximalAdagrad
   * @see org.tensorflow.op.train.ApplyProximalAdagrad
   */
  public <T> ApplyProximalAdagrad<T> applyProximalAdagrad(Operand<T> var, Operand<T> accum,
      Operand<T> lr, Operand<T> l1, Operand<T> l2, Operand<T> grad,
      ApplyProximalAdagrad.Options... options) {
    return ApplyProximalAdagrad.create(scope, var, accum, lr, l1, l2, grad, options);
  }

  /**
   * Builds an {@link Save} operation
   *
   * @param prefix Must have a single element. The prefix of the V2 checkpoint to which we
   * @param tensorNames shape {N}. The names of the tensors to be saved.
   * @param shapeAndSlices shape {N}.  The slice specs of the tensors to be saved.
   * @param tensors `N` tensors to save.
   * @return a new instance of Save
   * @see org.tensorflow.op.train.Save
   */
  public Save save(Operand<String> prefix, Operand<String> tensorNames,
      Operand<String> shapeAndSlices, Iterable<Operand<?>> tensors) {
    return Save.create(scope, prefix, tensorNames, shapeAndSlices, tensors);
  }

  /**
   * Builds an {@link SparseApplyRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var, ms and mom.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyRmsProp
   * @see org.tensorflow.op.train.SparseApplyRmsProp
   */
  public <T, U extends Number> SparseApplyRmsProp<T> sparseApplyRmsProp(Operand<T> var,
      Operand<T> ms, Operand<T> mom, Operand<T> lr, Operand<T> rho, Operand<T> momentum,
      Operand<T> epsilon, Operand<T> grad, Operand<U> indices,
      SparseApplyRmsProp.Options... options) {
    return SparseApplyRmsProp.create(scope, var, ms, mom, lr, rho, momentum, epsilon, grad, indices, options);
  }

  /**
   * Builds an {@link ApplyPowerSign} operation
   *
   * @param var Should be from a Variable().
   * @param m Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param logbase Must be a scalar.
   * @param signDecay Must be a scalar.
   * @param beta Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyPowerSign
   * @see org.tensorflow.op.train.ApplyPowerSign
   */
  public <T> ApplyPowerSign<T> applyPowerSign(Operand<T> var, Operand<T> m, Operand<T> lr,
      Operand<T> logbase, Operand<T> signDecay, Operand<T> beta, Operand<T> grad,
      ApplyPowerSign.Options... options) {
    return ApplyPowerSign.create(scope, var, m, lr, logbase, signDecay, beta, grad, options);
  }

  /**
   * Builds an {@link SparseApplyAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyAdagrad
   * @see org.tensorflow.op.train.SparseApplyAdagrad
   */
  public <T, U extends Number> SparseApplyAdagrad<T> sparseApplyAdagrad(Operand<T> var,
      Operand<T> accum, Operand<T> lr, Operand<T> grad, Operand<U> indices,
      SparseApplyAdagrad.Options... options) {
    return SparseApplyAdagrad.create(scope, var, accum, lr, grad, indices, options);
  }

  /**
   * Builds an {@link SparseApplyProximalGradientDescent} operation
   *
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyProximalGradientDescent
   * @see org.tensorflow.op.train.SparseApplyProximalGradientDescent
   */
  public <T, U extends Number> SparseApplyProximalGradientDescent<T> sparseApplyProximalGradientDescent(
      Operand<T> var, Operand<T> alpha, Operand<T> l1, Operand<T> l2, Operand<T> grad,
      Operand<U> indices, SparseApplyProximalGradientDescent.Options... options) {
    return SparseApplyProximalGradientDescent.create(scope, var, alpha, l1, l2, grad, indices, options);
  }

  /**
   * Builds an {@link ApplyAdadelta} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param accumUpdate Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay factor. Must be a scalar.
   * @param epsilon Constant factor. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyAdadelta
   * @see org.tensorflow.op.train.ApplyAdadelta
   */
  public <T> ApplyAdadelta<T> applyAdadelta(Operand<T> var, Operand<T> accum,
      Operand<T> accumUpdate, Operand<T> lr, Operand<T> rho, Operand<T> epsilon, Operand<T> grad,
      ApplyAdadelta.Options... options) {
    return ApplyAdadelta.create(scope, var, accum, accumUpdate, lr, rho, epsilon, grad, options);
  }

  /**
   * Builds an {@link SdcaShrinkL1} operation
   *
   * @param weights a list of vectors where each value is the weight associated with a
   * @param l1 Symmetric l1 regularization strength.
   * @param l2 Symmetric l2 regularization strength. Should be a positive float.
   * @return a new instance of SdcaShrinkL1
   * @see org.tensorflow.op.train.SdcaShrinkL1
   */
  public SdcaShrinkL1 sdcaShrinkL1(Iterable<Operand<Float>> weights, Float l1, Float l2) {
    return SdcaShrinkL1.create(scope, weights, l1, l2);
  }

  /**
   * Builds an {@link Restore} operation
   *
   * @param prefix Must have a single element.  The prefix of a V2 checkpoint.
   * @param tensorNames shape {N}.  The names of the tensors to be restored.
   * @param shapeAndSlices shape {N}.  The slice specs of the tensors to be restored.
   * @param dtypes shape {N}.  The list of expected dtype for the tensors.  Must match
   * @return a new instance of Restore
   * @see org.tensorflow.op.train.Restore
   */
  public Restore restore(Operand<String> prefix, Operand<String> tensorNames,
      Operand<String> shapeAndSlices, List<Class<?>> dtypes) {
    return Restore.create(scope, prefix, tensorNames, shapeAndSlices, dtypes);
  }

  /**
   * Builds an {@link ResourceSparseApplyAdadelta} operation
   *
   * @param var 
   * @param accum Should be from a Variable().
   * @param accumUpdate : Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param rho Decay factor. Must be a scalar.
   * @param epsilon Constant factor. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyAdadelta
   * @see org.tensorflow.op.train.ResourceSparseApplyAdadelta
   */
  public <T, U extends Number> ResourceSparseApplyAdadelta resourceSparseApplyAdadelta(
      Operand<?> var, Operand<?> accum, Operand<?> accumUpdate, Operand<T> lr, Operand<T> rho,
      Operand<T> epsilon, Operand<T> grad, Operand<U> indices,
      ResourceSparseApplyAdadelta.Options... options) {
    return ResourceSparseApplyAdadelta.create(scope, var, accum, accumUpdate, lr, rho, epsilon, grad, indices, options);
  }

  /**
   * Builds an {@link ResourceApplyCenteredRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param mg Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyCenteredRmsProp
   * @see org.tensorflow.op.train.ResourceApplyCenteredRmsProp
   */
  public <T> ResourceApplyCenteredRmsProp resourceApplyCenteredRmsProp(Operand<?> var,
      Operand<?> mg, Operand<?> ms, Operand<?> mom, Operand<T> lr, Operand<T> rho,
      Operand<T> momentum, Operand<T> epsilon, Operand<T> grad,
      ResourceApplyCenteredRmsProp.Options... options) {
    return ResourceApplyCenteredRmsProp.create(scope, var, mg, ms, mom, lr, rho, momentum, epsilon, grad, options);
  }

  /**
   * Builds an {@link SparseApplyAdagradDa} operation
   *
   * @param var Should be from a Variable().
   * @param gradientAccumulator Should be from a Variable().
   * @param gradientSquaredAccumulator Should be from a Variable().
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param lr Learning rate. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param globalStep Training step number. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyAdagradDa
   * @see org.tensorflow.op.train.SparseApplyAdagradDa
   */
  public <T, U extends Number> SparseApplyAdagradDa<T> sparseApplyAdagradDa(Operand<T> var,
      Operand<T> gradientAccumulator, Operand<T> gradientSquaredAccumulator, Operand<T> grad,
      Operand<U> indices, Operand<T> lr, Operand<T> l1, Operand<T> l2, Operand<Long> globalStep,
      SparseApplyAdagradDa.Options... options) {
    return SparseApplyAdagradDa.create(scope, var, gradientAccumulator, gradientSquaredAccumulator, grad, indices, lr, l1, l2, globalStep, options);
  }

  /**
   * Builds an {@link AccumulatorSetGlobalStep} operation
   *
   * @param handle The handle to an accumulator.
   * @param newGlobalStep The new global_step value to set.
   * @return a new instance of AccumulatorSetGlobalStep
   * @see org.tensorflow.op.train.AccumulatorSetGlobalStep
   */
  public AccumulatorSetGlobalStep accumulatorSetGlobalStep(Operand<String> handle,
      Operand<Long> newGlobalStep) {
    return AccumulatorSetGlobalStep.create(scope, handle, newGlobalStep);
  }

  /**
   * Builds an {@link ResourceSparseApplyFtrl} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param linear Should be from a Variable().
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 shrinkage regulariation. Must be a scalar.
   * @param l2Shrinkage 
   * @param lrPower Scaling factor. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyFtrl
   * @see org.tensorflow.op.train.ResourceSparseApplyFtrl
   */
  public <T, U extends Number> ResourceSparseApplyFtrl resourceSparseApplyFtrl(Operand<?> var,
      Operand<?> accum, Operand<?> linear, Operand<T> grad, Operand<U> indices, Operand<T> lr,
      Operand<T> l1, Operand<T> l2, Operand<T> l2Shrinkage, Operand<T> lrPower,
      ResourceSparseApplyFtrl.Options... options) {
    return ResourceSparseApplyFtrl.create(scope, var, accum, linear, grad, indices, lr, l1, l2, l2Shrinkage, lrPower, options);
  }

  /**
   * Builds an {@link ApplyFtrl} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param linear Should be from a Variable().
   * @param grad The gradient.
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regulariation. Must be a scalar.
   * @param l2 L2 shrinkage regulariation. Must be a scalar.
   * @param l2Shrinkage 
   * @param lrPower Scaling factor. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ApplyFtrl
   * @see org.tensorflow.op.train.ApplyFtrl
   */
  public <T> ApplyFtrl<T> applyFtrl(Operand<T> var, Operand<T> accum, Operand<T> linear,
      Operand<T> grad, Operand<T> lr, Operand<T> l1, Operand<T> l2, Operand<T> l2Shrinkage,
      Operand<T> lrPower, ApplyFtrl.Options... options) {
    return ApplyFtrl.create(scope, var, accum, linear, grad, lr, l1, l2, l2Shrinkage, lrPower, options);
  }

  /**
   * Builds an {@link ResourceApplyMomentum} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param grad The gradient.
   * @param momentum Momentum. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyMomentum
   * @see org.tensorflow.op.train.ResourceApplyMomentum
   */
  public <T> ResourceApplyMomentum resourceApplyMomentum(Operand<?> var, Operand<?> accum,
      Operand<T> lr, Operand<T> grad, Operand<T> momentum,
      ResourceApplyMomentum.Options... options) {
    return ResourceApplyMomentum.create(scope, var, accum, lr, grad, momentum, options);
  }

  /**
   * Builds an {@link RestoreSlice} operation
   *
   * @param filePattern Must have a single element. The pattern of the files from
   * @param tensorName Must have a single element. The name of the tensor to be
   * @param shapeAndSlice Scalar. The shapes and slice specifications to use when
   * @param dt The type of the tensor to be restored.
   * @param options carries optional attributes values
   * @return a new instance of RestoreSlice
   * @see org.tensorflow.op.train.RestoreSlice
   */
  public <T> RestoreSlice<T> restoreSlice(Operand<String> filePattern, Operand<String> tensorName,
      Operand<String> shapeAndSlice, Class<T> dt, RestoreSlice.Options... options) {
    return RestoreSlice.create(scope, filePattern, tensorName, shapeAndSlice, dt, options);
  }

  /**
   * Builds an {@link ResourceSparseApplyMomentum} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param momentum Momentum. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyMomentum
   * @see org.tensorflow.op.train.ResourceSparseApplyMomentum
   */
  public <T, U extends Number> ResourceSparseApplyMomentum resourceSparseApplyMomentum(
      Operand<?> var, Operand<?> accum, Operand<T> lr, Operand<T> grad, Operand<U> indices,
      Operand<T> momentum, ResourceSparseApplyMomentum.Options... options) {
    return ResourceSparseApplyMomentum.create(scope, var, accum, lr, grad, indices, momentum, options);
  }

  /**
   * Builds an {@link ResourceApplyGradientDescent} operation
   *
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param delta The change.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyGradientDescent
   * @see org.tensorflow.op.train.ResourceApplyGradientDescent
   */
  public <T> ResourceApplyGradientDescent resourceApplyGradientDescent(Operand<?> var,
      Operand<T> alpha, Operand<T> delta, ResourceApplyGradientDescent.Options... options) {
    return ResourceApplyGradientDescent.create(scope, var, alpha, delta, options);
  }

  /**
   * Builds an {@link AccumulatorNumAccumulated} operation
   *
   * @param handle The handle to an accumulator.
   * @return a new instance of AccumulatorNumAccumulated
   * @see org.tensorflow.op.train.AccumulatorNumAccumulated
   */
  public AccumulatorNumAccumulated accumulatorNumAccumulated(Operand<String> handle) {
    return AccumulatorNumAccumulated.create(scope, handle);
  }

  /**
   * Builds an {@link PreventGradient} operation
   *
   * @param input any tensor.
   * @param options carries optional attributes values
   * @return a new instance of PreventGradient
   * @see org.tensorflow.op.train.PreventGradient
   */
  public <T> PreventGradient<T> preventGradient(Operand<T> input,
      PreventGradient.Options... options) {
    return PreventGradient.create(scope, input, options);
  }

  /**
   * Builds an {@link ResourceApplyAdadelta} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param accumUpdate Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay factor. Must be a scalar.
   * @param epsilon Constant factor. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyAdadelta
   * @see org.tensorflow.op.train.ResourceApplyAdadelta
   */
  public <T> ResourceApplyAdadelta resourceApplyAdadelta(Operand<?> var, Operand<?> accum,
      Operand<?> accumUpdate, Operand<T> lr, Operand<T> rho, Operand<T> epsilon, Operand<T> grad,
      ResourceApplyAdadelta.Options... options) {
    return ResourceApplyAdadelta.create(scope, var, accum, accumUpdate, lr, rho, epsilon, grad, options);
  }

  /**
   * Builds an {@link ResourceApplyAdagradDa} operation
   *
   * @param var Should be from a Variable().
   * @param gradientAccumulator Should be from a Variable().
   * @param gradientSquaredAccumulator Should be from a Variable().
   * @param grad The gradient.
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param globalStep Training step number. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyAdagradDa
   * @see org.tensorflow.op.train.ResourceApplyAdagradDa
   */
  public <T> ResourceApplyAdagradDa resourceApplyAdagradDa(Operand<?> var,
      Operand<?> gradientAccumulator, Operand<?> gradientSquaredAccumulator, Operand<T> grad,
      Operand<T> lr, Operand<T> l1, Operand<T> l2, Operand<Long> globalStep,
      ResourceApplyAdagradDa.Options... options) {
    return ResourceApplyAdagradDa.create(scope, var, gradientAccumulator, gradientSquaredAccumulator, grad, lr, l1, l2, globalStep, options);
  }

  /**
   * Builds an {@link ApplyGradientDescent} operation
   *
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param delta The change.
   * @param options carries optional attributes values
   * @return a new instance of ApplyGradientDescent
   * @see org.tensorflow.op.train.ApplyGradientDescent
   */
  public <T> ApplyGradientDescent<T> applyGradientDescent(Operand<T> var, Operand<T> alpha,
      Operand<T> delta, ApplyGradientDescent.Options... options) {
    return ApplyGradientDescent.create(scope, var, alpha, delta, options);
  }

  /**
   * Builds an {@link ResourceApplyProximalGradientDescent} operation
   *
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param delta The change.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyProximalGradientDescent
   * @see org.tensorflow.op.train.ResourceApplyProximalGradientDescent
   */
  public <T> ResourceApplyProximalGradientDescent resourceApplyProximalGradientDescent(
      Operand<?> var, Operand<T> alpha, Operand<T> l1, Operand<T> l2, Operand<T> delta,
      ResourceApplyProximalGradientDescent.Options... options) {
    return ResourceApplyProximalGradientDescent.create(scope, var, alpha, l1, l2, delta, options);
  }

  /**
   * Builds an {@link ResourceApplyAdam} operation
   *
   * @param var Should be from a Variable().
   * @param m Should be from a Variable().
   * @param v Should be from a Variable().
   * @param beta1Power Must be a scalar.
   * @param beta2Power Must be a scalar.
   * @param lr Scaling factor. Must be a scalar.
   * @param beta1 Momentum factor. Must be a scalar.
   * @param beta2 Momentum factor. Must be a scalar.
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyAdam
   * @see org.tensorflow.op.train.ResourceApplyAdam
   */
  public <T> ResourceApplyAdam resourceApplyAdam(Operand<?> var, Operand<?> m, Operand<?> v,
      Operand<T> beta1Power, Operand<T> beta2Power, Operand<T> lr, Operand<T> beta1,
      Operand<T> beta2, Operand<T> epsilon, Operand<T> grad, ResourceApplyAdam.Options... options) {
    return ResourceApplyAdam.create(scope, var, m, v, beta1Power, beta2Power, lr, beta1, beta2, epsilon, grad, options);
  }

  /**
   * Builds an {@link SdcaFprint} operation
   *
   * @param input vector of strings to compute fingerprints on.
   * @return a new instance of SdcaFprint
   * @see org.tensorflow.op.train.SdcaFprint
   */
  public SdcaFprint sdcaFprint(Operand<String> input) {
    return SdcaFprint.create(scope, input);
  }

  /**
   * Builds an {@link ResourceSparseApplyProximalAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyProximalAdagrad
   * @see org.tensorflow.op.train.ResourceSparseApplyProximalAdagrad
   */
  public <T, U extends Number> ResourceSparseApplyProximalAdagrad resourceSparseApplyProximalAdagrad(
      Operand<?> var, Operand<?> accum, Operand<T> lr, Operand<T> l1, Operand<T> l2,
      Operand<T> grad, Operand<U> indices, ResourceSparseApplyProximalAdagrad.Options... options) {
    return ResourceSparseApplyProximalAdagrad.create(scope, var, accum, lr, l1, l2, grad, indices, options);
  }

  /**
   * Builds an {@link ResourceSparseApplyProximalGradientDescent} operation
   *
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyProximalGradientDescent
   * @see org.tensorflow.op.train.ResourceSparseApplyProximalGradientDescent
   */
  public <T, U extends Number> ResourceSparseApplyProximalGradientDescent resourceSparseApplyProximalGradientDescent(
      Operand<?> var, Operand<T> alpha, Operand<T> l1, Operand<T> l2, Operand<T> grad,
      Operand<U> indices, ResourceSparseApplyProximalGradientDescent.Options... options) {
    return ResourceSparseApplyProximalGradientDescent.create(scope, var, alpha, l1, l2, grad, indices, options);
  }

  /**
   * Builds an {@link ApplyRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyRmsProp
   * @see org.tensorflow.op.train.ApplyRmsProp
   */
  public <T> ApplyRmsProp<T> applyRmsProp(Operand<T> var, Operand<T> ms, Operand<T> mom,
      Operand<T> lr, Operand<T> rho, Operand<T> momentum, Operand<T> epsilon, Operand<T> grad,
      ApplyRmsProp.Options... options) {
    return ApplyRmsProp.create(scope, var, ms, mom, lr, rho, momentum, epsilon, grad, options);
  }

  /**
   * Builds an {@link GenerateVocabRemapping} operation
   *
   * @param newVocabFile Path to the new vocab file.
   * @param oldVocabFile Path to the old vocab file.
   * @param newVocabOffset How many entries into the new vocab file to start reading.
   * @param numNewVocab Number of entries in the new vocab file to remap.
   * @param options carries optional attributes values
   * @return a new instance of GenerateVocabRemapping
   * @see org.tensorflow.op.train.GenerateVocabRemapping
   */
  public GenerateVocabRemapping generateVocabRemapping(Operand<String> newVocabFile,
      Operand<String> oldVocabFile, Long newVocabOffset, Long numNewVocab,
      GenerateVocabRemapping.Options... options) {
    return GenerateVocabRemapping.create(scope, newVocabFile, oldVocabFile, newVocabOffset, numNewVocab, options);
  }

  /**
   * Builds an {@link SparseApplyAdadelta} operation
   *
   * @param var 
   * @param accum Should be from a Variable().
   * @param accumUpdate : Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param rho Decay factor. Must be a scalar.
   * @param epsilon Constant factor. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyAdadelta
   * @see org.tensorflow.op.train.SparseApplyAdadelta
   */
  public <T, U extends Number> SparseApplyAdadelta<T> sparseApplyAdadelta(Operand<T> var,
      Operand<T> accum, Operand<T> accumUpdate, Operand<T> lr, Operand<T> rho, Operand<T> epsilon,
      Operand<T> grad, Operand<U> indices, SparseApplyAdadelta.Options... options) {
    return SparseApplyAdadelta.create(scope, var, accum, accumUpdate, lr, rho, epsilon, grad, indices, options);
  }

  /**
   * Builds an {@link ResourceApplyProximalAdagrad} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyProximalAdagrad
   * @see org.tensorflow.op.train.ResourceApplyProximalAdagrad
   */
  public <T> ResourceApplyProximalAdagrad resourceApplyProximalAdagrad(Operand<?> var,
      Operand<?> accum, Operand<T> lr, Operand<T> l1, Operand<T> l2, Operand<T> grad,
      ResourceApplyProximalAdagrad.Options... options) {
    return ResourceApplyProximalAdagrad.create(scope, var, accum, lr, l1, l2, grad, options);
  }

  /**
   * Builds an {@link ConditionalAccumulator} operation
   *
   * @param dtype The type of the value being accumulated.
   * @param shape The shape of the values, can be [], in which case shape is unknown.
   * @param options carries optional attributes values
   * @return a new instance of ConditionalAccumulator
   * @see org.tensorflow.op.train.ConditionalAccumulator
   */
  public <T> ConditionalAccumulator conditionalAccumulator(Class<T> dtype, Shape shape,
      ConditionalAccumulator.Options... options) {
    return ConditionalAccumulator.create(scope, dtype, shape, options);
  }

  /**
   * Builds an {@link ResourceApplyPowerSign} operation
   *
   * @param var Should be from a Variable().
   * @param m Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param logbase Must be a scalar.
   * @param signDecay Must be a scalar.
   * @param beta Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ResourceApplyPowerSign
   * @see org.tensorflow.op.train.ResourceApplyPowerSign
   */
  public <T> ResourceApplyPowerSign resourceApplyPowerSign(Operand<?> var, Operand<?> m,
      Operand<T> lr, Operand<T> logbase, Operand<T> signDecay, Operand<T> beta, Operand<T> grad,
      ResourceApplyPowerSign.Options... options) {
    return ResourceApplyPowerSign.create(scope, var, m, lr, logbase, signDecay, beta, grad, options);
  }

  /**
   * Builds an {@link ApplyProximalGradientDescent} operation
   *
   * @param var Should be from a Variable().
   * @param alpha Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param delta The change.
   * @param options carries optional attributes values
   * @return a new instance of ApplyProximalGradientDescent
   * @see org.tensorflow.op.train.ApplyProximalGradientDescent
   */
  public <T> ApplyProximalGradientDescent<T> applyProximalGradientDescent(Operand<T> var,
      Operand<T> alpha, Operand<T> l1, Operand<T> l2, Operand<T> delta,
      ApplyProximalGradientDescent.Options... options) {
    return ApplyProximalGradientDescent.create(scope, var, alpha, l1, l2, delta, options);
  }

  /**
   * Builds an {@link ResourceSparseApplyCenteredRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param mg Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var, ms and mom.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyCenteredRmsProp
   * @see org.tensorflow.op.train.ResourceSparseApplyCenteredRmsProp
   */
  public <T, U extends Number> ResourceSparseApplyCenteredRmsProp resourceSparseApplyCenteredRmsProp(
      Operand<?> var, Operand<?> mg, Operand<?> ms, Operand<?> mom, Operand<T> lr, Operand<T> rho,
      Operand<T> momentum, Operand<T> epsilon, Operand<T> grad, Operand<U> indices,
      ResourceSparseApplyCenteredRmsProp.Options... options) {
    return ResourceSparseApplyCenteredRmsProp.create(scope, var, mg, ms, mom, lr, rho, momentum, epsilon, grad, indices, options);
  }

  /**
   * Builds an {@link SparseApplyFtrl} operation
   *
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param linear Should be from a Variable().
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 shrinkage regulariation. Must be a scalar.
   * @param l2Shrinkage 
   * @param lrPower Scaling factor. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyFtrl
   * @see org.tensorflow.op.train.SparseApplyFtrl
   */
  public <T, U extends Number> SparseApplyFtrl<T> sparseApplyFtrl(Operand<T> var, Operand<T> accum,
      Operand<T> linear, Operand<T> grad, Operand<U> indices, Operand<T> lr, Operand<T> l1,
      Operand<T> l2, Operand<T> l2Shrinkage, Operand<T> lrPower,
      SparseApplyFtrl.Options... options) {
    return SparseApplyFtrl.create(scope, var, accum, linear, grad, indices, lr, l1, l2, l2Shrinkage, lrPower, options);
  }

  /**
   * Builds an {@link SparseApplyCenteredRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param mg Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var, ms and mom.
   * @param options carries optional attributes values
   * @return a new instance of SparseApplyCenteredRmsProp
   * @see org.tensorflow.op.train.SparseApplyCenteredRmsProp
   */
  public <T, U extends Number> SparseApplyCenteredRmsProp<T> sparseApplyCenteredRmsProp(
      Operand<T> var, Operand<T> mg, Operand<T> ms, Operand<T> mom, Operand<T> lr, Operand<T> rho,
      Operand<T> momentum, Operand<T> epsilon, Operand<T> grad, Operand<U> indices,
      SparseApplyCenteredRmsProp.Options... options) {
    return SparseApplyCenteredRmsProp.create(scope, var, mg, ms, mom, lr, rho, momentum, epsilon, grad, indices, options);
  }

  /**
   * Builds an {@link MergeV2Checkpoints} operation
   *
   * @param checkpointPrefixes prefixes of V2 checkpoints to merge.
   * @param destinationPrefix scalar.  The desired final prefix.  Allowed to be the same
   * @param options carries optional attributes values
   * @return a new instance of MergeV2Checkpoints
   * @see org.tensorflow.op.train.MergeV2Checkpoints
   */
  public MergeV2Checkpoints mergeV2Checkpoints(Operand<String> checkpointPrefixes,
      Operand<String> destinationPrefix, MergeV2Checkpoints.Options... options) {
    return MergeV2Checkpoints.create(scope, checkpointPrefixes, destinationPrefix, options);
  }

  /**
   * Builds an {@link ApplyAdagradDa} operation
   *
   * @param var Should be from a Variable().
   * @param gradientAccumulator Should be from a Variable().
   * @param gradientSquaredAccumulator Should be from a Variable().
   * @param grad The gradient.
   * @param lr Scaling factor. Must be a scalar.
   * @param l1 L1 regularization. Must be a scalar.
   * @param l2 L2 regularization. Must be a scalar.
   * @param globalStep Training step number. Must be a scalar.
   * @param options carries optional attributes values
   * @return a new instance of ApplyAdagradDa
   * @see org.tensorflow.op.train.ApplyAdagradDa
   */
  public <T> ApplyAdagradDa<T> applyAdagradDa(Operand<T> var, Operand<T> gradientAccumulator,
      Operand<T> gradientSquaredAccumulator, Operand<T> grad, Operand<T> lr, Operand<T> l1,
      Operand<T> l2, Operand<Long> globalStep, ApplyAdagradDa.Options... options) {
    return ApplyAdagradDa.create(scope, var, gradientAccumulator, gradientSquaredAccumulator, grad, lr, l1, l2, globalStep, options);
  }

  /**
   * Builds an {@link TileGrad} operation
   *
   * @param input 
   * @param multiples 
   * @return a new instance of TileGrad
   * @see org.tensorflow.op.train.TileGrad
   */
  public <T> TileGrad<T> tileGrad(Operand<T> input, Operand<Integer> multiples) {
    return TileGrad.create(scope, input, multiples);
  }

  /**
   * Builds an {@link ApplyCenteredRmsProp} operation
   *
   * @param var Should be from a Variable().
   * @param mg Should be from a Variable().
   * @param ms Should be from a Variable().
   * @param mom Should be from a Variable().
   * @param lr Scaling factor. Must be a scalar.
   * @param rho Decay rate. Must be a scalar.
   * @param momentum 
   * @param epsilon Ridge term. Must be a scalar.
   * @param grad The gradient.
   * @param options carries optional attributes values
   * @return a new instance of ApplyCenteredRmsProp
   * @see org.tensorflow.op.train.ApplyCenteredRmsProp
   */
  public <T> ApplyCenteredRmsProp<T> applyCenteredRmsProp(Operand<T> var, Operand<T> mg,
      Operand<T> ms, Operand<T> mom, Operand<T> lr, Operand<T> rho, Operand<T> momentum,
      Operand<T> epsilon, Operand<T> grad, ApplyCenteredRmsProp.Options... options) {
    return ApplyCenteredRmsProp.create(scope, var, mg, ms, mom, lr, rho, momentum, epsilon, grad, options);
  }
}
