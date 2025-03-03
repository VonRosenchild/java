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
import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Op removes and returns the (key, value) element with the smallest
 * <p>
 * key from the underlying container.   If the underlying container
 * does not contain elements, the op will block until it does.
 */
@Operator
public final class OrderedMapUnstageNoKey extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.OrderedMapUnstageNoKey}
   */
  public static class Options {
    
    /**
     * @param capacity 
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
     * @param container 
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }
    
    /**
     * @param sharedName 
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
   * Factory method to create a class wrapping a new OrderedMapUnstageNoKey operation.
   * 
   * @param scope current scope
   * @param indices 
   * @param dtypes 
   * @param options carries optional attributes values
   * @return a new instance of OrderedMapUnstageNoKey
   */
  public static OrderedMapUnstageNoKey create(Scope scope, Operand<Integer> indices, List<Class<?>> dtypes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("OrderedMapUnstageNoKey", scope.makeOpName("OrderedMapUnstageNoKey"));
    opBuilder.addInput(indices.asOutput());
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
    return new OrderedMapUnstageNoKey(opBuilder.build());
  }
  
  /**
   * @param capacity 
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
   * @param container 
   */
  public static Options container(String container) {
    return new Options().container(container);
  }
  
  /**
   * @param sharedName 
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }
  
  /**
   */
  public Output<Long> key() {
    return key;
  }
  
  /**
   */
  public List<Output<?>> values() {
    return values;
  }
  
  private Output<Long> key;
  private List<Output<?>> values;
  
  private OrderedMapUnstageNoKey(Operation operation) {
    super(operation);
    int outputIdx = 0;
    key = operation.output(outputIdx++);
    int valuesLength = operation.outputListLength("values");
    values = Arrays.asList(operation.outputList(outputIdx, valuesLength));
    outputIdx += valuesLength;
  }
}
