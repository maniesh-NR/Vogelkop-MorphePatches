package defpackage;

/* loaded from: classes.dex */
public final class kxh extends y7h {
    public final int d;

    public kxh(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxh) && this.d == ((kxh) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return "";
    }
}
