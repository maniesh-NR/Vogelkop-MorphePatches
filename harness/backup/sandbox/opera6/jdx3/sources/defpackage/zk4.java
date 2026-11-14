package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.undo.UndoBar;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zk4 extends i93 implements o37 {
    public static final /* synthetic */ xtb[] y = {new d6h(zk4.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentCardsSettingsBinding;", 0)};
    public final wh2 t;
    public final ua7 u;
    public final ktl v;
    public final zyk w;
    public yw x;

    public zk4(gjm gjmVar, wh2 wh2Var) {
        super(2132017779, 0, 14);
        this.t = wh2Var;
        this.u = new ua7((Fragment) this, gjmVar);
        this.v = F0(new t14((byte) 17));
        this.w = z4c.b(new t2(this, (byte) 17));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final gl9 H0() {
        xtb xtbVar = y[0];
        a5n a5nVar = this.v.b;
        Objects.requireNonNull(a5nVar);
        return (gl9) a5nVar;
    }

    public final dl4 I0() {
        return (dl4) this.w.getValue();
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wh2 wh2Var = this.t;
        wh2Var.getClass();
        getLifecycle().a(wh2Var.b);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.x = null;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H0().b.setFocusableInTouchMode(false);
        H0().c.u = new va2(this, (byte) 28);
        H0().d.b.setOnClickListener(new yk4(this, (byte) 0));
        dl4 dl4VarI0 = I0();
        qm9 qm9Var = this.n;
        nkm nkmVar = dl4VarI0.f;
        gv2 gv2Var = dl4VarI0.e;
        UndoBar undoBar = new UndoBar(nkmVar.a, qm9Var, gv2Var, gv2Var, true);
        dl4VarI0.l = undoBar;
        undoBar.e(2131886091);
        xf8.i0(I0().i, getViewLifecycleOwner(), H0().a, (List) null, new k9(this, (byte) 23));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.u;
    }
}
