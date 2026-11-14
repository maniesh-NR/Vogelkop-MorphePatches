package defpackage;

/* loaded from: classes.dex */
public final class bjh {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public bjh(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final bjh a(bjh bjhVar, String str) {
        bjh bjhVar2;
        String strO = n6h.o(str, this.c);
        if (bjhVar == null) {
            return null;
        }
        long j = bjhVar.b;
        if (!strO.equals(n6h.o(str, bjhVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            bjhVar2 = null;
            if (j3 + j2 == bjhVar.a) {
                return new bjh(strO, j3, j != -1 ? j2 + j : -1L);
            }
        } else {
            bjhVar2 = null;
        }
        if (j != -1) {
            long j4 = bjhVar.a;
            if (j4 + j == this.a) {
                return new bjh(strO, j4, j2 != -1 ? j + j2 : -1L);
            }
        }
        return bjhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bjh.class == obj.getClass()) {
            bjh bjhVar = (bjh) obj;
            if (this.a == bjhVar.a && this.b == bjhVar.b && this.c.equals(bjhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        this.d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return j7c.o(this.b, ")", sb);
    }
}
