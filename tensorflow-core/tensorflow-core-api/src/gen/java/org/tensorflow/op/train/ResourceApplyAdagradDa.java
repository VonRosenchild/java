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
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Update '*var' according to the proximal adagrad scheme.
 */
@Operator(group = "train")
public final class ResourceApplyAdagradDa extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.train.ResourceApplyAdagradDa}
   */
  public static class Options {
    
    /**
     * @param useLocking If True, updating of the var and accum tensors will be protected by
     * a lock; otherwise the behavior is undefined, but may exhibit less contention.
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
   * Factory method to create a class wrapping a new ResourceApplyAdagradDa operation.
   * 
   * @param scope current scope
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
   */
  public static <T> ResourceApplyAdagradDa create(Scope scope, Operand<?> var, Operand<?> gradientAccumulator, Operand<?> gradientSquaredAccumulator, Operand<T> grad, Operand<T> lr, Operand<T> l1, Operand<T> l2, Operand<Long> globalStep, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ResourceApplyAdagradDA", scope.makeOpName("ResourceApplyAdagradDa"));
    opBuilder.addInput(var.asOutput());
    opBuilder.addInput(gradientAccumulator.asOutput());
    opBuilder.addInput(gradientSquaredAccumulator.asOutput());
    opBuilder.addInput(grad.asOutput());
    opBuilder.addInput(lr.asOutput());
    opBuilder.addInput(l1.asOutput());
    opBuilder.addInput(l2.asOutput());
    opBuilder.addInput(globalStep.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
      }
    }
    return new ResourceApplyAdagradDa(opBuilder.build());
  }
  
  /**
   * @param useLocking If True, updating of the var and accum tensors will be protected by
   * a lock; otherwise the behavior is undefined, but may exhibit less contention.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }
  
  
  private ResourceApplyAdagradDa(Operation operation) {
    super(operation);
  }
}
