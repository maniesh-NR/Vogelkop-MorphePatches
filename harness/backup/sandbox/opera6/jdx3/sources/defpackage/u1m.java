package defpackage;

/* loaded from: classes.dex */
public final class u1m implements w1m {
    public final String a;

    public u1m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof u1m) && this.a.equals(((u1m) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
