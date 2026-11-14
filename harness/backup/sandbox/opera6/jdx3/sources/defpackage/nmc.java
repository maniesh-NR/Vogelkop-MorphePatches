package defpackage;

/* loaded from: classes.dex */
public final class nmc implements zmc {
    public final lmc a;
    public final xmc b;
    public final xmc c;
    public final mmc d;

    public nmc(lmc lmcVar, xmc xmcVar, xmc xmcVar2, mmc mmcVar) {
        this.a = lmcVar;
        this.b = xmcVar;
        this.c = xmcVar2;
        this.d = mmcVar;
    }

    @Override // defpackage.zmc
    public final lmc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmc)) {
            return false;
        }
        nmc nmcVar = (nmc) obj;
        return this.a.equals(nmcVar.a) && this.b.equals(nmcVar.b) && this.c.equals(nmcVar.c) && this.d == nmcVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
