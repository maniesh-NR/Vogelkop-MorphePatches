package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class z2d implements e3d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f3d b;

    public /* synthetic */ z2d(f3d f3dVar, byte b) {
        this.a = b;
        this.b = f3dVar;
    }

    @Override // defpackage.e3d
    public final void run() {
        byte b = this.a;
        f3d f3dVar = this.b;
        switch (b) {
            case 0:
                f3dVar.n();
                break;
            default:
                f3dVar.k();
                break;
        }
    }
}
