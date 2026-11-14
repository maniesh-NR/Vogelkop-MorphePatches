package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class eh7 implements e2m {
    public final int a;

    public eh7(int i) {
        this.a = i;
    }

    public final Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        Bitmap bitmap2 = bitmap;
        while (true) {
            int i = this.a;
            if (width <= i) {
                break;
            }
            int i2 = width / 2;
            if (i2 > i) {
                i = i2;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, i, i, true);
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            bitmap2 = bitmapCreateScaledBitmap;
            width = bitmapCreateScaledBitmap.getWidth();
        }
        if (!bitmap2.equals(bitmap)) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    public final String key() {
        return p3p.i(this.a, "DownscaleSquareBitmapTransformation(", ")");
    }
}
