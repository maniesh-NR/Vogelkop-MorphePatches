package defpackage;

/* loaded from: classes.dex */
public final class r5j extends y5j {
    public final boolean b;

    public r5j(boolean z) {
        super("live_scores_enabled");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5j) && this.b == ((r5j) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
