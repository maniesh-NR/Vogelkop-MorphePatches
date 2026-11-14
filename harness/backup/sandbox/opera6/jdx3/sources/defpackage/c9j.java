package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lc9j;", "Llj;", "<init>", "()V", "b9j", "y8j", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c9j extends lj {
    public static final /* synthetic */ xtb[] w = {new d6h(c9j.class, "emptyAdapterHelper", "getEmptyAdapterHelper()Lcom/opera/android/view/EmptyAdapterHelper;", 0)};
    public static final cs x = new cs((byte) 6);
    public final zyk r;
    public final zyk s;
    public ov0 t;
    public final jp3 u;
    public h63 v;

    public c9j() {
        super((itl) u7k.j(2131558902).a);
        this.r = z4c.b(new yse(this, (byte) 14));
        this.s = z4c.b(new u8j(this, (byte) 0));
        this.u = new jp3(new u8j(this, (byte) 1));
    }

    public final void G0() {
        q9n.u((OperaTextInputEditText) this.t.d);
        ((OperaTextInputEditText) this.t.d).clearFocus();
    }

    public final yz7 H0() {
        return (yz7) this.u.a(this, w[0]);
    }

    public final void I0(boolean z) {
        o9j o9jVar = (o9j) this.r.getValue();
        Editable text = ((OperaTextInputEditText) this.t.d).getText();
        String string = text != null ? text.toString() : null;
        byte b = 1;
        if (!o9jVar.h) {
            o9jVar.h = true;
            ((x5f) o9jVar.e).S(1);
        }
        if (!z || string == null || string.length() == 0) {
            o9jVar.f(new l9j(o9jVar, string, (byte) 0));
        } else {
            o9jVar.f(new l9j(o9jVar, string, b));
        }
        if (z) {
            return;
        }
        G0();
    }

    public final void J0(boolean z) {
        f fVar;
        if (z) {
            if (H0().d) {
                return;
            }
            H0().c();
        } else if (H0().d) {
            yz7 yz7VarH0 = H0();
            yz7VarH0.d = false;
            wz7 wz7Var = yz7VarH0.b;
            if (wz7Var.e) {
                wz7Var.e = false;
                RecyclerView recyclerView = wz7Var.f;
                if (recyclerView != null && (fVar = recyclerView.n) != null) {
                    fVar.setMeasurementCacheEnabled(true);
                }
                wz7Var.notifyItemRemoved(0);
            }
        }
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (!z) {
            G0();
        }
        super.l0(z);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.t = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((FadingRecyclerView) this.t.c).y0(H0().c);
        ((FadingRecyclerView) this.t.c).B0(null);
        ((FadingRecyclerView) this.t.c).n(new em3(this, (byte) 4));
        TextInputEditText textInputEditText = (OperaTextInputEditText) this.t.d;
        textInputEditText.setOnEditorActionListener(new ys7(this, (byte) 3));
        h63 h63Var = new h63((Object) this, (byte) 5);
        textInputEditText.addTextChangedListener(h63Var);
        this.v = h63Var;
        textInputEditText.post(new mni(textInputEditText, (byte) 9));
        ((o9j) this.r.getValue()).f.j(getViewLifecycleOwner(), new q59((Object) new w4i(this, (byte) 7), (Object) Collections.singletonList(new el7(this, (byte) 1)), (byte) 0));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        View childAt = statusBarDrawingFrameLayout.getChildAt(0);
        int i = 2131362684;
        if (((AnimationEmptyListView) w1h.j(2131362684, childAt)) != null) {
            i = 2131362692;
            if (((RecyclerViewEmptyViewSwitcher) w1h.j(2131362692, childAt)) != null) {
                i = 2131363328;
                FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131363328, childAt);
                if (fadingRecyclerView != null) {
                    i = 2131364157;
                    OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131364157, childAt);
                    if (operaTextInputEditText != null) {
                        i = 2131364794;
                        if (w1h.j(2131364794, childAt) != null) {
                            this.t = new ov0((LinearLayout) childAt, fadingRecyclerView, operaTextInputEditText, (byte) 16);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(childAt.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void z0() {
        z4o.q0((FadingRecyclerView) this.t.c);
        z4o.r0(this.k, (dxh) null);
    }
}
