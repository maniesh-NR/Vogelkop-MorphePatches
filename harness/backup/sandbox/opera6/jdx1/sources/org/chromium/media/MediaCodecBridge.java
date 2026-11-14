package org.chromium.media;

import J.N;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import defpackage.lgd;
import defpackage.p94;
import defpackage.wxe;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Locale;

/* loaded from: classes.dex */
public final class MediaCodecBridge {
    public static HandlerThread o;
    public static Handler p;
    public final MediaCodec a;
    public final String b;
    public int c;
    public final boolean d;
    public final ArrayDeque e;
    public MediaFormatWrapper f;
    public boolean g;
    public int h;
    public boolean i;
    public long j;
    public int k;
    public final ArrayDeque l;
    public final ArrayDeque m;
    public String[] n;

    public static class DequeueInputResult {
        public final int a;
        public final int b;

        public DequeueInputResult(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int index() {
            return this.b;
        }

        public final int status() {
            return this.a;
        }
    }

    public static class DequeueOutputResult {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        public DequeueOutputResult(int i, int i2, int i3, int i4, int i5, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = j;
            this.f = i5;
        }

        public final int flags() {
            return this.c;
        }

        public final int index() {
            return this.b;
        }

        public final int numBytes() {
            return this.f;
        }

        public final int offset() {
            return this.d;
        }

        public final long presentationTimeMicroseconds() {
            return this.e;
        }

        public final int status() {
            return this.a;
        }
    }

    public static class MediaFormatWrapper {
        public final MediaFormat a;

        public MediaFormatWrapper(MediaFormat mediaFormat) {
            this.a = mediaFormat;
        }

        public final int channelCount() {
            return this.a.getInteger("channel-count");
        }

        public final int colorRange() {
            MediaFormat mediaFormat = this.a;
            if (mediaFormat.containsKey("color-range")) {
                return mediaFormat.getInteger("color-range");
            }
            return -1;
        }

        public final int colorStandard() {
            MediaFormat mediaFormat = this.a;
            if (mediaFormat.containsKey("color-standard")) {
                return mediaFormat.getInteger("color-standard");
            }
            return -1;
        }

        public final int colorTransfer() {
            MediaFormat mediaFormat = this.a;
            if (mediaFormat.containsKey("color-transfer")) {
                return mediaFormat.getInteger("color-transfer");
            }
            return -1;
        }

        public final Rect cropRect() {
            MediaFormat mediaFormat = this.a;
            return (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) ? new Rect(mediaFormat.getInteger("crop-left"), mediaFormat.getInteger("crop-top"), mediaFormat.getInteger("crop-right") + 1, mediaFormat.getInteger("crop-bottom") + 1) : new Rect(0, 0, width(), height());
        }

        public final int height() {
            return this.a.getInteger("height");
        }

        public final int sampleRate() {
            return this.a.getInteger("sample-rate");
        }

        public final int width() {
            return this.a.getInteger("width");
        }
    }

    public static class ObtainBlockResult {
        public MediaCodec.LinearBlock a;
        public ByteBuffer b;

        public final MediaCodec.LinearBlock block() {
            return this.a;
        }

        public final ByteBuffer buffer() {
            return this.b;
        }

        @SuppressLint({"NewApi"})
        public final void recycle() {
            MediaCodec.LinearBlock linearBlock = this.a;
            if (linearBlock != null) {
                try {
                    linearBlock.recycle();
                } catch (IllegalStateException unused) {
                }
                this.a = null;
                this.b = null;
            }
        }
    }

    public MediaCodecBridge(MediaCodec mediaCodec, boolean z) {
        this.b = "unknown";
        this.a = mediaCodec;
        try {
            this.b = mediaCodec.getName();
        } catch (IllegalStateException unused) {
        }
        this.d = z;
        if (z) {
            this.g = false;
            this.e = new ArrayDeque();
            this.l = new ArrayDeque();
            this.m = new ArrayDeque();
            this.a.setCallback(new lgd(this), p);
            e();
        }
    }

