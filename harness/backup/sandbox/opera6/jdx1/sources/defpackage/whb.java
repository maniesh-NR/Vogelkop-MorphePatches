package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwhb;", "Lh8e;", "Lyhb;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class whb extends h8e {
    public final Function1 b;

    public whb(Function1 function1) {
        uhb uhbVar = uhb.a;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof whb ? (whb) obj : null) == null) {
            return false;
        }
        uhb uhbVar = uhb.a;
        return true;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        uhb uhbVar = uhb.b;
        yhb yhbVar = new yhb((byte) 0);
        yhbVar.p = uhbVar;
        yhbVar.q = true;
        return yhbVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        yhb yhbVar = (yhb) b8eVar;
        yhbVar.p = uhb.b;
        yhbVar.q = true;
    }

    public final int hashCode() {
        return (uhb.b.hashCode() * 31) + 1231;
    }
}
