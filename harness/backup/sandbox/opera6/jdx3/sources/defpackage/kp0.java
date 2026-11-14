package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class kp0 extends jf0 {
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
        List listI = jf0.i((List) ((kp0) jf0Var).n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        return this;
    }
}
