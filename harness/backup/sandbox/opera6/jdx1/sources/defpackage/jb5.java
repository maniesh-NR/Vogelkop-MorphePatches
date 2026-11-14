package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljb5;", "Lh8e;", "Llb5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class jb5 extends h8e {
    public final lde b;
    public final Function0 c;

    public jb5(lde ldeVar, Function0 function0) {
        this.b = ldeVar;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jb5.class != obj.getClass()) {
            return false;
        }
        jb5 jb5Var = (jb5) obj;
        return Intrinsics.a(this.b, jb5Var.b) && this.c == jb5Var.c;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new lb5(this.b, this.c);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        lb5 lb5Var = (lb5) b8eVar;
        lb5Var.getClass();
        boolean z = !lb5Var.v;
        lb5Var.j1(this.b, null, false, true, null, null, this.c);
        if (z) {
            lb5Var.k1(false);
            lb5Var.k1(true);
        }
    }

    public final int hashCode() {
        lde ldeVar = this.b;
        return ((this.c.hashCode() + ((((((ldeVar != null ? ldeVar.hashCode() : 0) * 961) + 1237) * 31) + 1231) * 29791)) * 923521) + 1231;
    }
}
