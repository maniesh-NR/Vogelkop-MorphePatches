package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f28 {
    public static final Range F = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public ScheduledFuture D;
    public int E;
    public final boolean b;
    public final MediaFormat c;
    public final MediaCodec d;
    public final s18 e;
    public final n1 f;
    public final b2j g;
    public final ListenableFuture h;
    public final l94 i;
    public final zpl o;
    public final z8b p;
    public final Rational q;
    public final boolean r;
    public final Object a = new Object();
    public final ArrayDeque j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();
    public final HashSet l = new HashSet();
    public final HashSet m = new HashSet();
    public final ArrayDeque n = new ArrayDeque();
    public v18 s = v18.Xo;
    public Executor t = n97.a();
    public Range u = F;
    public long v = 0;
    public boolean w = false;
    public Long x = null;
    public ScheduledFuture y = null;
    public d28 z = null;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;

    public f28(Executor executor, x18 x18Var, int i) throws IOException, rib {
        Rational rational;
        boolean z;
        boolean z2 = false;
        executor.getClass();
        LruCache lruCache = k75.a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(x18Var.c());
            this.d = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.g = new b2j(executor);
            MediaFormat mediaFormatD = x18Var.d();
            this.c = mediaFormatD;
            zpl zplVarE = x18Var.e();
            this.o = zplVarE;
            this.p = new z8b(new uk6(this, (byte) 21), new drj((byte) 4));
            if (x18Var instanceof rm2) {
                this.b = false;
                this.e = new b28(this);
                jg2 jg2Var = new jg2(codecInfo, null);
                ((MediaCodecInfo.CodecCapabilities) ((n1) jg2Var).b).getAudioCapabilities();
                this.f = jg2Var;
                rational = new Rational(0, 0);
                this.q = rational;
                z = false;
            } else {
                if (!(x18Var instanceof ep2)) {
                    throw new rib("Unknown encoder config type");
                }
                ep2 ep2Var = (ep2) x18Var;
                this.b = true;
                this.e = new e28(this);
                w3n w3nVar = new w3n(codecInfo, ep2Var.a);
                if (mediaFormatD.containsKey("bitrate")) {
                    int integer = mediaFormatD.getInteger("bitrate");
                    int iIntValue = ((Integer) w3nVar.c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatD.setInteger("bitrate", iIntValue);
                    }
                }
                this.f = w3nVar;
                Rational rational2 = new Rational(ep2Var.g, ep2Var.h);
                this.q = rational2;
                rational = rational2;
                z = true;
            }
            Objects.toString(zplVarE);
            Objects.toString(mediaFormatD);
            Objects.toString(rational);
            try {
                f();
                AtomicReference atomicReference = new AtomicReference();
                l94 l94Var = new l94();
                l94Var.c = new byh();
                o94 o94Var = new o94(l94Var);
                l94Var.b = o94Var;
                l94Var.a = vep.class;
                try {
                    atomicReference.set(l94Var);
                    l94Var.a = "mReleasedFuture";
                } catch (Exception e) {
                    o94Var.a(e);
                }
                this.h = k1g.O(o94Var);
                l94 l94Var2 = (l94) atomicReference.get();
                l94Var2.getClass();
                this.i = l94Var2;
                if (z && ((i == 1 && b77.a.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) || b77.a.b(GLProcessingStuckOnCodecFlushQuirk.class) != null)) {
                    z2 = true;
                }
                this.r = z2;
                g(1);
            } catch (MediaCodec.CodecException e2) {
                throw new rib(e2);
            }
        } catch (IOException e3) {
            throw new rib(e3);
        } catch (IllegalArgumentException e4) {
            throw new rib(e4);
        }
    }

    public final void a(int i, String str, Throwable th) {
        switch (vep.A(this.E)) {
            case 0:
                c(i, str, th);
                f();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                g(8);
                i(new gg7(this, i, str, th));
                break;
        }
    }

    public final void b() throws MediaCodec.CryptoException {
        while (true) {
            ArrayDeque arrayDeque = this.k;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.j;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            l94 l94Var = (l94) arrayDeque.poll();
            Objects.requireNonNull(l94Var);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                a28 a28Var = new a28(this, this.d, num.intValue());
                if (l94Var.b(a28Var)) {
                    this.l.add(a28Var);
                    k1g.O(a28Var.d).addListener(new cn7(this, a28Var, (byte) 6), this.g);
                } else {
                    l94 l94Var2 = a28Var.e;
                    if (!a28Var.f.getAndSet(true)) {
                        try {
                            a28Var.a.queueInputBuffer(a28Var.b, 0, 0, 0L, 0);
                            l94Var2.b(null);
                        } catch (IllegalStateException e) {
                            l94Var2.d(e);
                        }
                    }
                }
            } catch (MediaCodec.CodecException e2) {
                a(1, e2.getMessage(), e2);
                return;
            }
        }
    }

    public final void c(int i, String str, Throwable th) {
        v18 v18Var;
        Executor executor;
        synchronized (this.a) {
            v18Var = this.s;
            executor = this.t;
        }
        try {
            executor.execute(new gl6(v18Var, i, str, th));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void d() {
        Surface surface;
        if (this.A) {
            if (!this.r) {
                this.d.stop();
            }
            this.A = false;
        }
        this.d.release();
        s18 s18Var = this.e;
        if (s18Var instanceof e28) {
            e28 e28Var = (e28) s18Var;
            synchronized (e28Var.a) {
                surface = e28Var.b;
                e28Var.b = null;
            }
            if (surface != null) {
                surface.release();
            }
        }
        g(9);
        this.i.b(null);
    }

    public final void e() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.d.setParameters(bundle);
    }

    public final void f() {
        Surface surfaceCreatePersistentInputSurface;
        MediaCodec mediaCodec = this.d;
        this.u = F;
        this.v = 0L;
        this.n.clear();
        this.j.clear();
        ArrayDeque arrayDeque = this.k;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((l94) it.next()).c();
        }
        arrayDeque.clear();
        mediaCodec.reset();
        this.A = false;
        this.B = false;
        this.C = false;
        this.w = false;
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.y = null;
        }
        ScheduledFuture scheduledFuture2 = this.D;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.D = null;
        }
        d28 d28Var = this.z;
        if (d28Var != null) {
            d28Var.j = true;
        }
        d28 d28Var2 = new d28(this);
        this.z = d28Var2;
        mediaCodec.setCallback(d28Var2);
        mediaCodec.configure(this.c, (Surface) null, (MediaCrypto) null, 1);
        s18 s18Var = this.e;
        if (s18Var instanceof e28) {
            e28 e28Var = (e28) s18Var;
            MediaCodec mediaCodec2 = e28Var.c.d;
            synchronized (e28Var.a) {
                surfaceCreatePersistentInputSurface = e28Var.b;
                if (surfaceCreatePersistentInputSurface == null) {
                    surfaceCreatePersistentInputSurface = MediaCodec.createPersistentInputSurface();
                    e28Var.b = surfaceCreatePersistentInputSurface;
                }
            }
            mediaCodec2.setInputSurface(surfaceCreatePersistentInputSurface);
        }
    }

    public final void g(int i) {
        if (this.E == i) {
            return;
        }
        this.E = i;
    }

    public final void h() {
        s18 s18Var = this.e;
        byte b = 0;
        if (s18Var instanceof b28) {
            ((b28) s18Var).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                arrayList.add(k1g.O(((a28) it.next()).d));
            }
            ohc ohcVar = new ohc(new ArrayList(arrayList), false, n97.a());
            ohcVar.e.addListener(new y18(this, b), this.g);
            return;
        }
        if (s18Var instanceof e28) {
            try {
                if (b77.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    d28 d28Var = this.z;
                    b2j b2jVar = this.g;
                    ScheduledFuture scheduledFuture = this.D;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.D = ((g7a) x7d.l()).schedule(new cn7(b2jVar, d28Var, (byte) 7), 1000L, TimeUnit.MILLISECONDS);
                }
                this.d.signalEndOfInputStream();
                this.C = true;
            } catch (MediaCodec.CodecException e) {
                a(1, e.getMessage(), e);
            }
        }
    }

    public final void i(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.m;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(k1g.O(((q18) it.next()).d));
        }
        HashSet hashSet2 = this.l;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(k1g.O(((a28) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
        }
        ohc ohcVar = new ohc(new ArrayList(arrayList), false, n97.a());
        ohcVar.e.addListener(new gl6(this, arrayList, runnable, (byte) 15), this.g);
    }

    public final long j(long j) {
        Rational rational = this.q;
        if (rational != null && rational.getDenominator() == rational.getNumerator()) {
            return j;
        }
        return Math.round(rational.doubleValue() * j);
    }
}
