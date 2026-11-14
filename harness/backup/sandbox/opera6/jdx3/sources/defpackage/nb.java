package defpackage;

/* loaded from: classes.dex */
public final class nb {
    public final String a;

    public nb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nb) && this.a.equals(((nb) obj).a);
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
