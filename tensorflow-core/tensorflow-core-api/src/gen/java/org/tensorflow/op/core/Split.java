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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Splits a tensor into `num_split` tensors along one dimension.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class Split<T> extends PrimitiveOp implements Iterable<Operand<T>> {
  
  /**
   * Factory method to create a class wrapping a new Split operation.
   * 
   * @param scope current scope
   * @param axis 0-D.  The dimension along which to split.  Must be in the range
   * `[-rank(value), rank(value))`.
   * @param value The tensor to split.
   * @param numSplit The number of ways to split.  Must evenly divide
   * `value.shape[split_dim]`.
   * @return a new instance of Split
   */
  public static <T> Split<T> create(Scope scope, Operand<Integer> axis, Operand<T> value, Long numSplit) {
    OperationBuilder opBuilder = scope.env().opBuilder("Split", scope.makeOpName("Split"));
    opBuilder.addInput(axis.asOutput());
    opBuilder.addInput(value.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_split", numSplit);
    return new Split<T>(opBuilder.build());
  }
  
  /**
   * They are identically shaped tensors, whose shape matches that of `value`
   * except along `axis`, where their sizes are
   * `values.shape[split_dim] / num_split`.
   */
  public List<Output<T>> output() {
    return output;
  }
  
  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<T>> iterator() {
    return (Iterator) output.iterator();
  }
  
  private List<Output<T>> output;
  
  @SuppressWarnings("unchecked")
  private Split(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int outputLength = operation.outputListLength("output");
    output = Arrays.asList((Output<T>[])operation.outputList(outputIdx, outputLength));
    outputIdx += outputLength;
  }
}
