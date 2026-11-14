package defpackage;

/* loaded from: classes.dex */
public final class ern extends tc2 {
    public final boolean b;

    public ern(boolean z) {
        super(false);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ern) && this.b == ((ern) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
