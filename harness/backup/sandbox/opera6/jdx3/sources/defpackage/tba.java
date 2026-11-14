package defpackage;

/* loaded from: classes.dex */
public final class tba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s9i b;

    public /* synthetic */ tba(s9i s9iVar, byte b) {
        this.a = b;
        this.b = s9iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s9i s9iVar = this.b;
        switch (b) {
            case 0:
                ((ro9) s9iVar.c).b = 3;
                break;
            default:
                s9iVar.T();
                break;
        }
    }
}
