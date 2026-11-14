package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class pqp extends agm {
    public final void x(List list) throws IllegalAccessException, e22, IllegalArgumentException {
        Object[] objArr = (Object[]) v();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.c).getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        w(objArr2);
    }

    public final void y(Collection collection) throws IllegalAccessException, e22, IllegalArgumentException {
        Object[] objArr = (Object[]) v();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.c).getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        w(objArr2);
    }
}
