package defpackage;

/* loaded from: classes.dex */
public final class i0a {
    public final boolean a;
    public final boolean b;

    public i0a(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0a)) {
            return false;
        }
        i0a i0aVar = (i0a) obj;
        return this.a == i0aVar.a && this.b == i0aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (((Boolean.hashCode(this.a) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "";
    }
}
