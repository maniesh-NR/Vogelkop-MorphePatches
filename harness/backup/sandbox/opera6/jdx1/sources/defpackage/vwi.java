package defpackage;

/* loaded from: classes.dex */
public final class vwi {
    public static final vwi c = new vwi(0, 0);
    public final long a;
    public final long b;

    public vwi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vwi.class == obj.getClass()) {
            vwi vwiVar = (vwi) obj;
            if (this.a == vwiVar.a && this.b == vwiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return j7c.o(this.b, "]", sb);
    }
}
