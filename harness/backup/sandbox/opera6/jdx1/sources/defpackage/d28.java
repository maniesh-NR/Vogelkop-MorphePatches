package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class d28 extends MediaCodec.Callback {
    public final w4n a;
    public final boolean b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k;
    public final /* synthetic */ f28 l;

    public d28(f28 f28Var) {
        this.l = f28Var;
        this.b = true;
        boolean z = f28Var.b;
        this.k = z;
        if (z) {
            this.a = new w4n(f28Var.p, f28Var.o, (CameraUseInconsistentTimebaseQuirk) b77.a.b(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) b77.a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(f28Var.c.getString("mime"))) {
            return;
        }
        this.b = false;
    }

    public final void a() {
        f28 f28Var;
        v18 v18Var;
        Executor executor;
        f28 f28Var2 = this.l;
        if (this.e) {
            return;
        }
        this.e = true;
        ScheduledFuture scheduledFuture = f28Var2.D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            f28Var2 = this.l;
            f28Var2.D = null;
        }
        synchronized (f28Var2.a) {
            f28Var = this.l;
            v18Var = f28Var.s;
            executor = f28Var.t;
        }
        f28Var.i(new gl6(this, executor, v18Var, (byte) 18));
    }

    public final void b(q18 q18Var, v18 v18Var, Executor executor) {
        f28 f28Var = this.l;
        f28Var.m.add(q18Var);
        ListenableFuture listenableFutureO = k1g.O(q18Var.d);
        byte b = 15;
        pad padVar = new pad(b, (Object) this, (Object) q18Var, false);
        listenableFutureO.addListener(new wr9(listenableFutureO, padVar, (byte) 0), f28Var.g);
        try {
            executor.execute(new cn7(v18Var, q18Var, b));
        } catch (RejectedExecutionException unused) {
            q18Var.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.l.g.execute(new cn7(this, codecException, (byte) 13));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.l.g.execute(new br(this, i, (byte) 10));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.l.g.execute(new sh3((Object) this, (Object) bufferInfo, (Object) mediaCodec, i, (byte) 1));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        Objects.toString(mediaFormat);
        yi4.l(mediaFormat.getByteBuffer("csd-0"));
        if (mediaFormat.containsKey("csd-1")) {
            yi4.l(mediaFormat.getByteBuffer("csd-1"));
        }
        if (mediaFormat.containsKey("csd-2")) {
            yi4.l(mediaFormat.getByteBuffer("csd-2"));
        }
        this.l.g.execute(new cn7(this, mediaFormat, (byte) 14));
    }
}
