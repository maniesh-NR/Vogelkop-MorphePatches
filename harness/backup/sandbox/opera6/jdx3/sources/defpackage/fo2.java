package defpackage;

/* loaded from: classes.dex */
public final class fo2 {
    public final long a;
    public final dp2 b;
    public final jn2 c;

    public fo2(long j, dp2 dp2Var, jn2 jn2Var) {
        this.a = j;
        this.b = dp2Var;
        this.c = jn2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fo2)) {
            return false;
        }
        fo2 fo2Var = (fo2) obj;
        return this.a == fo2Var.a && this.b.equals(fo2Var.b) && this.c.equals(fo2Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
