package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class puj implements Parcelable, vak, List, RandomAccess, rtb {

    @NotNull
    public static final Parcelable.Creator<puj> CREATOR = new ouj((byte) 0);
    public sak a;

    public puj() {
        this(sqj.c);
    }

    public puj(j6 j6Var) {
        ttj ttjVarH = ytj.h();
        sak sakVar = new sak(ttjVarH.g(), j6Var);
        if (!(ttjVarH instanceof lz9)) {
            sakVar.b = new sak(1L, j6Var);
        }
        this.a = sakVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i2 = sakVar.d;
                j6Var = sakVar.c;
            }
            j6 j6VarG = j6Var.g(i, obj);
            if (j6VarG.equals(j6Var)) {
                return;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i2, j6VarG, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i = sakVar.d;
                j6Var = sakVar.c;
            }
            j6 j6VarH = j6Var.h(obj);
            if (j6VarH.equals(j6Var)) {
                return false;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i, j6VarH, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return k1g.M(this, new gv(i, collection, (byte) 5));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i = sakVar.d;
                j6Var = sakVar.c;
            }
            j6 j6VarJ = j6Var.j(collection);
            if (Intrinsics.a(j6VarJ, j6Var)) {
                return false;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i, j6VarJ, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        yakVar.b = this.a;
        this.a = (sak) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ttj ttjVarH;
        sak sakVar = this.a;
        synchronized (ytj.c) {
            ttjVarH = ytj.h();
            sak sakVar2 = (sak) ytj.w(sakVar, this, ttjVarH);
            synchronized (k1g.f) {
                sakVar2.c = sqj.c;
                sakVar2.d++;
                sakVar2.e++;
            }
        }
        ytj.l(ttjVarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((sak) ytj.s(this.a, this)).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((sak) ytj.s(this.a, this)).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractList, zbg] */
    public final void e(int i, int i2) {
        int i3;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i3 = sakVar.d;
                j6Var = sakVar.c;
            }
            ?? M = j6Var.m();
            M.subList(i, i2).clear();
            j6 j6VarH = M.h();
            if (Intrinsics.a(j6VarH, j6Var)) {
                return;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i3, j6VarH, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((sak) ytj.s(this.a, this)).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((sak) ytj.s(this.a, this)).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((sak) ytj.s(this.a, this)).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((sak) ytj.s(this.a, this)).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new mea(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new mea(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        Object obj = get(i);
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i2 = sakVar.d;
                j6Var = sakVar.c;
            }
            j6 j6VarO = j6Var.o(i);
            if (j6VarO.equals(j6Var)) {
                break;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i2, j6VarO, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i = sakVar.d;
                j6Var = sakVar.c;
            }
            int iIndexOf = j6Var.indexOf(obj);
            j6 j6VarO = iIndexOf != -1 ? j6Var.o(iIndexOf) : j6Var;
            if (j6VarO.equals(j6Var)) {
                return false;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i, j6VarO, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i = sakVar.d;
                j6Var = sakVar.c;
            }
            j6Var.getClass();
            j6 j6VarN = j6Var.n(new h6(collection, (byte) 0));
            if (Intrinsics.a(j6VarN, j6Var)) {
                return false;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i, j6VarN, true);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return k1g.M(this, new h6(collection, (byte) 4));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        j6 j6Var;
        ttj ttjVarH;
        boolean zJ;
        Object obj2 = get(i);
        do {
            synchronized (k1g.f) {
                sak sakVar = (sak) ytj.f(this.a);
                i2 = sakVar.d;
                j6Var = sakVar.c;
            }
            j6 j6VarP = j6Var.p(i, obj);
            if (j6VarP.equals(j6Var)) {
                break;
            }
            sak sakVar2 = this.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = k1g.j((sak) ytj.w(sakVar2, this, ttjVarH), i2, j6VarP, false);
            }
            ytj.l(ttjVarH, this);
        } while (!zJ);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((sak) ytj.s(this.a, this)).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            bpg.a("fromIndex or toIndex are out of bounds");
        }
        return new wjk(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return lcp.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lcp.L(this, objArr);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((sak) ytj.f(this.a)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        z4 z4Var = ((sak) ytj.s(this.a, this)).c;
        int size = z4Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(z4Var.get(i2));
        }
    }
}
