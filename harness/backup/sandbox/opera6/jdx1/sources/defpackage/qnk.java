package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qnk implements cn8 {
    public final vnk a;
    public final oj9 b;
    public final ArrayList c;
    public hyl f;
    public int g;
    public byte h;
    public long[] i;
    public long j;
    public byte[] e = tym.b;
    public final g1g d = new g1g();

    public qnk(vnk vnkVar, oj9 oj9Var) {
        oj9 oj9Var2;
        this.a = vnkVar;
        if (oj9Var != null) {
            nj9 nj9VarA = oj9Var.a();
            nj9VarA.m = dzd.p("application/x-media3-cues");
            nj9VarA.j = oj9Var.n;
            nj9VarA.K = vnkVar.z();
            oj9Var2 = new oj9(nj9VarA);
        } else {
            oj9Var2 = null;
        }
        this.b = oj9Var2;
        this.c = new ArrayList();
        this.h = (byte) 0;
        this.i = tym.c;
        this.j = -9223372036854775807L;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x007f A[EXC_TOP_SPLITTER, PHI: r21
      0x007f: PHI (r21v4 int) = (r21v5 int), (r21v6 int) binds: [B:32:0x007d, B:29:0x0078] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r20, hp2 r21) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnk.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        z4o.H(this.h == 0);
        hyl hylVarTrack = en8Var.track(0, 3);
        this.f = hylVarTrack;
        oj9 oj9Var = this.b;
        if (oj9Var != null) {
            hylVarTrack.g(oj9Var);
            en8Var.endTracks();
            en8Var.h(new z5b(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.h = (byte) 1;
    }

    public final void e(pnk pnkVar) {
        this.f.getClass();
        byte[] bArr = pnkVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        g1g g1gVar = this.d;
        g1gVar.L(bArr, length2);
        this.f.f(length, g1gVar);
        this.f.a(pnkVar.a, 1, length, 0, null);
    }

    @Override // defpackage.cn8
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = (byte) 5;
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        byte b = this.h;
        byte b2 = 1;
        z4o.H((b == 0 || b == 5) ? false : true);
        this.j = j2;
        byte b3 = this.h;
        if (b3 == 2) {
            this.h = (byte) 1;
        } else {
            b2 = b3;
        }
        if (b2 == 4) {
            this.h = (byte) 3;
        }
    }
}
