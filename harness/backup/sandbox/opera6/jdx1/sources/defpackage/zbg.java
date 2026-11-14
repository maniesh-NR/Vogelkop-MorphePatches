package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zbg extends d6 implements Collection, qtb, j$.util.Collection {
    public j6 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public i06 e = new i06((byte) 19);
    public Object[] f;
    public Object[] g;
    public int h;

    /* JADX WARN: Multi-variable type inference failed */
    public zbg(j6 j6Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = j6Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = j6Var.size();
    }

    public static void j(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, Object[][] objArr2) {
        w4 w4Var = new w4(objArr2, (byte) 1);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrZ = i2 < (1 << i3) ? z(objArr, i, i3, w4Var) : s(objArr);
        while (w4Var.hasNext()) {
            this.d += 5;
            objArrZ = v(objArrZ);
            int i4 = this.d;
            z(objArrZ, 1 << i4, i4, w4Var);
        }
        return objArrZ;
    }

    public final void B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = C(v(objArr), objArr2, this.d + 5);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = C(objArr, objArr2, i3);
            this.g = objArr3;
            this.h++;
        }
    }

    public final Object[] C(Object[] objArr, Object[] objArr2, int i) {
        int iL = zwg.l(d() - 1, i);
        Object[] objArrS = s(objArr);
        if (i == 5) {
            objArrS[iL] = objArr2;
            return objArrS;
        }
        objArrS[iL] = C((Object[]) objArrS[iL], objArr2, i - 5);
        return objArrS;
    }

    public final int D(Function1 function1, Object[] objArr, int i, int i2, lld lldVar, ArrayList arrayList, ArrayList arrayList2) {
        if (q(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) lldVar.b;
        Object[] objArrU = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrU = !arrayList.isEmpty() ? (Object[]) vep.r(1, arrayList) : u();
                    i2 = 0;
                }
                objArrU[i2] = obj;
                i2++;
            }
        }
        lldVar.b = objArrU;
        if (objArr2 != objArrU) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int E(Function1 function1, Object[] objArr, int i, lld lldVar) {
        Object[] objArrS = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrS = s(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrS[i2] = obj;
                i2++;
            }
        }
        lldVar.b = objArrS;
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean F(Function1 function1) {
        int i;
        Function1 function12 = function1;
        int iM = M();
        Object[] objArrW = null;
        lld lldVar = new lld((Object) null, (byte) 8);
        boolean z = false;
        if (this.f == null) {
            int iE = E(function12, this.g, iM, lldVar);
            Object obj = lldVar.b;
            if (iE == iM) {
                iE = iM;
            } else {
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iE, iM, (Object) null);
                this.g = objArr;
                this.h -= iM - iE;
            }
            if (iE != iM) {
                z = true;
            }
        } else {
            a5 a5VarR = r(0);
            int iE2 = 32;
            while (true) {
                if (iE2 != 32) {
                    int i2 = (a5VarR.b - 1) << 5;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int iD = iE2;
                    while (a5VarR.hasNext()) {
                        iD = D(function12, (Object[]) a5VarR.next(), 32, iD, lldVar, arrayList2, arrayList);
                        function12 = function1;
                    }
                    int iD2 = D(function1, this.g, iM, iD, lldVar, arrayList2, arrayList);
                    Object[] objArr2 = (Object[]) lldVar.b;
                    Arrays.fill(objArr2, iD2, 32, (Object) null);
                    boolean zIsEmpty = arrayList.isEmpty();
                    Object[] objArrZ = this.f;
                    if (!zIsEmpty) {
                        objArrZ = z(objArrZ, i2, this.d, arrayList.iterator());
                    }
                    int size = i2 + (arrayList.size() << 5);
                    if ((size & 31) != 0) {
                        bpg.a("invalid size");
                    }
                    if (size == 0) {
                        this.d = 0;
                    } else {
                        int i3 = size - 1;
                        while (true) {
                            i = this.d;
                            if ((i3 >> i) != 0) {
                                break;
                            }
                            this.d = i - 5;
                            objArrZ = objArrZ[0];
                        }
                        objArrW = w(objArrZ, i3, i);
                    }
                    this.f = objArrW;
                    this.g = objArr2;
                    this.h = size + iD2;
                } else if (a5VarR.hasNext()) {
                    iE2 = E(function12, (Object[]) a5VarR.next(), 32, lldVar);
                } else {
                    int iE3 = E(function12, this.g, iM, lldVar);
                    Object obj2 = lldVar.b;
                    if (iE3 == iM) {
                        iE3 = iM;
                    } else {
                        Object[] objArr3 = (Object[]) obj2;
                        Arrays.fill(objArr3, iE3, iM, (Object) null);
                        this.g = objArr3;
                        this.h -= iM - iE3;
                    }
                    if (iE3 == 0) {
                        y(this.f, this.h, this.d);
                    }
                    if (iE3 != iM) {
                    }
                }
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] H(Object[] objArr, int i, int i2, lld lldVar) {
        int iL = zwg.l(i2, i);
        if (i == 0) {
            Object obj = objArr[iL];
            Object[] objArrS = s(objArr);
            int i3 = iL + 1;
            System.arraycopy(objArr, i3, objArrS, iL, 32 - i3);
            objArrS[31] = lldVar.b;
            lldVar.b = obj;
            return objArrS;
        }
        int iL2 = objArr[31] == null ? zwg.l(J() - 1, i) : 31;
        Object[] objArrS2 = s(objArr);
        int i4 = i - 5;
        int i5 = iL + 1;
        if (i5 <= iL2) {
            while (true) {
                objArrS2[iL2] = H((Object[]) objArrS2[iL2], i4, 0, lldVar);
                if (iL2 == i5) {
                    break;
                }
                iL2--;
            }
        }
        objArrS2[iL] = H((Object[]) objArrS2[iL], i4, i2, lldVar);
        return objArrS2;
    }

    public final Object I(Object[] objArr, int i, int i2, int i3) {
        int iD = d() - i;
        Object[] objArr2 = this.g;
        if (iD == 1) {
            Object obj = objArr2[0];
            y(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrS = s(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrS, i3, iD - i4);
        objArrS[iD - 1] = null;
        this.f = objArr;
        this.g = objArrS;
        this.h = (i + iD) - 1;
        this.d = i2;
        return obj2;
    }

    public final int J() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] K(Object[] objArr, int i, int i2, Object obj, lld lldVar) {
        int iL = zwg.l(i2, i);
        Object[] objArrS = s(objArr);
        if (i != 0) {
            objArrS[iL] = K((Object[]) objArrS[iL], i - 5, i2, obj, lldVar);
            return objArrS;
        }
        if (objArrS != objArr) {
            ((AbstractList) this).modCount++;
        }
        lldVar.b = objArrS[iL];
        objArrS[iL] = obj;
        return objArrS;
    }

    public final void L(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrU;
        if (i3 < 1) {
            bpg.a("requires at least one nullBuffer");
        }
        Object[] objArrS = s(objArr);
        objArr2[0] = objArrS;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = i2 - i4;
        int i6 = size + i5;
        if (i6 < 32) {
            System.arraycopy(objArrS, i4, objArr3, size + 1, i5);
        } else {
            int i7 = i6 - 31;
            if (i3 == 1) {
                objArrU = objArrS;
            } else {
                objArrU = u();
                i3--;
                objArr2[i3] = objArrU;
            }
            int i8 = i2 - i7;
            System.arraycopy(objArrS, i8, objArr3, 0, i2 - i8);
            System.arraycopy(objArrS, i4, objArrU, size + 1, i8 - i4);
            objArr3 = objArrU;
        }
        Iterator it = collection.iterator();
        j(objArrS, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] objArrU2 = u();
            j(objArrU2, 0, it);
            objArr2[i9] = objArrU2;
        }
        j(objArr3, 0, it);
    }

    public final int M() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, Object obj) {
        j14.r(i, d());
        if (i == d()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i >= iJ) {
            p(obj, this.f, i - iJ);
            return;
        }
        lld lldVar = new lld((Object) null, (byte) 8);
        p(lldVar.b, o(this.f, this.d, i, obj, lldVar), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM = M();
        if (iM < 32) {
            Object[] objArrS = s(this.g);
            objArrS[iM] = obj;
            this.g = objArrS;
            this.h = d() + 1;
        } else {
            B(this.f, this.g, v(obj));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrU;
        j14.r(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrS = s(objArr);
            System.arraycopy(objArr, i3, objArrS, size2 + 1, M() - i3);
            j(objArrS, i3, collection.iterator());
            this.g = objArrS;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM = M();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= J()) {
            objArrU = u();
            collection2 = collection;
            L(collection2, i, this.g, iM, objArr2, size, objArrU);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > iM) {
                int i4 = size3 - iM;
                Object[] objArrT = t(i4, objArr3);
                n(collection2, i, i4, objArr2, size, objArrT);
                objArr2 = objArr2;
                objArrU = objArrT;
            } else {
                objArrU = u();
                int i5 = iM - size3;
                System.arraycopy(objArr3, i5, objArrU, 0, iM - i5);
                int i6 = 32 - i5;
                Object[] objArrT2 = t(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = objArrT2;
                n(collection2, i, i6, objArr2, i7, objArrT2);
                collection2 = collection2;
            }
        }
        this.f = A(this.f, i2, objArr2);
        this.g = objArrU;
        this.h = collection2.size() + this.h;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        Iterator it = collection.iterator();
        if (32 - iM >= collection.size()) {
            Object[] objArrS = s(this.g);
            j(objArrS, iM, it);
            this.g = objArrS;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + iM) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrS2 = s(this.g);
        j(objArrS2, iM, it);
        objArr[0] = objArrS2;
        for (int i = 1; i < size; i++) {
            Object[] objArrU = u();
            j(objArrU, 0, it);
            objArr[i] = objArrU;
        }
        this.f = A(this.f, J(), objArr);
        Object[] objArrU2 = u();
        j(objArrU2, 0, it);
        this.g = objArrU2;
        this.h = collection.size() + this.h;
        return true;
    }

    public final int d() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(int i) {
        j14.q(i, d());
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i >= iJ) {
            return I(this.f, iJ, this.d, i - iJ);
        }
        lld lldVar = new lld(this.g[0], (byte) 8);
        I(H(this.f, this.d, i, lldVar), iJ, this.d, 0);
        return lldVar.b;
    }

    public final Object get(int i) {
        Object[] objArr;
        j14.q(i, d());
        if (J() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[zwg.l(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final j6 h() {
        j6 sqjVar;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            sqjVar = this.a;
        } else {
            this.e = new i06((byte) 19);
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            sqjVar = objArr == null ? objArr2.length == 0 ? sqj.c : new sqj(Arrays.copyOf(this.g, d())) : new xbg(this.f, this.g, d(), this.d);
        }
        this.a = sqjVar;
        return sqjVar;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final ListIterator listIterator(int i) {
        j14.r(i, this.h);
        return new dcg(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m() {
        return ((AbstractList) this).modCount;
    }

    public final void n(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            qp2.n("root is null");
            return;
        }
        int i4 = i >> 5;
        a5 a5VarR = r(J() >> 5);
        int i5 = i3;
        Object[] objArrT = objArr2;
        while (a5VarR.b - 1 != i4) {
            Object[] objArr3 = (Object[]) a5VarR.previous();
            int i6 = 32 - i2;
            System.arraycopy(objArr3, i6, objArrT, 0, 32 - i6);
            objArrT = t(i2, objArr3);
            i5--;
            objArr[i5] = objArrT;
        }
        Object[] objArr4 = (Object[]) a5VarR.previous();
        int iJ = i3 - (((J() >> 5) - 1) - i4);
        if (iJ < i3) {
            objArr2 = objArr[iJ];
        }
        L(collection, i, objArr4, 32, objArr, iJ, objArr2);
    }

    public final Object[] o(Object[] objArr, int i, int i2, Object obj, lld lldVar) {
        Object obj2;
        int iL = zwg.l(i2, i);
        if (i == 0) {
            lldVar.b = objArr[31];
            Object[] objArrS = s(objArr);
            System.arraycopy(objArr, iL, objArrS, iL + 1, 31 - iL);
            objArrS[iL] = obj;
            return objArrS;
        }
        Object[] objArrS2 = s(objArr);
        int i3 = i - 5;
        objArrS2[iL] = o((Object[]) objArrS2[iL], i3, i2, obj, lldVar);
        while (true) {
            iL++;
            if (iL >= 32 || (obj2 = objArrS2[iL]) == null) {
                break;
            }
            objArrS2[iL] = o((Object[]) obj2, i3, 0, lldVar.b, lldVar);
        }
        return objArrS2;
    }

    public final void p(Object obj, Object[] objArr, int i) {
        int iM = M();
        Object[] objArrS = s(this.g);
        Object[] objArr2 = this.g;
        if (iM >= 32) {
            Object obj2 = objArr2[31];
            System.arraycopy(objArr2, i, objArrS, i + 1, 31 - i);
            objArrS[i] = obj;
            B(objArr, objArrS, v(obj2));
            return;
        }
        System.arraycopy(objArr2, i, objArrS, i + 1, iM - i);
        objArrS[i] = obj;
        this.f = objArr;
        this.g = objArrS;
        this.h = d() + 1;
    }

    public final boolean q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final a5 r(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            qp2.n("Invalid root");
            return null;
        }
        int iJ = J() >> 5;
        j14.r(i, iJ);
        int i2 = this.d;
        return i2 == 0 ? new g04(objArr, i) : new s6m(objArr, i, iJ, i2 / 5);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return F(new h6(collection, (byte) 3));
    }

    public final Object[] s(Object[] objArr) {
        if (objArr == null) {
            return u();
        }
        if (q(objArr)) {
            return objArr;
        }
        Object[] objArrU = u();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        b82.g(objArr, 0, objArrU, length, 6);
        return objArrU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object set(int i, Object obj) {
        j14.q(i, d());
        if (J() > i) {
            lld lldVar = new lld((Object) null, (byte) 8);
            this.f = K(this.f, this.d, i, obj, lldVar);
            return lldVar.b;
        }
        Object[] objArrS = s(this.g);
        if (objArrS != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrS[i2];
        objArrS[i2] = obj;
        this.g = objArrS;
        return obj2;
    }

    public final Object[] t(int i, Object[] objArr) {
        if (q(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrU = u();
        System.arraycopy(objArr, 0, objArrU, i, 32 - i);
        return objArrU;
    }

    public final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] w(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            bpg.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iL = zwg.l(i, i2);
        Object objW = w((Object[]) objArr[iL], i, i2 - 5);
        if (iL < 31) {
            int i3 = iL + 1;
            if (objArr[i3] != null) {
                if (q(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrU = u();
                System.arraycopy(objArr, 0, objArrU, 0, i3);
                objArr = objArrU;
            }
        }
        if (objW == objArr[iL]) {
            return objArr;
        }
        Object[] objArrS = s(objArr);
        objArrS[iL] = objW;
        return objArrS;
    }

    public final Object[] x(Object[] objArr, int i, int i2, lld lldVar) {
        Object[] objArrX;
        int iL = zwg.l(i2 - 1, i);
        if (i == 5) {
            lldVar.b = objArr[iL];
            objArrX = null;
        } else {
            objArrX = x((Object[]) objArr[iL], i - 5, i2, lldVar);
        }
        if (objArrX == null && iL == 0) {
            return null;
        }
        Object[] objArrS = s(objArr);
        objArrS[iL] = objArrX;
        return objArrS;
    }

    public final void y(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        lld lldVar = new lld((Object) null, (byte) 8);
        Object[] objArrX = x(objArr, i2, i, lldVar);
        this.g = (Object[]) lldVar.b;
        this.h = i;
        if (objArrX[1] == null) {
            this.f = (Object[]) objArrX[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrX;
            this.d = i2;
        }
    }

    public final Object[] z(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            bpg.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            bpg.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrS = s(objArr);
        int iL = zwg.l(i, i2);
        int i3 = i2 - 5;
        objArrS[iL] = z((Object[]) objArrS[iL], i, i3, it);
        while (true) {
            iL++;
            if (iL >= 32 || !it.hasNext()) {
                break;
            }
            objArrS[iL] = z((Object[]) objArrS[iL], 0, i3, it);
        }
        return objArrS;
    }
}
