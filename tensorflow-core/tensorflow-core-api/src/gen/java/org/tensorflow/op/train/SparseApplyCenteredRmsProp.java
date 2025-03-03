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

package org.tensorflow.op.train;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Update '*var' according to the centered RMSProp algorithm.
 * <p>
 * The centered RMSProp algorithm uses an estimate of the centered second moment
 * (i.e., the variance) for normalization, as opposed to regular RMSProp, which
 * uses the (uncentered) second moment. This often helps with training, but is
 * slightly more expensive in terms of computation and memory.
 * <p>
 * Note that in dense implementation of this algorithm, mg, ms, and mom will
 * update even if the grad is zero, but in this sparse implementation, mg, ms,
 * and mom will not update in iterations during which the grad is zero.
 * <p>
 * mean_square = decay * mean_square + (1-decay) * gradient ** 2
 * mean_grad = decay * mean_grad + (1-decay) * gradient
 * Delta = learning_rate * gradient / sqrt(mean_square + epsilon - mean_grad ** 2)
 * <p>
 * $$ms <- rho * ms_{t-1} + (1-rho) * grad * grad$$
 * $$mom <- momentum * mom_{t-1} + lr * grad / sqrt(ms + epsilon)$$
 * $$var <- var - mom$$
 * 
 * @param <T> data type for {@code out()} output
 */
@Operator(group = "train")
public final class SparseApplyCenteredRmsProp<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.train.SparseApplyCenteredRmsProp}
   */
  public static class Options {
    
    /**
     * @param useLocking If `True`, updating of the var, mg, ms, and mom tensors is
     * protected by a lock; otherwise the behavior is undefined, but may exhibit less
     * contention.
     */
    public Options useLocking(Boolean useLocking) {
      this.useLocking = useLocking;
      return this;
    }
    
    private Boolean useLocking;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new SparseApplyCenteredRmsProp operation.
   * 
   * @param scope current scope
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
   */
  public static <T, U extends Number> SparseApplyCenteredRmsProp<T> create(Scope scope, Operand<T> var, Operand<T> mg, Operand<T> ms, Operand<T> mom, Operand<T> lr, Operand<T> rho, Operand<T> momentum, Operand<T> epsilon, Operand<T> grad, Operand<U> indices, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseApplyCenteredRMSProp", scope.makeOpName("SparseApplyCenteredRmsProp"));
    opBuilder.addInput(var.asOutput());
    opBuilder.addInput(mg.asOutput());
    opBuilder.addInput(ms.asOutput());
    opBuilder.addInput(mom.asOutput());
    opBuilder.addInput(lr.asOutput());
    opBuilder.addInput(rho.asOutput());
    opBuilder.addInput(momentum.asOutput());
    opBuilder.addInput(epsilon.asOutput());
    opBuilder.addInput(grad.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
      }
    }
    return new SparseApplyCenteredRmsProp<T>(opBuilder.build());
  }
  
  /**
   * @param useLocking If `True`, updating of the var, mg, ms, and mom tensors is
   * protected by a lock; otherwise the behavior is undefined, but may exhibit less
   * contention.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }
  
  /**
   * Same as "var".
   */
  public Output<T> out() {
    return out;
  }
  
  @Override
  public Output<T> asOutput() {
    return out;
  }
  
  private Output<T> out;
  
  private SparseApplyCenteredRmsProp(Operation operation) {
    super(operation);
    int outputIdx = 0;
    out = operation.output(outputIdx++);
  }
}
