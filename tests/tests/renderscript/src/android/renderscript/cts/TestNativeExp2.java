/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Don't edit this file!  It is auto-generated by frameworks/rs/api/gen_runtime.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestNativeExp2 extends RSBaseCompute {

    private ScriptC_TestNativeExp2 script;
    private ScriptC_TestNativeExp2Relaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestNativeExp2(mRS);
        scriptRelaxed = new ScriptC_TestNativeExp2Relaxed(mRS);
    }

    private void checkNativeExp2FloatFloat() {
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xd87a6eb24c6a2bc5l, -125, 125);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.forEach_testNativeExp2FloatFloat(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2FloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.forEach_testNativeExp2FloatFloat(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2FloatFloat: " + e.toString());
        }
    }

    private void checkNativeExp2Float2Float2() {
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x8c243b10af5062c1l, -125, 125);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.forEach_testNativeExp2Float2Float2(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.forEach_testNativeExp2Float2Float2(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2Float2Float2: " + e.toString());
        }
    }

    private void checkNativeExp2Float3Float3() {
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x8c26042ba56b839fl, -125, 125);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.forEach_testNativeExp2Float3Float3(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.forEach_testNativeExp2Float3Float3(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2Float3Float3: " + e.toString());
        }
    }

    private void checkNativeExp2Float4Float4() {
        Allocation inV = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x8c27cd469b86a47dl, -125, 125);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.forEach_testNativeExp2Float4Float4(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.forEach_testNativeExp2Float4Float4(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativeExp2Float4Float4: " + e.toString());
        }
    }

    public void testNativeExp2() {
        checkNativeExp2FloatFloat();
        checkNativeExp2Float2Float2();
        checkNativeExp2Float3Float3();
        checkNativeExp2Float4Float4();
    }
}