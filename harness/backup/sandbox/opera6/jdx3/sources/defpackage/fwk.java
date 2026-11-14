package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fwk extends LayerDrawable {
    public static final long h;
    public final boolean a;
    public ColorStateList b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final ValueAnimator g;

    static {
        on7 on7Var = pn7.b;
        h = cs5.x0(150, un7.d);
    }

    public fwk(boolean z) {
        super((Drawable[]) Arrays.asList(new ewk(), new ewk()).toArray(new ewk[0]));
        this.a = z;
        long jN = h;
        jN = z ? pn7.n(2, jN) : jN;
        this.c = 1.0f;
        this.e = 1.0f;
        this.f = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(pn7.f(jN));
        valueAnimatorOfFloat.addUpdateListener(new wo1(this, valueAnimatorOfFloat, (byte) 2));
        valueAnimatorOfFloat.addListener(new df1(this, (byte) 5));
        this.g = valueAnimatorOfFloat;
        c();
    }

    public final void a(float f, float f2) {
        getDrawable(0).setAlpha((int) (this.c * this.d * f * 255.0f));
        getDrawable(1).setAlpha((int) (this.c * f2 * 255.0f));
        invalidateSelf();
    }

    public final void b(Drawable drawable) {
        if (Intrinsics.a(drawable, getDrawable(1))) {
            return;
        }
        drawable.mutate();
        drawable.setColorFilter(getColorFilter());
        ColorStateList colorStateList = this.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
        drawable.setState(getState());
        ValueAnimator valueAnimator = this.g;
        valueAnimator.cancel();
        drawable.setLayoutDirection(getLayoutDirection());
        if (this.f) {
            this.f = false;
            setDrawable(1, drawable);
            invalidateSelf();
            return;
        }
        Drawable drawable2 = getDrawable(1);
        setDrawable(1, drawable);
        setDrawable(0, drawable2);
        this.d = getDrawable(0).getAlpha() / 255.0f;
        if (0.0f != this.e) {
            this.e = 0.0f;
            c();
        }
        valueAnimator.start();
    }

    public final void c() {
        float f = this.e;
        if (!this.a) {
            a(1.0f - f, f);
            return;
        }
        float f2 = (f * 2.0f) - 1.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float fO = cs5.O(1.0f, 0.0f, f2);
        float f3 = this.e * 2.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        a(fO, cs5.O(0.0f, 1.0f, f3));
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.c * 255.0f);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.g.cancel();
        if (1.0f != this.e) {
            this.e = 1.0f;
            c();
        }
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c = i / 255.0f;
        c();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        super.setTintList(colorStateList);
    }
}
