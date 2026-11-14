package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.undo.UndoBar;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uw extends i93 implements o37 {
    public static final /* synthetic */ xtb[] x = {new d6h(uw.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentAddressesSettingsBinding;", 0)};
    public final ua7 t;
    public final ktl u;
    public final zyk v;
    public yw w;

    public uw(gjm gjmVar) {
        super(2132017674, 0, 14);
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = F0(new mc8((byte) 28));
        this.v = z4c.b(new t2(this, (byte) 6));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final xk9 H0() {
        xtb xtbVar = x[0];
        a5n a5nVar = this.u.b;
        Objects.requireNonNull(a5nVar);
        return (xk9) a5nVar;
    }

    public final cx I0() {
        return (cx) this.v.getValue();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.w = null;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H0().c.setFocusableInTouchMode(false);
        H0().d.u = new bi(this, (byte) 11);
        H0().e.b.setOnClickListener(new gf((Object) this, (byte) 9));
        cx cxVarI0 = I0();
        qm9 qm9Var = this.n;
        nkm nkmVar = cxVarI0.g;
        sw swVar = cxVarI0.e;
        UndoBar undoBar = new UndoBar(nkmVar.a, qm9Var, swVar, swVar, true);
        cxVarI0.j = undoBar;
        undoBar.e(2131886090);
        xf8.i0(I0().h, getViewLifecycleOwner(), H0().a, (List) null, new k9(this, (byte) 5));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
