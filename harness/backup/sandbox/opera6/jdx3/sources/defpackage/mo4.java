package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mo4 implements fjc, vqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qjd b;

    public /* synthetic */ mo4(qjd qjdVar, byte b) {
        this.a = b;
        this.b = qjdVar;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        qjd qjdVar = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 0:
                eigVar.B(2, qjdVar);
                break;
            case 1:
                eigVar.B(0, qjdVar);
                break;
            default:
                eigVar.B(qjdVar == null ? 3 : 1, qjdVar);
                break;
        }
    }

    public final Object l(npd npdVar, nod nodVar, int i) {
        byte b = this.a;
        qjd qjdVar = this.b;
        switch (b) {
        }
        return npdVar.k(nodVar, h1b.v(qjdVar));
    }
}
