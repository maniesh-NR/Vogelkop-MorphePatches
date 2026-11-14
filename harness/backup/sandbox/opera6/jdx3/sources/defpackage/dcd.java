package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class dcd implements e2m {
    public final int a;
    public final byte b;
    public final Path c;

    public dcd(Context context, int i) {
        this.a = i;
        String[] strArr = OperaApplication.K;
        byte b = ((OperaApplication) context.getApplicationContext()).J().x().b;
        this.b = b;
        this.c = gjf.a(context).b(i, b).c;
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        if (bitmap.getWidth() != bitmap.getHeight()) {
            rn9 rn9Var = new rn9(bitmap, 2);
            if (rn9Var.A()) {
                paint.setColor(((int[]) rn9Var.c)[0]);
            }
        }
        canvas.drawPath(this.c, paint);
        float f = i;
        float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
        float width = bitmap.getWidth() * fMin;
        float height = bitmap.getHeight() * fMin;
        float f2 = (f - width) / 2.0f;
        float f3 = (f - height) / 2.0f;
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(f2, f3, width + f2, height + f3);
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, rect, rectF, paint2);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public final String key() {
        return fki.o(this.a, this.b, "MaskBackgroundTransformation(", ", ", ")");
    }
}
