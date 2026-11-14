package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bhk extends uik {
    public static final bc6 c = new bc6[]{new bc6(16, 0)}[0];
    public short[] b;

    public final void a(bp bpVar) throws e22 {
        bp bpVarQ = bpVar.Q(c);
        short[] sArr = this.b;
        if (sArr == null) {
            bpVarQ.N(8, wyh.E(0));
        } else {
            ((ByteBuffer) ((zg) bpVarQ.P(2, sArr.length, 8, -1).b).c).asShortBuffer().put(sArr);
        }
    }
}
