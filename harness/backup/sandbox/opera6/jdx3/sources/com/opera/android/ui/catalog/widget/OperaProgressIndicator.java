package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.ov0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/ui/catalog/widget/OperaProgressIndicator;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaProgressIndicator extends ConstraintLayout {
    public final ov0 p;

    /* JADX WARN: Multi-variable type inference failed */
    public OperaProgressIndicator(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2131559192, (ViewGroup) this);
        this.p = ov0.g(this);
        setBackgroundResource(2131233199);
        setBackgroundTintList(j7h.l(2130969330, context));
    }

    public final void r(float f) {
        Guideline guideline = (Guideline) this.p.d;
        jo5 layoutParams = guideline.getLayoutParams();
        if (guideline.a && layoutParams.c == f) {
            return;
        }
        layoutParams.c = f;
        guideline.setLayoutParams(layoutParams);
    }
}
