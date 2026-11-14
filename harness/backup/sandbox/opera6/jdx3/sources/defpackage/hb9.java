package defpackage;

/* loaded from: classes.dex */
public abstract class hb9 extends ja2 {
    public final long b;
    public final long c;
    public final String d;

    public hb9(long j, long j2, String str) {
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            return this.b == ((hb9) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.b;
    }
}
