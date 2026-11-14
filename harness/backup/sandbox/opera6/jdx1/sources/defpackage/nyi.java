package defpackage;

/* loaded from: classes.dex */
public final class nyi {
    public final hyh a;
    public final int b;

    public nyi(int i, hyh hyhVar) {
        this.a = hyhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyi)) {
            return false;
        }
        nyi nyiVar = (nyi) obj;
        return this.a == nyiVar.a && this.b == nyiVar.b;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + 1;
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=1)";
    }
}
