package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyw4;", "Lh8e;", "Lxw4;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class yw4 extends h8e {
    public final mr3 b;

    public yw4(mr3 mr3Var) {
        this.b = mr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yw4) {
            return this.b == ((yw4) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        xw4 xw4Var = new xw4();
        xw4Var.o = this.b;
        return xw4Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        xw4 xw4Var = (xw4) b8eVar;
        xw4Var.o = this.b;
        aoh.j(xw4Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
