package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.Fragment;
import com.opera.android.custom_views.StylingTextView;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qt2 extends h53 implements h4g {
    public static final /* synthetic */ xtb[] B = {new d6h(qt2.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentEditPasswordBinding;", 0)};
    public Drawable A;
    public final ktl t;
    public pq3 u;
    public int v;
    public final zyk w;
    public final ua7 x;
    public final ulp y;
    public w3g z;

    /* JADX WARN: Illegal instructions before constructor call */
    public qt2(gjm gjmVar) {
        u7k u7kVarF = u7k.f(fki.a);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.e = true;
        itlVar.k = 1;
        u7kVarF.s(2132018748);
        super(itlVar, true);
        this.t = F0(new qp2((byte) 4));
        this.w = z4c.b(new t2(this, (byte) 12));
        this.x = new ua7((Fragment) this, gjmVar);
        this.y = ulp.b;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.y;
    }

    public final nl9 H0() {
        xtb xtbVar = B[0];
        a5n a5nVar = this.t.b;
        Objects.requireNonNull(a5nVar);
        return (nl9) a5nVar;
    }

    public final void I0() {
        pq3 pq3Var = this.u;
        if (pq3Var == null) {
            pq3Var = null;
        }
        pq3Var.d.setEnabled((H0().h.k.q || H0().d.k.q) ? false : true);
    }

    @Override // defpackage.h4g
    public final boolean P(int i, String str) {
        w3g w3gVar = this.z;
        if (w3gVar == null) {
            w3gVar = null;
        }
        return i == w3gVar.a && Intrinsics.a(str, w3gVar.b.a);
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.v = getResources().getDimensionPixelSize(2131167472);
        ((StylingTextView) H0().e.f).setText(2132018745);
        xf8.i0(((st2) this.w.getValue()).d, getViewLifecycleOwner(), H0().a, (List) null, new pb(this, (byte) 16));
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
        pq3VarB.d.setText(2132020969);
        pq3 pq3Var = this.u;
        if (pq3Var == null) {
            pq3Var = null;
        }
        final byte b = 0;
        pq3Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: pt2
            public final /* synthetic */ qt2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                qt2 qt2Var = this.b;
                switch (b2) {
                    case 0:
                        st2 st2Var = (st2) qt2Var.w.getValue();
                        w3g w3gVar = qt2Var.z;
                        if (w3gVar == null) {
                            w3gVar = null;
                        }
                        String strValueOf = String.valueOf(qt2Var.H0().g.getText());
                        String strValueOf2 = String.valueOf(qt2Var.H0().c.getText());
                        a4g a4gVar = st2Var.e;
                        if (a4gVar != null) {
                            rt2 rt2Var = new rt2(st2Var, w3gVar);
                            N.MjE4dyB7(a4gVar.b, w3g.a(a4gVar.a, w3gVar), strValueOf, strValueOf2, rt2Var);
                            break;
                        }
                        break;
                    default:
                        qt2Var.g0();
                        break;
                }
            }
        });
        pq3 pq3Var2 = this.u;
        if (pq3Var2 == null) {
            pq3Var2 = null;
        }
        pq3Var2.c.setText(2132018111);
        pq3 pq3Var3 = this.u;
        final byte b2 = 1;
        (pq3Var3 != null ? pq3Var3 : null).c.setOnClickListener(new View.OnClickListener(this) { // from class: pt2
            public final /* synthetic */ qt2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                qt2 qt2Var = this.b;
                switch (b22) {
                    case 0:
                        st2 st2Var = (st2) qt2Var.w.getValue();
                        w3g w3gVar = qt2Var.z;
                        if (w3gVar == null) {
                            w3gVar = null;
                        }
                        String strValueOf = String.valueOf(qt2Var.H0().g.getText());
                        String strValueOf2 = String.valueOf(qt2Var.H0().c.getText());
                        a4g a4gVar = st2Var.e;
                        if (a4gVar != null) {
                            rt2 rt2Var = new rt2(st2Var, w3gVar);
                            N.MjE4dyB7(a4gVar.b, w3g.a(a4gVar.a, w3gVar), strValueOf, strValueOf2, rt2Var);
                            break;
                        }
                        break;
                    default:
                        qt2Var.g0();
                        break;
                }
            }
        });
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
