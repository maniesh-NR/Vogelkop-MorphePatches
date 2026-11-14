package defpackage;

/* loaded from: classes.dex */
public final class rn2 {
    public final Object a;

    public rn2(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof rn2) && this.a == ((rn2) obj).a;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return am2.o(new StringBuilder("Identifier{value="), this.a, "}");
    }
}
