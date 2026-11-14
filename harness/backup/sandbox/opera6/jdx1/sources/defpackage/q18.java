package defpackage;

import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q18 implements AutoCloseable {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final o94 d;
    public final l94 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public q18(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        mediaCodec.getOutputBuffer(i);
        bufferInfo.getClass();
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            atomicReference.set(l94Var);
            l94Var.a = "Data closed";
        } catch (Exception e) {
            o94Var.a(e);
        }
        this.d = o94Var;
        l94 l94Var2 = (l94) atomicReference.get();
        l94Var2.getClass();
        this.e = l94Var2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        l94 l94Var = this.e;
        if (this.f.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            l94Var.b(null);
        } catch (IllegalStateException e) {
            l94Var.d(e);
        }
    }

    public final long size() {
        return this.b.size;
    }
}
