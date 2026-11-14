package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p7m implements cn8 {
    public final byte a;
    public final int b;
    public final List c;
    public final g1g d;
    public final SparseIntArray e;
    public final gl f;
    public final tnk g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final s8h k;
    public r69 l;
    public en8 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public t7m r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public p7m(int i, int i2, tnk tnkVar, pql pqlVar, gl glVar) {
        this.f = glVar;
        this.a = i;
        this.b = i2;
        this.g = tnkVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(pqlVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(pqlVar);
        }
        this.d = new g1g(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new s8h((byte) 1);
        this.m = en8.Yo;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (t7m) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new rvi(new iuh(this)));
        this.r = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.dn8 r6) throws java.io.InterruptedIOException {
        /*
            r5 = this;
            g1g r5 = r5.d
            byte[] r5 = r5.a
            lp6 r6 = (defpackage.lp6) r6
            r0 = 0
            r1 = 940(0x3ac, float:1.317E-42)
            r6.peekFully(r5, r0, r1, r0)
            r1 = r0
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r1 >= r2) goto L29
            r2 = r0
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r1
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.h(r1, r0)
            r5 = 1
            return r5
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7m.a(dn8):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws s1g, InterruptedIOException {
        int i;
        ?? r2;
        byte b;
        byte b2;
        byte b3;
        boolean z;
        long jN;
        long j = ((lp6) dn8Var).c;
        byte b4 = this.a;
        boolean z2 = b4 == 2;
        if (this.o) {
            long j2 = -9223372036854775807L;
            s8h s8hVar = this.k;
            if (j != -1 && !z2 && !s8hVar.d) {
                int i2 = this.t;
                pql pqlVar = s8hVar.b;
                g1g g1gVar = s8hVar.c;
                if (i2 <= 0) {
                    s8hVar.a((lp6) dn8Var);
                    return 0;
                }
                if (s8hVar.f) {
                    if (s8hVar.h == -9223372036854775807L) {
                        s8hVar.a((lp6) dn8Var);
                        return 0;
                    }
                    if (s8hVar.e) {
                        long j3 = s8hVar.g;
                        if (j3 == -9223372036854775807L) {
                            s8hVar.a((lp6) dn8Var);
                            return 0;
                        }
                        s8hVar.i = pqlVar.c(s8hVar.h) - pqlVar.b(j3);
                        s8hVar.a((lp6) dn8Var);
                        return 0;
                    }
                    lp6 lp6Var = (lp6) dn8Var;
                    int iMin = (int) Math.min(112800L, lp6Var.c);
                    if (lp6Var.d != 0) {
                        hp2Var.b = 0L;
                        return 1;
                    }
                    g1gVar.K(iMin);
                    lp6Var.f = 0;
                    lp6Var.peekFully(g1gVar.a, 0, iMin, false);
                    int i3 = g1gVar.b;
                    int i4 = g1gVar.c;
                    while (true) {
                        if (i3 >= i4) {
                            jN = -9223372036854775807L;
                            break;
                        }
                        if (g1gVar.a[i3] == 71) {
                            jN = cgh.n(g1gVar, i3, i2);
                            if (jN != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3++;
                    }
                    s8hVar.g = jN;
                    s8hVar.e = true;
                    return 0;
                }
                lp6 lp6Var2 = (lp6) dn8Var;
                long j4 = lp6Var2.c;
                int iMin2 = (int) Math.min(112800L, j4);
                long j5 = j4 - iMin2;
                if (lp6Var2.d != j5) {
                    hp2Var.b = j5;
                    return 1;
                }
                g1gVar.K(iMin2);
                lp6Var2.f = 0;
                lp6Var2.peekFully(g1gVar.a, 0, iMin2, false);
                int i5 = g1gVar.b;
                int i6 = g1gVar.c;
                int i7 = i6 - 188;
                while (true) {
                    if (i7 < i5) {
                        break;
                    }
                    byte[] bArr = g1gVar.a;
                    int i8 = -4;
                    int i9 = 0;
                    while (true) {
                        if (i8 > 4) {
                            break;
                        }
                        int i10 = (i8 * 188) + i7;
                        if (i10 < i5 || i10 >= i6 || bArr[i10] != 71) {
                            i9 = 0;
                        } else {
                            i9++;
                            if (i9 == 5) {
                                long jN2 = cgh.n(g1gVar, i7, i2);
                                if (jN2 != -9223372036854775807L) {
                                    j2 = jN2;
                                    break;
                                }
                            }
                        }
                        i8++;
                    }
                    i7--;
                }
                s8hVar.h = j2;
                s8hVar.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                b = b4;
            } else {
                this.p = true;
                long j6 = s8hVar.i;
                if (j6 != -9223372036854775807L) {
                    pql pqlVar2 = s8hVar.b;
                    int i11 = this.t;
                    n9a n9aVar = new n9a((byte) 24);
                    uuj uujVar = new uuj();
                    uujVar.a = i11;
                    uujVar.b = pqlVar2;
                    uujVar.c = new g1g();
                    i = 1;
                    b = b4;
                    z = false;
                    r69 r69Var = new r69(n9aVar, uujVar, j6, 1 + j6, 0L, j, 188L, 940);
                    this.l = r69Var;
                    this.m.h((uf3) r69Var.b);
                } else {
                    i = 1;
                    z = false;
                    b = b4;
                    this.m.h(new rv2(j6));
                }
            }
            if (this.q) {
                this.q = z;
                seek(0L, 0L);
                if (((lp6) dn8Var).d != 0) {
                    hp2Var.b = 0L;
                    return i;
                }
            }
            r69 r69Var2 = this.l;
            r2 = z;
            if (r69Var2 != null) {
                r2 = z;
                if (((vf3) r69Var2.d) != null) {
                    return r69Var2.b((lp6) dn8Var, hp2Var);
                }
            }
        } else {
            i = 1;
            r2 = 0;
            b = b4;
        }
        g1g g1gVar2 = this.d;
        byte[] bArr2 = g1gVar2.a;
        if (9400 - g1gVar2.b < 188) {
            int iA = g1gVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, g1gVar2.b, bArr2, r2, iA);
            }
            g1gVar2.L(bArr2, iA);
        }
        while (true) {
            int iA2 = g1gVar2.a();
            SparseArray sparseArray = this.h;
            if (iA2 >= 188) {
                int i12 = g1gVar2.b;
                int i13 = g1gVar2.c;
                byte[] bArr3 = g1gVar2.a;
                int i14 = i12;
                while (i14 < i13 && bArr3[i14] != 71) {
                    i14++;
                }
                g1gVar2.N(i14);
                int i15 = i14 + 188;
                if (i15 > i13) {
                    int i16 = (i14 - i12) + this.s;
                    this.s = i16;
                    b2 = b;
                    b3 = 2;
                    if (b2 == 2 && i16 > 376) {
                        throw s1g.d("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b2 = b;
                    b3 = 2;
                    this.s = r2;
                }
                int i17 = g1gVar2.c;
                if (i15 > i17) {
                    return r2;
                }
                int iM = g1gVar2.m();
                if ((8388608 & iM) != 0) {
                    g1gVar2.N(i15);
                    return r2;
                }
                int i18 = (4194304 & iM) != 0 ? 1 : r2;
                int i19 = (2096896 & iM) >> 8;
                boolean z3 = (iM & 32) != 0 ? true : r2;
                t7m t7mVar = (iM & 16) != 0 ? (t7m) sparseArray.get(i19) : null;
                if (t7mVar == null) {
                    g1gVar2.N(i15);
                    return r2;
                }
                if (b2 != b3) {
                    int i20 = iM & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i21 = sparseIntArray.get(i19, i20 - 1);
                    sparseIntArray.put(i19, i20);
                    if (i21 == i20) {
                        g1gVar2.N(i15);
                        return r2;
                    }
                    if (i20 != ((i21 + 1) & 15)) {
                        t7mVar.seek();
                    }
                }
                if (z3) {
                    int iA3 = g1gVar2.A();
                    i18 |= (g1gVar2.A() & 64) != 0 ? b3 : r2;
                    g1gVar2.O(iA3 - 1);
                }
                boolean z4 = this.o;
                if (b2 == b3 || z4 || !this.j.get(i19, r2)) {
                    g1gVar2.M(i15);
                    t7mVar.a(i18, g1gVar2);
                    g1gVar2.M(i17);
                }
                if (b2 != b3 && !z4 && this.o && j != -1) {
                    this.q = true;
                }
                g1gVar2.N(i15);
                return r2;
            }
            int i22 = g1gVar2.c;
            int i23 = ((lp6) dn8Var).read(bArr2, i22, 9400 - i22);
            if (i23 == -1) {
                int i24 = r2;
                while (i24 < sparseArray.size()) {
                    t7m t7mVar2 = (t7m) sparseArray.valueAt(i24);
                    if (t7mVar2 instanceof ddg) {
                        ddg ddgVar = (ddg) t7mVar2;
                        int i25 = (!z2 || ddgVar.c()) ? i : r2;
                        if (ddgVar.c == 3 && ddgVar.j == -1 && ((!z2 || !(ddgVar.a instanceof x5a)) && i25 != 0)) {
                            ddgVar.a(i, new g1g());
                        }
                    }
                    i24++;
                    i = 1;
                }
                return -1;
            }
            g1gVar2.M(i22 + i23);
            i = 1;
        }
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        if ((this.b & 1) == 0) {
            en8Var = new h5k(en8Var, this.g);
        }
        this.m = en8Var;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        r69 r69Var;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        z4o.H(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pql pqlVar = (pql) list.get(i);
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
        }
        if (j2 != 0 && (r69Var = this.l) != null) {
            r69Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((t7m) sparseArray.valueAt(i2)).seek();
        }
        this.s = 0;
    }
}
