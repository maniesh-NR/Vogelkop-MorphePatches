package defpackage;

/* loaded from: classes.dex */
public final class t83 implements ewh {
    public final unb a;

    public final boolean equals(Object obj) {
        if (obj instanceof t83) {
            return this.a.equals(((t83) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ")";
    }
}
