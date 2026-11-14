package defpackage;

/* loaded from: classes.dex */
public class rv2 implements twi {
    public final /* synthetic */ byte a;
    public final long b;
    public final Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rv2(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public rv2(long j, long j2) {
        this.a = (byte) 2;
        this.b = j;
        vwi vwiVar = j2 == 0 ? vwi.c : new vwi(0L, j2);
        this.c = new swi(vwiVar, vwiVar);
    }

    public /* synthetic */ rv2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((u69) this.c).b();
            default:
                return this.b;
        }
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        long j2;
        long j3;
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                tv2 tv2Var = (tv2) obj;
                swi swiVarB = tv2Var.i[0].b(j);
                while (true) {
                    zz4[] zz4VarArr = tv2Var.i;
                    if (i >= zz4VarArr.length) {
                        return swiVarB;
                    }
                    swi swiVarB2 = zz4VarArr[i].b(j);
                    if (swiVarB2.a.b < swiVarB.a.b) {
                        swiVarB = swiVarB2;
                    }
                    i++;
                }
            case 1:
                u69 u69Var = (u69) obj;
                u69Var.k.getClass();
                bpd bpdVar = u69Var.k;
                long[] jArr = (long[]) bpdVar.b;
                long[] jArr2 = (long[]) bpdVar.c;
                int iF = tym.f(jArr, tym.j((u69Var.e * j) / 1000000, 0L, u69Var.j - 1), false);
                if (iF == -1) {
                    j3 = 0;
                    j2 = 0;
                } else {
                    j2 = jArr[iF];
                    j3 = jArr2[iF];
                }
                int i2 = u69Var.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                vwi vwiVar = new vwi(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new swi(vwiVar, vwiVar);
                }
                int i3 = iF + 1;
                return new swi(vwiVar, new vwi((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (swi) obj;
        }
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        switch (this.a) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }
}
