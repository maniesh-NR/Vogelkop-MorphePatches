package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class kwl implements trm {
    public final hak a;
    public zrm b;
    public final boolean c;
    public jwl d;
    public final ode e = new ode(0);
    public final boolean f;
    public final int g;
    public final ode h;
    public cd5 i;
    public cd5 j;

    public kwl(pe4 pe4Var, hak hakVar) {
        this.a = hakVar;
        this.c = oup.h0(pe4Var);
        boolean z = false;
        fe4 fe4Var = ge4.Oo;
        ge4 ge4Var = pe4Var.b;
        fe4Var.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && kg1.i(ge4Var)) {
            z = true;
        }
        this.f = z;
        int iE = i >= 35 ? kg1.e(ge4Var) : 1;
        this.g = iE;
        if (i >= 35) {
            kg1.g(ge4Var);
        }
        this.h = new ode(Integer.valueOf(iE));
    }

    public static cd5 a(kwl kwlVar, boolean z, int i) {
        return kwlVar.c(z ? 1 : 0, (i & 2) != 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // defpackage.trm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.zrm r2) {
        /*
            r1 = this;
            r1.b = r2
            jwl r2 = r1.d
            if (r2 == 0) goto L1c
            ode r2 = r1.e
            java.lang.Object r2 = r2.g()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L17
            int r2 = r2.intValue()
            r0 = 1
            if (r2 == r0) goto L18
        L17:
            r0 = 0
        L18:
            r2 = 4
            a(r1, r0, r2)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwl.b(zrm):void");
    }

    public final cd5 c(int i, boolean z, boolean z2) {
        byte b;
        h07 h07VarJ;
        hak hakVar = this.a;
        cd5 cd5Var = new cd5();
        if (!z2 && !this.c) {
            cd5Var.B0(new IllegalStateException("No flash unit"));
            return cd5Var;
        }
        zrm zrmVar = this.b;
        if (zrmVar == null) {
            am2.z("Camera is not active.", cd5Var);
            return cd5Var;
        }
        e(i);
        cd5 cd5Var2 = this.i;
        if (z) {
            if (cd5Var2 != null) {
                am2.z("There is a new enableTorch being set", cd5Var2);
            }
            this.i = null;
        } else if (cd5Var2 != null) {
            p37.f0(cd5Var, cd5Var2);
        }
        this.i = cd5Var;
        Integer num = i == 0 ? null : 1;
        synchronized (hakVar.d) {
            hakVar.k = num;
        }
        hakVar.f();
        List list = y10.b;
        y10 y10VarZ = wxe.z(hakVar.e());
        if (y10VarZ != null) {
            b = y10VarZ.a;
        } else {
            if (gyg.G(5, "CXCP")) {
                hakVar.e();
            }
            b = 1;
        }
        if (i == 0) {
            h07VarJ = zrmVar.j(b);
        } else {
            if (i == 1) {
                Integer num2 = (Integer) this.h.g();
                if (num2 != null) {
                    f(num2.intValue());
                }
            } else {
                f(this.g);
            }
            h07VarJ = zrmVar.f();
        }
        h07VarJ.s(new cv2(h07VarJ, cd5Var, new qjl((byte) 5)));
        return cd5Var;
    }

    public final void e(int i) {
        this.d = new jwl(i);
        int i2 = i != 1 ? 0 : 1;
        boolean zN = xug.n();
        ode odeVar = this.e;
        if (zN) {
            odeVar.r(Integer.valueOf(i2));
        } else {
            odeVar.n(Integer.valueOf(i2));
        }
    }

    public final void f(int i) {
        h07 h07VarH;
        cd5 cd5Var = new cd5();
        if (Build.VERSION.SDK_INT < 35 || !this.f) {
            cd5Var.B0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        cd5 cd5Var2 = this.j;
        if (cd5Var2 != null) {
            if (cd5Var2 != null) {
                am2.z("There is a new torch strength being set", cd5Var2);
            }
            this.j = null;
        }
        this.j = cd5Var;
        cd5Var.s(new qfl(this, (byte) 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kg1.j(linkedHashMap, i);
        zrm zrmVar = this.b;
        if (zrmVar == null || (h07VarH = zrm.h(zrmVar, linkedHashMap)) == null) {
            am2.z("Camera is not active.", cd5Var);
        } else {
            p37.f0(h07VarH, cd5Var);
        }
    }

    @Override // defpackage.trm
    public final void reset() {
        cd5 cd5Var = this.i;
        if (cd5Var != null) {
            am2.z("There is a new enableTorch being set", cd5Var);
        }
        this.i = null;
        cd5 cd5Var2 = this.j;
        if (cd5Var2 != null) {
            am2.z("There is a new torch strength being set", cd5Var2);
        }
        this.j = null;
        if (this.d != null) {
            e(0);
            a(this, false, 6);
            this.d = null;
        }
    }
}
