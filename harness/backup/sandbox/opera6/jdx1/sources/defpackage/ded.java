package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class ded extends yq1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(wxe.g0(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (f03.a0(context2.getTheme(), 2130971036, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = ihh.J;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iM = -1;
            for (int i = 0; i < 2 && iM < 0; i++) {
                iM = j14.M(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ihh.I);
                    Context context3 = getContext();
                    int[] iArr3 = {2, 4};
                    int iM2 = -1;
                    for (int i2 = 0; i2 < 2 && iM2 < 0; i2++) {
                        iM2 = j14.M(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM2 >= 0) {
                        xih.s(this, iM2);
                    }
                }
            }
        }
    }

    @Override // defpackage.yq1, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (f03.a0(context.getTheme(), 2130971036, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, ihh.I);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iM = -1;
            for (int i2 = 0; i2 < 2 && iM < 0; i2++) {
                iM = j14.M(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM >= 0) {
                xih.s(this, iM);
            }
        }
    }
}
