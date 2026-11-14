package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public abstract class tx7 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;

    public tx7() {
        this.c = new SparseIntArray();
        this.d = new SparseIntArray();
        this.a = false;
        this.b = false;
    }

    public tx7(wx7 wx7Var) {
        this.b = false;
        this.d = new mq6();
        this.c = wx7Var;
    }

    public static int a(SparseIntArray sparseIntArray, int i) {
        int size = sparseIntArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (sparseIntArray.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        int i4 = i2 - 1;
        if (i4 < 0 || i4 >= sparseIntArray.size()) {
            return -1;
        }
        return sparseIntArray.keyAt(i4);
    }

    public final int b(int i, int i2) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        if (!this.b) {
            return d(i, i2);
        }
        int i3 = sparseIntArray.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iD = d(i, i2);
        sparseIntArray.put(i, iD);
        return iD;
    }

    public final int c(int i, int i2) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        if (!this.a) {
            return e(i, i2);
        }
        int i3 = sparseIntArray.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iE = e(i, i2);
        sparseIntArray.put(i, iE);
        return iE;
    }

    public final int d(int i, int i2) {
        int i3;
        int iF;
        int i4;
        int iA;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        if (!this.b || (iA = a(sparseIntArray, i)) == -1) {
            i3 = 0;
            iF = 0;
            i4 = 0;
        } else {
            i3 = sparseIntArray.get(iA);
            i4 = iA + 1;
            iF = f(iA) + c(iA, i2);
            if (iF == i2) {
                i3++;
                iF = 0;
            }
        }
        int iF2 = f(i);
        while (i4 < i) {
            int iF3 = f(i4);
            iF += iF3;
            if (iF == i2) {
                i3++;
                iF = 0;
            } else if (iF > i2) {
                i3++;
                iF = iF3;
            }
            i4++;
        }
        return iF + iF2 > i2 ? i3 + 1 : i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002a -> B:16:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002c -> B:16:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002e -> B:16:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(int r6, int r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r1 = r5.f(r6)
            r2 = 0
            if (r1 == r7) goto L36
            boolean r3 = r5.a
            if (r3 == 0) goto L1f
            int r3 = a(r0, r6)
            if (r3 < 0) goto L1f
            int r0 = r0.get(r3)
            int r4 = r5.f(r3)
            int r4 = r4 + r0
            goto L2f
        L1f:
            r3 = r2
            r4 = r3
        L21:
            if (r3 >= r6) goto L32
            int r0 = r5.f(r3)
            int r4 = r4 + r0
            if (r4 != r7) goto L2c
            r4 = r2
            goto L2f
        L2c:
            if (r4 <= r7) goto L2f
            r4 = r0
        L2f:
            int r3 = r3 + 1
            goto L21
        L32:
            int r1 = r1 + r4
            if (r1 > r7) goto L36
            return r4
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx7.e(int, int):int");
    }

    public int f(int i) {
        return 1;
    }

    public final void g() {
        ((SparseIntArray) this.d).clear();
    }

    public void h() {
        ((SparseIntArray) this.c).clear();
    }
}
