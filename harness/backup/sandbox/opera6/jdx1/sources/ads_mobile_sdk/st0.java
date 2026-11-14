package ads_mobile_sdk;

import android.content.Context;
import android.widget.RelativeLayout;
import defpackage.bro;
import defpackage.fsg;
import defpackage.m7p;
import defpackage.rf4;
import defpackage.wp9;
import defpackage.xp9;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class st0 extends ks0 {
    public final g0 M;
    public final z2 N;
    public boolean O;
    public boolean P;

    public st0(Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, String str, av2 av2Var, a2 a2Var, g0 g0Var, z2 z2Var, m7p m7pVar, ax0 ax0Var, bro broVar) {
        super(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, str, av2Var, a2Var, m7pVar, ax0Var, broVar, Optional.empty());
        this.M = g0Var;
        this.N = z2Var;
        this.O = true;
        this.P = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r7.o(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.st0 r7, android.widget.RelativeLayout r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.rt0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.rt0 r0 = (ads_mobile_sdk.rt0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.rt0 r0 = new ads_mobile_sdk.rt0
            r0.<init>(r7, r9)
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
            goto L6e
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L34:
            ads_mobile_sdk.st0 r7 = r0.a
            defpackage.ybh.y(r9)
            goto L5d
        L3a:
            ads_mobile_sdk.st0 r7 = r0.a
            defpackage.ybh.y(r9)
            goto L4d
        L40:
            defpackage.ybh.y(r9)
            r0.a = r7
            r0.d = r6
            java.lang.Object r8 = super.a(r8, r0)
            if (r8 == r1) goto L6d
        L4d:
            boolean r8 = r7.O
            if (r8 == 0) goto L5d
            ads_mobile_sdk.z2 r8 = r7.N
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = r8.n(r0)
            if (r8 == r1) goto L6d
        L5d:
            boolean r8 = r7.P
            if (r8 == 0) goto L6e
            ads_mobile_sdk.z2 r7 = r7.N
            r0.a = r3
            r0.d = r4
            kotlin.Unit r7 = r7.o(r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.st0.a(ads_mobile_sdk.st0, android.widget.RelativeLayout, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r7.d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.st0 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.nt0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.nt0 r0 = (ads_mobile_sdk.nt0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.nt0 r0 = new ads_mobile_sdk.nt0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L6a
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L31:
            ads_mobile_sdk.st0 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L48
        L37:
            defpackage.ybh.y(r8)
            r0.a = r7
            r0.d = r5
            ads_mobile_sdk.cy0 r8 = r7.j()
            r8.o = r3
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 == r1) goto L69
        L48:
            ads_mobile_sdk.qr0 r8 = r7.e
            r8.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r5 = ads_mobile_sdk.fo.a
            java.lang.String r6 = "gad:interstitial_notify_publisher_without_delay"
            java.lang.Object r8 = r8.a(r6, r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6a
            r0.a = r3
            r0.d = r4
            kotlin.Unit r7 = r7.d(r0)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.st0.a(ads_mobile_sdk.st0, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.st0 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ot0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ot0 r0 = (ads_mobile_sdk.ot0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ot0 r0 = new ads_mobile_sdk.ot0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.st0 r5 = r0.a
            defpackage.ybh.y(r6)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = ads_mobile_sdk.mt0.a(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5d
            nx5 r6 = r5.d
            ads_mobile_sdk.pt0 r0 = new ads_mobile_sdk.pt0
            r1 = 0
            r0.<init>(r5, r3, r1)
            kotlin.coroutines.h r5 = kotlin.coroutines.h.a
            fsg r1 = new fsg
            r2 = 3
            r1.<init>(r0, r3, r2)
            r0 = 2
            defpackage.na2.B(r6, r5, r3, r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.st0.b(ads_mobile_sdk.st0, nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.ks0, ads_mobile_sdk.mt0
    public Object a(RelativeLayout relativeLayout, mt5 mt5Var) {
        return a(this, relativeLayout, (nt5) mt5Var);
    }

    @Override // ads_mobile_sdk.mt0, defpackage.o5p
    public Object a(xp9 xp9Var, mt5 mt5Var) {
        Object objA;
        return (this.P && (objA = this.N.a(xp9Var, mt5Var)) == px5.a) ? objA : Unit.a;
    }

    @Override // ads_mobile_sdk.mt0
    public Object b(nt5 nt5Var) {
        return a(this, nt5Var);
    }

    @Override // ads_mobile_sdk.mt0
    public final Unit d(mt5 mt5Var) {
        if (this.P && this.n.get()) {
            pt0 pt0Var = new pt0(this, null, (byte) 1);
            defpackage.na2.B(this.d, h.a, null, new fsg(pt0Var, null, (byte) 3), 2);
        }
        return Unit.a;
    }

    @Override // ads_mobile_sdk.mt0
    public final Object e(rf4 rf4Var) {
        Object objA = a(new xp9(wp9.INTERNAL_ERROR, "There was an internal error when attempting to show fullscreen content.", null), (mt5) rf4Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // ads_mobile_sdk.mt0, defpackage.o5p
    public final void onStop() {
        n();
    }
}
