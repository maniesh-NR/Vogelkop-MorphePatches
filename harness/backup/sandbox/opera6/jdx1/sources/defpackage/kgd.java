package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kgd extends rgd implements hgd {
    public final Context D0;
    public final pad E0;
    public final ll6 F0;
    public final r3d G0;
    public int H0;
    public boolean I0;
    public oj9 J0;
    public oj9 K0;
    public long L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public long R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgd(Context context, igd igdVar, Handler handler, mi8 mi8Var, ll6 ll6Var) {
        super(1, igdVar, 44100.0f);
        r3d r3dVar = Build.VERSION.SDK_INT >= 35 ? new r3d() : null;
        this.D0 = context.getApplicationContext();
        this.F0 = ll6Var;
        this.G0 = r3dVar;
        this.P0 = -1000;
        this.E0 = new pad((Object) handler, (Object) mi8Var, (byte) 5);
        this.R0 = -9223372036854775807L;
        ll6Var.n = new qq6(this, (byte) 29);
    }

    public static csh B0(oj9 oj9Var, boolean z, ll6 ll6Var) {
        if (oj9Var.n == null) {
            a1b a1bVar = h1b.b;
            return csh.e;
        }
        byte b = ((uh2) ll6Var.r).b(ll6Var.g(oj9Var)).d;
        if (b == 1 || b == 2) {
            List listD = wgd.d("audio/raw", false, false);
            ogd ogdVar = listD.isEmpty() ? null : (ogd) listD.get(0);
            if (ogdVar != null) {
                return h1b.v(ogdVar);
            }
        }
        return wgd.f(oj9Var, z, false);
    }

    public final int A0(oj9 oj9Var) {
        rg2 rg2VarA;
        ll6 ll6Var = this.F0;
        if (ll6Var.X) {
            rg2VarA = rg2.d;
        } else {
            vg2 vg2VarB = ((uh2) ll6Var.r).b(ll6Var.g(oj9Var));
            ukh ukhVar = new ukh((byte) 1);
            ukhVar.b = vg2VarB.a;
            ukhVar.c = vg2VarB.b;
            ukhVar.d = vg2VarB.c;
            rg2VarA = ukhVar.a();
        }
        if (!rg2VarA.a) {
            return 0;
        }
        int i = rg2VarA.b ? 1536 : NotificationCompat.FLAG_GROUP_SUMMARY;
        return rg2VarA.c ? i | 2048 : i;
    }

    public final void C0() {
        long j;
        long jMax;
        long j2;
        l();
        ll6 ll6Var = this.F0;
        l45 l45Var = ll6Var.b;
        if (!ll6Var.m() || ll6Var.F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(ll6Var.t.a(), tym.U(((yg2) ll6Var.p.f).b, ll6Var.i()));
            ArrayDeque arrayDeque = ll6Var.h;
            while (!arrayDeque.isEmpty() && jMin >= ((kl6) arrayDeque.getFirst()).c) {
                ll6Var.w = (kl6) arrayDeque.remove();
            }
            kl6 kl6Var = ll6Var.w;
            long jW = jMin - kl6Var.c;
            long jY = tym.y(jW, kl6Var.a.a);
            if (arrayDeque.isEmpty()) {
                tvj tvjVar = (tvj) l45Var.c;
                if (!tvjVar.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (tvjVar.m >= 1024) {
                    long j3 = tvjVar.l;
                    tvjVar.i.getClass();
                    long jQ = j3 - (r10.i.q() * (r10.j * r10.b));
                    int i = tvjVar.g.a;
                    int i2 = tvjVar.f.a;
                    j = Long.MIN_VALUE;
                    long j4 = tvjVar.m;
                    jW = i == i2 ? tym.W(jW, jQ, j4, RoundingMode.DOWN) : tym.W(jW, jQ * i, j4 * i2, RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jW = (long) (tvjVar.b * jW);
                }
                kl6 kl6Var2 = ll6Var.w;
                j2 = kl6Var2.b + jW;
                kl6Var2.d = jW - jY;
            } else {
                j = Long.MIN_VALUE;
                kl6 kl6Var3 = ll6Var.w;
                j2 = kl6Var3.b + jY + kl6Var3.d;
            }
            long j5 = ((vjj) l45Var.b).l;
            jMax = tym.U(((yg2) ll6Var.p.f).b, j5) + j2;
            long j6 = ll6Var.Z;
            if (j5 > j6) {
                long jU = tym.U(((yg2) ll6Var.p.f).b, j5 - j6);
                ll6Var.Z = j5;
                ll6Var.a0 += jU;
                Handler handler = ll6Var.b0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    ll6Var.b0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                ll6Var.b0.postDelayed(new bl6(ll6Var, (byte) 1), 100L);
            }
        }
        if (jMax != j) {
            if (!this.M0) {
                jMax = Math.max(this.L0, jMax);
            }
            this.L0 = jMax;
            this.M0 = false;
        }
    }

    @Override // defpackage.rgd
    public final sj6 F(ogd ogdVar, oj9 oj9Var, oj9 oj9Var2) {
        sj6 sj6VarB = ogdVar.b(oj9Var, oj9Var2);
        int i = sj6VarB.e;
        if (this.F == null && v0(oj9Var2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(ogdVar.a);
        if (oj9Var2.o > this.H0) {
            i |= 64;
        }
        int i2 = i;
        return new sj6(ogdVar.a, oj9Var, oj9Var2, i2 != 0 ? (byte) 0 : sj6VarB.d, i2);
    }

    @Override // defpackage.rgd
    public final ArrayList N(oj9 oj9Var, boolean z) {
        csh cshVarB0 = B0(oj9Var, z, this.F0);
        HashMap map = wgd.a;
        ArrayList arrayList = new ArrayList((Collection) cshVarB0);
        Collections.sort(arrayList, new vd3(new yzb(oj9Var, (byte) 20), (byte) 3));
        return arrayList;
    }

    @Override // defpackage.rgd
    public final long O(long j, long j2) {
        long jW;
        ll6 ll6Var = this.F0;
        boolean z = ll6Var.k() && this.R0 != -9223372036854775807L;
        if (this.Q0) {
            if (!ll6Var.m()) {
                jW = -9223372036854775807L;
            } else if (ll6Var.p.n()) {
                jW = tym.U(((yg2) ll6Var.p.f).b, ll6Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = ll6Var.t.a.getBufferSizeInFrames();
                int iH = p37.H(((yg2) ll6Var.p.f).a);
                z4o.H(iH != -2147483647);
                jW = tym.W(bufferSizeInFrames, 1000000L, iH, RoundingMode.DOWN);
            }
            if (z && jW != -9223372036854775807L) {
                float fMin = Math.min(jW, this.R0 - j);
                thg thgVar = ll6Var.x;
                float f = thgVar != null ? thgVar.a : 1.0f;
                this.g.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (tym.N(SystemClock.elapsedRealtime()) - j2));
            }
        } else if (z || this.o0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.rgd
    public final igi Q(ogd ogdVar, oj9 oj9Var, MediaCrypto mediaCrypto, float f) {
        Pair pairB;
        oj9[] oj9VarArr = this.j;
        oj9VarArr.getClass();
        String str = ogdVar.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = oj9Var.o;
        String str2 = oj9Var.n;
        int i = oj9Var.F;
        if (oj9VarArr.length != 1) {
            for (oj9 oj9Var2 : oj9VarArr) {
                if (ogdVar.b(oj9Var, oj9Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, oj9Var2.o);
                }
            }
        }
        this.H0 = iMax;
        this.I0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = ogdVar.c;
        int i2 = this.H0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = oj9Var.G;
        mediaFormat.setInteger("sample-rate", i3);
        qbe.O(mediaFormat, oj9Var.q);
        qbe.H(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2) && (pairB = j75.b(oj9Var)) != null) {
            qbe.H(mediaFormat, "profile", ((Integer) pairB.first).intValue());
            qbe.H(mediaFormat, "level", ((Integer) pairB.second).intValue());
        }
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("audio/raw");
        nj9Var.E = i;
        nj9Var.F = i3;
        nj9Var.G = 4;
        oj9 oj9Var3 = new oj9(nj9Var);
        ll6 ll6Var = this.F0;
        byte b = ((uh2) ll6Var.r).b(ll6Var.g(oj9Var3)).d;
        if (b != 1 && b == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.P0));
        }
        D(mediaFormat);
        this.K0 = (!"audio/raw".equals(ogdVar.b) || "audio/raw".equals(str2)) ? null : oj9Var;
        return new igi(ogdVar, mediaFormat, oj9Var, null, mediaCrypto, this.G0, (byte) 26);
    }

    @Override // defpackage.rgd
    public final void R(qj6 qj6Var) {
        jl6 jl6Var;
        oj9 oj9Var = qj6Var.c;
        if (oj9Var != null && Objects.equals(oj9Var.n, "audio/opus") && this.c0) {
            ByteBuffer byteBuffer = qj6Var.h;
            byteBuffer.getClass();
            oj9 oj9Var2 = qj6Var.c;
            oj9Var2.getClass();
            int i = oj9Var2.I;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                ll6 ll6Var = this.F0;
                th2 th2Var = ll6Var.t;
                if (th2Var == null || !th2Var.a.isOffloadedPlayback() || (jl6Var = ll6Var.p) == null || !((yg2) jl6Var.f).k) {
                    return;
                }
                ll6Var.t.a.setOffloadDelayPadding(i, i2);
            }
        }
    }

    @Override // defpackage.rgd
    public final void X(Exception exc) {
        w7d.r("Audio codec error", exc);
        pad padVar = this.E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, (Object) exc, (byte) 0));
        }
    }

    @Override // defpackage.rgd
    public final void Y(String str, long j, long j2) {
        pad padVar = this.E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, str, j, j2));
        }
    }

    @Override // defpackage.rgd
    public final void Z(h75 h75Var) {
        pad padVar = this.E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new xa(padVar, h75Var, (byte) 26));
        }
    }

    @Override // defpackage.rgd
    public final void a0(String str) {
        pad padVar = this.E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, (Object) str, (byte) 5));
        }
    }

    @Override // defpackage.rgd
    public final sj6 b0(i16 i16Var) {
        oj9 oj9Var = (oj9) i16Var.c;
        oj9Var.getClass();
        this.J0 = oj9Var;
        sj6 sj6VarB0 = super.b0(i16Var);
        pad padVar = this.E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, oj9Var, sj6VarB0));
        }
        return sj6VarB0;
    }

    public final void c(thg thgVar) {
        thg thgVar2 = new thg(tym.h(thgVar.a, 0.1f, 8.0f), tym.h(thgVar.b, 0.1f, 8.0f));
        ll6 ll6Var = this.F0;
        ll6Var.x = thgVar2;
        if (ll6Var.u()) {
            ll6Var.s();
            return;
        }
        kl6 kl6Var = new kl6(thgVar, -9223372036854775807L, -9223372036854775807L);
        if (ll6Var.m()) {
            ll6Var.v = kl6Var;
        } else {
            ll6Var.w = kl6Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[Catch: jh2 -> 0x00db, TryCatch #0 {jh2 -> 0x00db, blocks: (B:34:0x00bc, B:37:0x00c2, B:39:0x00cb, B:41:0x00d7, B:40:0x00d5), top: B:46:0x00bc }] */
    @Override // defpackage.rgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(defpackage.oj9 r7, android.media.MediaFormat r8) throws defpackage.zh8 {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgd.c0(oj9, android.media.MediaFormat):void");
    }

    @Override // defpackage.rgd
    public final void d0() {
    }

    public final boolean e() {
        boolean z = this.O0;
        this.O0 = false;
        return z;
    }

    @Override // defpackage.rgd
    public final void f0() {
        this.F0.E = true;
    }

    @Override // defpackage.q83, defpackage.kuh
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final thg getPlaybackParameters() {
        return this.F0.x;
    }

    public final long getPositionUs() {
        if (this.h == 2) {
            C0();
        }
        return this.L0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    @Override // defpackage.rgd, defpackage.q83, defpackage.bkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgd.handleMessage(int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    @Override // defpackage.rgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i0(long r1, long r3, defpackage.jgd r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, defpackage.oj9 r14) throws defpackage.zh8 {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.R0 = r1
            oj9 r1 = r0.K0
            r2 = 1
            if (r1 == 0) goto L1a
            r8 = r8 & 2
            if (r8 == 0) goto L1a
            r5.getClass()
            r5.h(r7)
            return r2
        L1a:
            ll6 r1 = r0.F0
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.h(r7)
        L23:
            nj6 r0 = r0.s0
            int r3 = r0.f
            int r3 = r3 + r9
            r0.f = r3
            r1.E = r2
            return r2
        L2d:
            boolean r1 = r1.j(r10, r9, r6)     // Catch: defpackage.lh2 -> L44 defpackage.kh2 -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.h(r7)
        L38:
            nj6 r0 = r0.s0
            int r1 = r0.e
            int r1 = r1 + r9
            r0.e = r1
            return r2
        L40:
            r0.R0 = r10
            r0 = 0
            return r0
        L44:
            r1 = move-exception
            boolean r2 = r0.c0
            if (r2 == 0) goto L55
            luh r2 = r0.d
            r2.getClass()
            byte r2 = r2.a
            if (r2 == 0) goto L55
            r2 = 5003(0x138b, float:7.01E-42)
            goto L57
        L55:
            r2 = 5002(0x138a, float:7.009E-42)
        L57:
            boolean r3 = r1.b
            zh8 r0 = r0.a(r1, r14, r3, r2)
            throw r0
        L5e:
            r1 = move-exception
            oj9 r2 = r0.J0
            boolean r3 = r0.c0
            if (r3 == 0) goto L71
            luh r3 = r0.d
            r3.getClass()
            byte r3 = r3.a
            if (r3 == 0) goto L71
            r3 = 5004(0x138c, float:7.012E-42)
            goto L73
        L71:
            r3 = 5001(0x1389, float:7.008E-42)
        L73:
            boolean r4 = r1.a
            zh8 r0 = r0.a(r1, r2, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgd.i0(long, long, jgd, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, oj9):boolean");
    }

    @Override // defpackage.q83
    public final hgd j() {
        return this;
    }

    @Override // defpackage.q83
    public final boolean l() {
        if (!this.o0) {
            return false;
        }
        ll6 ll6Var = this.F0;
        if (ll6Var.m()) {
            return ll6Var.L && !ll6Var.k();
        }
        return true;
    }

    @Override // defpackage.rgd
    public final void l0() throws zh8 {
        try {
            ll6 ll6Var = this.F0;
            if (!ll6Var.L && ll6Var.m() && ll6Var.e()) {
                ll6Var.o();
                ll6Var.L = true;
            }
            long j = this.t0.e;
            if (j != -9223372036854775807L) {
                this.R0 = j;
            }
        } catch (lh2 e) {
            throw a(e, e.c, e.b, this.c0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.q83
    public final boolean m() {
        return this.F0.k();
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void n() {
        pad padVar = this.E0;
        this.N0 = true;
        this.J0 = null;
        this.R0 = -9223372036854775807L;
        try {
            this.F0.f();
            super.n();
        } catch (Throwable th) {
            super.n();
            throw th;
        } finally {
            padVar.c(this.s0);
        }
    }

    @Override // defpackage.q83
    public final void o(boolean z, boolean z2) {
        nj6 nj6Var = new nj6();
        this.s0 = nj6Var;
        pad padVar = this.E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, (Object) nj6Var, (byte) 6));
        }
        luh luhVar = this.d;
        luhVar.getClass();
        boolean z3 = luhVar.b;
        ll6 ll6Var = this.F0;
        if (z3) {
            z4o.H(ll6Var.P);
            if (!ll6Var.V) {
                ll6Var.V = true;
                ll6Var.q();
            }
        } else if (ll6Var.V) {
            ll6Var.V = false;
            ll6Var.q();
        }
        fjg fjgVar = this.f;
        fjgVar.getClass();
        ll6Var.m = fjgVar;
        kzk kzkVar = this.g;
        kzkVar.getClass();
        ((uh2) ll6Var.r).f = kzkVar;
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void q(long j, boolean z, boolean z2) {
        super.q(j, z, z2);
        this.F0.f();
        this.L0 = j;
        this.R0 = -9223372036854775807L;
        this.O0 = false;
        this.M0 = true;
    }

    @Override // defpackage.q83
    public final void r() {
        r3d r3dVar;
        ((uh2) this.F0.r).d();
        if (Build.VERSION.SDK_INT < 35 || (r3dVar = this.G0) == null) {
            return;
        }
        r3dVar.b();
    }

    @Override // defpackage.q83
    public final void s() {
        ll6 ll6Var = this.F0;
        this.O0 = false;
        this.R0 = -9223372036854775807L;
        try {
            try {
                this.c0 = false;
                m0();
                k0();
            } finally {
                xl7 xl7Var = this.F;
                if (xl7Var != null) {
                    xl7Var.d(null);
                }
                this.F = null;
            }
        } finally {
            if (this.N0) {
                this.N0 = false;
                ll6Var.r();
            }
        }
    }

    @Override // defpackage.q83
    public final void t() {
        this.F0.n();
        this.Q0 = true;
    }

    @Override // defpackage.q83
    public final void u() throws IllegalStateException {
        C0();
        this.Q0 = false;
        ll6 ll6Var = this.F0;
        ll6Var.O = false;
        if (ll6Var.m()) {
            th2 th2Var = ll6Var.t;
            AudioTrack audioTrack = th2Var.a;
            vh2 vh2Var = th2Var.e;
            vh2Var.k = 0L;
            vh2Var.t = 0;
            vh2Var.s = 0;
            vh2Var.l = 0L;
            vh2Var.y = -9223372036854775807L;
            vh2Var.z = -9223372036854775807L;
            if (vh2Var.u == -9223372036854775807L) {
                vh2Var.h.a(0);
            }
            vh2Var.w = vh2Var.a();
            if (!th2Var.j || audioTrack.isOffloadedPlayback()) {
                audioTrack.pause();
            }
        }
    }

    @Override // defpackage.rgd
    public final boolean v0(oj9 oj9Var) {
        luh luhVar = this.d;
        luhVar.getClass();
        if (luhVar.a != 0) {
            int iA0 = A0(oj9Var);
            if ((iA0 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
                luh luhVar2 = this.d;
                luhVar2.getClass();
                if (luhVar2.a == 2 || (iA0 & 1024) != 0 || (oj9Var.I == 0 && oj9Var.J == 0)) {
                    return true;
                }
            }
        }
        ll6 ll6Var = this.F0;
        byte b = ((uh2) ll6Var.r).b(ll6Var.g(oj9Var)).d;
        return b == 1 || b == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // defpackage.rgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w0(defpackage.oj9 r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgd.w0(oj9):int");
    }
}
