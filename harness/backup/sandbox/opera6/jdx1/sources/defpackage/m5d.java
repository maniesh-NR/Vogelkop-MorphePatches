package defpackage;

import android.view.View;
import android.widget.Magnifier;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class m5d extends b8e implements gz9, lk7, i0j, j7f {
    public i37 B;
    public gcb D;
    public p04 E;
    public p01 o;
    public hil p;
    public psp w;
    public View x;
    public n27 y;
    public qfb z;
    public float q = Float.NaN;
    public boolean r = true;
    public long s = 9205357640488583168L;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public boolean v = true;
    public final t0g A = new t0g(null, qs7.g);
    public long C = 9205357640488583168L;

    public m5d(p01 p01Var, hil hilVar, psp pspVar) {
        this.o = p01Var;
        this.p = hilVar;
        this.w = pspVar;
    }

    public final void G(wye wyeVar) {
        this.A.setValue(wyeVar);
    }

    public final void J() {
        x7d.y(this, new l5d(this, (byte) 0));
    }

    @Override // defpackage.b8e
    public final void L0() {
        J();
        this.E = xf8.h(0, null, null, 7);
        na2.B(H0(), null, rx5.d, new rf4((byte) 10, null, this), 1);
    }

    @Override // defpackage.b8e
    public final void M0() {
        qfb qfbVar = this.z;
        if (qfbVar != null) {
            ((Magnifier) qfbVar.b).dismiss();
        }
        this.z = null;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        q0jVar.b(n5d.a, new l5d(this, (byte) 1));
    }

    public final long T0() {
        i37 i37VarB = this.B;
        if (i37VarB == null) {
            i37VarB = luj.b(new l5d(this, (byte) 2));
            this.B = i37VarB;
        }
        return ((y8f) i37VarB.getValue()).a;
    }

    public final void U0() {
        qfb qfbVar;
        qfb qfbVar2 = this.z;
        if (qfbVar2 != null) {
            ((Magnifier) qfbVar2.b).dismiss();
        }
        View viewI0 = this.x;
        if (viewI0 == null) {
            viewI0 = p37.i0(this);
        }
        this.x = viewI0;
        n27 n27Var = this.y;
        if (n27Var == null) {
            n27Var = ui6.e0(this).y;
        }
        this.y = n27Var;
        psp pspVar = this.w;
        boolean z = this.r;
        long j = this.s;
        float f = this.t;
        float f2 = this.u;
        boolean z2 = this.v;
        float f3 = this.q;
        pspVar.getClass();
        if (z) {
            qfbVar = new qfb(new Magnifier(viewI0), (byte) 21);
        } else {
            long jY0 = n27Var.y0(j);
            float fO0 = n27Var.o0(f);
            float fO02 = n27Var.o0(f2);
            Magnifier.Builder builder = new Magnifier.Builder(viewI0);
            if (jY0 != 9205357640488583168L) {
                builder.setSize(zed.b(Float.intBitsToFloat((int) (jY0 >> 32))), zed.b(Float.intBitsToFloat((int) (jY0 & 4294967295L))));
            }
            if (!Float.isNaN(fO0)) {
                builder.setCornerRadius(fO0);
            }
            if (!Float.isNaN(fO02)) {
                builder.setElevation(fO02);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            qfbVar = new qfb(builder.build(), (byte) 21);
        }
        this.z = qfbVar;
        W0();
    }

    public final void V0() {
        n27 n27Var = this.y;
        if (n27Var == null) {
            n27Var = ui6.e0(this).y;
            this.y = n27Var;
        }
        long j = ((y8f) this.o.invoke(n27Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (T0() & 9223372034707292159L) == 9205357640488583168L) {
            this.C = 9205357640488583168L;
            qfb qfbVar = this.z;
            if (qfbVar != null) {
                ((Magnifier) qfbVar.b).dismiss();
                return;
            }
            return;
        }
        this.C = y8f.e(T0(), j);
        if (this.z == null) {
            U0();
        }
        qfb qfbVar2 = this.z;
        if (qfbVar2 != null) {
            long j2 = this.C;
            float f = this.q;
            Magnifier magnifier = (Magnifier) qfbVar2.b;
            if (!Float.isNaN(f)) {
                magnifier.setZoom(f);
            }
            if ((9223372034707292159L & 9205357640488583168L) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (9205357640488583168L & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            }
        }
        W0();
    }

    public final void W0() {
        n27 n27Var;
        qfb qfbVar = this.z;
        if (qfbVar == null || (n27Var = this.y) == null) {
            return;
        }
        long jP = qfbVar.p();
        gcb gcbVar = this.D;
        if (gcbVar == null || jP != gcbVar.a) {
            hil hilVar = this.p;
            if (hilVar != null) {
                hilVar.invoke(new kh7(n27Var.k(fr3.g0(qfbVar.p()))));
            }
            this.D = new gcb(qfbVar.p());
        }
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        o3cVar.a();
        p04 p04Var = this.E;
        if (p04Var != null) {
            p04Var.b(Unit.a);
        }
    }
}
