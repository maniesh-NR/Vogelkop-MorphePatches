package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jxk implements uif, dkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxk b;

    public /* synthetic */ jxk(kxk kxkVar, byte b) {
        this.a = b;
        this.b = kxkVar;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        kxk kxkVar = this.b;
        switch (b) {
            case 1:
                bf9 bf9Var = (bf9) kxkVar.c.get();
                bf9Var.f(new ixk(kxkVar, bf9Var, (byte) 1));
                break;
            default:
                bf9 bf9Var2 = (bf9) kxkVar.c.get();
                zzh zzhVar = new zzh(kxkVar, (byte) 18);
                myk mykVarS = bf9Var2.s();
                if (mykVarS != null) {
                    new jyk(mykVarS, zzhVar);
                    break;
                } else {
                    zzhVar.run(Boolean.FALSE);
                    break;
                }
        }
    }

    @Override // defpackage.uif
    public final void i(zhj zhjVar) {
        zhjVar.c(this.b.e);
    }
}
