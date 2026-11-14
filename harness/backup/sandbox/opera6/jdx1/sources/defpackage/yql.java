package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class yql extends e53 {
    public final /* synthetic */ byte i;

    public /* synthetic */ yql(byte b) {
        this.i = b;
    }

    public static void h(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == 2143289344) {
            iFloatToIntBits = 0;
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.e53
    public final bh2 c(bh2 bh2Var) throws dh2 {
        switch (this.i) {
            case 0:
                int i = bh2Var.c;
                if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 2) {
                    return i != 4 ? new bh2(bh2Var.a, bh2Var.b, 4) : bh2.e;
                }
                throw new dh2(bh2Var);
            default:
                int i2 = bh2Var.c;
                if (i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
                    return i2 != 2 ? new bh2(bh2Var.a, bh2Var.b, 2) : bh2.e;
                }
                throw new dh2(bh2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // defpackage.eh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void queueInput(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yql.queueInput(java.nio.ByteBuffer):void");
    }
}
