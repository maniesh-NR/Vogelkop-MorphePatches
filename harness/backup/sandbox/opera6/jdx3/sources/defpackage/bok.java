package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.favorites.NonCollapsingCardView;
import com.opera.android.feed.FeedScrollView;
import com.opera.android.settings.SettingsManager;
import java.util.Collections;

/* loaded from: classes.dex */
public final class bok extends wu8 {
    public final kze g;
    public final kf h;
    public final kok i;
    public final qzg j;

    public bok(View view, FeedScrollView feedScrollView, SettingsManager settingsManager, nr8 nr8Var, ipk ipkVar, x5f x5fVar, x5f x5fVar2, osf osfVar, kze kzeVar, View.OnLongClickListener onLongClickListener, qr8 qr8Var, nv2 nv2Var, bvl bvlVar, pde pdeVar, p6l p6lVar) {
        super(view);
        this.g = kzeVar;
        View view2 = ((i) this).itemView;
        int i = 2131364600;
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131364600, view2);
        if (fadingRecyclerView != null) {
            i = 2131364601;
            TextView textView = (TextView) w1h.j(2131364601, view2);
            if (textView != null) {
                kf kfVar = new kf((NonCollapsingCardView) view2, fadingRecyclerView, textView);
                new eqh(fadingRecyclerView, onLongClickListener);
                this.h = kfVar;
                View view3 = ((i) this).itemView;
                l5b l5bVar = q9n.c;
                this.i = new kok(settingsManager, nr8Var, ipkVar, (BrowserActivity) (view3 != null ? q9n.p(view3.getContext()) : null), fadingRecyclerView, feedScrollView, textView, new vk2((byte) 19), x5fVar, x5fVar2, osfVar, kzeVar, qr8Var, nv2Var, bvlVar, pdeVar, p6lVar);
                this.j = new qzg(this, (byte) 24);
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        if (z) {
            return;
        }
        this.g.k(this.j);
        zzh zzhVar = new zzh(this, (byte) 13);
        kok kokVar = this.i;
        kokVar.p = zzhVar;
        zzhVar.run(Integer.valueOf(((CustomGridLayoutManager) kokVar.d).b));
        ode odeVar = ((aok) a0()).c.b;
        iok iokVar = kokVar.g;
        ode odeVar2 = iokVar.c;
        if (odeVar2 != null) {
            odeVar2.p(iokVar);
        }
        iokVar.c = odeVar;
        if (odeVar != null) {
            odeVar.k(iokVar);
        }
    }

    @Override // defpackage.wu8, defpackage.ab2
    public final void Y() {
        this.g.p(this.j);
        kok kokVar = this.i;
        kokVar.p = null;
        iok iokVar = kokVar.g;
        ode odeVar = iokVar.c;
        if (odeVar != null) {
            odeVar.p(iokVar);
        }
        iokVar.c = null;
        super.Y();
    }

    @Override // defpackage.wu8
    public final void c0() {
        kok kokVar = this.i;
        if (kokVar.q) {
            kokVar.q = false;
            gd6 gd6Var = kokVar.n;
            gd6Var.b = false;
            gd6Var.c = 0;
            kokVar.g.d = false;
            kokVar.i.o(-1, hr0.b);
            kokVar.a.B0(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.wu8
    public final void e0() {
        kok kokVar = this.i;
        ?? r0 = kokVar.a;
        if (kokVar.q) {
            return;
        }
        kokVar.q = true;
        iok iokVar = kokVar.g;
        iokVar.d = true;
        if (iokVar.e) {
            iokVar.e = false;
            ode odeVar = iokVar.c;
            iokVar.a.D(odeVar != null ? ((upk) odeVar.g()).a : Collections.EMPTY_LIST);
        }
        kokVar.i.p();
        kokVar.j.j();
        r0.requestLayout();
        r0.addOnLayoutChangeListener(new ho3(kokVar, (byte) 7));
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        kok kokVar = this.i;
        FadingRecyclerView fadingRecyclerView = kokVar.a;
        fadingRecyclerView.y0((d) null);
        kokVar.k = null;
        fadingRecyclerView.C0((f) null);
        kokVar.e.a.remove(kokVar);
        iok iokVar = kokVar.g;
        ode odeVar = iokVar.c;
        if (odeVar != null) {
            odeVar.p(iokVar);
        }
        iokVar.c = null;
        kokVar.t.p(kokVar.u);
    }
}
