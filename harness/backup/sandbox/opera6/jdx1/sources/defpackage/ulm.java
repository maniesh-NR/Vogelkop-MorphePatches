package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lulm;", "Lh8e;", "Lvlm;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ulm extends h8e {
    public final f69 b;
    public final Function1 c;

    public ulm(f69 f69Var, Function1 function1) {
        this.b = f69Var;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ulm) {
            return ((ulm) obj).b.equals(this.b);
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        vlm vlmVar = new vlm();
        vlmVar.q = this.b;
        return vlmVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        vlm vlmVar = (vlm) b8eVar;
        f69 f69Var = vlmVar.q;
        f69 f69Var2 = this.b;
        if (f69Var2.equals(f69Var)) {
            return;
        }
        vlmVar.q = f69Var2;
        vlmVar.U0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
