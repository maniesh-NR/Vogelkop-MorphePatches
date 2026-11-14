package defpackage;

/* loaded from: classes.dex */
public final class c4c extends p37 {
    public final boolean i;
    public final int j;
    public final int k;
    public final boolean l;

    public c4c(boolean z, int i, int i2, boolean z2) {
        this.i = z;
        this.j = i;
        this.k = i2;
        this.l = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4c)) {
            return false;
        }
        c4c c4cVar = (c4c) obj;
        return this.i == c4cVar.i && this.j == c4cVar.j && this.k == c4cVar.k && this.l == c4cVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + rfp.c(this.k, rfp.c(this.j, Boolean.hashCode(this.i) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
