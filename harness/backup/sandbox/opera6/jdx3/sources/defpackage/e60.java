package defpackage;

/* loaded from: classes.dex */
public final class e60 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
    }

    @Override // defpackage.jf0
    public final df0 a(int i) {
        return g[i];
    }

    @Override // defpackage.jf0
    public final ef0 b(int i) {
        return f[i];
    }

    @Override // defpackage.jf0
    public final jf0 m(jf0 jf0Var) {
        e60 e60Var = (e60) jf0Var;
        Object obj = (d60) e60Var.n(0);
        Object obj2 = (d60) n(0);
        if (obj == null || obj2 != null) {
            obj = obj2;
        }
        if (obj != null) {
            q(0, 1, obj);
        }
        Object obj3 = (q50) e60Var.n(1);
        Object obj4 = (q50) n(1);
        if (obj3 == null || obj4 != null) {
            obj3 = obj4;
        }
        if (obj3 != null) {
            q(1, 1, obj3);
        }
        Object obj5 = (String) e60Var.n(2);
        Object obj6 = (String) n(2);
        if (obj5 == null || obj6 != null) {
            obj5 = obj6;
        }
        if (obj5 != null) {
            q(2, 1, obj5);
        }
        Object obj7 = (q50) e60Var.n(3);
        Object obj8 = (q50) n(3);
        if (obj7 == null || obj8 != null) {
            obj7 = obj8;
        }
        if (obj7 != null) {
            q(3, 1, obj7);
        }
        Object obj9 = (String) e60Var.n(4);
        Object obj10 = (String) n(4);
        if (obj9 == null || obj10 != null) {
            obj9 = obj10;
        }
        if (obj9 != null) {
            q(4, 1, obj9);
        }
        Object objH = jf0.h((Long) e60Var.n(5), (Long) n(5));
        if (objH != null) {
            q(5, 1, objH);
        }
        Object obj11 = (Boolean) e60Var.n(6);
        Object obj12 = (Boolean) n(6);
        if (obj11 == null || obj12 != null) {
            obj11 = obj12;
        }
        if (obj11 != null) {
            q(6, 1, obj11);
        }
        Float fValueOf = (Float) e60Var.n(7);
        Float f2 = (Float) n(7);
        if (fValueOf == null) {
            fValueOf = f2;
        } else if (f2 != null) {
            fValueOf = Float.valueOf(f2.floatValue() + fValueOf.floatValue());
        }
        if (fValueOf != null) {
            q(7, 1, fValueOf);
        }
        Object objH2 = jf0.h((Long) e60Var.n(8), (Long) n(8));
        if (objH2 != null) {
            q(8, 1, objH2);
        }
        Object objH3 = jf0.h((Long) e60Var.n(9), (Long) n(9));
        if (objH3 != null) {
            q(9, 1, objH3);
        }
        Object obj13 = (v50) e60Var.n(10);
        Object obj14 = (v50) n(10);
        if (obj13 == null || obj14 != null) {
            obj13 = obj14;
        }
        if (obj13 != null) {
            q(10, 1, obj13);
        }
        Object obj15 = (String) e60Var.n(11);
        Object obj16 = (String) n(11);
        if (obj15 == null || obj16 != null) {
            obj15 = obj16;
        }
        if (obj15 != null) {
            q(11, 1, obj15);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 2) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 4) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 11) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
