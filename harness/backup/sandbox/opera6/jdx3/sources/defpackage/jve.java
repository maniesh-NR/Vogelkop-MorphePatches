package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.startpage.common.SnappingRecyclerView;

/* loaded from: classes.dex */
public final class jve extends cve {
    public final uqe h;
    public final x5f i;
    public ga6 j;
    public final or2 k;
    public final Context l;
    public nb8 m;
    public final vm3 n;

    public jve(View view, ro9 ro9Var, uqe uqeVar, vue vueVar, vue vueVar2, dmg dmgVar, x5f x5fVar) {
        super(view, ro9Var, uqeVar, vueVar, vueVar2, dmgVar);
        this.h = uqeVar;
        this.i = x5fVar;
        int i = 2131362253;
        ConstraintLayout constraintLayoutJ = w1h.j(2131362253, view);
        if (constraintLayoutJ != null) {
            i = 2131362260;
            ConstraintLayout constraintLayoutJ2 = w1h.j(2131362260, view);
            if (constraintLayoutJ2 != null) {
                i = 2131362902;
                if (((SnappingRecyclerView) w1h.j(2131362902, view)) != null) {
                    i = 2131363361;
                    StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363361, view);
                    if (stylingImageView != null) {
                        i = 2131363548;
                        MaterialButton materialButtonJ = w1h.j(2131363548, view);
                        if (materialButtonJ != null) {
                            CardView cardView = (CardView) view;
                            this.k = new or2(cardView, constraintLayoutJ, constraintLayoutJ2, stylingImageView, materialButtonJ, (byte) 10);
                            this.l = cardView.getContext();
                            vm3 vm3Var = new vm3((cve) this, (byte) 1);
                            this.n = vm3Var;
                            this.e.o(vm3Var);
                            lzb lzbVar = new lzb(this, (byte) 22);
                            dll dllVarS = q9n.s(cardView);
                            if (dllVarS == null) {
                                return;
                            }
                            u8n.b(dllVarS, cardView, lzbVar);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.cve, defpackage.xa2
    public final void J(wa2 wa2Var) {
        wa2Var.d = true;
        wa2Var.c = false;
    }

    @Override // defpackage.cve, defpackage.ya2
    public final void R() {
        super.R();
        this.n.b = false;
    }

    @Override // defpackage.cve, defpackage.y9n
    public final void T(View view, int i, int i2) {
        super.T(view, i, i2);
        nb8 nb8Var = this.m;
        if (nb8Var == null || !r9i.K(i, i2)) {
            return;
        }
        String str = nb8Var.i;
        uy8 uy8Var = this.h.h;
        if (uy8Var.G.add(str)) {
            x5f x5fVar = uy8Var.K.a;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new ck0(zpaVar, x56VarF).j(new j5f(str, od0.b, 1));
                x5fVar.U0(x56VarF);
            }
        }
    }

    @Override // defpackage.cve, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        nb8 nb8Var = ((ere) g0().c).i;
        if (nb8Var == null) {
            return;
        }
        this.m = nb8Var;
        or2 or2Var = this.k;
        AppCompatImageView appCompatImageView = (StylingImageView) or2Var.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) or2Var.d;
        this.j = gu8.i0(appCompatImageView, constraintLayout);
        l5b l5bVar = q9n.c;
        u8n.h(constraintLayout);
        u8n.h((MaterialButton) or2Var.b);
        j0();
    }

    @Override // defpackage.cve
    public final View[] f0() {
        return new View[]{(ConstraintLayout) this.k.e};
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.ImageView, com.opera.android.custom_views.StylingImageView] */
    public final void j0() {
        Drawable drawable;
        nb8 nb8Var = this.m;
        if (nb8Var != null) {
            Context context = this.l;
            int color = Color.parseColor(f03.H(context) ? nb8Var.f : nb8Var.e);
            int color2 = Color.parseColor(!f03.I(context) ? nb8Var.d : nb8Var.c);
            String str = !f03.I(context) ? nb8Var.b : nb8Var.a;
            or2 or2Var = this.k;
            ?? r5 = (StylingImageView) or2Var.f;
            MaterialButton materialButton = (MaterialButton) or2Var.b;
            deg degVar = yne.b;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            dwh dwhVarI = degVar.i(str);
            boolean z = false;
            if (!r5.d() && (drawable = r5.getDrawable()) != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                    shapeDrawable.setIntrinsicHeight(intrinsicHeight);
                    shapeDrawable.setIntrinsicWidth(intrinsicWidth);
                    shapeDrawable.getPaint().setColor(0);
                    dwhVarI.k(shapeDrawable);
                }
            }
            ga6 ga6Var = this.j;
            if (ga6Var == null) {
                ga6Var = null;
            }
            Point point = (Point) ga6Var.b;
            if (point.x > 0 && point.y > 0) {
                z = true;
            }
            if (!z) {
                dwhVarI.d = true;
            }
            dwhVarI.g((ImageView) r5, (d94) null);
            ((ConstraintLayout) or2Var.d).setBackground(new ColorDrawable(color));
            materialButton.setTextColor(color2);
            materialButton.setBackgroundColor(color);
            materialButton.H(ColorStateList.valueOf(color2));
            materialButton.setText(nb8Var.g);
            materialButton.setOnClickListener(new jf7(this, nb8Var, (byte) 25));
        }
    }
}
