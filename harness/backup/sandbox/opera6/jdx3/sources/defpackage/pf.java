package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class pf extends cej {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public final Object d;

    public /* synthetic */ pf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        rxh rxhVar;
        jp9 jp9Var;
        rxh rxhVar2;
        kp9 kp9Var;
        byte b = this.a;
        Object obj = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                qf qfVar = new qf(mejVar, (yu2) obj, b2);
                qfVar.a.b(new of(this, (byte) 0));
                return qfVar;
            default:
                lp9 lp9Var = (lp9) obj;
                nv6 nv6VarB = lp9Var.c.b();
                int i = lp9Var.c.a.getInt("vpn.free_promo.1.show_count", 0) + 1;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                editor.putInt("vpn.free_promo.1.show_count", i);
                editor.putLong("vpn.free_promo.1.show_timestamp", System.currentTimeMillis());
                nv6VarB.w();
                Context context = mejVar.getContext();
                lxh lxhVar = new lxh(2131233310);
                rxh rxhVar3 = new rxh(2132022137);
                rxh rxhVar4 = new rxh(2132022258);
                rxh rxhVar5 = new rxh(2132020043);
                jp9 jp9Var2 = new jp9();
                if (o18.h(context, rxhVar5) == 0) {
                    rxhVar = null;
                    jp9Var = null;
                } else {
                    rxhVar = rxhVar5;
                    jp9Var = jp9Var2;
                }
                rxh rxhVar6 = new rxh(2132022136);
                kp9 kp9Var2 = new kp9(this, lp9Var, (b2l) this.d, b2);
                if (o18.h(context, rxhVar6) == 0) {
                    rxhVar2 = null;
                    kp9Var = null;
                } else {
                    rxhVar2 = rxhVar6;
                    kp9Var = kp9Var2;
                }
                return new qf(mejVar, (Object) new gua(null, null, null, lxhVar, rxhVar3, rxhVar4, null, rxhVar, jp9Var, rxhVar2, kp9Var, true, null, false, null), (byte) 2);
        }
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 1:
                lp9 lp9Var = (lp9) this.c;
                lp9Var.g = null;
                orm ormVar = lp9Var.b;
                vb0 vb0Var = this.b ? vb0.b : vb0.d;
                byte b = 0;
                long j = lp9Var.c.a.getInt("vpn.free_promo.1.show_count", 0);
                x5f x5fVar = (x5f) ormVar;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).d().b(new q5f(j, vb0Var, b));
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            default:
                super.onFinished(hjmVar);
                break;
        }
    }
}
