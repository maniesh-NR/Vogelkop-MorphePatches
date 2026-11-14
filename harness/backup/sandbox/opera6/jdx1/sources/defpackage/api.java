package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapi;", "Lh8e;", "Ljpi;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class api extends h8e {
    public final uhl b;
    public final fsf c;
    public final boolean d;
    public final boolean e;
    public final lde f;

    public api(uhl uhlVar, fsf fsfVar, boolean z, boolean z2, lde ldeVar) {
        this.b = uhlVar;
        this.c = fsfVar;
        this.d = z;
        this.e = z2;
        this.f = ldeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof api)) {
            return false;
        }
        api apiVar = (api) obj;
        return Intrinsics.a(this.b, apiVar.b) && this.c == apiVar.c && this.d == apiVar.d && this.e == apiVar.e && Intrinsics.a(this.f, apiVar.f);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new jpi(null, null, null, this.f, this.c, this.b, this.d, this.e);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((jpi) b8eVar).o1(null, null, null, this.f, this.c, this.b, this.d, this.e);
    }

    public final int hashCode() {
        int iK = fki.k(fki.k((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        lde ldeVar = this.f;
        return (iK + (ldeVar != null ? ldeVar.hashCode() : 0)) * 31;
    }
}
