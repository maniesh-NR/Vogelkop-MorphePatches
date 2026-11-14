package ads_mobile_sdk;

import defpackage.qn;
import defpackage.rnp;
import defpackage.udj;
import defpackage.un;
import defpackage.y7h;
import defpackage.yrc;
import defpackage.zq;

/* loaded from: classes.dex */
public final class vd1 extends y7h {
    public final ji a;
    public final udj b;

    public vd1(ji jiVar, udj udjVar) {
        this.a = jiVar;
        this.b = udjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.td1 r8, nt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.ud1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ud1 r0 = (ads_mobile_sdk.ud1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ud1 r0 = new ads_mobile_sdk.ud1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ads_mobile_sdk.ji r7 = r0.a
            defpackage.ybh.y(r9)
            goto L45
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.ji r9 = r7.a
            r0.a = r9
            r0.d = r3
            udj r7 = r7.b
            java.lang.Object r7 = r7.invoke(r8, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            r6 = r9
            r9 = r7
            r7 = r6
        L45:
            r7.getClass()
            r2 = r9
            ads_mobile_sdk.tl r2 = (ads_mobile_sdk.tl) r2
            ads_mobile_sdk.ru0 r8 = defpackage.xgp.a
            r8.getClass()
            xgp r8 = ads_mobile_sdk.ru0.a()
            ads_mobile_sdk.sb0 r8 = (ads_mobile_sdk.sb0) r8
            ads_mobile_sdk.ah0 r8 = r8.u
            java.lang.Object r8 = r8.get()
            nx5 r8 = (nx5) r8
            cek r0 = new cek
            java.lang.Object r9 = r7.a
            r1 = r9
            tn r1 = (tn) r1
            java.lang.Object r7 = r7.b
            r3 = r7
            zq r3 = (defpackage.zq) r3
            r5 = 29
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 3
            defpackage.na2.B(r8, r4, r4, r0, r7)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vd1.a(ads_mobile_sdk.td1, nt5):java.lang.Object");
    }

    @Override // defpackage.y7h
    public final /* bridge */ /* synthetic */ Object a(rnp rnpVar, kuk kukVar) {
        return a((td1) rnpVar, (nt5) kukVar);
    }

    @Override // defpackage.y7h
    public final void a(yrc yrcVar) {
        tn tnVar = (tn) this.a.a;
        if (tnVar.a) {
            return;
        }
        tnVar.a = true;
        vml.e(new qn((un) tnVar.d, yrcVar, v50.n, null, (byte) 0));
        zq zqVar = (zq) tnVar.b;
        tl tlVar = zqVar.a;
        zqVar.a = null;
        zqVar.removeAllViews();
        zqVar.a();
        zqVar.b();
        if (tlVar != null) {
            tlVar.destroy();
        }
    }
}
