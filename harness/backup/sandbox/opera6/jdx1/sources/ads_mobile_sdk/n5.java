package ads_mobile_sdk;

import defpackage.hkm;
import defpackage.ijp;
import defpackage.vkp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n5 extends ijp {
    public final qr0 c;
    public final vkp d;
    public final nx5 e;

    public n5(qr0 qr0Var, vkp vkpVar, nx5 nx5Var) {
        this.c = qr0Var;
        this.d = vkpVar;
        this.e = nx5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.n5 r10, nt5 r11) {
        /*
            ads_mobile_sdk.fo r0 = ads_mobile_sdk.fo.a
            boolean r1 = r11 instanceof ads_mobile_sdk.m5
            if (r1 == 0) goto L15
            r1 = r11
            ads_mobile_sdk.m5 r1 = (ads_mobile_sdk.m5) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            ads_mobile_sdk.m5 r1 = new ads_mobile_sdk.m5
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.b
            px5 r2 = px5.a
            int r3 = r1.d
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2b
            ads_mobile_sdk.n5 r10 = r1.a
            defpackage.ybh.y(r11)
            goto L85
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L32:
            defpackage.ybh.y(r11)
            ads_mobile_sdk.qr0 r11 = r10.c
            r11.getClass()
            java.lang.String r3 = "gads:ad_request_http_client_enabled"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r11.a(r3, r5, r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L85
            vkp r3 = r10.d
            r11.getClass()
            r5 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$11
            java.lang.String r8 = "gads:ad_request_http_client_max_idle_connections"
            java.lang.Object r6 = r11.a(r8, r6, r7)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            on7 r7 = pn7.b
            un7 r7 = un7.f
            pn7 r5 = u0h.b(r5, r7)
            ads_mobile_sdk.fo r8 = ads_mobile_sdk.fo.a$20
            java.lang.String r9 = "gads:ad_request_http_client_connection_pool_keep_alive_minutes"
            java.lang.Object r11 = r11.a(r9, r5, r8)
            pn7 r11 = (pn7) r11
            long r8 = r11.a
            long r7 = pn7.p(r8, r7)
            r1.a = r10
            r1.d = r4
            java.lang.Object r11 = r3.a(r6, r7, r1)
            if (r11 != r2) goto L85
            return r2
        L85:
            ads_mobile_sdk.qr0 r11 = r10.c
            r11.getClass()
            java.lang.String r1 = "gads:preconnect_initialization_task_enabled"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r11.a(r1, r2, r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9d
            r10.b()
        L9d:
            ads_mobile_sdk.hv0 r10 = new ads_mobile_sdk.hv0
            kotlin.Unit r11 = kotlin.Unit.a
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n5.a(ads_mobile_sdk.n5, nt5):java.lang.Object");
    }

    public final void b() {
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        Iterator it = ((List) qr0Var.a("gads:preconnect_urls", Arrays.asList("https://googleads.g.doubleclick.net", "https://pubads.g.doubleclick.net"), fo.a$15)).iterator();
        while (it.hasNext()) {
            defpackage.na2.B(this.e, null, null, new hkm(this, (String) it.next(), null, (byte) 25), 3);
        }
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        return a(this, (nt5) mt5Var);
    }
}
