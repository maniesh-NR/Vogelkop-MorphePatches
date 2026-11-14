package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class wxd extends t9d {
    public final void d(vxd vxdVar, int i) {
        int iA = a(6);
        if (iA != 0) {
            int i2 = iA + ((t9d) this).a;
            int i3 = ((ByteBuffer) ((t9d) this).d).getInt(i2) + i2 + 4 + (i << 2);
            int i4 = ((ByteBuffer) ((t9d) this).d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) ((t9d) this).d;
            ((t9d) vxdVar).d = byteBuffer;
            if (byteBuffer == null) {
                ((t9d) vxdVar).a = 0;
                ((t9d) vxdVar).b = 0;
                ((t9d) vxdVar).c = 0;
            } else {
                ((t9d) vxdVar).a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                ((t9d) vxdVar).b = i5;
                ((t9d) vxdVar).c = ((ByteBuffer) ((t9d) vxdVar).d).getShort(i5);
            }
        }
    }
}
