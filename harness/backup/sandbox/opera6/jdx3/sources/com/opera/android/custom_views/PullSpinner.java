package com.opera.android.custom_views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.ix5;
import defpackage.khh;
import defpackage.z9h;

/* loaded from: classes.dex */
public class PullSpinner extends View implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int u = 0;
    public int a;
    public final float b;
    public final float c;
    public final boolean d;
    public final z9h e;
    public final float f;
    public final int g;
    public float h;
    public float i;
    public final float j;
    public final float k;
    public float l;
    public long m;
    public ValueAnimator n;
    public boolean o;
    public int p;
    public int q;
    public ValueAnimator r;
    public final ix5 s;
    public int t;

    public PullSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0.0625f;
        this.c = 0.525f;
        this.d = true;
        z9h z9hVar = new z9h();
        this.e = z9hVar;
        this.f = 0.75f;
        this.k = 0.5f;
        this.s = new ix5((byte) 26);
        this.g = getResources().getDimensionPixelSize(2131167373);
        getContext().getColor(2131103616);
        z9hVar.c = getContext().getColor(2131103615);
        getContext().getColor(2131103619);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.B);
            z9hVar.b = typedArrayObtainStyledAttributes.getColor(8, z9hVar.b);
            z9hVar.a = typedArrayObtainStyledAttributes.getColor(4, z9hVar.a);
            z9hVar.c = typedArrayObtainStyledAttributes.getColor(1, z9hVar.c);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, this.g);
            this.j = typedArrayObtainStyledAttributes.getFloat(0, this.j);
            this.f = typedArrayObtainStyledAttributes.getFloat(6, this.f);
            this.k = typedArrayObtainStyledAttributes.getFloat(7, this.k);
            this.d = typedArrayObtainStyledAttributes.getBoolean(9, this.d);
            this.b = typedArrayObtainStyledAttributes.getFloat(3, this.b);
            this.c = typedArrayObtainStyledAttributes.getFloat(2, this.c);
            typedArrayObtainStyledAttributes.recycle();
        }
        setVisibility(4);
        setWillNotDraw(false);
        this.h = 0.0f;
    }

    public final void a(float f) {
        if (this.a == 0 && this.t != 3) {
            f = 0.0f;
        }
        if (this.h != f) {
            this.h = f;
            if (f <= 0.0f) {
                setVisibility(4);
            } else {
                setVisibility(0);
                invalidate();
            }
            if (this.t == 1) {
                int i = this.a;
                if (i == 5 || i == 4) {
                    setAlpha(Math.min(1.0f, this.h));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r7) {
        /*
            r6 = this;
            int r0 = r6.a
            r1 = 2
            r2 = 5
            r3 = 4
            if (r0 == r3) goto Ld
            if (r0 == r2) goto Lb
            r4 = r0
            goto Le
        Lb:
            r4 = r1
            goto Le
        Ld:
            r4 = 0
        Le:
            r5 = 3
            if (r4 != r1) goto L13
            if (r7 != r5) goto L21
        L13:
            if (r0 == r7) goto L21
            if (r7 == 0) goto L1e
            if (r7 == r1) goto L1c
            if (r7 == r5) goto L1e
            goto L1f
        L1c:
            r7 = r2
            goto L1f
        L1e:
            r7 = r3
        L1f:
            if (r0 != r7) goto L22
        L21:
            return
        L22:
            r6.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.PullSpinner.b(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.custom_views.PullSpinner.c(int):void");
    }

    public final void d() {
        this.t = 3;
        setAlpha(1.0f);
        a(1.0f);
        setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.r == null && this.n == null) {
            return;
        }
        this.r = null;
        this.n = null;
        int i = this.a;
        if (i == 4) {
            i = 0;
        } else if (i == 5) {
            i = 2;
        }
        c(i);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.t == 3) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.t == 1) {
            a(fFloatValue);
            return;
        }
        this.q = (int) fFloatValue;
        int i = (int) (this.q * 0.0f);
        float f = i - this.p;
        z9h z9hVar = this.e;
        z9hVar.f.offset(0.0f, f);
        z9hVar.g.offset(0.0f, f);
        invalidate();
        this.p = i;
        a(0.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getVisibility() == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.m;
            this.m = jCurrentAnimationTimeMillis;
            boolean z = this.o;
            z9h z9hVar = this.e;
            if (z) {
                float f = (float) (((((0.18f * r2) * 360.0f) / 1000.0f) + this.i) % 360.0d);
                this.i = f;
                float f2 = (((j * 0.72f) / 1000.0f) + this.l) % 1.0f;
                this.l = f2;
                z9hVar.c(canvas, f, f2);
                ValueAnimator valueAnimator = this.n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    z9hVar.a(canvas, this.i, ((Float) this.n.getAnimatedValue()).floatValue());
                }
                invalidate();
                return;
            }
            float f3 = this.h;
            this.i = (120.0f * f3) + 240.0f + this.j;
            int iMax = (int) (Math.max(0.5f, (Math.min(1.0f, f3) - 0.75f) * 4.0f) * 255.0f);
            float f4 = this.i;
            float fMin = Math.min(1.0f, this.h);
            int iSaveLayerAlpha = iMax < 255 ? canvas.saveLayerAlpha(z9hVar.f, iMax, 31) : 0;
            Paint paint = z9hVar.h;
            int i = z9hVar.a;
            if (i != 0) {
                paint.setColor(i);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawOval(z9hVar.g, paint);
            }
            z9hVar.d(canvas);
            z9hVar.b(canvas, (float) (((360.0f + f4) - r6) % 360.0d), this.f * 360.0f);
            if (this.d) {
                z9hVar.a(canvas, f4, fMin);
            }
            if (iSaveLayerAlpha >= 1) {
                canvas.restoreToCount(iSaveLayerAlpha);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int width = getWidth() - paddingRight;
        int height = getHeight() - paddingBottom;
        int iD = z1m.d(width, this.g, 2, getPaddingLeft());
        if (this.t == 3) {
            paddingTop = z1m.d(height, this.g, 2, getPaddingTop());
        } else {
            paddingTop = getPaddingTop() + this.p;
        }
        float f = this.g;
        this.e.e(iD, paddingTop, iD + r11, paddingTop + r11, f, this.b * f, this.c);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.g;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                paddingRight = Math.min(View.MeasureSpec.getSize(i), paddingRight);
            }
            i = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.g;
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                paddingBottom = Math.min(View.MeasureSpec.getSize(i2), paddingBottom);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
