package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ie4 extends q83 {
    public final qj6 s;
    public final g1g t;
    public he4 u;
    public long v;

    public ie4() {
        super(6);
        this.s = new qj6(1);
        this.t = new g1g();
    }

    @Override // defpackage.kuh
    public final int b(oj9 oj9Var) {
        return "application/x-camera-motion".equals(oj9Var.n) ? kuh.g(4, 0, 0, 0) : kuh.g(0, 0, 0, 0);
    }

    @Override // defpackage.q83, defpackage.bkg
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.u = (he4) obj;
        }
    }

    @Override // defpackage.q83
    public final void n() {
        he4 he4Var = this.u;
        if (he4Var != null) {
            he4Var.c();
        }
    }

    @Override // defpackage.q83
    public final void q(long j, boolean z, boolean z2) {
        this.v = Long.MIN_VALUE;
        he4 he4Var = this.u;
        if (he4Var != null) {
            he4Var.c();
        }
    }

    @Override // defpackage.q83
    public final void y(long j, long j2) {
        float[] fArr;
        while (!k() && this.v < 100000 + j) {
            qj6 qj6Var = this.s;
            qj6Var.i();
            i16 i16Var = this.c;
            i16Var.k();
            if (x(i16Var, qj6Var, 0) != -4 || qj6Var.d(4)) {
                return;
            }
            long j3 = qj6Var.g;
            this.v = j3;
            boolean z = j3 < this.l;
            if (this.u != null && !z) {
                qj6Var.l();
                ByteBuffer byteBuffer = qj6Var.e;
                String str = tym.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    g1g g1gVar = this.t;
                    g1gVar.L(bArrArray, iLimit);
                    g1gVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(g1gVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.u.a(fArr, this.v - this.k);
                }
            }
        }
    }
}
