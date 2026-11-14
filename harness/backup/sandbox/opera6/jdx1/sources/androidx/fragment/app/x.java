package androidx.fragment.app;

import defpackage.l7n;
import defpackage.v7n;
import defpackage.z51;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x extends l7n {
    public static final z51 h = new z51((byte) 1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public x(boolean z) {
        this.e = z;
    }

    @Override // defpackage.l7n
    public final void e() {
        if (w.N(3)) {
            toString();
        }
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.b.equals(xVar.b) && this.c.equals(xVar.c) && this.d.equals(xVar.d);
    }

    public final void f(Fragment fragment) {
        if (this.g) {
            return;
        }
        String str = fragment.mWho;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (w.N(2)) {
            fragment.toString();
        }
    }

    public final void g(String str, boolean z) {
        HashMap map = this.c;
        x xVar = (x) map.get(str);
        if (xVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(xVar.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    xVar.g((String) obj, true);
                }
            }
            xVar.e();
            map.remove(str);
        }
        HashMap map2 = this.d;
        v7n v7nVar = (v7n) map2.get(str);
        if (v7nVar != null) {
            v7nVar.a();
            map2.remove(str);
        }
    }

    public final void h(Fragment fragment) {
        if (this.g || this.b.remove(fragment.mWho) == null || !w.N(2)) {
            return;
        }
        fragment.toString();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
