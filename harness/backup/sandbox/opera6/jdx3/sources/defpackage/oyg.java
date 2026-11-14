package defpackage;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oyg {
    public zy a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final /* synthetic */ pyg d;

    public oyg(pyg pygVar, zy zyVar) {
        this.d = pygVar;
        this.a = zyVar;
    }

    public final void a(irf irfVar) {
        SparseArray sparseArray;
        int i = 0;
        int i2 = 0;
        while (true) {
            sparseArray = this.b;
            int iIndexOfKey = sparseArray.indexOfKey(i2);
            if (iIndexOfKey >= 0) {
                if (sparseArray.valueAt(iIndexOfKey) != null) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 && !irfVar.d) {
            return;
        }
        yz yzVar = (yz) sparseArray.get(i2);
        if (yzVar != null) {
            sparseArray.put(i2, null);
        }
        zy zyVar = this.a;
        pyg pygVar = this.d;
        pygVar.e.remove(this);
        irfVar.d();
        this.a = null;
        if (yzVar != null) {
            ((WeakHashMap) pygVar.f.a).put(yzVar, new lyf(new WeakReference(pygVar), Integer.valueOf(i2)));
            if (!zyVar.a(yzVar)) {
                yzVar.b();
            }
            while (i < sparseArray.size()) {
                yz yzVar2 = (yz) sparseArray.valueAt(i);
                if (yzVar2 != null) {
                    yzVar2.b();
                }
                i++;
            }
            sparseArray.clear();
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            SparseArray sparseArray2 = this.c;
            if (i >= sparseArray2.size()) {
                zyVar.onFailed(sb.toString());
                return;
            } else {
                sb.append((String) sparseArray2.valueAt(i));
                sb.append('\n');
                i++;
            }
        }
    }
}
