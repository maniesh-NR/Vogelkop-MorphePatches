package defpackage;

/* loaded from: classes.dex */
public final class jtc extends ktc {
    public final float a;

    public jtc(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtc) && Float.compare(this.a, ((jtc) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ")";
    }
}
