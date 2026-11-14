package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class xya extends q83 {
    public byte A;
    public int B;
    public oj9 C;
    public lg3 D;
    public qj6 E;
    public ImageOutput F;
    public Bitmap G;
    public boolean H;
    public y03 I;
    public y03 J;
    public int K;
    public boolean L;
    public final c61 s;
    public final qj6 t;
    public final ArrayDeque u;
    public boolean v;
    public boolean w;
    public wya x;
    public long y;
    public long z;

    public xya(c61 c61Var) {
        super(4);
        this.s = c61Var;
        this.F = ImageOutput.a;
        this.t = new qj6(0);
        this.x = wya.c;
        this.u = new ArrayDeque();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = (byte) 0;
        this.B = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r13) throws java.lang.InterruptedException, defpackage.zh8 {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xya.D(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r3
      0x002a: PHI (r3v3 qj6) = (r3v2 qj6), (r3v13 qj6) binds: [B:13:0x001d, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(long r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xya.E(long):boolean");
    }

    public final void F() throws InterruptedException, zh8 {
        if (this.L) {
            oj9 oj9Var = this.C;
            oj9Var.getClass();
            int iD = c61.d(oj9Var);
            if (iD != kuh.g(4, 0, 0, 0) && iD != kuh.g(3, 0, 0, 0)) {
                throw a(new kwa("Provided decoder factory can't create decoder for format."), this.C, false, 4005);
            }
            lg3 lg3Var = this.D;
            if (lg3Var != null) {
                lg3Var.release();
            }
            this.D = new lg3(this.s.a);
            this.L = false;
        }
    }

    public final void G() throws InterruptedException {
        this.E = null;
        this.A = (byte) 0;
        this.z = -9223372036854775807L;
        lg3 lg3Var = this.D;
        if (lg3Var != null) {
            lg3Var.release();
            this.D = null;
        }
    }

    @Override // defpackage.kuh
    public final int b(oj9 oj9Var) {
        return c61.d(oj9Var);
    }

    @Override // defpackage.q83, defpackage.kuh
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // defpackage.q83, defpackage.bkg
    public final void handleMessage(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.F = imageOutput;
    }

    @Override // defpackage.q83
    public final boolean l() {
        return this.w;
    }

    @Override // defpackage.q83
    public final boolean m() {
        int i = this.B;
        if (i != 3) {
            return i == 0 && this.H;
        }
        return true;
    }

    @Override // defpackage.q83
    public final void n() throws InterruptedException {
        this.C = null;
        this.x = wya.c;
        this.u.clear();
        G();
        this.F.a();
    }

    @Override // defpackage.q83
    public final void o(boolean z, boolean z2) {
        this.B = z2 ? 1 : 0;
    }

    @Override // defpackage.q83
    public final void q(long j, boolean z, boolean z2) {
        this.B = Math.min(this.B, 1);
        this.w = false;
        this.v = false;
        this.G = null;
        this.I = null;
        this.J = null;
        this.H = false;
        this.E = null;
        lg3 lg3Var = this.D;
        if (lg3Var != null) {
            lg3Var.flush();
        }
        this.u.clear();
    }

    @Override // defpackage.q83
    public final void r() throws InterruptedException {
        G();
    }

    @Override // defpackage.q83
    public final void s() throws InterruptedException {
        G();
        this.B = Math.min(this.B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // defpackage.q83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.oj9[] r5, long r6, long r8, defpackage.jrd r10) {
        /*
            r4 = this;
            wya r5 = r4.x
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L30
            java.util.ArrayDeque r5 = r4.u
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L25
            long r6 = r4.z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L30
            long r2 = r4.y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L25
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
        L25:
            wya r6 = new wya
            long r0 = r4.z
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L30:
            wya r5 = new wya
            r5.<init>(r0, r8)
            r4.x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xya.v(oj9[], long, long, jrd):void");
    }

    @Override // defpackage.q83
    public final void y(long j, long j2) throws InterruptedException, zh8 {
        if (this.w) {
            return;
        }
        if (this.C == null) {
            i16 i16Var = this.c;
            i16Var.k();
            qj6 qj6Var = this.t;
            qj6Var.i();
            int iX = x(i16Var, qj6Var, 2);
            if (iX != -5) {
                if (iX == -4) {
                    z4o.H(qj6Var.d(4));
                    this.v = true;
                    this.w = true;
                    return;
                }
                return;
            }
            oj9 oj9Var = (oj9) i16Var.c;
            oj9Var.getClass();
            this.C = oj9Var;
            this.L = true;
        }
        if (this.D == null) {
            F();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (D(j)) {
            }
            while (E(j)) {
            }
            Trace.endSection();
        } catch (kwa e) {
            throw a(e, null, false, 4003);
        }
    }
}
