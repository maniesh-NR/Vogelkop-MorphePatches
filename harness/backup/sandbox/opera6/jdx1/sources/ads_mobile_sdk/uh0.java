package ads_mobile_sdk;

import defpackage.ato;
import defpackage.v7p;
import defpackage.zep;

/* loaded from: classes.dex */
public final class uh0 implements v7p, zep {
    public final cy0 a;
    public final /* synthetic */ bl1 b;

    public uh0(cy0 cy0Var) {
        this.a = cy0Var;
        bl1 bl1Var = cy0Var.y;
        this.b = bl1Var == null ? null : bl1Var;
    }

    @Override // defpackage.v7p
    public final cy0 a() {
        return this.a;
    }

    @Override // defpackage.zep
    public final Object a(String str, ato atoVar, mt5 mt5Var) {
        bl1 bl1Var = this.b;
        bl1Var.getClass();
        return bl1.a(bl1Var, str, atoVar, mt5Var);
    }
}
