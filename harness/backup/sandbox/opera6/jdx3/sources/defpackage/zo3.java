package defpackage;

/* loaded from: classes.dex */
public final class zo3 {
    public final int a;

    public zo3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo3) && this.a == ((zo3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
