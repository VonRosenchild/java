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

package org.tensorflow.op.io;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * A Reader that outputs the records from a TensorFlow Records file.
 */
@Operator(group = "io")
public final class TfRecordReader extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.io.TfRecordReader}
   */
  public static class Options {
    
    /**
     * @param container If non-empty, this reader is placed in the given container.
     * Otherwise, a default container is used.
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }
    
    /**
     * @param sharedName If non-empty, this reader is named in the given bucket
     * with this shared_name. Otherwise, the node name is used instead.
     */
    public Options sharedName(String sharedName) {
      this.sharedName = sharedName;
      return this;
    }
    
    /**
     * @param compressionType 
     */
    public Options compressionType(String compressionType) {
      this.compressionType = compressionType;
      return this;
    }
    
    private String container;
    private String sharedName;
    private String compressionType;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new TfRecordReader operation.
   * 
   * @param scope current scope
   * @param options carries optional attributes values
   * @return a new instance of TfRecordReader
   */
  public static TfRecordReader create(Scope scope, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("TFRecordReaderV2", scope.makeOpName("TfRecordReader"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.container != null) {
          opBuilder.setAttr("container", opts.container);
        }
        if (opts.sharedName != null) {
          opBuilder.setAttr("shared_name", opts.sharedName);
        }
        if (opts.compressionType != null) {
          opBuilder.setAttr("compression_type", opts.compressionType);
        }
      }
    }
    return new TfRecordReader(opBuilder.build());
  }
  
  /**
   * @param container If non-empty, this reader is placed in the given container.
   * Otherwise, a default container is used.
   */
  public static Options container(String container) {
    return new Options().container(container);
  }
  
  /**
   * @param sharedName If non-empty, this reader is named in the given bucket
   * with this shared_name. Otherwise, the node name is used instead.
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }
  
  /**
   * @param compressionType 
   */
  public static Options compressionType(String compressionType) {
    return new Options().compressionType(compressionType);
  }
  
  /**
   * The handle to reference the Reader.
   */
  public Output<?> readerHandle() {
    return readerHandle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) readerHandle;
  }
  
  private Output<?> readerHandle;
  
  private TfRecordReader(Operation operation) {
    super(operation);
    int outputIdx = 0;
    readerHandle = operation.output(outputIdx++);
  }
}
