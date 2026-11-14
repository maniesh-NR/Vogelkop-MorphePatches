package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class fzk {
    public static final /* synthetic */ xtb[] e = {new pee(fzk.class, "bgColor", "getBgColor()Lcom/opera/android/ResColor;", 0)};
    public final View a;
    public final qwe b;
    public final fz2 c = new fz2(new dxh(2130969325), this, 7);
    public final mcj d;

    public fzk(View view, Window window, qwe qweVar) {
        this.a = view;
        this.b = qweVar;
        this.d = new mcj(window);
        a26.U(qweVar, p37.z(view), new aq8(this, (byte) 1), new dnj(this, (byte) 23));
        svk svkVar = new svk(this, (byte) 2);
        q9n.e(view, svkVar);
        svkVar.a(view);
    }

    public final void a() {
        xtb xtbVar = e[0];
        cxh cxhVar = (cxh) this.c.b;
        View view = this.a;
        int iX = p37.X(cxhVar.a(view.getContext()), this.b.a.a);
        view.setBackgroundColor(iX);
        boolean zU0 = p37.u0(iX);
        mcj mcjVar = this.d;
        mcjVar.t(zU0);
        mcjVar.r(p37.u0(iX));
        Window window = (Window) mcjVar.b;
        if (window.getStatusBarColor() != 0) {
            window.setStatusBarColor(0);
            mcjVar.j();
        }
        if (window.getNavigationBarColor() == 0) {
            return;
        }
        window.setNavigationBarColor(0);
        mcjVar.j();
    }
}
