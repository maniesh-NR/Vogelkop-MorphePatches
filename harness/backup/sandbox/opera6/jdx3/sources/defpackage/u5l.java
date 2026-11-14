package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class u5l implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z5l b;

    public /* synthetic */ u5l(z5l z5lVar, byte b) {
        this.a = b;
        this.b = z5lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z5l z5lVar = this.b;
        switch (b) {
            case 0:
                z5lVar.v.l = p2l.a;
                break;
            default:
                zg zgVar = z5lVar.p;
                int i = zgVar.a - 1;
                zgVar.a = i;
                if (i == 0) {
                    zgVar.x();
                    break;
                }
                break;
        }
    }
}
