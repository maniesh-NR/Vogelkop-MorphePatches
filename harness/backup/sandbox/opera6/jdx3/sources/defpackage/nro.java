package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileDescriptor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class nro {
    public static final byte[] a = new byte[16384];
    public static final BitmapFactory.Options b = new BitmapFactory.Options();
    public static final ReentrantLock c = new ReentrantLock();

    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        if (i4 <= i2 && i3 <= i) {
            return 1;
        }
        int i6 = i4 / 2;
        int i7 = i3 / 2;
        while (i6 / i5 > i2 && i7 / i5 > i) {
            i5 <<= 1;
        }
        return i5;
    }

    public static Bitmap b(FileDescriptor fileDescriptor, int i, int i2) {
        ReentrantLock reentrantLock = c;
        if (!reentrantLock.tryLock()) {
            return c(fileDescriptor, i, i2, new BitmapFactory.Options());
        }
        try {
            BitmapFactory.Options options = b;
            options.inTempStorage = a;
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            options.inPreferredConfig = Bitmap.Config.RGB_565 == null ? Bitmap.Config.ARGB_8888 : null;
            return c(fileDescriptor, i, i2, options);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static Bitmap c(FileDescriptor fileDescriptor, int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmapCopy;
        options.inJustDecodeBounds = true;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeFileDescriptor = null;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        try {
            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError unused) {
        }
        return (bitmapDecodeFileDescriptor == null || bitmapDecodeFileDescriptor.getConfig() != Bitmap.Config.ARGB_8888 || bitmapDecodeFileDescriptor.hasAlpha() || (bitmapCopy = bitmapDecodeFileDescriptor.copy(Bitmap.Config.RGB_565, true)) == null) ? bitmapDecodeFileDescriptor : bitmapCopy;
    }

    public static Bitmap d(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmapDecodeByteArray;
        Bitmap bitmapCopy;
        options.inJustDecodeBounds = true;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        try {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (OutOfMemoryError unused) {
            bitmapDecodeByteArray = null;
        }
        return (bitmapDecodeByteArray == null || bitmapDecodeByteArray.getConfig() != Bitmap.Config.ARGB_8888 || bitmapDecodeByteArray.hasAlpha() || (bitmapCopy = bitmapDecodeByteArray.copy(Bitmap.Config.RGB_565, true)) == null) ? bitmapDecodeByteArray : bitmapCopy;
    }
}
