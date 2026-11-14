package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class nbb extends n6 implements cfb, RandomAccess, yxg {
    private static final int[] EMPTY_ARRAY;
    private static final nbb EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        int[] iArr = new int[0];
        EMPTY_ARRAY = iArr;
        EMPTY_LIST = new nbb(iArr, 0, false);
    }

    public nbb() {
        this(EMPTY_ARRAY, 0, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nbb(nbb nbbVar, boolean z) {
        int i = nbbVar.size;
        this(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(nbbVar.array, i), nbbVar.size, z);
    }

    private nbb(int[] iArr, int i, boolean z) {
        super(z);
        this.array = iArr;
        this.size = i;
    }

    private void addInt(int i, int i2) {
        int i3;
        ensureIsMutable();
        if (i < 0 || i > (i3 = this.size)) {
            h9o.u(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        int[] iArr = this.array;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[growSize(iArr.length)];
            System.arraycopy(this.array, 0, iArr2, 0, i);
            System.arraycopy(this.array, i, iArr2, i + 1, this.size - i);
            this.array = iArr2;
        }
        this.array[i] = i2;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static nbb emptyList() {
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
    public void add(int i, Integer num) {
        addInt(i, num.intValue());
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // defpackage.n6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        ifb.checkNotNull(collection);
        if (!(collection instanceof nbb)) {
            return super.addAll(collection);
        }
        nbb nbbVar = (nbb) collection;
        int i = nbbVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            t3p.x();
            return false;
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.array;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
            this.array = iArrCopyOf;
        }
        System.arraycopy(nbbVar.array, 0, iArrCopyOf, this.size, nbbVar.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.cfb
    public void addInt(int i) {
        ensureIsMutable();
        int i2 = this.size;
        int[] iArr = this.array;
        if (i2 == iArr.length) {
            iArr = new int[growSize(iArr.length)];
            System.arraycopy(this.array, 0, iArr, 0, this.size);
            this.array = iArr;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i) {
        int[] iArr = this.array;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.array = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = growSize(length);
        }
        this.array = Arrays.copyOf(this.array, length);
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbb)) {
            return super.equals(obj);
        }
        nbb nbbVar = (nbb) obj;
        if (this.size != nbbVar.size) {
            return false;
        }
        int[] iArr = nbbVar.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // defpackage.cfb
    public int getInt(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.n6, defpackage.ffb
    public cfb mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new nbb(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i), this.size, true);
        }
        hai.d();
        return null;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.array;
        int i2 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            h9o.u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.array;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // defpackage.cfb
    public int setInt(int i, int i2) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.array;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
