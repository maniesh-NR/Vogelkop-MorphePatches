package defpackage;

/* loaded from: classes.dex */
public final class lw9 extends f03 {
    public final boolean l;

    public lw9(boolean z) {
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw9) && this.l == ((lw9) obj).l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l);
    }

    public final String toString() {
        return "";
    }
}
