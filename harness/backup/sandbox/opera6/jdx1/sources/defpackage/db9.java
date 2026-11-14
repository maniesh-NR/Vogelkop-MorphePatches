package defpackage;

/* loaded from: classes.dex */
public final class db9 {
    public final void a(pfd pfdVar, pfd pfdVar2, long j) {
        long jP = aib.p(j, a4c.a);
        if (pfdVar != null) {
            int iE = pfdVar.E(yo5.g(jP));
            new tbb(tbb.a(iE, pfdVar.z(iE)));
        }
        if (pfdVar2 != null) {
            int iE2 = pfdVar2.E(yo5.g(jP));
            new tbb(tbb.a(iE2, pfdVar2.z(iE2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db9)) {
            return false;
        }
        cb9 cb9Var = cb9.a;
        return true;
    }

    public final int hashCode() {
        return cb9.a.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + cb9.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
