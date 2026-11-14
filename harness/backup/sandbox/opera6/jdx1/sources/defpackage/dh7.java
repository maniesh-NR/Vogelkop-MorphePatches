package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class dh7 {
    public static final mrf f = mrf.a(aj6.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final mrf g = mrf.a(tsg.a, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    public static final mrf h;
    public static final mrf i;
    public static final wu5 j;
    public static final ArrayDeque k;
    public final zg3 a;
    public final DisplayMetrics b;
    public final jl6 c;
    public final ArrayList d;
    public final m7a e = m7a.a();

    static {
        bh7 bh7Var = bh7.b;
        Boolean bool = Boolean.FALSE;
        h = mrf.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = mrf.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new wu5();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public dh7(ArrayList arrayList, DisplayMetrics displayMetrics, zg3 zg3Var, jl6 jl6Var) {
        this.d = arrayList;
        qyn.l(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        this.a = zg3Var;
        this.c = jl6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(defpackage.rya r8, android.graphics.BitmapFactory.Options r9, defpackage.ch7 r10, defpackage.zg3 r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.a()
            r8.c()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.h2m.b
            r3.lock()
            android.graphics.Bitmap r8 = r8.a(r9)     // Catch: java.lang.IllegalArgumentException -> L1d java.lang.Throwable -> L58
            r3.unlock()
            return r8
        L1d:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = sko.o(r0, r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L58
            r0.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L58
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L58
            r0.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L58
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L58
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L57
            r11.b(r0)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            r0 = 0
            r9.inBitmap = r0     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            java.util.concurrent.locks.Lock r9 = defpackage.h2m.b
            r9.unlock()
            return r8
        L56:
            throw r4     // Catch: java.lang.Throwable -> L58
        L57:
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = defpackage.h2m.b
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh7.c(rya, android.graphics.BitmapFactory$Options, ch7, zg3):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final ah3 a(rya ryaVar, int i2, int i3, trf trfVar, ch7 ch7Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.i(byte[].class, 65536);
        synchronized (dh7.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                try {
                    options = (BitmapFactory.Options) arrayDeque.poll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        aj6 aj6Var = (aj6) trfVar.c(f);
        tsg tsgVar = (tsg) trfVar.c(g);
        bh7 bh7Var = (bh7) trfVar.c(bh7.e);
        boolean zBooleanValue = ((Boolean) trfVar.c(h)).booleanValue();
        mrf mrfVar = i;
        try {
            ah3 ah3VarC = ah3.c(this.a, b(ryaVar, options, bh7Var, aj6Var, tsgVar, trfVar.c(mrfVar) != null && ((Boolean) trfVar.c(mrfVar)).booleanValue(), i2, i3, zBooleanValue, ch7Var));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.o(bArr);
            return ah3VarC;
        } catch (Throwable th2) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.o(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(defpackage.rya r32, android.graphics.BitmapFactory.Options r33, defpackage.bh7 r34, defpackage.aj6 r35, defpackage.tsg r36, boolean r37, int r38, int r39, boolean r40, defpackage.ch7 r41) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh7.b(rya, android.graphics.BitmapFactory$Options, bh7, aj6, tsg, boolean, int, int, boolean, ch7):android.graphics.Bitmap");
    }
}
