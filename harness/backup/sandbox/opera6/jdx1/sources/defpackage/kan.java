package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class kan extends xj9 {
    public final String b;
    public int c;

    public kan(xd4 xd4Var) {
        super(xd4Var);
        this.b = "virtual-" + xd4Var.e() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.xj9, defpackage.ud4
    public final int C(int i) {
        return d2m.j(super.C(i) - this.c);
    }

    @Override // defpackage.xj9, defpackage.ud4
    public final int c() {
        return C(0);
    }

    @Override // defpackage.xj9, defpackage.xd4
    public final String e() {
        return this.b;
    }
}
