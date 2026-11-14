package defpackage;

/* loaded from: classes.dex */
public final class c95 {
    public final int a;
    public final int b;

    public c95(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c95)) {
            return false;
        }
        c95 c95Var = (c95) obj;
        return this.a == c95Var.a && this.b == c95Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fki.o(this.a, this.b, "CollectionInfo(rowCount=", ", columnCount=", ")");
    }
}
