package defpackage;

import android.widget.RelativeLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class ry0 extends sy0 {
    public final kf g;

    public ry0(kf kfVar, tzi tziVar) {
        super((RelativeLayout) kfVar.b, tziVar);
        this.g = kfVar;
    }

    @Override // defpackage.sy0
    public final void j0(fy0 fy0Var) {
        hy0 hy0Var = (hy0) fy0Var;
        U();
        this.f = hy0Var;
        ((StylingTextView) this.g.c).setText(hy0Var.a);
    }
}
