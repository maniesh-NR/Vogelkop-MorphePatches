package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class hwc extends ab2 {
    public final owc d;
    public String e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public hwc(View view, byte b) {
        super(view);
        this.f = b;
        int i = 2131362708;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362708, view);
        if (stylingImageView != null) {
            i = 2131362709;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362709, view);
            if (frameLayout != null) {
                i = 2131362997;
                ?? r5 = (StylingImageView) w1h.j(2131362997, view);
                if (r5 != 0) {
                    i = 2131363206;
                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131363206, view);
                    if (linearLayout != null) {
                        i = 2131363950;
                        StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363950, view);
                        if (stylingTextView != null) {
                            i = 2131364184;
                            StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131364184, view);
                            if (stylingTextView2 != null) {
                                i = 2131365000;
                                View viewJ = w1h.j(2131365000, view);
                                if (viewJ != null) {
                                    this.d = new owc((LinearLayout) view, stylingImageView, frameLayout, (StylingImageView) r5, linearLayout, stylingTextView, stylingTextView2, viewJ);
                                    lzb lzbVar = new lzb(this, (byte) 7);
                                    dll dllVarS = q9n.s(r5);
                                    if (dllVarS != null) {
                                        u8n.b(dllVarS, r5, lzbVar);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        byte b = this.f;
        owc owcVar = this.d;
        switch (b) {
            case 0:
                ((ewc) a0()).c = this;
                fwc fwcVar = (fwc) ja2Var;
                c0(fwcVar.d.a);
                yq1 yq1Var = owcVar.e;
                ate ateVar = fwcVar.d;
                yq1Var.setText(ateVar.b);
                owcVar.h.setText(ateVar.c);
                owcVar.d.setOnClickListener(new gwc(ja2Var, b));
                owcVar.i.setVisibility(0);
                owcVar.c.setVisibility(0);
                owcVar.g.setOnClickListener(new gwc(ja2Var, (byte) 1));
                owcVar.b.setBackground(null);
                break;
            case 1:
                ((ewc) a0()).c = this;
                iwc iwcVar = (iwc) ja2Var;
                c0(iwcVar.b.a);
                e0(iwcVar);
                owcVar.b.setOnClickListener(new gwc(ja2Var, (byte) 2));
                owcVar.d.setBackground(null);
                owcVar.g.setBackground(null);
                iwcVar.c = this;
                break;
            case 2:
                ((ewc) a0()).c = this;
                jwc jwcVar = (jwc) ja2Var;
                c0(jwcVar.d.a);
                owcVar.e.setText(jwcVar.d.b);
                yq1 yq1Var2 = owcVar.h;
                Resources resources = yq1Var2.getResources();
                int i = jwcVar.e;
                yq1Var2.setText(resources.getQuantityString(2131886157, i, Integer.valueOf(i)));
                owcVar.c.setVisibility(0);
                owcVar.b.setOnClickListener(new gwc(ja2Var, (byte) 3));
                owcVar.d.setBackground(null);
                owcVar.g.setBackground(null);
                break;
            default:
                ((ewc) a0()).c = this;
                kwc kwcVar = (kwc) ja2Var;
                String str = kwcVar.b.a;
                c0(str);
                yq1 yq1Var3 = owcVar.e;
                ate ateVar2 = kwcVar.b;
                yq1Var3.setText(ateVar2.b);
                boolean zEquals = str.equals("zz");
                yq1 yq1Var4 = owcVar.h;
                yq1Var4.setVisibility(zEquals ? (byte) 0 : (byte) 8);
                yq1Var4.setText(zEquals ? ateVar2.c : null);
                owcVar.b.setOnClickListener(new gwc(ja2Var, (byte) 4));
                owcVar.d.setBackground(null);
                owcVar.g.setBackground(null);
                break;
        }
    }

    @Override // defpackage.ab2
    public final void Y() {
        switch (this.f) {
            case 1:
                ((iwc) a0()).c = null;
                break;
            default:
                ((ewc) a0()).c = null;
                break;
        }
    }

    public final void b0() {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void c0(String str) {
        this.e = str;
        ?? r3 = this.d.f;
        r3.setImageDrawable(ddh.o(true, r3.getContext(), 0, vtp.K(2131231685, str)));
    }

    public final void e0(iwc iwcVar) {
        owc owcVar = this.d;
        yq1 yq1Var = owcVar.e;
        ate ateVar = iwcVar.b;
        yq1Var.setText(x7d.K(ateVar.b, ateVar.d));
        yq1 yq1Var2 = owcVar.h;
        ate ateVar2 = iwcVar.b;
        yq1Var2.setText(x7d.K(ateVar2.c, ateVar2.e));
    }
}
