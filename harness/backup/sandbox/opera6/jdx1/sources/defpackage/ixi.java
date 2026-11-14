package defpackage;

/* loaded from: classes.dex */
public final class ixi {
    public final long a;
    public final long b;

    public ixi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ixi.class == obj.getClass()) {
            ixi ixiVar = (ixi) obj;
            if (this.a == ixiVar.a && this.b == ixiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
