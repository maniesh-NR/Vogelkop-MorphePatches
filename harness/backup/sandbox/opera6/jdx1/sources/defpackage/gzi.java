package defpackage;

/* loaded from: classes.dex */
public final class gzi {
    public final x6a a;
    public final long b;
    public final fzi c;
    public final boolean d;

    public gzi(x6a x6aVar, long j, fzi fziVar, boolean z) {
        this.a = x6aVar;
        this.b = j;
        this.c = fziVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzi)) {
            return false;
        }
        gzi gziVar = (gzi) obj;
        return this.a == gziVar.a && y8f.b(this.b, gziVar.b) && this.c == gziVar.c && this.d == gziVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + z1m.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + y8f.g(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
