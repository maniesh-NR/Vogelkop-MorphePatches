package defpackage;

/* loaded from: classes.dex */
public final class u62 implements w62 {
    public final /* synthetic */ byte a;

    public /* synthetic */ u62(byte b) {
        this.a = b;
    }

    @Override // defpackage.w62
    public final void c(n27 n27Var, int i, int[] iArr, d2c d2cVar, int[] iArr2) {
        int i2 = 0;
        switch (this.a) {
            case 0:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int i8 = i - i6;
                int length2 = iArr.length;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            case 2:
                if (d2cVar == d2c.a) {
                    b72.c(i, iArr, iArr2, false);
                    break;
                } else {
                    b72.b(iArr, iArr2, true);
                    break;
                }
            default:
                if (d2cVar == d2c.a) {
                    b72.b(iArr, iArr2, false);
                    break;
                } else {
                    b72.c(i, iArr, iArr2, true);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
