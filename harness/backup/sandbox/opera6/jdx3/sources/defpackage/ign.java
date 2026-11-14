package defpackage;

/* loaded from: classes.dex */
public final class ign {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public ign(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ign)) {
            return false;
        }
        ign ignVar = (ign) obj;
        return this.a == ignVar.a && this.b == ignVar.b && this.c == ignVar.c && this.d == ignVar.d && this.e == ignVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, rfp.c(this.c, fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
