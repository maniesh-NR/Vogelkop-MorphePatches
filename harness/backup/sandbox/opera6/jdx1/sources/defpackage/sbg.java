package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sbg extends b7 implements w1b, Collection, ptb, j$.util.Collection {
    public static final sbg e;
    public final Object b;
    public final Object c;
    public final tag d;

    static {
        ulp ulpVar = ulp.f;
        e = new sbg(ulpVar, ulpVar, tag.f);
    }

    public sbg(Object obj, Object obj2, tag tagVar) {
        this.b = obj;
        this.c = obj2;
        this.d = tagVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final int d() {
        return this.d.e;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qbg(this.b, this.d, (byte) 2);
    }
}
