package defpackage;

import androidx.collection.ArrayMap;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class hkj {
    public int[] a;
    public Object[] b;
    public int c;

    public hkj() {
        this(0);
    }

    public hkj(int i) {
        this.a = i == 0 ? x1p.b : new int[i];
        this.b = i == 0 ? x1p.d : new Object[i << 1];
    }

    public hkj(ArrayMap arrayMap) {
        this(0);
        g(arrayMap);
    }

    public final int a(Object obj) {
        int i = this.c << 1;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, i);
            this.b = Arrays.copyOf(this.b, i << 1);
        }
        if (this.c == i2) {
            return;
        }
        t40.e();
    }

    public final int c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int iF = x1p.f(i2, i, this.a);
        if (iF < 0 || Intrinsics.a(obj, this.b[iF << 1])) {
            return iF;
        }
        int i3 = iF + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (Intrinsics.a(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iF - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (Intrinsics.a(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            this.a = x1p.b;
            this.b = x1p.d;
            i = 0;
            this.c = 0;
        }
        if (i <= 0) {
            return;
        }
        t40.e();
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int iF = x1p.f(i, 0, this.a);
        if (iF < 0 || this.b[iF << 1] == null) {
            return iF;
        }
        int i2 = iF + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iF - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof hkj) {
                int i = this.c;
                if (i != ((hkj) obj).c) {
                    return false;
                }
                hkj hkjVar = (hkj) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objK = k(i2);
                    Object obj2 = hkjVar.get(objF);
                    if (objK == null) {
                        if (obj2 != null || !hkjVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objK.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objK2 = k(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objK2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i << 1];
        }
        zwg.t("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void g(ArrayMap arrayMap) {
        int i = arrayMap.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(arrayMap.f(i2), arrayMap.k(i2));
            }
        } else if (i > 0) {
            b82.c(0, 0, i, arrayMap.a, this.a);
            b82.d(arrayMap.b, 0, this.b, 0, i << 1);
            this.c = i;
        }
    }

    public final Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            zwg.t("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                System.arraycopy(iArr, i5, iArr, i, i2 - i5);
                Object[] objArr2 = this.b;
                b82.d(objArr2, i3, objArr2, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.a = Arrays.copyOf(iArr, i7);
            this.b = Arrays.copyOf(this.b, i7 << 1);
            if (i2 != this.c) {
                t40.e();
                return null;
            }
            if (i > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i);
                System.arraycopy(objArr, 0, this.b, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                System.arraycopy(iArr, i8, this.a, i, i2 - i8);
                int i9 = i8 << 1;
                System.arraycopy(objArr, i9, this.b, i3, (i2 << 1) - i9);
            }
        }
        if (i2 == this.c) {
            this.c = i4;
            return obj;
        }
        t40.e();
        return null;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += iArr[i3] ^ (obj != null ? obj.hashCode() : 0);
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public Object j(int i, Object obj) {
        if (i < 0 || i >= this.c) {
            zwg.t("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object k(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[(i << 1) + 1];
        }
        zwg.t("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int iE;
        int iHashCode;
        int i = this.c;
        if (obj != null) {
            iHashCode = obj.hashCode();
            iE = c(iHashCode, obj);
        } else {
            iE = e();
            iHashCode = 0;
        }
        if (iE >= 0) {
            int i2 = (iE << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iE;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.a = Arrays.copyOf(iArr, i4);
            this.b = Arrays.copyOf(this.b, i4 << 1);
            if (i != this.c) {
                t40.e();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            b82.c(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.b;
            b82.d(objArr2, i5 << 1, objArr2, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        t40.e();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.a(obj2, k(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return j(iD, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.a(obj2, k(iD))) {
            return false;
        }
        j(iD, obj3);
        return true;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objK = k(i2);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
