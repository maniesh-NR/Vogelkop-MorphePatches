package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bzk implements jgd {
    public final MediaCodec a;
    public final r3d b;

    public bzk(MediaCodec mediaCodec, r3d r3dVar) {
        this.a = mediaCodec;
        this.b = r3dVar;
        if (Build.VERSION.SDK_INT < 35 || r3dVar == null) {
            return;
        }
        r3dVar.a(mediaCodec);
    }

    @Override // defpackage.jgd
    public final void a(int i, d36 d36Var, long j, int i2) throws MediaCodec.CryptoException {
        this.a.queueSecureInputBuffer(i, 0, d36Var.i, j, i2);
    }

    @Override // defpackage.jgd
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.jgd
    public final void c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.jgd
    public final MediaFormat d() {
        return this.a.getOutputFormat();
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
        this.a.flush();
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
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.jgd
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
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
        this.a.setOnFrameRenderedListener(new re2(this, bhdVar, (byte) 1), handler);
    }

    @Override // defpackage.jgd
    public final void q(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // defpackage.jgd
    public final void release() {
        r3d r3dVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && r3dVar != null) {
                r3dVar.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && r3dVar != null) {
                r3dVar.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.jgd
    public final void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }
}
