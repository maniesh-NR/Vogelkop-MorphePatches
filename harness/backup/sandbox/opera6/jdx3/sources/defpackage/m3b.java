package defpackage;

/* loaded from: classes.dex */
public final class m3b extends x2b {
    public final int a;

    public m3b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3b) && this.a == ((m3b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
