package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class zwf implements f5c {
    public final gu6 a;

    public zwf(gu6 gu6Var) {
        this.a = gu6Var;
    }

    public final int a() {
        int i;
        gu6 gu6Var = this.a;
        if (gu6Var.m().a.size() == 0) {
            return 0;
        }
        int iB = k1g.B(gu6Var.m());
        int i2 = gu6Var.m().b + gu6Var.m().c;
        if (i2 == 0 || (i = iB / i2) < 1) {
            return 1;
        }
        return i;
    }

    public final boolean b() {
        return !this.a.m().a.isEmpty();
    }

    public final int c() {
        return Math.max(0, this.a.e);
    }

    public final int d() {
        return Math.min(r1.n() - 1, ((wfd) CollectionsKt.Q(this.a.m().a)).a);
    }

    public final int getItemCount() {
        return this.a.n();
    }
}
