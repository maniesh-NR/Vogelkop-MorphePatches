package defpackage;

import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOverlay;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class gcl {
    public static final ixh j = new ixh(220.0f);
    public static final ixh k = new ixh(64.0f);
    public static final ixh l = new ixh(8.0f);
    public static final ixh m = new ixh(16.0f);
    public static final ixh n = new ixh(6.0f);
    public static final ixh o = new ixh(4.0f);
    public static final ixh p = new ixh(3.0f);
    public static final ixh q = new ixh(1.0f);
    public static final ixh r = new ixh(200.0f);
    public static final DecelerateInterpolator s = lf1.c;
    public final View a;
    public final ViewOverlay b;
    public final w05 c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final Rect h = new Rect();
    public ValueAnimator i;

    public gcl(Context context, View view) {
        this.a = view;
        this.b = view.getOverlay();
        this.c = new w05(m.l(context), n.l(context), o.l(context), p.l(context), q.l(context));
        this.d = k.k(context);
        this.e = j.k(context);
        this.f = r.k(context);
        this.g = l.k(context);
    }

    public final void a() {
        View view = this.a;
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        int i = this.e / 2;
        b(new Rect(width - i, height - i, width + i, i + height));
    }

    public final void b(Rect rect) {
        ViewOverlay viewOverlay = this.b;
        w05 w05Var = this.c;
        viewOverlay.remove(w05Var);
        viewOverlay.add(w05Var);
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int iWidth = rect.width();
        int i = this.g << 1;
        int i2 = this.d;
        int iMax = Math.max(iWidth + i, i2) / 2;
        int iMax2 = Math.max(rect.height() + i, i2) / 2;
        Rect rect2 = new Rect(iCenterX - iMax, iCenterY - iMax2, iCenterX + iMax, iCenterY + iMax2);
        Rect rect3 = this.h;
        if (rect3.isEmpty()) {
            rect3.set(rect2);
            w05Var.setBounds(new Rect(rect3));
            w05Var.invalidateSelf();
            return;
        }
        float fExactCenterX = rect2.exactCenterX() - rect3.exactCenterX();
        float fExactCenterY = rect2.exactCenterY() - rect3.exactCenterY();
        long jB = (long) (200.0f - (djh.b(((float) Math.sqrt((fExactCenterY * fExactCenterY) + (fExactCenterX * fExactCenterX))) / this.f, 0.0f, 1.0f) * 100.0f));
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(), new Rect(rect3), rect2);
        valueAnimatorOfObject.setDuration(jB);
        valueAnimatorOfObject.setInterpolator(s);
        valueAnimatorOfObject.addUpdateListener(new nl2(this, (byte) 17));
        valueAnimatorOfObject.start();
        this.i = valueAnimatorOfObject;
    }
}
