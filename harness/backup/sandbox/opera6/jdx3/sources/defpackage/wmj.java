package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public final class wmj extends View implements k2c {
    public String a;
    public vmj b;
    public final l2c c;
    public final fr d;
    public boolean e;

    static {
        new Paint().setAntiAlias(true);
    }

    public wmj(Context context) {
        super(context, null, 0);
        this.c = new l2c(this, this, null);
        fr frVarF = fr.f(context, (AttributeSet) null);
        this.d = frVarF;
        if (frVarF != null) {
            frVarF.e(this);
        }
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.c;
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        fr frVar = this.d;
        if (frVar != null) {
            frVar.e(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a == null) {
            return;
        }
        if (this.b == null) {
            Context context = getContext();
            String str = this.a;
            int width = getWidth();
            int height = getHeight();
            int i = vmj.g;
            vmj vmjVarJ = tmj.j(context, str, width, height, 48);
            this.b = vmjVarJ;
            if (this.e && vmjVarJ.f == null) {
                Bitmap bitmapU = z5i.u(vmjVarJ.a, vmjVarJ.b, Bitmap.Config.ARGB_8888);
                if (bitmapU != null) {
                    vmjVarJ.a(new Canvas(bitmapU));
                } else {
                    bitmapU = null;
                }
                vmjVarJ.f = bitmapU;
            }
        }
        this.b.setBounds(0, 0, getWidth(), getHeight());
        this.b.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) != 0 || size <= 0) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(size, size);
        }
    }
}
