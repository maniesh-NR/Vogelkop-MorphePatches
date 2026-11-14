package defpackage;

/* loaded from: classes.dex */
public final class qpn {
    public final ptl a;
    public final boolean b;
    public final p68 c;
    public final boolean d;

    public qpn(ptl ptlVar, boolean z, p68 p68Var, boolean z2) {
        this.a = ptlVar;
        this.b = z;
        this.c = p68Var;
        this.d = z2;
    }

    public static qpn a(qpn qpnVar, ptl ptlVar, boolean z, p68 p68Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            ptlVar = qpnVar.a;
        }
        if ((i & 2) != 0) {
            z = qpnVar.b;
        }
        if ((i & 4) != 0) {
            p68Var = qpnVar.c;
        }
        if ((i & 8) != 0) {
            z2 = qpnVar.d;
        }
        qpnVar.getClass();
        return new qpn(ptlVar, z, p68Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpn)) {
            return false;
        }
        qpn qpnVar = (qpn) obj;
        return this.a.equals(qpnVar.a) && this.b == qpnVar.b && this.c.equals(qpnVar.c) && this.d == qpnVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + fki.k(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "";
    }
}
