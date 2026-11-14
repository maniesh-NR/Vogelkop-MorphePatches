package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class te2 implements jgd {
    public final MediaCodec a;
    public final xe2 b;
    public final mgd c;
    public final r3d d;
    public boolean e;
    public byte f = 0;

    public te2(MediaCodec mediaCodec, HandlerThread handlerThread, mgd mgdVar, r3d r3dVar) {
        this.a = mediaCodec;
        this.b = new xe2(handlerThread);
        this.c = mgdVar;
        this.d = r3dVar;
    }

    public static String r(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.jgd
    public final void a(int i, d36 d36Var, long j, int i2) {
        this.c.a(i, d36Var, j, i2);
    }

    @Override // defpackage.jgd
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.jgd
    public final void c(int i, int i2, int i3, long j) {
        this.c.c(i, i2, i3, j);
    }

    @Override // defpackage.jgd
    public final MediaFormat d() {
        MediaFormat mediaFormat;
        xe2 xe2Var = this.b;
        synchronized (xe2Var.a) {
            mediaFormat = xe2Var.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.jgd
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.jgd
    public final ByteBuffer f(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.jgd
    public final void flush() {
        this.c.flush();
        this.a.flush();
        xe2 xe2Var = this.b;
        synchronized (xe2Var.a) {
            xe2Var.l++;
            Handler handler = xe2Var.c;
            String str = tym.a;
            handler.post(new q02(xe2Var, (byte) 12));
        }
        this.a.start();
    }

    @Override // defpackage.jgd
    public final void g(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.jgd
    public final void h(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.jgd
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.jgd
    public final int j() {
        this.c.i();
        xe2 xe2Var = this.b;
        synchronized (xe2Var.a) {
            xe2Var.b();
            int i = -1;
            if (xe2Var.l > 0 || xe2Var.m) {
                return -1;
            }
            r05 r05Var = xe2Var.d;
            int i2 = r05Var.b;
            int i3 = r05Var.c;
            if (!(i2 == i3)) {
                if (i2 == i3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                i = ((int[]) r05Var.e)[i2];
                r05Var.b = (i2 + 1) & r05Var.d;
            }
            return i;
        }
    }

    @Override // defpackage.jgd
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        this.c.i();
        xe2 xe2Var = this.b;
        synchronized (xe2Var.a) {
            xe2Var.b();
            if (xe2Var.l > 0 || xe2Var.m) {
                return -1;
            }
            r05 r05Var = xe2Var.e;
            int i = r05Var.b;
            int i2 = r05Var.c;
            if (i == i2) {
                return -1;
            }
            if (i == i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = ((int[]) r05Var.e)[i];
            r05Var.b = (i + 1) & r05Var.d;
            if (i3 >= 0) {
                xe2Var.h.getClass();
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) xe2Var.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (i3 == -2) {
                xe2Var.h = (MediaFormat) xe2Var.g.remove();
            }
            return i3;
        }
    }

    @Override // defpackage.jgd
    public final boolean l(qfb qfbVar) {
        xe2 xe2Var = this.b;
        synchronized (xe2Var.a) {
            xe2Var.o = qfbVar;
        }
        return true;
    }

    @Override // defpackage.jgd
    public final void m(zr9 zr9Var) {
        xe2 xe2Var = this.b;
        xa xaVar = new xa(this, zr9Var, (byte) 22);
        synchronized (xe2Var.a) {
            xe2Var.b();
            xaVar.run();
        }
    }

    @Override // defpackage.jgd
    public final ByteBuffer n(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.jgd
    public final void o(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.jgd
    public final void p(bhd bhdVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new re2(this, bhdVar, (byte) 0), handler);
    }

    @Override // defpackage.jgd
    public final void q(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0081 A[PHI: r0 r1
      0x0081: PHI (r0v6 'th' java.lang.Throwable) = (r0v1 'th' java.lang.Throwable), (r0v7 'th' java.lang.Throwable) binds: [B:50:0x007f, B:31:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r1v5 r3d) = (r1v2 r3d), (r1v7 r3d) binds: [B:50:0x007f, B:31:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.jgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void release() throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 33
            r1 = 30
            r2 = 35
            r3 = 1
            byte r4 = r7.f     // Catch: java.lang.Throwable -> L55
            if (r4 != r3) goto L25
            mgd r4 = r7.c     // Catch: java.lang.Throwable -> L55
            r4.shutdown()     // Catch: java.lang.Throwable -> L55
            xe2 r4 = r7.b     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r4.a     // Catch: java.lang.Throwable -> L55
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L55
            r4.m = r3     // Catch: java.lang.Throwable -> L23
            android.os.HandlerThread r6 = r4.b     // Catch: java.lang.Throwable -> L23
            r6.quit()     // Catch: java.lang.Throwable -> L23
            r4.a()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            goto L25
        L21:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L55
        L23:
            r4 = move-exception
            goto L21
        L25:
            r4 = 2
            r7.f = r4     // Catch: java.lang.Throwable -> L55
            boolean r4 = r7.e
            if (r4 != 0) goto L54
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4a
            if (r4 < r1) goto L37
            if (r4 >= r0) goto L37
            android.media.MediaCodec r0 = r7.a     // Catch: java.lang.Throwable -> L4a
            r0.stop()     // Catch: java.lang.Throwable -> L4a
        L37:
            if (r4 < r2) goto L42
            r3d r0 = r7.d
            if (r0 == 0) goto L42
            android.media.MediaCodec r1 = r7.a
            r0.c(r1)
        L42:
            android.media.MediaCodec r0 = r7.a
            r0.release()
            r7.e = r3
            return
        L4a:
            r0 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L86
            r3d r1 = r7.d
            if (r1 == 0) goto L86
            goto L81
        L54:
            return
        L55:
            r4 = move-exception
            boolean r5 = r7.e
            if (r5 != 0) goto L8e
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L78
            if (r5 < r1) goto L65
            if (r5 >= r0) goto L65
            android.media.MediaCodec r0 = r7.a     // Catch: java.lang.Throwable -> L78
            r0.stop()     // Catch: java.lang.Throwable -> L78
        L65:
            if (r5 < r2) goto L70
            r3d r0 = r7.d
            if (r0 == 0) goto L70
            android.media.MediaCodec r1 = r7.a
            r0.c(r1)
        L70:
            android.media.MediaCodec r0 = r7.a
            r0.release()
            r7.e = r3
            goto L8e
        L78:
            r0 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L86
            r3d r1 = r7.d
            if (r1 == 0) goto L86
        L81:
            android.media.MediaCodec r2 = r7.a
            r1.c(r2)
        L86:
            android.media.MediaCodec r1 = r7.a
            r1.release()
            r7.e = r3
            throw r0
        L8e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te2.release():void");
    }

    public final void s(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        r3d r3dVar;
        xe2 xe2Var = this.b;
        HandlerThread handlerThread = xe2Var.b;
        z4o.H(xe2Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(xe2Var, handler);
        xe2Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (r3dVar = this.d) != null) {
            r3dVar.a(mediaCodec);
        }
        this.f = (byte) 1;
    }

    @Override // defpackage.jgd
    public final void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }
}
