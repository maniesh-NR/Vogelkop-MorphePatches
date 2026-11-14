package defpackage;

/* loaded from: classes.dex */
public abstract class gmj {
    static {
        rm5.R(0.0f, 0.0f, null, 7);
    }

    public static final iak a(long j, h49 h49Var, String str, ih5 ih5Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        vt9 vt9Var = (vt9) ih5Var;
        boolean zF = vt9Var.f(u95.e(j));
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            j8m j8mVar = new j8m(h50.p, new b11((Object) u95.e(j), (byte) 7));
            vt9Var.g0(j8mVar);
            objK = j8mVar;
        }
        return md1.c(new u95(j), (j8m) objK, h49Var, null, str2, vt9Var, (i << 6) & 57344, 8);
    }
}
