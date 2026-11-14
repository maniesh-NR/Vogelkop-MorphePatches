package ads_mobile_sdk;

import defpackage.ato;
import defpackage.vkp;

/* loaded from: classes.dex */
public final class m21 implements ato {
    public final vkp a;

    public m21(vkp vkpVar) {
        this.a = vkpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r5, java.util.Map r6, mt5 r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof ads_mobile_sdk.l21
            if (r5 == 0) goto L13
            r5 = r7
            ads_mobile_sdk.l21 r5 = (ads_mobile_sdk.l21) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            ads_mobile_sdk.l21 r5 = new ads_mobile_sdk.l21
            r5.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r5.a
            px5 r0 = px5.a
            int r1 = r5.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.ybh.y(r7)     // Catch: java.lang.Exception -> L62
            goto L67
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return r2
        L2e:
            defpackage.ybh.y(r7)
            java.lang.String r7 = "u"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "URL is missing from an httpTrack GMSG: "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5 = 6
            ads_mobile_sdk.xh3.a(r4, r2, r5)
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L50:
            vkp r4 = r4.a     // Catch: java.lang.Exception -> L62
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Exception -> L62
            r6.<init>(r7)     // Catch: java.lang.Exception -> L62
            r5.c = r3     // Catch: java.lang.Exception -> L62
            r7 = 30
            java.lang.Object r4 = defpackage.vkp.b(r4, r6, r2, r5, r7)     // Catch: java.lang.Exception -> L62
            if (r4 != r0) goto L67
            return r0
        L62:
            r4 = move-exception
            r5 = 0
            ads_mobile_sdk.xh3.a(r2, r4, r3, r5)
        L67:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m21.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    @Override // defpackage.ato
    public final int b() {
        return 6;
    }
}
