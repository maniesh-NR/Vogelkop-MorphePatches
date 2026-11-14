package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class mzb extends ab2 {
    public final swc d;
    public final tah e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.opera.android.custom_views.StylingTextView] */
    public mzb(View view, tah tahVar) {
        super(view);
        ?? r1 = (StylingTextView) w1h.j(2131363296, view);
        if (r1 == 0) {
            t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363296)));
            throw null;
        }
        this.d = new swc((FrameLayout) view, r1, (byte) 2);
        this.e = tahVar;
        lzb lzbVar = new lzb(this, (byte) 0);
        q9n.e(r1, lzbVar);
        lzbVar.a(r1);
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        this.d.c.setText(((kzb) ja2Var).b);
    }
}
