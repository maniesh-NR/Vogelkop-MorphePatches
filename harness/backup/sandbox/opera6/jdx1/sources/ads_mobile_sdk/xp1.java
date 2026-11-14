package ads_mobile_sdk;

import defpackage.cs5;
import defpackage.jym;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class xp1 extends rg3 {
    public final ub2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public xp1(fw0 fw0Var, List list, UUID uuid, kh3 kh3Var, int i, int i2, xp1 xp1Var, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super(fw0Var, kh3Var, xp1Var, jCurrentTimeMillis);
        int i3 = xp1Var != null ? xp1Var.g.a : -1;
        long j = jCurrentTimeMillis - jym.b;
        long j2 = jym.c;
        this.g = new ub2(i2, kh3Var, fw0Var, list, uuid, i3, i, jCurrentTimeMillis, j, j2 < 0 ? -1L : jCurrentTimeMillis - j2, z, null, null, null, Integer.valueOf(rl1.b), -2048);
    }

    @Override // ads_mobile_sdk.rg3
    public final rg3 a(fw0 fw0Var, List list, boolean z) {
        ub2 ub2Var = this.g;
        return new xp1(fw0Var, list, ub2Var.e, this.a, ub2Var.g + 1, ub2Var.a + 1, this, z);
    }

    @Override // ads_mobile_sdk.rg3
    public final ub2 e() {
        return this.g;
    }

    @Override // ads_mobile_sdk.rg3
    public final void h() {
        on7 on7Var = pn7.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        un7 un7Var = un7.d;
        this.g.p = pn7.l(cs5.y0(jCurrentTimeMillis, un7Var), cs5.y0(this.c, un7Var));
    }
}
