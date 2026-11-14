package defpackage;

/* loaded from: classes.dex */
public final class zm8 {
    public final o24 a;
    public final o24 b;

    static {
        byte b = jf.g;
    }

    public zm8(o24 o24Var, o24 o24Var2) {
        this.a = o24Var;
        this.b = o24Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm8)) {
            return false;
        }
        zm8 zm8Var = (zm8) obj;
        return this.a.equals(zm8Var.a) && this.b.equals(zm8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
