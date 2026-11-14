package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes.dex */
public final class rhj extends mq3 {
    public final View a;
    public final float b;
    public final int c;
    public final float d;
    public float e = 1.0f;
    public final wq3 f;

    /* JADX WARN: Multi-variable type inference failed */
    public rhj(wq3 wq3Var, z46 z46Var, View view) {
        this.a = view;
        Context context = view.getContext();
        this.b = context.getResources().getDimensionPixelSize(2131165348);
        this.c = context.getResources().getDimensionPixelSize(2131165347);
        this.d = f03.w(2130968583, context, 0);
        lzb lzbVar = new lzb(this, (byte) 15);
        dll dllVarS = q9n.s(view);
        if (dllVarS != null) {
            u8n.b(dllVarS, view, lzbVar);
        }
        view.addOnLayoutChangeListener(new z22(this, (byte) 11));
        if (z46Var != 0) {
            z46Var.setOnShowListener(new zd7(this, (byte) 1));
        } else {
            d();
        }
        this.f = wq3Var;
    }

    public final void b(View view) {
        d();
    }

    public final void c(int i, View view) {
        if (i == 5) {
            this.f.Q(hjm.a);
        }
    }

    public final void d() {
        View view = this.a;
        float top = view.getTop() + (((View) view.getParent()).getHeight() - view.getHeight());
        float f = this.d;
        float fMax = 1.0f - Math.max(0.0f, (f - top) / f);
        this.e = fMax;
        float f2 = this.c;
        float f3 = fMax * f2;
        if (f3 <= 0.5f) {
            f3 = 0.0f;
        }
        if (((View) view.getParent()).getWidth() <= view.getWidth()) {
            f2 = f3;
        }
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = (GradientDrawable) (GradientDrawable.class.isInstance(background) ? (Drawable) GradientDrawable.class.cast(background) : null);
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        view.setElevation(this.b * this.e);
    }
}
