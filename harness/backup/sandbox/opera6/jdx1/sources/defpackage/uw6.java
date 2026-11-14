package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class uw6 extends View {
    public final byte A;
    public final long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final bl6 w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    public uw6(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, yhh.b, 0, 2132083187);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.k = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.n = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                iA4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.p = iA4;
                iA5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.q = iA5;
                iA6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                this.r = iA6;
                int i = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i4 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i5 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i6 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.l = iA;
            this.m = iA2;
            this.n = 0;
            this.o = iA3;
            this.p = iA4;
            this.q = iA5;
            this.r = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new bl6(this, (byte) 12);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(iA5, Math.max(iA4, iA6)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new nl2(this, (byte) 3));
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = (byte) 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    public final long b() {
        long j = this.B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.A;
    }

    public final long c() {
        if (this.b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (this.d.width() * this.J) / r0.width();
    }

    public final boolean d(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long j4 = tym.j(j3 + j, 0L, j2);
        if (j4 == j3) {
            return false;
        }
        if (this.H) {
            h(j4);
        } else {
            e(j4);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            uig uigVar = ((oig) it.next()).a;
            uigVar.s0 = true;
            TextView textView = uigVar.I;
            if (textView != null) {
                textView.setText(tym.C(uigVar.K, uigVar.L, j));
            }
            uigVar.a.e();
            gig gigVar = uigVar.o0;
            if (gigVar != null && uigVar.u0) {
                if (uigVar.f(gigVar)) {
                    try {
                        Method method = uigVar.e;
                        method.getClass();
                        method.invoke(uigVar.o0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        rqd.p(e);
                        return;
                    }
                } else if (uigVar.e(uigVar.o0)) {
                    try {
                        Method method2 = uigVar.h;
                        method2.getClass();
                        method2.invoke(uigVar.o0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        rqd.p(e2);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    gig gigVar2 = uigVar.o0;
                    gigVar2.getClass();
                    sb.append(gigVar2.getClass());
                    w7d.K(sb.toString());
                }
            }
            if (uigVar.h(uigVar.o0)) {
                uigVar.j(uigVar.o0, j);
            }
        }
    }

    public final void f(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            oig oigVar = (oig) it.next();
            long j = this.I;
            uig uigVar = oigVar.a;
            uigVar.s0 = false;
            gig gigVar = uigVar.o0;
            if (gigVar != null) {
                if (!z) {
                    uigVar.j(gigVar, j);
                }
                if (uigVar.f(uigVar.o0)) {
                    try {
                        Method method = uigVar.e;
                        method.getClass();
                        method.invoke(uigVar.o0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        rqd.p(e);
                        return;
                    }
                } else if (uigVar.e(uigVar.o0)) {
                    try {
                        Method method2 = uigVar.h;
                        method2.getClass();
                        method2.invoke(uigVar.o0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        rqd.p(e2);
                        return;
                    }
                } else {
                    continue;
                }
            }
            uigVar.a.f();
        }
    }

    public final void g() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.L) / this.J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.J)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    public final void h(long j) {
        if (this.I != j) {
            this.I = j;
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                uig uigVar = ((oig) it.next()).a;
                TextView textView = uigVar.I;
                if (textView != null) {
                    textView.setText(tym.C(uigVar.K, uigVar.L, j));
                }
                if (uigVar.h(uigVar.o0)) {
                    uigVar.j(uigVar.o0, j);
                }
            }
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.J;
        Paint paint = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.c;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.e);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                jArr.getClass();
                boolean[] zArr = this.O;
                zArr.getClass();
                int i5 = this.o;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.M) {
                    int i9 = i8;
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * tym.j(jArr[i8], 0L, this.J)) / this.J)) - i6)) + rect.left, iCenterY, r3 + i5, i, zArr[i8] ? this.i : this.h);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.J > 0) {
            int i10 = tym.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas2.drawCircle(i10, iCenterY2, (int) ((((this.H || isFocused()) ? this.r : isEnabled() ? this.p : this.q) * this.F) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(i10 - intrinsicWidth, iCenterY2 - intrinsicHeight, i10 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onFocusChanged(z, i, rect);
        if (!this.H || z) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(tym.C(this.u, this.v, this.K));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(tym.C(this.u, this.v, this.K));
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.b()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.d(r0)
            if (r0 == 0) goto L2e
            bl6 r5 = r4.w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.H
            if (r0 == 0) goto L2e
            r5 = 0
            r4.f(r5)
            return r3
        L2e:
            boolean r4 = super.onKeyDown(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw6.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.G ? 0 : this.s;
        int i8 = this.n;
        int i9 = this.l;
        int i10 = this.m;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect = this.a;
        rect.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.b.set(rect.left + i7, paddingBottom2, rect.right - i7, i9 + paddingBottom2);
        Rect rect2 = this.D;
        if (rect2 == null || rect2.width() != i5 || this.D.height() != i6) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La0
            long r2 = r9.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto La0
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.y
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.b
            android.graphics.Rect r5 = r9.d
            r6 = 1
            if (r3 == 0) goto L7c
            r7 = 3
            if (r3 == r6) goto L6d
            r8 = 2
            if (r3 == r8) goto L36
            if (r3 == r7) goto L6d
            goto La0
        L36:
            boolean r10 = r9.H
            if (r10 == 0) goto La0
            int r10 = r9.t
            if (r2 >= r10) goto L51
            int r10 = r9.C
            int r10 = defpackage.z1m.d(r0, r10, r7, r10)
            float r10 = (float) r10
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.tym.i(r10, r0, r1)
            r5.right = r10
            goto L5f
        L51:
            r9.C = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.tym.i(r10, r0, r1)
            r5.right = r10
        L5f:
            long r0 = r9.c()
            r9.h(r0)
            r9.g()
            r9.invalidate()
            return r6
        L6d:
            boolean r0 = r9.H
            if (r0 == 0) goto La0
            int r10 = r10.getAction()
            if (r10 != r7) goto L78
            r1 = r6
        L78:
            r9.f(r1)
            return r6
        L7c:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La0
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.tym.i(r10, r0, r1)
            r5.right = r10
            long r0 = r9.c()
            r9.e(r0)
            r9.g()
            r9.invalidate()
            return r6
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (d(-b())) {
                f(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (d(b())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        f(true);
    }
}
