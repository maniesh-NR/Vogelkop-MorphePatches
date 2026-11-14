package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class mpj {
    public static final i39 a = new i39(p97.b);
    public static final i39 b;
    public static final i39 c;
    public static final t7o d;
    public static final t7o e;
    public static final t7o f;
    public static final t7o g;

    static {
        p97 p97Var = p97.a;
        b = new i39(p97Var);
        p97 p97Var2 = p97.c;
        c = new i39(p97Var2);
        sd3 sd3Var = rbe.l;
        d = new t7o(p97Var, false, new nqi(sd3Var, (byte) 22), sd3Var);
        sd3 sd3Var2 = rbe.k;
        e = new t7o(p97Var, false, new nqi(sd3Var2, (byte) 22), sd3Var2);
        td3 td3Var = rbe.f;
        f = new t7o(p97Var2, false, new nqi(td3Var, (byte) 23), td3Var);
        td3 td3Var2 = rbe.b;
        g = new t7o(p97Var2, false, new nqi(td3Var2, (byte) 23), td3Var2);
    }

    public static final c8e a(c8e c8eVar, float f2, float f3) {
        return c8eVar.d(new onm(f2, f3));
    }

    public static c8e b(int i, float f2, float f3) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(z7e.b, f2, f3);
    }

    public static final c8e c(c8e c8eVar, float f2) {
        return c8eVar.d(new lpj(0.0f, f2, 0.0f, f2, (Function1) uup.d, 5));
    }

    public static final c8e d(c8e c8eVar, float f2, float f3) {
        return c8eVar.d(new lpj(0.0f, f2, 0.0f, f3, (Function1) uup.d, 5));
    }

    public static c8e e(c8e c8eVar, float f2, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        return d(c8eVar, f2, (i & 2) == 0 ? 300.0f : Float.NaN);
    }

    public static final c8e f(c8e c8eVar, float f2) {
        return c8eVar.d(new lpj(f2, f2, f2, f2, false, (Function1) uup.d));
    }

    public static c8e g(c8e c8eVar, float f2, float f3, float f4, float f5, int i) {
        return c8eVar.d(new lpj(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false, (Function1) uup.d));
    }

    public static final c8e h(c8e c8eVar, float f2) {
        return c8eVar.d(new lpj(f2, f2, f2, f2, true, (Function1) uup.d));
    }

    public static final c8e i(c8e c8eVar, float f2, float f3) {
        return c8eVar.d(new lpj(f2, f3, f2, f3, true, (Function1) uup.d));
    }

    public static final c8e j(c8e c8eVar, float f2, float f3, float f4, float f5) {
        return c8eVar.d(new lpj(f2, f3, f4, f5, true, (Function1) uup.d));
    }

    public static c8e k(c8e c8eVar, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return j(c8eVar, f2, f3, f4, Float.NaN);
    }

    public static final c8e l(c8e c8eVar, float f2) {
        return c8eVar.d(new lpj(f2, 0.0f, f2, 0.0f, (Function1) uup.d, 10));
    }

    public static c8e m(c8e c8eVar, float f2, int i) {
        return c8eVar.d(new lpj((i & 1) != 0 ? Float.NaN : 560.0f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 0.0f, (Function1) uup.d, 10));
    }

    public static c8e n(c8e c8eVar, int i) {
        sd3 sd3Var = rbe.m;
        sd3 sd3Var2 = rbe.l;
        if ((i & 1) != 0) {
            sd3Var = sd3Var2;
        }
        return c8eVar.d(sd3Var.equals(sd3Var2) ? d : sd3Var.equals(rbe.k) ? e : new t7o(p97.a, false, new nqi(sd3Var, (byte) 22), sd3Var));
    }

    public static c8e o(c8e c8eVar, int i) {
        td3 td3Var = rbe.f;
        boolean z = (i & 2) == 0;
        return c8eVar.d((!td3Var.equals(td3Var) || z) ? (!td3Var.equals(rbe.b) || z) ? new t7o(p97.c, z, new nqi(td3Var, (byte) 23), td3Var) : g : f);
    }
}
