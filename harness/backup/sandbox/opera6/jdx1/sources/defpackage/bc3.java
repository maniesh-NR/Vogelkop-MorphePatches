package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bc3 extends qj6 {
    public long j;
    public int k;
    public byte l;

    @Override // defpackage.qj6
    public final void i() {
        super.i();
        this.k = 0;
    }

    public final boolean m(qj6 qj6Var) {
        ByteBuffer byteBuffer;
        z4o.w(!qj6Var.d(1073741824));
        z4o.w(!qj6Var.d(268435456));
        z4o.w(!qj6Var.d(4));
        if (n()) {
            if (this.k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = qj6Var.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = qj6Var.g;
            if (qj6Var.d(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = qj6Var.e;
        if (byteBuffer3 != null) {
            k(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = qj6Var.g;
        return true;
    }

    public final boolean n() {
        return this.k > 0;
    }
}
