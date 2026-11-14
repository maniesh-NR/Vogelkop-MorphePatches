package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class x8b {
    public volatile Bitmap a;
    public volatile tvk b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Matrix g;

    public x8b(Bitmap bitmap) {
        this.a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
        b(0);
        this.e = 0;
        this.f = -1;
        this.g = null;
    }

    public x8b(Image image, int i, int i2, int i3, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.b = new tvk(image);
        this.c = i;
        this.d = i2;
        b(i3);
        this.e = i3;
        this.f = 35;
        this.g = matrix;
    }

    public static void b(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public final Image.Plane[] a() {
        if (this.b == null) {
            return null;
        }
        return ((Image) this.b.a).getPlanes();
    }
}
