package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jtk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mtk b;

    public /* synthetic */ jtk(mtk mtkVar, byte b) {
        this.a = b;
        this.b = mtkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mtk mtkVar = this.b;
        switch (b) {
            case 0:
                mtkVar.a();
                break;
            case 1:
                mtkVar.b();
                break;
            default:
                vtk vtkVar = mtkVar.p;
                if (vtkVar != null) {
                    vtkVar.l();
                }
                if (mtkVar.o == null) {
                    mtkVar.n.c();
                }
                mtkVar.o = null;
                break;
        }
    }
}
