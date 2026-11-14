package defpackage;

/* loaded from: classes.dex */
public final class fsi implements u3l {
    public final esi d;

    public fsi(esi esiVar) {
        this.d = esiVar;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        d7l d7lVar = (d7l) b2lVar;
        String strL0 = d7lVar.l0();
        esi esiVar = this.d;
        if (esiVar.a(strL0) != -1) {
            return true;
        }
        String strG0 = d7lVar.g0();
        return (strG0 == null || esiVar.a(wqm.G(strG0)) == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fsi) && this.d.equals(((fsi) obj).d);
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "";
    }
}
