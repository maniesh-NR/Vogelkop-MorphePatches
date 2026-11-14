package com.opera.android.feed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;
import defpackage.n1f;
import defpackage.ov8;
import defpackage.vs;
import defpackage.wbj;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000¨\u0006\u0001"}, d2 = {"Lcom/opera/android/feed/SoftwareClipMaskableFrameLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SoftwareClipMaskableFrameLayout extends FrameLayout implements vbj {
    public final float a;
    public final RectF b;
    public final Rect c;
    public ge5 d;
    public saj e;
    public final n1f f;
    public Boolean g;
    public View.OnHoverListener h;
    public boolean i;
    public final Path j;

    public SoftwareClipMaskableFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = -1.0f;
        this.b = new RectF();
        this.c = new Rect();
        this.f = Build.VERSION.SDK_INT >= 33 ? new ybj(this) : new wbj(this);
        this.g = null;
        this.i = false;
        k(saj.j(context, attributeSet, 0, 0).i());
        this.j = new Path();
    }

    public final void a(RectF rectF) {
        RectF rectF2 = this.b;
        rectF2.set(rectF);
        n1f n1fVar = this.f;
        n1fVar.c = rectF2;
        n1fVar.o();
        n1fVar.e(this);
        ge5 ge5Var = this.d;
        if (ge5Var != null) {
            View view = (View) ge5Var.b;
            vs vsVar = ((ov8) ge5Var.c).l;
            SoftwareClipMaskableFrameLayout softwareClipMaskableFrameLayout = (SoftwareClipMaskableFrameLayout) view;
            float fL = ov8.m.l(softwareClipMaskableFrameLayout.getContext());
            float fL2 = ov8.n.l(softwareClipMaskableFrameLayout.getContext());
            float fB = 1.0f - (fL != fL2 ? djh.b((rectF2.left - fL) / (fL2 - fL), 0.0f, 1.0f) : 0.0f);
            ((OperaTextView) vsVar.e).setAlpha(fB);
            ((LinearLayout) vsVar.d).setAlpha(fB * 0.75f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n1f n1fVar = this.f;
        Path path = (Path) n1fVar.d;
        if (!n1fVar.m() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            RectF rectF = this.b;
            if (!rectF.isEmpty()) {
                saj sajVar = this.e;
                zw5 zw5Var = sajVar.e;
                zw5 zw5Var2 = sajVar.h;
                zw5 zw5Var3 = sajVar.g;
                zw5 zw5Var4 = sajVar.f;
                float[] fArr = {zw5Var.a(rectF), sajVar.e.a(rectF), zw5Var4.a(rectF), zw5Var4.a(rectF), zw5Var3.a(rectF), zw5Var3.a(rectF), zw5Var2.a(rectF), zw5Var2.a(rectF)};
                Path path = this.j;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                super.draw(canvas);
                canvas.restore();
                return;
            }
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(saj r4) {
        /*
            r3 = this;
            uac r0 = new uac
            r1 = 17
            r0.<init>(r1)
            saj r4 = r4.n(r0)
            r3.e = r4
            n1f r0 = r3.f
            r0.b = r4
            r0.o()
            r0.e(r3)
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            saj r0 = r3.e
            r1 = 0
            if (r4 == 0) goto L2e
            com.google.android.material.focus.FocusRingDrawable r2 = com.google.android.material.focus.FocusRingDrawable.c(r4)
            if (r2 == 0) goto L30
            r4.mutate()
            com.google.android.material.focus.FocusRingDrawable r4 = com.google.android.material.focus.FocusRingDrawable.c(r4)
            goto L31
        L2e:
            android.graphics.drawable.ColorDrawable r4 = com.google.android.material.focus.FocusRingDrawable.p
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L37
            pg9 r4 = r4.o
            r4.t = r0
        L37:
            android.graphics.drawable.Drawable r4 = r3.getForeground()
            saj r3 = r3.e
            if (r4 == 0) goto L4c
            com.google.android.material.focus.FocusRingDrawable r0 = com.google.android.material.focus.FocusRingDrawable.c(r4)
            if (r0 == 0) goto L4c
            r4.mutate()
            com.google.android.material.focus.FocusRingDrawable r1 = com.google.android.material.focus.FocusRingDrawable.c(r4)
        L4c:
            if (r1 == 0) goto L52
            pg9 r4 = r1.o
            r4.t = r3
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.feed.SoftwareClipMaskableFrameLayout.k(saj):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.g;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            n1f n1fVar = this.f;
            if (zBooleanValue != n1fVar.a) {
                n1fVar.a = zBooleanValue;
                n1fVar.e(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n1f n1fVar = this.f;
        this.g = Boolean.valueOf(n1fVar.a);
        if (true != n1fVar.a) {
            n1fVar.a = true;
            n1fVar.e(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.b;
        if (!rectF.isEmpty() && ((action == 9 || action == 10 || action == 7) && !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.i && this.h != null) {
                motionEvent.setAction(10);
                this.h.onHover(this, motionEvent);
            }
            this.i = false;
            return false;
        }
        if (this.h != null) {
            if (!this.i && action == 7) {
                motionEvent.setAction(9);
                this.i = true;
            }
            if (action == 7 || action == 9) {
                this.i = true;
            }
            this.h.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Rect rect = this.c;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        float x = getX();
        RectF rectF = this.b;
        if (x > 0.0f) {
            rect.left = (int) (rect.left + rectF.left);
        }
        if (getY() > 0.0f) {
            rect.top = (int) (rect.top + rectF.top);
        }
        rect.right = Math.round(rectF.width()) + rect.left;
        rect.bottom = Math.round(rectF.height()) + rect.top;
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.a;
        if (f == -1.0f || f == -1.0f) {
            return;
        }
        float fB = ze1.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, f);
        a(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.h = onHoverListener;
    }
}
