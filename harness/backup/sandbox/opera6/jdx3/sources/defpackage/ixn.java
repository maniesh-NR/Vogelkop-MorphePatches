package defpackage;

import android.widget.RelativeLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class ixn extends jxn {
    public final kf g;

    public ixn(kf kfVar, tzi tziVar) {
        super((RelativeLayout) kfVar.b, tziVar);
        this.g = kfVar;
    }

    @Override // defpackage.yzi
    public final boolean Y() {
        return false;
    }

    @Override // defpackage.jxn
    public final void j0(vtn vtnVar) {
        ytn ytnVar = (ytn) vtnVar;
        U();
        this.f = ytnVar;
        ((StylingTextView) this.g.c).setText(ytnVar.a);
    }
}
