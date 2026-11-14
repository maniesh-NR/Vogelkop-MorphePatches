package com.opera.android.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.lp3;
import defpackage.no3;

/* loaded from: classes.dex */
public class BottomTabletOmniBar extends lp3 {
    public View u;
    public View v;

    public BottomTabletOmniBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.opera.android.bar.BottomBar
    public final int c() {
        if (this.u.getVisibility() != 8) {
            return getResources().getDimensionPixelSize(2131165312);
        }
        if (this.v.getVisibility() != 8) {
            return getResources().getDimensionPixelSize(2131165313);
        }
        return 0;
    }

    @Override // com.opera.android.bar.BottomBar
    public final void h() {
        this.u = findViewById(2131364652);
        this.v = findViewById(2131362057);
        super.h();
    }

    @Override // com.opera.android.bar.BottomBar
    public final void i(no3 no3Var) {
        this.v.setVisibility(no3Var.a ? 0 : 8);
        this.u.setVisibility(no3Var.c ? 0 : 8);
        k();
    }

    @Override // defpackage.lp3, com.opera.android.bar.BottomBar
    public final void l(int i) {
        super.l(i);
        View view = this.u;
        if (view != null) {
            view.setTranslationY(this.s.getTranslationY());
        }
    }

    @Override // defpackage.lp3
    public final int n() {
        return 2131362057;
    }
}
