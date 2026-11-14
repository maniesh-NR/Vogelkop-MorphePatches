package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnfl;", "Lh8e;", "Lpfl;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class nfl extends h8e {
    public final whl b;

    public nfl(whl whlVar) {
        this.b = whlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nfl) {
            return this.b == ((nfl) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new pfl(this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((pfl) b8eVar).q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
