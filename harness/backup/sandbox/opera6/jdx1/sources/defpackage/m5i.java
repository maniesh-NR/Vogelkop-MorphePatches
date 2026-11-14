package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class m5i extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public umm a;
    public Boolean b;
    public Long c;
    public pjg d;
    public pa e;

    public final void a() {
        this.e = null;
        pjg pjgVar = this.d;
        if (pjgVar != null) {
            removeCallbacks(pjgVar);
            this.d.run();
        } else {
            umm ummVar = this.a;
            if (ummVar != null) {
                ummVar.setState(g);
            }
        }
        umm ummVar2 = this.a;
        if (ummVar2 == null) {
            return;
        }
        ummVar2.setVisible(false, false);
        unscheduleDrawable(ummVar2);
    }

    public final void b(long j, int i, long j2, float f2) {
        umm ummVar = this.a;
        if (ummVar == null) {
            return;
        }
        if (ummVar.getRadius() != i) {
            ummVar.setRadius(i);
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jB = u95.b(j2, f2);
        u95 u95Var = ummVar.b;
        if (!(u95Var == null ? false : jgm.a(u95Var.a, jB))) {
            ummVar.b = new u95(jB);
            ummVar.setColor(ColorStateList.valueOf(cs5.u0(jB)));
        }
        Rect rect = new Rect(0, 0, zed.b(bpj.d(j)), zed.b(bpj.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ummVar.setBounds(rect);
    }

    public final void c(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        pjg pjgVar = this.d;
        if (pjgVar != null) {
            removeCallbacks(pjgVar);
            pjgVar.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z) {
            iArr = f;
        } else {
            if (jLongValue < 5) {
                pjg pjgVar2 = new pjg(this, (byte) 24);
                this.d = pjgVar2;
                postDelayed(pjgVar2, 50L);
                this.c = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = g;
        }
        umm ummVar = this.a;
        if (ummVar != null) {
            ummVar.setState(iArr);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        pa paVar = this.e;
        if (paVar != null) {
            paVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