    public static int a(MediaCodec.CodecException codecException) {
        int errorCode = codecException.getErrorCode();
        if (errorCode == 1100) {
            return 21;
        }
        if (errorCode == 1101) {
            return 22;
        }
        codecException.getErrorCode();
        if (codecException.getErrorCode() >= 0) {
            return 27;
        }
        ujm.a.x(codecException.getErrorCode(), "Media.MediaCodecError.NegativeCodecExceptionErrorCode");
        return 27;
    }

    public static int b(MediaCodec.CryptoException cryptoException) {
        switch (cryptoException.getErrorCode()) {
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 7;
            case 4:
                return 8;
            case 5:
                return 9;
            case 6:
                return 10;
            case 7:
                return 11;
            case 8:
                return 12;
            case 9:
                return 13;
            case 10:
                return 29;
            case 11:
                return 30;
            case 12:
                return 31;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 32;
            case 16:
                return 33;
            case 17:
                return 16;
            case 18:
                return 34;
            case 19:
                return 35;
            case 20:
                return 36;
            case 21:
                return 37;
            case 22:
                return 38;
            case 23:
                return 17;
            case 24:
                return 39;
            case 25:
                return 40;
            case 26:
                return 41;
            case 27:
                return 42;
            case 28:
                return 43;
            case 29:
            default:
                return 26;
            case 30:
                return 44;
            case 31:
                return 45;
            case 32:
                return 46;
            case 33:
                return 18;
        }
    }

