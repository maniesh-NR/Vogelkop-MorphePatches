package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class hll extends lkn {
    public static final gpk s = new gpk(24);
    public final Context k;
    public final LinearGradient l;
    public final o2c m;
    public final Matrix n;
    public final Paint o;
    public final int p;
    public m9f q;
    public ComposeShader r;

    public hll(Context context, xkn xknVar, o2c o2cVar, Bitmap bitmap, int i, y1n y1nVar) {
        super(xknVar, bitmap, i, y1nVar);
        this.n = new Matrix();
        Paint paint = new Paint(1);
        this.o = paint;
        this.k = context;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, xknVar.d, xknVar.e, Shader.TileMode.CLAMP);
        this.l = linearGradient;
        this.m = o2cVar;
        paint.setShader(linearGradient);
        this.p = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    @Override // defpackage.lkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hll.d(android.graphics.Canvas):void");
    }
}
