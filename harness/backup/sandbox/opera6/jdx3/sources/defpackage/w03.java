package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w03 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pr b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w03(pr prVar, Object obj, byte b) {
        this.a = b;
        this.b = prVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        pr prVar = this.b;
        switch (b) {
            case 0:
                if (prVar.a == 0) {
                    prVar.G(obj);
                    break;
                }
                break;
            default:
                int i = prVar.a - 1;
                prVar.a = i;
                if (i == 0) {
                    prVar.G(obj);
                    break;
                }
                break;
        }
    }
}
