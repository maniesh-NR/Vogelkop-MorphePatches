package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g7f implements Iterator {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public boolean d;
    public final /* synthetic */ Iterable e;

    public g7f(h7f h7fVar) {
        Objects.requireNonNull(h7fVar);
        this.e = h7fVar;
        h7fVar.b++;
        ArrayList arrayList = h7fVar.a;
        this.b = arrayList != null ? arrayList.size() : 0;
    }

    public g7f(i7f i7fVar) {
        Objects.requireNonNull(i7fVar);
        this.e = i7fVar;
        i7fVar.b++;
        this.b = i7fVar.a.size();
    }

    public final void a() {
        byte b = this.a;
        Iterable iterable = this.e;
        switch (b) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    h7f h7fVar = (h7f) iterable;
                    int i = h7fVar.b - 1;
                    h7fVar.b = i;
                    if (i <= 0 && h7fVar.d) {
                        h7fVar.d = false;
                        ArrayList arrayList = h7fVar.a;
                        if (arrayList != null) {
                            if (h7fVar.c == 0) {
                                h7fVar.a = null;
                                break;
                            } else {
                                arrayList.removeAll(Collections.singleton(null));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    i7f i7fVar = (i7f) iterable;
                    int i2 = i7fVar.b - 1;
                    i7fVar.b = i2;
                    if (i2 <= 0 && i7fVar.d) {
                        i7fVar.d = false;
                        ArrayList arrayList2 = i7fVar.a;
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            if (arrayList2.get(size) == null) {
                                arrayList2.remove(size);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public final void b() {
        h7f h7fVar = (h7f) this.e;
        h7fVar.getClass();
        a();
        h7fVar.b++;
        ArrayList arrayList = h7fVar.a;
        this.b = arrayList == null ? 0 : arrayList.size();
        this.d = false;
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Iterable iterable = this.e;
        switch (b) {
            case 0:
                h7f h7fVar = (h7f) iterable;
                h7fVar.getClass();
                int i = this.c;
                while (i < this.b && h7fVar.a.get(i) == null) {
                    i++;
                }
                this.c = i;
                if (i < this.b) {
                    break;
                } else {
                    a();
                    break;
                }
            default:
                int i2 = this.b;
                i7f i7fVar = (i7f) iterable;
                i7fVar.getClass();
                for (int i3 = this.c; i3 < i2; i3++) {
                    if (i7fVar.a.get(i3) != null) {
                        break;
                    }
                }
                a();
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Iterable iterable = this.e;
        switch (b) {
            case 0:
                h7f h7fVar = (h7f) iterable;
                h7fVar.getClass();
                if (!hasNext()) {
                    t3p.y();
                    break;
                } else {
                    int i = this.c;
                    this.c = i + 1;
                    break;
                }
            default:
                int i2 = this.b;
                i7f i7fVar = (i7f) iterable;
                i7fVar.getClass();
                ArrayList arrayList = i7fVar.a;
                while (true) {
                    int i3 = this.c;
                    if (i3 < i2 && arrayList.get(i3) == null) {
                        this.c++;
                    }
                }
                int i4 = this.c;
                if (i4 >= i2) {
                    a();
                    t3p.y();
                    break;
                } else {
                    this.c = i4 + 1;
                    break;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
