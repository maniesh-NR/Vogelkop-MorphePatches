package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class da3 implements bj8 {
    public final eyl a;
    public final int b;
    public final int[] c;
    public final oj9[] d;
    public final long[] e;
    public int f;

    public da3(eyl eylVar, int[] iArr) {
        oj9[] oj9VarArr;
        int i = 0;
        z4o.H(iArr.length > 0);
        eylVar.getClass();
        this.a = eylVar;
        int length = iArr.length;
        this.b = length;
        this.d = new oj9[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            oj9VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            oj9VarArr[i2] = eylVar.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(oj9VarArr, new c9((byte) 5));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = eylVar.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.bj8
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.bj8
    public final boolean c(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], tym.a(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.bj8
    public void disable() {
    }

    @Override // defpackage.bj8
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            da3 da3Var = (da3) obj;
            if (this.a.equals(da3Var.a) && Arrays.equals(this.c, da3Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bj8
    public int evaluateQueueSize(long j, List list) {
        return list.size();
    }

    @Override // defpackage.bj8
    public final int f(oj9 oj9Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == oj9Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.bj8
    public final void g(boolean z) {
    }

    @Override // defpackage.bj8
    public final oj9 getFormat(int i) {
        return this.d[i];
    }

    @Override // defpackage.bj8
    public final int getIndexInTrackGroup(int i) {
        return this.c[i];
    }

    @Override // defpackage.bj8
    public final oj9 getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // defpackage.bj8
    public final int getSelectedIndexInTrackGroup() {
        return this.c[getSelectedIndex()];
    }

    @Override // defpackage.bj8
    public final eyl getTrackGroup() {
        return this.a;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.bj8
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bj8
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.bj8
    public void onPlaybackSpeed(float f) {
    }
}
