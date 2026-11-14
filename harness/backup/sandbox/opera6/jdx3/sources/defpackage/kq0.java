package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kq0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        ef0 ef0Var2 = ef0.e;
        f = new ef0[]{ef0Var, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2, ef0Var2};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        kq0 kq0Var = (kq0) jf0Var;
        String str = (String) kq0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        List listI = jf0.i((List) kq0Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        Long lH = jf0.h((Long) kq0Var.n(2), (Long) n(2));
        if (lH != null) {
            q(2, 1, lH);
        }
        Long lH2 = jf0.h((Long) kq0Var.n(3), (Long) n(3));
        if (lH2 != null) {
            q(3, 1, lH2);
        }
        Long lH3 = jf0.h((Long) kq0Var.n(4), (Long) n(4));
        if (lH3 != null) {
            q(4, 1, lH3);
        }
        Long lH4 = jf0.h((Long) kq0Var.n(5), (Long) n(5));
        if (lH4 != null) {
            q(5, 1, lH4);
        }
        Long lH5 = jf0.h((Long) kq0Var.n(6), (Long) n(6));
        if (lH5 != null) {
            q(6, 1, lH5);
        }
        y56 y56Var = (y56) jf0.f((y56) kq0Var.n(7), (y56) n(7));
        if (y56Var != null) {
            q(7, 1, y56Var);
        }
        return this;
    }

    public final y56 x(zpa zpaVar) {
        y56 y56Var = (y56) n(7);
        if (y56Var != null) {
            return y56Var;
        }
        zpaVar.getClass();
        q(7, 1, new y56(2443, 1, 9));
        return (y56) n(7);
    }

    public final hf0 y() {
        List list = (List) n(1);
        if (list != null && !list.isEmpty()) {
            return new hf0(this, 1, list);
        }
        ArrayList arrayList = new ArrayList();
        q(1, 1, arrayList);
        return new hf0(this, 1, arrayList);
    }
}
