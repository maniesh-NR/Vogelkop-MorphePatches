package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ue3 implements bg1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af3 b;
    public final /* synthetic */ lh4 c;
    public final /* synthetic */ nsh d;
    public final /* synthetic */ tn e;

    public /* synthetic */ ue3(af3 af3Var, lh4 lh4Var, nsh nshVar, tn tnVar, byte b) {
        this.a = b;
        this.b = af3Var;
        this.c = lh4Var;
        this.d = nshVar;
        this.e = tnVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        tn tnVar = this.e;
        switch (b) {
            case 0:
                cf3 cf3Var = (cf3) obj;
                af3 af3Var = this.b;
                af3Var.b.d(new we3(af3Var, this.c, cf3Var, this.d, tnVar.i())).a(null);
                break;
            default:
                cf3 cf3Var2 = (cf3) obj;
                af3 af3Var2 = this.b;
                af3Var2.b.d(new we3(af3Var2, this.c, cf3Var2, this.d, tnVar.i())).a(null);
                break;
        }
    }
}
