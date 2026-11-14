package org.chromium.ui.xr.scenecore;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class XrMeshData {
    public final ByteBuffer a;
    public final ByteBuffer b;
    public final ByteBuffer c;

    public XrMeshData(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer.remaining() == 0) {
            this.a = null;
            this.b = null;
            this.c = null;
            return;
        }
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
        int iRemaining = floatBufferAsFloatBuffer.remaining();
        if (iRemaining % 5 != 0) {
            qp2.o("interleavedVertices length must be a multiple of 5");
            throw null;
        }
        int i3 = iRemaining / 5;
        int iRemaining2 = byteBuffer2 != null ? byteBuffer2.remaining() / 4 : 0;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3 * 12).order(ByteOrder.nativeOrder());
        this.a = byteBufferOrder;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocateDirect(i3 << 3).order(ByteOrder.nativeOrder());
        this.b = byteBufferOrder2;
        this.c = ByteBuffer.allocateDirect(iRemaining2 << 2).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferOrder.asFloatBuffer();
        FloatBuffer floatBufferAsFloatBuffer3 = byteBufferOrder2.asFloatBuffer();
        for (int i4 = 0; i4 < i3; i4++) {
            floatBufferAsFloatBuffer2.put(floatBufferAsFloatBuffer.get());
            floatBufferAsFloatBuffer2.put(floatBufferAsFloatBuffer.get());
            floatBufferAsFloatBuffer2.put(floatBufferAsFloatBuffer.get());
            floatBufferAsFloatBuffer3.put(floatBufferAsFloatBuffer.get());
            floatBufferAsFloatBuffer3.put(floatBufferAsFloatBuffer.get());
        }
        this.a.rewind();
        this.b.rewind();
        ByteBuffer byteBuffer3 = this.c;
        if (byteBuffer3 == null || byteBuffer2 == null) {
            return;
        }
        byteBuffer3.put(byteBuffer2.order(ByteOrder.nativeOrder()));
        this.c.rewind();
    }

    public static XrMeshData[] createArray(int i) {
        return new XrMeshData[i];
    }
}
