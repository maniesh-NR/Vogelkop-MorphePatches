package defpackage;

/* loaded from: classes.dex */
public final class o91 implements kmg {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public o91(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return o91.class.equals(obj != null ? obj.getClass() : null) && this.b == ((o91) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return p3p.i(this.b, "AndroidPointerIcon(type=", ")");
    }
}
