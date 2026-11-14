package ads_mobile_sdk;

import defpackage.elo;
import defpackage.t3p;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yk3 {
    public static final yk3 f = new yk3(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public yk3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static yk3 b() {
        return new yk3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iH;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iH = ov.h(i4) + ov.a(((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iH = ov.h(i4) + 8;
            } else if (i5 == 2) {
                iH = ov.a((hr) this.c[i2]) + ov.h(i4);
            } else if (i5 == 3) {
                iA = ((yk3) this.c[i2]).a() + (ov.h(i4) << 1) + iA;
            } else {
                if (i5 != 5) {
                    h9o.o(new elo());
                    return 0;
                }
                ((Integer) this.c[i2]).getClass();
                iH = ov.h(i4) + 4;
            }
            iA = iH + iA;
        }
        this.d = iA;
        return iA;
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

    public final void a(int i, Object obj) {
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

    public final void a(e7 e7Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((ov) e7Var.a).e(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ((ov) e7Var.a).d(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ((ov) e7Var.a).b(i3, (hr) obj);
                } else if (i4 == 3) {
                    ((ov) e7Var.a).g(i3, 3);
                    ((yk3) obj).a(e7Var);
                    ((ov) e7Var.a).g(i3, 4);
                } else {
                    if (i4 != 5) {
                        rqd.p(new elo());
                        return;
                    }
                    ((ov) e7Var.a).e(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof yk3)) {
            yk3 yk3Var = (yk3) obj;
            int i = this.a;
            if (i == yk3Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = yk3Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = yk3Var.c;
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
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
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
