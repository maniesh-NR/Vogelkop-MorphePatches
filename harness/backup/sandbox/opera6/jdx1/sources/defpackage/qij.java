package defpackage;

/* loaded from: classes.dex */
public final class qij {
    public final pij a;
    public final pij b;
    public final pij c;
    public final pij d;

    public qij(pij pijVar, pij pijVar2, pij pijVar3, pij pijVar4) {
        this.a = pijVar;
        this.b = pijVar2;
        this.c = pijVar3;
        this.d = pijVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qij)) {
            return false;
        }
        qij qijVar = (qij) obj;
        return this.a.equals(qijVar.a) && this.b.equals(qijVar.b) && this.c.equals(qijVar.c) && this.d.equals(qijVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
