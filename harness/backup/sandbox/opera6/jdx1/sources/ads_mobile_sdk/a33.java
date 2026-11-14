package ads_mobile_sdk;

import defpackage.kap;

/* loaded from: classes.dex */
public final class a33 {
    public final kap a;
    public final pfe b = new pfe();
    public u23 c;

    public a33(kap kapVar) {
        this.a = kapVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.a33 r7, kotlin.jvm.functions.Function1 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.y23
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.y23 r0 = (ads_mobile_sdk.y23) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.y23 r0 = new ads_mobile_sdk.y23
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            pfe r7 = r0.c
            ads_mobile_sdk.u23 r8 = r0.b
            ads_mobile_sdk.a33 r0 = r0.a
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L79
            goto L6e
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L37:
            ads_mobile_sdk.a33 r7 = r0.a
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L79
            goto L58
        L3d:
            defpackage.ybh.y(r9)
            kap r9 = r7.a     // Catch: java.lang.Throwable -> L79
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> L79
            qd6 r9 = (defpackage.qd6) r9     // Catch: java.lang.Throwable -> L79
            m76 r2 = new m76     // Catch: java.lang.Throwable -> L79
            r6 = 5
            r2.<init>(r8, r5, r6)     // Catch: java.lang.Throwable -> L79
            r0.a = r7     // Catch: java.lang.Throwable -> L79
            r0.f = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r9 = r9.a(r2, r0)     // Catch: java.lang.Throwable -> L79
            if (r9 == r1) goto L6b
        L58:
            r8 = r9
            ads_mobile_sdk.u23 r8 = (ads_mobile_sdk.u23) r8     // Catch: java.lang.Throwable -> L79
            pfe r9 = r7.b     // Catch: java.lang.Throwable -> L79
            r0.a = r7     // Catch: java.lang.Throwable -> L79
            r0.b = r8     // Catch: java.lang.Throwable -> L79
            r0.c = r9     // Catch: java.lang.Throwable -> L79
            r0.f = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r9.i(r0)     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r7
            r7 = r9
        L6e:
            r0.c = r8     // Catch: java.lang.Throwable -> L74
            r7.l(r5)     // Catch: java.lang.Throwable -> L79
            goto L8d
        L74:
            r8 = move-exception
            r7.l(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            vr3 r8 = ads_mobile_sdk.xu0.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to update shared settings: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            ads_mobile_sdk.xu0.c(r7, r5)
        L8d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a33.a(ads_mobile_sdk.a33, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.a33 r7, nt5 r8) throws m2 {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.v23
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.v23 r0 = (ads_mobile_sdk.v23) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.v23 r0 = new ads_mobile_sdk.v23
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L36
            pfe r7 = r0.c
            java.lang.Object r1 = r0.b
            ads_mobile_sdk.u23 r1 = (ads_mobile_sdk.u23) r1
            ads_mobile_sdk.a33 r0 = r0.a
            defpackage.ybh.y(r8)
            goto L9b
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r6
        L3c:
            ads_mobile_sdk.a33 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L7f
        L42:
            java.lang.Object r7 = r0.b
            pfe r7 = (pfe) r7
            ads_mobile_sdk.a33 r2 = r0.a
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r2
            goto L5f
        L4e:
            defpackage.ybh.y(r8)
            pfe r8 = r7.b
            r0.a = r7
            r0.b = r8
            r0.f = r5
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L97
        L5f:
            ads_mobile_sdk.u23 r2 = r7.c     // Catch: java.lang.Throwable -> La6
            r8.l(r6)
            if (r2 == 0) goto L67
            return r2
        L67:
            kap r8 = r7.a
            java.lang.Object r8 = r8.get()
            qd6 r8 = (defpackage.qd6) r8
            f99 r8 = r8.getData()
            r0.a = r7
            r0.b = r6
            r0.f = r4
            java.lang.Object r8 = defpackage.cs5.H(r8, r0)
            if (r8 == r1) goto L97
        L7f:
            ads_mobile_sdk.u23 r8 = (ads_mobile_sdk.u23) r8
            if (r8 != 0) goto L87
            ads_mobile_sdk.u23 r8 = ads_mobile_sdk.u23.o()
        L87:
            pfe r2 = r7.b
            r0.a = r7
            r0.b = r8
            r0.c = r2
            r0.f = r3
            java.lang.Object r0 = r2.i(r0)
            if (r0 != r1) goto L98
        L97:
            return r1
        L98:
            r0 = r7
            r1 = r8
            r7 = r2
        L9b:
            r0.c = r1     // Catch: java.lang.Throwable -> La1
            r7.l(r6)
            return r1
        La1:
            r8 = move-exception
            r7.l(r6)
            throw r8
        La6:
            r7 = move-exception
            r8.l(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a33.a(ads_mobile_sdk.a33, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.a33 r4, nt5 r5) throws m2 {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.w23
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.w23 r0 = (ads_mobile_sdk.w23) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.w23 r0 = new ads_mobile_sdk.w23
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)
            goto L3d
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            r0.c = r3
            r4.getClass()
            java.lang.Object r5 = a(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ads_mobile_sdk.u23 r5 = (ads_mobile_sdk.u23) r5
            int r4 = r5.q()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a33.b(ads_mobile_sdk.a33, nt5):java.lang.Object");
    }
}
