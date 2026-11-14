package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import com.google.android.material.button.MaterialButton;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class cu5 extends ab2 implements y9n, ya2, ev8 {
    public final q5g d;
    public final tsd e;
    public final tsd f;
    public final int g;
    public final /* synthetic */ byte h;
    public final Object i;

    /* JADX WARN: Illegal instructions before constructor call */
    public cu5(RecyclerView recyclerView, tsd tsdVar, kze kzeVar, tsd tsdVar2, qkc qkcVar, noc nocVar, q4b q4bVar, qe6 qe6Var) {
        this.h = (byte) 1;
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(2131558962, (ViewGroup) recyclerView, false);
        if (viewInflate == null) {
            t3p.q("rootView");
            throw null;
        }
        this(q5g.b((LinearLayout) viewInflate), tsdVar, tsdVar2, qkcVar, new q4b(qkcVar, (byte) 17));
        this.i = qe6Var;
        q5g q5gVar = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((FrameLayout) q5gVar.c).getContext());
        FrameLayout frameLayout = (FrameLayout) q5gVar.c;
        ConstraintLayout constraintLayoutInflate = layoutInflaterFrom.inflate(2131558973, (ViewGroup) frameLayout, false);
        frameLayout.addView(constraintLayoutInflate);
        int i = 2131363408;
        MaterialButton materialButtonJ = w1h.j(2131363408, constraintLayoutInflate);
        if (materialButtonJ != null) {
            i = 2131363525;
            TextView textView = (TextView) w1h.j(2131363525, constraintLayoutInflate);
            if (textView != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                ov0 ov0Var = new ov0((View) constraintLayout, (Object) materialButtonJ, (Object) textView, (byte) 22);
                materialButtonJ.setOnClickListener(new sma(q4bVar, (byte) 18));
                xf8.j0(kzeVar, constraintLayout, new ks6(ov0Var, (byte) 28));
                ((SpotlightCarouselRecyclerView) this.d.d).setOnScrollChangeListener(new za3(nocVar, (byte) 2));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cu5(RecyclerView recyclerView, tsd tsdVar, kze kzeVar, tsd tsdVar2, qt5 qt5Var, q2 q2Var) {
        this.h = (byte) 0;
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(2131558618, (ViewGroup) recyclerView, false);
        if (viewInflate == null) {
            t3p.q("rootView");
            throw null;
        }
        this(q5g.b((LinearLayout) viewInflate), tsdVar, tsdVar2, qt5Var, new unj((byte) 8));
        this.i = q2Var;
        q5g q5gVar = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((FrameLayout) q5gVar.c).getContext());
        FrameLayout frameLayout = (FrameLayout) q5gVar.c;
        ConstraintLayout constraintLayoutInflate = layoutInflaterFrom.inflate(2131558620, (ViewGroup) frameLayout, false);
        frameLayout.addView(constraintLayoutInflate);
        TextView textView = (TextView) w1h.j(2131363525, constraintLayoutInflate);
        if (textView == null) {
            t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(2131363525)));
            throw null;
        }
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        zt5 zt5Var = new zt5(constraintLayout, textView, (byte) 0);
        xf8.j0((pde) qt5Var.h, constraintLayout, new bu5(zt5Var, this));
        xf8.j0(kzeVar, constraintLayout, new bu5(zt5Var));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, com.opera.android.widget.spotlightcarousel.SpotlightCarouselRecyclerView] */
    public cu5(q5g q5gVar, tsd tsdVar, tsd tsdVar2, d dVar, Function0 function0) throws Resources.NotFoundException {
        LinearLayout linearLayout = (LinearLayout) q5gVar.b;
        super(linearLayout);
        this.d = q5gVar;
        this.e = tsdVar;
        this.f = tsdVar2;
        this.g = linearLayout.getResources().getDimensionPixelSize(2131167594);
        ?? r3 = (SpotlightCarouselRecyclerView) q5gVar.d;
        r3.y0(dVar);
        int dimensionPixelSize = r3.getResources().getDimensionPixelSize(2131167593);
        u1k u1kVar = u1k.a;
        r3.C0(new SpotlightCarouselLayoutManager(dimensionPixelSize, function0));
        r3.B0((e) null);
        r3.setClipChildren(false);
        r3.setClipToPadding(false);
        xf8.j0(tsdVar, linearLayout, new qzg(this, (byte) 14));
    }

    @Override // defpackage.ya2
    public final void R() {
        byte b = this.h;
        q5g q5gVar = this.d;
        switch (b) {
            case 1:
                ja2 ja2VarA0 = a0();
                if (ja2VarA0.d()) {
                    RecyclerView recyclerView = (SpotlightCarouselRecyclerView) q5gVar.d;
                    SparseArray<Parcelable> sparseArray = ja2VarA0.a;
                    ja2VarA0.a = null;
                    recyclerView.restoreHierarchyState(sparseArray);
                    break;
                }
                break;
            default:
                ja2 ja2VarA02 = a0();
                if (!ja2VarA02.d()) {
                    ((SpotlightCarouselRecyclerView) q5gVar.d).x0(0);
                    break;
                } else {
                    RecyclerView recyclerView2 = (SpotlightCarouselRecyclerView) q5gVar.d;
                    SparseArray<Parcelable> sparseArray2 = ja2VarA02.a;
                    ja2VarA02.a = null;
                    recyclerView2.restoreHierarchyState(sparseArray2);
                    break;
                }
        }
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        byte b = this.h;
        Object obj = this.i;
        switch (b) {
            case 0:
                if (r9i.K(i, i2)) {
                    ((q2) obj).invoke();
                    break;
                }
                break;
            default:
                qe6 qe6Var = (qe6) obj;
                if (i == 100 && i2 != 100) {
                    dqc dqcVar = ((tkc) qe6Var.b).i;
                    b59 b59Var = ((vs6) dqcVar.c.get()).d.a;
                    if (!((SharedPreferences) b59Var.get()).getBoolean("bubble_shown", false)) {
                        ((SharedPreferences) b59Var.get()).edit().putInt("widget_visibility_count", ((SharedPreferences) b59Var.get()).getInt("widget_visibility_count", 0) + 1).apply();
                    }
                    dqcVar.d.c(0);
                    dqcVar.i = true;
                    break;
                } else if (i == 0 && i2 != 0) {
                    dqc dqcVar2 = ((tkc) qe6Var.b).i;
                    dqcVar2.d.c(1);
                    dqcVar2.i = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ab2
    public final void X(boolean z) {
        if (z) {
            return;
        }
        R();
    }

    @Override // defpackage.ab2
    public final void Y() {
        t();
    }

    public final View b0(int i) {
        q5g q5gVar = this.d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((SpotlightCarouselRecyclerView) q5gVar.d).getContext());
        View viewInflate = layoutInflaterFrom.inflate(2131559356, (ViewGroup) q5gVar.d, false);
        if (viewInflate == null) {
            t3p.q("rootView");
            return null;
        }
        ViewGroup viewGroup = (MaxWidthLinearLayout) viewInflate;
        kkf kkfVar = new kkf(this, (byte) 20);
        dll dllVarS = q9n.s(viewGroup);
        if (dllVarS != null) {
            u8n.b(dllVarS, viewGroup, kkfVar);
        }
        kze kzeVar = (kze) new z61(viewGroup).b;
        int i2 = d03.e;
        ydp.q(viewGroup, j14.i0(2131233190, viewGroup.getContext()));
        a26.T(this.f, kzeVar, new wj(this, viewGroup, (byte) 5));
        a26.T(this.e, kzeVar, new qzg(viewGroup, (byte) 15));
        return layoutInflaterFrom.inflate(i, viewGroup, true);
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        ((SpotlightCarouselRecyclerView) this.d.d).y0((d) null);
    }

    @Override // defpackage.ya2
    public final void t() {
        SparseArray<Parcelable> u0gVar = new u0g<>();
        ((SpotlightCarouselRecyclerView) this.d.d).saveHierarchyState(u0gVar);
        a0().a = u0gVar;
    }
}
