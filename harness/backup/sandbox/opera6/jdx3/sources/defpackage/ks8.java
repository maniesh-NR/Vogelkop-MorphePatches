package defpackage;

import android.view.View;
import com.opera.android.favorites.e;

/* loaded from: classes.dex */
public final class ks8 extends y0j {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks8(Object obj, byte b) {
        super(0);
        this.c = b;
        this.d = obj;
    }

    @Override // defpackage.y0j
    public final void a(View view) {
        ns8 ns8Var;
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                ls8 ls8Var = (ls8) obj;
                if (ls8Var.f != null && (ns8Var = ls8Var.d) != null) {
                    e eVarY = ls8Var.Y();
                    hq8 hq8Var = ls8Var.f;
                    ns8Var.M(eVarY, hq8Var);
                    p6l p6lVar = ns8Var.z;
                    String strI = hq8Var.i(p6l.a);
                    hk6.e.getClass();
                    hk6 hk6VarS = a36.s(strI);
                    if (!(hk6VarS == null ? true : ns8Var.u.a(hk6VarS))) {
                        rxh rxhVar = new rxh(2132018566);
                        z77 z77VarU = sfe.U(ns8Var.e.getContext());
                        gkj gkjVar = new gkj(false, false);
                        gkjVar.a = null;
                        gkjVar.b = null;
                        gkjVar.c = null;
                        gkjVar.d = null;
                        gkjVar.e = null;
                        gkjVar.f = null;
                        gkjVar.g = null;
                        gkjVar.h = null;
                        gkjVar.i = null;
                        gkjVar.j = null;
                        gkjVar.k = 0;
                        gkjVar.l = 2132019218;
                        gkjVar.m = 0;
                        gkjVar.n = true;
                        gkjVar.o = rxhVar;
                        z77VarU.getClass();
                        z77VarU.b(gkjVar, ijm.b);
                        break;
                    } else {
                        lqm lqmVar = hq8Var.b instanceof ydh ? lqm.G : lqm.f;
                        boolean zA0 = z5i.a0(hq8Var.i(p6lVar));
                        vx3 vx3VarA = ay3.a(hq8Var.i(p6lVar), lqmVar, false);
                        vx3VarA.c = 1;
                        vx3VarA.k = wx3.Go;
                        vx3VarA.q = zA0;
                        am2.v(vx3VarA);
                        break;
                    }
                }
                break;
            case 1:
                gld gldVar = (gld) obj;
                zhj.a(new rld(gldVar.D), 4099).c(gldVar.requireContext());
                break;
            default:
                ((View.OnClickListener) obj).onClick(view);
                break;
        }
    }
}
