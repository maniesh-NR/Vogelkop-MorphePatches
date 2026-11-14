package defpackage;

/* loaded from: classes.dex */
public final class d4k implements h4k {
    public final String a;

    public d4k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d4k) && this.a.equals(((d4k) obj).a);
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
