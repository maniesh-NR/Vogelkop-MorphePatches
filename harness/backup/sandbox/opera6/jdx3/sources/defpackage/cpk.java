package defpackage;

/* loaded from: classes.dex */
public final class cpk implements sq8 {
    public final epk a;
    public final zzh b;
    public tq8 e;
    public boolean f;
    public final yzj d = new yzj(this, 1);
    public final h7f c = new h7f();

    public cpk(epk epkVar, zzh zzhVar) {
        this.a = epkVar;
        this.b = zzhVar;
        zzhVar.run(new zzh(this, (byte) 14));
    }

    @Override // defpackage.sq8
    public final void B(int i, hq8 hq8Var) {
        if (hq8Var.j()) {
            return;
        }
        a();
    }

    public final void a() {
        h7f h7fVar = this.c;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((Runnable) g7fVarH.next()).run();
        }
    }

    @Override // defpackage.sq8
    public final void u(int i, hq8 hq8Var) {
    }

    @Override // defpackage.sq8
    public final void w(hq8 hq8Var) {
        if (hq8Var.j()) {
            ((tq8) hq8Var).F(this);
            return;
        }
        a();
        if (hq8Var.g().isEmpty()) {
            hq8Var.b(this.d);
        }
    }
}
