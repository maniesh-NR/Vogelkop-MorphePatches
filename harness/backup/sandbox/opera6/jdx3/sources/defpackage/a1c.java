package defpackage;

/* loaded from: classes.dex */
public final class a1c {
    public final i0c a;
    public final String b;
    public final boolean c;

    public a1c(i0c i0cVar, String str, boolean z) {
        this.a = i0cVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1c)) {
            return false;
        }
        a1c a1cVar = (a1c) obj;
        return this.a.equals(a1cVar.a) && this.b.equals(a1cVar.b) && this.c == a1cVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }
}
