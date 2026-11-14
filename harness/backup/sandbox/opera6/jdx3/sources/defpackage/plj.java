package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class plj extends k8 implements kq {
    public final wy o;
    public final ocd p;
    public n43 q;
    public uo r;
    public ncd s;
    public olj t;

    public plj(wy wyVar, ocd ocdVar, x5f x5fVar) {
        super(x5fVar, (Object) null);
        this.o = wyVar;
        this.p = ocdVar;
        this.q = new in7((byte) 1);
    }

    @Override // defpackage.k8
    public final boolean Y(mq mqVar) {
        return !this.p.a();
    }

    @Override // defpackage.k8
    public final void f0(mq mqVar) {
        olj oljVar;
        if (!mqVar.equals(this.q) || (oljVar = this.t) == null) {
            return;
        }
        oljVar.onFailed("cancelled");
    }

    @Override // defpackage.k8
    public final void p0(mq mqVar) {
        if (mqVar.equals(this.q) && this.p.a() && mqVar.g(true, false)) {
            t0(false);
        }
    }

    @Override // defpackage.kq
    public final void r(mq mqVar) {
        if (Intrinsics.a(mqVar, this.q)) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.p.a.get();
            sharedPreferences.edit().putLong("masthead_ad.last_removed_timestamp", System.currentTimeMillis()).putInt("masthead_ad.removed_count", sharedPreferences.getInt("masthead_ad.removed_count", 0) + 1).apply();
            uo uoVar = this.r;
            if (uoVar == null) {
                return;
            }
            s0(new no(uoVar, this.o.l, this, l08.a));
        }
    }

    public final void s0(n43 n43Var) {
        olj oljVar = this.t;
        if (oljVar != null) {
            oljVar.onFailed("cancelled");
        }
        n43 n43Var2 = this.q;
        this.q = n43Var;
        ncd ncdVar = this.s;
        if (ncdVar != null) {
            ncdVar.A();
        }
        n43Var2.f();
    }

    public final void t0(boolean z) {
        uo uoVar = this.r;
        if (uoVar == null || this.t != null) {
            return;
        }
        bz bzVar = uoVar.a;
        dl dlVar = uoVar.b;
        m43 m43Var = new m43(dlVar, dlVar.c, 0, l08.a);
        r31 r31Var = new r31(3, this.o.y, ej.class, "maybePreloadEssentialAssets", "maybePreloadEssentialAssets(Lcom/opera/android/ads/Advertisement;ZLkotlin/jvm/functions/Function2;)V", 0, (byte) 5);
        olj oljVar = new olj(bzVar, m43Var, r31Var, new sn3((byte) 8, (Object) this, z), new tji((Object) this, (byte) 18));
        this.t = oljVar;
        yz yzVarD = bzVar.d(m43Var);
        if (yzVarD != null) {
            r31Var.invoke(yzVarD, Boolean.valueOf(m43Var.b()), new q01(oljVar, yzVarD, true));
        } else {
            bzVar.e(oljVar, m43Var);
        }
    }
}
