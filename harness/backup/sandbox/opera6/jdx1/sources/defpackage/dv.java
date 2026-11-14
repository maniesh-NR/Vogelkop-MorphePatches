package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldv;", "Lh8e;", "Lev;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class dv extends h8e {
    public final oyj b;

    public dv(oyj oyjVar) {
        this.b = oyjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dv) {
            return this.b == ((dv) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() throws pxb {
        ev evVar = new ev();
        evVar.q = this.b;
        z3 z3Var = new z3(evVar, (byte) 11);
        cv cvVar = new cv();
        cvVar.o = z3Var;
        evVar.T0(cvVar);
        return evVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((ev) b8eVar).q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
