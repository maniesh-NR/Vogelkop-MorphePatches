package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class ovj extends c73 {
    public final RectF A;
    public final ezb B;
    public final float[] C;
    public final Path D;
    public final t1c E;
    public zzm F;
    public zzm G;

    public ovj(f3d f3dVar, t1c t1cVar) {
        super(f3dVar, t1cVar);
        this.A = new RectF();
        ezb ezbVar = new ezb();
        this.B = ezbVar;
        this.C = new float[8];
        this.D = new Path();
        this.E = t1cVar;
        ezbVar.setAlpha(0);
        ezbVar.setStyle(Paint.Style.FILL);
        ezbVar.setColor(t1cVar.l);
    }

    @Override // defpackage.c73, defpackage.evb
    public final void d(ua7 ua7Var, Object obj) {
        super.d(ua7Var, obj);
        if (obj == k3d.F) {
            if (ua7Var == null) {
                this.F = null;
                return;
            } else {
                this.F = new zzm(ua7Var, null);
                return;
            }
        }
        if (obj == 1) {
            if (ua7Var != null) {
                this.G = new zzm(ua7Var, null);
                return;
            }
            this.G = null;
            this.B.setColor(this.E.l);
        }
    }

    @Override // defpackage.c73, defpackage.ql7
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        t1c t1cVar = this.E;
        float f = t1cVar.j;
        float f2 = t1cVar.k;
        RectF rectF2 = this.A;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.c73
    public final void j(Canvas canvas, Matrix matrix, int i) {
        t1c t1cVar = this.E;
        int iAlpha = Color.alpha(t1cVar.l);
        if (iAlpha != 0) {
            int iIntValue = (int) ((((iAlpha / 255.0f) * (((a73) this.w.l) == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
            ezb ezbVar = this.B;
            ezbVar.setAlpha(iIntValue);
            zzm zzmVar = this.G;
            if (zzmVar != null) {
                ezbVar.setColor(((Integer) zzmVar.e()).intValue());
            }
            zzm zzmVar2 = this.F;
            if (zzmVar2 != null) {
                ezbVar.setColorFilter((ColorFilter) zzmVar2.e());
            }
            if (iIntValue > 0) {
                float[] fArr = this.C;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f = t1cVar.j;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = t1cVar.k;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                Path path = this.D;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, ezbVar);
            }
        }
    }
}
