package ads_mobile_sdk;

import defpackage.bhj;
import defpackage.f6p;
import defpackage.prb;
import java.util.UUID;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class al0 implements f6p {
    public final pfe a = new pfe();
    public ue1 c;

    public Object a(ue1 ue1Var, mt5 mt5Var) {
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (defpackage.na2.Z(r10, r11, r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[PHI: r9
      0x0092: PHI (r9v8 ads_mobile_sdk.ue1) = (r9v7 ads_mobile_sdk.ue1), (r9v14 ads_mobile_sdk.ue1) binds: [B:36:0x0090, B:20:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.zj r10, mt5 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.xk0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.xk0 r0 = (ads_mobile_sdk.xk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.xk0 r0 = new ads_mobile_sdk.xk0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L5e
            if (r2 == r7) goto L55
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3f
            if (r2 == r3) goto L36
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r8
        L36:
            java.lang.Object r9 = r0.a
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.ybh.y(r11)
            goto Lbc
        L3f:
            defpackage.ybh.y(r11)
            goto La3
        L43:
            java.lang.Object r9 = r0.a
            ads_mobile_sdk.ue1 r9 = (ads_mobile_sdk.ue1) r9
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> La6
            goto L92
        L4b:
            ads_mobile_sdk.ue1 r9 = r0.b
            java.lang.Object r10 = r0.a
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> La6
            goto L86
        L55:
            java.lang.Object r9 = r0.a
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            defpackage.ybh.y(r11)
            goto L6b
        L5e:
            defpackage.ybh.y(r11)
            r0.a = r10
            r0.e = r7
            java.lang.Object r11 = r9.b(r0)
            if (r11 == r1) goto Lba
        L6b:
            rap r11 = (defpackage.rap) r11
            boolean r9 = r11 instanceof ads_mobile_sdk.av0
            if (r9 == 0) goto L74
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L74:
            ads_mobile_sdk.hv0 r11 = (ads_mobile_sdk.hv0) r11
            java.lang.Object r9 = r11.b
            ads_mobile_sdk.ue1 r9 = (ads_mobile_sdk.ue1) r9
            r0.a = r10     // Catch: java.lang.Throwable -> La6
            r0.b = r9     // Catch: java.lang.Throwable -> La6
            r0.e = r6     // Catch: java.lang.Throwable -> La6
            java.lang.Object r11 = r9.d(r0)     // Catch: java.lang.Throwable -> La6
            if (r11 == r1) goto Lba
        L86:
            r0.a = r9     // Catch: java.lang.Throwable -> La6
            r0.b = r8     // Catch: java.lang.Throwable -> La6
            r0.e = r5     // Catch: java.lang.Throwable -> La6
            java.lang.Object r10 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> La6
            if (r10 == r1) goto Lba
        L92:
            dze r10 = dze.b
            ads_mobile_sdk.te1 r11 = new ads_mobile_sdk.te1
            r11.<init>(r9, r8, r6)
            r0.a = r8
            r0.e = r4
            java.lang.Object r9 = defpackage.na2.Z(r10, r11, r0)
            if (r9 == r1) goto Lba
        La3:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        La6:
            r10 = move-exception
            dze r11 = dze.b
            ads_mobile_sdk.te1 r2 = new ads_mobile_sdk.te1
            r2.<init>(r9, r8, r6)
            r0.a = r10
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = defpackage.na2.Z(r11, r2, r0)
            if (r9 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            r9 = r10
        Lbc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.a(ads_mobile_sdk.zj, mt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: all -> 0x00aa, PHI: r9 r11
      0x0096: PHI (r9v8 'this' ??) = (r9v18 'this' ??), (r9v19 'this' ??) binds: [B:37:0x0094, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:37:0x0094, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00aa, blocks: (B:21:0x004b, B:38:0x0096, B:24:0x0055, B:36:0x008a, B:34:0x007e), top: B:48:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v8, types: [ads_mobile_sdk.ue1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bhj r10, mt5 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.vk0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.vk0 r0 = (ads_mobile_sdk.vk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.vk0 r0 = new ads_mobile_sdk.vk0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L62
            if (r2 == r7) goto L59
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 == r3) goto L36
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r8
        L36:
            java.lang.Object r9 = r0.a
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.ybh.y(r11)
            goto Lc0
        L3f:
            java.lang.Object r9 = r0.a
            rap r9 = (defpackage.rap) r9
            defpackage.ybh.y(r11)
            return r9
        L47:
            java.lang.Object r9 = r0.a
            ads_mobile_sdk.ue1 r9 = (ads_mobile_sdk.ue1) r9
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> Laa
            goto L96
        L4f:
            ads_mobile_sdk.ue1 r9 = r0.b
            java.lang.Object r10 = r0.a
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> Laa
            goto L8a
        L59:
            java.lang.Object r9 = r0.a
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            defpackage.ybh.y(r11)
            goto L6f
        L62:
            defpackage.ybh.y(r11)
            r0.a = r10
            r0.e = r7
            java.lang.Object r11 = r9.b(r0)
            if (r11 == r1) goto Lbe
        L6f:
            rap r11 = (defpackage.rap) r11
            boolean r9 = r11 instanceof ads_mobile_sdk.av0
            if (r9 == 0) goto L78
            ads_mobile_sdk.av0 r11 = (ads_mobile_sdk.av0) r11
            return r11
        L78:
            ads_mobile_sdk.hv0 r11 = (ads_mobile_sdk.hv0) r11
            java.lang.Object r9 = r11.b
            ads_mobile_sdk.ue1 r9 = (ads_mobile_sdk.ue1) r9
            r0.a = r10     // Catch: java.lang.Throwable -> Laa
            r0.b = r9     // Catch: java.lang.Throwable -> Laa
            r0.e = r6     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r11 = r9.d(r0)     // Catch: java.lang.Throwable -> Laa
            if (r11 == r1) goto Lbe
        L8a:
            r0.a = r9     // Catch: java.lang.Throwable -> Laa
            r0.b = r8     // Catch: java.lang.Throwable -> Laa
            r0.e = r5     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> Laa
            if (r11 == r1) goto Lbe
        L96:
            rap r11 = (defpackage.rap) r11     // Catch: java.lang.Throwable -> Laa
            dze r10 = dze.b
            ads_mobile_sdk.te1 r2 = new ads_mobile_sdk.te1
            r2.<init>(r9, r8, r7)
            r0.a = r11
            r0.e = r4
            java.lang.Object r9 = defpackage.na2.Z(r10, r2, r0)
            if (r9 == r1) goto Lbe
            return r11
        Laa:
            r10 = move-exception
            dze r11 = dze.b
            ads_mobile_sdk.te1 r2 = new ads_mobile_sdk.te1
            r2.<init>(r9, r8, r7)
            r0.a = r10
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = defpackage.na2.Z(r11, r2, r0)
            if (r9 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            r9 = r10
        Lc0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.a(bhj, mt5):java.lang.Object");
    }

    @Override // defpackage.f6p
    public final Object a(String str, String str2, mt5 mt5Var) {
        return a(new bhj(str, str2, UUID.randomUUID(), (mt5) null), mt5Var);
    }

    public abstract Object a(String str, mt5 mt5Var);

    @Override // defpackage.f6p
    public final Object a(prb prbVar, mt5 mt5Var) throws Throwable {
        Object objA = a(new zj(prbVar, null), mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.a(r7, (mt5) r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.ue1 r7, mt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ok0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ok0 r0 = (ads_mobile_sdk.ok0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ok0 r0 = new ads_mobile_sdk.ok0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            ads_mobile_sdk.ue1 r7 = r0.b
            ads_mobile_sdk.al0 r6 = r0.a
            defpackage.ybh.y(r8)
            goto L4e
        L39:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.ue1 r8 = r6.c
            r6.c = r7
            if (r8 == 0) goto L4e
            r0.a = r6
            r0.b = r7
            r0.e = r5
            java.lang.Object r8 = r8.c(r0)
            if (r8 == r1) goto L5a
        L4e:
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.b(ads_mobile_sdk.ue1, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:19:0x0045, B:36:0x008d, B:38:0x0093, B:39:0x0096), top: B:58:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, blocks: (B:19:0x0045, B:36:0x008d, B:38:0x0093, B:39:0x0096), top: B:58:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(mt5 r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.b(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ads_mobile_sdk.ue1 r7, nt5 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.pk0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.pk0 r0 = (ads_mobile_sdk.pk0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.pk0 r0 = new ads_mobile_sdk.pk0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.a
            pfe r6 = (pfe) r6
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L6c
            goto L66
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L35:
            pfe r6 = r0.c
            ads_mobile_sdk.ue1 r7 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.al0 r2 = (ads_mobile_sdk.al0) r2
            defpackage.ybh.y(r8)
            r8 = r6
            r6 = r2
            goto L56
        L43:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.b = r7
            pfe r8 = r6.a
            r0.c = r8
            r0.f = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L64
        L56:
            r0.a = r8     // Catch: java.lang.Throwable -> L6f
            r0.b = r5     // Catch: java.lang.Throwable -> L6f
            r0.c = r5     // Catch: java.lang.Throwable -> L6f
            r0.f = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r6.b(r7, r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            r6 = r8
        L66:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L6c
            r6.l(r5)
            return r7
        L6c:
            r7 = move-exception
            r8 = r6
            goto L71
        L6f:
            r6 = move-exception
            r7 = r6
        L71:
            r8.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.c(ads_mobile_sdk.ue1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.tk0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.tk0 r0 = (ads_mobile_sdk.tk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.tk0 r0 = new ads_mobile_sdk.tk0
            nt5 r6 = (nt5) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            pfe r5 = r0.b
            ads_mobile_sdk.al0 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L48
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r6)
            r0.a = r5
            pfe r6 = r5.a
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            ads_mobile_sdk.ue1 r5 = r5.c     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L5a
            ads_mobile_sdk.cy0 r5 = r5.a     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.k     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L5a
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L5b
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L63
            r6.l(r4)
            return r5
        L63:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.c(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.uk0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.uk0 r0 = (ads_mobile_sdk.uk0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            ads_mobile_sdk.uk0 r0 = new ads_mobile_sdk.uk0
            nt5 r5 = (nt5) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            defpackage.ybh.y(r5)
            goto L3c
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            r0.c = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            rap r5 = (defpackage.rap) r5
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.al0.d(mt5):java.lang.Object");
    }
}
