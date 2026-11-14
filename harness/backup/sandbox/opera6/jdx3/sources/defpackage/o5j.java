package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o5j {
    public final j5j a;
    public final Object b;

    public o5j(j5j j5jVar, Object obj) {
        this.a = j5jVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5j)) {
            return false;
        }
        o5j o5jVar = (o5j) obj;
        return this.a.equals(o5jVar.a) && Intrinsics.a(this.b, o5jVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Setting(spec=" + this.a + ", value=" + this.b + ")";
    }
}
