package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m0d extends n6 implements dfb, RandomAccess, yxg {
    private static final long[] EMPTY_ARRAY;
    private static final m0d EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        long[] jArr = new long[0];
        EMPTY_ARRAY = jArr;
        EMPTY_LIST = new m0d(jArr, 0, false);
    }

    public m0d() {
        this(EMPTY_ARRAY, 0, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m0d(m0d m0dVar, boolean z) {
        int i = m0dVar.size;
        this(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(m0dVar.array, i), m0dVar.size, z);
    }

    private m0d(long[] jArr, int i, boolean z) {
        super(z);
        this.array = jArr;
        this.size = i;
    }

    private void addLong(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            h9o.u(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        long[] jArr = this.array;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[growSize(jArr.length)];
            System.arraycopy(this.array, 0, jArr2, 0, i);
            System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
            this.array = jArr2;
        }
        this.array[i] = j;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static m0d emptyList() {
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
    public void add(int i, Long l) {
        addLong(i, l.longValue());
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    @Override // defpackage.n6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        ifb.checkNotNull(collection);
        if (!(collection instanceof m0d)) {
            return super.addAll(collection);
        }
        m0d m0dVar = (m0d) collection;
        int i = m0dVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            t3p.x();
            return false;
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.array;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
            this.array = jArrCopyOf;
        }
        System.arraycopy(m0dVar.array, 0, jArrCopyOf, this.size, m0dVar.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.dfb
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            jArr = new long[growSize(jArr.length)];
            System.arraycopy(this.array, 0, jArr, 0, this.size);
            this.array = jArr;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        jArr[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i) {
        long[] jArr = this.array;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.array = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
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
        if (!(obj instanceof m0d)) {
            return super.equals(obj);
        }
        m0d m0dVar = (m0d) obj;
        if (this.size != m0dVar.size) {
            return false;
        }
        long[] jArr = m0dVar.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // defpackage.dfb
    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + ifb.hashLong(this.array[i]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.n6, defpackage.ffb
    public dfb mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new m0d(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i), this.size, true);
        }
        hai.d();
        return null;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            h9o.u("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.array;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // defpackage.dfb
    public long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
