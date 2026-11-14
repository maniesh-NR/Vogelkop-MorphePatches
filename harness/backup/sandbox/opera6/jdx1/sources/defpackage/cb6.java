package defpackage;

/* loaded from: classes.dex */
public final class cb6 extends gql {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final wa6 l;
    public final qjd m;
    public final ljd n;

    public cb6(long j, long j2, long j3, int i, long j4, long j5, long j6, wa6 wa6Var, qjd qjdVar, ljd ljdVar) {
        z4o.H(wa6Var.d == (ljdVar != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = wa6Var;
        this.m = qjdVar;
        this.n = ljdVar;
    }

    @Override // defpackage.gql
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        String str;
        Integer numValueOf;
        z4o.A(i, h());
        wa6 wa6Var = this.l;
        if (z) {
            str = wa6Var.a(i).a;
            numValueOf = Integer.valueOf(this.h + i);
        } else {
            str = null;
            numValueOf = null;
        }
        dqlVar.i(str, numValueOf, 0, wa6Var.c(i), tym.N(wa6Var.a(i).b - wa6Var.a(0).b) - this.i);
        return dqlVar;
    }

    @Override // defpackage.gql
    public final int h() {
        return this.l.m.size();
    }

    @Override // defpackage.gql
    public final Object l(int i) {
        z4o.A(i, h());
        return Integer.valueOf(this.h + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    @Override // defpackage.gql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fql m(int r24, defpackage.fql r25, long r26) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb6.m(int, fql, long):fql");
    }
}
