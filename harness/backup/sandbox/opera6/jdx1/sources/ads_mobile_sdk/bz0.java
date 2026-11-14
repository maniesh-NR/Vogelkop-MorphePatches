package ads_mobile_sdk;

import defpackage.prb;
import defpackage.ukh;
import defpackage.vf6;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bz0 implements m3n {
    public final nx5 a;
    public final cy0 b;
    public float h;
    public boolean k;
    public final cd5 e = new cd5();
    public final Object f = new Object();
    public vy0 i = vy0.UNKNOWN;
    public boolean m = true;

    public bz0(nx5 nx5Var, cy0 cy0Var) {
        this.a = nx5Var;
        this.b = cy0Var;
    }

    public final Object a(ukh ukhVar, nt5 nt5Var) {
        Unit unit;
        synchronized (this.f) {
            unit = Unit.a;
        }
        prb prbVar = new prb();
        prbVar.r("muteStart", ukhVar.b ? "1" : "0");
        prbVar.r("customControlsRequested", ukhVar.c ? "1" : "0");
        prbVar.r("clickToExpandRequested", ukhVar.d ? "1" : "0");
        prbVar.r("action", "initialState");
        Object objA = this.b.a(prbVar, "pubVideoCmd", nt5Var);
        px5 px5Var = px5.a;
        if (objA != px5Var) {
            objA = unit;
        }
        return objA == px5Var ? objA : unit;
    }

    public final void a(vy0 vy0Var, boolean z, float f) {
        boolean z2;
        synchronized (this.f) {
            synchronized (this.f) {
                z2 = this.m;
            }
            synchronized (this.f) {
                this.m = z;
            }
            vy0 vy0Var2 = this.i;
            this.i = vy0Var;
            float f2 = this.h;
            this.h = f;
            if (Math.abs(f - f2) > 1.0E-4f) {
                this.b.postInvalidate();
            }
            defpackage.na2.B(this.a, null, null, new vf6(this, vy0Var2, vy0Var, z2, z, null), 3);
        }
    }

    public final void getVideoLifecycleCallbacks() {
        synchronized (this.f) {
        }
    }
}
