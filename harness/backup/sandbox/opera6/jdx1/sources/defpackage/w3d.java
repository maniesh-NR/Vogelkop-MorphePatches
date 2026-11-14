package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class w3d implements zg3 {
    public static final Bitmap.Config e = Bitmap.Config.ARGB_8888;
    public final kpj a;
    public final Set b;
    public final long c;
    public long d;

    public w3d(long j) {
        kpj kpjVar = new kpj();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.c = j;
        this.a = kpjVar;
        this.b = setUnmodifiableSet;
    }

    @Override // defpackage.zg3
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapD = d(i, i2, config);
        if (bitmapD != null) {
            return bitmapD;
        }
        if (config == null) {
            config = e;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.zg3
    public final synchronized void b(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
        if (!bitmap.isMutable() || rm5.x(bitmap) > this.c || !this.b.contains(bitmap.getConfig())) {
            if (Log.isLoggable("LruBitmapPool", 2)) {
                kpj.c(rm5.x(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
            return;
        }
        int iX = rm5.x(bitmap);
        this.a.e(bitmap);
        this.d += iX;
        if (Log.isLoggable("LruBitmapPool", 2)) {
            kpj.c(rm5.x(bitmap), bitmap.getConfig());
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Objects.toString(this.a);
        }
        f(this.c);
    }

    @Override // defpackage.zg3
    public final void c(int i) {
        if (i >= 40 || i >= 20) {
            e();
        } else if (i >= 20 || i == 15) {
            f(this.c / 2);
        }
    }

    public final synchronized Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        bitmapB = this.a.b(i, i2, config != null ? config : e);
        if (bitmapB != null) {
            this.d -= rm5.x(bitmapB);
            bitmapB.setHasAlpha(true);
            bitmapB.setPremultiplied(true);
        } else if (Log.isLoggable("LruBitmapPool", 3)) {
            kpj.c(rm5.w(i, i2, config), config);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            kpj.c(rm5.w(i, i2, config), config);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Objects.toString(this.a);
        }
        return bitmapB;
    }

    @Override // defpackage.zg3
    public final void e() {
        f(0L);
    }

    public final synchronized void f(long j) {
        while (this.d > j) {
            kpj kpjVar = this.a;
            Bitmap bitmap = (Bitmap) kpjVar.b.D();
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.a);
                }
                this.d = 0L;
                return;
            } else {
                kpjVar.a(Integer.valueOf(rm5.x(bitmap)), bitmap);
                this.d -= rm5.x(bitmap);
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    kpj.c(rm5.x(bitmap), bitmap.getConfig());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.a);
                }
                bitmap.recycle();
            }
        }
    }

    @Override // defpackage.zg3
    public final Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapD = d(i, i2, config);
        if (bitmapD != null) {
            bitmapD.eraseColor(0);
            return bitmapD;
        }
        if (config == null) {
            config = e;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
