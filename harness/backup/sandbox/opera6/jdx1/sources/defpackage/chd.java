package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class chd extends rgd {
    public static final int[] v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean w1;
    public static boolean x1;
    public final Context D0;
    public final boolean E0;
    public final iuh F0;
    public final byte G0;
    public final boolean H0;
    public final a4n I0;
    public final rr3 J0;
    public final long K0;
    public final b4n L0;
    public final PriorityQueue M0;
    public sv2 N0;
    public boolean O0;
    public boolean P0;
    public q4n Q0;
    public boolean R0;
    public int S0;
    public List T0;
    public Surface U0;
    public nfg V0;
    public zoj W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public long a1;
    public int b1;
    public int c1;
    public int d1;
    public upi e1;
    public long f1;
    public boolean g1;
    public long h1;
    public int i1;
    public long j1;
    public r4n k1;
    public r4n l1;
    public int m1;
    public boolean n1;
    public int o1;
    public bhd p1;
    public y3n q1;
    public long r1;
    public long s1;
    public boolean t1;
    public int u1;

    public chd(ahd ahdVar) {
        super(2, ahdVar.c, 30.0f);
        Context applicationContext = ahdVar.a.getApplicationContext();
        this.D0 = applicationContext;
        this.G0 = ahdVar.g;
        this.Q0 = null;
        this.F0 = new iuh(ahdVar.e, ahdVar.f);
        this.E0 = this.Q0 == null;
        this.I0 = new a4n(applicationContext, this, ahdVar.d);
        this.J0 = new rr3();
        this.H0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.W0 = zoj.c;
        this.Y0 = 1;
        this.Z0 = 0;
        this.k1 = r4n.d;
        this.o1 = 0;
        this.l1 = null;
        this.m1 = -1000;
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.M0 = new PriorityQueue();
        this.K0 = -9223372036854775807L;
        this.L0 = null;
        this.e1 = null;
    }

    public static boolean A0(String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (chd.class) {
            if (!w1) {
                String str2 = Build.MODEL;
                str2.getClass();
                switch (str2) {
                    case "AFTJMST12":
                    case "AFTKMST12":
                    case "AFTA":
                    case "AFTN":
                    case "AFTR":
                    case "AFTEU011":
                    case "AFTEU014":
                    case "AFTSO001":
                    case "AFTEUFF014":
                        z = true;
                        break;
                }
                x1 = z;
                w1 = true;
            }
        }
        return x1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int B0(defpackage.ogd r11, defpackage.oj9 r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.B0(ogd, oj9):int");
    }

    public static List C0(Context context, oj9 oj9Var, boolean z, boolean z2) {
        csh cshVarD;
        String str = oj9Var.n;
        if (str == null) {
            a1b a1bVar = h1b.b;
            return csh.e;
        }
        if ("video/dolby-vision".equals(str) && !w7d.p(context)) {
            String strB = wgd.b(oj9Var);
            if (strB == null) {
                a1b a1bVar2 = h1b.b;
                cshVarD = csh.e;
            } else {
                cshVarD = wgd.d(strB, z, z2);
            }
            if (!cshVarD.isEmpty()) {
                return cshVarD;
            }
        }
        return wgd.f(oj9Var, z, z2);
    }

    public static int D0(ogd ogdVar, oj9 oj9Var) {
        int i = oj9Var.o;
        List list = oj9Var.q;
        if (i == -1) {
            return B0(ogdVar, oj9Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return oj9Var.o + length;
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void B(float f, float f2) {
        super.B(f, f2);
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            q4nVar.b(f);
        } else {
            this.I0.h(f);
        }
        b4n b4nVar = this.L0;
        if (b4nVar != null) {
            b4nVar.c(f);
        }
    }

    @Override // defpackage.q83
    public final boolean C(long j) {
        if (this.m0 == -9223372036854775807L || j < this.f1) {
            return false;
        }
        long j2 = this.u0;
        return j2 == -9223372036854775807L || j > j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface E0(defpackage.ogd r6) {
        /*
            r5 = this;
            q4n r0 = r5.Q0
            if (r0 == 0) goto L9
            android.view.Surface r5 = r0.getInputSurface()
            return r5
        L9:
            android.view.Surface r0 = r5.U0
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.M0(r6)
            defpackage.z4o.H(r0)
            nfg r0 = r5.V0
            if (r0 == 0) goto L35
            boolean r1 = r0.a
            boolean r3 = r6.f
            if (r1 == r3) goto L35
            if (r0 == 0) goto L33
            r0.release()
            r5.V0 = r2
            goto L34
        L33:
            r2 = r0
        L34:
            r0 = r2
        L35:
            if (r0 != 0) goto La9
            boolean r6 = r6.f
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L45
            boolean r2 = defpackage.nfg.a()
            if (r2 != 0) goto L47
            r2 = r1
            goto L48
        L45:
            byte r2 = defpackage.nfg.d
        L47:
            r2 = r0
        L48:
            defpackage.z4o.H(r2)
            mfg r2 = new mfg
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r2.<init>(r3)
            if (r6 == 0) goto L57
            byte r6 = defpackage.nfg.d
            goto L58
        L57:
            r6 = r1
        L58:
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r2.getLooper()
            r3.<init>(r4, r2)
            r2.b = r3
            rq7 r4 = new rq7
            r4.<init>(r3)
            r2.a = r4
            monitor-enter(r2)
            android.os.Handler r3 = r2.b     // Catch: java.lang.Throwable -> La7
            android.os.Message r6 = r3.obtainMessage(r0, r6, r1)     // Catch: java.lang.Throwable -> La7
            r6.sendToTarget()     // Catch: java.lang.Throwable -> La7
        L77:
            nfg r6 = r2.e     // Catch: java.lang.Throwable -> La7
            if (r6 != 0) goto L89
            java.lang.RuntimeException r6 = r2.d     // Catch: java.lang.Throwable -> La7
            if (r6 != 0) goto L89
            java.lang.Error r6 = r2.c     // Catch: java.lang.Throwable -> La7
            if (r6 != 0) goto L89
            r2.wait()     // Catch: java.lang.InterruptedException -> L87 java.lang.Throwable -> La7
            goto L77
        L87:
            r1 = r0
            goto L77
        L89:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L93
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L93:
            java.lang.RuntimeException r6 = r2.d
            if (r6 != 0) goto La4
            java.lang.Error r6 = r2.c
            if (r6 != 0) goto La3
            nfg r6 = r2.e
            r6.getClass()
            r5.V0 = r6
            return r6
        La3:
            throw r6
        La4:
            throw r6
        La5:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r5
        La7:
            r5 = move-exception
            goto La5
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.E0(ogd):android.view.Surface");
    }

    @Override // defpackage.rgd
    public final sj6 F(ogd ogdVar, oj9 oj9Var, oj9 oj9Var2) {
        sj6 sj6VarB = ogdVar.b(oj9Var, oj9Var2);
        int i = sj6VarB.e;
        sv2 sv2Var = this.N0;
        sv2Var.getClass();
        if (oj9Var2.u > sv2Var.a || oj9Var2.v > sv2Var.b) {
            i |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (D0(ogdVar, oj9Var2) > sv2Var.c) {
            i |= 64;
        }
        int i2 = i;
        return new sj6(ogdVar.a, oj9Var, oj9Var2, i2 != 0 ? (byte) 0 : sj6VarB.d, i2);
    }

    public final boolean F0(ogd ogdVar) {
        if (this.Q0 != null) {
            return true;
        }
        Surface surface = this.U0;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && ogdVar.h) || M0(ogdVar);
        }
        return true;
    }

    @Override // defpackage.rgd
    public final ngd G(IllegalStateException illegalStateException, ogd ogdVar) {
        Surface surface = this.U0;
        xgd xgdVar = new xgd(illegalStateException, ogdVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return xgdVar;
    }

    public final boolean G0(qj6 qj6Var) {
        if (k() || qj6Var.d(536870912)) {
            return true;
        }
        long j = this.s1;
        return j == -9223372036854775807L || j - (qj6Var.g - this.t0.c) <= 100000;
    }

    public final void H0() {
        if (this.b1 > 0) {
            this.g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.a1;
            int i = this.b1;
            iuh iuhVar = this.F0;
            Handler handler = (Handler) iuhVar.b;
            if (handler != null) {
                handler.post(new m4n(iuhVar, i, j));
            }
            this.b1 = 0;
            this.a1 = jElapsedRealtime;
        }
    }

    public final void I0() {
        jgd jgdVar;
        if (!this.n1 || (jgdVar = this.K) == null) {
            return;
        }
        this.p1 = new bhd(this, jgdVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            jgdVar.b(bundle);
        }
    }

    public final void J0(jgd jgdVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jgdVar.i(i, j);
        Trace.endSection();
        this.s0.e++;
        this.c1 = 0;
        if (this.Q0 == null) {
            r4n r4nVar = this.k1;
            boolean zEquals = r4nVar.equals(r4n.d);
            iuh iuhVar = this.F0;
            if (!zEquals && !r4nVar.equals(this.l1)) {
                this.l1 = r4nVar;
                iuhVar.b(r4nVar);
            }
            a4n a4nVar = this.I0;
            boolean z = a4nVar.e != 3;
            a4nVar.e = 3;
            a4nVar.l.getClass();
            a4nVar.g = tym.N(SystemClock.elapsedRealtime());
            if (!z || (surface = this.U0) == null) {
                return;
            }
            Handler handler = (Handler) iuhVar.b;
            if (handler != null) {
                handler.post(new ni2(iuhVar, surface, SystemClock.elapsedRealtime(), (byte) 6));
            }
            this.X0 = true;
        }
    }

    public final void K0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.U0;
        iuh iuhVar = this.F0;
        if (surface2 == surface) {
            if (surface != null) {
                r4n r4nVar = this.l1;
                if (r4nVar != null) {
                    iuhVar.b(r4nVar);
                }
                Surface surface3 = this.U0;
                if (surface3 == null || !this.X0 || (handler = (Handler) iuhVar.b) == null) {
                    return;
                }
                handler.post(new ni2(iuhVar, surface3, SystemClock.elapsedRealtime(), (byte) 6));
                return;
            }
            return;
        }
        this.U0 = surface;
        q4n q4nVar = this.Q0;
        a4n a4nVar = this.I0;
        if (q4nVar == null) {
            a4nVar.g(surface);
        }
        this.X0 = false;
        byte b = this.h;
        jgd jgdVar = this.K;
        if (jgdVar != null && this.Q0 == null) {
            ogd ogdVar = this.R;
            ogdVar.getClass();
            if (!F0(ogdVar) || this.O0) {
                k0();
                U();
            } else {
                Surface surfaceE0 = E0(ogdVar);
                if (surfaceE0 != null) {
                    jgdVar.g(surfaceE0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        h9o.e();
                        return;
                    }
                    jgdVar.e();
                }
            }
        }
        if (surface != null) {
            r4n r4nVar2 = this.l1;
            if (r4nVar2 != null) {
                iuhVar.b(r4nVar2);
            }
        } else {
            this.l1 = null;
            q4n q4nVar2 = this.Q0;
            if (q4nVar2 != null) {
                q4nVar2.n();
            }
        }
        if (b == 2) {
            q4n q4nVar3 = this.Q0;
            if (q4nVar3 != null) {
                q4nVar3.r(true);
            } else {
                a4nVar.c(true);
            }
        }
        I0();
    }

    @Override // defpackage.rgd
    public final int L(qj6 qj6Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.e1 != null || this.n1) && qj6Var.g < this.l && !G0(qj6Var)) ? 32 : 0;
        }
        return 0;
    }

    public final boolean L0(long j, long j2, boolean z, boolean z2) {
        if (this.Q0 != null && this.E0) {
            j2 -= -this.r1;
        }
        if (j < -500000 && !z) {
            vhi vhiVar = this.i;
            vhiVar.getClass();
            int iSkipData = vhiVar.skipData(j2 - this.k);
            if (iSkipData != 0) {
                this.f1 = j2;
                nj6 nj6Var = this.s0;
                PriorityQueue priorityQueue = this.M0;
                if (z2) {
                    int i = nj6Var.d + iSkipData;
                    nj6Var.d = i;
                    nj6Var.f += this.d1;
                    nj6Var.d = priorityQueue.size() + i;
                } else {
                    nj6Var.j++;
                    O0(priorityQueue.size() + iSkipData, this.d1);
                }
                if (this.K != null) {
                    if (u0()) {
                        k0();
                        U();
                    } else if (s0()) {
                        J();
                    } else {
                        this.x0 = true;
                    }
                }
                q4n q4nVar = this.Q0;
                if (q4nVar != null) {
                    q4nVar.q(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rgd
    public final float M(float f, oj9 oj9Var, oj9[] oj9VarArr) {
        ogd ogdVar;
        float fMax = -1.0f;
        for (oj9 oj9Var2 : oj9VarArr) {
            float f2 = oj9Var2.y;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.e1 == null || (ogdVar = this.R) == null) {
            return f3;
        }
        int i = oj9Var.u;
        int i2 = oj9Var.v;
        float f4 = -3.4028235E38f;
        if (ogdVar.i) {
            float f5 = ogdVar.l;
            if (f5 != -3.4028235E38f && ogdVar.j == i && ogdVar.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!ogdVar.g(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        if (ogdVar.g(i, i2, f8)) {
                            f6 = f8;
                        } else {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                ogdVar.l = f4;
                ogdVar.j = i;
                ogdVar.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final boolean M0(ogd ogdVar) {
        if (this.n1 || A0(ogdVar.a)) {
            return false;
        }
        return !ogdVar.f || nfg.a();
    }

    @Override // defpackage.rgd
    public final ArrayList N(oj9 oj9Var, boolean z) {
        List listC0 = C0(this.D0, oj9Var, z, this.n1);
        HashMap map = wgd.a;
        ArrayList arrayList = new ArrayList(listC0);
        Collections.sort(arrayList, new vd3(new yzb(oj9Var, (byte) 20), (byte) 3));
        return arrayList;
    }

    public final void N0(jgd jgdVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        jgdVar.h(i);
        Trace.endSection();
        this.s0.f++;
    }

    public final void O0(int i, int i2) {
        nj6 nj6Var = this.s0;
        nj6Var.h += i;
        int i3 = i + i2;
        nj6Var.g += i3;
        this.b1 += i3;
        int i4 = this.c1 + i3;
        this.c1 = i4;
        nj6Var.i = Math.max(i4, nj6Var.i);
        byte b = this.G0;
        if (b <= 0 || this.b1 < b) {
            return;
        }
        H0();
    }

    public final void P0(jrd jrdVar) {
        gql gqlVar = this.p;
        if (gqlVar.p()) {
            this.s1 = -9223372036854775807L;
            return;
        }
        int iB = gqlVar.b(jrdVar.a);
        if (iB == -1) {
            this.s1 = -9223372036854775807L;
        } else {
            this.s1 = gqlVar.f(iB, new dql(), false).d;
        }
    }

    @Override // defpackage.rgd
    public final igi Q(ogd ogdVar, oj9 oj9Var, MediaCrypto mediaCrypto, float f) {
        ja5 ja5Var;
        int i;
        sv2 sv2Var;
        int i2;
        int i3;
        Point point;
        int i4;
        Point point2;
        int i5;
        boolean z;
        Pair pairB;
        int iB0;
        String str = ogdVar.c;
        oj9[] oj9VarArr = this.j;
        oj9VarArr.getClass();
        int i6 = oj9Var.u;
        float f2 = oj9Var.y;
        ja5 ja5Var2 = oj9Var.D;
        int i7 = oj9Var.v;
        int iD0 = D0(ogdVar, oj9Var);
        if (oj9VarArr.length == 1) {
            if (iD0 != -1 && (iB0 = B0(ogdVar, oj9Var)) != -1) {
                iD0 = Math.min((int) (iD0 * 1.5f), iB0);
            }
            sv2Var = new sv2(i6, i7, iD0);
            ja5Var = ja5Var2;
            i = i7;
        } else {
            int length = oj9VarArr.length;
            int iMax = i6;
            int iMax2 = i7;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                oj9 oj9Var2 = oj9VarArr[i8];
                oj9[] oj9VarArr2 = oj9VarArr;
                if (ja5Var2 != null && oj9Var2.D == null) {
                    nj9 nj9VarA = oj9Var2.a();
                    nj9VarA.C = ja5Var2;
                    oj9Var2 = new oj9(nj9VarA);
                }
                sj6 sj6VarB = ogdVar.b(oj9Var, oj9Var2);
                int i9 = length;
                int i10 = oj9Var2.v;
                if (sj6VarB.d != 0) {
                    int i11 = oj9Var2.u;
                    i5 = i8;
                    z2 |= i11 == -1 || i10 == -1;
                    iMax = Math.max(iMax, i11);
                    iMax2 = Math.max(iMax2, i10);
                    iD0 = Math.max(iD0, D0(ogdVar, oj9Var2));
                } else {
                    i5 = i8;
                }
                length = i9;
                i8 = i5 + 1;
                oj9VarArr = oj9VarArr2;
            }
            if (z2) {
                w7d.K("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i7 > i6;
                if (z3) {
                    i3 = i6;
                    i2 = i7;
                } else {
                    i2 = i6;
                    i3 = i7;
                }
                boolean z4 = z3;
                float f3 = i3 / i2;
                int i12 = 0;
                while (i12 < 9) {
                    int i13 = v1[i12];
                    int i14 = i12;
                    int i15 = (int) (i13 * f3);
                    if (i13 <= i2 || i15 <= i3) {
                        break;
                    }
                    if (!z4) {
                        i15 = i13;
                        i13 = i15;
                    }
                    int i16 = i3;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ogdVar.d.getVideoCapabilities();
                    if (videoCapabilities == null) {
                        ja5Var = ja5Var2;
                        i4 = i2;
                        point2 = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i4 = i2;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        ja5Var = ja5Var2;
                        point2 = new Point(tym.g(i15, widthAlignment) * widthAlignment, tym.g(i13, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        i = i7;
                        if (ogdVar.g(point2.x, point2.y, f2)) {
                            break;
                        }
                    } else {
                        i = i7;
                    }
                    i12 = i14 + 1;
                    i7 = i;
                    i3 = i16;
                    ja5Var2 = ja5Var;
                    i2 = i4;
                }
                ja5Var = ja5Var2;
                i = i7;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    nj9 nj9VarA2 = oj9Var.a();
                    nj9VarA2.t = iMax;
                    nj9VarA2.u = iMax2;
                    iD0 = Math.max(iD0, B0(ogdVar, new oj9(nj9VarA2)));
                    w7d.K("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                ja5Var = ja5Var2;
                i = i7;
            }
            sv2Var = new sv2(iMax, iMax2, iD0);
        }
        this.N0 = sv2Var;
        int i17 = this.n1 ? this.o1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i);
        qbe.O(mediaFormat, oj9Var.q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        qbe.H(mediaFormat, "rotation-degrees", oj9Var.z);
        if (ja5Var != null) {
            ja5 ja5Var3 = ja5Var;
            qbe.H(mediaFormat, "color-transfer", ja5Var3.c);
            qbe.H(mediaFormat, "color-standard", ja5Var3.a);
            qbe.H(mediaFormat, "color-range", ja5Var3.b);
            byte[] bArr = ja5Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(oj9Var.n) && (pairB = j75.b(oj9Var)) != null) {
            qbe.H(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", sv2Var.a);
        mediaFormat.setInteger("max-height", sv2Var.b);
        qbe.H(mediaFormat, "max-input-size", sv2Var.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.H0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i17 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i17);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.m1));
        }
        D(mediaFormat);
        Surface surfaceE0 = E0(ogdVar);
        if (this.Q0 != null && !tym.J(this.D0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new igi(ogdVar, mediaFormat, oj9Var, surfaceE0, mediaCrypto, null, (byte) 26);
    }

    public final void Q0(long j) {
        nj6 nj6Var = this.s0;
        nj6Var.k += j;
        nj6Var.l++;
        this.h1 += j;
        this.i1++;
    }

    @Override // defpackage.rgd
    public final void R(qj6 qj6Var) {
        if (this.P0) {
            ByteBuffer byteBuffer = qj6Var.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        jgd jgdVar = this.K;
                        jgdVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jgdVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.rgd
    public final boolean W(oj9 oj9Var) throws zh8 {
        q4n q4nVar = this.Q0;
        if (q4nVar == null || q4nVar.isInitialized()) {
            return true;
        }
        try {
            return this.Q0.p(oj9Var);
        } catch (p4n e) {
            throw this.a(e, oj9Var, false, 7000);
        }
    }

    @Override // defpackage.rgd
    public final void X(Exception exc) {
        w7d.r("Video codec error", exc);
        iuh iuhVar = this.F0;
        Handler handler = (Handler) iuhVar.b;
        if (handler != null) {
            handler.post(new m4n(iuhVar, (Object) exc, (byte) 1));
        }
    }

    @Override // defpackage.rgd
    public final void Y(String str, long j, long j2) {
        String str2;
        iuh iuhVar = this.F0;
        Handler handler = (Handler) iuhVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new m4n(iuhVar, str2, j, j2));
        } else {
            str2 = str;
        }
        this.O0 = A0(str2);
        ogd ogdVar = this.R;
        ogdVar.getClass();
        boolean z = false;
        if ("video/x-vnd.on2.vp9".equals(ogdVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = ogdVar.d.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.P0 = z;
        I0();
    }

    @Override // defpackage.rgd
    public final void Z(h75 h75Var) {
        iuh iuhVar = this.F0;
        Handler handler = (Handler) iuhVar.b;
        if (handler != null) {
            handler.post(new npl(iuhVar, h75Var, (byte) 20));
        }
    }

    @Override // defpackage.rgd
    public final void a0(String str) {
        iuh iuhVar = this.F0;
        Handler handler = (Handler) iuhVar.b;
        if (handler != null) {
            handler.post(new m4n(iuhVar, (Object) str, (byte) 2));
        }
    }

    @Override // defpackage.rgd
    public final sj6 b0(i16 i16Var) {
        sj6 sj6VarB0 = super.b0(i16Var);
        oj9 oj9Var = (oj9) i16Var.c;
        oj9Var.getClass();
        iuh iuhVar = this.F0;
        Handler handler = (Handler) iuhVar.b;
        if (handler != null) {
            handler.post(new m4n(iuhVar, oj9Var, sj6VarB0));
        }
        b4n b4nVar = this.L0;
        if (b4nVar != null) {
            b4nVar.b();
        }
        return sj6VarB0;
    }

    @Override // defpackage.rgd
    public final void c0(oj9 oj9Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        jgd jgdVar = this.K;
        if (jgdVar != null) {
            jgdVar.setVideoScalingMode(this.Y0);
        }
        if (this.n1) {
            i = oj9Var.u;
            integer = oj9Var.v;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                int integer2 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                int integer3 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
                i = integer2;
                integer = integer3;
            } else {
                int integer4 = mediaFormat.getInteger("width");
                integer = mediaFormat.getInteger("height");
                i = integer4;
            }
        }
        float f = oj9Var.A;
        int i2 = oj9Var.z;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.k1 = new r4n(i, integer, f);
        q4n q4nVar = this.Q0;
        if (q4nVar == null || !this.t1) {
            this.I0.f(oj9Var.y);
        } else {
            nj9 nj9VarA = oj9Var.a();
            nj9VarA.t = i;
            nj9VarA.u = integer;
            nj9VarA.z = f;
            oj9 oj9Var2 = new oj9(nj9VarA);
            int i4 = this.S0;
            List list = this.T0;
            if (list == null) {
                a1b a1bVar = h1b.b;
                list = csh.e;
            }
            q4nVar.a(oj9Var2, this.t0.b, i4, list);
            this.S0 = 2;
        }
        this.t1 = false;
    }

    @Override // defpackage.rgd
    public final void e0(long j) {
        super.e0(j);
        if (this.n1) {
            return;
        }
        this.d1--;
    }

    @Override // defpackage.rgd
    public final void f0() {
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            q4nVar.d();
            long j = this.r1;
            if (j == -9223372036854775807L) {
                j = this.t0.b;
                this.r1 = j;
            }
            this.Q0.c(-j);
        } else {
            this.I0.e(2);
        }
        this.t1 = true;
        I0();
    }

    @Override // defpackage.rgd
    public final void g0(qj6 qj6Var) {
        this.u1 = 0;
        int iL = L(qj6Var);
        if ((Build.VERSION.SDK_INT < 34 || (iL & 32) == 0) && !this.n1) {
            this.d1++;
        }
    }

    @Override // defpackage.q83, defpackage.kuh
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.q83
    public final void h() {
        q4n q4nVar = this.Q0;
        if (q4nVar == null) {
            a4n a4nVar = this.I0;
            if (a4nVar.e == 0) {
                a4nVar.e = 1;
                return;
            }
            return;
        }
        int i = this.S0;
        if (i == 0 || i == 1) {
            this.S0 = 0;
        } else {
            q4nVar.j();
        }
    }

    @Override // defpackage.rgd, defpackage.q83, defpackage.bkg
    public final void handleMessage(int i, Object obj) {
        if (i == 1) {
            K0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            y3n y3nVar = (y3n) obj;
            this.q1 = y3nVar;
            q4n q4nVar = this.Q0;
            if (q4nVar != null) {
                q4nVar.s(y3nVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.o1 != iIntValue) {
                this.o1 = iIntValue;
                if (this.n1) {
                    k0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.Y0 = iIntValue2;
            jgd jgdVar = this.K;
            if (jgdVar != null) {
                jgdVar.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.Z0 = iIntValue3;
            q4n q4nVar2 = this.Q0;
            if (q4nVar2 != null) {
                q4nVar2.m(iIntValue3);
                return;
            }
            f4n f4nVar = this.I0.b;
            if (f4nVar.j != iIntValue3) {
                f4nVar.j = iIntValue3;
                f4nVar.d(true);
                return;
            }
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(z3n.a)) {
                q4n q4nVar3 = this.Q0;
                if (q4nVar3 == null || !q4nVar3.isInitialized()) {
                    return;
                }
                this.Q0.h();
                return;
            }
            this.T0 = list;
            q4n q4nVar4 = this.Q0;
            if (q4nVar4 != null) {
                q4nVar4.f(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zoj zojVar = (zoj) obj;
            if (zojVar.a == 0 || zojVar.b == 0) {
                return;
            }
            this.W0 = zojVar;
            q4n q4nVar5 = this.Q0;
            if (q4nVar5 != null) {
                Surface surface = this.U0;
                surface.getClass();
                q4nVar5.i(surface, zojVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.m1 = ((Integer) obj).intValue();
                jgd jgdVar2 = this.K;
                if (jgdVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.m1));
                    jgdVar2.b(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.U0;
                K0(null);
                obj.getClass();
                ((chd) obj).handleMessage(1, surface2);
                break;
            case 18:
                boolean z = this.e1 != null;
                upi upiVar = (upi) obj;
                this.e1 = upiVar;
                if (z != (upiVar != null)) {
                    x0(this.L);
                    break;
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // defpackage.rgd
    public final boolean i0(long j, long j2, jgd jgdVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, oj9 oj9Var) {
        int i4;
        jgdVar.getClass();
        long j4 = j3 - this.t0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.M0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        O0(i5, 0);
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            if (!z || z2) {
                return q4nVar.o(j3, new zgd(this, jgdVar, i, j4));
            }
            N0(jgdVar, i);
            return true;
        }
        int iA = this.I0.a(j3, j, j2, this.t0.b, z, z2, this.J0);
        rr3 rr3Var = this.J0;
        b4n b4nVar = this.L0;
        if (b4nVar != null && iA != 5 && iA != 4) {
            b4nVar.a(j3, rr3Var.b);
        }
        if (iA == 0) {
            this.g.getClass();
            long jNanoTime = System.nanoTime();
            y3n y3nVar = this.q1;
            if (y3nVar != null) {
                y3nVar.b(j4, jNanoTime, oj9Var, this.M);
            }
            J0(jgdVar, i, jNanoTime);
            Q0(rr3Var.b);
            return true;
        }
        if (iA == 1) {
            long j5 = rr3Var.c;
            long j6 = rr3Var.b;
            if (j5 == this.j1) {
                N0(jgdVar, i);
            } else {
                y3n y3nVar2 = this.q1;
                if (y3nVar2 != null) {
                    i4 = i;
                    y3nVar2.b(j4, j5, oj9Var, this.M);
                } else {
                    i4 = i;
                }
                J0(jgdVar, i4, j5);
            }
            Q0(j6);
            this.j1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            jgdVar.h(i);
            Trace.endSection();
            O0(0, 1);
            Q0(rr3Var.b);
            return true;
        }
        if (iA == 3) {
            N0(jgdVar, i);
            Q0(rr3Var.b);
            return true;
        }
        if (iA != 4 && iA != 5) {
            qp2.n(String.valueOf(iA));
        }
        return false;
    }

    @Override // defpackage.q83
    public final boolean l() {
        if (!this.o0) {
            return false;
        }
        q4n q4nVar = this.Q0;
        return q4nVar == null || q4nVar.isEnded();
    }

    @Override // defpackage.rgd
    public final void l0() {
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            q4nVar.d();
        }
    }

    @Override // defpackage.q83
    public final boolean m() {
        boolean z;
        boolean zIsReady;
        if (this.C == null) {
            z = false;
        } else {
            if (k()) {
                zIsReady = this.n;
            } else {
                vhi vhiVar = this.i;
                vhiVar.getClass();
                zIsReady = vhiVar.isReady();
            }
            if (!zIsReady && this.Z < 0) {
                if (this.X != -9223372036854775807L) {
                    this.g.getClass();
                    if (SystemClock.elapsedRealtime() < this.X) {
                    }
                }
                z = false;
            }
            z = true;
        }
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            return q4nVar.g(z);
        }
        if (z && (this.K == null || this.n1)) {
            return true;
        }
        return this.I0.b(z);
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void n() {
        iuh iuhVar = this.F0;
        this.l1 = null;
        this.s1 = -9223372036854775807L;
        I0();
        this.X0 = false;
        this.p1 = null;
        this.g1 = true;
        try {
            super.n();
            nj6 nj6Var = this.s0;
            iuhVar.getClass();
            synchronized (nj6Var) {
            }
            Handler handler = (Handler) iuhVar.b;
            if (handler != null) {
                handler.post(new npl(iuhVar, nj6Var, (byte) 22));
            }
            iuhVar.b(r4n.d);
        } catch (Throwable th) {
            nj6 nj6Var2 = this.s0;
            iuhVar.getClass();
            synchronized (nj6Var2) {
                Handler handler2 = (Handler) iuhVar.b;
                if (handler2 != null) {
                    handler2.post(new npl(iuhVar, nj6Var2, (byte) 22));
                }
                iuhVar.b(r4n.d);
                throw th;
            }
        }
    }

    @Override // defpackage.rgd
    public final void n0() {
        super.n0();
        this.M0.clear();
        this.d1 = 0;
        this.u1 = 0;
        this.g1 = false;
    }

    @Override // defpackage.q83
    public final void o(boolean z, boolean z2) {
        q4n q4nVar;
        this.s0 = new nj6();
        luh luhVar = this.d;
        luhVar.getClass();
        boolean z3 = luhVar.b;
        z4o.H((z3 && this.o1 == 0) ? false : true);
        if (this.n1 != z3) {
            this.n1 = z3;
            k0();
        }
        nj6 nj6Var = this.s0;
        iuh iuhVar = this.F0;
        Handler handler = (Handler) iuhVar.b;
        if (handler != null) {
            handler.post(new m4n(iuhVar, (Object) nj6Var, (byte) 5));
        }
        boolean z4 = this.R0;
        a4n a4nVar = this.I0;
        if (!z4) {
            if (this.T0 != null && this.Q0 == null) {
                whg whgVar = new whg(this.D0, a4nVar);
                whgVar.d = true;
                long j = this.K0;
                whgVar.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                kzk kzkVar = this.g;
                kzkVar.getClass();
                whgVar.e = kzkVar;
                z4o.H(!whgVar.f);
                if (whgVar.c == null) {
                    whgVar.c = new zhg();
                }
                big bigVar = new big(whgVar);
                whgVar.f = true;
                if (1 >= bigVar.p) {
                    bigVar.p = 1;
                }
                SparseArray sparseArray = bigVar.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    q4nVar = (q4n) sparseArray.get(0);
                } else {
                    xhg xhgVar = new xhg(bigVar, bigVar.a);
                    bigVar.g.add(xhgVar);
                    sparseArray.put(0, xhgVar);
                    q4nVar = xhgVar;
                }
                this.Q0 = q4nVar;
            }
            this.R0 = true;
        }
        q4n q4nVar2 = this.Q0;
        if (q4nVar2 == null) {
            kzk kzkVar2 = this.g;
            kzkVar2.getClass();
            a4nVar.l = kzkVar2;
            a4nVar.e(!z2 ? 1 : 0);
            return;
        }
        q4nVar2.e(new ygd(this));
        y3n y3nVar = this.q1;
        if (y3nVar != null) {
            this.Q0.s(y3nVar);
        }
        if (this.U0 != null && !this.W0.equals(zoj.c)) {
            this.Q0.i(this.U0, this.W0);
        }
        this.Q0.m(this.Z0);
        this.Q0.b(this.I);
        List list = this.T0;
        if (list != null) {
            this.Q0.f(list);
        }
        this.S0 = !z2 ? 1 : 0;
        this.w0 = true;
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void q(long j, boolean z, boolean z2) {
        q4n q4nVar = this.Q0;
        if (q4nVar != null && !z) {
            q4nVar.q(true);
        }
        if (z2) {
            this.f1 = j;
        }
        super.q(j, z, z2);
        q4n q4nVar2 = this.Q0;
        a4n a4nVar = this.I0;
        if (q4nVar2 == null) {
            a4nVar.b.b();
            a4nVar.h = -9223372036854775807L;
            a4nVar.f = -9223372036854775807L;
            a4nVar.e = Math.min(a4nVar.e, 1);
            a4nVar.i = -9223372036854775807L;
        }
        b4n b4nVar = this.L0;
        if (b4nVar != null) {
            b4nVar.b();
        }
        if (z) {
            q4n q4nVar3 = this.Q0;
            if (q4nVar3 != null) {
                q4nVar3.r(false);
            } else {
                a4nVar.c(false);
            }
        }
        I0();
        this.c1 = 0;
    }

    @Override // defpackage.q83
    public final void r() {
        q4n q4nVar = this.Q0;
        if (q4nVar == null || !this.E0) {
            return;
        }
        q4nVar.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @Override // defpackage.rgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r0(defpackage.qj6 r13) {
        /*
            r12 = this;
            boolean r0 = r12.G0(r13)
            r1 = 0
            if (r0 != 0) goto L47
            long r2 = r13.g
            long r4 = r12.l
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 1
            if (r0 >= 0) goto L12
            r0 = r4
            goto L13
        L12:
            r0 = r1
        L13:
            b4n r5 = r12.L0
            if (r5 == 0) goto L3a
            long r6 = r5.a
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L24
            r2 = r8
            goto L2e
        L24:
            long r10 = r5.b
            double r10 = (double) r10
            long r2 = r2 - r6
            double r2 = (double) r2
            double r5 = r5.c
            double r2 = r2 * r5
            double r2 = r2 + r10
            long r2 = (long) r2
        L2e:
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 == 0) goto L3a
            long r5 = r12.K0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L3a
            r2 = r4
            goto L3b
        L3a:
            r2 = r1
        L3b:
            if (r0 != 0) goto L3f
            if (r2 == 0) goto L47
        L3f:
            r2 = 268435456(0x10000000, float:2.524355E-29)
            boolean r2 = r13.d(r2)
            if (r2 == 0) goto L48
        L47:
            return r1
        L48:
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r2 = r13.d(r2)
            if (r2 == 0) goto L54
            r13.i()
            r1 = r4
        L54:
            if (r1 == 0) goto L70
            if (r0 == 0) goto L60
            nj6 r12 = r12.s0
            int r13 = r12.d
            int r13 = r13 + r4
            r12.d = r13
            goto L70
        L60:
            long r2 = r13.g
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.util.PriorityQueue r0 = r12.M0
            r0.add(r13)
            int r13 = r12.u1
            int r13 = r13 + r4
            r12.u1 = r13
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.r0(qj6):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q83
    public final void s() {
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
            this.R0 = false;
            this.r1 = -9223372036854775807L;
            nfg nfgVar = this.V0;
            if (nfgVar != null) {
                nfgVar.release();
                this.V0 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // defpackage.rgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s0() {
        /*
            r12 = this;
            oj9 r0 = r12.L
            long r1 = r12.s1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L26
            r8 = 1
            long r8 = r8 + r1
            qgd r5 = r12.t0
            long r10 = r5.c
            long r10 = r10 + r1
            long r1 = r12.y0
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L26
            r1 = r6
            goto L27
        L26:
            r1 = r7
        L27:
            upi r2 = r12.e1
            if (r2 == 0) goto L44
            boolean r2 = r12.g1
            if (r2 != 0) goto L44
            boolean r2 = r12.n1
            if (r2 != 0) goto L44
            if (r0 == 0) goto L39
            int r0 = r0.p
            if (r0 > 0) goto L44
        L39:
            if (r1 != 0) goto L44
            qgd r12 = r12.t0
            long r0 = r12.e
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 != 0) goto L44
            return r6
        L44:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.s0():boolean");
    }

    @Override // defpackage.q83
    public final void t() {
        this.b1 = 0;
        this.g.getClass();
        this.a1 = SystemClock.elapsedRealtime();
        this.h1 = 0L;
        this.i1 = 0;
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            q4nVar.l();
        } else {
            this.I0.d();
        }
    }

    @Override // defpackage.rgd
    public final boolean t0(ogd ogdVar) {
        return F0(ogdVar);
    }

    @Override // defpackage.q83
    public final void u() {
        H0();
        int i = this.i1;
        if (i != 0) {
            long j = this.h1;
            iuh iuhVar = this.F0;
            Handler handler = (Handler) iuhVar.b;
            if (handler != null) {
                handler.post(new m4n(iuhVar, j, i));
            }
            this.h1 = 0L;
            this.i1 = 0;
        }
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            q4nVar.k();
        } else {
            a4n a4nVar = this.I0;
            a4nVar.d = false;
            a4nVar.i = -9223372036854775807L;
            f4n f4nVar = a4nVar.b;
            f4nVar.d = false;
            c4n c4nVar = f4nVar.c;
            if (c4nVar != null) {
                c4nVar.b();
            }
            f4nVar.a();
        }
        b4n b4nVar = this.L0;
        if (b4nVar != null) {
            b4nVar.b();
        }
    }

    @Override // defpackage.rgd
    public final boolean u0() {
        ogd ogdVar = this.R;
        if (this.Q0 != null && ogdVar != null) {
            String str = ogdVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.u0();
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void v(oj9[] oj9VarArr, long j, long j2, jrd jrdVar) {
        super.v(oj9VarArr, j, j2, jrdVar);
        P0(jrdVar);
        b4n b4nVar = this.L0;
        if (b4nVar != null) {
            b4nVar.b();
        }
    }

    @Override // defpackage.q83
    public final void w() {
        jrd jrdVar = this.q;
        if (jrdVar != null) {
            P0(jrdVar);
        }
    }

    @Override // defpackage.rgd
    public final int w0(oj9 oj9Var) {
        boolean z;
        int i = 0;
        if (!dzd.o(oj9Var.n)) {
            return kuh.g(0, 0, 0, 0);
        }
        boolean z2 = oj9Var.r != null;
        Context context = this.D0;
        List listC0 = C0(context, oj9Var, z2, false);
        if (z2 && listC0.isEmpty()) {
            listC0 = C0(context, oj9Var, false, false);
        }
        if (listC0.isEmpty()) {
            return kuh.g(1, 0, 0, 0);
        }
        int i2 = oj9Var.O;
        if (i2 != 0 && i2 != 2) {
            return kuh.g(2, 0, 0, 0);
        }
        ogd ogdVar = (ogd) listC0.get(0);
        boolean zE = ogdVar.e(oj9Var);
        if (zE) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listC0.size(); i3++) {
                ogd ogdVar2 = (ogd) listC0.get(i3);
                if (ogdVar2.e(oj9Var)) {
                    z = false;
                    zE = true;
                    ogdVar = ogdVar2;
                    break;
                }
            }
            z = true;
        }
        int i4 = zE ? 4 : 3;
        int i5 = ogdVar.f(oj9Var) ? 16 : 8;
        int i6 = ogdVar.g ? 64 : 0;
        int i7 = z ? NotificationCompat.FLAG_HIGH_PRIORITY : 0;
        if ("video/dolby-vision".equals(oj9Var.n) && !w7d.p(context)) {
            i7 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zE) {
            List listC02 = C0(context, oj9Var, z2, true);
            if (!listC02.isEmpty()) {
                HashMap map = wgd.a;
                ArrayList arrayList = new ArrayList(listC02);
                Collections.sort(arrayList, new vd3(new yzb(oj9Var, (byte) 20), (byte) 3));
                ogd ogdVar3 = (ogd) arrayList.get(0);
                if (ogdVar3.e(oj9Var) && ogdVar3.f(oj9Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // defpackage.rgd, defpackage.q83
    public final void y(long j, long j2) throws zh8 {
        q4n q4nVar = this.Q0;
        if (q4nVar != null) {
            try {
                q4nVar.render(j, j2);
            } catch (p4n e) {
                throw a(e, e.a, false, 7001);
            }
        }
        super.y(j, j2);
    }
}
