package defpackage;

/* loaded from: classes.dex */
public final class apj {
    public static final apj c;
    public final g97 a;
    public final g97 b;

    static {
        f97 f97Var = f97.a;
        c = new apj(f97Var, f97Var);
    }

    public apj(g97 g97Var, g97 g97Var2) {
        this.a = g97Var;
        this.b = g97Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apj)) {
            return false;
        }
        apj apjVar = (apj) obj;
        return this.a.equals(apjVar.a) && this.b.equals(apjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
