package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class okd {
    public final nkd a;
    public final Object b;
    public final vhi[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public pkd g;
    public boolean h;
    public final boolean[] i;
    public final kuh[] j;
    public final jx6 k;
    public final vq8 l;
    public okd m;
    public fyl n;
    public pyl o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [n55] */
    public okd(kuh[] kuhVarArr, long j, jx6 jx6Var, l45 l45Var, vq8 vq8Var, pkd pkdVar, pyl pylVar) {
        this.j = kuhVarArr;
        this.p = j;
        this.k = jx6Var;
        this.l = vq8Var;
        jrd jrdVar = pkdVar.a;
        Object obj = jrdVar.a;
        this.b = obj;
        this.g = pkdVar;
        this.n = fyl.d;
        this.o = pylVar;
        this.c = new vhi[kuhVarArr.length];
        this.i = new boolean[kuhVarArr.length];
        long j2 = pkdVar.b;
        long j3 = pkdVar.d;
        boolean z = pkdVar.f;
        vq8Var.getClass();
        int i = e4.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        jrd jrdVarA = jrdVar.a(pair.second);
        xrd xrdVar = (xrd) ((HashMap) vq8Var.e).get(obj2);
        xrdVar.getClass();
        ((HashSet) vq8Var.h).add(xrdVar);
        wrd wrdVar = (wrd) ((HashMap) vq8Var.g).get(xrdVar);
        if (wrdVar != null) {
            wrdVar.a.f(wrdVar.b);
        }
        xrdVar.c.add(jrdVarA);
        icd icdVarC = xrdVar.a.c(jrdVarA, l45Var, j2);
        ((IdentityHashMap) vq8Var.d).put(icdVarC, xrdVar);
        vq8Var.g();
        this.a = j3 != -9223372036854775807L ? new n55(icdVarC, !z, 0L, j3) : icdVarC;
    }

    public final long a(pyl pylVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        kuh[] kuhVarArr;
        boolean[] zArr3;
        vhi[] vhiVarArr;
        bj8[] bj8VarArr = (bj8[]) pylVar.d;
        int i = 0;
        while (true) {
            int i2 = pylVar.b;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !pylVar.o(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            kuhVarArr = this.j;
            int length = kuhVarArr.length;
            zArr3 = zArr2;
            vhiVarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (kuhVarArr[i3].getTrackType() == -2) {
                vhiVarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = pylVar;
        c();
        long jA = this.a.a(bj8VarArr, zArr3, vhiVarArr, zArr, j);
        for (int i4 = 0; i4 < kuhVarArr.length; i4++) {
            if (kuhVarArr[i4].getTrackType() == -2 && this.o.p(i4)) {
                vhiVarArr[i4] = new s08();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < vhiVarArr.length; i5++) {
            if (vhiVarArr[i5] != null) {
                z4o.H(pylVar.p(i5));
                if (kuhVarArr[i5].getTrackType() != -2) {
                    this.f = true;
                }
            } else {
                z4o.H(bj8VarArr[i5] == null);
            }
        }
        return jA;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            pyl pylVar = this.o;
            if (i >= pylVar.b) {
                return;
            }
            boolean zP = pylVar.p(i);
            bj8 bj8Var = ((bj8[]) this.o.d)[i];
            if (zP && bj8Var != null) {
                bj8Var.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            pyl pylVar = this.o;
            if (i >= pylVar.b) {
                return;
            }
            boolean zP = pylVar.p(i);
            bj8 bj8Var = ((bj8[]) this.o.d)[i];
            if (zP && bj8Var != null) {
                bj8Var.enable();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long bufferedPositionUs = this.f ? this.a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.g.e : bufferedPositionUs;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, gql gqlVar, boolean z) {
        this.e = true;
        this.n = this.a.getTrackGroups();
        pyl pylVarJ = j(f, gqlVar, z);
        pkd pkdVar = this.g;
        long jMax = pkdVar.b;
        long j = pkdVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(pylVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        pkd pkdVar2 = this.g;
        this.p = (pkdVar2.b - jA) + j2;
        this.g = pkdVar2.b(jA);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        nkd nkdVar = this.a;
        try {
            boolean z = nkdVar instanceof n55;
            vq8 vq8Var = this.l;
            if (z) {
                vq8Var.q(((n55) nkdVar).a);
            } else {
                vq8Var.q(nkdVar);
            }
        } catch (RuntimeException e) {
            w7d.r("Period release failed.", e);
        }
    }

    public final pyl j(float f, gql gqlVar, boolean z) {
        fyl fylVar = this.n;
        jrd jrdVar = this.g.a;
        jx6 jx6Var = this.k;
        kuh[] kuhVarArr = this.j;
        pyl pylVarI = jx6Var.i(kuhVarArr, fylVar, jrdVar, gqlVar);
        bj8[] bj8VarArr = (bj8[]) pylVarI.d;
        for (int i = 0; i < pylVarI.b; i++) {
            if (pylVarI.p(i)) {
                if (bj8VarArr[i] == null && kuhVarArr[i].getTrackType() != -2) {
                    z = false;
                }
                z4o.H(z);
            } else {
                z4o.H(bj8VarArr[i] == null);
            }
        }
        for (bj8 bj8Var : bj8VarArr) {
            if (bj8Var != null) {
                bj8Var.onPlaybackSpeed(f);
                bj8Var.g(z);
            }
        }
        return pylVarI;
    }

    public final void k() {
        nkd nkdVar = this.a;
        if (nkdVar instanceof n55) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            n55 n55Var = (n55) nkdVar;
            n55Var.e = 0L;
            n55Var.f = j;
        }
    }
}
