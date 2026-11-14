package ads_mobile_sdk;

import android.graphics.Rect;
import defpackage.r3p;
import java.util.Optional;

/* loaded from: classes.dex */
public final class js1 implements r3p {
    public final bq1 a;
    public final Optional b;
    public final nx5 c;
    public final pfe d = new pfe();
    public Rect e;

    public js1(bq1 bq1Var, Optional optional, nx5 nx5Var) {
        this.a = bq1Var;
        this.b = optional;
        this.c = nx5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.js1 r8, ads_mobile_sdk.nn3 r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.hs1
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.hs1 r0 = (ads_mobile_sdk.hs1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.hs1 r0 = new ads_mobile_sdk.hs1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            pfe r8 = r0.c
            ads_mobile_sdk.nn3 r9 = r0.b
            ads_mobile_sdk.js1 r0 = r0.a
            defpackage.ybh.y(r10)
            r3 = r0
            goto L4b
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L35:
            defpackage.ybh.y(r10)
            pfe r10 = r8.d
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r3 = r8
            r8 = r10
        L4b:
            r6 = 0
            java.util.Optional r10 = r3.b     // Catch: java.lang.Throwable -> L76
            java.lang.Object r10 = r10.orElse(r6)     // Catch: java.lang.Throwable -> L76
            r4 = r10
            ads_mobile_sdk.cy0 r4 = (ads_mobile_sdk.cy0) r4     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L70
            android.graphics.Rect r5 = r9.d     // Catch: java.lang.Throwable -> L76
            android.graphics.Rect r9 = r3.e     // Catch: java.lang.Throwable -> L76
            boolean r9 = r5.equals(r9)     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto L70
            r3.e = r5     // Catch: java.lang.Throwable -> L76
            nx5 r9 = r3.c     // Catch: java.lang.Throwable -> L76
            cek r2 = new cek     // Catch: java.lang.Throwable -> L76
            r7 = 16
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L76
            r10 = 3
            defpackage.na2.B(r9, r6, r6, r2, r10)     // Catch: java.lang.Throwable -> L76
        L70:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L76
            r8.l(r6)
            return r9
        L76:
            r0 = move-exception
            r9 = r0
            r8.l(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.js1.a(ads_mobile_sdk.js1, ads_mobile_sdk.nn3, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.js1 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.gs1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.gs1 r0 = (ads_mobile_sdk.gs1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.gs1 r0 = new ads_mobile_sdk.gs1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.js1 r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.d
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            android.graphics.Rect r5 = r5.e     // Catch: java.lang.Throwable -> L4c
            r6.l(r4)
            return r5
        L4c:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.js1.a(ads_mobile_sdk.js1, nt5):java.lang.Object");
    }

    @Override // defpackage.r3p
    public final Object b(nn3 nn3Var, mt5 mt5Var) {
        return a(this, nn3Var, (nt5) mt5Var);
    }
}
