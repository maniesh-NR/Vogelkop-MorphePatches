package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class ive extends gu8 {
    public final hve m;
    public final or2 n;
    public final int o;
    public oqe p;

    public ive(View view, hve hveVar, p0c p0cVar) {
        super(view, hveVar, p0cVar);
        this.m = hveVar;
        int i = 2131362050;
        MaterialButton materialButtonJ = w1h.j(2131362050, view);
        if (materialButtonJ != null) {
            i = 2131362414;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362414, view);
            if (stylingTextView != null) {
                i = 2131363183;
                AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131363183, view);
                if (appCompatImageView != null) {
                    i = 2131363525;
                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363525, view);
                    if (stylingTextView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        this.n = new or2((View) constraintLayout, (View) materialButtonJ, stylingTextView, (View) appCompatImageView, stylingTextView2, (byte) 9);
                        this.o = fan.a(144.0f, constraintLayout.getContext().getResources());
                        lzb lzbVar = new lzb(this, (byte) 21);
                        dll dllVarS = q9n.s(constraintLayout);
                        if (dllVarS == null) {
                            return;
                        }
                        u8n.b(dllVarS, constraintLayout, lzbVar);
                        return;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.gu8, defpackage.y9n
    public final void T(View view, int i, int i2) {
        oqe oqeVar = this.p;
        if (oqeVar != null) {
            boolean zK = r9i.K(i, i2);
            hve hveVar = this.m;
            if (!zK) {
                hveVar.getClass();
                return;
            }
            uqe uqeVar = (uqe) hveVar.b;
            String str = ((fre) oqeVar).D.k;
            uy8 uy8Var = uqeVar.h;
            if (uy8Var.G.add(str)) {
                x5f x5fVar = uy8Var.K.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).j(new j5f(str, od0.c, 1));
                    x5fVar.U0(x56VarF);
                }
            }
        }
    }

    @Override // defpackage.gu8, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) throws Resources.NotFoundException {
        super.V(ja2Var, z);
        this.p = e0();
        if (z) {
            return;
        }
        or2 or2Var = this.n;
        yq1 yq1Var = (StylingTextView) or2Var.f;
        MaterialButton materialButton = (MaterialButton) or2Var.d;
        yq1Var.setText(this.m.J(e0()));
        ((StylingTextView) or2Var.b).setText(((fre) e0()).D.d);
        l5b l5bVar = q9n.c;
        u8n.h(materialButton);
        materialButton.setText(((fre) e0()).D.i);
        materialButton.setOnClickListener(new zvd(this, (byte) 3));
        m0();
    }

    @Override // defpackage.gu8, defpackage.ab2
    public final void Y() {
        super.Y();
        this.p = null;
    }

    public final void m0() {
        oqe oqeVar = this.p;
        if (oqeVar != null) {
            or2 or2Var = this.n;
            ConstraintLayout constraintLayout = or2Var.c;
            MaterialButton materialButton = (MaterialButton) or2Var.d;
            Context context = constraintLayout.getContext();
            hve hveVar = this.m;
            hveVar.getClass();
            int color = Color.parseColor(f03.H(context) ? ((fre) oqeVar).D.f : ((fre) oqeVar).D.e);
            int color2 = Color.parseColor(!f03.I(context) ? ((fre) oqeVar).D.h : ((fre) oqeVar).D.g);
            ((StylingTextView) or2Var.f).setTextColor(color);
            ((StylingTextView) or2Var.b).setTextColor(color);
            materialButton.setTextColor(color2);
            materialButton.H(ColorStateList.valueOf(color2));
            materialButton.I(ColorStateList.valueOf(color));
            or2Var.c.setBackground(new ColorDrawable(color2));
            String str = !f03.I(context) ? ((fre) oqeVar).D.c : ((fre) oqeVar).D.b;
            uqe uqeVar = (uqe) hveVar.b;
            Uri uri = Uri.parse(str);
            int i = this.o;
            gu8.g0(uqeVar.m(uri, i, i), (StylingImageView) or2Var.e, new ga6(new Point(i, i), (byte) 11));
        }
    }

    @Override // defpackage.gu8, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        oqe oqeVarE0 = e0();
        uqe uqeVar = this.m.h;
        String str = ((fre) oqeVarE0).D.k;
        uy8 uy8Var = uqeVar.h;
        if (uy8Var.F.add(str)) {
            x5f x5fVar = uy8Var.K.a;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new ck0(zpaVar, x56VarF).j(new j5f(str, od0.c, 2));
                x5fVar.U0(x56VarF);
            }
        }
    }
}
