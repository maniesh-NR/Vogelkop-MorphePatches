package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class gha implements eha {
    public static final Map e = rbd.c(new Pair[]{new Pair("free_esim_intro_page", gd0.b), new Pair("destination", gd0.c), new Pair("plan_summary", gd0.d), new Pair("install_esim_network_error", gd0.e), new Pair("install_esim_installation_error", gd0.f), new Pair("install_esim_in_progress", gd0.g), new Pair("faq_page", gd0.h), new Pair("device_compatibility", gd0.i), new Pair("offer_redeemed", gd0.j), new Pair("my_plans_current", gd0.k), new Pair("my_plans_expired", gd0.l), new Pair("data_plan_options", gd0.m), new Pair("checkout", gd0.n), new Pair("checkout_purchase_error", gd0.o)});
    public static final Map f = rbd.c(new Pair[]{new Pair("active", jd0.b), new Pair("expired", jd0.c), new Pair("not_activated", jd0.d)});
    public static final Map g = rbd.c(new Pair[]{new Pair("success", xc0.b), new Pair("error", xc0.c), new Pair("refund", xc0.d)});
    public final x5f a;
    public final x5f b;
    public a98 c;
    public fha d;

    public gha(x5f x5fVar, x5f x5fVar2, a98 a98Var) {
        this.a = x5fVar;
        this.b = x5fVar2;
        this.c = a98Var;
    }

    public final void b(String str, String str2, Long l, Long l2) {
        gd0 gd0Var = (gd0) e.get(str);
        if (gd0Var != null) {
            fha fhaVar = this.d;
            if (fhaVar == null) {
                x5f x5fVar = this.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    ((nd0) new ck0(zpaVar, x56VarF).v.getValue()).a(new rkc((Object) gd0Var, (byte) 26));
                    x5fVar.U0(x56VarF);
                    return;
                }
                return;
            }
            fhaVar.e.add(gd0Var);
            if (str2 != null && !str2.equals(fhaVar.f)) {
                fhaVar.f = str2;
                fhaVar.g = null;
                fhaVar.h = null;
            }
            if (l != null) {
                fhaVar.h = l;
                if (l2 == null) {
                    l2 = -1L;
                }
                fhaVar.g = l2;
            }
        }
    }

    public final void c(xc0 xc0Var) {
        fha fhaVar = this.d;
        if (fhaVar == null) {
            return;
        }
        dd0 dd0Var = fhaVar.a;
        a98 a98Var = fhaVar.b;
        String str = a98Var.a;
        String str2 = a98Var.b;
        ArrayList arrayList = fhaVar.e;
        km0 km0Var = fhaVar.c;
        boolean z = fhaVar.d;
        String str3 = fhaVar.f;
        Long l = fhaVar.g;
        Long l2 = fhaVar.h;
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).a(new l5f(dd0Var, str, str2, arrayList, km0Var, z, xc0Var, str3, l, l2, (byte) 0));
            x5fVar.U0(x56VarF);
        }
        this.d = null;
    }
}
