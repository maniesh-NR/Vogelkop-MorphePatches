package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class ztl {
    public final mfe a;
    public final cfe b = new cfe(Boolean.FALSE);
    public nh4 c;

    public ztl(mfe mfeVar) {
        this.a = mfeVar;
    }

    public final void a() {
        this.b.c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        cfe cfeVar = this.b;
        return ((Boolean) cfeVar.b.getValue()).booleanValue() || ((Boolean) cfeVar.c.getValue()).booleanValue();
    }

    public final Object c(gfe gfeVar, kuk kukVar) {
        mt5 mt5Var = null;
        n2h n2hVar = new n2h(this, new pv((byte) 20, mt5Var, this), gfeVar, (mt5) null, (byte) 4);
        mfe mfeVar = this.a;
        mfeVar.getClass();
        Object objQ = sgb.q(new ogb(gfeVar, mfeVar, n2hVar, mt5Var, (byte) 1), kukVar);
        return objQ == px5.a ? objQ : Unit.a;
    }
}
