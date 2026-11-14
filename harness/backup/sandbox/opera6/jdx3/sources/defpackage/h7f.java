package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h7f implements Iterable {
    public ArrayList a;
    public int b;
    public int c;
    public boolean d;

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            this.a = new ArrayList(4);
        } else if (arrayList.contains(obj)) {
            return false;
        }
        this.a.add(obj);
        this.c++;
        return true;
    }

    public final boolean c(Object obj) {
        ArrayList arrayList;
        int iIndexOf;
        if (obj == null || (arrayList = this.a) == null || (iIndexOf = arrayList.indexOf(obj)) == -1) {
            return false;
        }
        if (this.b == 0) {
            this.a.remove(iIndexOf);
        } else {
            this.d = true;
            this.a.set(iIndexOf, null);
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && this.b == 0) {
            this.a = null;
        }
        return true;
    }

    public final void clear() {
        this.c = 0;
        if (this.b == 0) {
            this.a = null;
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            this.d = true;
            Collections.fill(arrayList, null);
        }
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g7f(this);
    }
}
