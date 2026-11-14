package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ee7 extends n6 implements web, RandomAccess, yxg {
    private static final double[] EMPTY_ARRAY;
    private static final ee7 EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        double[] dArr = new double[0];
        EMPTY_ARRAY = dArr;
        EMPTY_LIST = new ee7(dArr, 0, false);
    }

    public ee7() {
        this(EMPTY_ARRAY, 0, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ee7(ee7 ee7Var, boolean z) {
        int i = ee7Var.size;
        this(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(ee7Var.array, i), ee7Var.size, z);
    }

    private ee7(double[] dArr, int i, boolean z) {
        super(z);
        this.array = dArr;
        this.size = i;
    }

    private void addDouble(int i, double d) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            h9o.u(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        double[] dArr = this.array;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[growSize(dArr.length)];
            System.arraycopy(this.array, 0, dArr2, 0, i);
            System.arraycopy(this.array, i, dArr2, i + 1, this.size - i);
            this.array = dArr2;
        }
        this.array[i] = d;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static ee7 emptyList() {
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
    public void add(int i, Double d) {
        addDouble(i, d.doubleValue());
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    @Override // defpackage.n6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        ifb.checkNotNull(collection);
        if (!(collection instanceof ee7)) {
            return super.addAll(collection);
        }
        ee7 ee7Var = (ee7) collection;
        int i = ee7Var.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            t3p.x();
            return false;
        }
        int i3 = i2 + i;
        double[] dArrCopyOf = this.array;
        if (i3 > dArrCopyOf.length) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
            this.array = dArrCopyOf;
        }
        System.arraycopy(ee7Var.array, 0, dArrCopyOf, this.size, ee7Var.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.web
    public void addDouble(double d) {
        ensureIsMutable();
        int i = this.size;
        double[] dArr = this.array;
        if (i == dArr.length) {
            dArr = new double[growSize(dArr.length)];
            System.arraycopy(this.array, 0, dArr, 0, this.size);
            this.array = dArr;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        dArr[i2] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i) {
        double[] dArr = this.array;
        if (i <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.array = new double[Math.max(i, 10)];
            return;
        }
        int length = dArr.length;
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
        if (!(obj instanceof ee7)) {
            return super.equals(obj);
        }
        ee7 ee7Var = (ee7) obj;
        if (this.size != ee7Var.size) {
            return false;
        }
        double[] dArr = ee7Var.array;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.array[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // defpackage.web
    public double getDouble(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + ifb.hashLong(Double.doubleToLongBits(this.array[i]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.n6, defpackage.ffb
    public web mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new ee7(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i), this.size, true);
        }
        hai.d();
        return null;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Double remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            h9o.u("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.array;
        System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    @Override // defpackage.web
    public double setDouble(int i, double d) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double[] dArr = this.array;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
