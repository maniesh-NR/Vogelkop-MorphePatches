package defpackage;

import ads_mobile_sdk.pd;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class yp4 extends fq4 {
    public final byte i;
    public final boolean j;
    public final boolean k;
    public List o;
    public List p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, pd.T0, pd.U0, pd.K0, pd.V0, pd.W0, pd.g1, pd.h1, pd.i1, pd.j1, pd.k1, pd.l1, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, pd.d1, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final g1g h = new g1g();
    public final ArrayList m = new ArrayList();
    public xp4 n = new xp4(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public yp4(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? (byte) 2 : (byte) 3;
        if (i == 1) {
            this.k = false;
            this.j = false;
        } else if (i == 2) {
            this.k = true;
            this.j = false;
        } else if (i == 3) {
            this.k = false;
            this.j = true;
        } else if (i != 4) {
            w7d.K("Invalid channel. Defaulting to CC1.");
            this.k = false;
            this.j = false;
        } else {
            this.k = true;
            this.j = true;
        }
        h(0);
        g();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.fq4
    public final u59 b() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new u59(list, (byte) 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3 A[FALL_THROUGH] */
    @Override // defpackage.fq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.dq4 r15) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.c(dq4):void");
    }

    @Override // defpackage.fq4, defpackage.mj6
    /* renamed from: d */
    public final eq4 dequeueOutputBuffer() {
        eq4 eq4Var;
        eq4 eq4VarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (eq4VarDequeueOutputBuffer != null) {
            return eq4VarDequeueOutputBuffer;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (eq4Var = (eq4) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        u59 u59VarB = b();
        long j3 = this.e;
        eq4Var.c = j3;
        eq4Var.e = u59VarB;
        eq4Var.f = j3;
        return eq4Var;
    }

    @Override // defpackage.fq4
    public final boolean e() {
        return this.o != this.p;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            x36 x36VarC = ((xp4) arrayList.get(i)).c(LinearLayoutManager.INVALID_OFFSET);
            arrayList2.add(x36VarC);
            if (x36VarC != null) {
                iMin = Math.min(iMin, x36VarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            x36 x36VarC2 = (x36) arrayList2.get(i2);
            if (x36VarC2 != null) {
                if (x36VarC2.i != iMin) {
                    x36VarC2 = ((xp4) arrayList.get(i2)).c(iMin);
                    x36VarC2.getClass();
                }
                arrayList3.add(x36VarC2);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.fq4, defpackage.mj6
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        h(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        g();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    public final void g() {
        xp4 xp4Var = this.n;
        xp4Var.g = this.q;
        xp4Var.a.clear();
        xp4Var.b.clear();
        xp4Var.c.setLength(0);
        xp4Var.d = 15;
        xp4Var.e = 0;
        xp4Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        byte b = this.q;
        if (b == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            g();
            if (b == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((xp4) arrayList.get(i2)).g = i;
            i2++;
        }
    }

    @Override // defpackage.fq4, defpackage.mj6
    public final void release() {
    }
}
