package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import defpackage.ded;
import defpackage.er1;
import defpackage.fq1;
import defpackage.gp1;
import defpackage.jp1;
import defpackage.lp1;
import defpackage.wdd;
import defpackage.yq1;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends er1 {
    @Override // defpackage.er1
    public final gp1 a(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // defpackage.er1
    public final jp1 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.er1
    public final lp1 c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // defpackage.er1
    public final fq1 d(Context context, AttributeSet attributeSet) {
        return new wdd(context, attributeSet);
    }

    @Override // defpackage.er1
    public final yq1 e(Context context, AttributeSet attributeSet) {
        return new ded(context, attributeSet);
    }
}
