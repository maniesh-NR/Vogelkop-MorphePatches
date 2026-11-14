package defpackage;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.settings.SettingsManager;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wo3 extends i93 {
    public final kze A;
    public final xj B;
    public final zyk C;
    public final zyk D;
    public final zyk E;
    public final wf F;
    public final wf G;
    public t79 H;
    public np1 I;
    public itd J;
    public final SettingsManager t;
    public final ru9 u;
    public final z77 v;
    public final orm w;
    public final fw3 x;
    public final ktl y;
    public final zyk z;
    public static final /* synthetic */ xtb[] L = {new d6h(wo3.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentBottomBarSettingsBinding;", 0)};
    public static final psp K = new psp();

    /* JADX WARN: Illegal instructions before constructor call */
    public wo3(SettingsManager settingsManager, ru9 ru9Var, z77 z77Var, orm ormVar, fw3 fw3Var, k6l k6lVar) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132018467);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = 2131755023;
        itlVar.g = new dxh(2130969328);
        super(itlVar, true);
        this.t = settingsManager;
        this.u = ru9Var;
        this.v = z77Var;
        this.w = ormVar;
        this.x = fw3Var;
        this.y = F0(new qp2((byte) 16));
        this.z = z4c.b(new t2(this, (byte) 15));
        kze kzeVar = new kze(uj7.a);
        this.A = kzeVar;
        byte b = 21;
        xj xjVar = new xj(this, k6lVar, b);
        this.B = xjVar;
        this.C = z4c.b(new so3(this, (byte) 0));
        this.D = z4c.b(new so3(this, (byte) 1));
        byte b2 = 2;
        this.E = z4c.b(new so3(this, b2));
        Class<wo3> cls = wo3.class;
        r2 r2Var = new r2(1, this, wo3.class, "isViableDropTarget", "isViableDropTarget(Lcom/opera/android/action/ActionButton;)Z", 0, (byte) 12);
        so3 so3Var = new so3(this, (byte) 3);
        li liVar = new li(this, cls, "activeDragHandler", "getActiveDragHandler()Lcom/opera/android/settings/bottom_bar/ActiveItemDragHandler;", 0, (byte) 10);
        wf wfVar = new wf((byte) 0);
        wfVar.setHasStableIds(true);
        byte b3 = 4;
        wfVar.J(vf.class, new uf(kzeVar, r2Var, xjVar, so3Var, liVar, (byte) 0), new mc8(b), new a3j(b3));
        this.F = wfVar;
        so3 so3Var2 = new so3(this, b3);
        li liVar2 = new li(this, cls, "availableDragHandler", "getAvailableDragHandler()Lcom/opera/android/settings/bottom_bar/AvailableItemDragHandler;", 0, (byte) 11);
        wf wfVar2 = new wf((byte) 2);
        wfVar2.setHasStableIds(true);
        wfVar2.J(kv2.class, new a32(xjVar, so3Var2, liVar2, b2), new qp2((byte) 7), new a3j(b3));
        this.G = wfVar2;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return (yo3) this.z.getValue();
    }

    public final void H0() {
        RecyclerView recyclerView = J0().c;
        int iH = z7h.h(recyclerView.getContext(), 8.0f);
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165345);
        int i = (int) (measuredWidth / dimensionPixelSize);
        if (i < 1) {
            i = 1;
        }
        if (((iH * i) - 1) + (dimensionPixelSize * i) > measuredWidth && i > 1) {
            i--;
        }
        int i2 = i;
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2);
        recyclerView.C0(gridLayoutManager);
        t79 t79Var = new t79(recyclerView, gridLayoutManager, iH, z7h.h(recyclerView.getContext(), 8.0f), 0, 0, i2, (byte) 0);
        this.H = t79Var;
        for (int size = recyclerView.p.size() - 1; -1 < size; size--) {
            if (recyclerView.X(size) instanceof i4a) {
                recyclerView.r0(size);
            }
        }
        recyclerView.m(new i4a(t79Var));
        recyclerView.a0();
    }

    public final void I0() throws Resources.NotFoundException {
        boolean z = getResources().getBoolean(2131034116);
        J0().d.setVisibility(z ? 0 : 8);
        J0().e.setVisibility(z ? 8 : 0);
    }

    public final el9 J0() {
        xtb xtbVar = L[0];
        a5n a5nVar = this.y.b;
        Objects.requireNonNull(a5nVar);
        return (el9) a5nVar;
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        I0();
        J0().c.post(new to3(this, (byte) 0));
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        int i;
        super.onViewCreated(view, bundle);
        tcc lifecycle = getViewLifecycleOwner().getLifecycle();
        Bundle arguments = getArguments();
        uo3 uo3Var = uo3.UNKNOWN;
        uo3 uo3Var2 = (arguments == null || (i = arguments.getInt("entry_point", -1)) == -1 || i < 0 || i > uo3.values().length - 1) ? null : uo3.values()[i];
        if (uo3Var2 != null) {
            uo3Var = uo3Var2;
        }
        this.I = new np1(lifecycle, uo3Var, this.w);
        nv6 nv6VarB = this.u.b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("customize_toolbar_ui_shown", true);
        nv6VarB.w();
        I0();
        RecyclerView recyclerView = J0().b;
        recyclerView.getContext();
        recyclerView.C0(new GridLayoutManager(5));
        recyclerView.y0(this.F);
        recyclerView.t = true;
        recyclerView.B0(new dg());
        J0().c.post(new to3(this, (byte) 1));
        fg fgVar = (fg) this.D.getValue();
        RecyclerView recyclerView2 = J0().b;
        fgVar.h = recyclerView2;
        flb flbVar = new flb(fgVar);
        flbVar.e(recyclerView2);
        fgVar.g = flbVar;
        mv2 mv2Var = (mv2) this.E.getValue();
        RecyclerView recyclerView3 = J0().c;
        mv2Var.h = recyclerView3;
        flb flbVar2 = new flb(mv2Var);
        flbVar2.e(recyclerView3);
        mv2Var.g = flbVar2;
        xf8.i0((ekc) ((zyk) ((yo3) this.z.getValue()).d.f).getValue(), getViewLifecycleOwner(), J0().a, (List) null, new pb(this, (byte) 22));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        View viewFindViewById;
        this.J = itdVar;
        View actionView = itdVar.findItem(2131364059).getActionView();
        if (actionView == null || (viewFindViewById = actionView.findViewById(2131364056)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new gf((Object) this, (byte) 26));
    }
}
