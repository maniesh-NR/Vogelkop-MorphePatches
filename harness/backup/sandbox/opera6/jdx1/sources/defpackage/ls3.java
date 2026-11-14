package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lls3;", "Lh8e;", "Lns3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ls3 extends h8e {
    public final dc1 b;

    public ls3(dc1 dc1Var) {
        this.b = dc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ls3) {
            return this.b == ((ls3) obj).b;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new ns3(this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ns3 ns3Var = (ns3) b8eVar;
        dc1 dc1Var = this.b;
        ns3Var.o = dc1Var;
        if (ns3Var.n) {
            dc1Var.invoke(ns3Var.p);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
