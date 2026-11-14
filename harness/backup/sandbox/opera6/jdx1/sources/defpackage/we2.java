package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class we2 implements mgd {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public ue2 c;
    public final AtomicReference d;
    public final rj5 e;
    public boolean f;

    public we2(MediaCodec mediaCodec, HandlerThread handlerThread) {
        rj5 rj5Var = new rj5(0);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = rj5Var;
        this.d = new AtomicReference();
    }

    public static ve2 d() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new ve2();
            }
            return (ve2) arrayDeque.removeFirst();
        }
    }

    @Override // defpackage.mgd
    public final void a(int i, d36 d36Var, long j, int i2) {
        i();
        ve2 ve2VarD = d();
        ve2VarD.a = i;
        ve2VarD.b = 0;
        ve2VarD.d = j;
        ve2VarD.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = ve2VarD.c;
        cryptoInfo.numSubSamples = d36Var.f;
        int[] iArr = d36Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = d36Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = d36Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = d36Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = d36Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(d36Var.g, d36Var.h));
        ue2 ue2Var = this.c;
        String str = tym.a;
        ue2Var.obtainMessage(2, ve2VarD).sendToTarget();
    }

    @Override // defpackage.mgd
    public final void b(Bundle bundle) {
        i();
        ue2 ue2Var = this.c;
        String str = tym.a;
        ue2Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.mgd
    public final void c(int i, int i2, int i3, long j) {
        i();
        ve2 ve2VarD = d();
        ve2VarD.a = i;
        ve2VarD.b = i2;
        ve2VarD.d = j;
        ve2VarD.e = i3;
        ue2 ue2Var = this.c;
        String str = tym.a;
        ue2Var.obtainMessage(1, ve2VarD).sendToTarget();
    }

    @Override // defpackage.mgd
    public final void flush() {
        if (this.f) {
            try {
                ue2 ue2Var = this.c;
                ue2Var.getClass();
                ue2Var.removeCallbacksAndMessages(null);
                rj5 rj5Var = this.e;
                synchronized (rj5Var) {
                    rj5Var.b = false;
                }
                ue2 ue2Var2 = this.c;
                ue2Var2.getClass();
                ue2Var2.obtainMessage(3).sendToTarget();
                synchronized (rj5Var) {
                    while (!rj5Var.b) {
                        rj5Var.a.getClass();
                        rj5Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                h9o.o(e);
            }
        }
    }

    @Override // defpackage.mgd
    public final void i() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.mgd
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.mgd
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new ue2(this, handlerThread.getLooper(), (byte) 0);
        this.f = true;
    }
}
