package defpackage;

/* loaded from: classes.dex */
public final class wt9 implements bi5 {
    public final yh5 a;

    public wt9(yh5 yh5Var) {
        this.a = yh5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wt9) {
            return this.a.equals(((wt9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
