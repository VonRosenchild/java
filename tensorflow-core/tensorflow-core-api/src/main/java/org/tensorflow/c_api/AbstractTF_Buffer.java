/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */

package org.tensorflow.c_api;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.Properties;

import static org.tensorflow.c_api.global.tensorflow.*;

@Properties(inherit = org.tensorflow.c_api.presets.tensorflow.class)
public abstract class AbstractTF_Buffer extends Pointer {
    protected static class DeleteDeallocator extends TF_Buffer implements Pointer.Deallocator {
        DeleteDeallocator(TF_Buffer s) { super(s); }
        @Override public void deallocate() { if (!isNull()) TF_DeleteBuffer(this); setNull(); }
    }

    public AbstractTF_Buffer(Pointer p) { super(p); }

    /**
     * Calls TF_NewBuffer(), and registers a deallocator.
     * @return TF_Buffer created. Do not call TF_DeleteBuffer() on it.
     */
    public static TF_Buffer newBuffer() {
        TF_Buffer b = TF_NewBuffer();
        if (b != null) {
            b.deallocator(new DeleteDeallocator(b));
        }
        return b;
    }

    /** Returns {@code newBufferFromString(new BytePointer(proto)). */
    public static TF_Buffer newBufferFromString(byte[] proto) {
        return newBufferFromString(new BytePointer(proto));
    }

    /**
     * Calls TF_NewBufferFromString(), and registers a deallocator.
     * @return TF_Buffer created. Do not call TF_DeleteBuffer() on it.
     */
    public static TF_Buffer newBufferFromString(Pointer proto) {
        TF_Buffer b = TF_NewBufferFromString(proto, proto.limit());
        if (b != null) {
            b.deallocator(new DeleteDeallocator(b));
        }
        return b;
    }

    /**
     * Calls the deallocator, if registered, otherwise has no effect.
     */
    public void delete() {
        deallocate();
    }
}
