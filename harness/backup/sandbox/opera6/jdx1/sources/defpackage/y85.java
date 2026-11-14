package defpackage;

/* loaded from: classes.dex */
public final class y85 implements hbb {
    public final long a;
    public final int b;

    public /* synthetic */ y85(int i, long j) {
        this.b = i;
        this.a = j;
    }

    public /* synthetic */ y85(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static y85 a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + (cCharAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new y85(j, i3);
    }

    public static y85 b(lp6 lp6Var, g1g g1gVar) {
        lp6Var.peekFully(g1gVar.a, 0, 8, false);
        g1gVar.N(0);
        return new y85(g1gVar.m(), g1gVar.r());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rh6 */
    @Override // defpackage.hbb
    public final ebb toInstant() throws rh6 {
        ebb ebbVar = ebb.c;
        long j = ebb.c.a;
        long j2 = this.a;
        if (j2 >= j && j2 <= ebb.d.a) {
            return j06.n(j2, this.b);
        }
        throw new rh6("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
