package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ki8 implements fjc, vqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ csh b;

    public /* synthetic */ ki8(csh cshVar, byte b) {
        this.a = b;
        this.b = cshVar;
    }

    public final void invoke(Object obj) {
        ((eig) obj).p(this.b);
    }

    @Override // defpackage.vqd
    public final Object l(npd npdVar, nod nodVar, int i) {
        byte b = this.a;
        csh cshVar = this.b;
        switch (b) {
        }
        return npdVar.k(nodVar, cshVar);
    }
}
