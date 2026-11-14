package com.opera.android.downloads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.opera.android.custom_views.ObservableEditText;
import com.opera.android.widget.SideActionsLayout;

/* loaded from: classes.dex */
public class SaveSheet$FilenameEditText extends ObservableEditText {
    public SideActionsLayout v;

    /* JADX WARN: Multi-variable type inference failed */
    public SaveSheet$FilenameEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEllipsize(TextUtils.TruncateAt.MIDDLE);
        setSingleLine();
        setLetterSpacing(0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getFocusedRect(Rect rect) {
        this.v.getDrawingRect(rect);
        ((ViewGroup) this.v.getParent()).offsetRectIntoDescendantCoords(this, rect);
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        return this.v.getGlobalVisibleRect(rect, point);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        this.v.getDrawingRect(rect);
        ((ViewGroup) this.v.getParent()).offsetRectIntoDescendantCoords(this, rect);
        return super/*android.view.View*/.requestRectangleOnScreen(rect, z);
    }
}
