package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vxd extends t9d {
    public final int d(int i) {
        int iA = a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ((t9d) this).d;
        int i2 = iA + ((t9d) this).a;
        return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
    }

    public final int e() {
        int iA = a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + ((t9d) this).a;
        return ((ByteBuffer) ((t9d) this).d).getInt(((ByteBuffer) ((t9d) this).d).getInt(i) + i);
    }
}
