package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hhl implements cr9 {
    public final /* synthetic */ gbc a;
    public final /* synthetic */ dil b;
    public final /* synthetic */ mil c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ i9f f;
    public final /* synthetic */ okm g;
    public final /* synthetic */ lw5 h;
    public final /* synthetic */ int i;

    public /* synthetic */ hhl(gbc gbcVar, dil dilVar, mil milVar, boolean z, boolean z2, i9f i9fVar, okm okmVar, lw5 lw5Var, int i) {
        this.a = gbcVar;
        this.b = dilVar;
        this.c = milVar;
        this.d = z;
        this.e = z2;
        this.f = i9fVar;
        this.g = okmVar;
        this.h = lw5Var;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Integer) obj3).getClass();
        vt9 vt9Var = (ih5) obj2;
        vt9Var.W(851809892);
        Object objK = vt9Var.K();
        Object obj4 = hh5.a;
        if (objK == obj4) {
            objK = new wjl();
            vt9Var.g0(objK);
        }
        wjl wjlVar = (wjl) objK;
        Object objK2 = vt9Var.K();
        if (objK2 == obj4) {
            objK2 = new qi6();
            vt9Var.g0(objK2);
        }
        ghl ghlVar = new ghl(this.a, this.b, this.c, this.d, this.e, wjlVar, this.f, this.g, (qi6) objK2, this.h, this.i);
        boolean zH = vt9Var.h(ghlVar);
        Object objK3 = vt9Var.K();
        if (zH || objK3 == obj4) {
            lrk lrkVar = new lrk(1, ghlVar, ghl.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, (byte) 5);
            vt9Var.g0(lrkVar);
            objK3 = lrkVar;
        }
        c8e c8eVarM = f03.M((mtb) objK3);
        vt9Var.p(false);
        return c8eVarM;
    }
}
