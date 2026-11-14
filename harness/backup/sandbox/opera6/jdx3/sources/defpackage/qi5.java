package defpackage;

/* loaded from: classes.dex */
public final class qi5 implements wkn {
    public final /* synthetic */ byte a;
    public final Object b;
    public final ode c;

    public qi5(ru9 ru9Var) {
        this.a = (byte) 1;
        this.b = ru9Var;
        this.c = new tu9(ru9.j, new sul((byte) 7), ru9Var);
    }

    public qi5(wkn[] wknVarArr) {
        this.a = (byte) 0;
        this.b = wknVarArr;
        this.c = new h42();
        for (wkn wknVar : wknVarArr) {
            ((h42) this.c).s(wknVar.a(), new cl4(new wg5(this, (byte) 2), (byte) 4));
        }
    }

    @Override // defpackage.wkn
    public final ekc a() {
        byte b = this.a;
        ode odeVar = this.c;
        switch (b) {
            case 0:
                return (h42) odeVar;
            default:
                return (tu9) odeVar;
        }
    }
}
