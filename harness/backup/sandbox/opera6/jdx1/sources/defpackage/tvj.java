package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class tvj implements eh2 {
    public float b;
    public float c;
    public bh2 d;
    public bh2 e;
    public bh2 f;
    public bh2 g;
    public boolean h;
    public svj i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // defpackage.eh2
    public final bh2 a(bh2 bh2Var) throws dh2 {
        int i = bh2Var.c;
        if (i != 2 && i != 4) {
            throw new dh2(bh2Var);
        }
        int i2 = bh2Var.a;
        this.d = bh2Var;
        bh2 bh2Var2 = new bh2(i2, bh2Var.b, i);
        this.e = bh2Var2;
        this.h = true;
        return bh2Var2;
    }

    @Override // defpackage.eh2
    public final long b(long j) {
        if (this.m < 1024) {
            return (long) (j / this.b);
        }
        long j2 = this.l;
        this.i.getClass();
        long jQ = j2 - (r2.i.q() * (r2.j * r2.b));
        int i = this.g.a;
        int i2 = this.f.a;
        long j3 = this.m;
        return i == i2 ? tym.W(j, j3, jQ, RoundingMode.DOWN) : tym.W(j, j3 * i2, jQ * i, RoundingMode.DOWN);
    }

    @Override // defpackage.eh2
    public final void flush() {
        if (isActive()) {
            bh2 bh2Var = this.d;
            this.f = bh2Var;
            bh2 bh2Var2 = this.e;
            this.g = bh2Var2;
            if (this.h) {
                this.i = new svj(bh2Var.a, bh2Var.b, this.b, this.c, bh2Var2.a, bh2Var.c == 4);
            } else {
                svj svjVar = this.i;
                if (svjVar != null) {
                    svjVar.j = 0;
                    svjVar.k = 0;
                    svjVar.l = 0;
                    svjVar.m = 0;
                    svjVar.n = 0;
                    svjVar.o = 0;
                    svjVar.p = 0;
                    svjVar.q = 0.0d;
                    svjVar.i.flush();
                }
            }
        }
        this.k = eh2.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // defpackage.eh2
    public final ByteBuffer getOutput() {
        svj svjVar = this.i;
        if (svjVar != null) {
            rvj rvjVar = svjVar.i;
            int i = svjVar.b;
            z4o.H(svjVar.k >= 0);
            int iQ = rvjVar.q() * svjVar.k * i;
            if (iQ > 0) {
                if (this.j.capacity() < iQ) {
                    this.j = ByteBuffer.allocateDirect(iQ).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                z4o.H(svjVar.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (rvjVar.q() * i), svjVar.k);
                rvjVar.b(iMin, byteBuffer);
                svjVar.k -= iMin;
                System.arraycopy(rvjVar.n(), iMin * i, rvjVar.n(), 0, svjVar.k * i);
                this.j.flip();
                this.m += iQ;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = eh2.a;
        return byteBuffer2;
    }

    @Override // defpackage.eh2
    public final boolean isActive() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // defpackage.eh2
    public final boolean isEnded() {
        if (this.n) {
            svj svjVar = this.i;
            if (svjVar != null) {
                z4o.H(svjVar.k >= 0);
                if (svjVar.i.q() * svjVar.k * svjVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.eh2
    public final void queueEndOfStream() {
        svj svjVar = this.i;
        if (svjVar != null) {
            int i = svjVar.j;
            float f = svjVar.c;
            float f2 = svjVar.d;
            double d = f / f2;
            int i2 = svjVar.k + ((int) (((((((i - r7) / d) + svjVar.o) + svjVar.q) + svjVar.l) / (svjVar.e * f2)) + 0.5d));
            svjVar.q = 0.0d;
            rvj rvjVar = svjVar.i;
            int i3 = svjVar.h << 1;
            rvjVar.i(i + i3);
            rvjVar.c(i * svjVar.b, i3);
            svjVar.j += i3;
            svjVar.b();
            if (svjVar.k > i2) {
                svjVar.k = Math.max(i2, 0);
            }
            svjVar.j = 0;
            svjVar.o = 0;
            svjVar.l = 0;
        }
        this.n = true;
    }

    @Override // defpackage.eh2
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            svj svjVar = this.i;
            svjVar.getClass();
            this.l += byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = svjVar.b;
            rvj rvjVar = svjVar.i;
            int iQ = iRemaining / (rvjVar.q() * i);
            rvjVar.i(iQ);
            rvjVar.a(iRemaining, byteBuffer);
            svjVar.j += iQ;
            svjVar.b();
        }
    }

    @Override // defpackage.eh2
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        bh2 bh2Var = bh2.e;
        this.d = bh2Var;
        this.e = bh2Var;
        this.f = bh2Var;
        this.g = bh2Var;
        ByteBuffer byteBuffer = eh2.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
