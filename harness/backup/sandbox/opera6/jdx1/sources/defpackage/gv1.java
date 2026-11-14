package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lgv1;", "Lh8e;", "Liw5;", "Lg0j;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class gv1 extends h8e implements g0j {
    public final boolean b;
    public final Function1 c;

    public gv1(boolean z, Function1 function1) {
        this.b = z;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv1)) {
            return false;
        }
        gv1 gv1Var = (gv1) obj;
        return this.b == gv1Var.b && this.c == gv1Var.c;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new iw5(this.b, false, this.c);
    }

    @Override // defpackage.g0j
    public final f0j g() {
        f0j f0jVar = new f0j();
        f0jVar.c = this.b;
        this.c.invoke(f0jVar);
        return f0jVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        iw5 iw5Var = (iw5) b8eVar;
        iw5Var.o = this.b;
        iw5Var.q = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }
}
