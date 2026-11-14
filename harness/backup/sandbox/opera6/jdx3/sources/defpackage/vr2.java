package defpackage;

import android.widget.ImageView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;

/* loaded from: classes.dex */
public final class vr2 extends ct2 {
    public final vs b;
    public final /* synthetic */ wr2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr2(wr2 wr2Var, vs vsVar, boolean z) {
        super((LayoutDirectionLinearLayout) vsVar.b);
        this.c = wr2Var;
        this.b = vsVar;
        ((ImageView) vsVar.d).setVisibility(z ? 0 : 8);
    }
}
