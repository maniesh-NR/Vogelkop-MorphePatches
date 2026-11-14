package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public class cve extends lx8 implements y9n, rjm, ya2, xa2 {
    public final TextView d;
    public final RecyclerView e;
    public final cu8 f;
    public final nu8 g;

    public cve(View view, ro9 ro9Var, uqe uqeVar, vue vueVar, vue vueVar2, dmg dmgVar) {
        eve eveVar = new eve(uqeVar, vueVar, vueVar2, dmgVar);
        super(view);
        cu8 cu8Var = new cu8(tni.c);
        this.f = cu8Var;
        cu8Var.G(eveVar);
        this.d = (TextView) view.findViewById(2131362903);
        RecyclerView recyclerViewFindViewById = view.findViewById(2131362902);
        this.e = recyclerViewFindViewById;
        nu8 nu8VarE0 = e0();
        this.g = nu8VarE0;
        if (nu8VarE0 != null) {
            recyclerViewFindViewById.m(nu8VarE0);
        }
        recyclerViewFindViewById.y0(cu8Var);
        h0(view.getContext());
        recyclerViewFindViewById.t = false;
        recyclerViewFindViewById.B0((e) null);
        recyclerViewFindViewById.D0(ro9Var);
    }

    @Override // defpackage.xa2
    public void J(wa2 wa2Var) {
        Rect rect = wa2Var.b;
        nu8 nu8Var = this.g;
        if (nu8Var != null) {
            int iMax = Math.max(rect.left, rect.right);
            if (nu8Var.d != iMax) {
                nu8Var.d = iMax;
                this.e.a0();
                for (View view : f0()) {
                    if (view != null) {
                        view.setPadding(iMax, view.getPaddingTop(), iMax, view.getPaddingBottom());
                    }
                }
            }
            rect.left = 0;
            rect.right = 0;
        }
    }

    @Override // defpackage.ya2
    public void R() {
        fve fveVarG0 = g0();
        boolean zD = fveVarG0.d();
        RecyclerView recyclerView = this.e;
        if (!zD) {
            recyclerView.x0(0);
            return;
        }
        u0g u0gVar = fveVarG0.a;
        fveVarG0.a = null;
        recyclerView.restoreHierarchyState(u0gVar);
    }

    @Override // defpackage.y9n
    public void T(View view, int i, int i2) {
        this.f.c.d();
    }

    @Override // defpackage.ab2
    public final int U() {
        return -1;
    }

    @Override // defpackage.ab2
    public void V(ja2 ja2Var, boolean z) {
        if (z) {
            return;
        }
        String strI0 = i0();
        String str = g0().d;
        fve fveVarG0 = g0();
        vw vwVar = new vw((byte) 11, (Object) str, fveVarG0.j);
        boolean z2 = fveVarG0.g;
        amb ambVarP0 = fveVarG0.f;
        if (z2) {
            ambVarP0 = sfe.p0(ambVarP0, 5);
        }
        Collection collectionR = h1b.r(new zlb(sfe.M0(ambVarP0, new qw8(vwVar, (byte) 2)), bsg.b, (byte) 0));
        boolean zIsEmpty = collectionR.isEmpty();
        RecyclerView recyclerView = this.e;
        TextView textView = this.d;
        if (zIsEmpty) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            recyclerView.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(strI0);
            }
            recyclerView.setVisibility(0);
            this.f.b0(collectionR);
        }
    }

    @Override // defpackage.ab2
    public final void X(boolean z) {
        R();
    }

    @Override // defpackage.ab2
    public final void Y() {
        t();
        cu8 cu8Var = this.f;
        cu8Var.getClass();
        cu8Var.b0(Collections.EMPTY_LIST);
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        this.f.b(sjmVar);
    }

    @Override // defpackage.lx8
    public final int b0() {
        return 2;
    }

    public nu8 e0() {
        RecyclerView recyclerView = this.e;
        return new nu8(fan.a(16.0f, recyclerView.getResources()), f03.w(2130970848, recyclerView.getContext(), 0));
    }

    public View[] f0() {
        TextView textView = this.d;
        return textView != null ? new View[]{textView} : new View[0];
    }

    public final fve g0() {
        return (fve) ((j82) a0());
    }

    public void h0(Context context) {
        this.e.C0(new LinearLayoutManager(0, false));
    }

    public String i0() {
        oqe oqeVar = g0().c;
        return oqeVar.a() ? ((i) this).itemView.getContext().getString(2132020882) : oqeVar.b;
    }

    @Override // defpackage.ab2
    public void onDestroy() {
        this.e.y0((d) null);
        this.f.onDestroy();
    }

    @Override // defpackage.ya2
    public final void t() {
        SparseArray<Parcelable> u0gVar = new u0g<>();
        this.e.saveHierarchyState(u0gVar);
        g0().a = u0gVar;
    }
}
