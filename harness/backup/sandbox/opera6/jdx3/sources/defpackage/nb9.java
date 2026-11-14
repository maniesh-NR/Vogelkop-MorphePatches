package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class nb9 implements e2m {
    public final /* synthetic */ byte a;

    public final Bitmap a(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                Bitmap bitmapM0 = z5i.m0(2.0f, bitmap);
                bitmap.recycle();
                return bitmapM0;
            case 1:
                Bitmap bitmapD = jkn.d(bitmap, jkn.a);
                if (bitmapD != bitmap) {
                    bitmap.recycle();
                }
                return bitmapD;
            default:
                Bitmap bitmapD2 = jkn.d(bitmap, jkn.b);
                if (bitmapD2 != bitmap) {
                    bitmap.recycle();
                }
                return bitmapD2;
        }
    }

    public final String key() {
        switch (this.a) {
            case 0:
                return "myflow-data-preview-blur";
            case 1:
                return "WallpaperValidationTransformationFull";
            default:
                return "WallpaperValidationTransformationPreview";
        }
    }
}
