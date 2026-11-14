package ads_mobile_sdk;

import defpackage.kyo;
import defpackage.prb;
import defpackage.zep;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class zj0 implements kyo {
    public final ue1 a;

    public zj0(ue1 ue1Var) {
        this.a = ue1Var;
    }

    @Override // defpackage.f6p
    public final Object a(String str, String str2, mt5 mt5Var) {
        return this.a.a(str, str2, mt5Var);
    }

    @Override // defpackage.kyo
    public final Object a(kuk kukVar) {
        Object objC = this.a.c(kukVar);
        return objC == px5.a ? objC : Unit.a;
    }

    @Override // defpackage.f6p
    public final Object a(prb prbVar, mt5 mt5Var) {
        Object objA = this.a.a(prbVar, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.kyo
    public final zep a() {
        bl1 bl1Var = this.a.a.y;
        if (bl1Var != null) {
            return bl1Var;
        }
        return null;
    }
}
