package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fhd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mhd b;
    public final /* synthetic */ ghd c;

    public /* synthetic */ fhd(mhd mhdVar, ghd ghdVar, byte b) {
        this.a = b;
        this.b = mhdVar;
        this.c = ghdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ghd ghdVar = this.c;
        mhd mhdVar = this.b;
        switch (b) {
            case 0:
                mhdVar.b = ghdVar;
                if (mhdVar.c) {
                    mhdVar.set(ghdVar);
                }
                mhdVar.addListener(new fhd(mhdVar, ghdVar, (byte) 1), new k31(mhdVar, (byte) 3));
                break;
            default:
                if (mhdVar.isCancelled()) {
                    ghdVar.release();
                    break;
                }
                break;
        }
    }
}
