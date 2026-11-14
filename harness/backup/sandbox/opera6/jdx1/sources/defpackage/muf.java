package defpackage;

/* loaded from: classes.dex */
public final class muf {
    public final Object a;

    public static final boolean a(Object obj) {
        return !(obj instanceof ouf);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof muf) {
            return this.a.equals(((muf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.a + ')';
    }
}
