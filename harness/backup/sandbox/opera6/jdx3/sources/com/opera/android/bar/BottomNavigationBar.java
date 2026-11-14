package com.opera.android.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.opera.android.custom_views.DropShadowFrameLayout;
import defpackage.lp3;
import defpackage.maj;
import defpackage.nje;
import defpackage.no3;

/* loaded from: classes.dex */
public class BottomNavigationBar extends lp3 {
    public DropShadowFrameLayout u;
    public View v;

    public BottomNavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.opera.android.bar.BottomBar
    public final void b(boolean z) {
        this.u.b(!z ? null : u0h.g(getContext(), maj.b));
    }

    @Override // com.opera.android.bar.BottomBar
    public final int c() {
        if (this.v.getVisibility() != 8) {
            return getResources().getDimensionPixelSize(2131165344);
        }
        return 0;
    }

    @Override // com.opera.android.bar.BottomBar
    public final View e(nje njeVar) {
        int iOrdinal = njeVar.ordinal();
        if (iOrdinal == 0) {
            return findViewById(2131362183);
        }
        if (iOrdinal == 1) {
            return findViewById(2131362186);
        }
        if (iOrdinal == 2) {
            return findViewById(2131362188);
        }
        throw new RuntimeException(null, null);
    }

    @Override // com.opera.android.bar.BottomBar
    public final void i(no3 no3Var) {
        this.v.setVisibility(no3Var.b ? 0 : 8);
        k();
    }

    @Override // defpackage.lp3
    public final int n() {
        return 2131363646;
    }

    @Override // defpackage.lp3, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.u = (DropShadowFrameLayout) findViewById(2131362632);
        this.v = findViewById(2131363646);
    }
}
