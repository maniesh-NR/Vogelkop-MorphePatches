package defpackage;

/* loaded from: classes.dex */
public final class tj {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;

    public tj(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return this.a == tjVar.a && this.b == tjVar.b && this.c == tjVar.c && this.d == tjVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fki.k(rfp.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
