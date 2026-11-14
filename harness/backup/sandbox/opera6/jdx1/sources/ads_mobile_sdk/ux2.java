package ads_mobile_sdk;

import defpackage.mip;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ux2 {
    public final g0 a;
    public final ah3 b;
    public final mip c;

    public ux2(g0 g0Var, ah3 ah3Var, mip mipVar) {
        this.a = g0Var;
        this.b = ah3Var;
        this.c = mipVar;
    }

    public static wk2 a(ux2 ux2Var, fw0 fw0Var, List list, kh3 kh3Var) {
        ux2Var.getClass();
        mip mipVar = ux2Var.c;
        ah3 ah3Var = ux2Var.b;
        w8 w8Var = new w8();
        wk2 wk2Var = new wk2(fw0Var, list, UUID.randomUUID(), kh3Var, w8Var, mipVar, ah3Var, 0, null, true, 1280);
        ((AtomicReference) w8Var.a).set(wk2Var);
        hh3.a(hh3.b(), null);
        hh3.a(hh3.b(), wk2Var);
        wk2Var.k.x = ux2Var.a.c() ? 3 : 2;
        return wk2Var;
    }
}
