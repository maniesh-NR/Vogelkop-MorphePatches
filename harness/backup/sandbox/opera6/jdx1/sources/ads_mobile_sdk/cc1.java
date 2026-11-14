package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.prb;
import defpackage.rnp;
import defpackage.xe6;
import defpackage.xzh;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class cc1 implements rnp {
    private final a2 b;
    private final xv c;
    private final kh3 d;
    private final z2 f;
    private final ph0 g;
    private final se2 h;
    private final jz2 i;
    private final ve2 j;
    public xzh k;

    public cc1(String str, a2 a2Var, xv xvVar, kh3 kh3Var, z2 z2Var, ph0 ph0Var, se2 se2Var, jz2 jz2Var, ve2 ve2Var, defpackage.r83 r83Var) {
        this.b = a2Var;
        this.c = xvVar;
        this.d = kh3Var;
        this.f = z2Var;
        this.g = ph0Var;
        this.h = se2Var;
        this.i = jz2Var;
        this.j = ve2Var;
        r83Var.getClass();
        s8 s8Var = kh3Var.d;
        s8Var.b = str;
        s8Var.c = a2Var.e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (ads_mobile_sdk.se2.a(r7, r6, r2, r0) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.cc1 r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.bc1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.bc1 r0 = (ads_mobile_sdk.bc1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.bc1 r0 = new ads_mobile_sdk.bc1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r7)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            ads_mobile_sdk.cc1 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L46
        L37:
            defpackage.ybh.y(r7)
            ads_mobile_sdk.z2 r7 = r6.f
            r0.a = r6
            r0.d = r5
            java.lang.Object r7 = r7.i(r0)
            if (r7 == r1) goto L57
        L46:
            ads_mobile_sdk.se2 r7 = r6.h
            ads_mobile_sdk.jz2 r2 = r6.i
            r0.a = r3
            r0.d = r4
            r7.getClass()
            java.lang.Object r6 = ads_mobile_sdk.se2.a(r7, r6, r2, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cc1.a(ads_mobile_sdk.cc1, nt5):java.lang.Object");
    }

    @Override // defpackage.rnp
    public final kh3 a() {
        return this.d;
    }

    @Override // defpackage.rnp
    public Object a(xm2 xm2Var) {
        return a(this, xm2Var);
    }

    @Override // defpackage.rnp
    /* renamed from: a, reason: collision with other method in class */
    public final Unit mo0a(xm2 xm2Var) {
        px5 px5VarE = this.f.e();
        return px5VarE == px5.a ? px5VarE : Unit.a;
    }

    @Override // defpackage.rnp
    public final void a(xzh xzhVar) {
        this.k = xzhVar;
    }

    @Override // defpackage.rnp
    public final a2 b() {
        return this.b;
    }

    public final ve2 c() {
        return this.j;
    }

    @Override // defpackage.rnp
    public void destroy() {
        z2 z2Var = this.f;
        if (z2Var.f.getAndSet(true)) {
            return;
        }
        for (Map.Entry entry : ((Map) ((k8) z2Var).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var = null;
            defpackage.na2.B((nx5) ((k8) z2Var).a, h.a, null, new fsg(new xe6(str, value, mt5Var, (byte) 12), mt5Var, (byte) 3), 2);
        }
    }

    @Override // defpackage.rnp
    public prb g() {
        return null;
    }

    @Override // defpackage.rnp
    public final xzh getResponseInfo() {
        xzh xzhVar = this.k;
        if (xzhVar != null) {
            return xzhVar;
        }
        return null;
    }

    public final xv i() {
        return this.c;
    }

    public final ph0 j() {
        return this.g;
    }
}
