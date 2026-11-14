package org.chromium.components.browser_ui.widget.list_view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ListView;

/* loaded from: classes.dex */
public class AppMenuListView extends ListView {
    public final GestureDetector a;

    public AppMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.a = new GestureDetector(context, (GestureDetector.OnGestureListener) new v35(this, (byte) 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r1.requestFocus() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r3 == (-1)) goto L38;
     */
    @Override // android.widget.ListView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 61
            r2 = 1
            if (r0 != 0) goto L15
            int r0 = r6.getKeyCode()
            if (r0 != r1) goto L15
            boolean r0 = r6.hasNoModifiers()
            if (r0 != 0) goto L27
        L15:
            int r0 = r6.getAction()
            if (r0 != 0) goto L70
            int r0 = r6.getKeyCode()
            if (r0 != r1) goto L70
            boolean r0 = r6.hasModifiers(r2)
            if (r0 == 0) goto L70
        L27:
            android.view.View r0 = r5.getFocusedChild()
            if (r0 == 0) goto L70
            android.view.View r3 = r0.findFocus()
            if (r3 == 0) goto L70
            int r4 = r6.getAction()
            if (r4 != 0) goto L47
            int r4 = r6.getKeyCode()
            if (r4 != r1) goto L47
            boolean r1 = r6.hasModifiers(r2)
            if (r1 == 0) goto L47
            r1 = r2
            goto L48
        L47:
            r1 = 2
        L48:
            android.view.View r1 = r3.focusSearch(r1)
            if (r1 == 0) goto L6f
            if (r1 == r3) goto L70
            int r0 = r5.getPositionForView(r0)
            int r3 = r5.getPositionForView(r1)
            r4 = -1
            if (r0 == r4) goto L70
            if (r3 == r4) goto L6d
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r5) goto L70
            r5.setSelection(r3)
            boolean r0 = r1.requestFocus()
            if (r0 == 0) goto L70
            goto L6f
        L6d:
            if (r3 != r4) goto L70
        L6f:
            return r2
        L70:
            boolean r5 = super.dispatchKeyEvent(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.browser_ui.widget.list_view.AppMenuListView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, null);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
