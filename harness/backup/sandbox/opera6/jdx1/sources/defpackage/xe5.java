package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;

/* loaded from: classes.dex */
public final class xe5 implements cr9 {
    public static final xe5 b = new xe5((byte) 0);
    public static final xe5 c = new xe5((byte) 1);
    public static final xe5 d = new xe5((byte) 2);
    public static final xe5 e = new xe5((byte) 3);
    public static final xe5 f = new xe5((byte) 4);
    public static final xe5 g = new xe5((byte) 5);
    public static final xe5 h = new xe5((byte) 6);
    public final /* synthetic */ byte a;

    public /* synthetic */ xe5(byte b2) {
        this.a = b2;
    }

    public xe5(long j) {
        this.a = (byte) 7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Number) obj3).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (!vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    vt9Var.Q();
                }
                return Unit.a;
            case 1:
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (!vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 2:
                ih5 ih5Var3 = (ih5) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (!vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 3:
                ih5 ih5Var4 = (ih5) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (!vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 4:
                nsj nsjVar = (nsj) obj;
                ih5 ih5Var5 = (ih5) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((vt9) ih5Var5).f(nsjVar) ? 4 : 2;
                }
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (vt9Var5.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ioh.d(nsjVar, (c8e) null, (paj) null, 0L, 0L, 0L, 0L, 0L, vt9Var5, iIntValue5 & 14);
                } else {
                    vt9Var5.Q();
                }
                return Unit.a;
            case 5:
                _UtilCommonKt.closeQuietly((pzh) obj2);
                return Unit.a;
            case 6:
                return null;
            default:
                ih5 ih5Var6 = (ih5) obj2;
                ((Number) obj3).intValue();
                zvf zvfVar = ey4.a;
                vt9 vt9Var6 = (vt9) ih5Var6;
                vt9Var6.W(-1218863531);
                vt9Var6.p(false);
                vt9 vt9Var7 = (vt9) ih5Var6;
                Object objK = vt9Var7.K();
                if (objK == hh5.a) {
                    objK = hyg.k((Object) null);
                    vt9Var7.g0(objK);
                }
                afe afeVar = (afe) objK;
                tfd tfdVarC = nr3.c(rbe.f, false);
                int iT = mkh.t(ih5Var6);
                vt9 vt9Var8 = (vt9) ih5Var6;
                oag oagVarL = vt9Var8.l();
                c8e c8eVarP = qyn.P(ih5Var6, z7e.b);
                bh5.To.getClass();
                vt9Var8.a0();
                if (vt9Var8.S) {
                    vt9Var8.k(m3c.S);
                } else {
                    vt9Var8.j0();
                }
                y4h.o(ih5Var6, tfdVarC, ujp.f);
                y4h.o(ih5Var6, oagVarL, ujp.e);
                ah5 ah5Var = ujp.g;
                if (vt9Var8.S || !Intrinsics.a(vt9Var8.K(), Integer.valueOf(iT))) {
                    vep.x(iT, vt9Var8, iT, ah5Var);
                }
                y4h.o(ih5Var6, c8eVarP, ujp.d);
                Function2 function2 = (Function2) afeVar.getValue();
                if (function2 == null) {
                    vt9Var8.W(-2101783313);
                } else {
                    vt9Var8.W(-344894126);
                    function2.invoke(ih5Var6, 0);
                }
                vt9Var8.p(false);
                vt9Var8.p(true);
                return Unit.a;
        }
    }
}
