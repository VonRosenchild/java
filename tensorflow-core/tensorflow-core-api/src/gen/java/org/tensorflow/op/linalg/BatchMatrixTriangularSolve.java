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

package org.tensorflow.op.linalg;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "linalg")
public final class BatchMatrixTriangularSolve<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.linalg.BatchMatrixTriangularSolve}
   */
  public static class Options {
    
    /**
     * @param lower 
     */
    public Options lower(Boolean lower) {
      this.lower = lower;
      return this;
    }
    
    /**
     * @param adjoint 
     */
    public Options adjoint(Boolean adjoint) {
      this.adjoint = adjoint;
      return this;
    }
    
    private Boolean lower;
    private Boolean adjoint;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new BatchMatrixTriangularSolve operation.
   * 
   * @param scope current scope
   * @param matrix 
   * @param rhs 
   * @param options carries optional attributes values
   * @return a new instance of BatchMatrixTriangularSolve
   */
  public static <T extends Number> BatchMatrixTriangularSolve<T> create(Scope scope, Operand<T> matrix, Operand<T> rhs, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("BatchMatrixTriangularSolve", scope.makeOpName("BatchMatrixTriangularSolve"));
    opBuilder.addInput(matrix.asOutput());
    opBuilder.addInput(rhs.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.lower != null) {
          opBuilder.setAttr("lower", opts.lower);
        }
        if (opts.adjoint != null) {
          opBuilder.setAttr("adjoint", opts.adjoint);
        }
      }
    }
    return new BatchMatrixTriangularSolve<T>(opBuilder.build());
  }
  
  /**
   * @param lower 
   */
  public static Options lower(Boolean lower) {
    return new Options().lower(lower);
  }
  
  /**
   * @param adjoint 
   */
  public static Options adjoint(Boolean adjoint) {
    return new Options().adjoint(adjoint);
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
  
  private BatchMatrixTriangularSolve(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
