package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class wi7 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static boolean a(View view, View view2, int i, int i2) {
        if (view2.getParent() != null && view.getParent() != null) {
            View view3 = (View) view2.getParent();
            int[] iArr = a;
            view3.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            ((View) view.getParent()).getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            boolean z = view instanceof fr8;
            Rect rect = b;
            if (z) {
                ((fr8) view).i(rect);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            int iCenterX = rect.centerX() + i;
            int iCenterY = rect.centerY() + i2;
            int i7 = iCenterX + i5;
            int i8 = iCenterY + i6;
            if (fan.c((ViewGroup) view2.getParent(), view2, i7 - i3, i8 - i4)) {
                if (view2 instanceof fr8) {
                    ((fr8) view2).i(rect);
                } else {
                    rect.set(0, 0, view2.getWidth(), view2.getHeight());
                }
                view2.getLocationOnScreen(iArr);
                rect.offset(iArr[0], iArr[1]);
                return rect.contains(i7, i8);
            }
        }
        return false;
    }
}
