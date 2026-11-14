package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class fah implements cr9 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ sah c;

    public fah(boolean z, long j, sah sahVar) {
        this.a = z;
        this.b = j;
        this.c = sahVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            o0g.c(Boolean.valueOf(this.a), null, nb6.Y(jae.c, vt9Var), null, gyg.P(-2064098104, new ay4(this.b, this.c), vt9Var), vt9Var, 24576);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
