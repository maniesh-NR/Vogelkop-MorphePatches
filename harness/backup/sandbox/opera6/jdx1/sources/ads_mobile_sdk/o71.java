package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.prb;

/* loaded from: classes.dex */
public final class o71 {
    public final sb a;
    public final ah3 b;

    public o71(sb sbVar, ah3 ah3Var) {
        this.a = sbVar;
        this.b = ah3Var;
        new pfe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.o71 r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.n71
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.n71 r0 = (ads_mobile_sdk.n71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.n71 r0 = new ads_mobile_sdk.n71
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            wpb r5 = r0.b
            ads_mobile_sdk.o71 r0 = r0.a
            defpackage.ybh.y(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L50
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ybh.y(r6)
            wpb r6 = new wpb
            r6.<init>()
            ads_mobile_sdk.sb r2 = r5.a
            r0.a = r5
            r0.b = r6
            r0.e = r3
            r2.getClass()
            java.lang.Object r0 = ads_mobile_sdk.sb.a(r2, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            ads_mobile_sdk.ma r1 = (ads_mobile_sdk.ma) r1
            jl6 r3 = r1.a     // Catch: java.lang.Exception -> L81
            sr r1 = r1.b     // Catch: java.lang.Exception -> L81
            r5.getClass()     // Catch: java.lang.Exception -> L81
            prb r1 = a(r2, r3, r1)     // Catch: java.lang.Exception -> L81
            r6.o(r1)     // Catch: java.lang.Exception -> L81
            goto L5a
        L81:
            r1 = move-exception
            ads_mobile_sdk.ah3 r2 = r5.b
            java.lang.String r3 = "InspectorAdapterInfo.updateAdapters"
            r2.a(r3, r1)
            goto L5a
        L8a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o71.a(ads_mobile_sdk.o71, mt5):java.lang.Object");
    }

    public static prb a(String str, jl6 jl6Var, defpackage.sr srVar) {
        String str2;
        String str3;
        prb prbVar = new prb();
        prbVar.r("adapterClassName", str);
        String str4 = "";
        if (srVar == null || (str2 = srVar.adapterVersion) == null) {
            str2 = "";
        }
        prbVar.r("version", str2);
        if (srVar != null && (str3 = srVar.sdkVersion) != null) {
            str4 = str3;
        }
        prbVar.r("sdkVersion", str4);
        prbVar.p(Integer.valueOf(((defpackage.rr) jl6Var.d) == defpackage.rr.c ? 1 : 0), NotificationCompat.CATEGORY_STATUS);
        prbVar.r("description", (String) jl6Var.e);
        prbVar.p(Integer.valueOf(jl6Var.b), "initializationLatencyMillis");
        prbVar.q("supportsInitialization", Boolean.valueOf(srVar != null));
        return prbVar;
    }
}
