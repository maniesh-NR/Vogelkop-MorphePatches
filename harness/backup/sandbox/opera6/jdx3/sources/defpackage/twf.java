package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class twf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q2f b;

    public /* synthetic */ twf(q2f q2fVar, byte b) {
        this.a = b;
        this.b = q2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        q2f q2fVar = this.b;
        switch (b) {
            case 0:
                q2fVar.j.h();
                break;
            default:
                q2fVar.f(hjm.b);
                break;
        }
    }
}
