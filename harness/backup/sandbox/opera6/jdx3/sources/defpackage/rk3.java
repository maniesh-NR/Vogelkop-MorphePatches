package defpackage;

import J.N;
import android.graphics.Bitmap;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes.dex */
public abstract class rk3 {
    public static final CompletableFuture a = new CompletableFuture();

    public static final Bitmap a(Bitmap bitmap, int i) {
        ((wy4) a.get()).getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        if (N.MJTNaraQ(bitmap, i, bitmapCreateBitmap)) {
            return bitmapCreateBitmap;
        }
        yt7.k("");
        return null;
    }
}
