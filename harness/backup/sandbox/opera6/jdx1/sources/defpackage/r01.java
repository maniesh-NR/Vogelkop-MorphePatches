package defpackage;

import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r01 implements cn8 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final s97 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public en8 l;
    public hyl m;
    public hyl n;
    public twi o;
    public boolean p;
    public long q;
    public boolean r;
    public final int b = 0;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = tym.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public r01() {
        s97 s97Var = new s97();
        this.c = s97Var;
        this.n = s97Var;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        return f((lp6) dn8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r27, hp2 r28) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r01.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.l = en8Var;
        hyl hylVarTrack = en8Var.track(0, 1);
        this.m = hylVarTrack;
        this.n = hylVarTrack;
        en8Var.endTracks();
    }

    public final int e(lp6 lp6Var) throws s1g {
        boolean z;
        lp6Var.f = 0;
        byte[] bArr = this.a;
        lp6Var.peekFully(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw s1g.d("Invalid padding bits for frame header " + ((int) b), null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (!(z = this.d) ? !(i < 12 || i > 14) : !(i < 10 || i > 13))) {
            return z ? t[i] : s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw s1g.d(sb.toString(), null);
    }

    public final boolean f(lp6 lp6Var) throws InterruptedIOException {
        lp6Var.f = 0;
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        lp6Var.peekFully(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            lp6Var.h(bArr.length, false);
            return true;
        }
        lp6Var.f = 0;
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        lp6Var.peekFully(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        lp6Var.h(bArr3.length, false);
        return true;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        twi twiVar = this.o;
        if (!(twiVar instanceof z5b)) {
            if (j == 0 || !(twiVar instanceof wn5)) {
                this.k = 0L;
                return;
            } else {
                this.k = ((Math.max(0L, j - ((wn5) twiVar).b) << 3) * 1000000) / r7.e;
                return;
            }
        }
        z5b z5bVar = (z5b) twiVar;
        j0d j0dVar = z5bVar.b;
        long jD = j0dVar.b == 0 ? -9223372036854775807L : j0dVar.d(tym.d(z5bVar.a, j));
        this.k = jD;
        if (Math.abs(this.q - jD) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }
}
