package defpackage;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class u8h implements cn8 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public r69 i;
    public en8 j;
    public boolean k;
    public final pql a = new pql(0);
    public final g1g c = new g1g(4096);
    public final SparseArray b = new SparseArray();
    public final s8h d = new s8h((byte) 0);

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        byte[] bArr = new byte[14];
        lp6 lp6Var = (lp6) dn8Var;
        lp6Var.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lp6Var.a(bArr[13] & 7, false);
            lp6Var.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws InterruptedIOException {
        long j;
        ?? r3;
        ?? r2;
        long jB;
        dx7 x5aVar;
        s8h s8hVar = this.d;
        pql pqlVar = s8hVar.b;
        this.j.getClass();
        long j2 = ((lp6) dn8Var).c;
        long j3 = -9223372036854775807L;
        if (j2 != -1 && !s8hVar.d) {
            g1g g1gVar = s8hVar.c;
            if (!s8hVar.f) {
                lp6 lp6Var = (lp6) dn8Var;
                long j4 = lp6Var.c;
                int iMin = (int) Math.min(20000L, j4);
                long j5 = j4 - iMin;
                if (lp6Var.d != j5) {
                    hp2Var.b = j5;
                    return 1;
                }
                g1gVar.K(iMin);
                lp6Var.f = 0;
                lp6Var.peekFully(g1gVar.a, 0, iMin, false);
                int i = g1gVar.b;
                int i2 = g1gVar.c - 4;
                while (true) {
                    if (i2 < i) {
                        break;
                    }
                    if (s8h.b(i2, g1gVar.a) == 442) {
                        g1gVar.N(i2 + 4);
                        long jC = s8h.c(g1gVar);
                        if (jC != -9223372036854775807L) {
                            j3 = jC;
                            break;
                        }
                    }
                    i2--;
                }
                s8hVar.h = j3;
                s8hVar.f = true;
                return 0;
            }
            if (s8hVar.h == -9223372036854775807L) {
                s8hVar.a((lp6) dn8Var);
                return 0;
            }
            if (s8hVar.e) {
                long j6 = s8hVar.g;
                if (j6 == -9223372036854775807L) {
                    s8hVar.a((lp6) dn8Var);
                    return 0;
                }
                s8hVar.i = pqlVar.c(s8hVar.h) - pqlVar.b(j6);
                s8hVar.a((lp6) dn8Var);
                return 0;
            }
            lp6 lp6Var2 = (lp6) dn8Var;
            int iMin2 = (int) Math.min(20000L, lp6Var2.c);
            if (lp6Var2.d != 0) {
                hp2Var.b = 0L;
                return 1;
            }
            g1gVar.K(iMin2);
            lp6Var2.f = 0;
            lp6Var2.peekFully(g1gVar.a, 0, iMin2, false);
            int i3 = g1gVar.b;
            int i4 = g1gVar.c;
            while (true) {
                if (i3 >= i4 - 3) {
                    break;
                }
                if (s8h.b(i3, g1gVar.a) == 442) {
                    g1gVar.N(i3 + 4);
                    long jC2 = s8h.c(g1gVar);
                    if (jC2 != -9223372036854775807L) {
                        j3 = jC2;
                        break;
                    }
                }
                i3++;
            }
            s8hVar.g = j3;
            s8hVar.e = true;
            return 0;
        }
        if (this.k) {
            j = 0;
            r3 = 1;
            r2 = 0;
        } else {
            this.k = true;
            long j7 = s8hVar.i;
            if (j7 != -9223372036854775807L) {
                n9a n9aVar = new n9a((byte) 24);
                s6h s6hVar = new s6h();
                s6hVar.a = pqlVar;
                s6hVar.b = new g1g();
                j = 0;
                r3 = 1;
                r2 = 0;
                r69 r69Var = new r69(n9aVar, s6hVar, j7, 1 + j7, 0L, j2, 188L, 1000);
                this.i = r69Var;
                this.j.h((uf3) r69Var.b);
            } else {
                r3 = 1;
                r2 = 0;
                j = 0;
                this.j.h(new rv2(j7));
            }
        }
        r69 r69Var2 = this.i;
        if (r69Var2 != null && ((vf3) r69Var2.d) != null) {
            return r69Var2.b((lp6) dn8Var, hp2Var);
        }
        lp6 lp6Var3 = (lp6) dn8Var;
        lp6Var3.f = r2;
        long peekPosition = j2 != -1 ? j2 - lp6Var3.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        g1g g1gVar2 = this.c;
        if (!lp6Var3.peekFully(g1gVar2.a, r2, 4, r3)) {
            return -1;
        }
        g1gVar2.N(r2);
        int iM = g1gVar2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            lp6Var3.peekFully(g1gVar2.a, r2, 10, r2);
            g1gVar2.N(9);
            lp6Var3.h((g1gVar2.A() & 7) + 14, r2);
            return r2;
        }
        if (iM == 443) {
            lp6Var3.peekFully(g1gVar2.a, r2, 2, r2);
            g1gVar2.N(r2);
            lp6Var3.h(g1gVar2.H() + 6, r2);
            return r2;
        }
        if (((iM & (-256)) >> 8) != r3) {
            lp6Var3.h(r3, r2);
            return r2;
        }
        int i5 = iM & 255;
        SparseArray sparseArray = this.b;
        t8h t8hVar = (t8h) sparseArray.get(i5);
        if (!this.e) {
            if (t8hVar == null) {
                if (i5 == 189) {
                    x5aVar = new o7("video/mp2p");
                    this.f = r3;
                    this.h = lp6Var3.d;
                } else if ((iM & 224) == 192) {
                    x5aVar = new ebe(null, r2, "video/mp2p");
                    this.f = r3;
                    this.h = lp6Var3.d;
                } else if ((iM & 240) == 224) {
                    x5aVar = new x5a(null, "video/mp2p");
                    this.g = r3;
                    this.h = lp6Var3.d;
                } else {
                    x5aVar = null;
                }
                if (x5aVar != null) {
                    x5aVar.c(this.j, new s7m(i5, NotificationCompat.FLAG_LOCAL_ONLY));
                    t8hVar = new t8h(x5aVar, this.a);
                    sparseArray.put(i5, t8hVar);
                }
            }
            if (lp6Var3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r3;
                this.j.endTracks();
            }
        }
        lp6Var3.peekFully(g1gVar2.a, r2, 2, r2);
        g1gVar2.N(r2);
        int iH = g1gVar2.H() + 6;
        if (t8hVar == null) {
            lp6Var3.h(iH, r2);
            return r2;
        }
        g1gVar2.K(iH);
        lp6Var3.readFully(g1gVar2.a, r2, iH, r2);
        g1gVar2.N(6);
        dx7 dx7Var = t8hVar.a;
        bq4 bq4Var = t8hVar.c;
        g1gVar2.k(bq4Var.b, r2, 3);
        bq4Var.q(r2);
        bq4Var.t(8);
        t8hVar.d = bq4Var.h();
        t8hVar.e = bq4Var.h();
        bq4Var.t(6);
        g1gVar2.k(bq4Var.b, r2, bq4Var.i(8));
        bq4Var.q(r2);
        pql pqlVar2 = t8hVar.b;
        if (t8hVar.d) {
            bq4Var.t(4);
            bq4Var.t(r3);
            bq4Var.t(r3);
            long jI = (bq4Var.i(3) << 30) | (bq4Var.i(15) << 15) | bq4Var.i(15);
            bq4Var.t(r3);
            if (!t8hVar.f && t8hVar.e) {
                bq4Var.t(4);
                bq4Var.t(r3);
                bq4Var.t(r3);
                bq4Var.t(r3);
                pqlVar2.b((bq4Var.i(3) << 30) | (bq4Var.i(15) << 15) | bq4Var.i(15));
                t8hVar.f = r3;
            }
            jB = pqlVar2.b(jI);
        } else {
            jB = j;
        }
        dx7Var.d(4, jB);
        dx7Var.a(g1gVar2);
        dx7Var.b(r2);
        g1gVar2.M(g1gVar2.a.length);
        return r2;
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.j = en8Var;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        pql pqlVar = this.a;
        synchronized (pqlVar) {
            j3 = pqlVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = pqlVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            pqlVar.f(j2);
        }
        r69 r69Var = this.i;
        if (r69Var != null) {
            r69Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            t8h t8hVar = (t8h) sparseArray.valueAt(i);
            t8hVar.f = false;
            t8hVar.a.seek();
        }
    }
}
