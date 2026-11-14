package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class kab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mab b;

    public /* synthetic */ kab(mab mabVar, byte b) {
        this.a = b;
        this.b = mabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mab mabVar = this.b;
        switch (b) {
            case 0:
                mabVar.requireActivity().J();
                break;
            default:
                mabVar.requireActivity().J();
                break;
        }
    }
}
