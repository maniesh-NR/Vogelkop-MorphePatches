package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class bzh implements w7e, be2 {
    public final Resources a;

    public /* synthetic */ bzh(Resources resources) {
        this.a = resources;
    }

    public final ibk a(int i) {
        if (i <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options.inPreferredConfig = config;
        Resources resources = this.a;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i, options);
        if (bitmapDecodeResource == null) {
            bitmapDecodeResource = null;
        } else if (bitmapDecodeResource.getConfig() != options.inPreferredConfig) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), options.inPreferredConfig);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, (Paint) null);
            bitmapDecodeResource.recycle();
            bitmapDecodeResource = bitmapCreateBitmap;
        }
        if (bitmapDecodeResource == null) {
            try {
                Drawable drawableQ = g8.q(resources, i);
                int iMax = Math.max(drawableQ.getMinimumWidth(), 1);
                int iMax2 = Math.max(drawableQ.getMinimumHeight(), 1);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMax, iMax2, config);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                drawableQ.setBounds(0, 0, iMax, iMax2);
                drawableQ.draw(canvas);
                bitmapDecodeResource = bitmapCreateBitmap2;
            } catch (Resources.NotFoundException unused) {
                bitmapDecodeResource = null;
            }
        }
        if (bitmapDecodeResource != null) {
            return new ibk(bitmapDecodeResource);
        }
        return null;
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new fc2(this.a, d5oVar.r(Uri.class, ParcelFileDescriptor.class));
    }
}
