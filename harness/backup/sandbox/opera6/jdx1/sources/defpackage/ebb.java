package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ebb implements Comparable, Serializable {
    public static final ebb c = new ebb(-31557014167219200L, 0);
    public static final ebb d = new ebb(31556889864403199L, 999999999);
    public final long a;
    public final int b;

    public ebb(long j, int i) {
        this.a = j;
        this.b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            qp2.o("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ebb ebbVar) {
        int iC = Intrinsics.c(this.a, ebbVar.a);
        return iC != 0 ? iC : Intrinsics.b(this.b, ebbVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebb)) {
            return false;
        }
        ebb ebbVar = (ebb) obj;
        return this.a == ebbVar.a && this.b == ebbVar.b;
    }

    public final long g(ebb ebbVar) {
        on7 on7Var = pn7.b;
        return pn7.m(cs5.y0(this.a - ebbVar.a, un7.e), cs5.x0(this.b - ebbVar.b, un7.b));
    }

    public final ebb h(long j) {
        on7 on7Var = pn7.b;
        long jP = pn7.p(j, un7.e);
        int iH = pn7.h(j);
        if (jP == 0 && iH == 0) {
            return this;
        }
        long j2 = this.a;
        long j3 = j2 + jP;
        return ((j2 ^ j3) >= 0 || (j2 ^ jP) < 0) ? j06.n(j3, this.b + iH) : pn7.k(j) ? d : c;
    }

    public final int hashCode() {
        return (this.b * 51) + Long.hashCode(this.a);
    }

    public final long i() {
        long j = this.a;
        int i = this.b;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = i / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j2 ^ j4) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (i / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j2 ^ j8) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.a;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + ((((j4 ^ 86400) & ((-j4) | j4)) >> 63) & 86400));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        i41.v(sb, sb, i4);
        sb.append('-');
        i41.v(sb, sb, i5);
        sb.append('T');
        i41.v(sb, sb, i7);
        sb.append(':');
        i41.v(sb, sb, i9);
        sb.append(':');
        i41.v(sb, sb, i10);
        int i12 = this.b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = i41.d;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
