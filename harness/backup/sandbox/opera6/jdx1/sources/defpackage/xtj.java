package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xtj implements Iterable, ptb {
    public static final xtj e = new xtj(null, 0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public xtj(long[] jArr, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final xtj b(xtj xtjVar) {
        long[] jArr;
        xtj xtjVarC = this;
        xtj xtjVar2 = e;
        if (xtjVar == xtjVar2) {
            return xtjVarC;
        }
        if (xtjVarC == xtjVar2) {
            return xtjVar2;
        }
        long j = xtjVar.c;
        long j2 = xtjVar.c;
        long[] jArr2 = xtjVar.d;
        long j3 = xtjVar.b;
        long j4 = xtjVar.a;
        long j5 = xtjVarC.c;
        if (j == j5 && jArr2 == (jArr = xtjVarC.d)) {
            return new xtj(jArr, xtjVarC.a & (~j4), xtjVarC.b & (~j3), j5);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                xtjVarC = xtjVarC.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    xtjVarC = xtjVarC.c(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    xtjVarC = xtjVarC.c(i2 + j2 + 64);
                }
            }
        }
        return xtjVarC;
    }

    public final xtj c(long j) {
        long[] jArr;
        int iE;
        long[] jArr2;
        long j2 = j - this.c;
        if (Intrinsics.c(j2, 0L) >= 0 && Intrinsics.c(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new xtj(this.d, this.a, j4 & (~j3), this.c);
            }
        } else if (Intrinsics.c(j2, 64L) >= 0 && Intrinsics.c(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new xtj(this.d, j6 & (~j5), this.b, this.c);
            }
        } else if (Intrinsics.c(j2, 0L) < 0 && (jArr = this.d) != null && (iE = exg.e(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iE > 0) {
                    System.arraycopy(jArr, 0, jArr3, 0, iE);
                }
                if (iE < i) {
                    int i2 = iE + 1;
                    System.arraycopy(jArr, i2, jArr3, iE, length - i2);
                }
                jArr2 = jArr3;
            }
            return new xtj(jArr2, this.a, this.b, this.c);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (Intrinsics.c(j2, 0L) < 0 || Intrinsics.c(j2, 64L) >= 0) ? (Intrinsics.c(j2, 64L) < 0 || Intrinsics.c(j2, 128L) >= 0) ? Intrinsics.c(j2, 0L) <= 0 && (jArr = this.d) != null && exg.e(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final xtj e(xtj xtjVar) {
        xtj xtjVarF;
        long[] jArr;
        xtj xtjVarF2 = this;
        xtj xtjVar2 = e;
        if (xtjVar == xtjVar2) {
            return xtjVarF2;
        }
        if (xtjVarF2 == xtjVar2) {
            return xtjVar;
        }
        long j = xtjVar.c;
        long j2 = xtjVar.c;
        long[] jArr2 = xtjVar.d;
        long j3 = xtjVar.b;
        long j4 = xtjVar.a;
        long j5 = xtjVarF2.c;
        long j6 = xtjVarF2.b;
        long j7 = xtjVarF2.a;
        if (j == j5 && jArr2 == (jArr = xtjVarF2.d)) {
            return new xtj(jArr, j7 | j4, j6 | j3, j5);
        }
        long[] jArr3 = xtjVarF2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    xtjVarF2 = xtjVarF2.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i = 0; i < 64; i++) {
                    if (((1 << i) & j3) != 0) {
                        xtjVarF2 = xtjVarF2.f(i + j2);
                    }
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        xtjVarF2 = xtjVarF2.f(i2 + j2 + 64);
                    }
                }
            }
            return xtjVarF2;
        }
        if (jArr3 != null) {
            xtjVarF = xtjVar;
            for (long j9 : jArr3) {
                xtjVarF = xtjVarF.f(j9);
            }
        } else {
            xtjVarF = xtjVar;
        }
        long j10 = xtjVarF2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    xtjVarF = xtjVarF.f(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j7) != 0) {
                    xtjVarF = xtjVarF.f(i4 + j10 + 64);
                }
            }
        }
        return xtjVarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xtj f(long r30) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtj.f(long):xtj");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return t1j.a(new wtj(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(k95.o(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return p3p.m(string, " [", sb.toString(), "]");
    }
}
