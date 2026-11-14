package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class sxk implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uxk b;

    public /* synthetic */ sxk(uxk uxkVar, byte b) {
        this.a = b;
        this.b = uxkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 2;
        ijm ijmVar = ijm.b;
        uxk uxkVar = this.b;
        switch (b) {
            case 0:
                xtb[] xtbVarArr = uxk.w;
                dyk dykVarI0 = uxkVar.I0();
                cyk cykVar = (cyk) dykVarI0.n.g();
                if (!(cykVar instanceof byk)) {
                    dykVarI0.g();
                    break;
                } else {
                    kxk kxkVar = dykVarI0.j;
                    u7k u7kVar = new u7k(dykVarI0);
                    nej nejVar = ((qim) kxkVar.g.get()).d;
                    xq3 xq3Var = new xq3((byk) cykVar, u7kVar, (byte) 12);
                    nejVar.getClass();
                    nejVar.b(xq3Var, ijmVar);
                    break;
                }
            case 1:
                xtb[] xtbVarArr2 = uxk.w;
                kxk kxkVar2 = uxkVar.I0().j;
                xih.w(kxkVar2.f, (db) kxkVar2.a.get(), null, true);
                break;
            case 2:
                xtb[] xtbVarArr3 = uxk.w;
                kxk kxkVar3 = uxkVar.I0().j;
                xih.w(kxkVar3.f, (db) kxkVar3.a.get(), null, true);
                break;
            case 3:
                xtb[] xtbVarArr4 = uxk.w;
                kxk kxkVar4 = uxkVar.I0().j;
                String string = kxkVar4.e.getString(2132021787, ((db) kxkVar4.a.get()).c());
                qxh qxhVar = string != null ? new qxh(string) : null;
                jxk jxkVar = new jxk(kxkVar4, b2);
                z77 z77Var = ((qim) kxkVar4.g.get()).c;
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = null;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = jxkVar;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 2132021786;
                gkjVar.l = 2132018111;
                gkjVar.m = 0;
                gkjVar.n = true;
                gkjVar.o = qxhVar;
                z77Var.getClass();
                z77Var.b(gkjVar, ijmVar);
                break;
            case 4:
                xtb[] xtbVarArr5 = uxk.w;
                dyk dykVarI02 = uxkVar.I0();
                kxk kxkVar5 = dykVarI02.j;
                xih.y(kxkVar5.e, (zwk) kxkVar5.d.b.get(), new l31(new dnj(dykVarI02, (byte) 22), (byte) 5), null);
                break;
            case 5:
                xtb[] xtbVarArr6 = uxk.w;
                na2.T(uxkVar.I0().j.e);
                break;
            case 6:
                xtb[] xtbVarArr7 = uxk.w;
                dyk dykVarI03 = uxkVar.I0();
                kxk kxkVar6 = dykVarI03.j;
                dykVarI03.i.getClass();
                if (!zwk.h() && dykVarI03.f.b() != jh0.d) {
                    thk thkVar = new thk((byte) 4);
                    kxkVar6.getClass();
                    a06 a06Var = new a06();
                    a06Var.u = new koj(thkVar, (byte) 2);
                    zhj.a(a06Var, 4099).c(kxkVar6.e);
                    break;
                } else {
                    nej nejVar2 = ((qim) kxkVar6.g.get()).d;
                    ((zwk) kxkVar6.d.b.get()).getClass();
                    wwk wwkVar = new wwk(view, zwk.h());
                    nejVar2.getClass();
                    nejVar2.b(wwkVar, ijmVar);
                    break;
                }
                break;
            default:
                xtb[] xtbVarArr8 = uxk.w;
                dyk dykVarI04 = uxkVar.I0();
                dykVarI04.m.j = true;
                dykVarI04.e.b();
                break;
        }
    }
}
