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

package org.tensorflow.op.data;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Writes the given dataset to the given file using the TFRecord format.
 */
public final class DatasetToTfRecord extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new DatasetToTfRecord operation.
   * 
   * @param scope current scope
   * @param inputDataset A variant tensor representing the dataset to write.
   * @param filename A scalar string tensor representing the filename to use.
   * @param compressionType A scalar string tensor containing either (i) the empty string (no
   * compression), (ii) "ZLIB", or (iii) "GZIP".
   * @return a new instance of DatasetToTfRecord
   */
  public static DatasetToTfRecord create(Scope scope, Operand<?> inputDataset, Operand<String> filename, Operand<String> compressionType) {
    OperationBuilder opBuilder = scope.env().opBuilder("DatasetToTFRecord", scope.makeOpName("DatasetToTfRecord"));
    opBuilder.addInput(inputDataset.asOutput());
    opBuilder.addInput(filename.asOutput());
    opBuilder.addInput(compressionType.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new DatasetToTfRecord(opBuilder.build());
  }
  
  
  private DatasetToTfRecord(Operation operation) {
    super(operation);
  }
}
