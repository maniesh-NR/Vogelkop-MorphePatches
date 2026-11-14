package ads_mobile_sdk;

import defpackage.mip;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class su2 {
    public final mip a;
    public final pfe b = new pfe();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final HashSet e = new HashSet();

    public su2(mip mipVar) {
        this.a = mipVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Enum a(ads_mobile_sdk.su2 r6, java.lang.String r7, ads_mobile_sdk.av2 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.mu2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.mu2 r0 = (ads_mobile_sdk.mu2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.mu2 r0 = new ads_mobile_sdk.mu2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L31
            pfe r6 = r0.c
            java.lang.String r7 = r0.b
            ads_mobile_sdk.su2 r8 = r0.a
            defpackage.ybh.y(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L57
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L37:
            defpackage.ybh.y(r9)
            r6.getClass()
            java.lang.String r7 = a(r8, r7)
            if (r7 != 0) goto L46
            ads_mobile_sdk.pm0 r6 = ads_mobile_sdk.pm0.INVALID
            return r6
        L46:
            pfe r8 = r6.b
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            java.util.LinkedHashMap r6 = r6.d     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L6a
            ads_mobile_sdk.vf3 r6 = (ads_mobile_sdk.vf3) r6     // Catch: java.lang.Throwable -> L6a
            if (r6 == 0) goto L64
            ads_mobile_sdk.pm0 r6 = r6.e     // Catch: java.lang.Throwable -> L6a
            goto L66
        L64:
            ads_mobile_sdk.pm0 r6 = ads_mobile_sdk.pm0.INVALID     // Catch: java.lang.Throwable -> L6a
        L66:
            r8.l(r4)
            return r6
        L6a:
            r6 = move-exception
            r8.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su2.a(ads_mobile_sdk.su2, java.lang.String, ads_mobile_sdk.av2, nt5):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.su2 r6, defpackage.prb r7, java.lang.String r8, ads_mobile_sdk.av2 r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.ru2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.ru2 r0 = (ads_mobile_sdk.ru2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.ru2 r0 = new ads_mobile_sdk.ru2
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L36
            pfe r6 = r0.d
            java.lang.String r7 = r0.c
            prb r8 = r0.b
            ads_mobile_sdk.su2 r9 = r0.a
            defpackage.ybh.y(r10)
            r5 = r9
            r9 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
            goto L5e
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L3c:
            defpackage.ybh.y(r10)
            r6.getClass()
            java.lang.String r8 = a(r9, r8)
            if (r8 != 0) goto L4b
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L4b:
            pfe r9 = r6.b
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.d = r9
            r0.g = r3
            java.lang.Object r10 = r9.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            ads_mobile_sdk.vf3 r7 = defpackage.upj.d(r7)     // Catch: java.lang.Throwable -> L75
            if (r7 != 0) goto L6a
            java.util.LinkedHashMap r6 = r6.d     // Catch: java.lang.Throwable -> L75
            r6.remove(r8)     // Catch: java.lang.Throwable -> L75
            goto L6f
        L6a:
            java.util.LinkedHashMap r6 = r6.d     // Catch: java.lang.Throwable -> L75
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> L75
        L6f:
            r9.l(r4)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L75:
            r6 = move-exception
            r9.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su2.a(ads_mobile_sdk.su2, prb, java.lang.String, ads_mobile_sdk.av2, nt5):java.lang.Object");
    }

    public static String a(av2 av2Var, String str) {
        if (str == null || str.length() == 0 || av2Var == null) {
            return null;
        }
        return av2Var + "#" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.su2 r6, java.lang.String r7, ads_mobile_sdk.av2 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.nu2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.nu2 r0 = (ads_mobile_sdk.nu2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.nu2 r0 = new ads_mobile_sdk.nu2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L31
            pfe r6 = r0.c
            java.lang.String r7 = r0.b
            ads_mobile_sdk.su2 r8 = r0.a
            defpackage.ybh.y(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L57
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L37:
            defpackage.ybh.y(r9)
            r6.getClass()
            java.lang.String r7 = a(r8, r7)
            if (r7 != 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L46:
            pfe r8 = r6.b
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            java.util.LinkedHashMap r6 = r6.d     // Catch: java.lang.Throwable -> L65
            boolean r6 = r6.containsKey(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L65
            r8.l(r4)
            return r6
        L65:
            r6 = move-exception
            r8.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su2.b(ads_mobile_sdk.su2, java.lang.String, ads_mobile_sdk.av2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.su2 r6, java.lang.String r7, ads_mobile_sdk.av2 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.ou2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ou2 r0 = (ads_mobile_sdk.ou2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.ou2 r0 = new ads_mobile_sdk.ou2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r6 = r0.c
            java.lang.String r7 = r0.b
            ads_mobile_sdk.su2 r8 = r0.a
            defpackage.ybh.y(r9)
            goto L57
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L34:
            defpackage.ybh.y(r9)
            r6.getClass()
            java.lang.String r7 = a(r8, r7)
            if (r7 != 0) goto L43
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L43:
            pfe r8 = r6.b
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r5 = r8
            r8 = r6
            r6 = r5
        L57:
            java.util.LinkedHashMap r9 = r8.c     // Catch: java.lang.Throwable -> L67
            r9.remove(r7)     // Catch: java.lang.Throwable -> L67
            java.util.HashSet r8 = r8.e     // Catch: java.lang.Throwable -> L67
            r8.remove(r7)     // Catch: java.lang.Throwable -> L67
            r6.l(r4)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L67:
            r7 = move-exception
            r6.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su2.c(ads_mobile_sdk.su2, java.lang.String, ads_mobile_sdk.av2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.su2 r8, java.lang.String r9, ads_mobile_sdk.av2 r10, nt5 r11) {
        /*
            boolean r0 = r11 instanceof ads_mobile_sdk.pu2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.pu2 r0 = (ads_mobile_sdk.pu2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.pu2 r0 = new ads_mobile_sdk.pu2
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L31
            pfe r8 = r0.c
            java.lang.String r9 = r0.b
            ads_mobile_sdk.su2 r10 = r0.a
            defpackage.ybh.y(r11)
            r7 = r10
            r10 = r8
            r8 = r7
            goto L57
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L37:
            defpackage.ybh.y(r11)
            r8.getClass()
            java.lang.String r9 = a(r10, r9)
            if (r9 != 0) goto L46
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L46:
            pfe r10 = r8.b
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r3
            java.lang.Object r11 = r10.i(r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            java.util.LinkedHashMap r11 = r8.d     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r11 = r11.get(r9)     // Catch: java.lang.Throwable -> Ld0
            ads_mobile_sdk.vf3 r11 = (ads_mobile_sdk.vf3) r11     // Catch: java.lang.Throwable -> Ld0
            if (r11 != 0) goto L67
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Ld0
            r10.l(r4)
            return r8
        L67:
            int r0 = r11.a     // Catch: java.lang.Throwable -> Ld0
            java.util.HashSet r1 = r8.e     // Catch: java.lang.Throwable -> Ld0
            boolean r1 = r1.contains(r9)     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto L79
            java.lang.Integer r1 = r11.b     // Catch: java.lang.Throwable -> Ld0
            if (r1 == 0) goto L79
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> Ld0
        L79:
            if (r0 >= 0) goto L7c
            r0 = 0
        L7c:
            if (r0 > 0) goto L84
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Ld0
            r10.l(r4)
            return r8
        L84:
            java.util.LinkedHashMap r1 = r8.c     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r2 = r1.get(r9)     // Catch: java.lang.Throwable -> Ld0
            if (r2 != 0) goto L94
            i72 r2 = new i72     // Catch: java.lang.Throwable -> Ld0
            r2.<init>()     // Catch: java.lang.Throwable -> Ld0
            r1.put(r9, r2)     // Catch: java.lang.Throwable -> Ld0
        L94:
            i72 r2 = (i72) r2     // Catch: java.lang.Throwable -> Ld0
            mip r8 = r8.a     // Catch: java.lang.Throwable -> Ld0
            r8.getClass()     // Catch: java.lang.Throwable -> Ld0
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Throwable -> Ld0
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Ld0
            r2.addLast(r1)     // Catch: java.lang.Throwable -> Ld0
            long r5 = r11.c     // Catch: java.lang.Throwable -> Ld0
            long r5 = pn7.f(r5)     // Catch: java.lang.Throwable -> Ld0
            long r8 = r8 - r5
        Lae:
            boolean r11 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld0
            if (r11 != 0) goto Lca
            int r11 = r2.c     // Catch: java.lang.Throwable -> Ld0
            if (r11 > r0) goto Lc6
            java.lang.Object r11 = r2.first()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> Ld0
            long r5 = r11.longValue()     // Catch: java.lang.Throwable -> Ld0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 >= 0) goto Lca
        Lc6:
            defpackage.o95.w(r2)     // Catch: java.lang.Throwable -> Ld0
            goto Lae
        Lca:
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Ld0
            r10.l(r4)
            return r8
        Ld0:
            r8 = move-exception
            r10.l(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su2.d(ads_mobile_sdk.su2, java.lang.String, ads_mobile_sdk.av2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable e(ads_mobile_sdk.su2 r12, java.lang.String r13, ads_mobile_sdk.av2 r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su2.e(ads_mobile_sdk.su2, java.lang.String, ads_mobile_sdk.av2, nt5):java.lang.Comparable");
    }
}
