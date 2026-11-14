package defpackage;

import androidx.collection.ArrayMap;

/* loaded from: classes.dex */
public final class v74 extends ArrayMap {
    public int g;

    @Override // defpackage.hkj, java.util.Map
    public final void clear() {
        this.g = 0;
        super.clear();
    }

    @Override // defpackage.hkj
    public final void g(ArrayMap arrayMap) {
        this.g = 0;
        super.g(arrayMap);
    }

    @Override // defpackage.hkj
    public final Object h(int i) {
        this.g = 0;
        return super.h(i);
    }

    @Override // defpackage.hkj, java.util.Map
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.g = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.hkj
    public final Object j(int i, Object obj) {
        this.g = 0;
        return super.j(i, obj);
    }

    @Override // defpackage.hkj, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.g = 0;
        return super.put(obj, obj2);
    }
}
