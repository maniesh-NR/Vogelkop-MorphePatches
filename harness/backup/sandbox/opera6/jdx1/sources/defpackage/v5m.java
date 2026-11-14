package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv5m;", "Lh8e;", "Lw5m;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class v5m extends h8e {
    public final u5c b;

    public v5m(u5c u5cVar) {
        this.b = u5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5m) && Intrinsics.a(this.b, ((v5m) obj).b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        w5m w5mVar = new w5m();
        w5mVar.o = this.b;
        return w5mVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ((w5m) b8eVar).o = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ")";
    }
}
