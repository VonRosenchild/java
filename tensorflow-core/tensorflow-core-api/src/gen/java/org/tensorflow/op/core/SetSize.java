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
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Number of unique elements along last dimension of input `set`.
 * <p>
 * Input `set` is a `SparseTensor` represented by `set_indices`, `set_values`,
 * and `set_shape`. The last dimension contains values in a set, duplicates are
 * allowed but ignored.
 * <p>
 * If `validate_indices` is `True`, this op validates the order and range of `set`
 * indices.
 */
@Operator
public final class SetSize extends PrimitiveOp implements Operand<Integer> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.SetSize}
   */
  public static class Options {
    
    /**
     * @param validateIndices 
     */
    public Options validateIndices(Boolean validateIndices) {
      this.validateIndices = validateIndices;
      return this;
    }
    
    private Boolean validateIndices;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new SetSize operation.
   * 
   * @param scope current scope
   * @param setIndices 2D `Tensor`, indices of a `SparseTensor`.
   * @param setValues 1D `Tensor`, values of a `SparseTensor`.
   * @param setShape 1D `Tensor`, shape of a `SparseTensor`.
   * @param options carries optional attributes values
   * @return a new instance of SetSize
   */
  public static <T> SetSize create(Scope scope, Operand<Long> setIndices, Operand<T> setValues, Operand<Long> setShape, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("SetSize", scope.makeOpName("SetSize"));
    opBuilder.addInput(setIndices.asOutput());
    opBuilder.addInput(setValues.asOutput());
    opBuilder.addInput(setShape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.validateIndices != null) {
          opBuilder.setAttr("validate_indices", opts.validateIndices);
        }
      }
    }
    return new SetSize(opBuilder.build());
  }
  
  /**
   * @param validateIndices 
   */
  public static Options validateIndices(Boolean validateIndices) {
    return new Options().validateIndices(validateIndices);
  }
  
  /**
   * For `set` ranked `n`, this is a `Tensor` with rank `n-1`, and the same 1st
   * `n-1` dimensions as `set`. Each value is the number of unique elements in
   * the corresponding `[0...n-1]` dimension of `set`.
   */
  public Output<Integer> size() {
    return size;
  }
  
  @Override
  public Output<Integer> asOutput() {
    return size;
  }
  
  private Output<Integer> size;
  
  private SetSize(Operation operation) {
    super(operation);
    int outputIdx = 0;
    size = operation.output(outputIdx++);
  }
}
