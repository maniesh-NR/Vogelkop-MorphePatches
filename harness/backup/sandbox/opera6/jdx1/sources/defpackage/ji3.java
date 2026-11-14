package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji3;", "Lh8e;", "Lki3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ji3 extends h8e {
    public final Function1 b;

    public ji3(Function1 function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ji3) {
            return this.b == ((ji3) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new ki3(this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        wye wyeVar;
        ki3 ki3Var = (ki3) b8eVar;
        Function1 function1 = this.b;
        ki3Var.o = function1;
        if (!ki3Var.a.n || (wyeVar = ui6.c0(ki3Var, 2).v) == null) {
            return;
        }
        wyeVar.z1(true, function1);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
