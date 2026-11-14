package defpackage;

/* loaded from: classes.dex */
public final class e97 implements g97 {
    public final int a;

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        qp2.o("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e97) {
            return this.a == ((e97) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "Pixels(px=", ")");
    }
}
