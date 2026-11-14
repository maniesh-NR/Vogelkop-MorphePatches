package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o48 {
    public static final j8m a = new j8m(h50.u, h50.v);
    public static final a2k b = rm5.R(0.0f, 400.0f, null, 5);
    public static final a2k c = rm5.R(0.0f, 400.0f, null, 5);
    public static final a2k d;
    public static final a2k e;

    static {
        Map map = tan.a;
        d = rm5.R(0.0f, 400.0f, new ybb(4294967297L), 1);
        e = rm5.R(0.0f, 400.0f, new gcb(4294967297L), 1);
    }

    public static final void a(b3m b3mVar, Function0 function0, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1186853286);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(b3mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(function0) ? 32 : 16;
        }
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            t0g t0gVar = b3mVar.e;
            t0g t0gVar2 = b3mVar.d;
            boolean z = t0gVar.getValue() != null;
            if (Intrinsics.a(b3mVar.c(), t0gVar2.getValue()) && !z) {
                function0.invoke();
            }
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            Object obj2 = objK;
            if (objK == obj) {
                boolean[] zArr = {z};
                vt9Var.g0(zArr);
                obj2 = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj2;
            Object objK2 = vt9Var.K();
            if (objK2 == obj) {
                objK2 = new Object[1];
                vt9Var.g0(objK2);
            }
            Object[] objArr = (Object[]) objK2;
            if (!Intrinsics.a(objArr[0], t0gVar2.getValue())) {
                if (!z && !zArr2[0]) {
                    function0.invoke();
                }
                objArr[0] = t0gVar2.getValue();
            }
            zArr2[0] = z;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new h48(b3mVar, function0, i);
        }
    }

    public static x48 b(a2k a2kVar, rd3 rd3Var) {
        return c(rd3Var.equals(rbe.n) ? rbe.e : rd3Var.equals(rbe.p) ? rbe.g : rbe.f, a2kVar, new p9p((byte) 3, 1), true);
    }

    public static final x48 c(td3 td3Var, h49 h49Var, Function1 function1, boolean z) {
        return new x48(new a3m((co8) null, (ypj) null, new mr4(td3Var, h49Var, function1, z), (mli) null, (LinkedHashMap) null, 123));
    }

    public static x48 d(e8m e8mVar, int i) {
        sd3 sd3Var = rbe.m;
        sd3 sd3Var2 = rbe.k;
        h49 h49VarR = e8mVar;
        if ((i & 1) != 0) {
            Map map = tan.a;
            h49VarR = rm5.R(0.0f, 400.0f, new gcb(4294967297L), 1);
        }
        sd3 sd3Var3 = (i & 2) != 0 ? sd3Var : sd3Var2;
        return c(sd3Var3.equals(sd3Var2) ? rbe.c : sd3Var3.equals(sd3Var) ? rbe.i : rbe.f, h49VarR, new p9p((byte) 4, 1), (i & 4) != 0);
    }

    public static x48 e(h49 h49Var, int i) {
        if ((i & 1) != 0) {
            h49Var = rm5.R(0.0f, 400.0f, null, 5);
        }
        return new x48(new a3m(new co8(0.0f, h49Var), (ypj) null, (mr4) null, (mli) null, (LinkedHashMap) null, 126));
    }

    public static vh8 f(h49 h49Var, int i) {
        if ((i & 1) != 0) {
            h49Var = rm5.R(0.0f, 400.0f, null, 5);
        }
        return new vh8(new a3m(new co8(0.0f, h49Var), (ypj) null, (mr4) null, (mli) null, (LinkedHashMap) null, 126));
    }

    public static vh8 g(a2k a2kVar, rd3 rd3Var) {
        return h(a2kVar, rd3Var.equals(rbe.n) ? rbe.e : rd3Var.equals(rbe.p) ? rbe.g : rbe.f, new p9p((byte) 5, 1));
    }

    public static final vh8 h(a2k a2kVar, td3 td3Var, Function1 function1) {
        return new vh8(new a3m((co8) null, (ypj) null, new mr4(td3Var, a2kVar, function1, true), (mli) null, (LinkedHashMap) null, 123));
    }

    public static vh8 i() {
        Map map = tan.a;
        return h(rm5.R(0.0f, 400.0f, new gcb(4294967297L), 1), rbe.j, h50.y);
    }

    public static vh8 j() {
        Map map = tan.a;
        a2k a2kVarR = rm5.R(0.0f, 400.0f, new gcb(4294967297L), 1);
        sd3 sd3Var = rbe.m;
        return h(a2kVarR, sd3Var.equals(rbe.k) ? rbe.c : sd3Var.equals(sd3Var) ? rbe.i : rbe.f, new p9p((byte) 6, 1));
    }

    public static final x48 k(h49 h49Var, Function1 function1) {
        return new x48(new a3m((co8) null, new ypj(h49Var, new n48(function1, (byte) 0)), (mr4) null, (mli) null, (LinkedHashMap) null, 125));
    }
}
