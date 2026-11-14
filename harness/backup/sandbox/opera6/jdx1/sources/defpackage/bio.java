package defpackage;

/* loaded from: classes.dex */
public final class bio {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;

    public bio(int i, int i2, int i3, String str, boolean z) {
        int i4;
        this.a = i;
        this.b = i2;
        int[] iArrB = vep.B(3);
        int length = iArrB.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i4 = z1m.b;
                break;
            }
            i4 = iArrB[i5];
            int i6 = 1;
            if (i4 == 1) {
                i6 = 0;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    throw null;
                }
                i6 = 2;
            }
            if (i6 == i3) {
                break;
            } else {
                i5++;
            }
        }
        this.c = i4;
        this.d = z;
        this.e = str;
    }
}
