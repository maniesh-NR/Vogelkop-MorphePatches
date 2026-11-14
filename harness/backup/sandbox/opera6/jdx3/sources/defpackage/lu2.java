package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lu2 extends h53 implements h4g {
    public static final /* synthetic */ xtb[] B = {new d6h(lu2.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentViewPasswordsBinding;", 0)};
    public Drawable A;
    public final ktl t;
    public pq3 u;
    public int v;
    public final zyk w;
    public final ua7 x;
    public final ulp y;
    public w3g z;

    /* JADX WARN: Illegal instructions before constructor call */
    public lu2(gjm gjmVar) {
        u7k u7kVarF = u7k.f(fki.a);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.e = true;
        itlVar.k = 1;
        u7kVarF.s(2132020987);
        itlVar.b = 2131755020;
        super(itlVar, true);
        this.t = F0(new qp2((byte) 6));
        this.w = z4c.b(new t2(this, (byte) 14));
        this.x = new ua7((Fragment) this, gjmVar);
        this.y = ulp.b;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.y;
    }

    public final tn9 H0() {
        xtb xtbVar = B[0];
        a5n a5nVar = this.t.b;
        Objects.requireNonNull(a5nVar);
        return (tn9) a5nVar;
    }

    public final mu2 I0() {
        return (mu2) this.w.getValue();
    }

    public final void J0() {
        H0().e.setImageResource(2131232293);
        c5g.a(H0().c, false);
        H0().c.setText("fakepass");
    }

    public final void K0() {
        this.x.E(new s4g(), new pb(new t02(this, (byte) 17), (byte) 19));
    }

    @Override // defpackage.h4g
    public final boolean P(int i, String str) {
        w3g w3gVar = this.z;
        if (w3gVar == null) {
            w3gVar = null;
        }
        return i == w3gVar.a && Intrinsics.a(str, w3gVar.b.a);
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 2131362505) {
            mu2 mu2VarI0 = I0();
            w3g w3gVar = this.z;
            w3g w3gVar2 = w3gVar != null ? w3gVar : null;
            mu2VarI0.b.c(new a27(w3gVar2.c), this, new pb(new q3(mu2VarI0, w3gVar2, (byte) 29), (byte) 20));
            return true;
        }
        if (itemId != 2131362654) {
            return false;
        }
        if (!sj2.g(requireContext())) {
            K0();
            return true;
        }
        mu2 mu2VarI02 = I0();
        w3g w3gVar3 = this.z;
        mu2VarI02.b.e(new zv7((w3gVar3 != null ? w3gVar3 : null).a), false);
        return true;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.v = getResources().getDimensionPixelSize(2131167472);
        ((StylingTextView) H0().f.f).setText(2132018745);
        ((StylingTextView) H0().h.f).setText(2132018747);
        xf8.i0(I0().e, getViewLifecycleOwner(), H0().a, (List) null, new pb(this, (byte) 18));
        if (sj2.g(requireContext())) {
            H0().e.setOnClickListener(new ku2(this, (byte) 2));
            H0().d.setOnClickListener(new ku2(this, (byte) 3));
        } else {
            H0().e.setOnClickListener(new ku2(this, (byte) 0));
            H0().d.setOnClickListener(new ku2(this, (byte) 1));
        }
        ((StylingImageButton) H0().h.d).setVisibility(0);
        ((StylingImageButton) H0().h.d).setOnClickListener(new ku2(this, (byte) 4));
    }

    @Override // defpackage.h4g
    public final void s() {
        w3g w3gVar = this.z;
        if (w3gVar == null) {
            w3gVar = null;
        }
        int i = vmj.g;
        Context contextRequireContext = requireContext();
        String str = w3gVar.c;
        int i2 = this.v;
        this.A = tmj.m(contextRequireContext, str, i2, i2, null, 48);
        H0().b.setImageDrawable(this.A);
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.u = pq3VarB;
        pq3VarB.d.setText(2132017840);
        pq3 pq3Var = this.u;
        if (pq3Var == null) {
            pq3Var = null;
        }
        pq3Var.d.setOnClickListener(new ku2(this, (byte) 5));
    }

    @Override // defpackage.h4g
    public final void w(Bitmap bitmap) {
        int i = this.v;
        Context contextRequireContext = requireContext();
        PathInterpolator pathInterpolator = s8i.d;
        p8i p8iVar = new p8i(i, i / 2, contextRequireContext, bitmap);
        p8iVar.a(f03.s(requireContext()));
        this.A = p8iVar;
        H0().b.setImageDrawable(this.A);
    }
}
