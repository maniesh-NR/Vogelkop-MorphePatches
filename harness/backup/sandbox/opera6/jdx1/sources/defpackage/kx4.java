package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class kx4 implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kx4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        char c = 1;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                nv4 nv4Var = (nv4) obj;
                ih5 ih5Var = (ih5) obj2;
                ((Number) obj3).intValue();
                ((uji) obj4).b(nv4Var.c, gyg.P(-433908510, new o31(nv4Var, c == true ? 1 : 0), ih5Var), ih5Var, 48);
                return Unit.a;
            case 1:
                long j = ((u95) obj).a;
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((vt9) ih5Var2).e(j) ? 4 : 2;
                }
                vt9 vt9Var = (vt9) ih5Var2;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    sw6.b(((sfl) obj4).c, j, vt9Var, (iIntValue << 3) & 112);
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
            default:
                c8e c8eVar = (c8e) obj;
                ((Number) obj3).intValue();
                vt9 vt9Var2 = (vt9) ((ih5) obj2);
                vt9Var2.W(-1498516085);
                a2k a2kVarY = nb6.Y(jae.b, vt9Var2);
                a2k a2kVarY2 = nb6.Y(jae.d, vt9Var2);
                b3m b3mVar = (b3m) obj4;
                j8m j8mVar = a26.e;
                Object objC = b3mVar.c();
                t0g t0gVar = b3mVar.d;
                boolean zBooleanValue = ((Boolean) objC).booleanValue();
                vt9Var2.W(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                vt9Var2.p(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) t0gVar.getValue()).booleanValue();
                vt9Var2.W(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                vt9Var2.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                b3mVar.f();
                vt9Var2.W(386845748);
                vt9Var2.p(false);
                w2m w2mVarN = r9h.n(b3mVar, fValueOf, fValueOf2, a2kVarY, j8mVar, vt9Var2, 196608);
                boolean zBooleanValue3 = ((Boolean) b3mVar.c()).booleanValue();
                vt9Var2.W(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                vt9Var2.p(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) t0gVar.getValue()).booleanValue();
                vt9Var2.W(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                vt9Var2.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                b3mVar.f();
                vt9Var2.W(-281714272);
                vt9Var2.p(false);
                c8e c8eVarP = z5i.P(c8eVar, ((Number) w2mVarN.h.getValue()).floatValue(), ((Number) w2mVarN.h.getValue()).floatValue(), ((Number) r9h.n(b3mVar, fValueOf3, fValueOf4, a2kVarY2, j8mVar, vt9Var2, 196608).h.getValue()).floatValue(), 0.0f, null, 131064);
                vt9Var2.p(false);
                return c8eVarP;
        }
    }
}
