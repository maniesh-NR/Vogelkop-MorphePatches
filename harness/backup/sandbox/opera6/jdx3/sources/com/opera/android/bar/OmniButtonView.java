package com.opera.android.bar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.opera.android.bar.OmniButtonView;
import defpackage.bp;
import defpackage.df1;
import defpackage.fan;
import defpackage.kc;
import defpackage.kce;
import defpackage.lf1;
import defpackage.taf;
import defpackage.uaf;
import defpackage.wub;
import defpackage.yaf;

/* loaded from: classes.dex */
public class OmniButtonView extends View {
    public static final /* synthetic */ int m = 0;
    public final Paint a;
    public int b;
    public final int c;
    public final int d;
    public bp e;
    public bp f;
    public bp g;
    public ValueAnimator h;
    public ValueAnimator i;
    public bp j;
    public boolean k;
    public wub l;

    public OmniButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(true);
        setClickable(true);
        this.a = new Paint();
        setWillNotDraw(false);
        this.c = fan.a(14.0f, getResources());
        this.d = fan.a(1.0f, getResources());
    }

    public final void a(Canvas canvas, bp bpVar, ValueAnimator valueAnimator) {
        LayerDrawable layerDrawable;
        if (bpVar == null || (layerDrawable = ((uaf) bpVar.b).f) == null) {
            return;
        }
        float fMin = Math.min(1.0f, Math.min(getWidth() / layerDrawable.getIntrinsicWidth(), getHeight() / layerDrawable.getIntrinsicHeight()));
        int intrinsicWidth = (int) (layerDrawable.getIntrinsicWidth() * fMin);
        int intrinsicHeight = (int) (layerDrawable.getIntrinsicHeight() * fMin);
        int width = (getWidth() - intrinsicWidth) / 2;
        int height = (getHeight() - intrinsicHeight) / 2;
        int iSave = canvas.save();
        float fFloatValue = (valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 1.0f) * fMin;
        canvas.scale(fFloatValue, fFloatValue, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.translate(width, height);
        layerDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        layerDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final void b(bp bpVar) {
        kce kceVar;
        kce kceVar2;
        bp bpVar2 = this.e;
        if (bpVar2 != null && (kceVar2 = ((uaf) bpVar2.b).g) != null) {
            kceVar2.b.remove(this);
            kceVar2.a();
        }
        this.e = bpVar;
        if (bpVar == null || (kceVar = ((uaf) bpVar.b).g) == null) {
            return;
        }
        kceVar.b.add(this);
        kceVar.a();
    }

    public final void c(wub wubVar) {
        this.l = wubVar;
        yaf yafVar = new yaf(this, wubVar);
        super.setOnClickListener(yafVar);
        super.setOnLongClickListener(yafVar);
    }

    public final void d(bp bpVar) {
        kce kceVar;
        kce kceVar2;
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.i = null;
        }
        bp bpVar2 = this.g;
        if (bpVar2 != null && (kceVar2 = ((uaf) bpVar2.b).g) != null) {
            kceVar2.b.remove(this);
            kceVar2.a();
        }
        this.g = bpVar;
        setFocusable((bpVar.a & 2) == 0 && this.l != null);
        bp bpVar3 = this.g;
        if (bpVar3 != null && (kceVar = ((uaf) bpVar3.b).g) != null) {
            kceVar.b.add(this);
            kceVar.a();
        }
        e(null);
        b(null);
        int i = ((uaf) this.g.b).b;
        setContentDescription(i != 0 ? getResources().getString(i) : null);
        uaf uafVar = (uaf) this.g.b;
        int i2 = uafVar.c;
        n1h.o(this, i2 != 0 ? getResources().getString(i2) : null, uafVar.d);
        setVisibility(((uaf) this.g.b).a == taf.O ? 4 : 0);
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bp bpVar = this.g;
        if (bpVar == null || (bpVar.a & 2) == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void e(bp bpVar) {
        kce kceVar;
        kce kceVar2;
        bp bpVar2 = this.f;
        if (bpVar2 != null && (kceVar2 = ((uaf) bpVar2.b).g) != null) {
            kceVar2.b.remove(this);
            kceVar2.a();
        }
        this.f = bpVar;
        if (bpVar == null || (kceVar = ((uaf) bpVar.b).g) == null) {
            return;
        }
        kceVar.b.add(this);
        kceVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(bp bpVar, boolean z) {
        if (!z) {
            if (this.h == null) {
                d(bpVar);
                return;
            } else {
                b(null);
                e(bpVar);
                return;
            }
        }
        bp bpVar2 = this.f;
        if (bpVar2 != null && ((uaf) bpVar2.b).a == ((uaf) bpVar.b).a) {
            this.f = bpVar;
            return;
        }
        bp bpVar3 = this.g;
        boolean z2 = false;
        z2 = false;
        final byte b = 1;
        if (bpVar3 != null && ((uaf) bpVar3.b).a == ((uaf) bpVar.b).a && bpVar2 == null) {
            this.g = bpVar;
            if ((bpVar.a & 2) == 0 && this.l != null) {
                z2 = true;
            }
            setFocusable(z2);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        Object[] objArr = valueAnimator != null && valueAnimator.getAnimatedFraction() > 0.0f;
        Object[] objArr2 = this.i != null;
        if (objArr == true) {
            b(bpVar);
            return;
        }
        e(bpVar);
        if (objArr2 == true) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(100L);
        this.i = duration;
        LinearInterpolator linearInterpolator = lf1.f;
        duration.setInterpolator(linearInterpolator);
        ValueAnimator valueAnimator2 = this.i;
        final byte b2 = z2 ? (byte) 1 : (byte) 0;
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xaf
            public final /* synthetic */ OmniButtonView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b3 = b2;
                OmniButtonView omniButtonView = this.b;
                switch (b3) {
                    case 0:
                        int i = OmniButtonView.m;
                        omniButtonView.invalidate();
                        break;
                    default:
                        int i2 = OmniButtonView.m;
                        omniButtonView.invalidate();
                        break;
                }
            }
        });
        this.i.addListener(new kc(this));
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        this.h = duration2;
        duration2.setInterpolator(linearInterpolator);
        this.h.setStartDelay(50L);
        this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xaf
            public final /* synthetic */ OmniButtonView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b3 = b;
                OmniButtonView omniButtonView = this.b;
                switch (b3) {
                    case 0:
                        int i = OmniButtonView.m;
                        omniButtonView.invalidate();
                        break;
                    default:
                        int i2 = OmniButtonView.m;
                        omniButtonView.invalidate();
                        break;
                }
            }
        });
        this.h.addListener(new df1(this));
        this.i.start();
        this.h.start();
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2;
        LayerDrawable layerDrawable3;
        super.jumpDrawablesToCurrentState();
        bp bpVar = this.g;
        if (bpVar != null && (layerDrawable3 = ((uaf) bpVar.b).f) != null) {
            layerDrawable3.jumpToCurrentState();
        }
        bp bpVar2 = this.e;
        if (bpVar2 != null && (layerDrawable2 = ((uaf) bpVar2.b).f) != null) {
            layerDrawable2.jumpToCurrentState();
        }
        bp bpVar3 = this.f;
        if (bpVar3 == null || (layerDrawable = ((uaf) bpVar3.b).f) == null) {
            return;
        }
        layerDrawable.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = getLayoutParams().width;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ColorStateList colorStateList;
        super.onDraw(canvas);
        a(canvas, this.g, this.i);
        a(canvas, this.f, this.h);
        bp bpVar = this.g;
        int width = 0;
        boolean z = bpVar != null && ((uaf) bpVar.b).m;
        bp bpVar2 = this.f;
        boolean z2 = bpVar2 != null && ((uaf) bpVar2.b).m;
        if (z) {
            if (z2) {
                colorStateList = ((uaf) bpVar.b).n;
            } else {
                ValueAnimator valueAnimator = this.i;
                fFloatValue = valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 1.0f;
                colorStateList = ((uaf) this.g.b).n;
            }
        } else {
            if (!z2) {
                return;
            }
            ValueAnimator valueAnimator2 = this.h;
            fFloatValue = valueAnimator2 != null ? ((Float) valueAnimator2.getAnimatedValue()).floatValue() : 1.0f;
            colorStateList = ((uaf) this.f.b).n;
        }
        int iA0 = p37.a0(fFloatValue, colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        Paint paint = this.a;
        paint.setColor(iA0);
        boolean zW = cs5.W(this);
        int width2 = this.d;
        if (!zW) {
            width = getWidth() - width2;
            width2 = getWidth();
        }
        canvas.drawRect(width, this.c, width2, getHeight() - r0, paint);
    }

    @Override // android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon pointerIconOnResolvePointerIcon = super.onResolvePointerIcon(motionEvent, i);
        return (pointerIconOnResolvePointerIcon == null && isClickable() && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : pointerIconOnResolvePointerIcon;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        kce kceVar;
        kce kceVar2;
        kce kceVar3;
        super.onVisibilityAggregated(z);
        this.k = z;
        bp bpVar = this.g;
        if (bpVar != null && (kceVar3 = ((uaf) bpVar.b).g) != null) {
            kceVar3.a();
        }
        bp bpVar2 = this.f;
        if (bpVar2 != null && (kceVar2 = ((uaf) bpVar2.b).g) != null) {
            kceVar2.a();
        }
        bp bpVar3 = this.e;
        if (bpVar3 == null || (kceVar = ((uaf) bpVar3.b).g) == null) {
            return;
        }
        kceVar.a();
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        bp bpVar = this.g;
        if (bpVar != null && ((uaf) bpVar.b).f == drawable) {
            return true;
        }
        bp bpVar2 = this.f;
        if (bpVar2 != null && ((uaf) bpVar2.b).f == drawable) {
            return true;
        }
        bp bpVar3 = this.e;
        return (bpVar3 != null && ((uaf) bpVar3.b).f == drawable) || super.verifyDrawable(drawable);
    }
}
