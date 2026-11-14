package defpackage;

/* loaded from: classes.dex */
public final class rtg implements f7f {
    public final /* synthetic */ byte a = 0;
    public final x5f b;

    public rtg(slk slkVar, x5f x5fVar) {
        this.b = x5fVar;
        slkVar.c.g.k(this);
    }

    public rtg(x5f x5fVar, kze kzeVar) {
        this.b = x5fVar;
        kzeVar.k(this);
    }

    public final void d0(Object obj) {
        qe0 qe0Var;
        int i;
        byte b = this.a;
        x5f x5fVar = this.b;
        switch (b) {
            case 0:
                int i2 = ((qtg) obj).a;
                if (i2 == 0) {
                    qe0Var = qe0.b;
                } else if (i2 == 1) {
                    qe0Var = qe0.c;
                } else if (i2 == 2) {
                    qe0Var = qe0.d;
                }
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                e66 e66Var = new ck0(zpaVar, x56VarF).i().a;
                e66Var.getClass();
                e66Var.q(29, 1, qe0Var);
                x5fVar.U0(x56VarF);
                break;
            default:
                wvg wvgVar = (wvg) obj;
                ar0 ar0Var = (wvgVar == null || !((i = wvgVar.e) == 3 || i == 4 || i == 5 || i == 6)) ? ar0.d : wvgVar.j != null ? ar0.c : ar0.b;
                zpa zpaVar2 = x5fVar.d;
                x56 x56VarF2 = zpa.F();
                e66 e66VarO = x56VarF2.O(zpaVar2);
                e66VarO.getClass();
                e66VarO.q(11, 1, ar0Var);
                x5fVar.U0(x56VarF2);
                break;
        }
    }
}
