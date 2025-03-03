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

/**
 * Removes keys and its associated values from a table.
 * <p>
 * The tensor `keys` must of the same type as the keys of the table. Keys not
 * already in the table are silently ignored.
 */
public final class LookupTableRemove extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new LookupTableRemove operation.
   * 
   * @param scope current scope
   * @param tableHandle Handle to the table.
   * @param keys Any shape.  Keys of the elements to remove.
   * @return a new instance of LookupTableRemove
   */
  public static <T> LookupTableRemove create(Scope scope, Operand<?> tableHandle, Operand<T> keys) {
    OperationBuilder opBuilder = scope.env().opBuilder("LookupTableRemoveV2", scope.makeOpName("LookupTableRemove"));
    opBuilder.addInput(tableHandle.asOutput());
    opBuilder.addInput(keys.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new LookupTableRemove(opBuilder.build());
  }
  
  
  private LookupTableRemove(Operation operation) {
    super(operation);
  }
}
