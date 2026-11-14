package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class yni {
    public final Bitmap a;
    public final float b;

    public yni(float f, Bitmap bitmap) {
        this.a = bitmap;
        this.b = f;
    }

    public static final yni a(Bitmap bitmap, int i, int i2) {
        int height = bitmap.getHeight() - 1;
        if (i > height) {
            i = height;
        }
        int height2 = (bitmap.getHeight() - i) - 1;
        if (i2 > height2) {
            i2 = height2;
        }
        if (i2 > 0) {
            bitmap.setHeight(bitmap.getHeight() - i2);
        }
        return new yni(i / bitmap.getHeight(), bitmap);
    }
}
