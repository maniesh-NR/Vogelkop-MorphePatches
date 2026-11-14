package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lema;", "Lh8e;", "Lima;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ema extends h8e {
    public final lde b;

    public ema(lde ldeVar) {
        this.b = ldeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ema) && Intrinsics.a(((ema) obj).b, this.b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        ima imaVar = new ima();
        imaVar.o = this.b;
        return imaVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ima imaVar = (ima) b8eVar;
        lde ldeVar = imaVar.o;
        lde ldeVar2 = this.b;
        if (Intrinsics.a(ldeVar, ldeVar2)) {
            return;
        }
        imaVar.V0();
        imaVar.o = ldeVar2;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
