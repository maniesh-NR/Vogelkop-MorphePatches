package defpackage;

/* loaded from: classes.dex */
public final class iwk extends cgh {
    public final boolean a;

    public iwk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwk) && this.a == ((iwk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
