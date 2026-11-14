package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b3g {
    public SparseArray a = new SparseArray();
    public int b;

    public b3g(int i) {
        this.b = i;
    }

    public final a3g a(int i) {
        SparseArray sparseArray = this.a;
        a3g a3gVar = (a3g) sparseArray.get(i);
        if (a3gVar != null) {
            return a3gVar;
        }
        a3g a3gVar2 = new a3g(i);
        sparseArray.put(i, a3gVar2);
        return a3gVar2;
    }

    public final ArrayList b() {
        SparseArray sparseArray = this.a;
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((a3g) sparseArray.valueAt(i));
        }
        return arrayList;
    }
}
