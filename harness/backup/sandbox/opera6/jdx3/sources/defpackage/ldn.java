package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.Lazy;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ldn extends lj {
    public final ua7 r;
    public final ydn s;
    public final tni t;
    public final Lazy u;
    public final yug v;
    public final gmk w;
    public ndn x;
    public vs y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ldn(gjm gjmVar, ydn ydnVar, tni tniVar, Lazy lazy, yug yugVar, gmk gmkVar) {
        u7k u7kVarJ = u7k.j(2131559514);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(2132022171);
        itlVar.b = 2131755067;
        super(itlVar);
        this.r = new ua7((Fragment) this, gjmVar);
        this.s = ydnVar;
        this.t = tniVar;
        this.u = lazy;
        this.v = yugVar;
        this.w = gmkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0() throws InterruptedException {
        List list;
        ArrayList arrayList;
        if (this.y == null || this.x != null) {
            return;
        }
        ydn ydnVar = this.s;
        ydnVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (String str : (String[]) N.MNYP_$wg()) {
            fdn fdnVarH = ydnVar.h(str);
            if (fdnVarH != null) {
                arrayList2.add(fdnVarH);
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        if (!ydnVar.c.isEnabled() && listUnmodifiableList.isEmpty()) {
            N.M0gL$01e(new y1n(this, (byte) 10));
            return;
        }
        Context context = this.y.b.getContext();
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        vs vsVar = this.y;
        gfn gfnVar = ydnVar.c;
        wdn wdnVarP = ydnVar.p();
        if (wdnVarP.a && wdnVarP.b) {
            if (gfnVar.isEnabled() || ydnVar.q.a()) {
                List listA = ydnVar.s.a(gfnVar.isEnabled() ? gfnVar.k() : null);
                arrayList = new ArrayList();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    fdn fdnVarA = ((bnk) it.next()).a();
                    arrayList.add(fdnVarA);
                    arrayList.addAll(Collections.unmodifiableList(fdnVarA.g));
                }
                this.x = new ndn(context, viewLifecycleOwner, vsVar, ydnVar, listUnmodifiableList, arrayList, this.t, this.u, this.l.o(), new r2n(this, (byte) 2), this.v, this.w);
                ((CircularProgressIndicator) this.y.e).setVisibility(8);
            }
            list = Collections.EMPTY_LIST;
        } else {
            list = Collections.EMPTY_LIST;
        }
        arrayList = list;
        this.x = new ndn(context, viewLifecycleOwner, vsVar, ydnVar, listUnmodifiableList, arrayList, this.t, this.u, this.l.o(), new r2n(this, (byte) 2), this.v, this.w);
        ((CircularProgressIndicator) this.y.e).setVisibility(8);
    }

    @Override // defpackage.k24, defpackage.ryl
    public final void h0(w wVar) {
        this.r.D();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        MenuItem menuItem;
        ndn ndnVar = this.x;
        if (ndnVar == null || (menuItem = ndnVar.s) == null || !menuItem.isActionViewExpanded()) {
            super.l0(z);
        } else {
            ndnVar.s.collapseActionView();
        }
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        ndn ndnVar = this.x;
        if (ndnVar != null) {
            ndnVar.c.H(ndnVar.i);
            ndnVar.g.onDestroy();
        }
        this.x = null;
        this.y = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws InterruptedException {
        super.onViewCreated(view, bundle);
        G0();
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        CoordinatorLayout coordinatorLayout = (View) m5n.f(statusBarDrawingFrameLayout, 2131362473);
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        int i = 2131362683;
        if (((AnimationEmptyListView) w1h.j(2131362683, coordinatorLayout)) != null) {
            i = 2131362692;
            RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher = (RecyclerViewEmptyViewSwitcher) w1h.j(2131362692, coordinatorLayout);
            if (recyclerViewEmptyViewSwitcher != null) {
                i = 2131364014;
                RecyclerView recyclerView = (FadingRecyclerView) w1h.j(2131364014, coordinatorLayout);
                if (recyclerView != null) {
                    i = 2131364525;
                    CircularProgressIndicator circularProgressIndicatorJ = w1h.j(2131364525, coordinatorLayout);
                    if (circularProgressIndicatorJ != null) {
                        this.y = new vs((ViewGroup) coordinatorLayout2, (View) recyclerViewEmptyViewSwitcher, (Object) recyclerView, (Object) circularProgressIndicatorJ, (byte) 25);
                        p0(statusBarDrawingFrameLayout, recyclerView);
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(coordinatorLayout.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void z0() {
        z4o.q0((FadingRecyclerView) this.y.d);
        z4o.r0(this.k, (dxh) null);
    }
}
