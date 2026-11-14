package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class emm {
    public static final emm f = new emm(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public emm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int iG;
        int i;
        int iG2;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int iS = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iG2 = x75.g(i5) + 8;
                } else if (i6 == 2) {
                    d54 d54Var = (d54) this.c[i3];
                    int iG3 = x75.g(i5);
                    int size = d54Var.size();
                    iS = j7c.s(size, size, iG3, iS);
                } else if (i6 == 3) {
                    iG = x75.g(i5) << 1;
                    i = ((emm) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        h9o.o(cjb.g());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iG2 = x75.g(i5) + 4;
                }
                iS = iG2 + iS;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iG = x75.g(i5);
                i = x75.i(jLongValue);
            }
            iS = i + iG + iS;
        }
        this.d = iS;
        return iS;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            t3p.o();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(eme emeVar) {
        if (this.a != 0) {
            emeVar.getClass();
            x75 x75Var = (x75) emeVar.a;
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    x75Var.D(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    x75Var.s(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    x75Var.o(i3, (d54) obj);
                } else if (i4 == 3) {
                    x75Var.A(i3, 3);
                    ((emm) obj).d(emeVar);
                    x75Var.A(i3, 4);
                } else {
                    if (i4 != 5) {
                        rqd.p(cjb.g());
                        return;
                    }
                    x75Var.q(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof emm)) {
            return false;
        }
        emm emmVar = (emm) obj;
        int i = this.a;
        if (i == emmVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = emmVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = emmVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
