package org.chromium.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.qhh;

/* loaded from: classes.dex */
public class TextViewWithLeading extends yq1 {
    /* JADX WARN: Multi-variable type inference failed */
    public TextViewWithLeading(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        Float fValueOf;
        int resourceId;
        super(context, attributeSet);
        if (attributeSet != null) {
            int[] iArr = qhh.d;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
            } else if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
                fValueOf = null;
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
                Float fValueOf2 = typedArrayObtainStyledAttributes2.hasValue(1) ? Float.valueOf(typedArrayObtainStyledAttributes2.getDimension(1, 0.0f)) : null;
                typedArrayObtainStyledAttributes2.recycle();
                fValueOf = fValueOf2;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iim.a.a()) {
                setLineSpacing(fValueOf.floatValue() - getPaint().getFontMetrics(null), 1.0f);
            } else if (fValueOf != null) {
                setLineSpacing(fValueOf.floatValue() - getPaint().getFontMetrics(null), 1.0f);
            }
        }
    }
}
