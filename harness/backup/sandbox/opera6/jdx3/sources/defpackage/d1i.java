package defpackage;

/* loaded from: classes.dex */
public final class d1i implements bbb {
    public final rdc a;
    public final kw6 b;
    public final nrl c;
    public rmg d;
    public final kcf e;
    public final Object f;

    public d1i(k2j k2jVar, wtd wtdVar) {
        pcc pccVar = pcc.b;
        rdc rdcVar = new rdc();
        rdcVar.b = v08.a;
        rdcVar.c = pccVar;
        this.a = rdcVar;
        kw6 kw6Var = new kw6(k2jVar);
        this.b = kw6Var;
        nrl nrlVar = new nrl((byte) 9);
        this.c = nrlVar;
        kcf kcfVar = new kcf((Runnable) null, new ip1(this, (byte) 6));
        this.e = kcfVar;
        ml6 ml6Var = new ml6();
        kcfVar.b(new xt2(ml6Var));
        this.f = wtdVar.invoke(new cn6(rdcVar, kw6Var, nrlVar, ml6Var));
    }

    @Override // defpackage.bbb
    public final void onDestroy() {
        this.c.k();
    }
}
