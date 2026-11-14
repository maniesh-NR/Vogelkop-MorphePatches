package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ur extends da3 {
    public final pl6 g;
    public final long h;
    public final long i;
    public final long j;
    public final short k;
    public final short l;
    public final float m;
    public final float n;
    public final h1b o;
    public final kzk p;
    public float q;
    public int r;
    public int s;
    public long t;
    public fgd u;

    public ur(eyl eylVar, int[] iArr, pl6 pl6Var, h1b h1bVar) {
        super(eylVar, iArr);
        this.g = pl6Var;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = (short) 1279;
        this.l = (short) 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = h1b.s(h1bVar);
        this.p = kzk.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void i(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            z0b z0bVar = (z0b) arrayList.get(i);
            if (z0bVar != null) {
                z0bVar.c(new tr(j, jArr[i]));
            }
        }
    }

    public static long k(List list) {
        if (!list.isEmpty()) {
            fgd fgdVar = (fgd) sfe.c0(list);
            long j = fgdVar.g;
            if (j != -9223372036854775807L) {
                long j2 = fgdVar.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.da3, defpackage.bj8
    public final void disable() {
        this.u = null;
    }

    @Override // defpackage.bj8
    public final void e(long j, long j2, long j3, List list, ggd[] ggdVarArr) {
        long jK;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= ggdVarArr.length || !ggdVarArr[i].next()) {
            int length = ggdVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jK = k(list);
                    break;
                }
                ggd ggdVar = ggdVarArr[i2];
                if (ggdVar.next()) {
                    jK = ggdVar.f() - ggdVar.e();
                    break;
                }
                i2++;
            }
        } else {
            ggd ggdVar2 = ggdVarArr[this.r];
            jK = ggdVar2.f() - ggdVar2.e();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = j(jElapsedRealtime);
            return;
        }
        int i4 = this.r;
        int iF = list.isEmpty() ? -1 : f(((fgd) sfe.c0(list)).d);
        if (iF != -1) {
            i3 = ((fgd) sfe.c0(list)).e;
            i4 = iF;
        }
        int iJ = j(jElapsedRealtime);
        if (iJ != i4 && !a(i4, jElapsedRealtime)) {
            oj9[] oj9VarArr = this.d;
            oj9 oj9Var = oj9VarArr[i4];
            oj9 oj9Var2 = oj9VarArr[iJ];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jK != -9223372036854775807L ? j3 - jK : j3) * this.n), jMin);
            }
            int i5 = oj9Var2.j;
            int i6 = oj9Var.j;
            if ((i5 > i6 && j2 < jMin) || (i5 < i6 && j2 >= this.i)) {
                iJ = i4;
            }
        }
        if (iJ != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = iJ;
    }

    @Override // defpackage.da3, defpackage.bj8
    public final void enable() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.da3, defpackage.bj8
    public final int evaluateQueueSize(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((fgd) sfe.c0(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (fgd) sfe.c0(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jB = tym.B(((fgd) list.get(size - 1)).g - j, this.q);
        long j3 = this.j;
        if (jB >= j3) {
            k(list);
            oj9 oj9Var = this.d[j(jElapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                fgd fgdVar = (fgd) list.get(i3);
                oj9 oj9Var2 = fgdVar.d;
                if (tym.B(fgdVar.g - j, this.q) >= j3 && oj9Var2.j < oj9Var.j && (i = oj9Var2.v) != -1 && i <= this.l && (i2 = oj9Var2.u) != -1 && i2 <= this.k && i < oj9Var.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.bj8
    public final int getSelectedIndex() {
        return this.r;
    }

    @Override // defpackage.bj8
    public final Object getSelectionData() {
        return null;
    }

    @Override // defpackage.bj8
    public final int getSelectionReason() {
        return this.s;
    }

    public final int j(long j) {
        long j2;
        pl6 pl6Var = this.g;
        synchronized (pl6Var) {
            j2 = pl6Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((tr) this.o.get(i)).a < j4) {
                i++;
            }
            tr trVar = (tr) this.o.get(i - 1);
            tr trVar2 = (tr) this.o.get(i);
            long j5 = trVar.a;
            long j6 = trVar.b;
            j4 = j6 + ((long) (((j4 - j5) / (trVar2.a - j5)) * (trVar2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.da3, defpackage.bj8
    public final void onPlaybackSpeed(float f) {
        this.q = f;
    }
}
