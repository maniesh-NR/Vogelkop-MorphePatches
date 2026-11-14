package com.opera.android.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.atj;
import defpackage.lp3;
import defpackage.nje;
import defpackage.no3;
import defpackage.q9n;

/* loaded from: classes.dex */
public class BottomCompactPhoneOmniBar extends lp3 {
    public View u;
    public View v;

    public BottomCompactPhoneOmniBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.opera.android.bar.BottomBar
    public final int c() {
        int dimensionPixelSize = this.v.getVisibility() != 8 ? getResources().getDimensionPixelSize(2131165340) : 0;
        return this.u.getVisibility() != 8 ? getResources().getDimensionPixelSize(2131165344) + dimensionPixelSize : dimensionPixelSize;
    }

    @Override // com.opera.android.bar.BottomBar
    public final View e(nje njeVar) {
        View viewFindViewById;
        int iOrdinal = njeVar.ordinal();
        if (iOrdinal == 0) {
            viewFindViewById = findViewById(2131362183);
        } else if (iOrdinal == 1) {
            viewFindViewById = findViewById(2131362186);
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            viewFindViewById = findViewById(2131362188);
        }
        if (viewFindViewById == null || !q9n.x(viewFindViewById)) {
            return null;
        }
        return viewFindViewById;
    }

    @Override // defpackage.lp3, com.opera.android.bar.BottomBar
    public final void g() {
        super.g();
        atj.a(this.u);
    }

    @Override // com.opera.android.bar.BottomBar
    public final void i(no3 no3Var) {
        this.v.setVisibility(no3Var.a ? 0 : 8);
        this.u.setVisibility(no3Var.b ? 0 : 8);
        k();
    }

    @Override // defpackage.lp3, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.u = findViewById(2131363646);
        this.v = findViewById(2131362057);
    }
}
