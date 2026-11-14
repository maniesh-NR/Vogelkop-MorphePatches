package ads_mobile_sdk;

import defpackage.vtp;
import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class u30 extends k61 {
    public final nx5 c;
    public final ux2 d;
    public final ah3 e;
    public final qr0 f;

    public u30(nx5 nx5Var, ux2 ux2Var, ah3 ah3Var, qr0 qr0Var) {
        super((fw0) null, 3);
        this.c = nx5Var;
        this.d = ux2Var;
        this.e = ah3Var;
        this.f = qr0Var;
    }

    public final void c() {
        ux2 ux2Var = this.d;
        fw0 fw0Var = fw0.CUI_NAME_SDKINIT_INIT_CRYPTO;
        l08 l08Var = l08.a;
        kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
        if (hh3.b().a == null) {
            wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
            try {
                try {
                    a20.a();
                } catch (GeneralSecurityException e) {
                    this.e.a("CryptoUtil: AeadConfig.register()", (Throwable) e);
                }
                wk2VarA.close();
                return;
            } catch (Throwable th) {
                try {
                    wk2VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    wk2VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (!(th instanceof mv0)) {
                        throw new tu0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(wk2VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
        try {
            try {
                a20.a();
            } catch (Throwable th4) {
                try {
                    rg3VarA.b(th4);
                    if (th4 instanceof iyo) {
                        throw th4;
                    }
                    rg3VarA.a(th4);
                    if (th4 instanceof kql) {
                        throw new uw0((kql) th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new ou0(th4);
                    }
                    if (!(th4 instanceof mv0)) {
                        throw new tu0(th4);
                    }
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        vtp.v(rg3VarA, th5);
                        throw th6;
                    }
                }
            }
        } catch (GeneralSecurityException e2) {
            this.e.a("CryptoUtil: AeadConfig.register()", (Throwable) e2);
        }
        rg3VarA.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.k61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(mt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.s30
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.s30 r0 = (ads_mobile_sdk.s30) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.s30 r0 = new ads_mobile_sdk.s30
            nt5 r8 = (nt5) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.u30 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L57
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L32:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.qr0 r8 = r7.f
            r8.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r5 = ads_mobile_sdk.fo.a
            java.lang.String r6 = "gads:block_init_on_crypto:enabled"
            java.lang.Object r8 = r8.a(r6, r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L74
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.mfh.y(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            nx5 r8 = r7.c
            u6k r0 = new u6k
            r1 = 28
            r0.<init>(r1, r3, r7)
            kotlin.coroutines.h r7 = kotlin.coroutines.h.a
            fsg r1 = new fsg
            r2 = 3
            r1.<init>(r0, r3, r2)
            r0 = 2
            defpackage.na2.B(r8, r7, r3, r1, r0)
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0
            kotlin.Unit r8 = kotlin.Unit.a
            r7.<init>(r8)
            return r7
        L74:
            r7.c()
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0
            kotlin.Unit r8 = kotlin.Unit.a
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.u30.h(mt5):java.lang.Object");
    }
}
