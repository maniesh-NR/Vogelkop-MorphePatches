package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ss extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ ws b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss(ws wsVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = wsVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ws wsVar = this.b;
        switch (b) {
            case 0:
                return new ss(wsVar, mt5Var, (byte) 0);
            default:
                return new ss(wsVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        ws wsVar = this.b;
        switch (b) {
            case 0:
                return new ss(wsVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new ss(wsVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0077 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.t
            ads_mobile_sdk.ws r1 = r7.b
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L2e;
                default: goto Lb;
            }
        Lb:
            px5 r0 = px5.a
            boolean r5 = r7.a
            if (r5 == 0) goto L1b
            if (r5 != r4) goto L17
            defpackage.ybh.y(r8)
            goto L2b
        L17:
            qp2.n(r3)
            goto L2d
        L1b:
            defpackage.ybh.y(r8)
            r7.a = r4
            r1.getClass()
            java.lang.Object r7 = ads_mobile_sdk.ws.a(r1, r7)
            if (r7 != r0) goto L2b
            r2 = r0
            goto L2d
        L2b:
            kotlin.Unit r2 = kotlin.Unit.a
        L2d:
            return r2
        L2e:
            ads_mobile_sdk.qr0 r0 = r1.f
            px5 r5 = px5.a
            boolean r6 = r7.a
            if (r6 == 0) goto L40
            if (r6 != r4) goto L3c
            defpackage.ybh.y(r8)
            goto L7b
        L3c:
            qp2.n(r3)
            goto L81
        L40:
            defpackage.ybh.y(r8)
        L43:
            r0.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            ads_mobile_sdk.fo r2 = ads_mobile_sdk.fo.a
            java.lang.String r3 = "gads:chrome_variations_refresh_enabled"
            java.lang.Object r8 = r0.a(r3, r8, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r0.getClass()
            on7 r8 = pn7.b
            r8 = 30
            un7 r2 = un7.f
            pn7 r8 = u0h.b(r8, r2)
            ads_mobile_sdk.fo r2 = ads_mobile_sdk.fo.a$20
            java.lang.String r3 = "gads:chrome_variations_refresh_interval_min"
            java.lang.Object r8 = r0.a(r3, r8, r2)
            pn7 r8 = (pn7) r8
            long r2 = r8.a
            r7.a = r4
            java.lang.Object r8 = defpackage.nb6.q(r2, r7)
            if (r8 != r5) goto L7b
            r2 = r5
            goto L81
        L7b:
            ads_mobile_sdk.ws.a(r1)
            goto L43
        L7f:
            kotlin.Unit r2 = kotlin.Unit.a
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ss.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
