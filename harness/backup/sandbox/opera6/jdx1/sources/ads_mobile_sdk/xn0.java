package ads_mobile_sdk;

import android.content.Context;
import defpackage.bro;
import defpackage.c26;
import defpackage.fsg;
import defpackage.m7p;
import defpackage.oap;
import defpackage.vtp;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class xn0 extends ks0 implements oap {
    public final z2 M;
    public final ux2 N;
    public final kh3 O;

    public xn0(Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, String str, z2 z2Var, tjp tjpVar, sy0 sy0Var, ux2 ux2Var, kh3 kh3Var, av2 av2Var, a2 a2Var, m7p m7pVar, ax0 ax0Var, bro broVar) {
        super(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, str, av2Var, a2Var, m7pVar, ax0Var, broVar, Optional.of(tjpVar));
        this.M = z2Var;
        this.N = ux2Var;
        this.O = kh3Var;
        this.q = sy0Var;
        this.G = sy0Var;
        new AtomicBoolean(false);
    }

    @Override // defpackage.obp
    public final Unit a(nt5 nt5Var) {
        px5 px5VarD = d(nt5Var);
        return px5VarD == px5.a ? px5VarD : Unit.a;
    }

    @Override // ads_mobile_sdk.mt0, defpackage.obp
    public final void a(ev evVar) {
        mt5 mt5Var = null;
        sn0 sn0Var = new sn0(this, mt5Var, (byte) 0);
        defpackage.na2.B(this.d, h.a, null, new fsg(sn0Var, mt5Var, (byte) 3), 2);
    }

    @Override // defpackage.oap
    public final void a(Context context, boolean z, boolean z2) {
        ux2 ux2Var = this.N;
        fw0 fw0Var = fw0.CUI_NAME_ADSHOW;
        List listSingletonList = Collections.singletonList(this.E.toString());
        kh3 kh3Var = this.O;
        byte b = 2;
        mt5 mt5Var = null;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08.a, true);
            try {
                xu0.a("show() is not supported for cross-process ad. Use getView() instead.", (Exception) null);
                xh3.a(this.d, new sn0(this, mt5Var, b));
                xh3.a("show() is not supported for cross-process ad.", null, 6);
                rg3VarA.close();
                return;
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
                    if (!(th instanceof mv0)) {
                        throw new tu0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, listSingletonList, kh3Var);
        try {
            xu0.a("show() is not supported for cross-process ad. Use getView() instead.", (Exception) null);
            xh3.a(this.d, new sn0(this, mt5Var, b));
            xh3.a("show() is not supported for cross-process ad.", null, 6);
            wk2VarA.close();
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
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
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r8.a(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.mt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.rn0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.rn0 r0 = (ads_mobile_sdk.rn0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.rn0 r0 = new ads_mobile_sdk.rn0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.ybh.y(r9)
            goto L7f
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L34:
            ads_mobile_sdk.xn0 r8 = r0.a
            defpackage.ybh.y(r9)
            goto L72
        L3a:
            ads_mobile_sdk.xn0 r8 = r0.a
            defpackage.ybh.y(r9)
            goto L51
        L40:
            defpackage.ybh.y(r9)
            r0.a = r8
            r0.d = r6
            ads_mobile_sdk.cy0 r9 = r8.j()
            r9.o = r3
            kotlin.Unit r9 = kotlin.Unit.a
            if (r9 == r1) goto L7e
        L51:
            ads_mobile_sdk.qr0 r9 = r8.e
            r9.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a
            java.lang.String r7 = "gad:interstitial_notify_publisher_without_delay"
            java.lang.Object r9 = r9.a(r7, r2, r6)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L72
            r0.a = r8
            r0.d = r5
            kotlin.Unit r9 = r8.d(r0)
            if (r9 == r1) goto L7e
        L72:
            ads_mobile_sdk.z2 r8 = r8.M
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xn0.b(nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.mt0
    public final Unit d(mt5 mt5Var) {
        Object objG;
        if (this.n.get() && (objG = this.M.g(mt5Var)) == px5.a) {
            return (Unit) objG;
        }
        return Unit.a;
    }

    @Override // defpackage.oap
    public final void d() {
        ux2 ux2Var = this.N;
        fw0 fw0Var = fw0.CUI_NAME_ADSHOW_WITH_VIEW;
        List listSingletonList = Collections.singletonList(this.E.toString());
        kh3 kh3Var = this.O;
        mt5 mt5Var = null;
        byte b = 1;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08.a, true);
            try {
                this.n.set(true);
                ((cy0) this.H.getValue()).o = this;
                c26.K(new sn0(this, mt5Var, b));
                a();
                rg3VarA.close();
                return;
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
                    if (!(th instanceof mv0)) {
                        throw new tu0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, listSingletonList, kh3Var);
        try {
            this.n.set(true);
            ((cy0) this.H.getValue()).o = this;
            c26.K(new sn0(this, mt5Var, b));
            a();
            wk2VarA.close();
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
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
            } finally {
            }
        }
    }
}
