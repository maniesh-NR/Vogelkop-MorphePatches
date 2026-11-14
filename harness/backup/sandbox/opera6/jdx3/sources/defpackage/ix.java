package defpackage;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class ix extends lu8 {
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix(View view, ize izeVar, byte b) {
        super(view, izeVar);
        this.l = b;
    }

    @Override // defpackage.lu8
    public final void h0(RelativeLayout.LayoutParams layoutParams) {
        switch (this.l) {
            case 2:
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.addRule(14);
                break;
            default:
                super.h0(layoutParams);
                break;
        }
    }

    @Override // defpackage.lu8
    public final View i0() {
        switch (this.l) {
            case 0:
                return ((bo) ((mq) a0()).d).w;
            case 1:
                return ((vo8) ((mq) a0()).d).u;
            default:
                return ((ejf) ((mq) a0()).d).u;
        }
    }
}
