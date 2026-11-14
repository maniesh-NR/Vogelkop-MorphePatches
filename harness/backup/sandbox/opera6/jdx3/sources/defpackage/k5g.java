package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.SelectableRelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k5g extends m5g implements h4g {
    public final vs b;
    public final qfb c;
    public final w4g d;
    public final int e;
    public Integer f;
    public String g;
    public String h;

    public k5g(ViewGroup viewGroup, qfb qfbVar, w4g w4gVar) {
        View viewN = j7c.n(viewGroup, 2131558550, viewGroup, false);
        SelectableRelativeLayout selectableRelativeLayout = (SelectableRelativeLayout) viewN;
        int i = 2131363251;
        yq1 yq1Var = (StylingTextView) w1h.j(2131363251, viewN);
        if (yq1Var != null) {
            i = 2131363256;
            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363256, viewN);
            if (stylingImageView != null) {
                i = 2131363263;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363263, viewN);
                if (stylingTextView != null) {
                    vs vsVar = new vs((ViewGroup) selectableRelativeLayout, (View) yq1Var, (Object) stylingImageView, (Object) stylingTextView, (byte) 7);
                    super(selectableRelativeLayout);
                    this.b = vsVar;
                    this.c = qfbVar;
                    this.d = w4gVar;
                    int i2 = vmj.g;
                    this.e = tmj.i(((i) this).itemView.getContext());
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.h4g
    public final boolean P(int i, String str) {
        Integer num = this.f;
        return num != null && i == num.intValue() && Intrinsics.a(str, this.g);
    }

    @Override // defpackage.h4g
    public final void s() {
        vs vsVar = this.b;
        StylingImageView stylingImageView = (StylingImageView) vsVar.d;
        int i = vmj.g;
        Context context = ((SelectableRelativeLayout) vsVar.b).getContext();
        String str = this.h;
        if (str == null) {
            str = this.g;
        }
        if (str == null) {
            str = "";
        }
        stylingImageView.setImageDrawable(tmj.m(context, str, 0, 0, null, 60));
    }

    @Override // defpackage.h4g
    public final void w(Bitmap bitmap) {
        int i = this.e;
        Context context = ((i) this).itemView.getContext();
        PathInterpolator pathInterpolator = s8i.d;
        p8i p8iVar = new p8i(i, i / 2, context, bitmap);
        p8iVar.a(f03.s(((i) this).itemView.getContext()));
        ((StylingImageView) this.b.d).setImageDrawable(p8iVar);
    }
}
