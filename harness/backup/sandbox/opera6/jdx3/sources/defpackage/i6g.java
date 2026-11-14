package defpackage;

/* loaded from: classes.dex */
public final class i6g {
    public final boolean a;
    public final boolean b;

    public i6g(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6g)) {
            return false;
        }
        i6g i6gVar = (i6g) obj;
        return this.a == i6gVar.a && this.b == i6gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
