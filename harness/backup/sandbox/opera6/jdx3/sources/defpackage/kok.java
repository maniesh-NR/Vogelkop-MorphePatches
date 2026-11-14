package defpackage;

import android.widget.TextView;
import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.favorites.FavoriteGridLayoutManager;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kok implements hzj {
    public final FadingRecyclerView a;
    public final FeedScrollView b;
    public final TextView c;
    public final FavoriteGridLayoutManager d;
    public final izj e;
    public final ipk f;
    public final iok g;
    public final xok h;
    public final w6j i;
    public final jok j;
    public hok k;
    public final vk2 l;
    public final kr8 m;
    public final gd6 n;
    public final pde o;
    public zzh p;
    public boolean q;
    public boolean r;
    public final eok s;
    public final kze t;
    public final dok u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [dok, f7f] */
    public kok(SettingsManager settingsManager, nr8 nr8Var, ipk ipkVar, BrowserActivity browserActivity, FadingRecyclerView fadingRecyclerView, FeedScrollView feedScrollView, TextView textView, vk2 vk2Var, x5f x5fVar, x5f x5fVar2, osf osfVar, kze kzeVar, qr8 qr8Var, nv2 nv2Var, bvl bvlVar, pde pdeVar, p6l p6lVar) {
        jok jokVar = new jok(this);
        this.j = jokVar;
        a83 a83Var = new a83((Object) this, (byte) 16);
        this.m = new kr8();
        this.o = new pde(Boolean.TRUE);
        final byte b = 1;
        iw7 iw7Var = new iw7(this, b);
        this.s = new eok(this);
        final byte b2 = 0;
        ?? r9 = new f7f(this) { // from class: dok
            public final /* synthetic */ kok b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                kok kokVar = this.b;
                switch (b3) {
                    case 0:
                        hok hokVar = kokVar.k;
                        if (hokVar != null) {
                            hokVar.X((vr8) kokVar.t.g());
                            break;
                        }
                        break;
                    default:
                        kokVar.a.requestLayout();
                        break;
                }
            }
        };
        this.u = r9;
        kze kzeVar2 = (kze) new z61(fadingRecyclerView).b;
        this.a = fadingRecyclerView;
        this.b = feedScrollView;
        this.c = textView;
        this.l = vk2Var;
        izj izjVarK0 = browserActivity.K0();
        this.e = izjVarK0;
        izjVarK0.a.add(this);
        a26.T(pdeVar, kzeVar2, new f7f(this) { // from class: dok
            public final /* synthetic */ kok b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                kok kokVar = this.b;
                switch (b3) {
                    case 0:
                        hok hokVar = kokVar.k;
                        if (hokVar != null) {
                            hokVar.X((vr8) kokVar.t.g());
                            break;
                        }
                        break;
                    default:
                        kokVar.a.requestLayout();
                        break;
                }
            }
        });
        fadingRecyclerView.getContext();
        pde pdeVar2 = izjVarK0.d;
        Objects.requireNonNull(pdeVar2);
        gw7 gw7Var = new gw7(pdeVar2, (byte) 0);
        Objects.requireNonNull(pdeVar);
        FavoriteGridLayoutManager favoriteGridLayoutManager = new FavoriteGridLayoutManager(gw7Var, new gw7(pdeVar, (byte) 1), false);
        this.d = favoriteGridLayoutManager;
        fadingRecyclerView.C0(favoriteGridLayoutManager);
        fadingRecyclerView.B0(null);
        feedScrollView.F(new hw7(this, (byte) 3));
        this.f = ipkVar;
        xok xokVar = new xok();
        this.h = xokVar;
        w6j w6jVar = new w6j(new txi(this, (byte) 24), osfVar, x5fVar);
        this.i = w6jVar;
        this.g = new iok(xokVar, w6jVar);
        gd6 gd6Var = new gd6(fadingRecyclerView.getContext(), (byte) 1);
        this.n = gd6Var;
        hok hokVar = new hok(ipkVar, nr8Var, w6jVar, xokVar, gd6Var, settingsManager, (tta) pdeVar2.g(), x5fVar2, qr8Var, nv2Var, p6lVar);
        this.k = hokVar;
        hokVar.t = true;
        hokVar.s = new qlk(this, (byte) 4);
        hokVar.f = new r9i(feedScrollView, browserActivity.findViewById(2131363371), new jw7(bvlVar, (byte) 1));
        this.k.k.b(iw7Var);
        tta ttaVar = (tta) pdeVar2.g();
        hok hokVar2 = this.k;
        if (hokVar2 != null) {
            hokVar2.V(ttaVar);
        }
        ttaVar.getClass();
        if (((CustomGridLayoutManager) favoriteGridLayoutManager).g != 1) {
            ((CustomGridLayoutManager) favoriteGridLayoutManager).g = 1;
            favoriteGridLayoutManager.requestLayout();
        }
        this.k.registerAdapterDataObserver(jokVar);
        this.k.registerAdapterDataObserver(a83Var);
        fadingRecyclerView.y0(this.k);
        this.t = kzeVar;
        kzeVar.k((f7f) r9);
        ((CustomGridLayoutManager) favoriteGridLayoutManager).f.b(new zdh(this, (byte) 1));
        b(((CustomGridLayoutManager) favoriteGridLayoutManager).b);
        c();
    }

    @Override // defpackage.hzj
    public final void a(boolean z) {
        if (!z || this.k == null) {
            return;
        }
        FadingRecyclerView fadingRecyclerView = this.a;
        fadingRecyclerView.y0((d) null);
        ((RecyclerView) fadingRecyclerView).c.c().f();
        tta ttaVar = (tta) this.e.d.g();
        hok hokVar = this.k;
        if (hokVar != null) {
            hokVar.V(ttaVar);
        }
        ttaVar.getClass();
        FavoriteGridLayoutManager favoriteGridLayoutManager = this.d;
        if (((CustomGridLayoutManager) favoriteGridLayoutManager).g != 1) {
            ((CustomGridLayoutManager) favoriteGridLayoutManager).g = 1;
            favoriteGridLayoutManager.requestLayout();
        }
        fadingRecyclerView.y0(this.k);
    }

    public final void b(int i) {
        zzh zzhVar = this.p;
        if (zzhVar != null) {
            zzhVar.run(Integer.valueOf(i));
        }
        xok xokVar = this.h;
        int i2 = xokVar.i;
        ArrayList arrayList = xokVar.e;
        if (i != i2) {
            xokVar.i = i;
            ArrayList arrayList2 = xokVar.h;
            List listSubList = arrayList2.subList(0, Math.min(arrayList2.size(), xokVar.i));
            while (arrayList.size() > listSubList.size()) {
                xokVar.A(xokVar.u(arrayList.size() - 1));
            }
            for (int size = arrayList.size(); size < listSubList.size(); size++) {
                xokVar.s(size, new qok((ook) listSubList.get(size)));
            }
        }
    }

    public final void c() {
        int size = this.h.e.size();
        this.c.setVisibility(size > 0 ? 0 : 8);
        xf8.F0(this.o, Boolean.valueOf(size == 0));
    }
}
