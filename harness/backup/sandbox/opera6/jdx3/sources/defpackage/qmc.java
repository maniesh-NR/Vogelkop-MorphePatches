package defpackage;

/* loaded from: classes.dex */
public final class qmc implements zmc {
    public final lmc a;
    public final xmc b;
    public final xmc c;

    public qmc(lmc lmcVar, xmc xmcVar, xmc xmcVar2) {
        this.a = lmcVar;
        this.b = xmcVar;
        this.c = xmcVar2;
    }

    @Override // defpackage.zmc
    public final lmc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmc)) {
            return false;
        }
        qmc qmcVar = (qmc) obj;
        return this.a.equals(qmcVar.a) && this.b.equals(qmcVar.b) && this.c.equals(qmcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
