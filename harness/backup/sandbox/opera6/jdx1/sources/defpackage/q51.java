package defpackage;

import java.util.Arrays;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class q51 extends e04 {
    public final hp2 c;
    public final a50[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public q51(hp2 hp2Var, a50... a50VarArr) {
        long j = hp2Var.b;
        if (j <= 2147483647L) {
            super((byte) 2, (int) j);
            this.c = hp2Var;
            this.d = a50VarArr;
        } else {
            throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + j + '.').toString());
        }
    }

    @Override // defpackage.e04
    public final void e(to9 to9Var) {
        new hgh(scd.g0(h.a, new agb((byte) 28, (mt5) null, new va1(to9Var))));
    }

    @Override // defpackage.e04
    public final void h(to9 to9Var, int i, int i2) {
        va1 va1Var = new va1(to9Var);
        a50[] a50VarArr = this.d;
        new hgh(scd.g0(h.a, new azk(i, i2, va1Var, (mt5) null, (a50[]) Arrays.copyOf(a50VarArr, a50VarArr.length))));
    }
}
