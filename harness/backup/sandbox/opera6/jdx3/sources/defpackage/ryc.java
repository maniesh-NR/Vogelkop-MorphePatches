package defpackage;

/* loaded from: classes.dex */
public final class ryc {
    public final boolean a;
    public final n7j b;

    public ryc(boolean z, n7j n7jVar) {
        this.a = z;
        this.b = n7jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryc)) {
            return false;
        }
        ryc rycVar = (ryc) obj;
        return this.a == rycVar.a && this.b == rycVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
