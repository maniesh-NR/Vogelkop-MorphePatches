package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljr3;", "Lh8e;", "Lkr3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class jr3 extends h8e {
    public final td3 b;
    public final boolean c;
    public final Function1 d;

    public jr3(td3 td3Var, boolean z, Function1 function1) {
        this.b = td3Var;
        this.c = z;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jr3 jr3Var = obj instanceof jr3 ? (jr3) obj : null;
        return jr3Var != null && this.b.equals(jr3Var.b) && this.c == jr3Var.c;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        kr3 kr3Var = new kr3();
        kr3Var.o = this.b;
        kr3Var.p = this.c;
        return kr3Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        kr3 kr3Var = (kr3) b8eVar;
        kr3Var.o = this.b;
        kr3Var.p = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
