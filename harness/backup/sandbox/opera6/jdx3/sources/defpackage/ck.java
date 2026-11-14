package defpackage;

/* loaded from: classes.dex */
public final class ck extends c09 {
    public final rxh W;
    public final rxh X;
    public final boolean Y;
    public final kk Z;

    public ck(rxh rxhVar, rxh rxhVar2, boolean z, kk kkVar) {
        this.W = rxhVar;
        this.X = rxhVar2;
        this.Y = z;
        this.Z = kkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return this.W.equals(ckVar.W) && this.X.equals(ckVar.X) && this.Y == ckVar.Y && this.Z == ckVar.Z;
    }

    public final int hashCode() {
        return this.Z.hashCode() + fki.k(rfp.c(this.X.a, Integer.hashCode(this.W.a) * 31, 31), 31, this.Y);
    }

    public final String toString() {
        return "";
    }
}
