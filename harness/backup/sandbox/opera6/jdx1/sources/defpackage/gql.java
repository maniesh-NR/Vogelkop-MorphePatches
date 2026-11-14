package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class gql {
    public static final cql a = new cql();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = tym.a;
        b = "0";
        c = "1";
        d = "2";
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public int b(Object obj) {
        return obj == jcd.h ? 0 : -1;
    }

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, dql dqlVar, fql fqlVar, int i2, boolean z) {
        int i3 = f(i, dqlVar, false).c;
        if (m(i3, fqlVar, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, fqlVar, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                h9o.e();
                return 0;
            }
            if (i == c(z)) {
                return a(z);
            }
        } else if (i == c(z)) {
            return -1;
        }
        return i + 1;
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof gql) {
                gql gqlVar = (gql) obj;
                if (gqlVar.o() == o() && gqlVar.h() == h()) {
                    fql fqlVar = new fql();
                    dql dqlVar = new dql();
                    fql fqlVar2 = new fql();
                    dql dqlVar2 = new dql();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int iA = a(true);
                                    if (iA == gqlVar.a(true) && (iC = c(true)) == gqlVar.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == gqlVar.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, dqlVar, true).equals(gqlVar.f(i2, dqlVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, fqlVar, 0L).equals(gqlVar.m(i, fqlVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public dql f(int i, dql dqlVar, boolean z) {
        Integer num;
        Object obj;
        if (z) {
            num = 0;
            obj = jcd.h;
        } else {
            num = null;
            obj = null;
        }
        dqlVar.j(num, obj, 0, -9223372036854775807L, 0L, to.f, true);
        return dqlVar;
    }

    public dql g(Object obj, dql dqlVar) {
        return f(b(obj), dqlVar, true);
    }

    public int h() {
        return 1;
    }

    public final int hashCode() {
        int i;
        fql fqlVar = new fql();
        dql dqlVar = new dql();
        int iO = o() + 217;
        int i2 = 0;
        while (true) {
            i = iO * 31;
            if (i2 >= o()) {
                break;
            }
            iO = i + m(i2, fqlVar, 0L).hashCode();
            i2++;
        }
        int iH = h() + i;
        for (int i3 = 0; i3 < h(); i3++) {
            iH = (iH * 31) + f(i3, dqlVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(fql fqlVar, dql dqlVar, int i, long j) {
        Pair pairJ = j(fqlVar, dqlVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(fql fqlVar, dql dqlVar, int i, long j, long j2) {
        z4o.A(i, o());
        m(i, fqlVar, j2);
        if (j == -9223372036854775807L) {
            j = fqlVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = fqlVar.m;
        f(i2, dqlVar, false);
        while (i2 < fqlVar.n && dqlVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, dqlVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, dqlVar, true);
        long jMin = j - dqlVar.e;
        long j3 = dqlVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = dqlVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                h9o.e();
                return 0;
            }
            if (i == a(z)) {
                return c(z);
            }
        } else if (i == a(z)) {
            return -1;
        }
        return i - 1;
    }

    public Object l(int i) {
        return jcd.h;
    }

    public fql m(int i, fql fqlVar, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final void n(int i, fql fqlVar) {
        m(i, fqlVar, 0L);
    }

    public int o() {
        return 1;
    }

    public final boolean p() {
        return o() == 0;
    }
}
