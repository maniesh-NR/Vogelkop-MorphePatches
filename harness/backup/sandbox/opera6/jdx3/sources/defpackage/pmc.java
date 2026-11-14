package defpackage;

/* loaded from: classes.dex */
public final class pmc implements zmc {
    public final lmc a;
    public final xmc b;
    public final xmc c;

    public pmc(lmc lmcVar, xmc xmcVar, xmc xmcVar2) {
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
        if (!(obj instanceof pmc)) {
            return false;
        }
        pmc pmcVar = (pmc) obj;
        return this.a.equals(pmcVar.a) && this.b.equals(pmcVar.b) && this.c.equals(pmcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
