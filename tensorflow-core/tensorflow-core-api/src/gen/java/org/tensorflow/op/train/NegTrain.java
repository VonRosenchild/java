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

package org.tensorflow.op.train;

import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Training via negative sampling.
 */
@Operator(group = "train")
public final class NegTrain extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new NegTrain operation.
   * 
   * @param scope current scope
   * @param wIn input word embedding.
   * @param wOut output word embedding.
   * @param examples A vector of word ids.
   * @param labels A vector of word ids.
   * @param lr 
   * @param vocabCount Count of words in the vocabulary.
   * @param numNegativeSamples Number of negative samples per example.
   * @return a new instance of NegTrain
   */
  public static NegTrain create(Scope scope, Operand<Float> wIn, Operand<Float> wOut, Operand<Integer> examples, Operand<Integer> labels, Operand<Float> lr, List<Long> vocabCount, Long numNegativeSamples) {
    OperationBuilder opBuilder = scope.env().opBuilder("NegTrain", scope.makeOpName("NegTrain"));
    opBuilder.addInput(wIn.asOutput());
    opBuilder.addInput(wOut.asOutput());
    opBuilder.addInput(examples.asOutput());
    opBuilder.addInput(labels.asOutput());
    opBuilder.addInput(lr.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    long[] vocabCountArray = new long[vocabCount.size()];
    for (int i = 0; i < vocabCountArray.length; ++i) {
      vocabCountArray[i] = vocabCount.get(i);
    }
    opBuilder.setAttr("vocab_count", vocabCountArray);
    opBuilder.setAttr("num_negative_samples", numNegativeSamples);
    return new NegTrain(opBuilder.build());
  }
  
  
  private NegTrain(Operation operation) {
    super(operation);
  }
}
