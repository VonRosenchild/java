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

package org.tensorflow.op.sparse;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the element-wise max of two SparseTensors.
 * <p>
 * Assumes the two SparseTensors have the same shape, i.e., no broadcasting.
 * 
 * @param <T> data type for {@code outputValues()} output
 */
@Operator(group = "sparse")
public final class SparseSparseMaximum<T extends Number> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new SparseSparseMaximum operation.
   * 
   * @param scope current scope
   * @param aIndices 2-D.  `N x R` matrix with the indices of non-empty values in a
   * SparseTensor, in the canonical lexicographic ordering.
   * @param aValues 1-D.  `N` non-empty values corresponding to `a_indices`.
   * @param aShape 1-D.  Shape of the input SparseTensor.
   * @param bIndices counterpart to `a_indices` for the other operand.
   * @param bValues counterpart to `a_values` for the other operand; must be of the same dtype.
   * @param bShape counterpart to `a_shape` for the other operand; the two shapes must be equal.
   * @return a new instance of SparseSparseMaximum
   */
  public static <T extends Number> SparseSparseMaximum<T> create(Scope scope, Operand<Long> aIndices, Operand<T> aValues, Operand<Long> aShape, Operand<Long> bIndices, Operand<T> bValues, Operand<Long> bShape) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseSparseMaximum", scope.makeOpName("SparseSparseMaximum"));
    opBuilder.addInput(aIndices.asOutput());
    opBuilder.addInput(aValues.asOutput());
    opBuilder.addInput(aShape.asOutput());
    opBuilder.addInput(bIndices.asOutput());
    opBuilder.addInput(bValues.asOutput());
    opBuilder.addInput(bShape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new SparseSparseMaximum<T>(opBuilder.build());
  }
  
  /**
   * 2-D.  The indices of the output SparseTensor.
   */
  public Output<Long> outputIndices() {
    return outputIndices;
  }
  
  /**
   * 1-D.  The values of the output SparseTensor.
   */
  public Output<T> outputValues() {
    return outputValues;
  }
  
  private Output<Long> outputIndices;
  private Output<T> outputValues;
  
  private SparseSparseMaximum(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputIndices = operation.output(outputIdx++);
    outputValues = operation.output(outputIdx++);
  }
}
