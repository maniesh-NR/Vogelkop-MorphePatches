package defpackage;

/* loaded from: classes.dex */
public final class w1f {
    public final String a;
    public final String b;

    public w1f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1f)) {
            return false;
        }
        w1f w1fVar = (w1f) obj;
        return this.a.equals(w1fVar.a) && this.b.equals(w1fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }

    public final String toString() {
        return "";
    }
}
