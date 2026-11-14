package defpackage;

/* loaded from: classes.dex */
public final class mjn implements njn {
    public final String a;

    public mjn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof mjn) && this.a.equals(((mjn) obj).a);
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
