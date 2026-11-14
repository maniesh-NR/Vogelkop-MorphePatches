package defpackage;

/* loaded from: classes.dex */
public final class nc6 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc6)) {
            return false;
        }
        nc6 nc6Var = (nc6) obj;
        return this.a == nc6Var.a && Float.compare(this.b, nc6Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ")";
    }
}
