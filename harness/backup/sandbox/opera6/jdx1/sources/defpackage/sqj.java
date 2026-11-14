package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class sqj extends j6 {
    public static final sqj c = new sqj(new Object[0]);
    public final Object[] b;

    public sqj(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    public final int d() {
        return this.b.length;
    }

    @Override // defpackage.j6
    public final j6 g(int i, Object obj) {
        Object[] objArr = this.b;
        j14.r(i, objArr.length);
        if (i == objArr.length) {
            return h(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            b82.g(objArr, 0, objArr2, i, 6);
            System.arraycopy(objArr, i, objArr2, i + 1, objArr.length - i);
            objArr2[i] = obj;
            return new sqj(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        System.arraycopy(objArr, i, objArrCopyOf, i + 1, (objArr.length - 1) - i);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new xbg(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    public final Object get(int i) {
        j14.q(i, d());
        return this.b[i];
    }

    @Override // defpackage.j6
    public final j6 h(Object obj) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new sqj(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new xbg(objArr, objArr2, objArr.length + 1, 0);
    }

    public final int indexOf(Object obj) {
        return e82.u(obj, this.b);
    }

    @Override // defpackage.j6
    public final j6 j(Collection collection) {
        Object[] objArr = this.b;
        if (collection.size() + objArr.length > 32) {
            zbg zbgVarM = m();
            zbgVarM.addAll(collection);
            return zbgVarM.h();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new sqj(objArrCopyOf);
    }

    public final int lastIndexOf(Object obj) {
        return e82.y(obj, this.b);
    }

    public final ListIterator listIterator(int i) {
        Object[] objArr = this.b;
        j14.r(i, objArr.length);
        return new g04(objArr, i, objArr.length);
    }

    @Override // defpackage.j6
    public final zbg m() {
        return new zbg(this, null, this.b, 0);
    }

    @Override // defpackage.j6
    public final j6 n(h6 h6Var) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) h6Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return c;
        }
        y72.a(length, objArrCopyOf.length);
        return new sqj(Arrays.copyOfRange(objArrCopyOf, 0, length));
    }

    @Override // defpackage.j6
    public final j6 o(int i) {
        j14.q(i, d());
        if (d() == 1) {
            return c;
        }
        int iD = d() - 1;
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, iD);
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArrCopyOf, i, d() - i2);
        return new sqj(objArrCopyOf);
    }

    @Override // defpackage.j6
    public final j6 p(int i, Object obj) {
        j14.q(i, d());
        Object[] objArr = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new sqj(objArrCopyOf);
    }
}
