package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class kah implements cr9 {
    public final /* synthetic */ sah a;
    public final /* synthetic */ boolean b;

    public kah(sah sahVar, boolean z) {
        this.a = sahVar;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zr3 zr3Var = (zr3) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((vt9) ih5Var).f(zr3Var) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            gah.a.a(this.a, this.b, zr3Var.a(z7e.b, rbe.c), 0L, 0L, 0.0f, vt9Var, 1572864);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
