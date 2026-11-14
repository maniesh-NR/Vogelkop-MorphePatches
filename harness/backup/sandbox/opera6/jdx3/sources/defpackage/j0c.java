package defpackage;

/* loaded from: classes.dex */
public final class j0c {
    public final String a;
    public final int b;

    public j0c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0c)) {
            return false;
        }
        j0c j0cVar = (j0c) obj;
        return this.a.equals(j0cVar.a) && this.b == j0cVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
