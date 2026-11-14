package defpackage;

import androidx.recyclerview.widget.CustomGridLayoutManager;
import com.opera.android.BrowserActivity;
import com.opera.android.favorites.FavoriteGridLayoutManager;
import com.opera.android.favorites.b;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class kw7 implements Runnable {
    public final /* synthetic */ SettingsManager a;
    public final /* synthetic */ BrowserActivity b;
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ tlg d;
    public final /* synthetic */ p6l e;
    public final /* synthetic */ bvl f;
    public final /* synthetic */ ow7 g;

    public kw7(ow7 ow7Var, SettingsManager settingsManager, BrowserActivity browserActivity, nv2 nv2Var, tlg tlgVar, p6l p6lVar, bvl bvlVar) {
        this.a = settingsManager;
        this.b = browserActivity;
        this.c = nv2Var;
        this.d = tlgVar;
        this.e = p6lVar;
        this.f = bvlVar;
        this.g = ow7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ow7 ow7Var = this.g;
        b bVar = ((e) ow7Var.b).f;
        izj izjVar = ow7Var.e;
        ns8 ns8Var = new ns8(bVar, this.a, true, null, (tta) izjVar.d.g(), true, false, ow7Var.f, (qr8) this.b.g0.E(qr8.class), this.c, this.d, null, this.e);
        ow7Var.i = ns8Var;
        ns8Var.X((vr8) ow7Var.l.g());
        ns8 ns8Var2 = ow7Var.i;
        ns8Var2.t = true;
        ns8Var2.f = new r9i(ow7Var.d, ow7Var.a, new jw7(this.f, (byte) 0));
        ns8Var2.k.b(ow7Var.k);
        tta ttaVar = (tta) izjVar.d.g();
        ns8 ns8Var3 = ow7Var.i;
        if (ns8Var3 != null) {
            ns8Var3.V(ttaVar);
        }
        FavoriteGridLayoutManager favoriteGridLayoutManager = ow7Var.o;
        ttaVar.getClass();
        if (((CustomGridLayoutManager) favoriteGridLayoutManager).g != 1) {
            ((CustomGridLayoutManager) favoriteGridLayoutManager).g = 1;
            favoriteGridLayoutManager.requestLayout();
        }
        ow7Var.c.y0(ow7Var.i);
        x77 x77Var = ow7Var.n;
        ns8 ns8Var4 = ow7Var.i;
        a83 a83Var = (a83) x77Var.d;
        ns8 ns8Var5 = (ns8) x77Var.c;
        if (ns8Var4 == ns8Var5) {
            return;
        }
        if (ns8Var5 != null) {
            ns8Var5.unregisterAdapterDataObserver(a83Var);
        }
        x77Var.c = ns8Var4;
        if (ns8Var4 != null) {
            ns8Var4.registerAdapterDataObserver(a83Var);
        }
        x77Var.p();
    }
}
