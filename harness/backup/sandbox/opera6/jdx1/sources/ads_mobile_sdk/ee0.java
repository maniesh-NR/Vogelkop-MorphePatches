package ads_mobile_sdk;

import defpackage.rkp;
import defpackage.wdp;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final class ee0 implements rkp, wdp {
    public final Object a;
    public Object b;
    public Object c;
    public av2 d;
    public Object e;
    public Object f;
    public final /* synthetic */ byte g;

    public ee0(qr0 qr0Var, Optional optional, Optional optional2, sy2 sy2Var, av2 av2Var, defpackage.r83 r83Var) {
        this.g = (byte) 3;
        this.a = optional;
        this.b = optional2;
        this.c = sy2Var;
        this.d = av2Var;
        this.e = r83Var;
        qr0Var.getClass();
        this.f = (List) qr0Var.a("gad:scar_rtb_signal:enabled_list", Collections.singletonList("8"), fo.a$15);
    }

    public /* synthetic */ ee0(sb0 sb0Var, byte b) {
        this.g = b;
        this.a = sb0Var;
    }

    @Override // defpackage.rkp
    public final lw0 a() {
        return lw0.RTB_SIGNAL;
    }

    @Override // defpackage.rkp
    public final Object a() {
        switch (this.g) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.rkp
    public final Object a(defpackage.hp hpVar) {
        switch (this.g) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.rkp
    public final Object a(defpackage.r83 r83Var) {
        switch (this.g) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.rkp
    public final Object a$1() {
        switch (this.g) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.rkp
    public final Object b(boolean z) {
        switch (this.g) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.zy2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zy2 r0 = (ads_mobile_sdk.zy2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            ads_mobile_sdk.zy2 r0 = new ads_mobile_sdk.zy2
            nt5 r6 = (nt5) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            defpackage.ybh.y(r6)
            goto L60
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L30:
            defpackage.ybh.y(r6)
            java.lang.Object r6 = r5.b
            java.util.Optional r6 = (java.util.Optional) r6
            java.lang.Object r6 = r6.orElse(r4)
            gjj r6 = (defpackage.gjj) r6
            java.lang.Object r6 = r5.a
            java.util.Optional r6 = (java.util.Optional) r6
            java.lang.Object r6 = r6.orElse(r4)
            v23 r6 = (defpackage.v23) r6
            if (r6 == 0) goto L4d
            fq r4 = r6.l()
        L4d:
            java.lang.Object r6 = r5.c
            ads_mobile_sdk.sy2 r6 = (ads_mobile_sdk.sy2) r6
            ads_mobile_sdk.av2 r2 = r5.d
            java.lang.Object r5 = r5.e
            r83 r5 = (defpackage.r83) r5
            r0.c = r3
            java.io.Serializable r6 = r6.a(r4, r2, r5, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            java.util.List r6 = (java.util.List) r6
            ads_mobile_sdk.wy2 r5 = new ads_mobile_sdk.wy2
            r5.<init>(r6)
            ads_mobile_sdk.hv0 r6 = new ads_mobile_sdk.hv0
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ee0.d(mt5):java.lang.Object");
    }
}
