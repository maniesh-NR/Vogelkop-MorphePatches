package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.leanplum.DeeplinkIntentCustomizer;
import com.opera.android.browser.chromium.ChromiumTurboTesterDelegate;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class hr5 implements kr5, DeeplinkIntentCustomizer, nwh, u38, wn8, fx8, psk, foa, kod, pqk, en8, poi {
    public static a36 a;

    public static y9c j(String str) {
        if (str == null || StringsKt.N(str)) {
            return y9c.b;
        }
        switch (str.hashCode()) {
            case -1529663740:
                if (str.equals("Rewards")) {
                    return y9c.e;
                }
                return null;
            case -1264033530:
                if (str.equals("Livescore")) {
                    return y9c.d;
                }
                return null;
            case -921985992:
                if (str.equals("Product and service news")) {
                    return y9c.b;
                }
                return null;
            case 3090994:
                if (str.equals("eSIM")) {
                    return y9c.g;
                }
                return null;
            case 268789959:
                if (str.equals("Weather forecast")) {
                    return y9c.c;
                }
                return null;
            case 903560720:
                if (str.equals("Weather alert")) {
                    return y9c.f;
                }
                return null;
            default:
                return null;
        }
    }

    public static int l(Context context) {
        return (N.MphJ2uhp() && ChromiumTurboTesterDelegate.a) ? context.getColor(2131103610) : f03.t(2130971163, context, 2131100356);
    }

    public final qsk b(ev4 ev4Var) {
        return new yo9((Context) ev4Var.d, (String) ev4Var.e, (e04) ev4Var.f, ev4Var.b, ev4Var.c);
    }

    @Override // com.leanplum.DeeplinkIntentCustomizer
    public final Intent customize(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            data = Uri.EMPTY;
        }
        return new wgf(data, lqm.i).b(context, "com.opera.android.action.OPEN_URL");
    }

    public final Object d(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    public final void e(pna pnaVar, Object obj) {
        pnaVar.d.f(mpa.m, new sqa((tqa) obj, pnaVar, (mt5) null));
    }

    public final void endTracks() {
    }

    public final Object f() {
        return new ArrayList();
    }

    public final long g(long j, long j2) {
        float fN = i41.n(j, j2);
        return (Float.floatToRawIntBits(fN) << 32) | (Float.floatToRawIntBits(fN) & 4294967295L);
    }

    public final jf2 getKey() {
        return tqa.c;
    }

    public final void h(twi twiVar) {
    }

    @Override // defpackage.pqk
    public final boolean i(int i) {
        return false;
    }

    public final Object k(Function1 function1) {
        function1.invoke(new a36());
        return new tqa();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.m0f r5, android.content.Context r6, nt5 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.u3i
            if (r0 == 0) goto L13
            r0 = r7
            u3i r0 = (defpackage.u3i) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            u3i r0 = new u3i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.v
            px5 r7 = px5.a
            int r1 = r0.x
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            android.net.Uri r5 = r0.u
            android.content.Context r6 = r0.t
            ybh.y(r4)
            goto L5d
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            return r2
        L32:
            ybh.y(r4)
            if (r5 != 0) goto L3a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L3a:
            java.lang.String r4 = r5.b
            if (r4 == 0) goto L84
            android.net.Uri r5 = ddh.y(r4)
            if (r5 == 0) goto L84
            java.lang.String r4 = r5.toString()
            boolean r4 = defpackage.wqm.s(r4)
            if (r4 == 0) goto L74
            lk6 r4 = defpackage.lk6.a
            r0.t = r6
            r0.u = r5
            r0.x = r3
            java.lang.Enum r4 = r4.d(r5, r6, r0)
            if (r4 != r7) goto L5d
            return r7
        L5d:
            jk6 r4 = (defpackage.jk6) r4
            int r4 = r4.ordinal()
            if (r4 == 0) goto L74
            if (r4 == r3) goto L71
            r5 = 2
            if (r4 == r5) goto L71
            r5 = 3
            if (r4 == r5) goto L71
            h9o.p()
            return r2
        L71:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L74:
            lk6 r4 = defpackage.lk6.a
            ik6 r4 = defpackage.ik6.b
            r7 = 0
            lqm r0 = defpackage.lqm.i
            boolean r4 = defpackage.lk6.f(r7, r4, r0, r6, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L84:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr5.m(m0f, android.content.Context, nt5):java.lang.Object");
    }

    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    public final void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    public final hyl track(int i, int i2) {
        return new s97();
    }
}
