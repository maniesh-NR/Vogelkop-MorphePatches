package defpackage;

/* loaded from: classes.dex */
public final class fuf {
    public final int a;

    public static String a(int i) {
        return sko.i(i, "Output-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fuf) {
            return this.a == ((fuf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
