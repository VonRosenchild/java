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
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns shape of tensors.
 * <p>
 * This operation returns N 1-D integer tensors representing shape of `input[i]s`.
 * 
 * @param <U> data type for {@code output()} output
 */
@Operator
public final class ShapeN<U extends Number> extends PrimitiveOp implements Iterable<Operand<U>> {
  
  /**
   * Factory method to create a class wrapping a new ShapeN operation.
   * 
   * @param scope current scope
   * @param input 
   * @param outType 
   * @return a new instance of ShapeN
   */
  public static <U extends Number, T> ShapeN<U> create(Scope scope, Iterable<Operand<T>> input, Class<U> outType) {
    OperationBuilder opBuilder = scope.env().opBuilder("ShapeN", scope.makeOpName("ShapeN"));
    opBuilder.addInputList(Operands.asOutputs(input));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    return new ShapeN<U>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new ShapeN operation using default output types.
   * 
   * @param scope current scope
   * @param input 
   * @return a new instance of ShapeN
   */
  public static <T> ShapeN<Integer> create(Scope scope, Iterable<Operand<T>> input) {
    return create(scope, input, Integer.class);
  }
  
  /**
   */
  public List<Output<U>> output() {
    return output;
  }
  
  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<U>> iterator() {
    return (Iterator) output.iterator();
  }
  
  private List<Output<U>> output;
  
  @SuppressWarnings("unchecked")
  private ShapeN(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int outputLength = operation.outputListLength("output");
    output = Arrays.asList((Output<U>[])operation.outputList(outputIdx, outputLength));
    outputIdx += outputLength;
  }
}
