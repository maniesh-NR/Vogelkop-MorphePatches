package defpackage;

/* loaded from: classes.dex */
public final class xxj extends j7h {
    public final lxh b;
    public final int c;
    public final int d;
    public final ixh e = new ixh(0.0f);

    public xxj(lxh lxhVar, int i, int i2) {
        this.b = lxhVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxj)) {
            return false;
        }
        xxj xxjVar = (xxj) obj;
        return this.b.equals(xxjVar.b) && this.c == xxjVar.c && this.d == xxjVar.d;
    }

    public final b8h f() {
        return this.b;
    }

    public final boolean g() {
        return true;
    }

    public final ixh h() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, Integer.hashCode(this.b.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
