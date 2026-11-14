package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zgb implements gjo, g94 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ chb b;

    public /* synthetic */ zgb(chb chbVar, byte b) {
        this.a = b;
        this.b = chbVar;
    }

    @Override // defpackage.gjo
    public final void a(int i) {
        int i2;
        byte b = this.a;
        wz wzVar = wz.a;
        wz wzVar2 = wz.d;
        wz wzVar3 = wz.b;
        wz wzVar4 = wz.c;
        ohb ohbVar = null;
        chb chbVar = this.b;
        switch (b) {
            case 1:
                phj.t(w8h.b(chbVar.j, String.valueOf((int) vep.f(i))), 25);
                qb7 qb7Var = chbVar.p;
                if (qb7Var != null) {
                    dl dlVar = ((h10) qb7Var.a).v;
                    yz yzVar = (yz) qb7Var.c;
                    i2 = i != 0 ? i10.a[vep.A(i)] : -1;
                    if (i2 == 1) {
                        ohbVar = new ohb(wzVar);
                    } else if (i2 == 2) {
                        ohbVar = new ohb(wzVar2);
                    } else if (i2 == 3) {
                        ohbVar = new ohb(wzVar3);
                    } else if (i2 == 4) {
                        ohbVar = new ohb(wzVar4);
                    }
                    yl ylVar = ((j10) qb7Var.b).a;
                    if (ohbVar == null) {
                        ylVar.x(yzVar, dlVar);
                        break;
                    } else {
                        ylVar.v(ohbVar, yzVar, dlVar);
                        break;
                    }
                }
                break;
            default:
                phj.t(w8h.b(chbVar.j, String.valueOf((int) vep.f(i))), 25);
                qb7 qb7Var2 = chbVar.p;
                if (qb7Var2 != null) {
                    dl dlVar2 = ((h10) qb7Var2.a).v;
                    yz yzVar2 = (yz) qb7Var2.c;
                    i2 = i != 0 ? i10.a[vep.A(i)] : -1;
                    if (i2 == 1) {
                        ohbVar = new ohb(wzVar);
                    } else if (i2 == 2) {
                        ohbVar = new ohb(wzVar2);
                    } else if (i2 == 3) {
                        ohbVar = new ohb(wzVar3);
                    } else if (i2 == 4) {
                        ohbVar = new ohb(wzVar4);
                    }
                    yl ylVar2 = ((j10) qb7Var2.b).a;
                    if (ohbVar == null) {
                        ylVar2.x(yzVar2, dlVar2);
                        break;
                    } else {
                        ylVar2.v(ohbVar, yzVar2, dlVar2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.g94
    public final void l(Object obj) {
        Boolean bool = (Boolean) obj;
        chb chbVar = this.b;
        if (chbVar.q == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        l45 l45Var = chbVar.q;
        if (zBooleanValue) {
            l45Var.i();
        } else {
            l45Var.p(bm.INTERNAL_ERROR);
        }
    }
}
