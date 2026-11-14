package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import defpackage.fsg;
import defpackage.o0g;
import defpackage.sbl;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class s52 extends k61 {
    public final Context c;
    public final CoroutineContext d;
    public final nx5 e;
    public final ah3 f;
    public final ux2 g;
    public final String h;
    public final ynb i;
    public final ji j;

    public s52(Context context, CoroutineContext coroutineContext, nx5 nx5Var, ah3 ah3Var, ux2 ux2Var, String str) {
        super((fw0) null, 3);
        this.c = context;
        this.d = coroutineContext;
        this.e = nx5Var;
        this.f = ah3Var;
        this.g = ux2Var;
        this.h = str;
        this.i = o0g.e();
        this.j = ji.a("Google", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.s52 r7, ads_mobile_sdk.cy0 r8, ads_mobile_sdk.z92 r9, ads_mobile_sdk.z31 r10, ads_mobile_sdk.t00 r11, ads_mobile_sdk.z92 r12, java.lang.String r13, nt5 r14) {
        /*
            boolean r1 = r14 instanceof ads_mobile_sdk.c52
            if (r1 == 0) goto L13
            r1 = r14
            ads_mobile_sdk.c52 r1 = (ads_mobile_sdk.c52) r1
            int r2 = r1.j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.j = r2
            goto L18
        L13:
            ads_mobile_sdk.c52 r1 = new ads_mobile_sdk.c52
            r1.<init>(r7, r14)
        L18:
            java.lang.Object r0 = r1.h
            px5 r2 = px5.a
            int r3 = r1.j
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L41
            if (r3 != r5) goto L3b
            java.lang.String r7 = r1.g
            ads_mobile_sdk.z92 r8 = r1.f
            ads_mobile_sdk.t00 r9 = r1.e
            ads_mobile_sdk.z31 r10 = r1.d
            ads_mobile_sdk.z92 r2 = r1.c
            ads_mobile_sdk.cy0 r3 = r1.b
            ads_mobile_sdk.s52 r1 = r1.a
            defpackage.ybh.y(r0)
            r6 = r3
            r3 = r9
            r9 = r6
            r6 = r8
            r8 = r1
            goto L63
        L3b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L41:
            defpackage.ybh.y(r0)
            ynb r0 = r7.i
            r1.a = r7
            r1.b = r8
            r1.c = r9
            r1.d = r10
            r1.e = r11
            r1.f = r12
            r1.g = r13
            r1.j = r5
            java.lang.Object r0 = r0.Z(r1)
            if (r0 != r2) goto L5d
            return r2
        L5d:
            r2 = r9
            r3 = r11
            r6 = r12
            r9 = r8
            r8 = r7
            r7 = r13
        L63:
            ads_mobile_sdk.u62 r0 = defpackage.ui6.r
            boolean r0 = r0.a
            if (r0 != 0) goto L6a
            return r4
        L6a:
            ads_mobile_sdk.ah3 r0 = r8.f
            ads_mobile_sdk.d52 r1 = new ads_mobile_sdk.d52
            r12 = r10
            r13 = r2
            r11 = r3
            r14 = r6
            r10 = r7
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r8 = "CreateOmidSession"
            java.lang.Object r7 = r0.d(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s52.a(ads_mobile_sdk.s52, ads_mobile_sdk.cy0, ads_mobile_sdk.z92, ads_mobile_sdk.z31, ads_mobile_sdk.t00, ads_mobile_sdk.z92, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.s52 r10, ads_mobile_sdk.cy0 r11, java.lang.String r12, java.lang.String r13, ads_mobile_sdk.t00 r14, ads_mobile_sdk.z31 r15, ads_mobile_sdk.z92 r16, ads_mobile_sdk.z92 r17, nt5 r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof ads_mobile_sdk.f52
            if (r1 == 0) goto L15
            r1 = r0
            ads_mobile_sdk.f52 r1 = (ads_mobile_sdk.f52) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            ads_mobile_sdk.f52 r1 = new ads_mobile_sdk.f52
            r1.<init>(r10, r0)
        L1a:
            java.lang.Object r0 = r1.i
            px5 r2 = px5.a
            int r3 = r1.k
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L44
            if (r3 != r5) goto L3e
            ads_mobile_sdk.z92 r10 = r1.h
            ads_mobile_sdk.z92 r11 = r1.g
            ads_mobile_sdk.z31 r12 = r1.f
            ads_mobile_sdk.t00 r2 = r1.e
            java.lang.String r3 = r1.d
            java.lang.String r5 = r1.c
            ads_mobile_sdk.cy0 r6 = r1.b
            ads_mobile_sdk.s52 r1 = r1.a
            defpackage.ybh.y(r0)
            r8 = r11
            r7 = r12
            r12 = r1
            r11 = r6
            goto L6c
        L3e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r4
        L44:
            defpackage.ybh.y(r0)
            ynb r0 = r10.i
            r1.a = r10
            r1.b = r11
            r1.c = r12
            r1.d = r13
            r1.e = r14
            r1.f = r15
            r8 = r16
            r1.g = r8
            r9 = r17
            r1.h = r9
            r1.k = r5
            java.lang.Object r0 = r0.Z(r1)
            if (r0 != r2) goto L66
            return r2
        L66:
            r5 = r12
            r3 = r13
            r2 = r14
            r7 = r15
            r12 = r10
            r10 = r9
        L6c:
            ads_mobile_sdk.u62 r0 = defpackage.ui6.r
            boolean r0 = r0.a
            if (r0 != 0) goto L73
            return r4
        L73:
            ads_mobile_sdk.ah3 r0 = r12.f
            ads_mobile_sdk.g52 r1 = new ads_mobile_sdk.g52
            r18 = r10
            r13 = r11
            r10 = r1
            r15 = r2
            r14 = r3
            r11 = r5
            r16 = r7
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r11 = "CreateJavascriptAdSession"
            java.lang.Object r10 = r0.d(r11, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s52.a(ads_mobile_sdk.s52, ads_mobile_sdk.cy0, java.lang.String, java.lang.String, ads_mobile_sdk.t00, ads_mobile_sdk.z31, ads_mobile_sdk.z92, ads_mobile_sdk.z92, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.s52 r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.k52
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.k52 r0 = (ads_mobile_sdk.k52) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.k52 r0 = new ads_mobile_sdk.k52
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r7)
            goto L47
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2e:
            defpackage.ybh.y(r7)
            ads_mobile_sdk.ah3 r7 = r6.f
            t78 r2 = new t78
            r5 = 4
            r2.<init>(r5, r3, r6)
            r0.c = r4
            r7.getClass()
            java.lang.String r6 = "ActivateOmid"
            java.lang.Object r6 = ads_mobile_sdk.ah3.c(r7, r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            ads_mobile_sdk.u62 r6 = defpackage.ui6.r
            boolean r6 = r6.a
            if (r6 != 0) goto L53
            java.lang.String r6 = "OMSDK failed to activate."
            r7 = 6
            ads_mobile_sdk.xh3.a(r6, r3, r7)
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s52.a(ads_mobile_sdk.s52, nt5):java.lang.Object");
    }

    public final Unit a(q6 q6Var, View view) {
        return (Unit) this.f.d("RegisterOmidAdView", new m53(q6Var, view, (byte) 22));
    }

    public final String b() {
        this.f.getClass();
        return "1.6.7-google_20260623";
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        mt5 mt5Var2 = null;
        sbl sblVar = new sbl((byte) 16, mt5Var2, (Object) this);
        defpackage.na2.B(this.e, h.a, null, new fsg(sblVar, mt5Var2, (byte) 3), 2);
        return new hv0(Unit.a);
    }
}
