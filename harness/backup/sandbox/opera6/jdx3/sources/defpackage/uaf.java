package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes.dex */
public final class uaf {
    public final taf a;
    public int b;
    public int c;
    public int d;
    public Drawable e;
    public LayerDrawable f;
    public kce g;
    public ncn h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public ColorStateList n;
    public int o;

    public uaf(taf tafVar) {
        this.a = tafVar;
    }

    public final void a(Context context) {
        if (this.m) {
            this.n = f03.u(2130970453, context, 2131099815);
        }
        ncn ncnVar = this.h;
        if (ncnVar != null) {
            ncnVar.invalidateSelf();
            return;
        }
        Drawable drawableP = this.e;
        if (drawableP != null) {
            int i = this.i;
            if (i != 0) {
                ColorStateList colorStateListU = f03.u(i, context, 0);
                drawableP.mutate();
                drawableP.setTintList(colorStateListU);
            } else {
                int i2 = this.j;
                if (i2 != 0) {
                    j14.n0(drawableP, context.getColor(i2));
                }
            }
            if (this.k) {
                int i3 = this.l;
                if (i3 != 0) {
                    drawableP = j14.p(j14.D(fan.a(24.0f, context.getResources()), f03.t(i3, context, 2131099815)), drawableP);
                } else {
                    int iT = f03.t(2130969273, context, 2131101243);
                    ShapeDrawable shapeDrawableD = j14.D(fan.a(24.0f, context.getResources()), f03.t(2130969303, context, 2131099815));
                    j14.n0(drawableP, iT);
                    drawableP = j14.p(shapeDrawableD, drawableP);
                }
            }
            this.f.setDrawableByLayerId(1, drawableP);
            drawableP.setVisible(this.f.isVisible(), false);
            this.f.invalidateSelf();
        }
    }

    public final void b(Drawable drawable) {
        this.e = drawable;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.e});
        this.f = layerDrawable;
        layerDrawable.setId(0, 1);
        this.f.setVisible(false, false);
        this.g = new kce(this.f);
    }
}
