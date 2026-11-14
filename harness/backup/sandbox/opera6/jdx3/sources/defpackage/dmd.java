package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public final class dmd implements a5n {
    public final /* synthetic */ byte a = 0;
    public final LinearLayout b;

    public dmd(LinearLayout linearLayout) {
        this.b = linearLayout;
    }

    public dmd(LinearLayout linearLayout, cr2 cr2Var, MaterialCardView materialCardView, vs vsVar, ov0 ov0Var) {
        this.b = linearLayout;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
