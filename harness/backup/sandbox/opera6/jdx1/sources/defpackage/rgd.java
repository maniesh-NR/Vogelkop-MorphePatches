package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class rgd extends q83 {
    public static final byte[] C0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final m9f A;
    public h75 A0;
    public final AtomicInteger B;
    public u1b B0;
    public oj9 C;
    public oj9 D;
    public xl7 E;
    public xl7 F;
    public ti8 G;
    public MediaCrypto H;
    public float I;
    public float J;
    public jgd K;
    public oj9 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public pgd Q;
    public ogd R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;
    public long X;
    public int Y;
    public int Z;
    public ByteBuffer a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public byte g0;
    public byte h0;
    public byte i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public zh8 r0;
    public final igd s;
    public nj6 s0;
    public final float t;
    public qgd t0;
    public final qj6 u;
    public long u0;
    public final qj6 v;
    public boolean v0;
    public final qj6 w;
    public boolean w0;
    public final bc3 x;
    public boolean x0;
    public final MediaCodec.BufferInfo y;
    public long y0;
    public final ArrayDeque z;
    public h75 z0;

    public rgd(int i, igd igdVar, float f) {
        super(i);
        this.s = igdVar;
        this.t = f;
        this.B = new AtomicInteger();
        this.u = new qj6(0);
        this.v = new qj6(0);
        this.w = new qj6(2);
        bc3 bc3Var = new bc3(2);
        bc3Var.l = (byte) 32;
        this.x = bc3Var;
        this.y = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.z = new ArrayDeque();
        this.t0 = qgd.f;
        bc3Var.k(0);
        bc3Var.e.order(ByteOrder.nativeOrder());
        m9f m9fVar = new m9f();
        m9fVar.c = eh2.a;
        m9fVar.b = 0;
        m9fVar.a = 2;
        this.A = m9fVar;
        this.O = -1.0f;
        this.g0 = (byte) 0;
        this.Y = -1;
        this.Z = -1;
        this.X = -9223372036854775807L;
        this.m0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.W = -9223372036854775807L;
        this.h0 = (byte) 0;
        this.i0 = (byte) 0;
        this.s0 = new nj6();
        this.x0 = false;
        this.y0 = 0L;
        int i2 = u1b.c;
        this.B0 = jsh.j;
        h75 h75Var = h75.b;
        this.z0 = h75Var;
        this.A0 = h75Var;
    }

    @Override // defpackage.q83
    public void B(float f, float f2) {
        this.I = f;
        this.J = f2;
        x0(this.L);
    }

    public final void D(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.z0.a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgd.E(long, long):boolean");
    }

    public abstract sj6 F(ogd ogdVar, oj9 oj9Var, oj9 oj9Var2);

    public ngd G(IllegalStateException illegalStateException, ogd ogdVar) {
        return new ngd(illegalStateException, ogdVar);
    }

    public final boolean H(long j, long j2) throws MediaCryptoException, zh8 {
        jgd jgdVar = this.K;
        jgdVar.getClass();
        int i = this.Z;
        MediaCodec.BufferInfo bufferInfo = this.y;
        if (i < 0) {
            int iK = jgdVar.k(bufferInfo);
            if (iK < 0) {
                if (iK != -2) {
                    if (this.V && (this.n0 || this.h0 == 2)) {
                        h0();
                    }
                    long j3 = this.W;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.g.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            h0();
                            return false;
                        }
                    }
                    return false;
                }
                this.l0 = true;
                jgd jgdVar2 = this.K;
                jgdVar2.getClass();
                MediaFormat mediaFormatD = jgdVar2.d();
                if (!this.B0.isEmpty()) {
                    u1b<String> u1bVar = this.B0;
                    h75 h75Var = h75.b;
                    HashMap map = new HashMap();
                    for (String str : u1bVar) {
                        if (mediaFormatD.containsKey(str)) {
                            int valueTypeForKey = mediaFormatD.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatD.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatD.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatD.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatD.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatD.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    h75 h75Var2 = new h75(map);
                    if (!h75Var2.equals(this.A0)) {
                        this.A0 = h75Var2;
                        Z(h75Var2);
                    }
                }
                this.M = mediaFormatD;
                this.N = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.y0;
            if (this.U) {
                this.U = false;
                jgdVar.h(iK);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                h0();
                return false;
            }
            this.Z = iK;
            ByteBuffer byteBufferN = jgdVar.n(iK);
            this.a0 = byteBufferN;
            if (byteBufferN != null) {
                byteBufferN.position(bufferInfo.offset);
                this.a0.limit(bufferInfo.offset + bufferInfo.size);
            }
            z0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.x0 || bufferInfo.presentationTimeUs < this.l;
        long j5 = this.t0.e;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.b0 = z2;
        ByteBuffer byteBuffer2 = this.a0;
        int i2 = this.Z;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        oj9 oj9Var = this.D;
        oj9Var.getClass();
        if (!i0(j, j2, jgdVar, byteBuffer2, i2, i3, 1, j6, z, z2, oj9Var)) {
            return false;
        }
        e0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.k0 && this.b0) {
            this.g.getClass();
            this.W = System.currentTimeMillis();
        }
        this.Z = -1;
        this.a0 = null;
        if (!z3) {
            return true;
        }
        h0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I() throws android.media.MediaCryptoException, defpackage.zh8 {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgd.I():boolean");
    }

    public final void J() {
        try {
            jgd jgdVar = this.K;
            jgdVar.getClass();
            jgdVar.flush();
        } finally {
            n0();
        }
    }

    public final List K(boolean z) {
        oj9 oj9Var = this.C;
        oj9Var.getClass();
        ArrayList arrayListN = N(oj9Var, z);
        if (!arrayListN.isEmpty() || !z) {
            return arrayListN;
        }
        ArrayList arrayListN2 = N(oj9Var, false);
        if (!arrayListN2.isEmpty()) {
            w7d.K("Drm session requires secure decoder for " + oj9Var.n + ", but no secure decoder available. Trying to proceed with " + arrayListN2 + ".");
        }
        return arrayListN2;
    }

    public int L(qj6 qj6Var) {
        return 0;
    }

    public float M(float f, oj9 oj9Var, oj9[] oj9VarArr) {
        int iMax = -1;
        for (oj9 oj9Var2 : oj9VarArr) {
            int i = oj9Var2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    public abstract ArrayList N(oj9 oj9Var, boolean z);

    public long O(long j, long j2) {
        return super.i(j, j2);
    }

    public final qgd P() {
        ArrayDeque arrayDeque = this.z;
        return !arrayDeque.isEmpty() ? (qgd) arrayDeque.getLast() : this.t0;
    }

    public abstract igi Q(ogd ogdVar, oj9 oj9Var, MediaCrypto mediaCrypto, float f);

    public abstract void R(qj6 qj6Var);

    public final void S(ogd ogdVar, MediaCrypto mediaCrypto) {
        this.R = ogdVar;
        oj9 oj9Var = this.C;
        oj9Var.getClass();
        String str = ogdVar.a;
        float f = this.J;
        oj9[] oj9VarArr = this.j;
        oj9VarArr.getClass();
        float fM = M(f, oj9Var, oj9VarArr);
        if (fM <= this.t) {
            fM = -1.0f;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        igi igiVarQ = Q(ogdVar, oj9Var, mediaCrypto, fM);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            fjg fjgVar = this.f;
            fjgVar.getClass();
            m41.J(igiVarQ, fjgVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            jgd jgdVarG = this.s.g(igiVarQ);
            this.K = jgdVarG;
            jgdVarG.l(new qfb(this, (byte) 8));
            Trace.endSection();
            this.g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!ogdVar.e(oj9Var)) {
                String strC = oj9.c(oj9Var);
                Locale locale = Locale.US;
                w7d.K("Format exceeds selected codec's capabilities [" + strC + ", " + str + "]");
            }
            this.O = fM;
            this.L = oj9Var;
            boolean z = false;
            this.S = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = ogdVar.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && ogdVar.f)) {
                z = true;
            }
            this.V = z;
            this.K.getClass();
            if (this.h == 2) {
                this.g.getClass();
                this.X = SystemClock.elapsedRealtime() + 1000;
            }
            this.s0.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i >= 31 && !this.B0.isEmpty()) {
                jgd jgdVar = this.K;
                jgdVar.getClass();
                jgdVar.o(new ArrayList((Collection) this.B0));
            }
            Y(str, jElapsedRealtime2, j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean T(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        oj9 oj9Var = this.D;
        return oj9Var == null || !Objects.equals(oj9Var.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            r8 = this;
            jgd r0 = r8.K
            if (r0 != 0) goto Ld6
            boolean r0 = r8.c0
            if (r0 != 0) goto Ld6
            oj9 r0 = r8.C
            if (r0 == 0) goto Ld6
            java.lang.String r1 = r0.n
            xl7 r2 = r8.F
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L43
            boolean r2 = r8.v0(r0)
            if (r2 == 0) goto L43
            r8.c0 = r3
            r8.m0()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            bc3 r2 = r8.x
            if (r0 != 0) goto L3c
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            r2.l = r4
            goto L40
        L3c:
            r0 = 32
            r2.l = r0
        L40:
            r8.c0 = r4
            return
        L43:
            xl7 r2 = r8.F
            r8.p0(r2)
            xl7 r2 = r8.E
            r5 = 4
            if (r2 == 0) goto L9b
            android.media.MediaCrypto r2 = r8.H
            if (r2 != 0) goto L53
            r2 = r4
            goto L54
        L53:
            r2 = r3
        L54:
            defpackage.z4o.H(r2)
            xl7 r2 = r8.E
            oo9 r6 = r2.c()
            boolean r7 = defpackage.oo9.c
            if (r7 == 0) goto L7c
            if (r6 == 0) goto L7c
            int r7 = r2.getState()
            if (r7 == r4) goto L6c
            if (r7 == r5) goto L7c
            goto Lbf
        L6c:
            wl7 r0 = r2.getError()
            r0.getClass()
            oj9 r1 = r8.C
            int r2 = r0.a
            zh8 r8 = r8.a(r0, r1, r3, r2)
            throw r8
        L7c:
            if (r6 != 0) goto L85
            wl7 r2 = r2.getError()
            if (r2 == 0) goto Lbf
            goto L9b
        L85:
            android.media.MediaCrypto r2 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L91
            java.util.UUID r7 = r6.a     // Catch: android.media.MediaCryptoException -> L91
            byte[] r6 = r6.b     // Catch: android.media.MediaCryptoException -> L91
            r2.<init>(r7, r6)     // Catch: android.media.MediaCryptoException -> L91
            r8.H = r2     // Catch: android.media.MediaCryptoException -> L91
            goto L9b
        L91:
            r0 = move-exception
            oj9 r1 = r8.C
            r2 = 6006(0x1776, float:8.416E-42)
            zh8 r8 = r8.a(r0, r1, r3, r2)
            throw r8
        L9b:
            xl7 r2 = r8.E     // Catch: defpackage.pgd -> Lce
            if (r2 == 0) goto Lb9
            int r2 = r2.getState()     // Catch: defpackage.pgd -> Lce
            r6 = 3
            if (r2 == r6) goto Lae
            xl7 r2 = r8.E     // Catch: defpackage.pgd -> Lce
            int r2 = r2.getState()     // Catch: defpackage.pgd -> Lce
            if (r2 != r5) goto Lb9
        Lae:
            xl7 r2 = r8.E     // Catch: defpackage.pgd -> Lce
            r1.getClass()     // Catch: defpackage.pgd -> Lce
            boolean r1 = r2.f(r1)     // Catch: defpackage.pgd -> Lce
            if (r1 != 0) goto Lba
        Lb9:
            r4 = r3
        Lba:
            android.media.MediaCrypto r1 = r8.H     // Catch: defpackage.pgd -> Lce
            r8.V(r1, r4)     // Catch: defpackage.pgd -> Lce
        Lbf:
            android.media.MediaCrypto r0 = r8.H
            if (r0 == 0) goto Ld6
            jgd r1 = r8.K
            if (r1 != 0) goto Ld6
            r0.release()
            r0 = 0
            r8.H = r0
            return
        Lce:
            r1 = move-exception
            r2 = 4001(0xfa1, float:5.607E-42)
            zh8 r8 = r8.a(r1, r0, r3, r2)
            throw r8
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgd.U():void");
    }

    public final void V(MediaCrypto mediaCrypto, boolean z) throws pgd {
        oj9 oj9Var = this.C;
        oj9Var.getClass();
        if (this.P == null) {
            try {
                List listK = K(z);
                this.P = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listK;
                if (!arrayList.isEmpty()) {
                    this.P.add((ogd) arrayList.get(0));
                }
                this.Q = null;
            } catch (tgd e) {
                throw new pgd(oj9Var, e, z, -49998);
            }
        }
        if (this.P.isEmpty()) {
            throw new pgd(oj9Var, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.P;
        arrayDeque.getClass();
        while (this.K == null) {
            ogd ogdVar = (ogd) arrayDeque.peekFirst();
            ogdVar.getClass();
            if (!W(oj9Var) || !t0(ogdVar)) {
                return;
            }
            try {
                S(ogdVar, mediaCrypto);
            } catch (Exception e2) {
                w7d.L("Failed to initialize decoder: " + ogdVar, e2);
                arrayDeque.removeFirst();
                pgd pgdVar = new pgd("Decoder init failed: " + ogdVar.a + ", " + oj9Var, e2, oj9Var.n, z, ogdVar, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                X(pgdVar);
                pgd pgdVar2 = this.Q;
                if (pgdVar2 == null) {
                    this.Q = pgdVar;
                } else {
                    this.Q = new pgd(pgdVar2.getMessage(), pgdVar2.getCause(), pgdVar2.a, pgdVar2.b, pgdVar2.c, pgdVar2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    public boolean W(oj9 oj9Var) {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(String str, long j, long j2);

    public abstract void Z(h75 h75Var);

    public abstract void a0(String str);

    @Override // defpackage.kuh
    public final int b(oj9 oj9Var) throws zh8 {
        try {
            return w0(oj9Var);
        } catch (tgd e) {
            throw this.a(e, oj9Var, false, 4002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cb, code lost:
    
        if (r4.f(r2) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sj6 b0(i16 r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgd.b0(i16):sj6");
    }

    public abstract void c0(oj9 oj9Var, MediaFormat mediaFormat);

    public void d0() {
    }

    public void e0(long j) {
        this.u0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.z;
            if (arrayDeque.isEmpty() || j < ((qgd) arrayDeque.peek()).a) {
                return;
            }
            qgd qgdVar = (qgd) arrayDeque.poll();
            qgdVar.getClass();
            q0(qgdVar);
            f0();
        }
    }

    public abstract void f0();

    public void g0(qj6 qj6Var) {
    }

    public final void h0() throws MediaCryptoException, zh8 {
        byte b = this.i0;
        if (b == 1) {
            J();
            return;
        }
        if (b == 2) {
            J();
            y0();
        } else if (b != 3) {
            this.o0 = true;
            l0();
        } else {
            k0();
            U();
        }
    }

    @Override // defpackage.q83, defpackage.bkg
    public void handleMessage(int i, Object obj) {
        if (i == 11) {
            ti8 ti8Var = (ti8) obj;
            ti8Var.getClass();
            this.G = ti8Var;
            return;
        }
        if (i != 21) {
            if (i == 22) {
                obj.getClass();
                u1b u1bVar = (u1b) obj;
                if (this.B0.equals(u1bVar)) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    HashSet hashSet = new HashSet((Collection) u1bVar);
                    HashSet hashSet2 = new HashSet();
                    omm ommVarN = this.B0.n();
                    while (ommVarN.hasNext()) {
                        String str = (String) ommVarN.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    jgd jgdVar = this.K;
                    if (jgdVar != null) {
                        if (!hashSet2.isEmpty()) {
                            jgdVar.q(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            jgdVar.o(new ArrayList(hashSet));
                        }
                    }
                }
                this.B0 = u1bVar;
                return;
            }
            return;
        }
        obj.getClass();
        h75 h75Var = (h75) obj;
        this.z0 = h75Var;
        jgd jgdVar2 = this.K;
        if (jgdVar2 != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : h75Var.a.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        bundle.putInt(str2, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        bundle.putLong(str2, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        bundle.putFloat(str2, ((Float) value).floatValue());
                    } else if (value instanceof String) {
                        bundle.putString(str2, (String) value);
                    } else if (value instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) value;
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.duplicate().get(bArr);
                        bundle.putByteArray(str2, bArr);
                    }
                }
            }
            jgdVar2.b(bundle);
        }
    }

    @Override // defpackage.q83
    public final long i(long j, long j2) {
        return O(j, j2);
    }

    public abstract boolean i0(long j, long j2, jgd jgdVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, oj9 oj9Var);

    public final boolean j0(int i) throws MediaCryptoException, zh8 {
        i16 i16Var = this.c;
        i16Var.k();
        qj6 qj6Var = this.u;
        qj6Var.i();
        int iX = x(i16Var, qj6Var, i | 4);
        if (iX == -5) {
            b0(i16Var);
            return true;
        }
        if (iX != -4 || !qj6Var.d(4)) {
            return false;
        }
        this.n0 = true;
        h0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r3.H = null;
        p0(null);
        o0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            r3 = this;
            r0 = 0
            jgd r1 = r3.K     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L1a
            r1.release()     // Catch: java.lang.Throwable -> L2c
            nj6 r1 = r3.s0     // Catch: java.lang.Throwable -> L2c
            int r2 = r1.b     // Catch: java.lang.Throwable -> L2c
            int r2 = r2 + 1
            r1.b = r2     // Catch: java.lang.Throwable -> L2c
            ogd r1 = r3.R     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L2c
            r3.a0(r1)     // Catch: java.lang.Throwable -> L2c
        L1a:
            r3.K = r0
            android.media.MediaCrypto r1 = r3.H     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L23
            r1.release()     // Catch: java.lang.Throwable -> L3f
        L23:
            r3.H = r0
            r3.p0(r0)
            r3.o0()
            return
        L2c:
            r1 = move-exception
            r3.K = r0
            android.media.MediaCrypto r2 = r3.H     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L36
            r2.release()     // Catch: java.lang.Throwable -> L3f
        L36:
            r3.H = r0
            r3.p0(r0)
            r3.o0()
            throw r1
        L3f:
            r1 = move-exception
            r3.H = r0
            r3.p0(r0)
            r3.o0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgd.k0():void");
    }

    public abstract void l0();

    public final void m0() {
        this.m0 = -9223372036854775807L;
        P().e = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.e0 = false;
        this.x.i();
        this.w.i();
        this.d0 = false;
        ByteBuffer byteBuffer = eh2.a;
        m9f m9fVar = this.A;
        m9fVar.c = byteBuffer;
        m9fVar.b = 0;
        m9fVar.a = 2;
    }

    @Override // defpackage.q83
    public void n() {
        this.C = null;
        q0(qgd.f);
        this.z.clear();
        if (this.c0) {
            this.c0 = false;
            m0();
        } else {
            if (this.K == null) {
                return;
            }
            if (u0()) {
                k0();
            } else if (s0()) {
                J();
            } else {
                this.x0 = true;
            }
        }
    }

    public void n0() {
        this.Y = -1;
        this.v.e = null;
        this.Z = -1;
        this.a0 = null;
        this.m0 = -9223372036854775807L;
        P().e = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.X = -9223372036854775807L;
        this.k0 = false;
        this.W = -9223372036854775807L;
        this.j0 = false;
        this.T = false;
        this.U = false;
        this.b0 = false;
        this.h0 = (byte) 0;
        this.i0 = (byte) 0;
        this.g0 = this.f0 ? (byte) 1 : (byte) 0;
        this.x0 = false;
        this.y0 = 0L;
    }

    public final void o0() {
        n0();
        this.r0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.l0 = false;
        this.O = -1.0f;
        this.S = false;
        this.V = false;
        this.f0 = false;
        this.g0 = (byte) 0;
    }

    public final void p0(xl7 xl7Var) {
        xl7 xl7Var2 = this.E;
        if (xl7Var2 != xl7Var) {
            if (xl7Var != null) {
                xl7Var.e(null);
            }
            if (xl7Var2 != null) {
                xl7Var2.d(null);
            }
        }
        this.E = xl7Var;
    }

    @Override // defpackage.q83
    public void q(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.z;
        if (!arrayDeque.isEmpty()) {
            this.t0 = (qgd) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.n0 = false;
            this.o0 = false;
            this.q0 = false;
            if (this.c0) {
                m0();
            } else if (this.K != null) {
                if (u0()) {
                    k0();
                    U();
                } else if (s0()) {
                    J();
                } else {
                    this.x0 = true;
                }
            }
            if (this.t0.d.U() > 0) {
                this.p0 = true;
            }
            this.t0.d.m();
        }
    }

    public final void q0(qgd qgdVar) {
        this.t0 = qgdVar;
        if (qgdVar.c != -9223372036854775807L) {
            this.v0 = true;
            d0();
        }
    }

    public boolean r0(qj6 qj6Var) {
        return false;
    }

    public boolean s0() {
        return true;
    }

    @Override // defpackage.q83, defpackage.kuh
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public boolean t0(ogd ogdVar) {
        return true;
    }

    public boolean u0() throws MediaCryptoException {
        byte b = this.i0;
        if (b == 3 || (this.S && !this.l0)) {
            return true;
        }
        if (b != 2) {
            return false;
        }
        try {
            y0();
            return false;
        } catch (zh8 e) {
            w7d.L("Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.q83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(defpackage.oj9[] r12, long r13, long r15, defpackage.jrd r17) {
        /*
            r11 = this;
            qgd r12 = r11.t0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            qgd r4 = new qgd
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.q0(r4)
            boolean r12 = r11.w0
            if (r12 == 0) goto L56
            r11.f0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.z
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.m0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.u0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            qgd r4 = new qgd
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.q0(r4)
            qgd r12 = r11.t0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.f0()
        L56:
            return
        L57:
            qgd r0 = new qgd
            long r1 = r11.m0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgd.v(oj9[], long, long, jrd):void");
    }

    public boolean v0(oj9 oj9Var) {
        return false;
    }

    public abstract int w0(oj9 oj9Var);

    public final boolean x0(oj9 oj9Var) {
        if (this.K != null && this.i0 != 3 && this.h != 0) {
            float f = this.J;
            oj9Var.getClass();
            oj9[] oj9VarArr = this.j;
            oj9VarArr.getClass();
            float fM = M(f, oj9Var, oj9VarArr);
            float f2 = this.O;
            if (f2 != fM) {
                if (fM == -1.0f) {
                    if (this.j0) {
                        this.h0 = (byte) 1;
                        this.i0 = (byte) 3;
                        return false;
                    }
                    k0();
                    U();
                    return false;
                }
                if (f2 != -1.0f || fM > this.t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fM);
                    jgd jgdVar = this.K;
                    jgdVar.getClass();
                    jgdVar.b(bundle);
                    this.O = fM;
                }
            }
        }
        return true;
    }

    @Override // defpackage.q83
    public void y(long j, long j2) {
        boolean z = false;
        if (this.q0) {
            this.q0 = false;
            h0();
        }
        zh8 zh8Var = this.r0;
        if (zh8Var != null) {
            this.r0 = null;
            throw zh8Var;
        }
        try {
            if (this.o0) {
                l0();
                return;
            }
            if (this.C != null || j0(2)) {
                U();
                if (this.c0) {
                    Trace.beginSection("bypassRender");
                    while (E(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.K != null) {
                    this.g.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (H(j, j2)) {
                    }
                    while (I()) {
                    }
                    Trace.endSection();
                } else {
                    nj6 nj6Var = this.s0;
                    int i = nj6Var.d;
                    vhi vhiVar = this.i;
                    vhiVar.getClass();
                    nj6Var.d = i + vhiVar.skipData(j - this.k);
                    j0(1);
                }
                synchronized (this.s0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw a(e, this.C, false, tym.w(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            X(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                k0();
            }
            ngd ngdVarG = G(e2, this.R);
            throw a(ngdVarG, this.C, z, ngdVarG.a == 1101 ? 4006 : 4003);
        }
    }

    public final void y0() throws MediaCryptoException, zh8 {
        xl7 xl7Var = this.F;
        xl7Var.getClass();
        oo9 oo9VarC = xl7Var.c();
        if (oo9VarC != null) {
            try {
                MediaCrypto mediaCrypto = this.H;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(oo9VarC.b);
            } catch (MediaCryptoException e) {
                throw a(e, this.C, false, 6006);
            }
        }
        p0(this.F);
        this.h0 = (byte) 0;
        this.i0 = (byte) 0;
    }

    public final void z0(long j) {
        oj9 oj9Var = (oj9) this.t0.d.O(j);
        if (oj9Var == null && this.v0 && this.M != null) {
            oj9Var = (oj9) this.t0.d.N();
        }
        if (oj9Var != null) {
            this.D = oj9Var;
        } else if (!this.N || (oj9Var = this.D) == null) {
            return;
        }
        c0(oj9Var, this.M);
        this.N = false;
        this.v0 = false;
    }
}
