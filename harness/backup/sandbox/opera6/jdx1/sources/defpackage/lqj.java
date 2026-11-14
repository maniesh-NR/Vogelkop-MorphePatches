package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lqj {
    public final iqj a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public jde f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final bg3 p;
    public final bg3 q;
    public final bg3 r;
    public jde s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public ide x;

    public lqj(iqj iqjVar) {
        this.a = iqjVar;
        int[] iArr = iqjVar.a;
        this.b = iArr;
        Object[] objArr = iqjVar.c;
        this.c = objArr;
        this.d = iqjVar.i;
        this.e = iqjVar.j;
        this.f = iqjVar.k;
        int i = iqjVar.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = iqjVar.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new bg3((byte) 2);
        this.q = new bg3((byte) 2);
        this.r = new bg3((byte) 2);
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(lqj lqjVar) {
        int i = lqjVar.v;
        int iQ = lqjVar.q(i);
        int[] iArr = lqjVar.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((i4 & 67108864) != 0) {
                return;
            }
            lqjVar.S(lqjVar.D(i, iArr));
        }
    }

    public final void A(int i) {
        qt9 qt9Var;
        int i2;
        qt9 qt9Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iB = kqj.b(arrayList, i6, iN); iB < this.d.size() && (i3 = (qt9Var2 = (qt9) this.d.get(iB)).a) < 0 && (i4 = i3 + iN) < i; iB++) {
                        qt9Var2.a = i4;
                    }
                } else {
                    for (int iB2 = kqj.b(arrayList, i, iN); iB2 < this.d.size() && (i2 = (qt9Var = (qt9) this.d.get(iB2)).a) >= 0; iB2++) {
                        qt9Var.a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    System.arraycopy(iArr, i7, iArr, i8 + i7, i9 - i7);
                } else {
                    int i10 = i9 + i8;
                    System.arraycopy(iArr, i10, iArr, i9, (i7 + i8) - i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                mh5.a("Check failed");
            }
            while (i6 < iN2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.b[i11];
                int iO = i12 > -2 ? i12 : (o() + i12) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i12) {
                    this.b[i11] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        mh5.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        mh5.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final Object C(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iQ, iArr))];
        }
        return null;
    }

    public final int D(int i, int[] iArr) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object E(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            mh5.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i;
        ide ideVar = this.x;
        if (ideVar != null) {
            while (ideVar.b != 0) {
                int iT = uyg.t(ideVar);
                int iQ = q(iT);
                int iT2 = iT + 1;
                int iT3 = t(iT) + iT;
                while (true) {
                    if (iT2 >= iT3) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iT2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iT2 += t(iT2);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i3 & (-67108865)) | (i << 26);
                    int iD = D(iT, iArr);
                    if (iD >= 0) {
                        uyg.b(ideVar, iD);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (this.n != 0) {
            mh5.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(q(i), this.b);
        int iK = K();
        N(this.v);
        ide ideVar = this.x;
        if (ideVar != null) {
            while (true) {
                int i3 = ideVar.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    h9o.h("IntList is empty.");
                    return false;
                }
                if (ideVar.a[0] < i) {
                    break;
                }
                uyg.t(ideVar);
            }
        }
        boolean zH = H(i, this.t - i);
        I(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iK;
        return zH;
    }

    public final boolean H(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = kqj.b(this.d, i3, n() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    qt9 qt9Var = (qt9) this.d.get(iB);
                    int iC = c(qt9Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        qt9Var.a = LinearLayoutManager.INVALID_OFFSET;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                S(i8);
            }
        }
        return z;
    }

    public final void I(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object J(int i, int i2, Object obj) {
        int iM = M(q(i), this.b);
        int iF = f(q(i + 1), this.b);
        int i3 = iM + i2;
        if (i3 < iM || i3 >= iF) {
            mh5.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iG = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final int K() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(q(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void L() {
        int i = this.u;
        this.t = i;
        this.i = f(q(i), this.b);
    }

    public final int M(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iD = kqj.d(i, iArr);
        return iD < 0 ? (this.c.length - this.l) + iD + 1 : iD;
    }

    public final xt9 N(int i) {
        qt9 qt9VarQ;
        HashMap map = this.e;
        if (map == null || (qt9VarQ = Q(i)) == null) {
            return null;
        }
        return (xt9) map.get(qt9VarQ);
    }

    public final void O() {
        if (this.n != 0) {
            mh5.a("Key must be supplied when inserting");
        }
        zpa zpaVar = hh5.a;
        P(0, zpaVar, zpaVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.d(this.o);
        zpa zpaVar = hh5.a;
        if (objArr == true) {
            int i4 = this.t;
            int iF = f(q(i4), this.b);
            v(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != zpaVar ? 1 : 0;
            int i6 = (z || obj2 == zpaVar) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                N(i3);
            }
        } else {
            this.p.d(i3);
            this.q.d((n() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!Intrinsics.a(obj2, zpaVar)) {
                if (z) {
                    T(this.t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.i = M(iQ2, this.b);
            this.j = f(q(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final qt9 Q(int i) {
        ArrayList arrayList;
        int iC;
        if (i < 0 || i >= o() || (iC = kqj.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (qt9) arrayList.get(iC);
    }

    public final void R(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            mh5.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iQ, iArr))] = obj;
    }

    public final void S(int i) {
        if (i >= 0) {
            ide ideVar = this.x;
            if (ideVar == null) {
                ideVar = new ide();
                this.x = ideVar;
            }
            uyg.b(ideVar, i);
        }
    }

    public final void T(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            mh5.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(iQ, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            mh5.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            bpg.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            mh5.a("Cannot seek outside the current group (" + i3 + "-" + this.u + ")");
        }
        this.t = i2;
        int iF = f(q(i2), this.b);
        this.i = iF;
        this.j = iF;
    }

    public final qt9 b(int i) {
        ArrayList arrayList = this.d;
        int iC = kqj.c(arrayList, i, o());
        if (iC >= 0) {
            return (qt9) arrayList.get(iC);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        qt9 qt9Var = new qt9(i);
        arrayList.add(-(iC + 1), qt9Var);
        return qt9Var;
    }

    public final int c(qt9 qt9Var) {
        int i = qt9Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.d((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.c == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            F();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        jde jdeVar = this.f;
        iqj iqjVar = this.a;
        if (!iqjVar.g) {
            bpg.a("Unexpected writer close()");
        }
        iqjVar.g = false;
        iqjVar.a = iArr;
        iqjVar.b = i2;
        iqjVar.c = objArr;
        iqjVar.d = i3;
        iqjVar.i = arrayList;
        iqjVar.j = map;
        iqjVar.k = jdeVar;
    }

    public final int f(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        dee deeVar;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        bg3 bg3Var = this.r;
        if (z) {
            jde jdeVar = this.s;
            if (jdeVar != null && (deeVar = (dee) jdeVar.e(i3)) != null) {
                Object[] objArr = deeVar.a;
                int i8 = deeVar.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    E(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            kqj.f(iQ, i4, iArr);
            int iC = bg3Var.c();
            if (z2) {
                i4 = 1;
            }
            this.o = iC + i4;
            int iD = D(i3, this.b);
            this.v = iD;
            int iO = iD < 0 ? o() : q(iD + 1);
            int iF = iO >= 0 ? f(iO, this.b) : 0;
            this.i = iF;
            this.j = iF;
            return;
        }
        if (i != i2) {
            mh5.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        kqj.f(iQ, i4, iArr2);
        int iC2 = this.p.c();
        this.u = (n() - this.h) - this.q.c();
        this.v = iC2;
        int iD2 = D(i3, this.b);
        int iC3 = bg3Var.c();
        this.o = iC3;
        if (iD2 == iC2) {
            this.o = iC3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iD2 != 0 && iD2 != iC2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iD2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    kqj.f(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iD2 = D(iD2, iArr5);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            bpg.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.c != this.p.c) {
                mh5.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.c();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            mh5.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                mh5.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            O();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
    
        zwg.u("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r21, kotlin.jvm.functions.Function2 r22) throws pxb {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqj.m(int, kotlin.jvm.functions.Function2):void");
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return hh5.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iQ, iArr)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int iO = o();
        int i3 = this.g;
        int i4 = this.h + i3;
        StringBuilder sbO = sko.o(i, i2, "SlotWriter(current = ", " end=", " size = ");
        sko.r(iO, i3, " gap=", "-", sbO);
        return p3p.k(i4, ")", sbO);
    }

    public final boolean u(int i, int i2) {
        int iN;
        int iT;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            bg3 bg3Var = this.p;
            if (i2 > bg3Var.b(0)) {
                iT = t(i2);
            } else {
                int[] iArr = bg3Var.b;
                int iMin = Math.min(iArr.length, bg3Var.c);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iT = t(i2);
                } else {
                    iN = (n() - this.h) - this.q.b[i3];
                }
            }
            iN = iT + i2;
        }
        return i > i2 && i < iN;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length << 1, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                System.arraycopy(iArr, 0, iArr2, 0, i3 * 5);
                int i7 = (i4 + i3) * 5;
                System.arraycopy(iArr, i7, iArr2, (i3 + i6) * 5, (length * 5) - i7);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i8 = this.u;
            if (i8 >= i3) {
                this.u = i8 + i;
            }
            int i9 = i3 + i;
            this.g = i9;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(q(i2 + i), iArr) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i9; i10++) {
                this.b[(i10 * 5) + 4] = iH;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length << 1, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(iqj iqjVar, int i) {
        if (this.n <= 0) {
            mh5.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = iqjVar.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = iqjVar.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                jde jdeVar = this.f;
                Object[] objArr2 = iqjVar.c;
                int i4 = iqjVar.d;
                HashMap map2 = iqjVar.j;
                jde jdeVar2 = iqjVar.k;
                this.b = iArr;
                this.c = objArr2;
                this.d = iqjVar.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = jdeVar2;
                iqjVar.a = iArr2;
                iqjVar.b = 0;
                iqjVar.c = objArr;
                iqjVar.d = 0;
                iqjVar.i = arrayList;
                iqjVar.j = map;
                iqjVar.k = jdeVar;
                return;
            }
        }
        lqj lqjVarE = iqjVar.e();
        try {
            xgh.u(lqjVarE, i, this, true, true, false);
            lqjVarE.e(true);
        } catch (Throwable th) {
            lqjVarE.e(false);
            throw th;
        }
    }
}
