package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkga;", "Lh8e;", "Llga;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class kga extends h8e {
    public final rd3 b;

    public kga(rd3 rd3Var) {
        this.b = rd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        kga kgaVar = obj instanceof kga ? (kga) obj : null;
        if (kgaVar == null) {
            return false;
        }
        return this.b.equals(kgaVar.b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        lga lgaVar = new lga();
        lgaVar.o = this.b;
        return lgaVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((lga) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
