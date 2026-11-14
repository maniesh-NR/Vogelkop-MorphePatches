package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class t5g extends h53 {
    public final ulp t;
    public n5g u;
    public rf2 v;
    public final ua7 w;
    public final zyk x;

    /* JADX WARN: Illegal instructions before constructor call */
    public t5g(gjm gjmVar, yu2 yu2Var) {
        u7k u7kVarJ = u7k.j(2131558888);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(2132020339);
        itlVar.b = 2131755046;
        yu2Var.getClass();
        itlVar.c = Build.VERSION.SDK_INT >= 30;
        super(itlVar, true);
        this.t = ulp.b;
        this.w = new ua7((Fragment) this, gjmVar);
        this.x = z4c.b(new yse(this, (byte) 3));
    }

    @Override // defpackage.ltl
    public final void A0(FloatingActionButton floatingActionButton) {
        super.A0(floatingActionButton);
        floatingActionButton.setOnClickListener(new zvd(this, (byte) 13));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.t;
    }

    public final n5g H0() {
        n5g n5gVar = this.u;
        if (n5gVar != null) {
            return n5gVar;
        }
        n5g n5gVar2 = new n5g(requireContext(), new qfb(this, (byte) 20), I0().d.d);
        this.u = n5gVar2;
        return n5gVar2;
    }

    public final t6g I0() {
        return (t6g) this.x.getValue();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (I0().e.c()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        I0().e.i(null);
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (super.onMenuItemClick(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() == 2131363865) {
            I0().b.e(new int[0]);
            return true;
        }
        if (menuItem.getItemId() != 2131361942) {
            return false;
        }
        this.w.E(new ku(), new t7d(new s5g(this, (byte) 0), (byte) 3));
        return true;
    }

    @Override // defpackage.ltl
    public final void onResume() {
        q6g q6gVar;
        super.onResume();
        t6g t6gVarI0 = I0();
        t6gVarI0.getClass();
        t6gVarI0.m = new sl6(t8.a);
        tsd tsdVar = t6gVarI0.s;
        q6g q6gVar2 = (q6g) tsdVar.g();
        if (q6gVar2 == null || q6gVar2.a != t6gVarI0.g() || (q6gVar = (q6g) tsdVar.g()) == null || q6gVar.f != t6gVarI0.f()) {
            t6gVarI0.h();
        }
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        t6g t6gVarI0 = I0();
        MenuItem menuItemR0 = r0(2131364146);
        rf2 rf2Var = this.v;
        t6gVarI0.e.j(menuItemR0, (FadingRecyclerView) rf2Var.h, 2132017282, 1);
        t6gVarI0.e.i(new j1c(rf2Var.j, (StatusBarDrawerAppBarLayout) rf2Var.c, null, (View) rf2Var.i, (FadingRecyclerView) rf2Var.h, null, null, new odf((byte) 14), 100));
        xf8.i0(I0().s, getViewLifecycleOwner(), (CoordinatorLayout) this.v.b, (List) null, new iwa(this, (byte) 14));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        rf2 rf2VarA = rf2.a(statusBarDrawingFrameLayout.findViewById(2131362473));
        this.v = rf2VarA;
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) rf2VarA.h;
        getContext();
        fadingRecyclerView.C0(new LinearLayoutManager());
        ((FadingRecyclerView) this.v.h).y0(H0());
        p0(statusBarDrawingFrameLayout, (FadingRecyclerView) this.v.h);
    }
}
