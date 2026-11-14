package defpackage;

/* loaded from: classes.dex */
public final class irn extends tc2 {
    public final boolean b;

    public irn(boolean z) {
        super(z);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irn) && this.b == ((irn) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
