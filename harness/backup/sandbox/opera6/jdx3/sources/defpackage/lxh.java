package defpackage;

/* loaded from: classes.dex */
public final class lxh extends b8h {
    public final int a;

    public lxh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxh) && this.a == ((lxh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
