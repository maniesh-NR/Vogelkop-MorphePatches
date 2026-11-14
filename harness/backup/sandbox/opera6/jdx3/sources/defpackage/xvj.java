package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public final class xvj {
    public Object[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public qw4 f;
    public wvj g;
    public int h = 0;
    public final Class i;

    public xvj(Class cls, yvj yvjVar) {
        this.i = cls;
        this.a = (Object[]) Array.newInstance((Class<?>) cls, 10);
        this.f = yvjVar;
    }

    public final int a(Object obj) {
        i();
        return b(obj, true);
    }

    public final int b(Object obj, boolean z) {
        int iE = e(this.h, 1, obj, this.a);
        if (iE == -1) {
            iE = 0;
        } else if (iE < this.h) {
            Object obj2 = this.a[iE];
            if (this.f.b(obj2, obj)) {
                boolean zA = this.f.a(obj2, obj);
                Object[] objArr = this.a;
                if (zA) {
                    objArr[iE] = obj;
                    return iE;
                }
                objArr[iE] = obj;
                qw4 qw4Var = this.f;
                qw4Var.I(iE, 1, qw4Var.d(obj2, obj));
                return iE;
            }
        }
        int i = this.h;
        if (iE > i) {
            h9o.g(this.h, p3p.o(iE, "cannot add item to ", " because size is "));
            return 0;
        }
        Object[] objArr2 = this.a;
        if (i == objArr2.length) {
            Object[] objArr3 = (Object[]) Array.newInstance((Class<?>) this.i, objArr2.length + 10);
            System.arraycopy(this.a, 0, objArr3, 0, iE);
            objArr3[iE] = obj;
            System.arraycopy(this.a, iE, objArr3, iE + 1, this.h - iE);
            this.a = objArr3;
        } else {
            System.arraycopy(objArr2, iE, objArr2, iE + 1, i - iE);
            this.a[iE] = obj;
        }
        this.h++;
        if (z) {
            this.f.t(iE, 1);
        }
        return iE;
    }

    public final void c(Collection collection) {
        int i;
        int size = collection.size();
        Class cls = this.i;
        Object[] array = collection.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        i();
        if (array.length == 0 || array.length < 1) {
            return;
        }
        int i2 = 0;
        if (array.length == 0) {
            i = 0;
        } else {
            Arrays.sort(array, this.f);
            i = 1;
            int i3 = 0;
            for (int i4 = 1; i4 < array.length; i4++) {
                Object obj = array[i4];
                if (this.f.compare(array[i3], obj) == 0) {
                    int i5 = i3;
                    while (true) {
                        if (i5 >= i) {
                            i5 = -1;
                            break;
                        } else if (this.f.b(array[i5], obj)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 != -1) {
                        array[i5] = obj;
                    } else {
                        if (i != i4) {
                            array[i] = obj;
                        }
                        i++;
                    }
                } else {
                    if (i != i4) {
                        array[i] = obj;
                    }
                    i3 = i;
                    i++;
                }
            }
        }
        if (this.h == 0) {
            this.a = array;
            this.h = i;
            this.f.t(0, i);
            return;
        }
        boolean z = this.f instanceof wvj;
        if (!z) {
            i();
            qw4 qw4Var = this.f;
            if (!(qw4Var instanceof wvj)) {
                wvj wvjVar = this.g;
                if (wvjVar == null) {
                    wvjVar = new wvj(qw4Var);
                    this.g = wvjVar;
                }
                this.f = wvjVar;
            }
        }
        this.b = this.a;
        this.c = 0;
        int i6 = this.h;
        this.d = i6;
        this.a = (Object[]) Array.newInstance((Class<?>) cls, i6 + i + 10);
        this.e = 0;
        while (true) {
            int i7 = this.c;
            int i8 = this.d;
            if (i7 >= i8 && i2 >= i) {
                break;
            }
            if (i7 == i8) {
                int i9 = i - i2;
                System.arraycopy(array, i2, this.a, this.e, i9);
                int i10 = this.e + i9;
                this.e = i10;
                this.h += i9;
                this.f.t(i10 - i9, i9);
                break;
            }
            Object[] objArr = this.b;
            if (i2 == i) {
                int i11 = i8 - i7;
                System.arraycopy(objArr, i7, this.a, this.e, i11);
                this.e += i11;
                break;
            }
            Object obj2 = objArr[i7];
            Object obj3 = array[i2];
            int iCompare = this.f.compare(obj2, obj3);
            if (iCompare > 0) {
                Object[] objArr2 = this.a;
                int i12 = this.e;
                this.e = i12 + 1;
                objArr2[i12] = obj3;
                this.h++;
                i2++;
                this.f.t(i12, 1);
            } else if (iCompare == 0 && this.f.b(obj2, obj3)) {
                Object[] objArr3 = this.a;
                int i13 = this.e;
                this.e = i13 + 1;
                objArr3[i13] = obj3;
                i2++;
                this.c++;
                if (!this.f.a(obj2, obj3)) {
                    qw4 qw4Var2 = this.f;
                    qw4Var2.I(this.e - 1, 1, qw4Var2.d(obj2, obj3));
                }
            } else {
                Object[] objArr4 = this.a;
                int i14 = this.e;
                this.e = i14 + 1;
                objArr4[i14] = obj2;
                this.c++;
            }
        }
        this.b = null;
        if (z) {
            return;
        }
        i();
        qw4 qw4Var3 = this.f;
        if (qw4Var3 instanceof wvj) {
            ((wvj) qw4Var3).b.a();
        }
        qw4 qw4Var4 = this.f;
        wvj wvjVar2 = this.g;
        if (qw4Var4 == wvjVar2) {
            this.f = wvjVar2.a;
        }
    }

    public final void d() {
        i();
        int i = this.h;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.a, 0, i, (Object) null);
        this.h = 0;
        this.f.f(0, i);
    }

    public final int e(int i, int i2, Object obj, Object[] objArr) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = (i3 + i) / 2;
            Object obj2 = objArr[i4];
            int iCompare = this.f.compare(obj2, obj);
            if (iCompare < 0) {
                i3 = i4 + 1;
            } else {
                if (iCompare == 0) {
                    if (!this.f.b(obj2, obj)) {
                        int i5 = i4 - 1;
                        while (i5 >= i3) {
                            Object obj3 = this.a[i5];
                            if (this.f.compare(obj3, obj) != 0) {
                                break;
                            }
                            if (this.f.b(obj3, obj)) {
                                break;
                            }
                            i5--;
                        }
                        i5 = i4 + 1;
                        while (i5 < i) {
                            Object obj4 = this.a[i5];
                            if (this.f.compare(obj4, obj) != 0) {
                                break;
                            }
                            if (this.f.b(obj4, obj)) {
                                break;
                            }
                            i5++;
                        }
                        i5 = -1;
                        if (i2 != 1 || i5 != -1) {
                            return i5;
                        }
                    }
                    return i4;
                }
                i = i4;
            }
        }
        if (i2 == 1) {
            return i3;
        }
        return -1;
    }

    public final Object f(int i) {
        int i2;
        if (i >= this.h || i < 0) {
            h9o.g(this.h, p3p.o(i, "Asked to get item at ", " but size is "));
            return null;
        }
        Object[] objArr = this.b;
        return (objArr == null || i < (i2 = this.e)) ? this.a[i] : objArr[(i - i2) + this.c];
    }

    public final void g(Object obj) {
        i();
        int iE = e(this.h, 2, obj, this.a);
        if (iE == -1) {
            return;
        }
        h(iE, true);
    }

    public final void h(int i, boolean z) {
        Object[] objArr = this.a;
        System.arraycopy(objArr, i + 1, objArr, i, (this.h - i) - 1);
        int i2 = this.h - 1;
        this.h = i2;
        this.a[i2] = null;
        if (z) {
            this.f.f(i, 1);
        }
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        qp2.n("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }
}
