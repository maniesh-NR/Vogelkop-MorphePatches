package ads_mobile_sdk;

import defpackage.ato;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class kv2 implements ato {
    public final pfe a = new pfe();
    public final HashMap b = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r7, java.util.Map r8, mt5 r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kv2.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, cd5 r7, nt5 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.jv2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.jv2 r0 = (ads_mobile_sdk.jv2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.jv2 r0 = new ads_mobile_sdk.jv2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            pfe r5 = r0.d
            cd5 r7 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.kv2 r0 = r0.a
            defpackage.ybh.y(r8)
            r8 = r5
            r5 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L38:
            defpackage.ybh.y(r8)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            pfe r8 = r5.a
            r0.d = r8
            r0.g = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.HashMap r5 = r5.b     // Catch: java.lang.Throwable -> L59
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L59
            r8.l(r4)
            return r5
        L59:
            r5 = move-exception
            r8.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kv2.a(java.lang.String, cd5, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.prb r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.iv2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.iv2 r0 = (ads_mobile_sdk.iv2) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ads_mobile_sdk.iv2 r0 = new ads_mobile_sdk.iv2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.g
            px5 r1 = px5.a
            int r2 = r0.i
            r3 = 1
            java.lang.String r4 = ""
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L3a
            pfe r8 = r0.f
            prb r9 = r0.e
            java.lang.String r1 = r0.d
            java.lang.String r2 = r0.c
            prb r3 = r0.b
            ads_mobile_sdk.kv2 r0 = r0.a
            defpackage.ybh.y(r10)
            r7 = r8
            r6 = r9
            r8 = r0
            r9 = r3
            goto L6d
        L3a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L40:
            defpackage.ybh.y(r10)
            java.lang.String r10 = "id"
            java.lang.String r2 = ads_mobile_sdk.bw2.a(r9, r10, r4)
            java.lang.String r10 = "fail"
            java.lang.String r10 = ads_mobile_sdk.bw2.a(r9, r10, r4)
            java.lang.String r6 = "result"
            prb r6 = ads_mobile_sdk.bw2.a(r9, r6, r5)
            r0.a = r8
            r0.b = r9
            r0.c = r2
            r0.d = r10
            r0.e = r6
            pfe r7 = r8.a
            r0.f = r7
            r0.i = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r1 = r10
        L6d:
            java.util.HashMap r8 = r8.b     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r8 = r8.remove(r2)     // Catch: java.lang.Throwable -> Ld5
            bd5 r8 = (bd5) r8     // Catch: java.lang.Throwable -> Ld5
            r7.l(r5)
            if (r8 != 0) goto L7d
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L7d:
            java.lang.String r10 = "fail_stack"
            java.lang.String r10 = ads_mobile_sdk.bw2.a(r9, r10, r4)
            java.lang.String r0 = "fail_reason"
            java.lang.String r9 = ads_mobile_sdk.bw2.a(r9, r0, r4)
            int r0 = r10.length()
            if (r0 != 0) goto L91
            java.lang.String r9 = "Unknown Fail Reason."
        L91:
            int r0 = r10.length()
            if (r0 == 0) goto L9b
            java.lang.String r4 = kik.c(r10)
        L9b:
            int r10 = r1.length()
            if (r10 <= 0) goto Lc3
            java.util.concurrent.CancellationException r10 = new java.util.concurrent.CancellationException
            java.lang.String r0 = sko.u(r9, r4)
            r10.<init>(r0)
            r8.k(r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r9 = 6
            ads_mobile_sdk.xh3.a(r8, r5, r9)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        Lc3:
            if (r6 != 0) goto Lcd
            cd5 r8 = (cd5) r8
            r8.j0(r5)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        Lcd:
            cd5 r8 = (cd5) r8
            r8.j0(r6)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        Ld5:
            r8 = move-exception
            r7.l(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kv2.a(prb, nt5):java.lang.Object");
    }

    @Override // defpackage.ato
    public final int b() {
        return 3;
    }
}
