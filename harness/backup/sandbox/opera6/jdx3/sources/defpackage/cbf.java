package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cbf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dbf b;

    public /* synthetic */ cbf(dbf dbfVar, byte b) {
        this.a = b;
        this.b = dbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dbf dbfVar = this.b;
        switch (b) {
            case 0:
                dbfVar.n = null;
                break;
            case 1:
                dbfVar.o = null;
                gbf gbfVar = dbfVar.q;
                gbfVar.m(true);
                zqi zqiVar = (zqi) gbfVar.s.get();
                mri mriVar = zqiVar.a;
                if (mriVar.k()) {
                    mriVar.b();
                }
                zqiVar.b.b();
                break;
            case 2:
                dbfVar.A(qk0.b);
                break;
            default:
                dbfVar.A(qk0.F);
                break;
        }
    }
}
