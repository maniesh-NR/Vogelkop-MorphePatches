package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class u6m {
    public static final u6m e = new u6m(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final i06 c;
    public Object[] d;

    public u6m(int i, int i2, Object[] objArr, i06 i06Var) {
        this.a = i;
        this.b = i2;
        this.c = i06Var;
        this.d = objArr;
    }

    public static u6m j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, i06 i06Var) {
        if (i3 > 30) {
            return new u6m(0, 0, new Object[]{obj, obj2, obj3, obj4}, i06Var);
        }
        int iQ = upj.q(i, i3);
        int iQ2 = upj.q(i2, i3);
        if (iQ != iQ2) {
            return new u6m((1 << iQ) | (1 << iQ2), 0, iQ < iQ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, i06Var);
        }
        return new u6m(0, 1 << iQ, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, i06Var)}, i06Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, i06 i06Var) {
        Object obj3 = this.d[i];
        u6m u6mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, i06Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        b82.g(objArr, 0, objArr2, i, 6);
        int i6 = i + 2;
        System.arraycopy(objArr, i6, objArr2, i, i5 - i6);
        objArr2[iT - 1] = u6mVarJ;
        System.arraycopy(objArr, i5, objArr2, iT, objArr.length - i5);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount << 1; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        a aVarH = djh.h(djh.j(0, this.d.length), 2);
        int i = aVarH.a;
        int i2 = aVarH.b;
        int i3 = aVarH.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.a(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iQ = 1 << upj.q(i, i2);
        if (h(iQ)) {
            return Intrinsics.a(obj, this.d[f(iQ)]);
        }
        if (!i(iQ)) {
            return false;
        }
        u6m u6mVarS = s(t(iQ));
        return i2 == 30 ? u6mVarS.c(obj) : u6mVarS.d(i, i2 + 5, obj);
    }

    public final boolean e(u6m u6mVar) {
        if (this == u6mVar) {
            return true;
        }
        if (this.b != u6mVar.b || this.a != u6mVar.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != u6mVar.d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) << 1;
    }

    public final Object g(int i, int i2, Object obj) {
        int iQ = 1 << upj.q(i, i2);
        if (h(iQ)) {
            int iF = f(iQ);
            if (Intrinsics.a(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iQ)) {
            return null;
        }
        u6m u6mVarS = s(t(iQ));
        if (i2 != 30) {
            return u6mVarS.g(i, i2 + 5, obj);
        }
        a aVarH = djh.h(djh.j(0, u6mVarS.d.length), 2);
        int i3 = aVarH.a;
        int i4 = aVarH.b;
        int i5 = aVarH.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.a(obj, u6mVarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return u6mVarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final u6m k(int i, wag wagVar) {
        wagVar.g(wagVar.f - 1);
        wagVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != wagVar.b) {
            return new u6m(0, 0, upj.y(i, objArr), wagVar.b);
        }
        this.d = upj.y(i, objArr);
        return this;
    }

    public final u6m l(int i, Object obj, Object obj2, int i2, wag wagVar) {
        wag wagVar2;
        u6m u6mVarL;
        int iQ = 1 << upj.q(i, i2);
        boolean zH = h(iQ);
        i06 i06Var = this.c;
        if (zH) {
            int iF = f(iQ);
            if (!Intrinsics.a(obj, this.d[iF])) {
                wagVar.g(wagVar.f + 1);
                i06 i06Var2 = wagVar.b;
                if (i06Var != i06Var2) {
                    return new u6m(this.a ^ iQ, this.b | iQ, a(iF, iQ, i, obj, obj2, i2, i06Var2), i06Var2);
                }
                this.d = a(iF, iQ, i, obj, obj2, i2, i06Var2);
                this.a ^= iQ;
                this.b |= iQ;
                return this;
            }
            wagVar.d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (i06Var == wagVar.b) {
                this.d[iF + 1] = obj2;
                return this;
            }
            wagVar.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new u6m(this.a, this.b, objArrCopyOf, wagVar.b);
        }
        if (!i(iQ)) {
            wagVar.g(wagVar.f + 1);
            i06 i06Var3 = wagVar.b;
            int iF2 = f(iQ);
            Object[] objArr2 = this.d;
            if (i06Var != i06Var3) {
                return new u6m(this.a | iQ, this.b, upj.r(obj, obj2, objArr2, iF2), i06Var3);
            }
            this.d = upj.r(obj, obj2, objArr2, iF2);
            this.a |= iQ;
            return this;
        }
        int iT = t(iQ);
        u6m u6mVarS = s(iT);
        if (i2 == 30) {
            a aVarH = djh.h(djh.j(0, u6mVarS.d.length), 2);
            int i3 = aVarH.a;
            int i4 = aVarH.b;
            int i5 = aVarH.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                wagVar.g(wagVar.f + 1);
                u6mVarL = new u6m(0, 0, upj.r(obj, obj2, u6mVarS.d, 0), wagVar.b);
                wagVar2 = wagVar;
            } else {
                while (!Intrinsics.a(obj, u6mVarS.d[i3])) {
                    if (i3 == i4) {
                        wagVar.g(wagVar.f + 1);
                        u6mVarL = new u6m(0, 0, upj.r(obj, obj2, u6mVarS.d, 0), wagVar.b);
                        break;
                    }
                    i3 += i5;
                }
                wagVar.d = u6mVarS.x(i3);
                if (u6mVarS.c == wagVar.b) {
                    u6mVarS.d[i3 + 1] = obj2;
                    u6mVarL = u6mVarS;
                } else {
                    wagVar.e++;
                    Object[] objArr3 = u6mVarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    u6mVarL = new u6m(0, 0, objArrCopyOf2, wagVar.b);
                }
                wagVar2 = wagVar;
            }
        } else {
            wagVar2 = wagVar;
            u6mVarL = u6mVarS.l(i, obj, obj2, i2 + 5, wagVar2);
        }
        return u6mVarS == u6mVarL ? this : r(iT, u6mVarL, wagVar2.b);
    }

    public final u6m m(u6m u6mVar, int i, l27 l27Var, wag wagVar) {
        Object[] objArr;
        u6m u6mVarJ;
        if (this == u6mVar) {
            l27Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            i06 i06Var = wagVar.b;
            int i3 = u6mVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + u6mVar.d.length);
            int length = this.d.length;
            a aVarH = djh.h(djh.j(0, u6mVar.d.length), 2);
            int i4 = aVarH.a;
            int i5 = aVarH.b;
            int i6 = aVarH.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(u6mVar.d[i4])) {
                        l27Var.a++;
                    } else {
                        Object[] objArr3 = u6mVar.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == u6mVar.d.length ? u6mVar : length == objArrCopyOf.length ? new u6m(0, 0, objArrCopyOf, i06Var) : new u6m(0, 0, Arrays.copyOf(objArrCopyOf, length), i06Var);
            }
        } else {
            int i7 = this.b | u6mVar.b;
            int i8 = this.a;
            int i9 = u6mVar.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (Intrinsics.a(this.d[f(iLowestOneBit)], u6mVar.d[u6mVar.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                bpg.b("Check failed.");
            }
            u6m u6mVar2 = (Intrinsics.a(this.c, wagVar.b) && this.a == i12 && this.b == i7) ? this : new u6m(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) << 1)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = u6mVar2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    u6mVarJ = s(t(iLowestOneBit2));
                    if (u6mVar.i(iLowestOneBit2)) {
                        u6mVarJ = u6mVarJ.m(u6mVar.s(u6mVar.t(iLowestOneBit2)), i + 5, l27Var, wagVar);
                    } else if (u6mVar.h(iLowestOneBit2)) {
                        int iF = u6mVar.f(iLowestOneBit2);
                        Object obj = u6mVar.d[iF];
                        Object objX = u6mVar.x(iF);
                        int i15 = wagVar.f;
                        objArr = objArr4;
                        u6mVarJ = u6mVarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, wagVar);
                        if (wagVar.f == i15) {
                            l27Var.a++;
                        }
                    }
                    objArr = objArr4;
                } else {
                    objArr = objArr4;
                    if (u6mVar.i(iLowestOneBit2)) {
                        u6m u6mVarS = u6mVar.s(u6mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (u6mVarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                l27Var.a++;
                                u6mVarJ = u6mVarS;
                            } else {
                                u6mVarJ = u6mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, wagVar);
                            }
                        } else {
                            u6mVarJ = u6mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = u6mVar.f(iLowestOneBit2);
                        Object obj4 = u6mVar.d[iF4];
                        u6mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, u6mVar.x(iF4), i + 5, wagVar.b);
                    }
                }
                objArr[length2] = u6mVarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 << 1;
                boolean zH = u6mVar.h(iLowestOneBit3);
                Object[] objArr5 = u6mVar2.d;
                if (zH) {
                    int iF5 = u6mVar.f(iLowestOneBit3);
                    objArr5[i18] = u6mVar.d[iF5];
                    objArr5[i18 + 1] = u6mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        l27Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    objArr5[i18] = this.d[iF6];
                    objArr5[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(u6mVar2)) {
                return u6mVar.e(u6mVar2) ? u6mVar : u6mVar2;
            }
        }
        return this;
    }

    public final u6m n(int i, Object obj, int i2, wag wagVar) {
        u6m u6mVarN;
        int iQ = 1 << upj.q(i, i2);
        if (h(iQ)) {
            int iF = f(iQ);
            if (Intrinsics.a(obj, this.d[iF])) {
                return p(iF, iQ, wagVar);
            }
        } else if (i(iQ)) {
            int iT = t(iQ);
            u6m u6mVarS = s(iT);
            if (i2 == 30) {
                a aVarH = djh.h(djh.j(0, u6mVarS.d.length), 2);
                int i3 = aVarH.a;
                int i4 = aVarH.b;
                int i5 = aVarH.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    u6mVarN = u6mVarS;
                    break;
                }
                while (!Intrinsics.a(obj, u6mVarS.d[i3])) {
                    if (i3 == i4) {
                        u6mVarN = u6mVarS;
                        break;
                    }
                    i3 += i5;
                }
                u6mVarN = u6mVarS.k(i3, wagVar);
            } else {
                u6mVarN = u6mVarS.n(i, obj, i2 + 5, wagVar);
            }
            return q(u6mVarS, u6mVarN, iT, iQ, wagVar.b);
        }
        return this;
    }

    public final u6m o(int i, Object obj, Object obj2, int i2, wag wagVar) {
        wag wagVar2;
        u6m u6mVarO;
        int iQ = 1 << upj.q(i, i2);
        if (h(iQ)) {
            int iF = f(iQ);
            return (Intrinsics.a(obj, this.d[iF]) && Intrinsics.a(obj2, x(iF))) ? p(iF, iQ, wagVar) : this;
        }
        if (!i(iQ)) {
            return this;
        }
        int iT = t(iQ);
        u6m u6mVarS = s(iT);
        if (i2 == 30) {
            a aVarH = djh.h(djh.j(0, u6mVarS.d.length), 2);
            int i3 = aVarH.a;
            int i4 = aVarH.b;
            int i5 = aVarH.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                u6mVarO = u6mVarS;
                wagVar2 = wagVar;
            } else {
                while (true) {
                    if (!Intrinsics.a(obj, u6mVarS.d[i3]) || !Intrinsics.a(obj2, u6mVarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        u6mVarO = u6mVarS.k(i3, wagVar);
                        break;
                    }
                }
                u6mVarO = u6mVarS;
                wagVar2 = wagVar;
            }
        } else {
            wagVar2 = wagVar;
            u6mVarO = u6mVarS.o(i, obj, obj2, i2 + 5, wagVar2);
        }
        return q(u6mVarS, u6mVarO, iT, iQ, wagVar2.b);
    }

    public final u6m p(int i, int i2, wag wagVar) {
        wagVar.g(wagVar.f - 1);
        wagVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != wagVar.b) {
            return new u6m(this.a ^ i2, this.b, upj.y(i, objArr), wagVar.b);
        }
        this.d = upj.y(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final u6m q(u6m u6mVar, u6m u6mVar2, int i, int i2, i06 i06Var) {
        i06 i06Var2 = this.c;
        if (u6mVar2 != null) {
            return (i06Var2 == i06Var || u6mVar != u6mVar2) ? r(i, u6mVar2, i06Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (i06Var2 != i06Var) {
            return new u6m(this.a, this.b ^ i2, upj.z(i, objArr), i06Var);
        }
        this.d = upj.z(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final u6m r(int i, u6m u6mVar, i06 i06Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && u6mVar.d.length == 2 && u6mVar.b == 0) {
            u6mVar.a = this.b;
            return u6mVar;
        }
        if (this.c == i06Var) {
            objArr[i] = u6mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = u6mVar;
        return new u6m(this.a, this.b, objArrCopyOf, i06Var);
    }

    public final u6m s(int i) {
        return (u6m) this.d[i];
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r13 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r13 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        r13.b = w(r11, r4, (defpackage.u6m) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n9k u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6m.u(java.lang.Object, int, int, java.lang.Object):n9k");
    }

    public final u6m v(int i, hr5 hr5Var, int i2) {
        u6m u6mVarV;
        int iQ = 1 << upj.q(i, i2);
        if (h(iQ)) {
            int iF = f(iQ);
            if (!Intrinsics.a(hr5Var, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new u6m(this.a ^ iQ, this.b, upj.y(iF, objArr), null);
            }
        } else {
            if (!i(iQ)) {
                return this;
            }
            int iT = t(iQ);
            u6m u6mVarS = s(iT);
            if (i2 == 30) {
                a aVarH = djh.h(djh.j(0, u6mVarS.d.length), 2);
                int i3 = aVarH.a;
                int i4 = aVarH.b;
                int i5 = aVarH.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    u6mVarV = u6mVarS;
                    break;
                }
                while (!Intrinsics.a(hr5Var, u6mVarS.d[i3])) {
                    if (i3 == i4) {
                        u6mVarV = u6mVarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = u6mVarS.d;
                u6mVarV = objArr2.length == 2 ? null : new u6m(0, 0, upj.y(i3, objArr2), null);
            } else {
                u6mVarV = u6mVarS.v(i, hr5Var, i2 + 5);
            }
            if (u6mVarV != null) {
                return u6mVarS != u6mVarV ? w(iT, iQ, u6mVarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new u6m(this.a, this.b ^ iQ, upj.z(iT, objArr3), null);
            }
        }
        return null;
    }

    public final u6m w(int i, int i2, u6m u6mVar) {
        Object[] objArr = u6mVar.d;
        if (objArr.length != 2 || u6mVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = u6mVar;
            return new u6m(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            u6mVar.a = this.b;
            return u6mVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        int i3 = i + 1;
        System.arraycopy(objArrCopyOf2, i3, objArrCopyOf2, i + 2, objArr3.length - i3);
        System.arraycopy(objArrCopyOf2, iF, objArrCopyOf2, iF + 2, i - iF);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new u6m(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
