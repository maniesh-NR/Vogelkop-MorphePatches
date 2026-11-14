package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class dr8 extends fr8 {
    public final Drawable s;
    public final Rect t;
    public PorterDuffColorFilter u;
    public d03 v;

    public dr8(Context context, tta ttaVar, vr8 vr8Var) {
        super(context, ttaVar, vr8Var);
        this.s = sgb.F(2131231969, context);
        int i = ttaVar.b;
        this.t = new Rect(0, 0, i, i);
        l();
    }

    @Override // defpackage.fr8
    public final void b(vr8 vr8Var, boolean z) {
        super.b(vr8Var, z);
        this.v = e();
        invalidate();
    }

    @Override // defpackage.fr8
    public final void n(Canvas canvas, Rect rect) {
        Drawable drawable = this.s;
        drawable.mutate().setColorFilter(this.u);
        Rect bounds = drawable.getBounds();
        Rect rect2 = this.t;
        if (!rect2.equals(bounds)) {
            drawable.setBounds(rect2);
        }
        ol7 ol7Var = this.v;
        if (ol7Var != null) {
            ol7Var.setBounds(rect);
            this.v.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.translate(((rect.width() - rect2.width()) / 2.0f) + rect.left, ((rect.height() - rect2.height()) / 2.0f) + rect.top);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.fr8
    public final void o() {
        super.o();
        this.u = new PorterDuffColorFilter(f03.u(2130969728, getContext(), 2131099822).getDefaultColor(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }
}
