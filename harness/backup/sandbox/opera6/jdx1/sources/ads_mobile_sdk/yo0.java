package ads_mobile_sdk;

import android.content.Context;
import defpackage.bro;
import defpackage.m7p;
import defpackage.oap;
import defpackage.rf4;
import defpackage.vtp;
import defpackage.wp9;
import defpackage.xp9;
import defpackage.ybh;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class yo0 extends ks0 implements oap {
    public final k8 M;
    public final z2 N;
    public final ux2 O;
    public final kh3 P;
    public final AtomicBoolean Q;

    public yo0(Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, k8 k8Var, String str, z2 z2Var, tjp tjpVar, sy0 sy0Var, ux2 ux2Var, kh3 kh3Var, av2 av2Var, a2 a2Var, m7p m7pVar, ax0 ax0Var, bro broVar) {
        super(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, str, av2Var, a2Var, m7pVar, ax0Var, broVar, Optional.of(tjpVar));
        this.M = k8Var;
        this.N = z2Var;
        this.O = ux2Var;
        this.P = kh3Var;
        this.q = sy0Var;
        this.G = sy0Var;
        this.Q = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r6.o(r0) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.ks0, ads_mobile_sdk.mt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.widget.RelativeLayout r7, mt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.xo0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.xo0 r0 = (ads_mobile_sdk.xo0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.xo0 r0 = new ads_mobile_sdk.xo0
            nt5 r8 = (nt5) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.ybh.y(r8)
            goto L53
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L33:
            ads_mobile_sdk.yo0 r6 = r0.a
            defpackage.ybh.y(r8)
            goto L46
        L39:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.d = r5
            java.lang.Object r7 = super.a(r7, r0)
            if (r7 == r1) goto L52
        L46:
            ads_mobile_sdk.z2 r6 = r6.N
            r0.a = r3
            r0.d = r4
            kotlin.Unit r6 = r6.o(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yo0.a(android.widget.RelativeLayout, mt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.mt0, defpackage.o5p
    public final Object a(xp9 xp9Var, mt5 mt5Var) {
        Object objA = this.N.a(xp9Var, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.oap
    public final void a(Context context, boolean z, boolean z2) {
        fo foVar = fo.a;
        ux2 ux2Var = this.O;
        fw0 fw0Var = fw0.CUI_NAME_ADSHOW;
        List listSingletonList = Collections.singletonList(this.E.toString());
        kh3 kh3Var = this.P;
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08.a, true);
            try {
                this.M.b(e82.B(new Exception().getStackTrace()));
                if (!p()) {
                    rg3VarA.close();
                    return;
                }
                qr0 qr0Var = this.e;
                qr0Var.getClass();
                Boolean bool = Boolean.TRUE;
                if (((Boolean) qr0Var.a("gads:default_to_immersive:enabled", bool, foVar)).booleanValue()) {
                    qr0 qr0Var2 = this.e;
                    qr0Var2.getClass();
                    if (((Boolean) qr0Var2.a("gads:override_pub_immersive_setting:enabled", bool, foVar)).booleanValue() || !z2) {
                        this.u = true;
                    } else {
                        this.u = z;
                    }
                } else {
                    this.u = z;
                }
                a(context);
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
            this.M.b(e82.B(new Exception().getStackTrace()));
            if (!p()) {
                wk2VarA.close();
                return;
            }
            qr0 qr0Var3 = this.e;
            qr0Var3.getClass();
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) qr0Var3.a("gads:default_to_immersive:enabled", bool2, foVar)).booleanValue()) {
                qr0 qr0Var4 = this.e;
                qr0Var4.getClass();
                if (((Boolean) qr0Var4.a("gads:override_pub_immersive_setting:enabled", bool2, foVar)).booleanValue() || !z2) {
                    this.u = true;
                } else {
                    this.u = z;
                }
            } else {
                this.u = z;
            }
            a(context);
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
            boolean r0 = r9 instanceof ads_mobile_sdk.wo0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.wo0 r0 = (ads_mobile_sdk.wo0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.wo0 r0 = new ads_mobile_sdk.wo0
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
            ads_mobile_sdk.yo0 r8 = r0.a
            defpackage.ybh.y(r9)
            goto L72
        L3a:
            ads_mobile_sdk.yo0 r8 = r0.a
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
            ads_mobile_sdk.z2 r8 = r8.N
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
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yo0.b(nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.mt0
    public final Unit d(mt5 mt5Var) {
        Object objG;
        if (this.n.get() && (objG = this.N.g(mt5Var)) == px5.a) {
            return (Unit) objG;
        }
        return Unit.a;
    }

    @Override // ads_mobile_sdk.mt0
    public final Object e(rf4 rf4Var) {
        Object objA = a(new xp9(wp9.INTERNAL_ERROR, "There was an internal error when attempting to show fullscreen content.", null), (mt5) rf4Var);
        return objA == px5.a ? objA : Unit.a;
    }

    public final boolean p() {
        boolean zB = ybh.b(this.a);
        nx5 nx5Var = this.d;
        if (zB) {
            xu0.a("Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies", (Exception) null);
            xh3.a(nx5Var, new uo0(this, null, (byte) 0));
            xh3.a("Application process is in background", null, 6);
            return false;
        }
        if (!this.Q.getAndSet(true)) {
            return true;
        }
        xu0.a("This ad has already been shown.", (Exception) null);
        xh3.a(nx5Var, new uo0(this, null, (byte) 1));
        xh3.a("The ad has already been shown", null, 6);
        return false;
    }
}
