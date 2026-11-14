package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r2i {
    public final y3i a;
    public final ikc b;
    public final ru9 c;
    public final ndc d;
    public boolean e;
    public boolean f;
    public d3k g;
    public final kze h;

    public r2i(y3i y3iVar, ikc ikcVar, ru9 ru9Var, ndc ndcVar) {
        l08 l08Var = l08.a;
        new kze(l08Var);
        this.a = y3iVar;
        this.b = ikcVar;
        this.c = ru9Var;
        this.d = ndcVar;
        this.f = true;
        this.h = new kze(l08Var);
        ikcVar.j(ndcVar, new iwa(new rmg(this, (byte) 20), (byte) 26));
    }

    public final void a(List list) {
        ru9 ru9Var = this.c;
        HashSet hashSetM = w1h.m(ru9Var.a, "rewards.claimed_app_icons");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b2h b2hVar = (b2h) it.next();
            if (b2hVar.d == a2h.a) {
                hashSetM.add(b2hVar.a);
            }
        }
        nv6 nv6VarB = ru9Var.b();
        ((SharedPreferences.Editor) nv6VarB.a).putStringSet("rewards.claimed_app_icons", hashSetM);
        nv6VarB.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.p2i
            if (r0 == 0) goto L13
            r0 = r6
            p2i r0 = (defpackage.p2i) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            p2i r0 = new p2i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.t
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r6 = r6.a
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r6)
            r0.t = r5
            r0.w = r3
            y3i r6 = r4.a
            java.lang.Object r6 = r6.k(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            p0i r0 = t0i.b
            boolean r0 = r6 instanceof q0i
            if (r0 != 0) goto L65
            ru9 r4 = r4.c
            android.content.SharedPreferences r0 = r4.a
            java.lang.String r1 = "rewards.claimed_app_icons"
            java.util.HashSet r0 = w1h.m(r0, r1)
            r0.add(r5)
            nv6 r4 = r4.b()
            java.lang.Object r5 = r4.a
            android.content.SharedPreferences$Editor r5 = (android.content.SharedPreferences.Editor) r5
            r5.putStringSet(r1, r0)
            r4.w()
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r2i.b(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.q2i
            if (r0 == 0) goto L13
            r0 = r5
            q2i r0 = (defpackage.q2i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q2i r0 = new q2i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ybh.y(r5)
            t0i r5 = (t0i) r5
            java.lang.Object r5 = r5.a
            goto L58
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L32:
            ybh.y(r5)
            boolean r5 = r4.e
            if (r5 != 0) goto L3c
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L3c:
            ikc r5 = r4.b
            java.lang.Object r5 = r5.g()
            m18 r2 = defpackage.m18.b
            if (r5 != r2) goto L66
            boolean r5 = r4.f
            if (r5 != 0) goto L4d
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L4d:
            r0.v = r3
            y3i r5 = r4.a
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            p0i r0 = t0i.b
            boolean r0 = r5 instanceof q0i
            if (r0 != 0) goto L63
            kotlin.Unit r5 = (kotlin.Unit) r5
            r5 = 0
            r4.f = r5
        L63:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L66:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r2i.c(nt5):java.lang.Object");
    }
}
