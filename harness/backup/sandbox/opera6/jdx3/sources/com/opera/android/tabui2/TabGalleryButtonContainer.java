package com.opera.android.tabui2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;

/* loaded from: classes.dex */
public class TabGalleryButtonContainer extends MaxWidthLinearLayout {
    public final Rect d;
    public final Rect e;
    public float f;
    public final Paint g;

    public TabGalleryButtonContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxWidth});
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = new Rect();
        this.e = new Rect();
        Paint paint = new Paint(1);
        this.g = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(getResources().getDimensionPixelSize(2131167646) << 1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void f(TextView textView, Rect rect) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            rect.setEmpty();
            return;
        }
        float width = (textView.getWidth() / 2.0f) + textView.getLeft();
        float lineWidth = layout.getLineWidth(0) / 2.0f;
        rect.set((int) Math.floor(width - lineWidth), textView.getTop(), (int) Math.ceil(width + lineWidth), textView.getBottom());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f;
        int i = (int) f;
        float f2 = f - i;
        TextView textView = (TextView) getChildAt(i);
        TextView textView2 = (TextView) getChildAt(Math.min(i + 1, getChildCount() - 1));
        Rect rect = this.d;
        f(textView, rect);
        Rect rect2 = this.e;
        f(textView2, rect2);
        if (rect.isEmpty() || rect2.isEmpty()) {
            return;
        }
        int iRound = Math.round(((rect2.left - r1) * f2) + rect.left);
        int iRound2 = Math.round(((rect2.right - r4) * f2) + rect.right);
        float fRound = Math.round(((rect2.bottom - r3) * f2) + rect.bottom);
        canvas.drawLine(iRound, fRound, iRound2, fRound, this.g);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            getChildAt(0).setSelected(true);
        }
    }
}
