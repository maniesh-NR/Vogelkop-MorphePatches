package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l6h {
    public final ArrayList a;
    public final izk b;
    public int c;
    public boolean d;

    public l6h(izk izkVar, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.a = arrayList2;
        if (arrayList.size() > 0) {
            throw fki.n(0, arrayList);
        }
        if (arrayList.size() > 0) {
            throw fki.n(0, arrayList);
        }
        ArrayList arrayList3 = izkVar.b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                throw fki.n(size, arrayList2);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw fki.n(size2, arrayList2);
            }
        }
        this.b = izkVar;
    }
}
