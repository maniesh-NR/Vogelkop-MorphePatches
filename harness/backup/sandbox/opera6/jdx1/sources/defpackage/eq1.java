package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class eq1 extends PopupWindow {
    public eq1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ghf ghfVarH = ghf.H(i, i2, context, attributeSet, zhh.t);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        if (typedArray.hasValue(2)) {
            setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(ghfVarH.t(0));
        ghfVarH.J();
    }
}
