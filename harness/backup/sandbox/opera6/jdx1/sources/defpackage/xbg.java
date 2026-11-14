package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class xbg extends j6 {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public xbg(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (!(d() > 32)) {
            bpg.a("Trie-based persistent vector should have at least 33 elements, got " + d());
        }
        int length = objArr2.length;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj, lld lldVar) {
        int iL = zwg.l(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iL == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            System.arraycopy(objArr, iL, objArrCopyOf, iL + 1, 31 - iL);
            lldVar.b = objArr[31];
            objArrCopyOf[iL] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        objArrCopyOf2[iL] = q((Object[]) objArr[iL], i3, i2, obj, lldVar);
        while (true) {
            iL++;
            if (iL >= 32 || objArrCopyOf2[iL] == null) {
                break;
            }
            objArrCopyOf2[iL] = q((Object[]) objArr[iL], i3, 0, lldVar.b, lldVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] s(Object[] objArr, int i, int i2, lld lldVar) {
        Object[] objArrS;
        int iL = zwg.l(i2, i);
        if (i == 5) {
            lldVar.b = objArr[iL];
            objArrS = null;
        } else {
            objArrS = s((Object[]) objArr[iL], i - 5, i2, lldVar);
        }
        if (objArrS == null && iL == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iL] = objArrS;
        return objArrCopyOf;
    }

    public static Object[] y(int i, int i2, Object obj, Object[] objArr) {
        int iL = zwg.l(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iL] = obj;
            return objArrCopyOf;
        }
        objArrCopyOf[iL] = y(i - 5, i2, obj, (Object[]) objArrCopyOf[iL]);
        return objArrCopyOf;
    }

    public final int d() {
        return this.d;
    }

    @Override // defpackage.j6
    public final j6 g(int i, Object obj) {
        int i2 = this.d;
        j14.r(i, i2);
        if (i == i2) {
            return h(obj);
        }
        int iX = x();
        Object[] objArr = this.b;
        if (i >= iX) {
            return r(obj, objArr, i - iX);
        }
        lld lldVar = new lld((Object) null, (byte) 8);
        return r(lldVar.b, q(objArr, this.e, i, obj, lldVar), 0);
    }

    public final Object get(int i) {
        Object[] objArr;
        j14.q(i, d());
        if (x() <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[zwg.l(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.j6
    public final j6 h(Object obj) {
        int iX = x();
        int i = this.d;
        int i2 = i - iX;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new xbg(objArr, objArrCopyOf, i + 1, this.e);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return t(objArr, objArr2, objArr3);
    }

    public final ListIterator listIterator(int i) {
        j14.r(i, this.d);
        return new bcg(this.b, i, this.c, this.d, (this.e / 5) + 1);
    }

    @Override // defpackage.j6
    public final zbg m() {
        return new zbg(this, this.b, this.c, this.e);
    }

    @Override // defpackage.j6
    public final j6 n(h6 h6Var) {
        zbg zbgVar = new zbg(this, this.b, this.c, this.e);
        zbgVar.F(h6Var);
        return zbgVar.h();
    }

    @Override // defpackage.j6
    public final j6 o(int i) {
        j14.q(i, d());
        int iX = x();
        int i2 = this.e;
        Object[] objArr = this.b;
        return i >= iX ? w(objArr, iX, i2, i - iX) : w(v(objArr, i2, i, new lld(this.c[0], (byte) 8)), iX, i2, 0);
    }

    @Override // defpackage.j6
    public final j6 p(int i, Object obj) {
        int i2 = this.d;
        j14.q(i, i2);
        int iX = x();
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.e;
        if (iX > i) {
            return new xbg(y(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new xbg(objArr, objArrCopyOf, i2, i3);
    }

    public final xbg r(Object obj, Object[] objArr, int i) {
        int iX = x();
        int i2 = this.d;
        int i3 = i2 - iX;
        Object[] objArr2 = this.c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            System.arraycopy(objArr2, i, objArrCopyOf, i + 1, i3 - i);
            objArrCopyOf[i] = obj;
            return new xbg(objArr, objArrCopyOf, i2 + 1, this.e);
        }
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, objArrCopyOf, i + 1, (i3 - 1) - i);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return t(objArr, objArrCopyOf, objArr3);
    }

    public final xbg t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.e;
        if (i2 <= (1 << i3)) {
            return new xbg(u(objArr, objArr2, i3), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new xbg(u(objArr4, objArr2, i4), objArr3, i + 1, i4);
    }

    public final Object[] u(Object[] objArr, Object[] objArr2, int i) {
        int iL = zwg.l(d() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iL] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iL] = u((Object[]) objArrCopyOf[iL], objArr2, i - 5);
        return objArrCopyOf;
    }

    public final Object[] v(Object[] objArr, int i, int i2, lld lldVar) {
        int iL = zwg.l(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iL == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            int i3 = iL + 1;
            System.arraycopy(objArr, i3, objArrCopyOf, iL, 32 - i3);
            objArrCopyOf[31] = lldVar.b;
            lldVar.b = objArr[iL];
            return objArrCopyOf;
        }
        int iL2 = objArr[31] == null ? zwg.l(x() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = iL + 1;
        if (i5 <= iL2) {
            while (true) {
                objArrCopyOf2[iL2] = v((Object[]) objArrCopyOf2[iL2], i4, 0, lldVar);
                if (iL2 == i5) {
                    break;
                }
                iL2--;
            }
        }
        objArrCopyOf2[iL] = v((Object[]) objArrCopyOf2[iL], i4, i2, lldVar);
        return objArrCopyOf2;
    }

    public final j6 w(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new sqj(objArr);
            }
            lld lldVar = new lld((Object) null, (byte) 8);
            Object[] objArrS = s(objArr, i2, i - 1, lldVar);
            Object[] objArr2 = (Object[]) lldVar.b;
            return objArrS[1] == null ? new xbg((Object[]) objArrS[0], objArr2, i, i2 - 5) : new xbg(objArrS, objArr2, i, i2);
        }
        Object[] objArr3 = this.c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr3, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            int i6 = i3 + 1;
            System.arraycopy(objArr3, i6, objArrCopyOf, i3, i4 - i6);
        }
        objArrCopyOf[i5] = null;
        return new xbg(objArr, objArrCopyOf, (i + i4) - 1, i2);
    }

    public final int x() {
        return (this.d - 1) & (-32);
    }
}
