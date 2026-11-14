package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class q4h extends GradientDrawable {
    public final AccelerateInterpolator a = new AccelerateInterpolator();
    public final DecelerateInterpolator b = new DecelerateInterpolator();
    public final Rect c = new Rect();
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static float b(int i) {
        return (i * 10000.0f) / 2000.0f;
    }

    public final void a(Canvas canvas) {
        int i;
        if (this.j <= 0 || (i = this.k) <= 0) {
            return;
        }
        int i2 = this.h;
        int i3 = this.i;
        Rect rect = this.c;
        rect.set(i2, 0, i3, i);
        canvas.save();
        canvas.clipRect(rect);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fB = b(1600);
        float fB2 = b(1000);
        Rect bounds = getBounds();
        this.j = bounds.width();
        this.k = bounds.height();
        float f = this.j;
        this.d = (-0.6944444f) * f;
        this.e = 0.22222222f * f;
        this.f = f;
        this.g = f * 1.0555556f;
        float level = getLevel();
        float fB3 = b(800);
        DecelerateInterpolator decelerateInterpolator = this.b;
        if (level < fB3) {
            AccelerateInterpolator accelerateInterpolator = this.a;
            this.h = (int) (accelerateInterpolator.getInterpolation(getLevel() / fB3) * this.e);
            this.i = (int) (accelerateInterpolator.getInterpolation(getLevel() / fB3) * this.f);
        } else if (getLevel() <= fB) {
            float f2 = this.e;
            this.h = (int) ((decelerateInterpolator.getInterpolation((getLevel() - fB3) / fB3) * (this.f - f2)) + f2);
            float f3 = this.f;
            this.i = (int) ((decelerateInterpolator.getInterpolation((getLevel() - fB3) / fB3) * (this.g - f3)) + f3);
        }
        if (getLevel() <= fB) {
            a(canvas);
        }
        if (getLevel() < fB2) {
            return;
        }
        float f4 = this.d;
        this.h = (int) ((decelerateInterpolator.getInterpolation((getLevel() - fB2) / fB2) * (this.f - f4)) + f4);
        this.i = (int) (decelerateInterpolator.getInterpolation((getLevel() - fB2) / fB2) * this.g);
        a(canvas);
    }
}
