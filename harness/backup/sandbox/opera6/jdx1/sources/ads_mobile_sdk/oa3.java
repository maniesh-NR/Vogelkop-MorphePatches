package ads_mobile_sdk;

import defpackage.rap;
import defpackage.wdp;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class oa3 extends k61 implements wdp {
    public rap c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.oa3 r4, nt5 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.na3
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.na3 r0 = (ads_mobile_sdk.na3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.na3 r0 = new ads_mobile_sdk.na3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ads_mobile_sdk.oa3 r4 = r0.a
            defpackage.ybh.y(r5)
            goto L3e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r4.d(r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            rap r5 = (defpackage.rap) r5
            r4.c = r5
            ads_mobile_sdk.hv0 r4 = new ads_mobile_sdk.hv0
            kotlin.Unit r5 = kotlin.Unit.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oa3.a(ads_mobile_sdk.oa3, nt5):java.lang.Object");
    }

    @Override // defpackage.wdp
    public final Object c(mt5 mt5Var) {
        WeakHashMap weakHashMap = hh3.a;
        rg3 rg3VarA = hh3.a(fw0.CUI_NAME_SIGNAL, l08.a, true);
        try {
            hh3.a().e().t = new e63(mo15a(), 4);
            rap rapVar = this.c;
            if (rapVar == null) {
                rapVar = null;
            }
            if (rapVar instanceof av0) {
                xh3.a((av0) rapVar, false);
            }
            rg3VarA.close();
            return rapVar;
        } catch (Throwable th) {
            try {
                rg3VarA.b(th);
                if (th instanceof iyo) {
                    throw th;
                }
                rg3VarA.a(th);
                if (th instanceof kql) {
                    throw new uw0((kql) th);
                }
                if (th instanceof CancellationException) {
                    throw new ou0(th);
                }
                if (th instanceof mv0) {
                    throw th;
                }
                throw new tu0(th);
            } finally {
            }
        }
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        return a(this, (nt5) mt5Var);
    }
}
