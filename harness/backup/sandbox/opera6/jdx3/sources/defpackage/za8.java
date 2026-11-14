package defpackage;

/* loaded from: classes.dex */
public final class za8 implements fb8 {
    public final ve8 a;

    public za8(ve8 ve8Var) {
        this.a = ve8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za8) && this.a == ((za8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Generic(name=" + this.a + ")";
    }
}
