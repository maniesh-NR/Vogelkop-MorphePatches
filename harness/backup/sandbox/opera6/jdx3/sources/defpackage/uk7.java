package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class uk7 {
    public static final Rect e = new Rect();
    public static final Point f = new Point();
    public final TextView a;
    public mgf b;
    public Drawable c;
    public int d;

    public uk7(TextView textView) {
        this.a = textView;
    }

    public final boolean a(MotionEvent motionEvent, Drawable drawable, int i) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        TextView textView = this.a;
        int compoundDrawablePadding = textView.getCompoundDrawablePadding();
        Rect bounds = drawable.getBounds();
        Rect rect = e;
        rect.set(bounds);
        Point point = f;
        point.x = 0;
        point.y = 0;
        int compoundPaddingLeft = textView.getCompoundPaddingLeft();
        int compoundPaddingTop = textView.getCompoundPaddingTop();
        int compoundPaddingRight = textView.getCompoundPaddingRight();
        int compoundPaddingBottom = textView.getCompoundPaddingBottom();
        int right = textView.getRight();
        int left = textView.getLeft();
        int bottom = textView.getBottom() - textView.getTop();
        int i2 = (bottom - compoundPaddingBottom) - compoundPaddingTop;
        int i3 = right - left;
        int i4 = (i3 - compoundPaddingRight) - compoundPaddingLeft;
        int iA = vep.A(i);
        if (iA == 0) {
            point.x = textView.getPaddingLeft();
            point.y = ((i2 - rect.height()) / 2) + compoundPaddingTop;
        } else if (iA == 1) {
            point.x = ((i4 - rect.width()) / 2) + compoundPaddingLeft;
            point.y = textView.getPaddingTop();
        } else if (iA == 2) {
            point.x = (i3 - textView.getPaddingRight()) - rect.width();
            point.y = ((i2 - rect.height()) / 2) + compoundPaddingTop;
        } else if (iA == 3) {
            point.x = ((i4 - rect.width()) / 2) + compoundPaddingLeft;
            point.y = (bottom - textView.getPaddingBottom()) - rect.height();
        }
        rect.offset(point.x, point.y);
        int i5 = -compoundDrawablePadding;
        rect.inset(i5, i5);
        if (rect.contains(x, y)) {
            this.c = drawable;
            this.d = i;
            return true;
        }
        this.c = null;
        this.d = 0;
        return false;
    }
}
