package defpackage;

/* loaded from: classes.dex */
public final class tmg {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tmg) {
            return this.a == ((tmg) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "PointerKeyboardModifiers(packedValue=", ")");
    }
}
