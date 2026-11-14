package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ded;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/ui/catalog/widget/OperaTextView;", "Lded;", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaTextView extends ded {
    public CharSequence h;

    public OperaTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.yq1, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            try {
                super.onMeasure(i, i2);
            } catch (IllegalArgumentException unused) {
                CharSequence charSequence = this.h;
                if (charSequence != null) {
                    setText(charSequence);
                }
                super.onMeasure(i, i2);
            }
        } finally {
            this.h = null;
        }
    }

    @Override // defpackage.yq1, android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        if (isPaddingRelative()) {
            super.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), zed.b(getLineSpacingExtra() / 2.0f));
        } else {
            super.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), zed.b(getLineSpacingExtra() / 2.0f));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, zed.b(getLineSpacingExtra() / 2.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, zed.b(getLineSpacingExtra() / 2.0f));
    }
}
