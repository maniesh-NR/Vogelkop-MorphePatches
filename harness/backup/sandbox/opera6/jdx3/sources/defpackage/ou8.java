package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public class ou8 extends lx8 implements View.OnClickListener, y9n {
    public final r9i d;
    public final StylingImageView e;
    public final TextView f;
    public final TextView g;
    public final StylingTextView h;
    public final ov0 i;
    public final ga6 j;

    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public ou8(r9i r9iVar, View view) {
        super(view);
        view.setOnClickListener(this);
        this.d = r9iVar;
        ?? r2 = (StylingImageView) view.findViewById(2131362921);
        this.e = r2;
        this.f = (TextView) view.findViewById(2131362920);
        this.g = (TextView) view.findViewById(2131362925);
        this.h = (StylingTextView) view.findViewById(2131362923);
        View viewFindViewById = view.findViewById(2131362922);
        this.i = viewFindViewById != null ? ov0.d(viewFindViewById) : null;
        this.j = gu8.i0(r2, view);
    }

    @Override // defpackage.y9n
    public void T(View view, int i, int i2) {
        int i3;
        int i4;
        j82 j82Var = (j82) this.b;
        if (j82Var != null) {
            r9i r9iVar = this.d;
            ov0 ov0Var = this.i;
            if (ov0Var != null) {
                i3 = i;
                i4 = i2;
                r9iVar.c(j82Var, ov0Var, c0(), i3, i4);
            } else {
                i3 = i;
                i4 = i2;
            }
            r9iVar.getClass();
            if (r9i.K(i3, i4)) {
                r9iVar.O(j82Var, true);
            } else {
                if (i4 <= 33 || i3 > 33) {
                    return;
                }
                r9iVar.O(j82Var, false);
            }
        }
    }

    @Override // defpackage.ab2
    public void V(ja2 ja2Var, boolean z) {
        if (z) {
            return;
        }
        oqe oqeVar = ((pue) ((j82) a0())).c;
        TextView textView = this.g;
        r9i r9iVar = this.d;
        textView.setText(r9iVar.J(oqeVar));
        yq1 yq1Var = this.h;
        if (yq1Var != null) {
            yq1Var.setText(r9iVar.H(oqeVar));
        }
        gu8.k0(this.f, (j82) a0(), r9iVar);
        gu8.l0(this.i, oqeVar, r9iVar, this);
        ga6 ga6Var = this.j;
        gu8.g0(r9iVar.F(oqeVar, ga6Var), this.e, ga6Var);
    }

    @Override // defpackage.ab2
    public final void Y() {
        yne.b.c(this.e);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j82 j82Var = (j82) this.b;
        if (j82Var != null) {
            View view2 = ((i) this).itemView;
            r9i r9iVar = this.d;
            if (view == view2) {
                r9iVar.r(this, j82Var);
                return;
            }
            ov0 ov0Var = this.i;
            if (ov0Var == null || view != ((LinearLayout) ov0Var.b)) {
                return;
            }
            r9iVar.N(this, j82Var);
        }
    }
}
