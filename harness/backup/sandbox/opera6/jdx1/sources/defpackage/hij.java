package defpackage;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class hij implements jij {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public hij(int i) {
        this(i, new Random());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hij(int i, Random random) {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr[i2] = iArr[iNextInt];
            iArr[iNextInt] = i2;
            i2 = i3;
        }
        this(iArr, random);
    }

    public hij(int[] iArr, Random random) {
        this.b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.c[iArr[i]] = i;
        }
    }

    @Override // defpackage.jij
    public final jij a(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = this.b;
        int[] iArr2 = new int[iArr.length - i3];
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 < i || i6 >= i2) {
                int i7 = i5 - i4;
                if (i6 >= i) {
                    i6 -= i3;
                }
                iArr2[i7] = i6;
            } else {
                i4++;
            }
        }
        return new hij(iArr2, new Random(this.a.nextLong()));
    }

    @Override // defpackage.jij
    public final jij cloneAndClear() {
        return new hij(0, new Random(this.a.nextLong()));
    }

    @Override // defpackage.jij
    public final jij cloneAndInsert(int i, int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.b;
            random = this.a;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int iNextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[iNextInt];
            iArr3[iNextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr2[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr3[i5];
                i5++;
            }
        }
        return new hij(iArr4, new Random(random.nextLong()));
    }

    @Override // defpackage.jij
    public final int getFirstIndex() {
        int[] iArr = this.b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // defpackage.jij
    public final int getLastIndex() {
        int[] iArr = this.b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // defpackage.jij
    public final int getLength() {
        return this.b.length;
    }

    @Override // defpackage.jij
    public final int getNextIndex(int i) {
        int i2 = this.c[i] + 1;
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // defpackage.jij
    public final int getPreviousIndex(int i) {
        int i2 = this.c[i] - 1;
        if (i2 >= 0) {
            return this.b[i2];
        }
        return -1;
    }
}
