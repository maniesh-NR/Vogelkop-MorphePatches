package defpackage;

/* loaded from: classes.dex */
public final class lr6 implements pfd {
    public final /* synthetic */ byte a;
    public final pfd b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ lr6(pfd pfdVar, Enum r2, Enum r3, byte b) {
        this.a = b;
        this.b = pfdVar;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.pfd
    public final int E(int i) {
        switch (this.a) {
        }
        return this.b.E(i);
    }

    @Override // defpackage.pfd
    public final int J(int i) {
        switch (this.a) {
        }
        return this.b.J(i);
    }

    @Override // defpackage.pfd
    public final ifg N(long j) {
        byte b = this.a;
        Enum r1 = this.c;
        Enum r2 = this.d;
        pfd pfdVar = this.b;
        switch (b) {
            case 0:
                thb thbVar = (thb) r1;
                if (((xhb) r2) == xhb.a) {
                    return new l69(thbVar == thb.b ? pfdVar.J(yo5.g(j)) : pfdVar.E(yo5.g(j)), yo5.c(j) ? yo5.g(j) : 32767, (byte) 0);
                }
                return new l69(yo5.d(j) ? yo5.h(j) : 32767, thbVar == thb.b ? pfdVar.c(yo5.h(j)) : pfdVar.z(yo5.h(j)), (byte) 0);
            case 1:
                bgd bgdVar = (bgd) r1;
                if (((cgd) r2) == cgd.a) {
                    return new l69(bgdVar == bgd.b ? pfdVar.J(yo5.g(j)) : pfdVar.E(yo5.g(j)), yo5.c(j) ? yo5.g(j) : 32767, (byte) 1);
                }
                return new l69(yo5.d(j) ? yo5.h(j) : 32767, bgdVar == bgd.b ? pfdVar.c(yo5.h(j)) : pfdVar.z(yo5.h(j)), (byte) 1);
            default:
                zye zyeVar = (zye) r1;
                if (((aze) r2) == aze.a) {
                    return new l69(zyeVar == zye.b ? pfdVar.J(yo5.g(j)) : pfdVar.E(yo5.g(j)), yo5.c(j) ? yo5.g(j) : 32767, (byte) 2);
                }
                return new l69(yo5.d(j) ? yo5.h(j) : 32767, zyeVar == zye.b ? pfdVar.c(yo5.h(j)) : pfdVar.z(yo5.h(j)), (byte) 2);
        }
    }

    @Override // defpackage.pfd
    public final int c(int i) {
        switch (this.a) {
        }
        return this.b.c(i);
    }

    @Override // defpackage.pfd
    public final Object p() {
        switch (this.a) {
        }
        return this.b.p();
    }

    @Override // defpackage.pfd
    public final int z(int i) {
        switch (this.a) {
        }
        return this.b.z(i);
    }
}
