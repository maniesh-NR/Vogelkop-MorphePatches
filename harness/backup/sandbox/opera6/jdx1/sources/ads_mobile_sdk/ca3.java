package ads_mobile_sdk;

import defpackage.t3p;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ca3 extends AbstractMap {
    public volatile defpackage.l72 d;
    public boolean c = false;
    public Object[] a = null;
    public int b = 0;
    public volatile boolean e = true;

    public final void a() {
        if (this.c) {
            t3p.o();
        }
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        if (objArr == null || objArr.length == 0) {
            this.a = new Object[Math.max(16, i)];
            return;
        }
        if (i > objArr.length) {
            if (!this.e) {
                b$1();
                if (i <= this.a.length) {
                    return;
                }
            }
            Object[] objArr2 = this.a;
            int length = objArr2.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - 2147483639 > 0) {
                i = 2147483639;
            }
            this.a = Arrays.copyOf(objArr2, i);
        }
    }

    public final void b$1() {
        if (this.c || this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            int i = this.b;
            if (i <= 1) {
                return;
            }
            int i2 = 0;
            Arrays.sort(this.a, 0, i);
            int i3 = 0;
            while (true) {
                int i4 = this.b;
                if (i2 >= i4) {
                    if (i3 < i4) {
                        this.b = i3;
                        Object[] objArr = this.a;
                        Arrays.fill(objArr, i3, objArr.length, (Object) null);
                    }
                    this.e = true;
                    return;
                }
                Object[] objArr2 = this.a;
                if (objArr2[i2] != null) {
                    throw new ClassCastException();
                }
                if (i3 > 0) {
                    if (objArr2[i3 - 1] != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
                objArr2[i3] = null;
                i3++;
                i2++;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            h9o.t();
            return false;
        }
        b$1();
        int i = this.b - 1;
        if (i < 0) {
            return false;
        }
        throw sko.g(this.a[i >>> 1]);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b$1();
        if (this.d == null) {
            this.d = new defpackage.l72(this, (byte) 2);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca3)) {
            return super.equals(obj);
        }
        ca3 ca3Var = (ca3) obj;
        b$1();
        int i = this.b;
        ca3Var.b$1();
        if (i == ca3Var.b) {
            Object[] objArr = this.a;
            Object[] objArr2 = ca3Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2].equals(objArr2[i2])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            h9o.t();
            return null;
        }
        b$1();
        int i = this.b - 1;
        if (i < 0) {
            return null;
        }
        throw sko.g(this.a[i >>> 1]);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        b$1();
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        a();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        boolean z = map instanceof ca3;
        int i = this.b;
        if (z) {
            ca3 ca3Var = (ca3) map;
            a(i + ca3Var.b);
            int i2 = this.b;
            if (i2 < ca3Var.b + i2) {
                throw sko.g(ca3Var.a[0]);
            }
            return;
        }
        a(map.size() + i);
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                h9o.t();
            } else {
                entry.getValue();
                a();
                throw null;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        b$1();
        if (obj != null) {
            h9o.t();
            return null;
        }
        int i = this.b - 1;
        if (i < 0) {
            return null;
        }
        throw sko.g(this.a[i >>> 1]);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        b$1();
        return this.b;
    }
}
