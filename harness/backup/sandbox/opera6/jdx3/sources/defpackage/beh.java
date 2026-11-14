package defpackage;

import android.view.View;
import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.favorites.FavoriteGridLayoutManager;
import com.opera.android.settings.SettingsManager;
import java.util.List;

/* loaded from: classes.dex */
public final class beh extends wu8 {
    public final cy g;
    public final pde h;
    public final RecyclerView i;
    public final FavoriteGridLayoutManager j;
    public final sdh k;
    public final zdh l;

    public beh(mdh mdhVar, qdh qdhVar, qr8 qr8Var, cy cyVar, SettingsManager settingsManager, pde pdeVar, kze kzeVar, x5f x5fVar, x5f x5fVar2, View.OnLongClickListener onLongClickListener, View view, nv2 nv2Var, tlg tlgVar, pde pdeVar2, p6l p6lVar) {
        super(view);
        this.g = cyVar;
        this.h = pdeVar;
        kze kzeVarZ = p37.z(((i) this).itemView);
        RecyclerView recyclerView = (RecyclerView) ((i) this).itemView.findViewById(2131363055);
        this.i = recyclerView;
        recyclerView.getContext();
        final byte b = 0;
        FavoriteGridLayoutManager favoriteGridLayoutManager = new FavoriteGridLayoutManager(new jjg(this, (byte) 3), new gw7(pdeVar2, (byte) 3), false);
        this.j = favoriteGridLayoutManager;
        sdh sdhVar = new sdh(mdhVar, qdhVar, new ydh(((f8f) mdhVar.f.getValue()).c() ? 3 : 2, ((CustomGridLayoutManager) favoriteGridLayoutManager).b, qdhVar.b), settingsManager, (tta) pdeVar.g(), false, x5fVar, x5fVar2, qr8Var, nv2Var, tlgVar, p6lVar);
        this.k = sdhVar;
        zdh zdhVar = new zdh(this, (byte) 0);
        this.l = zdhVar;
        recyclerView.C0(favoriteGridLayoutManager);
        recyclerView.y0(sdhVar);
        recyclerView.setNestedScrollingEnabled(false);
        ((CustomGridLayoutManager) favoriteGridLayoutManager).f.b(zdhVar);
        cyVar.h(recyclerView, sdhVar);
        h42 h42Var = mdhVar.h;
        a26.T(h42Var, kzeVarZ, new f7f(this) { // from class: aeh
            public final /* synthetic */ beh b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                beh behVar = this.b;
                switch (b2) {
                    case 0:
                        ((ydh) ((tq8) behVar.k.c.b)).E((List) obj);
                        break;
                    case 1:
                        behVar.k.X((vr8) obj);
                        break;
                    case 2:
                        FavoriteGridLayoutManager favoriteGridLayoutManager2 = behVar.j;
                        pde pdeVar3 = behVar.h;
                        ((tta) pdeVar3.g()).getClass();
                        if (((CustomGridLayoutManager) favoriteGridLayoutManager2).g != 1) {
                            ((CustomGridLayoutManager) favoriteGridLayoutManager2).g = 1;
                            favoriteGridLayoutManager2.requestLayout();
                        }
                        sdh sdhVar2 = behVar.k;
                        sdhVar2.V((tta) pdeVar3.g());
                        RecyclerView recyclerView2 = behVar.i;
                        if (recyclerView2.m != null) {
                            recyclerView2.y0(sdhVar2);
                            break;
                        }
                        break;
                    default:
                        ((Integer) obj).getClass();
                        behVar.i.requestLayout();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(kzeVar, kzeVarZ, new f7f(this) { // from class: aeh
            public final /* synthetic */ beh b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                beh behVar = this.b;
                switch (b22) {
                    case 0:
                        ((ydh) ((tq8) behVar.k.c.b)).E((List) obj);
                        break;
                    case 1:
                        behVar.k.X((vr8) obj);
                        break;
                    case 2:
                        FavoriteGridLayoutManager favoriteGridLayoutManager2 = behVar.j;
                        pde pdeVar3 = behVar.h;
                        ((tta) pdeVar3.g()).getClass();
                        if (((CustomGridLayoutManager) favoriteGridLayoutManager2).g != 1) {
                            ((CustomGridLayoutManager) favoriteGridLayoutManager2).g = 1;
                            favoriteGridLayoutManager2.requestLayout();
                        }
                        sdh sdhVar2 = behVar.k;
                        sdhVar2.V((tta) pdeVar3.g());
                        RecyclerView recyclerView2 = behVar.i;
                        if (recyclerView2.m != null) {
                            recyclerView2.y0(sdhVar2);
                            break;
                        }
                        break;
                    default:
                        ((Integer) obj).getClass();
                        behVar.i.requestLayout();
                        break;
                }
            }
        });
        new eqh(recyclerView, onLongClickListener);
        List list = (List) h42Var.g();
        if (list != null) {
            ((ydh) ((tq8) sdhVar.c.b)).E(list);
        }
        sdhVar.X((vr8) kzeVar.g());
        final byte b3 = 2;
        a26.T(pdeVar, kzeVarZ, new f7f(this) { // from class: aeh
            public final /* synthetic */ beh b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                beh behVar = this.b;
                switch (b22) {
                    case 0:
                        ((ydh) ((tq8) behVar.k.c.b)).E((List) obj);
                        break;
                    case 1:
                        behVar.k.X((vr8) obj);
                        break;
                    case 2:
                        FavoriteGridLayoutManager favoriteGridLayoutManager2 = behVar.j;
                        pde pdeVar3 = behVar.h;
                        ((tta) pdeVar3.g()).getClass();
                        if (((CustomGridLayoutManager) favoriteGridLayoutManager2).g != 1) {
                            ((CustomGridLayoutManager) favoriteGridLayoutManager2).g = 1;
                            favoriteGridLayoutManager2.requestLayout();
                        }
                        sdh sdhVar2 = behVar.k;
                        sdhVar2.V((tta) pdeVar3.g());
                        RecyclerView recyclerView2 = behVar.i;
                        if (recyclerView2.m != null) {
                            recyclerView2.y0(sdhVar2);
                            break;
                        }
                        break;
                    default:
                        ((Integer) obj).getClass();
                        behVar.i.requestLayout();
                        break;
                }
            }
        });
        final byte b4 = 3;
        a26.T(pdeVar2, kzeVarZ, new f7f(this) { // from class: aeh
            public final /* synthetic */ beh b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b4;
                beh behVar = this.b;
                switch (b22) {
                    case 0:
                        ((ydh) ((tq8) behVar.k.c.b)).E((List) obj);
                        break;
                    case 1:
                        behVar.k.X((vr8) obj);
                        break;
                    case 2:
                        FavoriteGridLayoutManager favoriteGridLayoutManager2 = behVar.j;
                        pde pdeVar3 = behVar.h;
                        ((tta) pdeVar3.g()).getClass();
                        if (((CustomGridLayoutManager) favoriteGridLayoutManager2).g != 1) {
                            ((CustomGridLayoutManager) favoriteGridLayoutManager2).g = 1;
                            favoriteGridLayoutManager2.requestLayout();
                        }
                        sdh sdhVar2 = behVar.k;
                        sdhVar2.V((tta) pdeVar3.g());
                        RecyclerView recyclerView2 = behVar.i;
                        if (recyclerView2.m != null) {
                            recyclerView2.y0(sdhVar2);
                            break;
                        }
                        break;
                    default:
                        ((Integer) obj).getClass();
                        behVar.i.requestLayout();
                        break;
                }
            }
        });
    }

    @Override // defpackage.wu8
    public final void c0() {
        this.g.g(false);
    }

    @Override // defpackage.wu8
    public final void e0() {
        this.g.g(true);
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        this.g.h(null, null);
        ((CustomGridLayoutManager) this.j).f.c(this.l);
        this.i.y0((d) null);
    }
}
