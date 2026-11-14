package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class bg0 extends jf0 {
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
        Map mapL = jf0.l((Map) ((bg0) jf0Var).n(0), (Map) n(0));
        if (mapL != null) {
            q(0, 1, mapL);
        }
        return this;
    }

    public final Map x() {
        Map map = (Map) n(0);
        if (map != null) {
            return Collections.unmodifiableMap(map);
        }
        return null;
    }
}
