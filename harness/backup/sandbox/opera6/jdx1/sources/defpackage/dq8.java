package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class dq8 implements Map.Entry, ptb {
    public final mdc a;
    public final pdc b;
    public dq8 c;
    public dq8 d;
    public boolean e;

    public dq8(mdc mdcVar, pdc pdcVar) {
        this.a = mdcVar;
        this.b = pdcVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dq8) {
            dq8 dq8Var = (dq8) obj;
            return this.a.equals(dq8Var.a) && this.b == dq8Var.b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", value=" + this.b + ")";
    }
}
