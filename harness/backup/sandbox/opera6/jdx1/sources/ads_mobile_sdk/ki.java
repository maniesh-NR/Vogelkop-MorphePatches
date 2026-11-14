package ads_mobile_sdk;

import android.content.Context;
import defpackage.mip;

/* loaded from: classes.dex */
public final class ki {
    public final Context a;
    public final ah3 b;
    public final mip c;
    public final zyk d = z4c.b(new qm(this, (byte) 26));

    public ki(Context context, ah3 ah3Var, mip mipVar) {
        this.a = context;
        this.b = ah3Var;
        this.c = mipVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ki r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ii
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ii r0 = (ads_mobile_sdk.ii) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ii r0 = new ads_mobile_sdk.ii
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.ki r5 = r0.a
            defpackage.ybh.y(r6)     // Catch: java.lang.Exception -> L61
            goto L5e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            r0.a = r5     // Catch: java.lang.Exception -> L61
            r0.d = r4     // Catch: java.lang.Exception -> L61
            nh4 r6 = new nh4     // Catch: java.lang.Exception -> L61
            mt5 r0 = hib.b(r0)     // Catch: java.lang.Exception -> L61
            r6.<init>(r4, r0)     // Catch: java.lang.Exception -> L61
            r6.s()     // Catch: java.lang.Exception -> L61
            zyk r0 = r5.d     // Catch: java.lang.Exception -> L61
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L61
            com.google.android.gms.appset.AppSetIdClient r0 = (com.google.android.gms.appset.AppSetIdClient) r0     // Catch: java.lang.Exception -> L61
            com.google.android.gms.tasks.Task r0 = r0.getAppSetIdInfo()     // Catch: java.lang.Exception -> L61
            ads_mobile_sdk.ji r2 = new ads_mobile_sdk.ji     // Catch: java.lang.Exception -> L61
            r2.<init>(r5, r6)     // Catch: java.lang.Exception -> L61
            r0.addOnCompleteListener(r2)     // Catch: java.lang.Exception -> L61
            java.lang.Object r6 = r6.q()     // Catch: java.lang.Exception -> L61
            if (r6 != r1) goto L5e
            return r1
        L5e:
            rap r6 = (defpackage.rap) r6     // Catch: java.lang.Exception -> L61
            return r6
        L61:
            r6 = move-exception
            ads_mobile_sdk.ah3 r5 = r5.b
            java.lang.String r0 = "Exception while getting AppSet Id"
            r5.a(r0, r6)
            ads_mobile_sdk.bv0 r5 = new ads_mobile_sdk.bv0
            r0 = 6
            r5.<init>(r6, r3, r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ki.a(ads_mobile_sdk.ki, nt5):java.lang.Object");
    }
}
