package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class c3d implements e3d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f3d b;
    public final /* synthetic */ int c;

    public /* synthetic */ c3d(f3d f3dVar, int i, byte b) {
        this.a = b;
        this.b = f3dVar;
        this.c = i;
    }

    @Override // defpackage.e3d
    public final void run() {
        byte b = this.a;
        int i = this.c;
        f3d f3dVar = this.b;
        switch (b) {
            case 0:
                if (f3dVar.a != null) {
                    f3dVar.b.l(i, (int) r4.k);
                    break;
                } else {
                    f3dVar.e.add(new c3d(f3dVar, i, (byte) 0));
                    break;
                }
            default:
                f3dVar.p(i);
                break;
        }
    }
}
