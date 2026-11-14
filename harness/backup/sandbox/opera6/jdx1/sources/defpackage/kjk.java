package defpackage;

/* loaded from: classes.dex */
public final class kjk extends IllegalStateException {
    public final byte a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public kjk(int i, int i2) {
        String strI;
        if (i == 0) {
            strI = p3p.i(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strI = p3p.i(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strI = p3p.i(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strI = p3p.i(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                h9o.e();
                throw null;
            }
            strI = p3p.i(i2, "Player stuck suppressed for ", " ms");
        }
        super(strI);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kjk.class != obj.getClass()) {
            return false;
        }
        kjk kjkVar = (kjk) obj;
        return this.a == kjkVar.a && this.b == kjkVar.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
