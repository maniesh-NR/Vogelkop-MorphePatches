package defpackage;

/* loaded from: classes.dex */
public final class u7l extends v7l {
    public final yni a;

    public u7l(yni yniVar) {
        this.a = yniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7l) && this.a == ((u7l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
