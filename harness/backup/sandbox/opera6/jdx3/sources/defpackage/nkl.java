package defpackage;

/* loaded from: classes.dex */
public final class nkl implements okl {
    public final String a;

    public nkl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nkl) && this.a.equals(((nkl) obj).a);
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
