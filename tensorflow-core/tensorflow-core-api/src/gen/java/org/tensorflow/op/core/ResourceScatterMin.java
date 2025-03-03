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

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Reduces sparse updates into the variable referenced by `resource` using the `min` operation.
 * <p>
 * This operation computes
 * <p>
 *     # Scalar indices
 *     ref[indices, ...] = min(ref[indices, ...], updates[...])
 * <p>
 *     # Vector indices (for each i)
 *     ref[indices[i], ...] = min(ref[indices[i], ...], updates[i, ...])
 * <p>
 *     # High rank indices (for each i, ..., j)
 *     ref[indices[i, ..., j], ...] = min(ref[indices[i, ..., j], ...], updates[i, ..., j, ...])
 * <p>
 * Duplicate entries are handled correctly: if multiple `indices` reference
 * the same location, their contributions are combined.
 * <p>
 * Requires `updates.shape = indices.shape + ref.shape[1:]` or `updates.shape = []`.
 * <p>
 * <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 * <img style="width:100%" src='https://www.tensorflow.org/images/ScatterAdd.png' alt>
 * </div>
 */
@Operator
public final class ResourceScatterMin extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new ResourceScatterMin operation.
   * 
   * @param scope current scope
   * @param resource Should be from a `Variable` node.
   * @param indices A tensor of indices into the first dimension of `ref`.
   * @param updates A tensor of updated values to add to `ref`.
   * @return a new instance of ResourceScatterMin
   */
  public static <T extends Number, U> ResourceScatterMin create(Scope scope, Operand<?> resource, Operand<T> indices, Operand<U> updates) {
    OperationBuilder opBuilder = scope.env().opBuilder("ResourceScatterMin", scope.makeOpName("ResourceScatterMin"));
    opBuilder.addInput(resource.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(updates.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ResourceScatterMin(opBuilder.build());
  }
  
  
  private ResourceScatterMin(Operation operation) {
    super(operation);
  }
}
