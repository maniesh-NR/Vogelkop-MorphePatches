package defpackage;

import com.opera.android.weather.ui.WeatherWidgetActivity;

/* loaded from: classes.dex */
public final class u74 implements wv9 {
    public static final long e;
    public final wv9 a;
    public volatile uv9 c;
    public final long b = e;
    public final pfe d = new pfe();

    static {
        on7 on7Var = pn7.b;
        e = cs5.x0(5, un7.f);
    }

    public u74(wv9 wv9Var) {
        this.a = wv9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.t74
            if (r0 == 0) goto L13
            r0 = r6
            t74 r0 = (defpackage.t74) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            t74 r0 = new t74
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r5 = r6.a
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r6)
            dj2 r6 = new dj2
            r6.<init>(r4, r3, r5)
            r0.v = r4
            java.lang.Object r5 = zch.A(r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u74.f(nt5):java.lang.Object");
    }

    @Override // defpackage.wv9
    public final Object g(WeatherWidgetActivity weatherWidgetActivity, mt5 mt5Var) {
        return this.a.g(weatherWidgetActivity, mt5Var);
    }
}
