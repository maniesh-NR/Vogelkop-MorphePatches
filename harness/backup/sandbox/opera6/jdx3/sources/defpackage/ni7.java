package defpackage;

import android.graphics.PointF;
import android.util.Size;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ni7 {
    public static final long A;
    public static final long B;
    public static final /* synthetic */ int C = 0;
    public static final long z;
    public final View a;
    public int j;
    public boolean k;
    public final float q;
    public final int r;
    public final int s;
    public VelocityTracker t;
    public boolean w;
    public int y;
    public Function0 b = new ki5((byte) 20);
    public Function0 c = new ki5((byte) 23);
    public Function1 d = new m57(11);
    public Function1 e = new m57(12);
    public Function0 f = new ki5((byte) 24);
    public Function0 g = new ki5((byte) 25);
    public Function0 h = new ki5((byte) 21);
    public Function0 i = new ki5((byte) 22);
    public final ii7 l = new ii7(this, (byte) 0);
    public final ii7 m = new ii7(this, (byte) 1);
    public final ii7 n = new ii7(this, (byte) 3);
    public final ii7 o = new ii7(this, (byte) 4);
    public final ii7 p = new ii7(this, (byte) 5);
    public final PointF u = new PointF();
    public Size v = new Size(0, 0);
    public final ji7 x = new ji7(this);

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        z = cs5.x0(150, un7Var);
        A = cs5.x0(350, un7Var);
        B = cs5.x0(350, un7Var);
    }

    public ni7(View view) {
        this.a = view;
        this.q = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity() * 2.0f;
        this.r = ViewConfiguration.get(view.getContext()).getScaledMaximumFlingVelocity();
        this.s = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        view.setOnTouchListener(new m42(this, (byte) 1));
    }

    public final void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        View view = this.a;
        motionEvent.offsetLocation(view.getLeft(), view.getTop());
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-view.getLeft(), -view.getTop());
    }

    public final void b(int i, int i2) {
        int iC = c(i);
        int iD = d(i2);
        View view = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            View view2 = (View) this.p.invoke();
            int width = ((view2.getWidth() - (view2.getPaddingRight() + view2.getPaddingLeft())) / 2) + view2.getPaddingLeft();
            int height = ((view2.getHeight() - (view2.getPaddingBottom() + view2.getPaddingTop())) / 2) + view2.getPaddingTop();
            boolean z2 = (view.getWidth() / 2) + iC < width;
            boolean z3 = (view.getHeight() / 2) + iD < height;
            int i3 = (z2 ? 3 : 5) | (z3 ? 48 : 80);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) marginLayoutParams;
            if (layoutParams.gravity != i3) {
                layoutParams.gravity = i3;
            }
            if (z2) {
                marginLayoutParams.leftMargin = iC - view2.getPaddingLeft();
                marginLayoutParams.rightMargin = 0;
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = ((view2.getWidth() - iC) - view.getWidth()) - view2.getPaddingRight();
            }
            if (z3) {
                marginLayoutParams.topMargin = iD - view2.getPaddingTop();
                marginLayoutParams.bottomMargin = 0;
            } else {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = ((view2.getHeight() - iD) - view.getHeight()) - view2.getPaddingBottom();
            }
        } else {
            marginLayoutParams.leftMargin = iC;
            marginLayoutParams.topMargin = iD;
        }
        view.offsetLeftAndRight(iC - view.getLeft());
        view.offsetTopAndBottom(iD - view.getTop());
        this.b.invoke();
    }

    public final int c(int i) {
        View view = (View) this.p.invoke();
        int paddingLeft = view.getPaddingLeft() + this.j;
        int width = ((view.getWidth() - view.getPaddingRight()) - this.j) - this.a.getWidth();
        int i2 = this.j;
        if (width < i2) {
            width = i2;
        }
        return djh.c(i, paddingLeft, width);
    }

    public final int d(int i) {
        View view = (View) this.p.invoke();
        int paddingBottom = view.getPaddingBottom();
        int i2 = this.y;
        if (paddingBottom < i2) {
            paddingBottom = i2;
        }
        int paddingTop = view.getPaddingTop() + this.j;
        int height = ((view.getHeight() - paddingBottom) - this.j) - this.a.getHeight();
        int i3 = this.j;
        if (height < i3) {
            height = i3;
        }
        return djh.c(i, paddingTop, height);
    }

    public final void e() {
        if (this.k) {
            return;
        }
        this.a.performHapticFeedback(0);
        this.k = true;
        this.x.c(((Number) this.l.invoke()).floatValue(), ((Number) this.m.invoke()).floatValue());
        this.x.a(mi7.b, z, new DecelerateInterpolator(), this.e, new ii7(this, (byte) 2));
    }

    public final boolean f(float f, float f2) {
        float fFloatValue = f - ((Number) this.l.invoke()).floatValue();
        float fFloatValue2 = f2 - ((Number) this.m.invoke()).floatValue();
        return ((float) Math.sqrt((double) ((fFloatValue2 * fFloatValue2) + (fFloatValue * fFloatValue)))) < ((Number) this.i.invoke()).floatValue();
    }

    public final void g() {
        ji7 ji7Var = this.x;
        PointF pointF = ji7Var.d;
        float f = pointF.x;
        PointF pointF2 = ji7Var.e;
        float f2 = pointF2.x;
        float f3 = ji7Var.a;
        int iG = (int) v0g.g(f2, f, f3, f);
        float f4 = pointF.y;
        b(iG, (int) v0g.g(pointF2.y, f4, f3, f4));
    }
}
