package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kdf extends b8e implements j7f, smm {
    public Function1 o;
    public inl p;
    public d3k q;
    public boolean r;
    public boolean s;
    public xsh t;
    public final o5f u = new o5f(this, (byte) 10);

    public kdf(Function1 function1) {
        this.o = function1;
    }

    @Override // defpackage.smm
    public final void G0() {
        U0();
    }

    public final void J() {
    }

    @Override // defpackage.b8e
    public final void L0() throws pxb {
        inl inlVar = this.p;
        if (inlVar != null) {
            inlVar.b();
        }
        this.p = k1g.c0(this, this.u);
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        inl inlVar = this.p;
        if (inlVar != null) {
            inlVar.b();
        }
        U0();
    }

    @Override // defpackage.b8e
    public final void N0() {
        U0();
        d3k d3kVar = this.q;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.q = null;
        this.r = false;
        this.t = null;
    }

    public final void T0(xsh xshVar) {
        this.t = xshVar;
        long j = xshVar.e;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = xshVar.a;
        int i3 = (int) (j2 >> 32);
        int iMin = Math.min(Math.max(i3, 0), i);
        int i4 = (int) j2;
        int iMin2 = Math.min(Math.max(i4, 0), i2);
        long j3 = xshVar.b;
        int i5 = (int) (j3 >> 32);
        int iMax = Math.max(Math.min(i5, i), 0);
        int i6 = (int) j3;
        int iMax2 = Math.max(Math.min(i6, i2), 0);
        int i7 = (i6 - i4) * (i5 - i3);
        float fMax = Math.max((iMax2 - iMin2) * (iMax - iMin), 0) / Math.min((i2 - 0) * (i - 0), i7);
        boolean z = fMax > 1.0f || fMax == 1.0f;
        if (z != this.r) {
            this.r = z;
            d3k d3kVar = this.q;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            this.q = null;
            if (z != this.s) {
                V0();
            }
        }
    }

    public final void U0() {
        d3k d3kVar = this.q;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.q = null;
        this.r = false;
        if (this.s) {
            V0();
        }
    }

    public final void V0() {
        d3k d3kVar = this.q;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.q = null;
        this.o.invoke(Boolean.valueOf(this.r));
        this.s = this.r;
    }
}
