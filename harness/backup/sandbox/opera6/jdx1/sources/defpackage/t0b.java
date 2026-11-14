package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t0b extends k1b {
    public final l1b a() {
        return d();
    }

    public final l1b c() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    public final k1b e(Object obj, Object obj2) {
        super.e(obj, obj2);
        return this;
    }

    public final k1b f(Map map) {
        g(((hsh) map).entrySet());
        return this;
    }

    public final k1b g(Set set) {
        super.g(set);
        return this;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final bsh d() {
        return ((k1b) this).b == 0 ? bsh.f : new bsh(((k1b) this).a, ((k1b) this).b);
    }

    public final void i(eyl eylVar, String str) {
        super.e(eylVar, str);
    }
}
