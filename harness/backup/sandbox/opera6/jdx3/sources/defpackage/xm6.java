package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class xm6 extends kr implements Function1 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xm6(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.p0o
            if (r0 == 0) goto L13
            r0 = r5
            p0o r0 = (defpackage.p0o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            p0o r0 = new p0o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r5)
            goto L5f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            ybh.y(r5)
            java.lang.Object r4 = r4.a
            i0o r4 = (defpackage.i0o) r4
            r0.v = r3
            r4.getClass()
            nh4 r5 = new nh4
            mt5 r0 = hib.b(r0)
            r5.<init>(r3, r0)
            r5.s()
            com.opera.android.Lazy r4 = r4.c
            java.lang.Object r4 = r4.get()
            qln r4 = (defpackage.qln) r4
            ami r4 = r4.f
            dak r0 = new dak
            r0.<init>(r5, r3)
            r4.r(r0)
            java.lang.Object r4 = r5.q()
            if (r4 != r1) goto L5f
            return r1
        L5f:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.d(mt5):java.lang.Object");
    }

    public final Object invoke(Object obj) {
        byte b = this.h;
        Object obj2 = ((kr) this).a;
        switch (b) {
            case 0:
                iz2 iz2Var = (iz2) obj;
                ml6 ml6Var = (ml6) obj2;
                gz2 gz2VarO = xvg.o(ml6Var.a);
                if (gz2VarO != null) {
                    ml6Var.b = new z8b(iz2Var, gz2VarO);
                    xm6 xm6Var = gz2VarO.d;
                    if (xm6Var != null) {
                        xm6Var.invoke(iz2Var);
                    }
                }
                return Unit.a;
            case 1:
                ((dfe) obj2).c((joi) obj);
                return Unit.a;
            case 2:
                Object objC = ((dfg) obj2).c((mt5) obj);
                return objC != px5.a ? Unit.a : objC;
            default:
                return d((mt5) obj);
        }
    }
}
