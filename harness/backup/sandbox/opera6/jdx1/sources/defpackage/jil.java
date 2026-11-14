package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljil;", "Lh8e;", "Lkil;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class jil extends h8e {
    public final ikl b;

    public jil(ikl iklVar) {
        this.b = iklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jil)) {
            return false;
        }
        return Intrinsics.a(this.b, ((jil) obj).b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new kil(this.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        kil kilVar = (kil) b8eVar;
        kilVar.getClass();
        ikl iklVarV = xgh.v(this.b, ui6.e0(kilVar).z);
        kilVar.T0(iklVarV, (mh9) z4o.N(kilVar, mi5.k));
        ukj ukjVar = kilVar.q;
        if (ukjVar == null) {
            throw o18.k("Min size state is not set.");
        }
        ukj.a(ukjVar, (d2c) null, (n27) null, iklVarV, 23);
        nb6.F(kilVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
