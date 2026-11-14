package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public abstract class cr4 {
    static {
        a(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    public static void a(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            qp2.o("invalid input length");
        } else {
            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            intBufferAsIntBuffer.get(new int[intBufferAsIntBuffer.remaining()]);
        }
    }
}
