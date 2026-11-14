package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class fan {
    public static final Rect a = new Rect();
    public static final RectF b = new RectF();

    public static int a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public static View b(ViewGroup viewGroup, ViewGroup viewGroup2, int i, int i2) {
        View viewB;
        for (int childCount = viewGroup2.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup2.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                if ((childAt instanceof ViewGroup) && ((viewB = b(viewGroup, (ViewGroup) childAt, i, i2)) != null || !childAt.isClickable())) {
                    childAt = viewB;
                }
                if (childAt != null && childAt.isClickable() && childAt.isEnabled() && c(viewGroup, childAt, i, i2)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static boolean c(ViewGroup viewGroup, View view, int i, int i2) {
        Rect rect = a;
        synchronized (rect) {
            if (!view.getLocalVisibleRect(rect)) {
                return false;
            }
            if (!view.getMatrix().isIdentity()) {
                RectF rectF = b;
                rectF.set(rect);
                view.getMatrix().mapRect(rectF);
                rectF.round(rect);
            }
            rect.offset(view.getLeft(), view.getTop());
            viewGroup.offsetDescendantRectToMyCoords((View) view.getParent(), rect);
            return rect.contains(i, i2);
        }
    }
}
