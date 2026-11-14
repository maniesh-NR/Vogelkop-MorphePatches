package defpackage;

import ads_mobile_sdk.us3;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bg3 {
    public final /* synthetic */ byte a;
    public int[] b;
    public int c;

    public bg3(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new int[10];
                break;
        }
    }

    public bg3(int i) {
        this.a = (byte) 1;
        this.b = new int[i];
    }

    public bg3(int i, int[] iArr) {
        this.a = (byte) 3;
        int iA = u0h.a(((~480298490) & 1376520936) | 743765285, (480298490 & 1378459336) | 569504804, -451892186, 1172755590) ^ (496987743 % 159259470);
        int length = iArr.length;
        if (length == iA) {
            this.c = i;
            this.b = iArr;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44);
        String strA = us3.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k");
        String strA2 = us3.a("a0CvvBEaN339T0zNlXk=");
        sb.append(strA);
        sb.append(length);
        sb.append(strA2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(int i, byte[] bArr) {
        int i2 = 1777080124;
        int i3 = 1777080124;
        int i4 = 0;
        int iA = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        char c2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c3 = 0;
        while (true) {
            if (i3 == 719824015) {
                int i16 = (-235787554) + i3;
                i3 += 799411447;
                if (i4 == iA) {
                    i3 = i16;
                }
            } else if (i3 == 1519235462) {
                int[] iArr = this.b;
                i6 += (((i5 << i7) ^ (i5 >>> i8)) + i5) ^ (i4 + iArr[i4 & i9]);
                i4 += i10;
                i5 += (((i6 << i7) ^ (i6 >>> i8)) + i6) ^ (iArr[(i4 >>> i11) & i9] + i4);
                i3 -= 799411447;
            } else {
                if (i3 != i2) {
                    bArr[0] = (byte) (i6 >> i15);
                    bArr[1] = (byte) ((((i6 >> i14) & i12) << i15) >> i15);
                    bArr[c3] = (byte) ((((i6 >> i13) & i12) << i15) >> i15);
                    bArr[i9] = (byte) (((i6 & i12) << i15) >> i15);
                    bArr[i7] = (byte) (i5 >> i15);
                    bArr[i8] = (byte) ((((i5 >> i14) & i12) << i15) >> i15);
                    bArr[c2] = (byte) ((((i5 >> i13) & i12) << i15) >> i15);
                    bArr[c] = (byte) (((i5 & i12) << i15) >> i15);
                    return;
                }
                iA = u0h.a(1447011278, -1395425889, 328319491, 94255812) ^ 154407182;
                i6 = this.c;
                i3 -= 1057256109;
                i7 = 4;
                i8 = 5;
                i9 = 3;
                i10 = 1340169305;
                i11 = 11;
                i15 = 24;
                i12 = 255;
                c3 = 2;
                c2 = 6;
                c = 7;
                i14 = 16;
                i13 = 8;
                i5 = i;
                i4 = 0;
            }
            i2 = 1777080124;
        }
    }

    public final int b(int i) {
        int i2 = this.c - 1;
        return i2 >= 0 ? this.b[i2] : i;
    }

    public final int c() {
        int[] iArr = this.b;
        int i = this.c - 1;
        this.c = i;
        return iArr[i];
    }

    public final void d(int i) {
        int[] iArrCopyOf = this.b;
        if (this.c >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
            this.b = iArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    public final void e(int i, int i2, int i3) {
        int i4 = this.c;
        int[] iArrCopyOf = this.b;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
            this.b = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.c = i5;
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int[] iArrCopyOf = this.b;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
            this.b = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.c = i6;
    }

    public final void g(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = true;
            if (((i >>> ((i2 - i3) - 1)) & 1) != 1) {
                z = false;
            }
            h(z);
        }
    }

    public final void h(boolean z) {
        int i = this.c;
        int[] iArrCopyOf = this.b;
        if (i == (iArrCopyOf.length << 3)) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length + 32);
            this.b = iArrCopyOf;
        }
        if (z) {
            int i2 = this.c;
            int i3 = i2 / 8;
            iArrCopyOf[i3] = iArrCopyOf[i3] | (NotificationCompat.FLAG_HIGH_PRIORITY >>> (i2 % 8));
        }
        this.c++;
    }

    public final void i(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    j(i3, i4);
                }
            }
            j(i3 + 3, i2);
            i(i, i3);
            i(i3 + 6, i2);
        }
    }

    public final void j(int i, int i2) {
        int[] iArr = this.b;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(((this.b[i2 / 8] >>> (7 - (i2 % 8))) & 1) == 1 ? '1' : '0');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
