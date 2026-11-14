package defpackage;

import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class q69 implements yf3 {
    public final u69 a;
    public final int b;
    public final hp2 c = new hp2((byte) 2, false);

    public q69(u69 u69Var, int i) {
        this.a = u69Var;
        this.b = i;
    }

    public final long a(lp6 lp6Var) {
        hp2 hp2Var;
        u69 u69Var;
        long j;
        boolean zK;
        int iE;
        long j2 = lp6Var.c;
        while (true) {
            long peekPosition = lp6Var.getPeekPosition();
            long j3 = j2 - 6;
            hp2Var = this.c;
            u69Var = this.a;
            if (peekPosition >= j3) {
                j = 6;
                break;
            }
            long peekPosition2 = lp6Var.getPeekPosition();
            g1g g1gVar = new g1g(17);
            lp6Var.peekFully(g1gVar.a, 0, 2, false);
            char cG = g1gVar.g(0, ByteOrder.BIG_ENDIAN);
            int i = this.b;
            if (cG != i) {
                lp6Var.f = 0;
                lp6Var.a((int) (peekPosition2 - lp6Var.d), false);
                zK = false;
                j = 6;
            } else {
                byte[] bArr = g1gVar.a;
                int i2 = 0;
                j = 6;
                while (i2 < 15 && (iE = lp6Var.e(2 + i2, 15 - i2, bArr)) != -1) {
                    i2 += iE;
                }
                g1gVar.M(i2 + 2);
                lp6Var.f = 0;
                lp6Var.a((int) (peekPosition2 - lp6Var.d), false);
                zK = cqp.K(g1gVar, u69Var, i, hp2Var);
            }
            if (zK) {
                break;
            }
            lp6Var.a(1, false);
        }
        if (lp6Var.getPeekPosition() < j2 - j) {
            return hp2Var.b;
        }
        lp6Var.a((int) (j2 - lp6Var.getPeekPosition()), false);
        return u69Var.j;
    }

    @Override // defpackage.yf3
    public final xf3 o(lp6 lp6Var, long j) {
        long j2 = lp6Var.d;
        long jA = a(lp6Var);
        long peekPosition = lp6Var.getPeekPosition();
        lp6Var.a(Math.max(6, this.a.c), false);
        long jA2 = a(lp6Var);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new xf3(-2, jA2, lp6Var.getPeekPosition()) : new xf3(-1, jA, j2) : new xf3(0, -9223372036854775807L, peekPosition);
    }
}
