package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g2a {
    public final float[] a;
    public final int[] b;

    public g2a(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final g2a a(float[] fArr) {
        int iO;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iO = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iO = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iO = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iO = c26.o((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iO;
        }
        return new g2a(fArr, iArr);
    }
}
