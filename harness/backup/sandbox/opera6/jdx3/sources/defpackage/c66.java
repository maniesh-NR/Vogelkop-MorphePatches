package defpackage;

/* loaded from: classes.dex */
public final class c66 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        c66 c66Var = (c66) jf0Var;
        Integer numValueOf = (Integer) c66Var.n(0);
        Integer num = (Integer) n(0);
        if (num != null) {
            numValueOf = numValueOf == null ? num : Integer.valueOf(Math.max(numValueOf.intValue(), num.intValue()));
        }
        if (numValueOf != null) {
            q(0, 1, numValueOf);
        }
        Integer numValueOf2 = (Integer) c66Var.n(1);
        Integer num2 = (Integer) n(1);
        if (num2 != null) {
            numValueOf2 = numValueOf2 == null ? num2 : Integer.valueOf(Math.max(numValueOf2.intValue(), num2.intValue()));
        }
        if (numValueOf2 != null) {
            q(1, 1, numValueOf2);
        }
        Object objH = jf0.h((Long) c66Var.n(2), (Long) n(2));
        if (objH != null) {
            q(2, 1, objH);
        }
        Object objH2 = jf0.h((Long) c66Var.n(3), (Long) n(3));
        if (objH2 != null) {
            q(3, 1, objH2);
        }
        Integer numValueOf3 = (Integer) c66Var.n(4);
        Integer num3 = (Integer) n(4);
        if (num3 != null) {
            numValueOf3 = numValueOf3 == null ? num3 : Integer.valueOf(Math.max(numValueOf3.intValue(), num3.intValue()));
        }
        if (numValueOf3 != null) {
            q(4, 1, numValueOf3);
        }
        Integer numValueOf4 = (Integer) c66Var.n(5);
        Integer num4 = (Integer) n(5);
        if (num4 != null) {
            numValueOf4 = numValueOf4 == null ? num4 : Integer.valueOf(Math.max(numValueOf4.intValue(), num4.intValue()));
        }
        if (numValueOf4 != null) {
            q(5, 1, numValueOf4);
        }
        Object obj = (wr0) c66Var.n(6);
        Object obj2 = (wr0) n(6);
        if (obj == null || obj2 != null) {
            obj = obj2;
        }
        if (obj != null) {
            q(6, 1, obj);
        }
        return this;
    }
}
