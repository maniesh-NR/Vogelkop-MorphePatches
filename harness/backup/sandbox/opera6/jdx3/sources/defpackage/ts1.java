package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.GridLayoutManager;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ts1 extends lj {
    public final zyk r;
    public FadingRecyclerView s;
    public i4a t;
    public final ss1 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public ts1(SettingsManager settingsManager, sl6 sl6Var) {
        u7k u7kVarE = u7k.e();
        u7kVarE.s(2132017582);
        super((itl) u7kVarE.a);
        this.r = z4c.b(new t2(this, (byte) 8));
        this.u = new ss1(l08.a, settingsManager.e().e, sl6Var.b(), new ole(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) throws Resources.NotFoundException {
        this.s = fadingRecyclerView;
        fadingRecyclerView.setClipChildren(false);
        FadingRecyclerView fadingRecyclerView2 = this.s;
        if (fadingRecyclerView2 == null) {
            fadingRecyclerView2 = null;
        }
        fadingRecyclerView2.y0(this.u);
        G0();
        xf8.i0(((at1) this.r.getValue()).o, getViewLifecycleOwner(), fadingRecyclerView, (List) null, new pb(this, (byte) 9));
    }

    public final void G0() throws Resources.NotFoundException {
        int integer = getResources().getInteger(2131492867);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(integer, 1);
        FadingRecyclerView fadingRecyclerView = this.s;
        if (fadingRecyclerView == null) {
            fadingRecyclerView = null;
        }
        fadingRecyclerView.C0(gridLayoutManager);
        i4a i4aVar = this.t;
        if (i4aVar != null) {
            FadingRecyclerView fadingRecyclerView2 = this.s;
            if (fadingRecyclerView2 == null) {
                fadingRecyclerView2 = null;
            }
            fadingRecyclerView2.q0(i4aVar);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165299);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165298);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(2131165300);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(2131165301);
        FadingRecyclerView fadingRecyclerView3 = this.s;
        i4a i4aVar2 = new i4a(new t79(fadingRecyclerView3 == null ? null : fadingRecyclerView3, gridLayoutManager, dimensionPixelSize, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize3, integer, (byte) 1));
        this.t = i4aVar2;
        FadingRecyclerView fadingRecyclerView4 = this.s;
        (fadingRecyclerView4 != null ? fadingRecyclerView4 : null).m(i4aVar2);
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        G0();
        FadingRecyclerView fadingRecyclerView = this.s;
        if (fadingRecyclerView == null) {
            fadingRecyclerView = null;
        }
        fadingRecyclerView.a0();
    }

    @Override // defpackage.ltl
    public final void onResume() {
        Object next;
        super.onResume();
        at1 at1Var = (at1) this.r.getValue();
        Context contextRequireContext = requireContext();
        boolean z = at1Var.q;
        boolean zB = at1Var.d.b.k().b();
        at1Var.q = zB;
        byte b = 2;
        byte b2 = 1;
        if (z == zB) {
            if (at1Var.r) {
                at1Var.r = false;
                z77 z77Var = at1Var.f;
                os1 os1Var = new os1(new x2((Object) at1Var, (Object) contextRequireContext, (byte) 17), new ys1(at1Var, b), new ys1(at1Var, (byte) 3), b2);
                z77Var.getClass();
                z77Var.b(os1Var, ijm.b);
                return;
            }
            return;
        }
        at1Var.k(at1Var.b.e(), true, at1Var.q);
        if (at1Var.r) {
            at1Var.r = false;
            if (z || !at1Var.q) {
                return;
            }
            at1Var.t = vb0.b;
            d7j d7jVar = at1Var.s;
            if (d7jVar != null) {
                byte b3 = d7jVar.e;
                at1Var.k(d7jVar, false, true);
                r2i r2iVar = at1Var.m;
                String strValueOf = String.valueOf((int) b3);
                ru9 ru9Var = r2iVar.c;
                HashSet hashSetM = w1h.m(ru9Var.a, "rewards.claimed_app_icons");
                hashSetM.add(strValueOf);
                nv6 nv6VarB = ru9Var.b();
                ((SharedPreferences.Editor) nv6VarB.a).putStringSet("rewards.claimed_app_icons", hashSetM);
                nv6VarB.w();
                Iterator it = ((us1) at1Var.o.g()).a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (b3 == ((qs1) next).a) {
                            break;
                        }
                    }
                }
                qs1 qs1Var = (qs1) next;
                if (qs1Var != null) {
                    at1Var.e.c(new jt1(qs1Var.b), this, new ug(new xs1(at1Var, contextRequireContext, this, qs1Var, (byte) 0), (byte) 2));
                }
            }
        }
    }
}
