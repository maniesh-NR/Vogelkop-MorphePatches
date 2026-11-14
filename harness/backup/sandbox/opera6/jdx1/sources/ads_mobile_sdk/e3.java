package ads_mobile_sdk;

import defpackage.mip;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class e3 extends sr {
    public final vz l;

    public e3(vz vzVar, qr0 qr0Var, g0 g0Var, ux2 ux2Var, mip mipVar, nx5 nx5Var) {
        super(mipVar, nx5Var, ux2Var, qr0Var, g0Var);
        this.l = vzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.e3 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.c3
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.c3 r0 = (ads_mobile_sdk.c3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.c3 r0 = new ads_mobile_sdk.c3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.ybh.y(r8)
            goto L50
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L2e:
            defpackage.ybh.y(r8)
            nx5 r8 = r7.d
            pv r2 = new pv
            r5 = 23
            r2.<init>(r5, r4, r7)
            kotlin.coroutines.h r7 = kotlin.coroutines.h.a
            wc2 r5 = new wc2
            r6 = 5
            r5.<init>(r2, r4, r6)
            r2 = 2
            i07 r7 = defpackage.na2.g(r8, r7, r4, r5, r2)
            r0.c = r3
            java.lang.Object r8 = r7.A(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            rap r8 = (defpackage.rap) r8
            if (r8 == 0) goto L62
            boolean r7 = r8 instanceof ads_mobile_sdk.av0
            if (r7 == 0) goto L5b
            ads_mobile_sdk.av0 r8 = (ads_mobile_sdk.av0) r8
            return r8
        L5b:
            ads_mobile_sdk.hv0 r8 = (ads_mobile_sdk.hv0) r8
            java.lang.Object r7 = r8.b
            r4 = r7
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r4
        L62:
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0
            ads_mobile_sdk.b3 r8 = new ads_mobile_sdk.b3
            r8.<init>(r4)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e3.a(ads_mobile_sdk.e3, nt5):java.lang.Object");
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.AD_ID_INFO;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        return a(this, (nt5) mt5Var);
    }

    @Override // ads_mobile_sdk.sr, ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        qr0 qr0Var = this.f;
        qr0Var.getClass();
        return ((Boolean) qr0Var.a("gads:ad_id_init_from_signal_source_enabled", Boolean.FALSE, fo.a)).booleanValue() ? sr.c(this, (nt5) mt5Var) : new hv0(Unit.a);
    }
}
