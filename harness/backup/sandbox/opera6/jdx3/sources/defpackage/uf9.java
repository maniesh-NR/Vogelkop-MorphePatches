package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class uf9 extends tf9 {
    public final int g;

    public uf9(Context context, sll sllVar, int i, int i2) {
        super(context, sllVar, Paint.Style.FILL_AND_STROKE, i2);
        this.g = i;
    }

    @Override // defpackage.tf9
    public final void a(Canvas canvas, Rect rect) {
        float f = this.d / 2.0f;
        float f2 = rect.left + f;
        float f3 = rect.top + f;
        float f4 = rect.right - f;
        float f5 = rect.bottom - f;
        int i = this.g;
        canvas.drawRoundRect(f2, f3, f4, f5, i, i, this.e);
    }
}
