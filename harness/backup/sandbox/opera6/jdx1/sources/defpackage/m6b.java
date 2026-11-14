package defpackage;

/* loaded from: classes.dex */
public final class m6b {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof m6b) {
            return this.a == ((m6b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}
