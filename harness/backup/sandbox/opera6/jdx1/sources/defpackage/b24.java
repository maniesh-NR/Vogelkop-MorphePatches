package defpackage;

/* loaded from: classes.dex */
public abstract class b24 {
    public static final zvf a;
    public static final zvf b;
    public static final float c;
    public static final float d;

    static {
        float f = sa3.a;
        float f2 = sa3.b;
        cbj cbjVar = n24.a;
        a = new zvf(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            y7b.a("Padding must be non-negative");
        }
        b = new zvf(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            y7b.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
    }

    public static z14 a(ih5 ih5Var) {
        return d((sa5) ((vt9) ih5Var).j(ua5.a));
    }

    public static z14 b(long j, long j2, long j3, long j4, ih5 ih5Var, int i) {
        return d((sa5) ((vt9) ih5Var).j(ua5.a)).a(j, j2, (i & 4) != 0 ? u95.g : j3, (i & 8) != 0 ? u95.g : j4);
    }

    public static e24 c() {
        return new e24(0.0f, 0.0f, 0.0f, o39.f);
    }

    public static z14 d(sa5 sa5Var) {
        z14 z14Var = sa5Var.W;
        if (z14Var != null) {
            return z14Var;
        }
        z14 z14Var2 = new z14(ua5.c(sa5Var, o39.a), ua5.c(sa5Var, o39.g), u95.b(ua5.c(sa5Var, o39.b), o39.c), u95.b(ua5.c(sa5Var, o39.d), o39.e));
        sa5Var.W = z14Var2;
        return z14Var2;
    }

    public static z14 e(sa5 sa5Var) {
        z14 z14Var = sa5Var.X;
        if (z14Var != null) {
            return z14Var;
        }
        long j = u95.f;
        z14 z14Var2 = new z14(j, ua5.c(sa5Var, otf.c), j, u95.b(ua5.c(sa5Var, otf.a), otf.b));
        sa5Var.X = z14Var2;
        return z14Var2;
    }

    public static z14 f(sa5 sa5Var) {
        z14 z14Var = sa5Var.Y;
        if (z14Var != null) {
            return z14Var;
        }
        long j = u95.f;
        z14 z14Var2 = new z14(j, ua5.c(sa5Var, ta5.k), j, u95.b(ua5.c(sa5Var, dfl.a), dfl.b));
        sa5Var.Y = z14Var2;
        return z14Var2;
    }

    public static z14 g(long j, vt9 vt9Var) {
        long j2 = u95.g;
        return f((sa5) vt9Var.j(ua5.a)).a(j2, j, j2, j2);
    }
}
