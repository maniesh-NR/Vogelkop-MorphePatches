package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/ui/catalog/widget/OperaRadioButton;", "Lwdd;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaRadioButton extends wdd {
    public OperaRadioButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        CharSequence text = getText();
        if (text != null && text.length() != 0) {
            super/*android.view.View*/.onDraw(canvas);
            return;
        }
        Drawable buttonDrawable = getButtonDrawable();
        if (buttonDrawable != null) {
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
            int iSave = canvas.save();
            canvas.translate(width, 0.0f);
            super/*android.view.View*/.onDraw(canvas);
            canvas.restoreToCount(iSave);
            Drawable background = getBackground();
            if (background == null) {
                return;
            }
            Rect bounds = buttonDrawable.getBounds();
            background.setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }
}
