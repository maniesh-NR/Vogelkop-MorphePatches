package defpackage;

import android.view.autofill.AutofillValue;
import java.util.Arrays;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class xw5 extends i17 implements i0j {
    public j2m q;
    public mil r;
    public gbc s;
    public boolean t;
    public boolean u;
    public i9f v;
    public dil w;
    public k0b x;
    public kg9 y;

    public static void W0(gbc gbcVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        djl djlVar = gbcVar.e;
        lw5 lw5Var = gbcVar.v;
        if (djlVar == null) {
            int length = str.length();
            lw5Var.invoke(new mil(4, upj.c(length, length), str));
        } else {
            mil milVarB = gbcVar.d.b(Arrays.asList(new y17(), new yb5(str, 1)));
            djlVar.a(null, milVarB);
            lw5Var.invoke(milVarB);
        }
    }

    @Override // defpackage.i0j
    public final boolean D0() {
        return true;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        sf1 sf1Var = this.r.a;
        xtb[] xtbVarArr = o0j.a;
        p0j p0jVar = n0j.F;
        xtb[] xtbVarArr2 = o0j.a;
        xtb xtbVar = xtbVarArr2[18];
        p0jVar.getClass();
        q0jVar.b(p0jVar, sf1Var);
        sf1 sf1Var2 = this.q.a;
        p0j p0jVar2 = n0j.G;
        xtb xtbVar2 = xtbVarArr2[19];
        p0jVar2.getClass();
        q0jVar.b(p0jVar2, sf1Var2);
        long j = this.r.b;
        p0j p0jVar3 = n0j.H;
        xtb xtbVar3 = xtbVarArr2[20];
        xjl xjlVar = new xjl(j);
        p0jVar3.getClass();
        q0jVar.b(p0jVar3, xjlVar);
        o0j.c(q0jVar, ulp.d);
        o0j.f(q0jVar, new e61(AutofillValue.forText(zi4.f0(this.r.a))));
        boolean z = false;
        o0j.b(q0jVar, new ww5(this, (byte) 0));
        int i = this.x.d;
        if (i == 6) {
            ur5.a.getClass();
            o0j.e(q0jVar, qr5.c);
        } else if (i == 7 || i == 8) {
            ur5.a.getClass();
            o0j.e(q0jVar, qr5.b);
        } else if (i == 4) {
            ur5.a.getClass();
            o0j.e(q0jVar, qr5.d);
        }
        if (!this.u) {
            q0jVar.b(n0j.j, Unit.a);
        }
        if (this.u && !this.t) {
            z = true;
        }
        p0j p0jVar4 = n0j.Q;
        xtb xtbVar4 = xtbVarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        p0jVar4.getClass();
        q0jVar.b(p0jVar4, boolValueOf);
        o0j.a(q0jVar, new ww5(this, (byte) 1));
        if (z) {
            q0jVar.b(e0j.k, new c8(null, new ww5(this, (byte) 2)));
            q0jVar.b(e0j.o, new c8(null, new ww5(this, q0jVar)));
        }
        q0jVar.b(e0j.j, new c8(null, new j04(this, (byte) 4)));
        int i2 = this.x.e;
        vw5 vw5Var = new vw5(this, (byte) 6);
        q0jVar.b(n0j.J, new h0b(i2));
        q0jVar.b(e0j.p, new c8(null, vw5Var));
        q0jVar.b(e0j.b, new c8(null, new vw5(this, (byte) 7)));
        q0jVar.b(e0j.c, new c8(null, new vw5(this, (byte) 1)));
        if (!xjl.c(this.r.b)) {
            q0jVar.b(e0j.q, new c8(null, new vw5(this, (byte) 2)));
            if (this.u && !this.t) {
                q0jVar.b(e0j.r, new c8(null, new vw5(this, (byte) 3)));
            }
        }
        if (!this.u || this.t) {
            return;
        }
        q0jVar.b(e0j.s, new c8(null, new vw5(this, (byte) 5)));
    }
}
