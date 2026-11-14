package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cee implements List, rtb {
    public final /* synthetic */ byte a;
    public final List b;
    public final int c;
    public int d;

    public /* synthetic */ cee(List list, int i, int i2, byte b) {
        this.a = b;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.a;
        int i2 = this.c;
        List list = this.b;
        int i3 = i + i2;
        switch (b) {
            case 0:
                list.add(i3, obj);
                this.d++;
                break;
            default:
                list.add(i3, obj);
                this.d++;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                int i = this.d;
                this.d = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.d;
                this.d = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.a;
        int i2 = this.c;
        List list = this.b;
        int i3 = i + i2;
        switch (b) {
            case 0:
                list.addAll(i3, collection);
                this.d = collection.size() + this.d;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(i3, collection);
                int size = collection.size();
                this.d += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                list.addAll(this.d, collection);
                this.d = collection.size() + this.d;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(this.d, collection);
                int size = collection.size();
                this.d += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.a;
        List list = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                int i2 = this.d - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.d = i;
                break;
            default:
                int i3 = this.d - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.d = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        List list = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                int i2 = this.d;
                while (i < i2) {
                    if (Intrinsics.a(list.get(i), obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
                break;
            default:
                int i3 = this.d;
                while (i < i3) {
                    if (Intrinsics.a(list.get(i), obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
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
        int i2 = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                p6f.a(i, this);
                break;
            default:
                efe.a(i, this);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.a;
        List list = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                int i2 = this.d;
                for (int i3 = i; i3 < i2; i3++) {
                    if (Intrinsics.a(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.d;
                for (int i5 = i; i5 < i4; i5++) {
                    if (Intrinsics.a(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (this.d == this.c) {
                }
                break;
            default:
                if (this.d == this.c) {
                }
                break;
        }
        return false;
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
        List list = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                int i2 = this.d - 1;
                if (i <= i2) {
                    while (!Intrinsics.a(list.get(i2), obj)) {
                        if (i2 == i) {
                            break;
                        } else {
                            i2--;
                        }
                    }
                    break;
                }
                break;
            default:
                int i3 = this.d - 1;
                if (i <= i3) {
                    while (!Intrinsics.a(list.get(i3), obj)) {
                        if (i3 == i) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
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
        int i2 = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                p6f.a(i, this);
                this.d--;
                return list.remove(i + i2);
            default:
                efe.a(i, this);
                this.d--;
                return list.remove(i + i2);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.a;
        int i = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                int i2 = this.d;
                while (i < i2) {
                    if (Intrinsics.a(list.get(i), obj)) {
                        list.remove(i);
                        this.d--;
                        break;
                    } else {
                        i++;
                    }
                }
                break;
            default:
                int i3 = this.d;
                while (i < i3) {
                    if (Intrinsics.a(list.get(i), obj)) {
                        list.remove(i);
                        this.d--;
                        break;
                    } else {
                        i++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                int i = this.d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.d) {
                    break;
                }
                break;
            default:
                int i2 = this.d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.d) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        int i = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                int i2 = this.d;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.d--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                if (i2 != this.d) {
                    break;
                }
                break;
            default:
                int i4 = this.d;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.d--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                if (i4 != this.d) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.a;
        int i2 = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                p6f.a(i, this);
                break;
            default:
                efe.a(i, this);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                i = this.d;
                i2 = this.c;
                break;
            default:
                i = this.d;
                i2 = this.c;
                break;
        }
        return i - i2;
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