    public static void createCallbackHandlerForTesting() {
        if (o != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("TestCallbackThread");
        o = handlerThread;
        handlerThread.start();
        p = new Handler(o.getLooper());
    }

    public final synchronized void c() {
        long j = this.j;
        if (j != 0) {
            N.MNqjfk23(j);
        }
    }

    public final synchronized void d(int i) {
        this.g = true;
        this.h = i;
        this.l.clear();
        this.m.clear();
        c();
    }

    public final DequeueInputResult dequeueInputBuffer(long j) {
        int i = 1;
        int i2 = -1;
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return new DequeueInputResult(this.h, -1);
                }
                if (this.i || this.l.isEmpty()) {
                    return new DequeueInputResult(1, -1);
                }
                return (DequeueInputResult) this.l.remove();
            }
        }
        int iA = 5;
        try {
            int iDequeueInputBuffer = this.a.dequeueInputBuffer(j);
            if (iDequeueInputBuffer >= 0) {
                i = 0;
                i2 = iDequeueInputBuffer;
            } else if (iDequeueInputBuffer != -1) {
                Locale locale = Locale.US;
                i = 5;
            }
            iA = i;
        } catch (MediaCodec.CodecException e) {
            iA = a(e);
        } catch (Exception unused) {
        }
        return new DequeueInputResult(iA, i2);
    }

    public final DequeueOutputResult dequeueOutputBuffer(long j) {
        int i = 3;
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return new DequeueOutputResult(this.h, -1, 0, 0, 0, 0L);
                }
                if (this.m.isEmpty()) {
                    return new DequeueOutputResult(1, -1, 0, 0, 0, 0L);
                }
                if (((DequeueOutputResult) this.m.peek()).a == 3) {
                    this.f = (MediaFormatWrapper) this.e.remove();
                }
                return (DequeueOutputResult) this.m.remove();
            }
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i2 = -1;
        try {
            int iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, j);
            if (iDequeueOutputBuffer >= 0) {
                i = 0;
                i2 = iDequeueOutputBuffer;
            } else if (iDequeueOutputBuffer == -3) {
                i = 2;
            } else if (iDequeueOutputBuffer != -2) {
                if (iDequeueOutputBuffer == -1) {
                    i = 1;
                } else {
                    Locale locale = Locale.US;
                    i = 5;
                }
            }
        } catch (IllegalStateException unused) {
            i = 24;
        }
        return new DequeueOutputResult(i, i2, bufferInfo.flags, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
    }

    public final synchronized void e() {
        this.e.clear();
        this.l.clear();
        this.m.clear();
        this.i = true;
        this.f = null;
        this.k++;
    }

    public final boolean f() {
        try {
            if (this.d) {
                synchronized (this) {
                    try {
                        if (this.g) {
                            return false;
                        }
                        Handler handler = p;
                        if (handler == null) {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        handler.post(new p94((Object) this, this.k, (byte) 4));
                    } finally {
                    }
                }
            }
            this.a.start();
            return true;
        } catch (MediaCodec.CodecException e) {
            this.h = a(e);
            return false;
        } catch (IllegalArgumentException unused) {
            this.h = 5;
            return false;
        } catch (IllegalStateException unused2) {
            this.h = 24;
            return false;
        }
    }

    public final int flush() {
        try {
            this.a.flush();
            if (!this.d) {
                return 0;
            }
            e();
            if (f()) {
                return 0;
            }
            return this.h;
        } catch (MediaCodec.CodecException e) {
            return a(e);
        } catch (Exception unused) {
            return 5;
        }
    }

    public final ByteBuffer getInputBuffer(int i) {
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return null;
                }
            }
        }
        try {
            return this.a.getInputBuffer(i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int getMaxInputSize() {
        return this.c;
    }

    public final String getName() {
        return this.b;
    }

    public final ByteBuffer getOutputBuffer(int i) {
        try {
            return this.a.getOutputBuffer(i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final MediaFormatWrapper getOutputFormat() {
        MediaFormatWrapper mediaFormatWrapper;
        if (this.d && (mediaFormatWrapper = this.f) != null) {
            return mediaFormatWrapper;
        }
        try {
            MediaFormat outputFormat = this.a.getOutputFormat();
            if (outputFormat != null) {
                return new MediaFormatWrapper(outputFormat);
            }
            return null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final boolean isSoftwareCodec() {
        try {
            return MediaCodecUtil.c(this.a.getCodecInfo());
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public final ObtainBlockResult obtainBlock(int i) {
        MediaCodec.LinearBlock linearBlockObtain;
        ByteBuffer byteBuffer;
        ByteBuffer map = null;
        MediaCodec.LinearBlock linearBlock = null;
        map = null;
        try {
            String[] strArr = this.n;
            if (strArr == null) {
                strArr = new String[]{this.b};
                this.n = strArr;
            }
            if (i < 16) {
                i = 16;
            }
            linearBlockObtain = MediaCodec.LinearBlock.obtain(i, strArr);
            if (linearBlockObtain != null) {
                try {
                    map = linearBlockObtain.map();
                } catch (Exception unused) {
                    if (linearBlockObtain != null) {
                        try {
                            linearBlockObtain.recycle();
                        } catch (IllegalStateException unused2) {
                        }
                        byteBuffer = null;
                    } else {
                        ByteBuffer byteBuffer2 = map;
                        linearBlock = linearBlockObtain;
                        byteBuffer = byteBuffer2;
                    }
                    ObtainBlockResult obtainBlockResult = new ObtainBlockResult();
                    obtainBlockResult.a = linearBlock;
                    obtainBlockResult.b = byteBuffer;
                    return obtainBlockResult;
                }
            }
        } catch (Exception unused3) {
            linearBlockObtain = null;
        }
        ByteBuffer byteBuffer22 = map;
        linearBlock = linearBlockObtain;
        byteBuffer = byteBuffer22;
        ObtainBlockResult obtainBlockResult2 = new ObtainBlockResult();
        obtainBlockResult2.a = linearBlock;
        obtainBlockResult2.b = byteBuffer;
        return obtainBlockResult2;
    }

    @SuppressLint({"NewApi"})
    public final int queueInputBlock(int i, MediaCodec.LinearBlock linearBlock, int i2, int i3, long j, int i4) {
        try {
            MediaCodec.QueueRequest queueRequest = this.a.getQueueRequest(i);
            queueRequest.setLinearBlock(linearBlock, i2, i3);
            queueRequest.setPresentationTimeUs(j);
            queueRequest.setFlags(i4);
            queueRequest.queue();
            return 0;
        } catch (Exception unused) {
            return 23;
        }
    }

    public final int queueInputBuffer(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        try {
            this.a.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (MediaCodec.CodecException e) {
            return a(e);
        } catch (MediaCodec.CryptoException e2) {
            return b(e2);
        } catch (Exception unused) {
            return 5;
        }
    }

    @SuppressLint({"NewApi"})
    public final int queueSecureInputBlock(int i, MediaCodec.LinearBlock linearBlock, int i2, int i3, byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, long j, int i8) {
        int i9;
        if (i5 == 0) {
            i9 = 0;
        } else if (i5 == 1) {
            i9 = 1;
        } else if (i5 != 2) {
            try {
                Locale locale = Locale.US;
                i9 = -1;
            } catch (MediaCodec.CodecException e) {
                e.getDiagnosticInfo();
                Locale locale2 = Locale.US;
                return a(e);
            } catch (MediaCodec.CryptoException e2) {
                if (e2.getErrorCode() != 1) {
                    return b(e2);
                }
                wxe.t("Failed to queue secure input block: CryptoException.ERROR_NO_KEY", new Object[0]);
                return 4;
            } catch (IllegalArgumentException unused) {
                return 5;
            } catch (IllegalStateException unused2) {
                return 24;
            } catch (Exception unused3) {
                return 23;
            }
        } else {
            i9 = 2;
        }
        int i10 = i9 == -1 ? 19 : (i9 == 2 || i6 == 0 || i7 == 0) ? 0 : 20;
        if (i10 != 0) {
            return i10;
        }
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        cryptoInfo.set(i4, iArr, iArr2, bArr2, bArr, i9);
        if (i9 == 2 && i6 != 0 && i7 != 0) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(i6, i7));
        }
        MediaCodec.QueueRequest queueRequest = this.a.getQueueRequest(i);
        queueRequest.setEncryptedLinearBlock(linearBlock, i2, i3, cryptoInfo);
        queueRequest.setPresentationTimeUs(j);
        queueRequest.setFlags(i8);
        queueRequest.queue();
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public final int queueSecureInputBuffer(int i, int i2, byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, long j) throws MediaCodec.CryptoException {
        int i7;
        if (i4 == 0) {
            i7 = 0;
        } else if (i4 == 1) {
            i7 = 1;
        } else if (i4 != 2) {
            try {
                Locale locale = Locale.US;
                i7 = -1;
            } catch (MediaCodec.CodecException e) {
                e.getDiagnosticInfo();
                Locale locale2 = Locale.US;
                return a(e);
            } catch (MediaCodec.CryptoException e2) {
                if (e2.getErrorCode() == 1) {
                    wxe.t("Failed to queue secure input buffer: CryptoException.ERROR_NO_KEY", new Object[0]);
                    return 4;
                }
                e2.getErrorCode();
                return b(e2);
            } catch (IllegalArgumentException unused) {
                return 5;
            } catch (IllegalStateException unused2) {
                return 24;
            }
        } else {
            i7 = 2;
        }
        int i8 = i7 == -1 ? 19 : (i7 == 2 || i5 == 0 || i6 == 0) ? 0 : 20;
        if (i8 != 0) {
            return i8;
        }
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        cryptoInfo.set(i3, iArr, iArr2, bArr2, bArr, i7);
        if (i7 == 2 && i5 != 0 && i6 != 0) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(i5, i6));
        }
        this.a.queueSecureInputBuffer(i, i2, cryptoInfo, j, 0);
        return 0;
    }

    public final void release() {
        if (this.d) {
            synchronized (this) {
                this.j = 0L;
            }
        }
        try {
            Locale locale = Locale.US;
            this.a.release();
        } catch (IllegalStateException unused) {
        }
    }

    public final void releaseOutputBuffer(int i, boolean z) {
        if (this.d) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
            }
        }
        try {
            this.a.releaseOutputBuffer(i, z);
        } catch (IllegalStateException unused) {
        }
    }

    public final synchronized void setBuffersAvailableListener(long j) {
        this.j = j;
        if (!this.l.isEmpty() || !this.m.isEmpty() || this.g) {
            c();
        }
    }

    public final boolean setSurface(Surface surface) {
        try {
            this.a.setOutputSurface(surface);
            return true;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            return false;
        }
    }

    public final void stop() {
        try {
            this.a.stop();
            if (this.d) {
                e();
            }
        } catch (IllegalStateException unused) {
        }
    }
}
