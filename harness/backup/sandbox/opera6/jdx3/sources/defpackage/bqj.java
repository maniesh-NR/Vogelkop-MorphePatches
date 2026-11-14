package defpackage;

import android.animation.ValueAnimator;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class bqj {
    public static final long g;
    public static final long h;
    public static final ixh i;
    public final rf2 a;
    public final View b;
    public final pde c = new pde(Boolean.FALSE);
    public final Size d;
    public ValueAnimator e;
    public boolean f;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        g = cs5.x0(150, un7Var);
        h = cs5.x0(150, un7Var);
        i = new ixh(8.0f);
    }

    public bqj(rf2 rf2Var, View view) {
        this.a = rf2Var;
        this.b = view;
        FrameLayout frameLayout = (FrameLayout) rf2Var.e;
        frameLayout.measure(0, 0);
        Size size = new Size(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        this.d = size;
        p37.t0(size.getWidth(), (LinearLayout) rf2Var.d);
        frameLayout.setClipToOutline(true);
        p37.t0(0, frameLayout);
        b();
    }

    public final boolean a() {
        return ((Boolean) this.c.g()).booleanValue();
    }

    public final void b() {
        rf2 rf2Var = this.a;
        FrameLayout frameLayout = (FrameLayout) rf2Var.e;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        View view = this.b;
        int width = (view.getWidth() / 2) + view.getLeft();
        if (!this.f) {
            width -= layoutParams.width;
        }
        int top = view.getTop();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.topMargin = top;
        }
        frameLayout.setLayoutParams(layoutParams);
        boolean z = this.f;
        LinearLayout linearLayout = (LinearLayout) rf2Var.d;
        if (z) {
            linearLayout.setTranslationX(-(this.d.getWidth() - layoutParams.width));
        } else {
            linearLayout.setTranslationX(0.0f);
        }
    }
}
