package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class hv8 implements mv8 {
    public static final jxh f = new jxh(2131167596);
    public static final jxh g = new jxh(2131167595);
    public final zyk b;
    public final zyk c;
    public final zyk d;
    public final Paint a = new Paint();
    public final kv8 e = kv8.LARGE;

    public hv8(Context context) {
        this.b = z4c.b(new gv8(this, context, (byte) 0));
        this.c = z4c.b(new vg4(context, (byte) 6));
        this.d = z4c.b(new vg4(context, (byte) 7));
    }

    @Override // defpackage.mv8
    public final kv8 b() {
        return this.e;
    }

    @Override // defpackage.mv8
    public final void c(Canvas canvas, int i, int i2, lv8 lv8Var) {
        zyk zykVar = this.b;
        int iIntValue = i2 - ((Number) zykVar.getValue()).intValue();
        int iIntValue2 = ((Number) zykVar.getValue()).intValue();
        zyk zykVar2 = this.d;
        int iIntValue3 = ((iIntValue2 - ((Number) zykVar2.getValue()).intValue()) / 2) + iIntValue;
        int iIntValue4 = ((Number) zykVar2.getValue()).intValue() + iIntValue3;
        int i3 = i / 2;
        zyk zykVar3 = this.c;
        int iIntValue5 = i3 - (((Number) zykVar3.getValue()).intValue() / 2);
        if (iIntValue5 < 0) {
            iIntValue5 = 0;
        }
        int iIntValue6 = (((Number) zykVar3.getValue()).intValue() / 2) + i3;
        if (iIntValue6 <= i) {
            i = iIntValue6;
        }
        int i4 = lv8Var.a;
        Paint paint = this.a;
        paint.setColor(i4);
        canvas.drawRect(iIntValue5, iIntValue3, i, iIntValue4, paint);
    }
}
