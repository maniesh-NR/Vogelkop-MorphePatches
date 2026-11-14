package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bee implements List, rtb {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ bee(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj2;
                if (i < 0 || i > (i2 = deeVar.b)) {
                    StringBuilder sbO = p3p.o(i, "Index ", " must be in 0..");
                    sbO.append(deeVar.b);
                    zwg.u(sbO.toString());
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = deeVar.a;
                if (objArr.length < i3) {
                    deeVar.n(i3, objArr);
                }
                Object[] objArr2 = deeVar.a;
                int i4 = deeVar.b;
                if (i != i4) {
                    b82.d(objArr2, i + 1, objArr2, i, i4);
                }
                objArr2[i] = obj;
                deeVar.b++;
                return;
            default:
                ((dfe) obj2).b(i, obj);
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((dee) obj2).a(obj);
                break;
            default:
                ((dfe) obj2).c(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj;
                if (i < 0 || i > deeVar.b) {
                    StringBuilder sbO = p3p.o(i, "Index ", " must be in 0..");
                    sbO.append(deeVar.b);
                    zwg.u(sbO.toString());
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + deeVar.b;
                Object[] objArr = deeVar.a;
                if (objArr.length < size) {
                    deeVar.n(size, objArr);
                }
                Object[] objArr2 = deeVar.a;
                if (i != deeVar.b) {
                    b82.d(objArr2, collection.size() + i, objArr2, i, deeVar.b);
                }
                for (Object obj2 : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        j95.n();
                        throw null;
                    }
                    objArr2[i2 + i] = obj2;
                    i2 = i3;
                }
                deeVar.b = collection.size() + deeVar.b;
                return true;
            default:
                return ((dfe) obj).f(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj;
                int i = deeVar.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    deeVar.a(it.next());
                }
                return i != deeVar.b;
            default:
                dfe dfeVar = (dfe) obj;
                return dfeVar.f(dfeVar.c, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((dee) obj).d();
                break;
            default:
                ((dfe) obj).h();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((dee) obj2).e(obj);
            default:
                return ((dfe) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!deeVar.e(it.next())) {
                        break;
                    }
                }
                break;
            default:
                dfe dfeVar = (dfe) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!dfeVar.i(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                p6f.a(i, this);
                return ((dee) obj).g(i);
            default:
                efe.a(i, this);
                return ((dfe) obj).a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((dee) obj2).h(obj);
            default:
                return ((dfe) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((dee) obj).i();
            default:
                return ((dfe) obj).c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new aee(this, 0, (byte) 0);
            default:
                return new aee(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj2;
                Object[] objArr = deeVar.a;
                int i = deeVar.b - 1;
                if (obj == null) {
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                dfe dfeVar = (dfe) obj2;
                Object[] objArr2 = dfeVar.a;
                for (int i2 = dfeVar.c - 1; i2 >= 0; i2--) {
                    if (Intrinsics.a(obj, objArr2[i2])) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new aee(this, 0, (byte) 0);
            default:
                return new aee(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new aee(this, i, (byte) 0);
            default:
                return new aee(this, i, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                p6f.a(i, this);
                return ((dee) obj).l(i);
            default:
                efe.a(i, this);
                return ((dfe) obj).l(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((dee) obj2).k(obj);
            default:
                return ((dfe) obj2).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj;
                int i = deeVar.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    deeVar.k(it.next());
                }
                if (i == deeVar.b) {
                    break;
                }
                break;
            default:
                dfe dfeVar = (dfe) obj;
                if (!collection.isEmpty()) {
                    int i2 = dfeVar.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        dfeVar.k(it2.next());
                    }
                    if (i2 != dfeVar.c) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dee deeVar = (dee) obj;
                int i = deeVar.b;
                Object[] objArr = deeVar.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        deeVar.l(i2);
                    }
                }
                if (i != deeVar.b) {
                    break;
                }
                break;
            default:
                dfe dfeVar = (dfe) obj;
                int i3 = dfeVar.c;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(dfeVar.a[i4])) {
                        dfeVar.l(i4);
                    }
                }
                if (i3 != dfeVar.c) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                p6f.a(i, this);
                return ((dee) obj2).o(i, obj);
            default:
                efe.a(i, this);
                Object[] objArr = ((dfe) obj2).a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((dee) obj).b;
            default:
                return ((dfe) obj).c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                p6f.b(i, i2, this);
                return new cee(this, i, i2, (byte) 0);
            default:
                efe.b(i, i2, this);
                return new cee(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return lcp.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
        }
        return lcp.L(this, objArr);
    }
}
