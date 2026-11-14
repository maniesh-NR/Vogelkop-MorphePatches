package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a7h extends n6 implements RandomAccess {
    private static final Object[] EMPTY_ARRAY;
    private static final a7h EMPTY_LIST;
    private Object[] array;
    private int size;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY_LIST = new a7h(objArr, 0, false);
    }

    public a7h() {
        this(EMPTY_ARRAY, 0, true);
    }

    private a7h(Object[] objArr, int i, boolean z) {
        super(z);
        this.array = objArr;
        this.size = i;
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> a7h emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            h9o.u(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private static int growSize(int i) {
        return rfp.e(i, 3, 2, 1, 10);
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder sbO = p3p.o(i, "Index:", ", Size:");
        sbO.append(this.size);
        return sbO.toString();
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            h9o.u(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        Object[] objArr = this.array;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArrCreateArray = createArray(growSize(objArr.length));
            System.arraycopy(this.array, 0, objArrCreateArray, 0, i);
            System.arraycopy(this.array, i, objArrCreateArray, i + 1, this.size - i);
            this.array = objArrCreateArray;
        }
        this.array[i] = obj;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.size;
        Object[] objArrCopyOf = this.array;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(this.array, growSize(objArrCopyOf.length));
            this.array = objArrCopyOf;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void ensureCapacity(int i) {
        Object[] objArr = this.array;
        if (i <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.array = new Object[Math.max(i, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i) {
            length = growSize(length);
        }
        this.array = Arrays.copyOf(this.array, length);
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (!(obj instanceof a7h)) {
            for (int i = 0; i < size; i++) {
                if (!this.array[i].equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        a7h a7hVar = (a7h) obj;
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.array[i2].equals(a7hVar.array[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + this.array[i].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.n6, defpackage.ffb
    public a7h mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new a7h(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i), this.size, true);
        }
        hai.d();
        return null;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.array;
        Object obj = objArr[i];
        if (i < this.size - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.array;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
