package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class if0 extends AbstractMap {
    public final Map a;
    public final byte b;
    public final /* synthetic */ jf0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public if0(jf0 jf0Var, int i, Map map) {
        Objects.requireNonNull(jf0Var);
        this.c = jf0Var;
        this.b = i;
        this.a = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new gf0(this.c, this.b, this.a.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut = this.a.put((String) obj, obj2);
        this.c.getClass();
        return objPut;
    }
}
