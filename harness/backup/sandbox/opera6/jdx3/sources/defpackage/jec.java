package defpackage;

import j$.util.Collection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class jec extends AbstractList implements Collection {
    public final ArrayList a = new ArrayList();
    public final int b;
    public int c;

    public jec(int i) {
        this.b = Math.max(i, 1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            i = arrayList.size();
        }
        int size = arrayList.size();
        int i2 = this.b;
        if (size < i2) {
            arrayList.add((this.c + i) % i2, obj);
            return;
        }
        if (i == arrayList.size()) {
            int i3 = this.c;
            this.c = i3 + 1;
            arrayList.set(i3, obj);
            if (this.c == i2) {
                this.c = 0;
                return;
            }
            return;
        }
        if (i > 0) {
            int i4 = (this.c + i) % i2;
            arrayList.add(i4, obj);
            int i5 = this.c;
            if (i4 <= i5) {
                i5++;
                this.c = i5;
            }
            arrayList.remove(i5);
            if (this.c == i2) {
                this.c = 0;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
        this.c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get((this.c + i) % this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = this.b;
        if (size == i3 && (i2 = this.c) > 0) {
            Collections.rotate(arrayList, -i2);
            this.c = 0;
        }
        return arrayList.remove((this.c + i) % i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set((this.c + i) % this.b, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
