package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class r4i extends uq3 {
    public final gjm a;
    public final gw3 b;
    public Object c;
    public Object d;
    public final x4i e;
    public final r2i f;
    public final orm g;
    public final ua7 h;
    public pt1 i;
    public long j;
    public t0i k;

    public r4i(gjm gjmVar, x4i x4iVar, r2i r2iVar, gw3 gw3Var, ekc ekcVar, orm ormVar) {
        s4i s4iVar = s4i.a;
        s4i s4iVar2 = s4i.b;
        this.a = gjmVar;
        this.b = gw3Var;
        this.c = s4iVar2;
        this.e = x4iVar;
        this.f = r2iVar;
        this.g = ormVar;
        this.h = new ua7((Fragment) this, gjmVar);
        ekcVar.j(this, new iwa(new rmg(this, (byte) 25), (byte) 29));
    }

    public final void g0(DialogInterface dialogInterface) {
        super/*androidx.fragment.app.i*/.onDismiss(dialogInterface);
        Object obj = this.c;
        if (this.d != null) {
            return;
        }
        this.d = obj;
        this.a.h(t4i.class, obj);
    }

    public final void h0(long j) {
        pt1 pt1Var = this.i;
        if (pt1Var == null) {
            pt1Var = null;
        }
        ((TextView) pt1Var.e).setText(phj.X(requireContext(), 2132020941, new CharSequence[]{upj.o(requireContext(), j, true)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.app.Dialog, tq3] */
    public final Dialog onCreateDialog(Bundle bundle) {
        ?? tq3Var = new tq3(requireContext(), 2132083096);
        tq3Var.setContentView(2131559274);
        if (tq3Var.g == null) {
            tq3Var.f();
        }
        tq3Var.g.M(3);
        if (tq3Var.g == null) {
            tq3Var.f();
        }
        tq3Var.g.K = true;
        ConstraintLayout constraintLayoutRequireViewById = tq3Var.requireViewById(2131364425);
        int i = 2131362122;
        TextView textView = (TextView) w1h.j(2131362122, constraintLayoutRequireViewById);
        if (textView != null) {
            i = 2131363509;
            TextView textView2 = (TextView) w1h.j(2131363509, constraintLayoutRequireViewById);
            if (textView2 != null) {
                i = 2131364221;
                View viewJ = w1h.j(2131364221, constraintLayoutRequireViewById);
                if (viewJ != null) {
                    ConstraintLayout constraintLayout = constraintLayoutRequireViewById;
                    i = 2131363525;
                    TextView textView3 = (TextView) w1h.j(2131363525, constraintLayoutRequireViewById);
                    if (textView3 != null) {
                        i = 2131364949;
                        MaterialButton materialButton = (OperaMaterialButton) w1h.j(2131364949, constraintLayoutRequireViewById);
                        if (materialButton != null) {
                            this.i = new pt1((ViewGroup) constraintLayout, (View) textView, (Object) textView2, viewJ, (View) textView3, (View) materialButton, (byte) 16);
                            this.b.a(tq3Var);
                            return tq3Var;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutRequireViewById.getResources().getResourceName(i)));
        return null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        g0(dialogInterface);
        t0i t0iVar = this.k;
        lo0 lo0Var = lo0.c;
        lo0 lo0Var2 = lo0.b;
        orm ormVar = this.g;
        ua7 ua7Var = this.h;
        if (t0iVar != null) {
            int iOrdinal = ((t4i) ua7Var.p()).b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                lo0Var = lo0Var2;
            }
            no0 no0Var = !(t0iVar.a instanceof q0i) ? no0.b : no0.c;
            x5f x5fVar = (x5f) ormVar;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new ck0(zpaVar, x56VarF).b(new jkc(lo0Var, no0Var, (byte) 23));
                x5fVar.U0(x56VarF);
                return;
            }
            return;
        }
        if (this.j < ((t4i) ua7Var.p()).a.b) {
            int iOrdinal2 = ((t4i) ua7Var.p()).b.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    h9o.p();
                    return;
                }
                lo0Var = lo0Var2;
            }
            x5f x5fVar2 = (x5f) ormVar;
            if (x5fVar2.h) {
                zpa zpaVar2 = x5fVar2.d;
                x56 x56VarF2 = zpa.F();
                new ck0(zpaVar2, x56VarF2).b(new jkc(lo0Var, no0.d, (byte) 23));
                x5fVar2.U0(x56VarF2);
            }
        }
    }
}
