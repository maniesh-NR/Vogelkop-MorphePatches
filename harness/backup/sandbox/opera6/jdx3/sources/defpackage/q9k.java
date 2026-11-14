package defpackage;

/* loaded from: classes.dex */
public final class q9k extends t9k {
    public final int a;

    public q9k(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9k) && this.a == ((q9k) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
