package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import defpackage.m7p;
import defpackage.prb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class b82 extends k8 implements m7p {
    public final nx5 c;
    public final prb d;
    public final a2 e;
    public final s52 f;
    public final it1 g;
    public final jz2 h;
    public final pfe i;
    public d3k j;
    public cy0 k;
    public q6 l;
    public final boolean m;
    public final List n;

    public b82(CoroutineContext coroutineContext, nx5 nx5Var, prb prbVar, a2 a2Var, s52 s52Var, it1 it1Var, qr0 qr0Var, jz2 jz2Var) {
        super(qr0Var, coroutineContext);
        this.c = nx5Var;
        this.d = prbVar;
        this.e = a2Var;
        this.f = s52Var;
        this.g = it1Var;
        this.h = jz2Var;
        this.i = new pfe();
        j82 j82Var = it1Var.n;
        this.m = (j82Var != null ? j82Var.a : null) == i82.a;
        this.n = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        if (r12.a((mt5) r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[Catch: all -> 0x00e5, PHI: r2 r11
      0x00c7: PHI (r2v11 ads_mobile_sdk.b82) = (r2v7 ads_mobile_sdk.b82), (r2v10 ads_mobile_sdk.b82), (r2v14 ads_mobile_sdk.b82) binds: [B:42:0x00c5, B:40:0x00c2, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v9 ads_mobile_sdk.b82) = (r11v6 ads_mobile_sdk.b82), (r11v8 ads_mobile_sdk.b82), (r11v14 ads_mobile_sdk.b82) binds: [B:42:0x00c5, B:40:0x00c2, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00e5, blocks: (B:15:0x0031, B:49:0x00d9, B:20:0x0040, B:43:0x00c7, B:45:0x00cb, B:23:0x0049, B:39:0x0098), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:15:0x0031, B:49:0x00d9, B:20:0x0040, B:43:0x00c7, B:45:0x00cb, B:23:0x0049, B:39:0x0098), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.b82 r11, nt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b82.b(ads_mobile_sdk.b82, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.b82 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.u72
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.u72 r0 = (ads_mobile_sdk.u72) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.u72 r0 = new ads_mobile_sdk.u72
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.b82 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.i
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.q6 r0 = r5.l     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L4f
            d3k r5 = r5.j     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L4f
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L57
            r6.l(r4)
            return r5
        L57:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b82.c(ads_mobile_sdk.b82, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if ((r8 != null ? r8.a : null) != ads_mobile_sdk.i82.b) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r7.a("Google", true, ads_mobile_sdk.z31.e, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.b82 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.y72
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.y72 r0 = (ads_mobile_sdk.y72) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.y72 r0 = new ads_mobile_sdk.y72
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L32
            if (r2 != r3) goto L2c
            defpackage.ybh.y(r8)
            goto L9f
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L32:
            ads_mobile_sdk.b82 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L74
        L38:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.s52 r8 = r7.f
            ads_mobile_sdk.ah3 r8 = r8.f
            r8.getClass()
            ads_mobile_sdk.u62 r2 = defpackage.ui6.r     // Catch: java.lang.Exception -> L4b
            boolean r2 = r2.a     // Catch: java.lang.Exception -> L4b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L4b
            goto L52
        L4b:
            r2 = move-exception
            java.lang.String r6 = "IsActive"
            r8.a(r6, r2)
            r8 = r4
        L52:
            if (r8 == 0) goto La2
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La2
            prb r8 = r7.d
            java.lang.String r2 = "enable_omid"
            if (r8 == 0) goto La2
            pqb r8 = r8.u(r2)     // Catch: java.lang.Exception -> La2
            boolean r8 = r8.c()     // Catch: java.lang.Exception -> La2
            if (r8 == 0) goto La2
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = c(r7, r0)
            if (r8 == r1) goto L9e
        L74:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto La2
            ads_mobile_sdk.it1 r8 = r7.g
            ads_mobile_sdk.gt1 r2 = r8.b
            ads_mobile_sdk.gt1 r6 = ads_mobile_sdk.gt1.b
            if (r2 != r6) goto L90
            ads_mobile_sdk.j82 r8 = r8.n
            if (r8 == 0) goto L8b
            ads_mobile_sdk.i82 r8 = r8.a
            goto L8c
        L8b:
            r8 = r4
        L8c:
            ads_mobile_sdk.i82 r2 = ads_mobile_sdk.i82.b
            if (r8 == r2) goto La2
        L90:
            r0.a = r4
            r0.d = r3
            java.lang.String r8 = "Google"
            ads_mobile_sdk.z31 r2 = ads_mobile_sdk.z31.e
            java.lang.Object r7 = r7.a(r8, r5, r2, r0)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        La2:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b82.d(ads_mobile_sdk.b82, nt5):java.lang.Object");
    }

    @Override // defpackage.m7p
    public final Object a(lp3 lp3Var) {
        return b(this, lp3Var);
    }

    @Override // defpackage.m7p
    public final Object a(View view, fs0 fs0Var, kuk kukVar) throws Throwable {
        Object objA = a("addFriendlyObstruction", (cr9) new ipa(this, view, fs0Var, (mt5) null), (nt5) kukVar);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.m7p
    public final Object a(View view, mt5 mt5Var) {
        Object objA;
        return (!this.m && (objA = a("updateRegisteredAdView", (cr9) new im4(this, (ViewGroup) view, (mt5) null), (nt5) mt5Var)) == px5.a) ? objA : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #6 {all -> 0x00f9, blocks: (B:43:0x00c6, B:45:0x00ca, B:48:0x00d0, B:50:0x00d4, B:53:0x00da), top: B:85:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #6 {all -> 0x00f9, blocks: (B:43:0x00c6, B:45:0x00ca, B:48:0x00d0, B:50:0x00d4, B:53:0x00da), top: B:85:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, cr9 r16, nt5 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b82.a(java.lang.String, cr9, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, boolean r19, ads_mobile_sdk.z31 r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b82.a(java.lang.String, boolean, ads_mobile_sdk.z31, nt5):java.lang.Object");
    }

    public final Object a(mt5 mt5Var) throws Throwable {
        Object objB = b(this, (nt5) mt5Var);
        return objB == px5.a ? objB : Unit.a;
    }

    public final Object i(mt5 mt5Var) {
        return d(this, (nt5) mt5Var);
    }

    @Override // defpackage.m7p
    public final Object l(lp3 lp3Var) {
        return c(this, lp3Var);
    }

    @Override // defpackage.m7p
    public final Object m(pt0 pt0Var) throws Throwable {
        Object objA = a("measurePreviousView", (cr9) new km4((byte) 13, (mt5) null, this), (nt5) pt0Var);
        return objA == px5.a ? objA : Unit.a;
    }

    public final Object n(mt5 mt5Var) {
        Object objA;
        j82 j82Var = this.g.n;
        return ((j82Var != null ? j82Var.a : null) == i82.a && (objA = a("onAdClicked", new w72(3, null, (byte) 0), (nt5) mt5Var)) == px5.a) ? objA : Unit.a;
    }

    public final Object q(mt5 mt5Var) throws Throwable {
        Object objA = a("onAdImpression", new w72(3, null, (byte) 1), (nt5) mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }
}
