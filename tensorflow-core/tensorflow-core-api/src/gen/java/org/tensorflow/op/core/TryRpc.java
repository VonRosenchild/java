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
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Perform batches of RPC requests.
 * <p>
 * This op asynchronously performs either a single RPC request, or a batch
 * of requests.  RPC requests are defined by three main parameters:
 * <p>
 *   - `address` (the host+port or BNS address of the request)
 *   - `method` (the method name for the request)
 *   - `request` (the serialized proto string, or vector of strings,
 *      of the RPC request argument).
 * <p>
 * For example, if you have an RPC service running on port localhost:2345,
 * and its interface is configured with the following proto declaration:
 * <pre>{@code
 * service MyService {
 *   rpc MyMethod(MyRequestProto) returns (MyResponseProto) {
 *   }
 * };
 * }</pre>
 * then call this op with arguments:
 * <pre>{@code
 * address = "localhost:2345"
 * method = "MyService/MyMethod"
 * }</pre>
 * The `request` tensor is a string tensor representing serialized `MyRequestProto`
 * strings; and the output string tensor `response` will have the same shape
 * and contain (upon successful completion) corresponding serialized
 * `MyResponseProto` strings.
 * <p>
 * For example, to send a single, empty, `MyRequestProto`, call
 * this op with `request = ""`.  To send 5 <b>parallel</b> empty requests,
 * call this op with `request = ["", "", "", "", ""]`.
 * <p>
 * More generally, one can create a batch of `MyRequestProto` serialized protos
 * from regular batched tensors using the `encode_proto` op, and convert
 * the response `MyResponseProto` serialized protos to batched tensors
 * using the `decode_proto` op.
 * <p>
 * <b>NOTE</b> Working with serialized proto strings is faster than instantiating
 * actual proto objects in memory, so no performance degradation is expected
 * compared to writing custom kernels for this workflow.
 * <p>
 * Unlike the standard `Rpc` op, if the connection fails or the remote worker
 * returns an error status, this op does <b>not</b> reraise the exception.
 * Instead, the `status_code` and `status_message` entry for the corresponding RPC
 * call is set with the error returned from the RPC call.  The `response` tensor
 * will contain valid response values for those minibatch entries whose RPCs did
 * not fail; the rest of the entries will have empty strings.
 */
@Operator
public final class TryRpc extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.TryRpc}
   */
  public static class Options {
    
    /**
     * @param protocol RPC protocol to use.  Empty string means use the default protocol.
     * Options include 'grpc'.
     */
    public Options protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
    
    /**
     * @param failFast `boolean`. If `true` (default), then failures to connect
     * (i.e., the server does not immediately respond) cause an RPC failure.
     */
    public Options failFast(Boolean failFast) {
      this.failFast = failFast;
      return this;
    }
    
    /**
     * @param timeoutInMs `int`. If `0` (default), then the kernel will run the RPC
     * request and only time out if the RPC deadline passes or the session times out.
     * If this value is greater than `0`, then the op will raise an exception if
     * the RPC takes longer than `timeout_in_ms`.
     */
    public Options timeoutInMs(Long timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      return this;
    }
    
    private String protocol;
    private Boolean failFast;
    private Long timeoutInMs;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new TryRpc operation.
   * 
   * @param scope current scope
   * @param address `0-D` or `1-D`.  The address (i.e. host_name:port) of the RPC server.
   * If this tensor has more than 1 element, then multiple parallel rpc requests
   * are sent.  This argument broadcasts with `method` and `request`.
   * @param method `0-D` or `1-D`.  The method address on the RPC server.
   * If this tensor has more than 1 element, then multiple parallel rpc requests
   * are sent.  This argument broadcasts with `address` and `request`.
   * @param request `0-D` or `1-D`.  Serialized proto strings: the rpc request argument.
   * If this tensor has more than 1 element, then multiple parallel rpc requests
   * are sent.  This argument broadcasts with `address` and `method`.
   * @param options carries optional attributes values
   * @return a new instance of TryRpc
   */
  public static TryRpc create(Scope scope, Operand<String> address, Operand<String> method, Operand<String> request, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("TryRpc", scope.makeOpName("TryRpc"));
    opBuilder.addInput(address.asOutput());
    opBuilder.addInput(method.asOutput());
    opBuilder.addInput(request.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.protocol != null) {
          opBuilder.setAttr("protocol", opts.protocol);
        }
        if (opts.failFast != null) {
          opBuilder.setAttr("fail_fast", opts.failFast);
        }
        if (opts.timeoutInMs != null) {
          opBuilder.setAttr("timeout_in_ms", opts.timeoutInMs);
        }
      }
    }
    return new TryRpc(opBuilder.build());
  }
  
  /**
   * @param protocol RPC protocol to use.  Empty string means use the default protocol.
   * Options include 'grpc'.
   */
  public static Options protocol(String protocol) {
    return new Options().protocol(protocol);
  }
  
  /**
   * @param failFast `boolean`. If `true` (default), then failures to connect
   * (i.e., the server does not immediately respond) cause an RPC failure.
   */
  public static Options failFast(Boolean failFast) {
    return new Options().failFast(failFast);
  }
  
  /**
   * @param timeoutInMs `int`. If `0` (default), then the kernel will run the RPC
   * request and only time out if the RPC deadline passes or the session times out.
   * If this value is greater than `0`, then the op will raise an exception if
   * the RPC takes longer than `timeout_in_ms`.
   */
  public static Options timeoutInMs(Long timeoutInMs) {
    return new Options().timeoutInMs(timeoutInMs);
  }
  
  /**
   * Same shape as `request`. Serialized proto strings: the rpc responses.
   */
  public Output<String> response() {
    return response;
  }
  
  /**
   * Same shape as `request`.  Values correspond to tensorflow Status enum codes.
   */
  public Output<Integer> statusCode() {
    return statusCode;
  }
  
  /**
   * Same shape as `request`.  Values correspond to Status messages
   * returned from the RPC calls.
   */
  public Output<String> statusMessage() {
    return statusMessage;
  }
  
  private Output<String> response;
  private Output<Integer> statusCode;
  private Output<String> statusMessage;
  
  private TryRpc(Operation operation) {
    super(operation);
    int outputIdx = 0;
    response = operation.output(outputIdx++);
    statusCode = operation.output(outputIdx++);
    statusMessage = operation.output(outputIdx++);
  }
}
