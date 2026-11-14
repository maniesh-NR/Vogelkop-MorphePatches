package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class q89 extends n6 implements bfb, RandomAccess, yxg {
    private static final float[] EMPTY_ARRAY;
    private static final q89 EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        float[] fArr = new float[0];
        EMPTY_ARRAY = fArr;
        EMPTY_LIST = new q89(fArr, 0, false);
    }

    public q89() {
        this(EMPTY_ARRAY, 0, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q89(q89 q89Var, boolean z) {
        int i = q89Var.size;
        this(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(q89Var.array, i), q89Var.size, z);
    }

    private q89(float[] fArr, int i, boolean z) {
        super(z);
        this.array = fArr;
        this.size = i;
    }

    private void addFloat(int i, float f) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            h9o.u(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        float[] fArr = this.array;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[growSize(fArr.length)];
            System.arraycopy(this.array, 0, fArr2, 0, i);
            System.arraycopy(this.array, i, fArr2, i + 1, this.size - i);
            this.array = fArr2;
        }
        this.array[i] = f;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static q89 emptyList() {
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
    public void add(int i, Float f) {
        addFloat(i, f.floatValue());
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f) {
        addFloat(f.floatValue());
        return true;
    }

    @Override // defpackage.n6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        ifb.checkNotNull(collection);
        if (!(collection instanceof q89)) {
            return super.addAll(collection);
        }
        q89 q89Var = (q89) collection;
        int i = q89Var.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            t3p.x();
            return false;
        }
        int i3 = i2 + i;
        float[] fArrCopyOf = this.array;
        if (i3 > fArrCopyOf.length) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
            this.array = fArrCopyOf;
        }
        System.arraycopy(q89Var.array, 0, fArrCopyOf, this.size, q89Var.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.bfb
    public void addFloat(float f) {
        ensureIsMutable();
        int i = this.size;
        float[] fArr = this.array;
        if (i == fArr.length) {
            fArr = new float[growSize(fArr.length)];
            System.arraycopy(this.array, 0, fArr, 0, this.size);
            this.array = fArr;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i) {
        float[] fArr = this.array;
        if (i <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.array = new float[Math.max(i, 10)];
            return;
        }
        int length = fArr.length;
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
        if (!(obj instanceof q89)) {
            return super.equals(obj);
        }
        q89 q89Var = (q89) obj;
        if (this.size != q89Var.size) {
            return false;
        }
        float[] fArr = q89Var.array;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.array[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // defpackage.bfb
    public float getFloat(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == fFloatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.n6, defpackage.ffb
    public bfb mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new q89(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i), this.size, true);
        }
        hai.d();
        return null;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Float remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f = fArr[i];
        if (i < this.size - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            h9o.u("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.array;
        System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n6, java.util.AbstractList, java.util.List
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // defpackage.bfb
    public float setFloat(int i, float f) {
        ensureIsMutable();
        ensureIndexInRange(i);
        float[] fArr = this.array;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
