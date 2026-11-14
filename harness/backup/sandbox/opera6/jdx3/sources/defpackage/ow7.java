package defpackage;

import android.view.View;
import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;
import com.opera.android.favorites.FavoriteGridLayoutManager;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ow7 implements hzj {
    public final View a;
    public final nr8 b;
    public final RecyclerView c;
    public final FeedScrollView d;
    public final izj e;
    public final x5f f;
    public final jr8 g;
    public final lw7 h;
    public ns8 i;
    public boolean j;
    public final iw7 k;
    public final kze l;
    public final fw7 m;
    public final x77 n;
    public final FavoriteGridLayoutManager o;

    /* JADX WARN: Type inference failed for: r7v1, types: [f7f, fw7] */
    public ow7(BrowserActivity browserActivity, nr8 nr8Var, RecyclerView recyclerView, FeedScrollView feedScrollView, bvl bvlVar, x5f x5fVar, SettingsManager settingsManager, kze kzeVar, nv2 nv2Var, tlg tlgVar, pde pdeVar, p6l p6lVar) {
        kr8 kr8Var = new kr8();
        final byte b = 0;
        this.k = new iw7(this, b);
        ?? r7 = new f7f(this) { // from class: fw7
            public final /* synthetic */ ow7 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                ow7 ow7Var = this.b;
                switch (b2) {
                    case 0:
                        ns8 ns8Var = ow7Var.i;
                        if (ns8Var != null) {
                            ns8Var.X((vr8) ow7Var.l.g());
                            break;
                        }
                        break;
                    default:
                        ow7Var.c.requestLayout();
                        break;
                }
            }
        };
        this.m = r7;
        this.n = new x77((byte) 7);
        kze kzeVarZ = p37.z(recyclerView);
        this.a = browserActivity.findViewById(2131363371);
        this.b = nr8Var;
        this.c = recyclerView;
        recyclerView.B0(kr8Var);
        recyclerView.setNestedScrollingEnabled(false);
        this.d = feedScrollView;
        recyclerView.getResources();
        izj izjVarK0 = browserActivity.K0();
        this.e = izjVarK0;
        izjVarK0.a.add(this);
        final byte b2 = 1;
        a26.T(pdeVar, kzeVarZ, new f7f(this) { // from class: fw7
            public final /* synthetic */ ow7 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                ow7 ow7Var = this.b;
                switch (b22) {
                    case 0:
                        ns8 ns8Var = ow7Var.i;
                        if (ns8Var != null) {
                            ns8Var.X((vr8) ow7Var.l.g());
                            break;
                        }
                        break;
                    default:
                        ow7Var.c.requestLayout();
                        break;
                }
            }
        });
        this.f = x5fVar;
        this.g = new jr8(x5fVar);
        this.l = kzeVar;
        kzeVar.k((f7f) r7);
        this.h = new lw7(this, browserActivity.getLifecycle());
        recyclerView.getContext();
        pde pdeVar2 = izjVarK0.d;
        Objects.requireNonNull(pdeVar2);
        gw7 gw7Var = new gw7(pdeVar2, (byte) 0);
        Objects.requireNonNull(pdeVar);
        FavoriteGridLayoutManager favoriteGridLayoutManager = new FavoriteGridLayoutManager(gw7Var, new gw7(pdeVar, (byte) 1), false);
        this.o = favoriteGridLayoutManager;
        recyclerView.C0(favoriteGridLayoutManager);
        nw7 nw7Var = new nw7(this);
        int i = RootView.D;
        recyclerView.setTag(2131362626, nw7Var);
        feedScrollView.F(new hw7(this, b));
        nr8Var.f(new kw7(this, settingsManager, browserActivity, nv2Var, tlgVar, p6lVar, bvlVar));
    }

    @Override // defpackage.hzj
    public final void a(boolean z) {
        if (z) {
            tta ttaVar = (tta) this.e.d.g();
            ns8 ns8Var = this.i;
            if (ns8Var != null) {
                ns8Var.V(ttaVar);
            }
            ttaVar.getClass();
            FavoriteGridLayoutManager favoriteGridLayoutManager = this.o;
            if (((CustomGridLayoutManager) favoriteGridLayoutManager).g != 1) {
                ((CustomGridLayoutManager) favoriteGridLayoutManager).g = 1;
                favoriteGridLayoutManager.requestLayout();
            }
            RecyclerView recyclerView = this.c;
            d dVar = recyclerView.m;
            if (dVar != null) {
                recyclerView.y0((d) null);
                recyclerView.c.c().f();
                recyclerView.y0(dVar);
            }
        }
    }
}
