package ads_mobile_sdk;

import defpackage.fsg;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class fh2 implements rko {
    public final xj2 a;
    public final nx5 b;
    public final av2 c;
    public final qr0 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final pfe f = new pfe();
    public d3k g;
    public final boolean h;

    public fh2(xj2 xj2Var, nx5 nx5Var, av2 av2Var, qr0 qr0Var) {
        this.a = xj2Var;
        this.b = nx5Var;
        this.c = av2Var;
        this.d = qr0Var;
        boolean z = false;
        if (((Boolean) qr0Var.a("gads:ad_close_listener:enabled", Boolean.FALSE, fo.a)).booleanValue() && e82.E(new av2[]{av2.h, av2.j, av2.k, av2.e}).contains(av2Var)) {
            z = true;
        }
        this.h = z;
    }

    public final Unit e() {
        long j;
        fo foVar = fo.a$18;
        if (!this.h) {
            return Unit.a;
        }
        int iOrdinal = this.c.ordinal();
        byte b = 3;
        qr0 qr0Var = this.d;
        if (iOrdinal == 1) {
            qr0Var.getClass();
            on7 on7Var = pn7.b;
            j = ((pn7) qr0Var.a("gads:app_open_ad_close_timeout", u0h.b(3, un7.f), foVar)).a;
        } else if (iOrdinal == 4) {
            qr0Var.getClass();
            on7 on7Var2 = pn7.b;
            j = ((pn7) qr0Var.a("gads:interstitial_ad_close_timeout", u0h.b(3, un7.f), foVar)).a;
        } else if (iOrdinal == 6) {
            qr0Var.getClass();
            on7 on7Var3 = pn7.b;
            j = ((pn7) qr0Var.a("gads:rewarded_ad_close_timeout", u0h.b(3, un7.f), foVar)).a;
        } else if (iOrdinal != 7) {
            pn7.b.getClass();
            j = 0;
        } else {
            qr0Var.getClass();
            on7 on7Var4 = pn7.b;
            j = ((pn7) qr0Var.a("gads:rewarded_interstitial_ad_close_timeout", u0h.b(3, un7.f), foVar)).a;
        }
        if (pn7.k(j)) {
            eh2 eh2Var = new eh2(j, this, null);
            defpackage.na2.B(this.b, h.a, null, new fsg(eh2Var, null, b), 2);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(mt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.bh2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.bh2 r0 = (ads_mobile_sdk.bh2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.bh2 r0 = new ads_mobile_sdk.bh2
            nt5 r6 = (nt5) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            pfe r5 = r0.b
            ads_mobile_sdk.fh2 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L58
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r6)
            boolean r6 = r5.h
            if (r6 != 0) goto L40
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L40:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.e
            r2 = 0
            boolean r6 = r6.compareAndSet(r2, r3)
            if (r6 == 0) goto L7f
            r0.a = r5
            pfe r6 = r5.f
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            d3k r0 = r5.g     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L5f
            r0.k(r4)     // Catch: java.lang.Throwable -> L7a
        L5f:
            r5.g = r4     // Catch: java.lang.Throwable -> L7a
            r6.l(r4)
            nx5 r6 = r5.b
            zhl r0 = new zhl
            r1 = 14
            r0.<init>(r1, r4, r5)
            kotlin.coroutines.h r5 = kotlin.coroutines.h.a
            fsg r1 = new fsg
            r2 = 3
            r1.<init>(r0, r4, r2)
            r0 = 2
            defpackage.na2.B(r6, r5, r4, r1, r0)
            goto L7f
        L7a:
            r5 = move-exception
            r6.l(r4)
            throw r5
        L7f:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fh2.g(mt5):java.lang.Object");
    }
}
