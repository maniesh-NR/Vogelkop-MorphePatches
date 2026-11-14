package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mrd implements op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ro9 b;
    public final /* synthetic */ bsc c;
    public final /* synthetic */ tjd d;

    public /* synthetic */ mrd(ro9 ro9Var, bsc bscVar, tjd tjdVar, byte b) {
        this.a = b;
        this.b = ro9Var;
        this.c = bscVar;
        this.d = tjdVar;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        byte b = this.a;
        tjd tjdVar = this.d;
        bsc bscVar = this.c;
        ro9 ro9Var = this.b;
        prd prdVar = (prd) obj;
        switch (b) {
            case 0:
                prdVar.D(ro9Var.b, (jrd) ro9Var.c, bscVar, tjdVar);
                break;
            default:
                prdVar.C(ro9Var.b, (jrd) ro9Var.c, bscVar, tjdVar);
                break;
        }
    }
}
