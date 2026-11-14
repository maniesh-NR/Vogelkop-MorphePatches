package defpackage;

/* loaded from: classes.dex */
public final class xtl implements fog {
    public final int a;

    public xtl(int i) {
        this.a = i;
    }

    @Override // defpackage.fog
    public final long b(ccb ccbVar, long j, d2c d2cVar, long j2) {
        int i = (int) (j2 >> 32);
        int iD = z1m.d(ccbVar.d(), i, 2, ccbVar.a);
        if (iD < 0) {
            iD = ccbVar.a;
        } else if (iD + i > ((int) (j >> 32))) {
            iD = ccbVar.c - i;
        }
        int i2 = ccbVar.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = ccbVar.d + i3;
        }
        return (iD << 32) | (i4 & 4294967295L);
    }
}
