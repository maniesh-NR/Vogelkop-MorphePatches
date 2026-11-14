package defpackage;

import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import ads_mobile_sdk.tl;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class zq extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public tl a;
    public fq b;
    public or4 c;

    public final void a() {
        or4 or4Var = this.c;
        if (or4Var != null) {
            xgp.a.getClass();
            na2.B((nx5) ((sb0) ru0.a()).u.get(), null, null, new sqo((byte) 2, null, or4Var), 3);
        }
    }

    public final void b() {
        fq fqVar = this.b;
        if (this.a == null && fqVar != null) {
            setMinimumHeight((int) TypedValue.applyDimension(1, fqVar.b, getContext().getResources().getDisplayMetrics()));
            setMinimumWidth((int) TypedValue.applyDimension(1, fqVar.a, getContext().getResources().getDisplayMetrics()));
        } else {
            setMinimumHeight(0);
            setMinimumWidth(0);
        }
        requestLayout();
    }
}
