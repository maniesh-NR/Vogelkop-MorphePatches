package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wjk implements List, rtb {
    public final puj a;
    public final int b;
    public int c;
    public int d;

    public wjk(puj pujVar, int i, int i2) {
        this.a = pujVar;
        this.b = i;
        this.c = ((sak) ytj.f(pujVar.a)).e;
        this.d = i2 - i;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.b + i;
        puj pujVar = this.a;
        pujVar.add(i2, obj);
        this.d++;
        this.c = ((sak) ytj.f(pujVar.a)).e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.b + this.d;
        puj pujVar = this.a;
        pujVar.add(i, obj);
        this.d++;
        this.c = ((sak) ytj.f(pujVar.a)).e;
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.b;
        puj pujVar = this.a;
        boolean zAddAll = pujVar.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = ((sak) ytj.f(pujVar.a)).e;
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }

    public final void b() {
        if (((sak) ytj.f(this.a.a)).e == this.c) {
            return;
        }
        t40.e();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            b();
            int i = this.d;
            int i2 = this.b;
            puj pujVar = this.a;
            pujVar.e(i2, i + i2);
            this.d = 0;
            this.c = ((sak) ytj.f(pujVar.a)).e;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        k1g.j0(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.d;
        int i2 = this.b;
        acb it = djh.j(i2, i + i2).iterator();
        while (it.c) {
            int iNextInt = ((ubb) it).nextInt();
            if (Intrinsics.a(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.a(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        nqh nqhVar = new nqh();
        nqhVar.a = i - 1;
        return new q1i(nqhVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.b + i;
        puj pujVar = this.a;
        Object objRemove = pujVar.remove(i2);
        this.d--;
        this.c = ((sak) ytj.f(pujVar.a)).e;
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractList, zbg] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        b();
        puj pujVar = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = pujVar.size();
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(pujVar.a);
                i = sakVar.d;
                j6Var = sakVar.c;
            }
            ?? M = j6Var.m();
            M.subList(i2, i3).retainAll(collection);
            j6 j6VarH = M.h();
            if (Intrinsics.a(j6VarH, j6Var)) {
                break;
            }
            sak sakVar2 = pujVar.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, pujVar, ttjVarH), i, j6VarH, true);
            }
            ytj.l(ttjVarH, pujVar);
        } while (!zJ);
        int size2 = size - pujVar.size();
        if (size2 <= 0) {
            return false;
        }
        this.c = ((sak) ytj.f(this.a.a)).e;
        this.d -= size2;
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        k1g.j0(i, this.d);
        b();
        int i2 = i + this.b;
        puj pujVar = this.a;
        Object obj2 = pujVar.set(i2, obj);
        this.c = ((sak) ytj.f(pujVar.a)).e;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            bpg.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.b;
        return new wjk(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return lcp.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lcp.L(this, objArr);
    }
}
