package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Region;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class g7b extends ScrollView {
    public final tz4 a;
    public final ho3 b;
    public final kc c;
    public final DecelerateInterpolator d;
    public byte e;
    public AnimatorSet f;
    public int g;
    public float h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public WebContents m;
    public boolean n;
    public final t5d o;
    public final f7b p;
    public final ArrayList q;
    public final ArrayDeque r;
    public final LinearLayout s;
    public int t;
    public int u;
    public int v;
    public Paint w;

    /* JADX WARN: Multi-variable type inference failed */
    public g7b(t5d t5dVar, ChromiumContent chromiumContent, b7f b7fVar) {
        super(t5dVar, null);
        this.a = new tz4(this, (byte) 2);
        this.e = (byte) 0;
        this.b = new ho3(this, (byte) 8);
        this.c = new kc(this, (byte) 26);
        this.d = new DecelerateInterpolator(1.0f);
        yy4 yy4Var = new yy4(this);
        setWillNotDraw(false);
        this.q = new ArrayList();
        chromiumContent.k(yy4Var);
        this.p = new f7b(this, b7fVar);
        setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(t5dVar);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        this.r = new ArrayDeque();
        this.o = t5dVar;
        new FrameLayout(t5dVar).setVisibility(4);
    }

    public final void a(boolean z) {
        float f = z ? 0.0f : this.j;
        long jAbs = (long) ((Math.abs(f - getTranslationY()) / this.j) * 250.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("alpha", getAlpha(), 1.0f));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationX", getTranslationX(), 0.0f));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationY", getTranslationY(), f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.setDuration(Math.max(jAbs, 0L));
        this.f.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
        this.f.addListener(this.c);
        this.f.setInterpolator(this.d);
        this.f.start();
    }

    public final void b(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getVisibility() == 0;
        xvb.b.getClass();
        View rootView = getRootView();
        if (rootView == null || j14.o(rootView) <= 0) {
            if (!z2 && !this.n) {
                setVisibility(0);
            }
        } else if (z2) {
            setVisibility(4);
        }
        int height = getParent() == null ? 0 : ((View) getParent()).getHeight();
        if (this.g != height) {
            this.g = height;
            this.e = (byte) 0;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.end();
            }
        }
        this.j = getMeasuredHeight();
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            this.j = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + this.j;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getScrollY() != 0) {
            if (this.w == null) {
                Paint paint = new Paint();
                this.w = paint;
                paint.setColor(this.o.getColor(2131100149));
            }
            canvas.drawRect(0.0f, getScrollY(), getWidth(), getScrollY() + (getContext().getResources().getDisplayMetrics().density < 2.0f ? 1 : 2), this.w);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        float translationX = getTranslationX();
        float translationY = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        boolean zGatherTransparentRegion = super.gatherTransparentRegion(region);
        setTranslationX(translationX);
        setTranslationY(translationY);
        return zGatherTransparentRegion;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n) {
            return;
        }
        ObjectAnimator.ofFloat(this, (Property<g7b, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(250L).start();
        setVisibility(0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisibility(4);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b(z, i, i2, i3, i4);
        int height = getHeight();
        int height2 = this.s.getHeight();
        if (this.u != height2) {
            scrollTo(0, (height2 - height) - this.v);
        }
        this.t = height;
        this.u = height2;
        this.v = (height2 - height) - getScrollY();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.s.getMeasuredHeight() > getMeasuredHeight();
        if (z != isVerticalScrollBarEnabled()) {
            setVerticalScrollBarEnabled(z);
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.v = (this.u - this.t) - getScrollY();
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
