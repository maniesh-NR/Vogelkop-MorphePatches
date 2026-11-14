package ads_mobile_sdk;

import defpackage.r7p;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class og0 implements r7p {
    public final qr0 a;
    public final ek b;
    public final vkp c;
    public final cg0 d;

    public og0(qr0 qr0Var, ek ekVar, vkp vkpVar, cg0 cg0Var) {
        this.a = qr0Var;
        this.b = ekVar;
        this.c = vkpVar;
        this.d = cg0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (defpackage.vkp.b(r7, r9, null, r10, 30) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.r7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.n13 r8, ads_mobile_sdk.a2 r9, defpackage.xzh r10, mt5 r11) {
        /*
            r7 = this;
            boolean r10 = r11 instanceof ads_mobile_sdk.ng0
            if (r10 == 0) goto L13
            r10 = r11
            ads_mobile_sdk.ng0 r10 = (ads_mobile_sdk.ng0) r10
            int r0 = r10.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.d = r0
            goto L1a
        L13:
            ads_mobile_sdk.ng0 r10 = new ads_mobile_sdk.ng0
            nt5 r11 = (nt5) r11
            r10.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r10.b
            px5 r0 = px5.a
            int r1 = r10.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.ybh.y(r11)
            goto L96
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r2
        L33:
            ads_mobile_sdk.og0 r7 = r10.a
            defpackage.ybh.y(r11)
            goto L7c
        L39:
            defpackage.ybh.y(r11)
            ads_mobile_sdk.ek r11 = r7.b
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.h
            boolean r11 = r11.get()
            if (r11 == 0) goto L99
            prb r11 = r9.A
            hgc r11 = r11.a
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L99
            ads_mobile_sdk.qr0 r11 = r7.a
            r11.getClass()
            ads_mobile_sdk.fo r1 = ads_mobile_sdk.fo.a$23
            java.lang.String r5 = "gads:drx_debug:send_debug_data_url"
            java.lang.String r6 = "https://www.google.com/dfp/sendDebugData"
            java.lang.Object r11 = r11.a(r5, r6, r1)
            java.lang.String r11 = (java.lang.String) r11
            ads_mobile_sdk.f13 r8 = r8.a
            r83 r8 = r8.a
            java.lang.String r8 = r8.m()
            prb r9 = r9.A
            r10.a = r7
            r10.d = r4
            ads_mobile_sdk.cg0 r1 = r7.d
            ads_mobile_sdk.d91 r1 = r1.j
            r1.getClass()
            java.lang.Comparable r11 = ads_mobile_sdk.d91.a(r1, r11, r8, r9, r10)
            if (r11 == r0) goto L95
        L7c:
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.String r8 = r11.toString()
            vkp r7 = r7.c
            java.net.URL r9 = new java.net.URL
            r9.<init>(r8)
            r10.a = r2
            r10.d = r3
            r8 = 30
            java.lang.Object r7 = defpackage.vkp.b(r7, r9, r2, r10, r8)
            if (r7 != r0) goto L96
        L95:
            return r0
        L96:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L99:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.og0.a(ads_mobile_sdk.n13, ads_mobile_sdk.a2, xzh, mt5):java.lang.Object");
    }
}
