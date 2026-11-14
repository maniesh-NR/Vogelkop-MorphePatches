package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.TypedValue;
import java.util.List;

/* loaded from: classes.dex */
public final class f76 extends bb5 {
    public f76(List list, int i) {
        super(list, i, eya.f);
        this.h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // defpackage.bb5
    public final Paint f(kk7 kk7Var) {
        int i = kk7Var.d ? this.i : 0;
        Paint paint = this.h;
        paint.setColor(i);
        if (kk7Var.d) {
            paint.setShadowLayer((int) TypedValue.applyDimension(1, 1.0f, kk7Var.a.getResources().getDisplayMetrics()), 0.0f, 0.0f, -16777216);
        } else {
            paint.clearShadowLayer();
        }
        return super.f(kk7Var);
    }
}
