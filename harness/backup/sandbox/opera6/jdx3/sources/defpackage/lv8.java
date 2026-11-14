package defpackage;

/* loaded from: classes.dex */
public final class lv8 {
    public final int a;

    public lv8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv8) && this.a == ((lv8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
