package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final class cmd extends i {
    public final xbf b;
    public final or2 c;
    public final c5o d;
    public qjd e;
    public long f;
    public kg7 g;
    public final ig2 h;

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public cmd(xbf xbfVar, View view, yzb yzbVar, z0c z0cVar) {
        super(view);
        this.d = new c5o((byte) 29);
        this.b = xbfVar;
        int i = 2131362625;
        ?? r3 = (StylingImageView) w1h.j(2131362625, view);
        if (r3 != 0) {
            i = 2131362647;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362647, view);
            if (stylingTextView != null) {
                i = 2131363206;
                if (((RelativeLayout) w1h.j(2131363206, view)) != null) {
                    i = 2131363256;
                    ?? r5 = (StylingImageView) w1h.j(2131363256, view);
                    if (r5 != 0) {
                        i = 2131364208;
                        SelectableRelativeLayout selectableRelativeLayout = (SelectableRelativeLayout) w1h.j(2131364208, view);
                        if (selectableRelativeLayout != null) {
                            i = 2131363525;
                            StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363525, view);
                            if (stylingTextView2 != null) {
                                this.c = new or2((FrameLayout) view, (StylingImageView) r3, stylingTextView, (StylingImageView) r5, selectableRelativeLayout, stylingTextView2);
                                selectableRelativeLayout.d(true);
                                selectableRelativeLayout.setOnClickListener(new jf7(this, yzbVar, (byte) 19));
                                r3.setOnTouchListener(new bmd(this, z0cVar, (byte) 0));
                                this.h = new ig2(r5.getContext(), fan.a(24.0f, r5.getResources()));
                                lzb lzbVar = new lzb(this, (byte) 12);
                                l5b l5bVar = q9n.c;
                                dll dllVarV = hjf.v(view.getContext());
                                if (dllVarV == null) {
                                    return;
                                }
                                u8n.b(dllVarV, view, lzbVar);
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    public final void U() {
        Context context = ((i) this).itemView.getContext();
        or2 or2Var = this.c;
        ((StylingImageView) or2Var.d).setBackgroundDrawable(new w3a(this.g.g(1, context), 17, false));
        ((SelectableRelativeLayout) or2Var.e).g = p37.a0(0.12f, f03.t(this.g.d, context, 2131101243));
        int iT = f03.t(this.g.b, context, 2131101243);
        ig2 ig2Var = this.h;
        if (ig2Var.K == iT) {
            return;
        }
        ig2Var.K = iT;
        ig2Var.invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.opera.android.custom_views.StylingImageView] */
    public final void V() {
        gig gigVar = (gig) ((ode) this.b.c).g();
        boolean zEquals = this.e.equals(gigVar.g());
        ig2 ig2Var = this.h;
        if (!zEquals) {
            ig2Var.p(0);
        }
        boolean zE0 = gigVar.e0();
        if (ig2Var.J != zE0) {
            ig2Var.J = zE0;
            if (zE0) {
                ig2Var.k();
            } else {
                ig2Var.j();
            }
            ig2Var.invalidateSelf();
        }
        or2 or2Var = this.c;
        ?? r3 = (StylingImageView) or2Var.d;
        ?? H = ig2Var;
        if (!zEquals) {
            H = this.g.h(1, ((i) this).itemView.getContext());
        }
        r3.setImageDrawable(H);
        ((SelectableRelativeLayout) or2Var.e).setSelected(zEquals);
        X();
    }

    public final void X() {
        CharSequence charSequenceT;
        or2 or2Var = this.c;
        boolean zIsSelected = ((SelectableRelativeLayout) or2Var.e).isSelected();
        c5o c5oVar = this.d;
        if (zIsSelected) {
            long currentPosition = ((gig) ((ode) this.b.c).g()).getCurrentPosition();
            charSequenceT = this.f == -9223372036854775807L ? c5oVar.t(currentPosition) : ((i) this).itemView.getContext().getString(2132019749, c5oVar.t(currentPosition), c5oVar.t(this.f));
        } else {
            charSequenceT = c5oVar.t(this.f);
        }
        ((StylingTextView) or2Var.b).setText(charSequenceT);
    }
}
