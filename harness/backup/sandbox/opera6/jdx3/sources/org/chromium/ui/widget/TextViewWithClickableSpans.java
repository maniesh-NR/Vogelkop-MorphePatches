package org.chromium.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.PopupMenu;
import defpackage.bp;
import defpackage.qhh;
import defpackage.ykl;
import defpackage.zp2;
import org.chromium.ui.accessibility.AccessibilityState;

/* loaded from: classes.dex */
public class TextViewWithClickableSpans extends TextViewWithLeading implements View.OnLongClickListener {
    public static final /* synthetic */ int l = 0;
    public PopupMenu h;
    public int i;
    public final z39 j;
    public final bp k;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewWithClickableSpans(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.i = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qhh.c);
        Drawable drawableF = sgb.F(2131233219, context);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167533);
        int color = context.getColor(2131100075);
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        int color2 = typedArrayObtainStyledAttributes.getColor(0, theme.resolveAttribute(2130969816, typedValue, true) ? typedValue.data : color);
        if (color2 != color) {
            ((GradientDrawable) drawableF.mutate()).setStroke(getResources().getDimensionPixelSize(2131167532), color2);
        }
        bp bpVar = new bp();
        bpVar.a = dimensionPixelSize;
        bpVar.b = drawableF;
        this.k = bpVar;
        this.j = new z39(this, (byte) 1);
        typedArrayObtainStyledAttributes.recycle();
        setSaveEnabled(false);
        super/*android.view.View*/.setOnLongClickListener(this);
        setOnFocusChangeListener(new zp2(this, (byte) 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ClickableSpan[] clickableSpanArrS = s();
        if (t(clickableSpanArrS)) {
            CharSequence text = getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                canvas.translate(getTotalPaddingLeft(), getTotalPaddingTop());
                ClickableSpan clickableSpan = clickableSpanArrS[this.i];
                Layout layout = getLayout();
                bp bpVar = this.k;
                int i = bpVar.a;
                if (layout == null) {
                    canvas2 = canvas;
                } else {
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    int lineForOffset2 = layout.getLineForOffset(spanEnd);
                    boolean z = layout.getParagraphDirection(lineForOffset) == -1;
                    int primaryHorizontal = (int) (layout.getPrimaryHorizontal(spanStart) - (z ? -i : i));
                    int primaryHorizontal2 = (int) (layout.getPrimaryHorizontal(spanEnd) + (z ? -i : i));
                    canvas2 = canvas;
                    if (lineForOffset == lineForOffset2) {
                        bpVar.q(canvas2, layout, lineForOffset, primaryHorizontal, primaryHorizontal2);
                    } else {
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == -1;
                        bpVar.q(canvas2, layout, lineForOffset, primaryHorizontal, z2 ? ((int) layout.getLineLeft(lineForOffset)) - i : ((int) layout.getLineRight(lineForOffset)) + i);
                        for (int i2 = lineForOffset + 1; i2 < lineForOffset2; i2++) {
                            bpVar.q(canvas2, layout, i2, ((int) layout.getLineLeft(i2)) - i, ((int) layout.getLineRight(i2)) + i);
                        }
                        bpVar.q(canvas2, layout, lineForOffset2, z2 ? ((int) layout.getLineRight(lineForOffset2)) + i : ((int) layout.getLineLeft(lineForOffset2)) - i, primaryHorizontal2);
                    }
                }
                canvas2.translate(-getTotalPaddingLeft(), -getTotalPaddingTop());
                super/*android.view.View*/.onDraw(canvas2);
                return;
            }
        }
        super/*android.view.View*/.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getContentDescription() == null) {
            CharSequence text = getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArrS = s();
                if (clickableSpanArrS != null) {
                    new SpannableStringBuilder(spanned);
                    for (ClickableSpan clickableSpan : clickableSpanArrS) {
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!AccessibilityState.d()) {
            return false;
        }
        u();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r16;
        boolean z;
        CharSequence text = getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = getScrollX() + totalPaddingLeft;
            int scrollY = getScrollY() + totalPaddingTop;
            Layout layout = getLayout();
            if (layout == null) {
                z = false;
            } else {
                int lineForVertical = layout.getLineForVertical(scrollY);
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
                if (((ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length > 0) {
                    z = true;
                } else {
                    int lineStart = layout.getLineStart(lineForVertical);
                    int lineEnd = layout.getLineEnd(lineForVertical);
                    boolean z2 = layout.getParagraphDirection(lineForVertical) == -1;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(lineStart, lineEnd, ClickableSpan.class);
                    int length = clickableSpanArr.length;
                    int i = 0;
                    while (i < length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i];
                        int spanStart = spanned.getSpanStart(clickableSpan);
                        int spanEnd = spanned.getSpanEnd(clickableSpan);
                        float lineRight = spanStart < lineStart ? z2 ? layout.getLineRight(lineForVertical) : layout.getLineLeft(lineForVertical) : layout.getPrimaryHorizontal(spanStart);
                        float lineLeft = spanEnd >= lineEnd ? z2 ? layout.getLineLeft(lineForVertical) : layout.getLineRight(lineForVertical) : layout.getPrimaryHorizontal(spanEnd);
                        double d = scrollX;
                        r16 = 0;
                        Layout layout2 = layout;
                        if (d >= Math.floor(Math.min(lineRight, lineLeft)) && d <= Math.ceil(Math.max(lineRight, lineLeft))) {
                            z = true;
                            break;
                        }
                        i++;
                        layout = layout2;
                    }
                    r16 = 0;
                    z = false;
                }
            }
            r16 = 0;
        } else {
            r16 = 0;
            z = false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (z) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1 || !AccessibilityState.d()) {
            return r16;
        }
        ClickableSpan[] clickableSpanArrS = s();
        if (clickableSpanArrS != null && clickableSpanArrS.length != 0) {
            if (clickableSpanArrS.length == 1) {
                clickableSpanArrS[r16].onClick(this);
            } else {
                u();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super/*android.view.View*/.performAccessibilityAction(i, bundle);
        }
        ClickableSpan[] clickableSpanArrS = s();
        if (clickableSpanArrS != null && clickableSpanArrS.length != 0) {
            if (clickableSpanArrS.length == 1) {
                clickableSpanArrS[0].onClick(this);
            } else {
                u();
            }
        }
        return true;
    }

    public final ClickableSpan[] s() {
        CharSequence text = getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) text;
        return (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
    }

    public final boolean t(ClickableSpan[] clickableSpanArr) {
        int i;
        return clickableSpanArr != null && clickableSpanArr.length > 0 && (i = this.i) >= 0 && i < clickableSpanArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        ClickableSpan[] clickableSpanArrS = s();
        if (clickableSpanArrS == null || clickableSpanArrS.length == 0 || this.h != null) {
            return;
        }
        Spanned spanned = (Spanned) getText();
        PopupMenu popupMenu = new PopupMenu(getContext(), this);
        this.h = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (ClickableSpan clickableSpan : clickableSpanArrS) {
            menu.add(spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan))).setOnMenuItemClickListener(new jsk(this, clickableSpan, (byte) 2));
        }
        this.h.setOnDismissListener(new ykl(this));
        this.h.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v(int i) {
        ClickableSpan[] clickableSpanArrS = s();
        ClickableSpan clickableSpan = t(clickableSpanArrS) ? clickableSpanArrS[this.i] : null;
        this.i = i;
        if (t(clickableSpanArrS)) {
            ClickableSpan clickableSpan2 = clickableSpanArrS[this.i];
            setOnKeyListener(this.j);
            invalidate();
            return true;
        }
        this.i = -1;
        if (clickableSpan == null) {
            return false;
        }
        setOnKeyListener(null);
        invalidate();
        return false;
    }
}
