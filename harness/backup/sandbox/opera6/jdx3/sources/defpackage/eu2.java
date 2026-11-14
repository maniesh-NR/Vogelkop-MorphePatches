package defpackage;

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
public final class eu2 extends h53 {
    public final ulp t;
    public final zyk u;
    public rf2 v;
    public final ua7 w;
    public final zyk x;

    /* JADX WARN: Illegal instructions before constructor call */
    public eu2(gjm gjmVar) {
        u7k u7kVarJ = u7k.j(2131558888);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.e = true;
        u7kVarJ.s(2132020339);
        itlVar.b = 2131755019;
        itlVar.c = true;
        super(itlVar, true);
        this.t = ulp.b;
        this.u = z4c.b(new q2(0, this, eu2.class, "createAdapter", "createAdapter()Lcom/opera/android/autofill/passwords/picker/AutofillPasswordPickerAdapter;", 0, (byte) 10));
        this.w = new ua7((Fragment) this, gjmVar);
        this.x = z4c.b(new t2(this, (byte) 13));
    }

    @Override // defpackage.ltl
    public final void A0(FloatingActionButton floatingActionButton) {
        super.A0(floatingActionButton);
        floatingActionButton.setOnClickListener(new gf((Object) this, (byte) 18));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.t;
    }

    public final hu2 H0() {
        return (hu2) this.x.getValue();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (H0().f.c()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        H0().f.i(null);
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        hu2 hu2VarH0 = H0();
        MenuItem menuItemR0 = r0(2131364146);
        rf2 rf2Var = this.v;
        if (rf2Var == null) {
            rf2Var = null;
        }
        hu2VarH0.f.j(menuItemR0, (FadingRecyclerView) rf2Var.h, 2132017282, 1);
        hu2VarH0.f.i(new j1c(rf2Var.j, (StatusBarDrawerAppBarLayout) rf2Var.c, null, (View) rf2Var.i, (FadingRecyclerView) rf2Var.h, null, null, new qp2((byte) 5), 100));
        h42 h42Var = H0().j;
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        rf2 rf2Var2 = this.v;
        if (rf2Var2 == null) {
            rf2Var2 = null;
        }
        xf8.i0(h42Var, viewLifecycleOwner, (CoordinatorLayout) rf2Var2.b, (List) null, new pb(this, (byte) 17));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        rf2 rf2VarA = rf2.a(statusBarDrawingFrameLayout.findViewById(2131362473));
        this.v = rf2VarA;
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) rf2VarA.h;
        getContext();
        fadingRecyclerView.C0(new LinearLayoutManager());
        rf2 rf2Var = this.v;
        if (rf2Var == null) {
            rf2Var = null;
        }
        ((FadingRecyclerView) rf2Var.h).y0((au2) this.u.getValue());
        rf2 rf2Var2 = this.v;
        p0(statusBarDrawingFrameLayout, (FadingRecyclerView) (rf2Var2 != null ? rf2Var2 : null).h);
    }
}
