package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class zmj extends vmj {
    public static final /* synthetic */ int i = 0;
    public final ymj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zmj(android.content.Context r19, java.lang.String r20, defpackage.anj r21, defpackage.umj r22, int r23, int r24, defpackage.oa5 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmj.<init>(android.content.Context, java.lang.String, anj, umj, int, int, oa5, boolean):void");
    }

    @Override // defpackage.vmj
    public final void b(Canvas canvas) {
        ymj ymjVar = this.h;
        TextPaint textPaint = ymjVar.m;
        anj anjVar = ymjVar.a;
        String strA = ymjVar.b ? anjVar.a() : anjVar.a;
        PointF pointF = ymjVar.i;
        float f = (pointF == null ? null : pointF).x;
        if (pointF == null) {
            pointF = null;
        }
        canvas.drawText(strA, f, pointF.y, ymjVar.l);
        if (ymjVar.b) {
            return;
        }
        PointF pointF2 = ymjVar.j;
        if (pointF2 != null) {
            canvas.drawText(anjVar.c, pointF2.x, pointF2.y, textPaint);
        }
        PointF pointF3 = ymjVar.k;
        if (pointF3 != null) {
            canvas.drawText(anjVar.b, pointF3.x, pointF3.y, textPaint);
        }
    }

    @Override // defpackage.vmj, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        super.setAlpha(i2);
        ymj ymjVar = this.h;
        ymjVar.l.setAlpha(i2);
        ymjVar.m.setAlpha(i2);
    }
}
