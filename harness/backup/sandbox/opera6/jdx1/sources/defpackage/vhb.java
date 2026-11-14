package defpackage;

/* loaded from: classes.dex */
public abstract class vhb extends b8e implements e3c {
    public final /* synthetic */ byte o;

    public int E(o1d o1dVar, pfd pfdVar, int i) {
        switch (this.o) {
        }
        return pfdVar.c(i);
    }

    @Override // defpackage.e3c
    public int N(o1d o1dVar, pfd pfdVar, int i) {
        switch (this.o) {
        }
        return pfdVar.E(i);
    }

    public abstract long T0(pfd pfdVar, long j);

    public abstract boolean U0();

    public ufd c(vfd vfdVar, pfd pfdVar, long j) {
        long jT0 = T0(pfdVar, j);
        if (U0()) {
            jT0 = ap5.e(j, jT0);
        }
        ifg ifgVarN = pfdVar.N(jT0);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 7));
    }

    @Override // defpackage.e3c
    public int f(o1d o1dVar, pfd pfdVar, int i) {
        switch (this.o) {
        }
        return pfdVar.J(i);
    }

    public int r0(o1d o1dVar, pfd pfdVar, int i) {
        switch (this.o) {
        }
        return pfdVar.z(i);
    }
}
