package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class tag extends f5 implements Map, ptb {
    public static final tag f = new tag(u6m.e, 0);
    public final u6m d;
    public final int e;

    public tag(u6m u6mVar, int i) {
        this.d = u6mVar;
        this.e = i;
    }

    public final Set a() {
        return new fbg(this, (byte) 0);
    }

    public final Set b() {
        return new fbg(this, (byte) 1);
    }

    public final int c() {
        return this.e;
    }

    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Collection d() {
        return new e5(this, (byte) 3);
    }

    public wag f() {
        return new wag(this);
    }

    public /* bridge */ wag g() {
        return f();
    }

    public Object get(Object obj) {
        return this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final tag h(Object obj, vgc vgcVar) {
        n9k n9kVarU = this.d.u(obj, obj != null ? obj.hashCode() : 0, 0, vgcVar);
        return n9kVarU == null ? this : new tag((u6m) n9kVarU.b, this.e + (n9kVarU.a ? 1 : 0));
    }
}
