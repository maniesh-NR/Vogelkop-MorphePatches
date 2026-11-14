package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dql {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public to g = to.f;

    static {
        String str = tym.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
    }

    public final long a(int i2, int i3) {
        ro roVarA = this.g.a(i2);
        if (roVarA.b != -1) {
            return roVarA.g[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        ro roVarA;
        int i2;
        to toVar = this.g;
        long j3 = this.d;
        int i3 = toVar.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = toVar.d;
            while (i4 < i3 && ((toVar.a(i4).a != Long.MIN_VALUE && toVar.a(i4).a <= j2) || ((i2 = (roVarA = toVar.a(i4)).b) != -1 && roVarA.a(-1) >= i2))) {
                i4++;
            }
            if (i4 < i3 && (j3 == -9223372036854775807L || toVar.a(i4).a <= j3)) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(long r14) {
        /*
            r13 = this;
            to r0 = r13.g
            long r1 = r13.d
            int r13 = r0.a
            int r3 = r13 + (-1)
            r4 = 1
            int r13 = r13 - r4
            r5 = 0
            r6 = -9223372036854775808
            r8 = -1
            if (r3 != r13) goto L24
            ro r13 = r0.a(r3)
            boolean r9 = r13.l
            if (r9 == 0) goto L24
            long r9 = r13.a
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L24
            int r13 = r13.b
            if (r13 != r8) goto L24
            r13 = r4
            goto L25
        L24:
            r13 = r5
        L25:
            int r3 = r3 - r13
        L26:
            if (r3 < 0) goto L57
            int r13 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r13 == 0) goto L57
            ro r13 = r0.a(r3)
            long r9 = r13.a
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 != 0) goto L50
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 == 0) goto L54
            boolean r11 = r13.l
            if (r11 == 0) goto L4b
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L4b
            int r13 = r13.b
            if (r13 == r8) goto L54
        L4b:
            int r13 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r13 >= 0) goto L57
            goto L54
        L50:
            int r13 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r13 >= 0) goto L57
        L54:
            int r3 = r3 + (-1)
            goto L26
        L57:
            if (r3 < 0) goto L6f
            ro r13 = r0.a(r3)
            int r14 = r13.b
            if (r14 == r8) goto L6e
        L61:
            if (r5 >= r14) goto L6f
            int[] r15 = r13.f
            r15 = r15[r5]
            if (r15 == 0) goto L6e
            if (r15 == r4) goto L6e
            int r5 = r5 + 1
            goto L61
        L6e:
            return r3
        L6f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dql.c(long):int");
    }

    public final long d(int i2) {
        return this.g.a(i2).a;
    }

    public final int e(int i2, int i3) {
        ro roVarA = this.g.a(i2);
        if (roVarA.b != -1) {
            return roVarA.f[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !dql.class.equals(obj.getClass())) {
            return false;
        }
        dql dqlVar = (dql) obj;
        return Objects.equals(this.a, dqlVar.a) && Objects.equals(this.b, dqlVar.b) && this.c == dqlVar.c && this.d == dqlVar.d && this.e == dqlVar.e && this.f == dqlVar.f && this.g.equals(dqlVar.g);
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean g(int i2) {
        to toVar = this.g;
        int i3 = toVar.a;
        if (i2 != i3 - 1 || i2 != i3 - 1) {
            return false;
        }
        ro roVarA = toVar.a(i2);
        return roVarA.l && roVarA.a == Long.MIN_VALUE && roVarA.b == -1;
    }

    public final boolean h(int i2) {
        return this.g.a(i2).k;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i2, long j2, long j3) {
        j(obj, obj2, i2, j2, j3, to.f, false);
    }

    public final void j(Object obj, Object obj2, int i2, long j2, long j3, to toVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = toVar;
        this.f = z;
    }
}
