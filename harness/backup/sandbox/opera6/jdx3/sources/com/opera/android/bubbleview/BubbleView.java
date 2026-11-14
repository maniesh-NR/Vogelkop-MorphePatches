package com.opera.android.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.StylingImageView;
import defpackage.fan;
import defpackage.fv2;
import defpackage.gh2;
import defpackage.hxj;
import defpackage.ixj;
import defpackage.j21;
import defpackage.khh;
import defpackage.lf1;
import defpackage.lz3;
import defpackage.ml2;
import defpackage.q9n;
import defpackage.u7;
import defpackage.xz3;
import defpackage.yz3;
import defpackage.zz3;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BubbleView extends ViewGroup {
    public static final /* synthetic */ int D = 0;
    public int A;
    public final j21 B;
    public final ml2 C;
    public final StylingImageView a;
    public final StylingImageView b;
    public final StylingImageView c;
    public final StylingImageView d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public float m;
    public hxj n;
    public final int[] o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public xz3 t;
    public View u;
    public lz3 v;
    public lz3 w;
    public boolean x;
    public boolean y;
    public Drawable z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public BubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.o = new int[2];
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.B = new j21(this, (byte) 1);
        this.C = new ml2(this, (byte) 2);
        this.g = fan.a(1.5f, context.getResources());
        ?? stylingImageView = new StylingImageView(context, null);
        this.a = stylingImageView;
        ?? stylingImageView2 = new StylingImageView(context, null);
        this.b = stylingImageView2;
        ?? stylingImageView3 = new StylingImageView(context, null);
        this.c = stylingImageView3;
        ?? stylingImageView4 = new StylingImageView(context, null);
        this.d = stylingImageView4;
        addView(stylingImageView);
        addView(stylingImageView2);
        addView(stylingImageView3);
        addView(stylingImageView4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.f, 0, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(2131165357));
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(2131165355));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(2131165356));
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, context.getResources().getDimensionPixelSize(2131165358));
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, context.getResources().getDimensionPixelSize(2131165359));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(2, 2130969091);
        this.k = typedArrayObtainStyledAttributes.getInteger(5, 1);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Runnable runnable, long j) {
        if (this.p.isEmpty()) {
            this.t = new xz3(this, j, runnable);
            return;
        }
        int width = (this.u.getWidth() / 2) + this.u.getLeft();
        int height = (this.u.getHeight() / 2) + this.u.getTop();
        this.u.setAlpha(0.5f);
        this.u.setScaleX(0.85f);
        this.u.setScaleY(0.85f);
        this.u.setTranslationX((r0.centerX() - width) * 0.14999998f);
        this.u.setTranslationY((r0.centerY() - height) * 0.14999998f);
        this.u.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(j).setInterpolator(lf1.d).withEndAction(runnable);
        AppCompatImageView appCompatImageView = this.a;
        appCompatImageView.setPivotY(appCompatImageView.getHeight());
        appCompatImageView.setScaleY(0.0f);
        long j2 = j / 2;
        ViewPropertyAnimator duration = appCompatImageView.animate().scaleY(1.0f).alpha(1.0f).setStartDelay(j2).setDuration(j2);
        DecelerateInterpolator decelerateInterpolator = lf1.c;
        duration.setInterpolator(decelerateInterpolator);
        AppCompatImageView appCompatImageView2 = this.b;
        appCompatImageView2.setPivotY(0.0f);
        appCompatImageView2.setScaleY(0.0f);
        appCompatImageView2.animate().scaleY(1.0f).alpha(1.0f).setStartDelay(j2).setDuration(j2).setInterpolator(decelerateInterpolator);
        AppCompatImageView appCompatImageView3 = this.c;
        appCompatImageView3.setPivotX(appCompatImageView3.getWidth());
        appCompatImageView3.setScaleX(0.0f);
        appCompatImageView3.animate().scaleX(1.0f).alpha(1.0f).setStartDelay(j2).setDuration(j2).setInterpolator(decelerateInterpolator);
        AppCompatImageView appCompatImageView4 = this.d;
        appCompatImageView4.setPivotX(0.0f);
        appCompatImageView4.setScaleX(0.0f);
        appCompatImageView4.animate().scaleX(1.0f).alpha(1.0f).setStartDelay(j2).setDuration(j2).setInterpolator(decelerateInterpolator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void b() {
        Drawable drawableX;
        if (this.A != 0) {
            drawableX = f03.x(this.A, getContext());
        } else {
            drawableX = null;
        }
        if (this.z != drawableX) {
            this.z = drawableX;
            if (drawableX != null) {
                drawableX.setBounds(this.s);
            }
        }
        Drawable drawable = this.z;
        View view = this.u;
        int i = this.h;
        if (drawable != null) {
            view.setBackground(new zz3(this.u, this.z, i));
        } else {
            view.setBackground(null);
        }
        if (this.z == null) {
            return;
        }
        float f = this.g;
        Drawable drawable2 = this.z;
        ?? r0 = this.a;
        r0.setBackground(new yz3(this.f, this.e, 1, f, drawable2, d(r0)));
        float f2 = this.m;
        WeakHashMap weakHashMap = r5n.a;
        r0.setElevation(f2);
        Drawable drawable3 = this.z;
        ?? r02 = this.b;
        r02.setBackground(new yz3(this.f, this.e, 3, f, drawable3, d(r02)));
        r02.setElevation(this.m);
        Drawable drawable4 = this.z;
        ?? r03 = this.c;
        r03.setBackground(new yz3(this.e, this.f, 0, f, drawable4, d(r03)));
        r03.setElevation(this.m);
        Drawable drawable5 = this.z;
        ?? r04 = this.d;
        r04.setBackground(new yz3(this.e, this.f, 2, f, drawable5, d(r04)));
        r04.setElevation(this.m);
        this.u.setBackground(new zz3(this.u, this.z, i));
        this.u.setElevation(this.m);
    }

    public final boolean c() {
        ixj ixjVarE = e();
        Rect rect = ixjVarE.b;
        Rect rect2 = this.q;
        if (Objects.equals(rect, rect2)) {
            return false;
        }
        if (!rect2.isEmpty() && !this.y) {
            this.y = true;
            postOnAnimation(new fv2(this, (byte) 25));
        }
        Rect rect3 = this.r;
        if (rect == null) {
            if (!rect2.isEmpty()) {
                g(false);
            }
            rect2.setEmpty();
            rect3.setEmpty();
            return false;
        }
        rect2.set(rect);
        Rect rect4 = ixjVarE.h;
        if (rect4 != null) {
            rect3.set(rect4);
        } else {
            rect3.setEmpty();
        }
        requestLayout();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Point d(StylingImageView stylingImageView) {
        Point point = new Point();
        point.x = Math.min(-(stylingImageView.getLeft() - this.u.getLeft()), 0);
        point.y = Math.min(-(stylingImageView.getTop() - this.u.getTop()), 0);
        return point;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        if (!super.dispatchTouchEvent(motionEvent)) {
            lz3 lz3Var = this.v;
            if (lz3Var != null) {
                Rect rect = this.r;
                if (rect.isEmpty()) {
                    zContains = false;
                } else {
                    int[] iArr = this.o;
                    getLocationInWindow(iArr);
                    zContains = rect.contains(((int) motionEvent.getX()) + iArr[0], ((int) motionEvent.getY()) + iArr[1]);
                }
                if (!lz3Var.d(zContains)) {
                }
            }
            return false;
        }
        return true;
    }

    public final ixj e() {
        if (isInEditMode()) {
            return new ixj(10000, null, 0, 0);
        }
        ixj ixjVarC = this.n.c();
        return getParent() == null ? ixjVarC : ixjVarC.a(ixj.b((View) getParent()));
    }

    public final void f(int i, ixj ixjVar) {
        int iHeight = i - (this.j << 1);
        Rect rect = ixjVar.b;
        if (rect != null) {
            iHeight = (iHeight - (ixjVar.b.height() + Math.min(iHeight - rect.bottom, rect.top))) - this.a.getMeasuredHeight();
        }
        this.u.measure(View.MeasureSpec.makeMeasureSpec(ixjVar.a - (this.i << 1), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iHeight, Integer.MIN_VALUE));
    }

    public final void g(boolean z) {
        if (this.x) {
            return;
        }
        this.x = true;
        postOnAnimation(new gh2((byte) 2, this, z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.setEmpty();
        this.r.setEmpty();
        getViewTreeObserver().addOnGlobalLayoutListener(this.B);
        getViewTreeObserver().addOnPreDrawListener(this.C);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.B);
        getViewTreeObserver().removeOnPreDrawListener(this.C);
        g(false);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = r5n.a;
        View view = (View) m5n.f(this, 2131362414);
        this.u = view;
        q9n.f(view, new u7(this, (byte) 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029a A[PHI: r4
      0x029a: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:100:0x0298, B:92:0x0285] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.bubbleview.BubbleView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.a.measure(0, 0);
        this.b.measure(0, 0);
        this.c.measure(0, 0);
        this.d.measure(0, 0);
        f(size2, e());
        setMeasuredDimension(size, size2);
    }
}
