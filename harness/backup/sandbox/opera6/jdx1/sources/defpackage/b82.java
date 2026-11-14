package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public class b82 extends z72 {
    public static void c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void d(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void e(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    public static void f(byte[] bArr, byte[] bArr2, int i, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static void g(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static void h(int i, int[] iArr) {
        Arrays.fill(iArr, 0, iArr.length, i);
    }

    public static void i(Object obj, Object[] objArr) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    public static void j(long[] jArr, long j) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    public static byte[] k(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static Integer[] l(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }
}
