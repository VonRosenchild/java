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

import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Stage (key, values) in the underlying container which behaves like a hashtable.
 */
@Operator
public final class MapStage extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.MapStage}
   */
  public static class Options {
    
    /**
     * @param capacity Maximum number of elements in the Staging Area. If > 0, inserts
     * on the container will block when the capacity is reached.
     */
    public Options capacity(Long capacity) {
      this.capacity = capacity;
      return this;
    }
    
    /**
     * @param memoryLimit 
     */
    public Options memoryLimit(Long memoryLimit) {
      this.memoryLimit = memoryLimit;
      return this;
    }
    
    /**
     * @param container If non-empty, this queue is placed in the given container. Otherwise,
     * a default container is used.
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }
    
    /**
     * @param sharedName It is necessary to match this name to the matching Unstage Op.
     */
    public Options sharedName(String sharedName) {
      this.sharedName = sharedName;
      return this;
    }
    
    private Long capacity;
    private Long memoryLimit;
    private String container;
    private String sharedName;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new MapStage operation.
   * 
   * @param scope current scope
   * @param key int64
   * @param indices 
   * @param values a list of tensors
   * dtypes A list of data types that inserted values should adhere to.
   * @param dtypes 
   * @param options carries optional attributes values
   * @return a new instance of MapStage
   */
  public static MapStage create(Scope scope, Operand<Long> key, Operand<Integer> indices, Iterable<Operand<?>> values, List<Class<?>> dtypes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("MapStage", scope.makeOpName("MapStage"));
    opBuilder.addInput(key.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInputList(Operands.asOutputs(values));
    opBuilder = scope.applyControlDependencies(opBuilder);
    DataType[] dtypesArray = new DataType[dtypes.size()];
    for (int i = 0; i < dtypesArray.length; ++i) {
      dtypesArray[i] = DataType.fromClass(dtypes.get(i));
    }
    opBuilder.setAttr("dtypes", dtypesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.capacity != null) {
          opBuilder.setAttr("capacity", opts.capacity);
        }
        if (opts.memoryLimit != null) {
          opBuilder.setAttr("memory_limit", opts.memoryLimit);
        }
        if (opts.container != null) {
          opBuilder.setAttr("container", opts.container);
        }
        if (opts.sharedName != null) {
          opBuilder.setAttr("shared_name", opts.sharedName);
        }
      }
    }
    return new MapStage(opBuilder.build());
  }
  
  /**
   * @param capacity Maximum number of elements in the Staging Area. If > 0, inserts
   * on the container will block when the capacity is reached.
   */
  public static Options capacity(Long capacity) {
    return new Options().capacity(capacity);
  }
  
  /**
   * @param memoryLimit 
   */
  public static Options memoryLimit(Long memoryLimit) {
    return new Options().memoryLimit(memoryLimit);
  }
  
  /**
   * @param container If non-empty, this queue is placed in the given container. Otherwise,
   * a default container is used.
   */
  public static Options container(String container) {
    return new Options().container(container);
  }
  
  /**
   * @param sharedName It is necessary to match this name to the matching Unstage Op.
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }
  
  
  private MapStage(Operation operation) {
    super(operation);
  }
}
