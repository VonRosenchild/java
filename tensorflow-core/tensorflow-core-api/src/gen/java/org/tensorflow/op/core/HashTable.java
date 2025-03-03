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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Creates a non-initialized hash table.
 * <p>
 * This op creates a hash table, specifying the type of its keys and values.
 * Before using the table you will have to initialize it.  After initialization the
 * table will be immutable.
 */
@Operator
public final class HashTable extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.HashTable}
   */
  public static class Options {
    
    /**
     * @param container If non-empty, this table is placed in the given container.
     * Otherwise, a default container is used.
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }
    
    /**
     * @param sharedName If non-empty, this table is shared under the given name across
     * multiple sessions.
     */
    public Options sharedName(String sharedName) {
      this.sharedName = sharedName;
      return this;
    }
    
    /**
     * @param useNodeNameSharing If true and shared_name is empty, the table is shared
     * using the node name.
     */
    public Options useNodeNameSharing(Boolean useNodeNameSharing) {
      this.useNodeNameSharing = useNodeNameSharing;
      return this;
    }
    
    private String container;
    private String sharedName;
    private Boolean useNodeNameSharing;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new HashTable operation.
   * 
   * @param scope current scope
   * @param keyDtype Type of the table keys.
   * @param valueDtype Type of the table values.
   * @param options carries optional attributes values
   * @return a new instance of HashTable
   */
  public static <T, U> HashTable create(Scope scope, Class<T> keyDtype, Class<U> valueDtype, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("HashTableV2", scope.makeOpName("HashTable"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("key_dtype", DataType.fromClass(keyDtype));
    opBuilder.setAttr("value_dtype", DataType.fromClass(valueDtype));
    if (options != null) {
      for (Options opts : options) {
        if (opts.container != null) {
          opBuilder.setAttr("container", opts.container);
        }
        if (opts.sharedName != null) {
          opBuilder.setAttr("shared_name", opts.sharedName);
        }
        if (opts.useNodeNameSharing != null) {
          opBuilder.setAttr("use_node_name_sharing", opts.useNodeNameSharing);
        }
      }
    }
    return new HashTable(opBuilder.build());
  }
  
  /**
   * @param container If non-empty, this table is placed in the given container.
   * Otherwise, a default container is used.
   */
  public static Options container(String container) {
    return new Options().container(container);
  }
  
  /**
   * @param sharedName If non-empty, this table is shared under the given name across
   * multiple sessions.
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }
  
  /**
   * @param useNodeNameSharing If true and shared_name is empty, the table is shared
   * using the node name.
   */
  public static Options useNodeNameSharing(Boolean useNodeNameSharing) {
    return new Options().useNodeNameSharing(useNodeNameSharing);
  }
  
  /**
   * Handle to a table.
   */
  public Output<?> tableHandle() {
    return tableHandle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) tableHandle;
  }
  
  private Output<?> tableHandle;
  
  private HashTable(Operation operation) {
    super(operation);
    int outputIdx = 0;
    tableHandle = operation.output(outputIdx++);
  }
}
