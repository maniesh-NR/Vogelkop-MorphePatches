package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class zse extends lj {
    public final int r;
    public final int s;
    public y83 t;
    public MenuItem u;
    public final tni v;
    public final zyk w;
    public final ua7 x;
    public wse y;

    /* JADX WARN: Illegal instructions before constructor call */
    public zse(tni tniVar, gjm gjmVar) {
        u7k u7kVarJ = u7k.j(2131558545);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(2132018578);
        itlVar.b = 2131755067;
        super(itlVar);
        this.r = 2132020010;
        this.s = 2132020000;
        this.v = tniVar;
        this.w = z4c.b(new yse(this, (byte) 0));
        this.x = new ua7((Fragment) this, gjmVar);
    }

    public final dte G0() {
        return (dte) this.w.getValue();
    }

    public final void H0(ij0 ij0Var, l0c l0cVar) {
        dte dteVarG0 = G0();
        ua7 ua7Var = this.x;
        ij0 ij0VarA = ij0.a(((t73) ua7Var.p()).a());
        dteVarG0.getClass();
        String string = l0cVar.toString();
        ru9 ru9Var = dteVarG0.c;
        String string2 = ru9Var.a.getString("settings.news.language_region.recently_used", "");
        List listY = StringsKt.Y(string2 != null ? string2 : "", new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str) && !Intrinsics.a(str, string)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListJ = j95.j(new String[]{string});
        int size = arrayList.size();
        if (2 <= size) {
            size = 2;
        }
        for (int i = 0; i < size; i++) {
            arrayListJ.add(arrayList.get(i));
        }
        nv6 nv6VarB = ru9Var.b();
        ((SharedPreferences.Editor) nv6VarB.a).putString("settings.news.language_region.recently_used", CollectionsKt.P(arrayListJ, ";", (CharSequence) null, (String) null, 0, (Function1) null, 62));
        nv6VarB.w();
        dteVarG0.g(ij0VarA, l0cVar);
        dteVarG0.b.b().g(l0cVar);
        cqp.r0(ua7Var, new tse(ij0Var, l0cVar));
        g0();
    }

    public final void I0(ate ateVar, ArrayList arrayList) {
        ua7 ua7Var = this.x;
        int iA = ((t73) ua7Var.p()).a();
        String string = ateVar.f.toString();
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ate) obj).f.toString());
        }
        ua7Var.E(new qse(iA, string, arrayList2), new iwa(new mwc(this, (byte) 2), (byte) 12));
    }

    public final void J0(boolean z) {
        if (!z) {
            y83 y83Var = this.t;
            if (y83Var == null) {
                y83Var = null;
            }
            ((StatusBarDrawerAppBarLayout) y83Var.c).l(false, true);
        }
        y83 y83Var2 = this.t;
        ((AppBarLayout) ((StatusBarDrawerAppBarLayout) (y83Var2 != null ? y83Var2 : null).c)).l = !z;
        ((AppBarLayout) ((StatusBarDrawerAppBarLayout) (y83Var2 != null ? y83Var2 : null).c)).i = z;
        ((View) (y83Var2 != null ? y83Var2 : null).g).setVisibility(z ? 0 : 4);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem = this.u;
        if (menuItem == null) {
            menuItem = null;
        }
        if (!menuItem.isActionViewExpanded()) {
            super.l0(z);
        } else {
            MenuItem menuItem2 = this.u;
            (menuItem2 != null ? menuItem2 : null).collapseActionView();
        }
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G0().i.e();
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        wse wseVar = this.y;
        if (wseVar == null) {
            wseVar = null;
        }
        wseVar.onDestroy();
        dte dteVarG0 = G0();
        ij0 ij0VarA = ij0.a(((t73) this.x.p()).a());
        dteVarG0.i.a = true;
        dteVarG0.g(ij0VarA, null);
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        final wse wseVar = new wse(G0().e, this, this.v, G0().f);
        this.y = wseVar;
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        bte bteVar = wseVar.o;
        bteVar.getClass();
        kze kzeVar = bteVar.a;
        wseVar.m = new lwc(kzeVar, wseVar.k, wseVar);
        avc avcVar = new avc(wseVar);
        wseVar.q = avcVar;
        wseVar.G(avcVar);
        wseVar.G(new rwc(pwc.class));
        final byte b = 0;
        ug ugVar = new ug(new Function1() { // from class: dwc
            public final Object invoke(Object obj) {
                byte b2 = b;
                wse wseVar2 = wseVar;
                switch (b2) {
                    case 0:
                        wseVar2.Z();
                        break;
                    case 1:
                        wseVar2.Z();
                        break;
                    default:
                        wseVar2.Z();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 28);
        h42 h42Var = wseVar.l;
        h42Var.s(kzeVar, ugVar);
        final byte b2 = 1;
        h42Var.s(bteVar.b, new ug(new Function1() { // from class: dwc
            public final Object invoke(Object obj) {
                byte b22 = b2;
                wse wseVar2 = wseVar;
                switch (b22) {
                    case 0:
                        wseVar2.Z();
                        break;
                    case 1:
                        wseVar2.Z();
                        break;
                    default:
                        wseVar2.Z();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 28));
        final byte b3 = 2;
        h42Var.s(bteVar.c, new ug(new Function1() { // from class: dwc
            public final Object invoke(Object obj) {
                byte b22 = b3;
                wse wseVar2 = wseVar;
                switch (b22) {
                    case 0:
                        wseVar2.Z();
                        break;
                    case 1:
                        wseVar2.Z();
                        break;
                    default:
                        wseVar2.Z();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 28));
        h42Var.j(viewLifecycleOwner, new ug(new ci7(1, wseVar, wse.class, "updateItems", "updateItems(Ljava/util/List;)V", 0, (byte) 24), (byte) 28));
        super.onViewCreated(view, bundle);
        y83 y83Var = this.t;
        if (y83Var == null) {
            y83Var = null;
        }
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) y83Var.f;
        wse wseVar2 = this.y;
        if (wseVar2 == null) {
            wseVar2 = null;
        }
        fadingRecyclerView.y0(wseVar2);
        y83 y83Var2 = this.t;
        if (y83Var2 == null) {
            y83Var2 = null;
        }
        FadingRecyclerView fadingRecyclerView2 = (FadingRecyclerView) y83Var2.f;
        getContext();
        fadingRecyclerView2.C0(new LinearLayoutManager(1, false));
        y83 y83Var3 = this.t;
        if (y83Var3 == null) {
            y83Var3 = null;
        }
        ((AnimationEmptyListView) y83Var3.d).c(this.s);
        y83 y83Var4 = this.t;
        if (y83Var4 == null) {
            y83Var4 = null;
        }
        ((RecyclerViewEmptyViewSwitcher) y83Var4.e).a(new yzb((Object) this, (byte) 11));
        wse wseVar3 = this.y;
        if (wseVar3 == null) {
            wseVar3 = null;
        }
        wseVar3.registerAdapterDataObserver(new a83((Object) this, (byte) 9));
        bte bteVar2 = G0().e;
        bteVar2.getClass();
        bteVar2.a.j(getViewLifecycleOwner(), new ug(new mwc(this, b), (byte) 29));
        bte bteVar3 = G0().e;
        bteVar3.getClass();
        bteVar3.b.j(getViewLifecycleOwner(), new ug(new mwc(this, b2), (byte) 29));
        MenuItem menuItemFindItem = this.l.o().findItem(2131364146);
        this.u = menuItemFindItem;
        if (menuItemFindItem == null) {
            menuItemFindItem = null;
        }
        menuItemFindItem.setOnActionExpandListener(new z73(this, b3));
        J0(false);
        MenuItem menuItem = this.u;
        if (menuItem == null) {
            menuItem = null;
        }
        SearchView actionView = menuItem.getActionView();
        actionView.setQueryHint(view.getContext().getString(this.r));
        actionView.setOnQueryTextListener(new qe6(this, (byte) 26));
        y83 y83Var5 = this.t;
        ((FadingRecyclerView) (y83Var5 != null ? y83Var5 : null).f).n(new nwc(actionView));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        this.t = y83.a((View) m5n.f(statusBarDrawingFrameLayout, 2131362473));
    }

    @Override // defpackage.ltl
    public final void z0() {
        y83 y83Var = this.t;
        if (y83Var == null) {
            y83Var = null;
        }
        z4o.q0((FadingRecyclerView) y83Var.f);
        z4o.r0(this.k, (dxh) null);
    }
}
