package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import defpackage.bl9;
import defpackage.jya;
import defpackage.lya;
import defpackage.qya;
import defpackage.vva;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(qya qyaVar) {
        if (g(qyaVar)) {
            int width = qyaVar.getWidth();
            int height = qyaVar.getHeight();
            int iR = qyaVar.A0()[0].R();
            int iR2 = qyaVar.A0()[1].R();
            int iR3 = qyaVar.A0()[2].R();
            int iI0 = qyaVar.A0()[0].i0();
            int iI02 = qyaVar.A0()[1].i0();
            nativeShiftPixel(qyaVar.A0()[0].u(), iR, qyaVar.A0()[1].u(), iR2, qyaVar.A0()[2].u(), iR3, iI0, iI02, width, height, iI0, iI02, iI02);
        }
    }

    public static qya b(bl9 bl9Var, byte[] bArr) {
        jpo.j(bl9Var.i() == 256);
        bArr.getClass();
        Surface surface = bl9Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            return null;
        }
        return bl9Var.e();
    }

    public static Bitmap c(qya qyaVar) {
        if (qyaVar.getFormat() != 35) {
            qp2.o("Input image format must be YUV_420_888");
            return null;
        }
        int width = qyaVar.getWidth();
        int height = qyaVar.getHeight();
        int iR = qyaVar.A0()[0].R();
        int iR2 = qyaVar.A0()[1].R();
        int iR3 = qyaVar.A0()[2].R();
        int iI0 = qyaVar.A0()[0].i0();
        int iI02 = qyaVar.A0()[1].i0();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(qyaVar.getWidth(), qyaVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(qyaVar.A0()[0].u(), iR, qyaVar.A0()[1].u(), iR2, qyaVar.A0()[2].u(), iR3, iI0, iI02, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        yt7.k("YUV to RGB conversion failed");
        return null;
    }

    public static vva d(qya qyaVar, uya uyaVar, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        if (!g(qyaVar)) {
            return null;
        }
        System.currentTimeMillis();
        if (!f(i)) {
            return null;
        }
        Surface surface = uyaVar.getSurface();
        int width = qyaVar.getWidth();
        int height = qyaVar.getHeight();
        int iR = qyaVar.A0()[0].R();
        int iR2 = qyaVar.A0()[1].R();
        int iR3 = qyaVar.A0()[2].R();
        int iI0 = qyaVar.A0()[0].i0();
        int iI02 = qyaVar.A0()[1].i0();
        if (z) {
            i2 = iI0;
            i3 = iI02;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (nativeConvertAndroid420ToABGR(qyaVar.A0()[0].u(), iR, qyaVar.A0()[1].u(), iR2, qyaVar.A0()[2].u(), iR3, iI0, iI02, surface, byteBuffer, width, height, i2, i3, i3, i) != 0) {
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            a++;
        }
        qya qyaVarE = uyaVar.e();
        if (qyaVarE == null) {
            return null;
        }
        vva vvaVar = new vva(qyaVarE);
        vvaVar.h(new jya(qyaVarE, qyaVar, (byte) 0));
        return vvaVar;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean f(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean g(qya qyaVar) {
        return qyaVar.getFormat() == 35 && qyaVar.A0().length == 3;
    }

    public static vva h(qya qyaVar, uya uyaVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (!g(qyaVar) || !f(i) || i <= 0) {
            return null;
        }
        int width = qyaVar.getWidth();
        int height = qyaVar.getHeight();
        int iR = qyaVar.A0()[0].R();
        int iR2 = qyaVar.A0()[1].R();
        int iR3 = qyaVar.A0()[2].R();
        int iI0 = qyaVar.A0()[1].i0();
        Image imageDequeueInputImage = imageWriter.dequeueInputImage();
        if (imageDequeueInputImage == null || nativeRotateYUV(qyaVar.A0()[0].u(), iR, qyaVar.A0()[1].u(), iR2, qyaVar.A0()[2].u(), iR3, iI0, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
            return null;
        }
        imageWriter.queueInputImage(imageDequeueInputImage);
        qya qyaVarE = uyaVar.e();
        if (qyaVarE == null) {
            return null;
        }
        vva vvaVar = new vva(qyaVarE);
        vvaVar.h(new jya(qyaVarE, qyaVar, (byte) 1));
        return vvaVar;
    }

    public static vva i(qya qyaVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        int height;
        int width;
        if (!g(qyaVar) || !f(i)) {
            return null;
        }
        if (i == 0 && qyaVar.A0().length == 3 && qyaVar.A0()[1].i0() == 2 && nativeGetYUVImageVUOff(qyaVar.A0()[2].u(), qyaVar.A0()[1].u()) == -1) {
            return null;
        }
        if (i % 180 == 0) {
            height = qyaVar.getWidth();
            width = qyaVar.getHeight();
        } else {
            height = qyaVar.getHeight();
            width = qyaVar.getWidth();
        }
        int i2 = height;
        int i3 = width;
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(qyaVar.A0()[0].u(), qyaVar.A0()[0].R(), qyaVar.A0()[1].u(), qyaVar.A0()[1].R(), qyaVar.A0()[2].u(), qyaVar.A0()[2].R(), qyaVar.A0()[2].i0(), byteBuffer4, i2, 1, byteBufferNativeNewDirectByteBuffer, i2, 2, byteBuffer5, i2, 2, byteBuffer, byteBuffer2, byteBuffer3, qyaVar.getWidth(), qyaVar.getHeight(), i) != 0) {
            return null;
        }
        return new vva(new lya(qyaVar, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, i2, i3));
    }

    public static void j(byte[] bArr, Surface surface) {
        surface.getClass();
        nativeWriteJpegToSurface(bArr, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
