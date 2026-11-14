package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ll6 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public iv2 S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final l45 b;
    public Handler b0;
    public final ds4 c;
    public final i7m d;
    public final yql e;
    public final yql f;
    public final csh g;
    public final ArrayDeque h;
    public byte i;
    public il6 j;
    public final t59 k;
    public final t59 l;
    public fjg m;
    public qq6 n;
    public jl6 o;
    public jl6 p;
    public ah2 q;
    public zg2 r;
    public hl6 s;
    public th2 t;
    public pf2 u;
    public kl6 v;
    public kl6 w;
    public thg x;
    public boolean y;
    public long z;

    public ll6(i9c i9cVar) {
        int deviceId;
        Context context = (Context) i9cVar.c;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = pf2.i;
        this.b = (l45) i9cVar.e;
        this.i = (byte) 0;
        this.r = (uh2) i9cVar.f;
        ds4 ds4Var = new ds4();
        this.c = ds4Var;
        i7m i7mVar = new i7m();
        i7mVar.m = tym.b;
        this.d = i7mVar;
        this.e = new yql((byte) 1);
        this.f = new yql((byte) 0);
        this.g = h1b.w(i7mVar, ds4Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new iv2();
        thg thgVar = thg.d;
        this.w = new kl6(thgVar, 0L, 0L);
        this.x = thgVar;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new t59((byte) 1);
        this.l = new t59((byte) 1);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(int r10, java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll6.h(int, java.nio.ByteBuffer):int");
    }

    public final void a(long j) {
        thg thgVar;
        boolean z;
        boolean zU = u();
        l45 l45Var = this.b;
        if (zU) {
            thgVar = thg.d;
        } else {
            if (this.V || !this.p.n()) {
                thgVar = thg.d;
            } else {
                int i = ((oj9) this.p.d).H;
                thgVar = this.x;
                tvj tvjVar = (tvj) l45Var.c;
                float f = thgVar.a;
                z4o.w(f > 0.0f);
                if (tvjVar.b != f) {
                    tvjVar.b = f;
                    tvjVar.h = true;
                }
                float f2 = thgVar.b;
                z4o.w(f2 > 0.0f);
                if (tvjVar.c != f2) {
                    tvjVar.c = f2;
                    tvjVar.h = true;
                }
            }
            this.x = thgVar;
        }
        thg thgVar2 = thgVar;
        if (this.V || !this.p.n()) {
            z = false;
        } else {
            int i2 = ((oj9) this.p.d).H;
            z = this.y;
            ((vjj) l45Var.b).j = z;
        }
        this.y = z;
        this.h.add(new kl6(thgVar2, Math.max(0L, j), tym.U(((yg2) this.p.f).b, i())));
        ah2 ah2Var = (ah2) this.p.g;
        this.q = ah2Var;
        ah2Var.a();
        qq6 qq6Var = this.n;
        if (qq6Var != null) {
            boolean z2 = this.y;
            pad padVar = ((kgd) qq6Var.b).E0;
            Handler handler = (Handler) padVar.b;
            if (handler != null) {
                handler.post(new gh2((byte) 0, padVar, z2));
            }
        }
    }

    public final th2 b(yg2 yg2Var) throws kh2 {
        try {
            return ((uh2) this.r).a(yg2Var);
        } catch (wg2 e) {
            kh2 kh2Var = new kh2(yg2Var.b, yg2Var.c, yg2Var.a, yg2Var.f, (oj9) this.p.d, yg2Var.e, e);
            qq6 qq6Var = this.n;
            if (qq6Var == null) {
                throw kh2Var;
            }
            qq6Var.i(kh2Var);
            throw kh2Var;
        }
    }

    public final void c(oj9 oj9Var, int[] iArr) {
        ah2 ah2Var;
        oj9 oj9Var2;
        int i;
        int iS;
        if (this.s == null && this.a != null) {
            hl6 hl6Var = new hl6(this);
            this.s = hl6Var;
            uh2 uh2Var = (uh2) this.r;
            uh2Var.f();
            ijc ijcVar = uh2Var.e;
            if (ijcVar == null) {
                ijcVar = new ijc(Thread.currentThread());
                uh2Var.e = ijcVar;
                ijcVar.b = false;
            }
            ijcVar.a(hl6Var);
        }
        String str = oj9Var.n;
        int i2 = oj9Var.F;
        int i3 = oj9Var.H;
        if ("audio/raw".equals(str)) {
            z4o.w(tym.I(i3));
            int iS2 = tym.s(i3) * i2;
            z0b z0bVar = new z0b(4);
            z0bVar.e(this.g);
            z0bVar.c(this.e);
            z0bVar.d((eh2[]) this.b.a);
            ah2Var = new ah2(z0bVar.g());
            if (ah2Var.equals(this.q)) {
                ah2Var = this.q;
            }
            int i4 = oj9Var.I;
            int i5 = oj9Var.J;
            i7m i7mVar = this.d;
            i7mVar.i = i4;
            i7mVar.j = i5;
            this.c.i = iArr;
            bh2 bh2Var = new bh2(oj9Var.G, i2, i3);
            try {
                csh cshVar = ah2Var.a;
                if (bh2Var.equals(bh2.e)) {
                    throw new dh2(bh2Var);
                }
                for (int i6 = 0; i6 < cshVar.d; i6++) {
                    eh2 eh2Var = (eh2) cshVar.get(i6);
                    bh2 bh2VarA = eh2Var.a(bh2Var);
                    if (eh2Var.isActive()) {
                        z4o.H(!bh2VarA.equals(bh2.e));
                        bh2Var = bh2VarA;
                    }
                }
                int i7 = bh2Var.b;
                int i8 = bh2Var.c;
                nj9 nj9VarA = oj9Var.a();
                nj9VarA.G = i8;
                nj9VarA.F = bh2Var.a;
                nj9VarA.E = i7;
                oj9Var2 = new oj9(nj9VarA);
                i = iS2;
                iS = tym.s(i8) * i7;
            } catch (dh2 e) {
                throw new jh2(e, oj9Var);
            }
        } else {
            a1b a1bVar = h1b.b;
            ah2Var = new ah2(csh.e);
            oj9Var2 = oj9Var;
            i = -1;
            iS = -1;
        }
        ah2 ah2Var2 = ah2Var;
        ug2 ug2VarG = g(oj9Var2);
        oj9 oj9Var3 = ug2VarG.a;
        try {
            yg2 yg2VarC = ((uh2) this.r).c(ug2VarG);
            boolean z = yg2VarC.e;
            if (yg2VarC.a == 0) {
                throw new jh2("Invalid output encoding (isOffload=" + z + ")", oj9Var3);
            }
            if (yg2VarC.c == 0) {
                throw new jh2("Invalid output channel config (isOffload=" + z + ")", oj9Var3);
            }
            this.X = false;
            jl6 jl6Var = new jl6(oj9Var, oj9Var2, i, iS, yg2VarC, ah2Var2);
            if (m()) {
                this.o = jl6Var;
            } else {
                this.p = jl6Var;
            }
        } catch (tg2 e2) {
            throw new jh2(e2, oj9Var);
        }
    }

    public final void d(long j) throws lh2 {
        qq6 qq6Var;
        ti8 ti8Var;
        if (this.K != null) {
            t59 t59Var = this.l;
            if (((Exception) t59Var.c) == null || (c0.get() <= 0 && SystemClock.elapsedRealtime() >= t59Var.b)) {
                int iRemaining = this.K.remaining();
                try {
                    boolean zD = this.t.d(j, this.J, this.K);
                    this.W = SystemClock.elapsedRealtime();
                    t59Var.c = null;
                    t59Var.a = -9223372036854775807L;
                    t59Var.b = -9223372036854775807L;
                    if (this.t.a.isOffloadedPlayback()) {
                        if (this.C > 0) {
                            this.Y = false;
                        }
                        if (this.O && (qq6Var = this.n) != null && !zD && !this.Y && (ti8Var = ((kgd) qq6Var.b).G) != null) {
                            ti8Var.a.P = true;
                        }
                    }
                    if (this.p.n()) {
                        this.B += iRemaining - this.K.remaining();
                    }
                    if (zD) {
                        if (!this.p.n()) {
                            z4o.H(this.K == this.I);
                            this.C = (this.D * this.J) + this.C;
                        }
                        this.K = null;
                    }
                } catch (sg2 e) {
                    boolean z = e.b;
                    if (z) {
                        if (i() > 0) {
                            z = true;
                        } else if (this.t.a.isOffloadedPlayback()) {
                            if (((yg2) this.p.f).e) {
                                this.X = true;
                            }
                            z = true;
                        }
                    }
                    lh2 lh2Var = new lh2(e.a, (oj9) this.p.d, z);
                    qq6 qq6Var2 = this.n;
                    if (qq6Var2 != null) {
                        qq6Var2.i(lh2Var);
                    }
                    if (z) {
                        throw lh2Var;
                    }
                    t59Var.k(lh2Var);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws defpackage.lh2 {
        /*
            r6 = this;
            ah2 r0 = r6.q
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.d(r1)
            java.nio.ByteBuffer r6 = r6.K
            if (r6 != 0) goto L43
            goto L42
        L14:
            ah2 r0 = r6.q
            boolean r5 = r0.d()
            if (r5 == 0) goto L2d
            boolean r5 = r0.d
            if (r5 != 0) goto L2d
            r0.d = r4
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r3)
            eh2 r0 = (defpackage.eh2) r0
            r0.queueEndOfStream()
        L2d:
            r6.p(r1)
            ah2 r0 = r6.q
            boolean r0 = r0.c()
            if (r0 == 0) goto L43
            java.nio.ByteBuffer r6 = r6.K
            if (r6 == 0) goto L42
            boolean r6 = r6.hasRemaining()
            if (r6 != 0) goto L43
        L42:
            return r4
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll6.e():boolean");
    }

    public final void f() {
        if (m()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new kl6(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            ah2 ah2Var = (ah2) this.p.g;
            this.q = ah2Var;
            ah2Var.a();
            this.j = null;
            jl6 jl6Var = this.o;
            if (jl6Var != null) {
                this.p = jl6Var;
                this.o = null;
            }
            c0.incrementAndGet();
            th2 th2Var = this.t;
            if (th2Var.e.d.getPlayState() == 3) {
                th2Var.a.pause();
            }
            if (th2Var.a.isOffloadedPlayback()) {
                d5o d5oVar = th2Var.h;
                d5oVar.getClass();
                ((th2) d5oVar.c).a.unregisterStreamEventCallback((sh2) d5oVar.b);
                ((Handler) d5oVar.a).removeCallbacksAndMessages(null);
            }
            s9i s9iVar = th2Var.d;
            if (s9iVar != null) {
                AudioTrack audioTrack = (AudioTrack) s9iVar.b;
                qh2 qh2Var = (qh2) s9iVar.e;
                qh2Var.getClass();
                audioTrack.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) qh2Var);
                s9iVar.e = null;
                th2Var.d = null;
            }
            AudioTrack audioTrack2 = th2Var.a;
            ijc ijcVar = th2Var.i;
            Handler handlerP = tym.p(null);
            synchronized (th2.p) {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = th2.q;
                final byte b = 1;
                if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: js3
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            switch (b) {
                                case 0:
                                    Thread thread = new Thread(runnable);
                                    thread.setPriority(1);
                                    thread.setName("BreakpadUploader");
                                    return thread;
                                default:
                                    return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
                            }
                        }
                    });
                    th2.q = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                }
                th2.r++;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule((Runnable) new k3(audioTrack2, handlerP, ijcVar, (byte) 13), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        t59 t59Var = this.l;
        t59Var.c = null;
        t59Var.a = -9223372036854775807L;
        t59Var.b = -9223372036854775807L;
        t59 t59Var2 = this.k;
        t59Var2.c = null;
        t59Var2.a = -9223372036854775807L;
        t59Var2.b = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final ug2 g(oj9 oj9Var) {
        ug2 ug2Var = new ug2(oj9Var);
        ug2Var.b = this.u;
        ug2Var.d = this.i != 0;
        ug2Var.c = this.T;
        ug2Var.e = this.Q;
        ug2Var.g = this.V;
        ug2Var.f = this.U;
        return new ug2(ug2Var);
    }

    public final long i() {
        if (!this.p.n()) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.c;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (r5 == 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(long r21, int r23, java.nio.ByteBuffer r24) throws defpackage.kh2, defpackage.lh2 {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll6.j(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean k() {
        if (!m()) {
            return false;
        }
        if (this.t.a.isOffloadedPlayback() && this.N) {
            return false;
        }
        long jI = i();
        long jA = this.t.a();
        th2 th2Var = this.t;
        th2Var.getClass();
        return jI > tym.W(jA, (long) th2Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() throws defpackage.kh2 {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll6.l():boolean");
    }

    public final boolean m() {
        return this.t != null;
    }

    public final void n() {
        this.O = true;
        if (m()) {
            th2 th2Var = this.t;
            AudioTrack audioTrack = th2Var.a;
            vh2 vh2Var = th2Var.e;
            if (vh2Var.u != -9223372036854775807L) {
                vh2Var.b.getClass();
                vh2Var.u = tym.N(SystemClock.elapsedRealtime());
            }
            vh2Var.j = tym.U(vh2Var.e, vh2Var.a());
            vh2Var.h.a(0);
            if (!th2Var.j || audioTrack.isOffloadedPlayback()) {
                audioTrack.play();
            }
        }
    }

    public final void o() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.t.a.isOffloadedPlayback()) {
            this.N = false;
        }
        th2 th2Var = this.t;
        if (th2Var.j) {
            return;
        }
        th2Var.j = true;
        vh2 vh2Var = th2Var.e;
        long jB = th2Var.b();
        vh2Var.w = vh2Var.a();
        vh2Var.b.getClass();
        vh2Var.u = tym.N(SystemClock.elapsedRealtime());
        vh2Var.x = jB;
        th2Var.a.stop();
    }

    public final void p(long j) throws lh2 {
        ByteBuffer byteBuffer;
        d(j);
        if (this.K == null) {
            if (!this.q.d()) {
                ByteBuffer byteBuffer2 = this.I;
                if (byteBuffer2 != null) {
                    t(byteBuffer2);
                    d(j);
                    return;
                }
                return;
            }
            while (!this.q.c()) {
                do {
                    ah2 ah2Var = this.q;
                    if (ah2Var.d()) {
                        ByteBuffer byteBuffer3 = ah2Var.c[ah2Var.b()];
                        if (byteBuffer3.hasRemaining()) {
                            byteBuffer = byteBuffer3;
                        } else {
                            ah2Var.e(eh2.a);
                            byteBuffer = ah2Var.c[ah2Var.b()];
                        }
                    } else {
                        byteBuffer = eh2.a;
                    }
                    if (byteBuffer.hasRemaining()) {
                        t(byteBuffer);
                        d(j);
                    } else {
                        ByteBuffer byteBuffer4 = this.I;
                        if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                            return;
                        }
                        ah2 ah2Var2 = this.q;
                        ByteBuffer byteBuffer5 = this.I;
                        if (ah2Var2.d() && !ah2Var2.d) {
                            ah2Var2.e(byteBuffer5);
                        }
                    }
                } while (this.K == null);
                return;
            }
        }
    }

    public final void q() {
        jl6 jl6Var = this.p;
        if (jl6Var != null) {
            jl6 jl6Var2 = this.o;
            if (jl6Var2 != null) {
                this.p = jl6Var2;
                this.o = null;
                jl6Var = jl6Var2;
            }
            try {
                yg2 yg2VarC = ((uh2) this.r).c(g((oj9) jl6Var.e));
                jl6 jl6Var3 = this.p;
                this.p = new jl6((oj9) jl6Var3.d, (oj9) jl6Var3.e, jl6Var3.b, jl6Var3.c, yg2VarC, (ah2) jl6Var3.g);
            } catch (tg2 e) {
                h9o.o(new jh2(e, (oj9) this.p.d));
                return;
            }
        }
        f();
    }

    public final void r() {
        f();
        a1b a1bVarU = this.g.u(0);
        while (a1bVarU.hasNext()) {
            ((eh2) a1bVarU.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        ah2 ah2Var = this.q;
        if (ah2Var != null) {
            csh cshVar = ah2Var.a;
            for (int i = 0; i < cshVar.d; i++) {
                eh2 eh2Var = (eh2) cshVar.get(i);
                ch2 ch2Var = ch2.b;
                eh2Var.flush();
                eh2Var.reset();
            }
            ah2Var.c = new ByteBuffer[0];
            bh2 bh2Var = bh2.e;
            ah2Var.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void s() {
        if (m()) {
            th2 th2Var = this.t;
            thg thgVar = this.x;
            AudioTrack audioTrack = th2Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(thgVar.a).setPitch(thgVar.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                w7d.L("Failed to set playback params", e);
            }
            vh2 vh2Var = th2Var.e;
            vh2Var.i = audioTrack.getPlaybackParams().getSpeed();
            vh2Var.h.a(0);
            vh2Var.k = 0L;
            vh2Var.t = 0;
            vh2Var.s = 0;
            vh2Var.l = 0L;
            vh2Var.y = -9223372036854775807L;
            vh2Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new thg(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll6.t(java.nio.ByteBuffer):void");
    }

    public final boolean u() {
        jl6 jl6Var = this.p;
        return jl6Var != null && ((yg2) jl6Var.f).j;
    }
}
