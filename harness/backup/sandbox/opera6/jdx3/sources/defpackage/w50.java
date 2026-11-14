package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class w50 extends jf0 {
    public static final ef0[] f = {ef0.b};
    public static final df0[] g = {df0.d};

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
        List list = (List) ((w50) jf0Var).n(0);
        List list2 = (List) n(0);
        if (list == null || list2 != null) {
            list = list2;
        }
        List list3 = list;
        if (list3 != null) {
            q(0, 1, list3);
        }
        return this;
    }
}
