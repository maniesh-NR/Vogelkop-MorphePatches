package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class w6o {
    public final l45 a;
    public final xnc b;
    public final fs6 c;
    public final hx5 d;
    public final rs6 e;
    public final tn f;
    public final ddc g;
    public final xz6 h;
    public final nak i;
    public final rlh j;
    public final c78 k;
    public final rlh l;
    public final zyk m;
    public final LinkedHashMap n;
    public s6o o;

    public w6o(l45 l45Var, xnc xncVar, fs6 fs6Var, hx5 hx5Var, rs6 rs6Var, tn tnVar, ddc ddcVar, vk1 vk1Var, t1 t1Var, jg8 jg8Var, x5f x5fVar) {
        this.a = l45Var;
        this.b = xncVar;
        this.c = fs6Var;
        this.d = hx5Var;
        this.e = rs6Var;
        this.f = tnVar;
        this.g = ddcVar;
        this.h = new xz6(x5fVar);
        nak nakVarF = z4o.f(dtc.a);
        this.i = nakVarF;
        rlh rlhVarJ = a26.j(nakVarF);
        this.j = rlhVarJ;
        this.k = new c78(rlhVarJ, (byte) 6);
        this.l = a26.o0(xncVar.d, ddcVar, aej.a, Boolean.FALSE);
        this.m = z4c.b(new uef(vk1Var, t1Var, jg8Var, (byte) 11));
        this.n = new LinkedHashMap();
        na2.B(ddcVar, (CoroutineContext) null, (rx5) null, new zhl((byte) 10, (mt5) null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.t6o
            if (r0 == 0) goto L13
            r0 = r7
            t6o r0 = (defpackage.t6o) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            t6o r0 = new t6o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            java.util.LinkedHashMap r3 = r5.n
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2b
            java.lang.String r6 = r0.t
            ybh.y(r7)
            goto L51
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            r5 = 0
            return r5
        L32:
            ybh.y(r7)
            java.lang.Object r7 = r3.get(r6)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L3e
            return r7
        L3e:
            zyk r5 = r5.m
            java.lang.Object r5 = r5.getValue()
            q7o r5 = (defpackage.q7o) r5
            r0.t = r6
            r0.w = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            avj r5 = r7o.e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r7.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r5.getClass()
            java.util.LinkedHashMap r4 = r7o.f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            r7o r1 = (r7o) r1
            if (r1 == 0) goto L5e
            r0.add(r1)
            goto L5e
        L83:
            java.util.Set r5 = kotlin.collections.CollectionsKt.n0(r0)
            r3.put(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6o.a(java.lang.String, nt5):java.lang.Object");
    }

    public final boolean b(long j) {
        List list = (List) this.d.g();
        if (list == null) {
            return false;
        }
        List<kpc> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (kpc kpcVar : list2) {
            if (kpcVar.b == apc.c && kpcVar.a == j) {
                return true;
            }
        }
        return false;
    }

    public final void c(p6o p6oVar) {
        String str;
        xz6 xz6Var = this.h;
        if (xz6Var.b) {
            x5f x5fVar = xz6Var.a;
            if (p6oVar != null) {
                if (p6oVar instanceof o6o) {
                    str = "follow_national_team";
                } else if (p6oVar instanceof i6o) {
                    str = "follow_national_team_gb";
                } else if (p6oVar instanceof k7o) {
                    str = "pick_favorite_team";
                }
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).d().d(str, new zbe((byte) 24));
                    x5fVar.U0(x56VarF);
                }
                xz6Var.b = false;
                return;
            }
            h9o.p();
        }
    }

    public final void d(sk4 sk4Var) {
        xz6 xz6Var = this.h;
        byte b = 1;
        if (xz6Var.c) {
            x5f x5fVar = xz6Var.a;
            String strA = xz6.a(sk4Var);
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new ck0(zpaVar, x56VarF).d().d(strA, new w5f(b));
                x5fVar.U0(x56VarF);
            }
            xz6Var.c = false;
        }
        ((SharedPreferences) this.e.a.get()).edit().putBoolean("world_cup_promo_card_dismissed", true).apply();
        f();
    }

    public final void e(Context context, long j, sk4 sk4Var) {
        this.c.a.V(1, "live_scores_enabled");
        x5f x5fVar = this.h.a;
        String strA = xz6.a(sk4Var);
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).d().d(strA, new zbe((byte) 18));
            x5fVar.U0(x56VarF);
        }
        this.f.D(context, new mqc(Long.valueOf(j)), null);
        ((SharedPreferences) this.e.a.get()).edit().putBoolean("world_cup_promo_card_dismissed", true).apply();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6o.f():void");
    }
}
