package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.bookmarks.h;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fl3 extends lj {
    public ArrayList A;
    public boolean B;
    public final i53 C;
    public final dl3 D;
    public final wx r;
    public jl3 s;
    public kl3 t;
    public el3 u;
    public Context v;
    public FadingRecyclerView w;
    public pq3 x;
    public MenuItem y;
    public os1 z;

    public fl3(i53 i53Var, Callback callback) {
        wx wxVar = new wx((Object) i53Var, (Object) callback, (byte) 17);
        itl itlVar = (itl) u7k.e().a;
        itlVar.b = 2131755041;
        itlVar.k = 1;
        super(itlVar);
        this.r = wxVar;
        this.D = new dl3(this, (byte) 0);
        this.C = i53Var;
    }

    public static Bundle G0(List list, ml3 ml3Var, int i) {
        String strValueOf = ml3Var != null ? String.valueOf(ml3Var.getId()) : "";
        int i2 = list.size() > 1 ? 2132018065 : 2132019124;
        Bundle bundle = new Bundle();
        bundle.putString("initial_folder_id", strValueOf);
        bundle.putInt("select_button_text", i2);
        bundle.putBoolean("folders_only", (i & 1) == 1);
        long[] jArr = new long[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            jArr[i3] = ((al3) list.get(i3)).getId();
        }
        bundle.putLongArray("folder_exclude_list", jArr);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        this.v = fadingRecyclerView.getContext();
        this.w = fadingRecyclerView;
        fadingRecyclerView.C0(new LinearLayoutManager(1, false));
    }

    public final boolean H0() {
        if (((ml3) this.s.a).h()) {
            return false;
        }
        this.s = this.s.f();
        J0();
        return true;
    }

    public final boolean I0(ll3 ll3Var) {
        if (!ll3Var.equals(this.t)) {
            if (ll3Var.d() == 2) {
                return true;
            }
            if (ll3Var.d() == 1) {
                return false;
            }
        }
        return true;
    }

    public final void J0() {
        Drawable drawableF;
        String strC;
        if (((ml3) this.s.a).h()) {
            drawableF = sgb.F(2131232034, this.v);
            strC = getString(2132018055);
        } else {
            TypedValue typedValue = new TypedValue();
            this.v.getTheme().resolveAttribute(2130968579, typedValue, true);
            drawableF = sgb.F(typedValue.resourceId, this.v);
            strC = this.s.c(getResources());
        }
        Toolbar toolbar = this.l;
        j14.o0(drawableF, f03.v(this.v));
        toolbar.A(drawableF);
        this.l.D(strC);
        this.u.H(this.s);
        this.s.getClass();
        this.y.setEnabled(true);
        this.x.d.setEnabled(true);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (H0()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        os1 os1Var = this.z;
        if (os1Var != null) {
            os1Var.finish(hjm.b);
        }
        super.onDestroyView();
        this.C.f(this.D);
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363669 || this.z != null) {
            return false;
        }
        z77 z77VarU = sfe.U(this.v);
        os1 os1Var = new os1(this);
        z77VarU.getClass();
        z77VarU.b(os1Var, ijm.b);
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("initial_folder_id", String.valueOf(this.s.a.getId()));
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws NumberFormatException {
        super.onViewCreated(view, bundle);
        Long lValueOf = Long.valueOf(bundle == null ? requireArguments().getString("initial_folder_id") : bundle.getString("initial_folder_id"));
        long jLongValue = lValueOf.longValue();
        i53 i53Var = this.C;
        h hVar = (h) i53Var;
        ml3 ml3Var = (ml3) hVar.m(jLongValue, true);
        int i = 0;
        jl3 jl3Var = ml3Var != null ? new jl3(ml3Var, i53Var, true) : new jl3(new kkj(lValueOf.longValue(), "", null, false), i53Var, false);
        this.s = jl3Var;
        if (!jl3Var.c) {
            jl3 jl3Var2 = new jl3(hVar.o(), i53Var, true);
            this.s = jl3Var2;
            jl3Var = jl3Var2;
        }
        el3 el3Var = new el3(this, jl3Var, this.B);
        this.u = el3Var;
        this.w.y0(el3Var);
        J0();
        long[] longArray = requireArguments().getLongArray("folder_exclude_list");
        this.B = requireArguments().getBoolean("folders_only", false);
        this.A = new ArrayList(longArray.length);
        while (true) {
            int length = longArray.length;
            i53 i53Var2 = this.C;
            if (i >= length) {
                i53Var2.a(this.D);
                return;
            }
            al3 al3VarM = ((h) i53Var2).m(longArray[i], true);
            if (al3VarM != null && (al3VarM instanceof ml3)) {
                this.A.add((ml3) al3VarM);
            }
            i++;
        }
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pq3 pq3VarB = pq3.b(layoutInflater, viewGroup);
        this.x = pq3VarB;
        pq3VarB.d.setText(requireArguments().getInt("select_button_text", 2132019124));
        final byte b = 0;
        this.x.d.setOnClickListener(new View.OnClickListener(this) { // from class: x5m
            public final /* synthetic */ fl3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                fl3 fl3Var = this.b;
                switch (b2) {
                    case 0:
                        fl3Var.r.run(fl3Var.s);
                        fl3Var.g0();
                        break;
                    default:
                        fl3Var.g0();
                        break;
                }
            }
        });
        this.x.c.setText(2132018111);
        final byte b2 = 1;
        this.x.c.setOnClickListener(new View.OnClickListener(this) { // from class: x5m
            public final /* synthetic */ fl3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                fl3 fl3Var = this.b;
                switch (b22) {
                    case 0:
                        fl3Var.r.run(fl3Var.s);
                        fl3Var.g0();
                        break;
                    default:
                        fl3Var.g0();
                        break;
                }
            }
        });
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        this.y = itdVar.findItem(2131363669);
    }
}
