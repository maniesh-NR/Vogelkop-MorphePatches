package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t3d implements trm {
    public final hak a;
    public final ctm b;
    public zrm c;
    public final boolean d;
    public boolean e;
    public final ode f;
    public final AtomicInteger g;
    public cd5 h;
    public h07 i;

    public t3d(ge4 ge4Var, hak hakVar, ctm ctmVar, tb5 tb5Var) {
        this.a = hakVar;
        this.b = ctmVar;
        boolean z = false;
        if (ge4Var != null) {
            ge4.Oo.getClass();
            int[] iArr = (int[]) ((ma4) ge4Var).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr != null && e82.t(6, iArr) >= 0) {
                z = true;
            }
        }
        this.d = z;
        this.f = new ode(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            tb5Var.a(new s3d(this), ctmVar.e);
        }
    }

    public final void a(List list) {
        if (this.d) {
            if (list.isEmpty()) {
                this.i = sfe.d(Boolean.FALSE);
            } else {
                this.i = na2.g(this.b.f, null, null, new fb9(this, list, (mt5) null, (byte) 16), 3);
            }
        }
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.c = zrmVar;
        if (this.e) {
            if (zrmVar != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(ode odeVar, int i) {
        if (this.g.getAndSet(i) != i) {
            if (xug.n()) {
                odeVar.r(Integer.valueOf(i));
            } else {
                odeVar.n(Integer.valueOf(i));
            }
        }
    }

    public final cd5 d(boolean z, boolean z2) {
        cd5 cd5Var = new cd5();
        if (this.d) {
            na2.B(this.b.f, null, null, new o76((mt5) null, this, cd5Var, z, z2), 3);
            return cd5Var;
        }
        cd5Var.B0(new IllegalStateException("Low Light Boost is not supported!"));
        return cd5Var;
    }

    @Override // defpackage.trm
    public final void reset() {
        cd5 cd5Var = this.h;
        if (cd5Var != null) {
            am2.z("There is a new enableLowLightBoost being set", cd5Var);
        }
        this.h = null;
        d(false, true);
    }
}
