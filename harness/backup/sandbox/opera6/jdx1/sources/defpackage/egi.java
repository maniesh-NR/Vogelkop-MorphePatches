package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public class egi extends mzg {
    public float b;
    public float c;
    public final /* synthetic */ igi d;

    public egi(igi igiVar, float f, float f2) {
        this.d = igiVar;
        this.b = f;
        this.c = f2;
    }

    public void n(String str) {
        igi igiVar = this.d;
        Canvas canvas = (Canvas) igiVar.b;
        if (igiVar.K0()) {
            ggi ggiVar = (ggi) igiVar.d;
            if (ggiVar.b) {
                canvas.drawText(str, this.b, this.c, ggiVar.d);
            }
            ggi ggiVar2 = (ggi) igiVar.d;
            if (ggiVar2.c) {
                canvas.drawText(str, this.b, this.c, ggiVar2.e);
            }
        }
        this.b = ((ggi) igiVar.d).d.measureText(str) + this.b;
    }
}
