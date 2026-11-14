package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqhb;", "Lh8e;", "Lrhb;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qhb extends h8e {
    public final Function1 b;

    public qhb(Function1 function1) {
        uhb uhbVar = uhb.a;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qhb ? (qhb) obj : null) == null) {
            return false;
        }
        uhb uhbVar = uhb.a;
        return true;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        uhb uhbVar = uhb.a;
        rhb rhbVar = new rhb((byte) 0);
        rhbVar.p = uhbVar;
        rhbVar.q = true;
        return rhbVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        rhb rhbVar = (rhb) b8eVar;
        rhbVar.p = uhb.a;
        rhbVar.q = true;
    }

    public final int hashCode() {
        return (uhb.a.hashCode() * 31) + 1231;
    }
}
