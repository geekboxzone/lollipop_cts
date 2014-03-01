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

public class TestAtanh extends RSBaseCompute {

    private ScriptC_TestAtanh script;
    private ScriptC_TestAtanhRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestAtanh(mRS);
        scriptRelaxed = new ScriptC_TestAtanhRelaxed(mRS);
    }

    public class ArgumentsFloatFloat {
        public float in;
        public float out;

        public int ulf;
        public int ulfRelaxed;
    }

    private void checkAtanhFloatFloat() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xe67990a4b91d5f55l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.forEach_testAtanhFloatFloat(in, out);
            verifyResultsAtanhFloatFloat(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.forEach_testAtanhFloatFloat(in, out);
            verifyResultsAtanhFloatFloat(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsAtanhFloatFloat(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 1];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i];
                // Figure out what the outputs should have been.
                CoreMathVerifier.computeAtanh(args);
                int ulf = relaxed ? args.ulfRelaxed : args.ulf;
                // Figure out what the outputs should have been.
                boolean valid = true;
                int neededUlf = 0;
                neededUlf = (int) (Math.abs(args.out - arrayOut[i * 1 + j]) / Math.ulp(args.out) + 0.5);
                if (neededUlf > ulf) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append(String.format("Input in: %14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append(String.format("Expected output out: %14.8g %8x %15a",
                            args.out, Float.floatToRawIntBits(args.out), args.out));
                    message.append("\n");
                    message.append(String.format("Actual   output out: %14.8g %8x %15a",
                            arrayOut[i * 1 + j], Float.floatToRawIntBits(arrayOut[i * 1 + j]), arrayOut[i * 1 + j]));
                    neededUlf = (int) (Math.abs(args.out - arrayOut[i * 1 + j]) / Math.ulp(args.out) + 0.5);
                    if (neededUlf > ulf) {
                        message.append(String.format(" FAILED, ulf needed %d, specified %d", neededUlf, ulf));
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtanhFloatFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkAtanhFloat2Float2() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xa404d7b8b65e0809l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.forEach_testAtanhFloat2Float2(in, out);
            verifyResultsAtanhFloat2Float2(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloat2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.forEach_testAtanhFloat2Float2(in, out);
            verifyResultsAtanhFloat2Float2(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloat2Float2: " + e.toString());
        }
    }

    private void verifyResultsAtanhFloat2Float2(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 2];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i * 2 + j];
                // Figure out what the outputs should have been.
                CoreMathVerifier.computeAtanh(args);
                int ulf = relaxed ? args.ulfRelaxed : args.ulf;
                // Figure out what the outputs should have been.
                boolean valid = true;
                int neededUlf = 0;
                neededUlf = (int) (Math.abs(args.out - arrayOut[i * 2 + j]) / Math.ulp(args.out) + 0.5);
                if (neededUlf > ulf) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append(String.format("Input in: %14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append(String.format("Expected output out: %14.8g %8x %15a",
                            args.out, Float.floatToRawIntBits(args.out), args.out));
                    message.append("\n");
                    message.append(String.format("Actual   output out: %14.8g %8x %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    neededUlf = (int) (Math.abs(args.out - arrayOut[i * 2 + j]) / Math.ulp(args.out) + 0.5);
                    if (neededUlf > ulf) {
                        message.append(String.format(" FAILED, ulf needed %d, specified %d", neededUlf, ulf));
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtanhFloat2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkAtanhFloat3Float3() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0xa404e25a15649da3l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.forEach_testAtanhFloat3Float3(in, out);
            verifyResultsAtanhFloat3Float3(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloat3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.forEach_testAtanhFloat3Float3(in, out);
            verifyResultsAtanhFloat3Float3(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloat3Float3: " + e.toString());
        }
    }

    private void verifyResultsAtanhFloat3Float3(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 4];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i * 4 + j];
                // Figure out what the outputs should have been.
                CoreMathVerifier.computeAtanh(args);
                int ulf = relaxed ? args.ulfRelaxed : args.ulf;
                // Figure out what the outputs should have been.
                boolean valid = true;
                int neededUlf = 0;
                neededUlf = (int) (Math.abs(args.out - arrayOut[i * 4 + j]) / Math.ulp(args.out) + 0.5);
                if (neededUlf > ulf) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append(String.format("Input in: %14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append(String.format("Expected output out: %14.8g %8x %15a",
                            args.out, Float.floatToRawIntBits(args.out), args.out));
                    message.append("\n");
                    message.append(String.format("Actual   output out: %14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    neededUlf = (int) (Math.abs(args.out - arrayOut[i * 4 + j]) / Math.ulp(args.out) + 0.5);
                    if (neededUlf > ulf) {
                        message.append(String.format(" FAILED, ulf needed %d, specified %d", neededUlf, ulf));
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtanhFloat3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkAtanhFloat4Float4() {
        Allocation in = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xa404ecfb746b333dl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.forEach_testAtanhFloat4Float4(in, out);
            verifyResultsAtanhFloat4Float4(in, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloat4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.forEach_testAtanhFloat4Float4(in, out);
            verifyResultsAtanhFloat4Float4(in, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtanhFloat4Float4: " + e.toString());
        }
    }

    private void verifyResultsAtanhFloat4Float4(Allocation in, Allocation out, boolean relaxed) {
        float[] arrayIn = new float[INPUTSIZE * 4];
        in.copyTo(arrayIn);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloat args = new ArgumentsFloatFloat();
                args.in = arrayIn[i * 4 + j];
                // Figure out what the outputs should have been.
                CoreMathVerifier.computeAtanh(args);
                int ulf = relaxed ? args.ulfRelaxed : args.ulf;
                // Figure out what the outputs should have been.
                boolean valid = true;
                int neededUlf = 0;
                neededUlf = (int) (Math.abs(args.out - arrayOut[i * 4 + j]) / Math.ulp(args.out) + 0.5);
                if (neededUlf > ulf) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append(String.format("Input in: %14.8g %8x %15a",
                            args.in, Float.floatToRawIntBits(args.in), args.in));
                    message.append("\n");
                    message.append(String.format("Expected output out: %14.8g %8x %15a",
                            args.out, Float.floatToRawIntBits(args.out), args.out));
                    message.append("\n");
                    message.append(String.format("Actual   output out: %14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    neededUlf = (int) (Math.abs(args.out - arrayOut[i * 4 + j]) / Math.ulp(args.out) + 0.5);
                    if (neededUlf > ulf) {
                        message.append(String.format(" FAILED, ulf needed %d, specified %d", neededUlf, ulf));
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtanhFloat4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testAtanh() {
        checkAtanhFloatFloat();
        checkAtanhFloat2Float2();
        checkAtanhFloat3Float3();
        checkAtanhFloat4Float4();
    }
}