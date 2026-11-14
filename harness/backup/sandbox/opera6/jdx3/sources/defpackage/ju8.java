package defpackage;

import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class ju8 extends ou8 {
    @Override // defpackage.ou8, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        ov0 ov0Var = this.i;
        if (ov0Var != null) {
            LinearLayout linearLayout = (LinearLayout) ov0Var.b;
            linearLayout.setOnClickListener(null);
            linearLayout.setForeground(null);
            linearLayout.setClickable(false);
            linearLayout.setFocusable(false);
        }
    }

    @Override // defpackage.lx8
    public final cmg c0() {
        return cmg.HIGHLIGHTS_CAROUSEL_ITEM;
    }
}
