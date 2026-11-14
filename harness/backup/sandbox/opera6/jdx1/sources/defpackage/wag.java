package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class wag extends e6 implements Map, ttb {
    public tag a;
    public i06 b = new i06((byte) 19);
    public u6m c;
    public Object d;
    public int e;
    public int f;

    public wag(tag tagVar) {
        this.a = tagVar;
        this.c = tagVar.d;
        this.f = tagVar.e;
    }

    @Override // defpackage.e6
    public final Set a() {
        return new abg(this, (byte) 0);
    }

    @Override // defpackage.e6
    public final Set b() {
        return new abg(this, (byte) 1);
    }

    @Override // defpackage.e6
    public final int c() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = u6m.e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.e6
    public final Collection d() {
        return new rl4(this, (byte) 3);
    }

    /* renamed from: e */
    public tag f() {
        u6m u6mVar = this.c;
        tag tagVar = this.a;
        if (u6mVar != tagVar.d) {
            this.b = new i06((byte) 19);
            tagVar = new tag(this.c, c());
        }
        this.a = tagVar;
        return tagVar;
    }

    public /* bridge */ tag f() {
        return f();
    }

    public final void g(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        tag tagVarF = null;
        tag tagVar = map instanceof tag ? (tag) map : null;
        if (tagVar == null) {
            wag wagVar = map instanceof wag ? (wag) map : null;
            if (wagVar != null) {
                tagVarF = wagVar.f();
            }
        } else {
            tagVarF = tagVar;
        }
        if (tagVarF == null) {
            super.putAll(map);
            return;
        }
        l27 l27Var = new l27();
        l27Var.a = 0;
        int i = this.f;
        this.c = this.c.m(tagVarF.d, 0, l27Var, this);
        int i2 = (tagVarF.e + i) - l27Var.a;
        if (i != i2) {
            g(i2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        u6m u6mVarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (u6mVarN == null) {
            u6mVarN = u6m.e;
        }
        this.c = u6mVarN;
        return this.d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        u6m u6mVarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (u6mVarO == null) {
            u6mVarO = u6m.e;
        }
        this.c = u6mVarO;
        return iC != c();
    }
}
