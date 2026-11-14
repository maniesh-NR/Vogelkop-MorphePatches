package defpackage;

/* loaded from: classes.dex */
public final class ab9 {
    public final long a;
    public int b;
    public int c;
    public final Object d;

    public ab9(long j, rsf rsfVar) {
        this.c = 1;
        this.a = j;
        this.d = rsfVar;
    }

    public ab9(db9 db9Var, long j, int i, int i2) {
        this.d = db9Var;
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public final ui6 a(za9 za9Var, boolean z, int i, int i2, int i3, int i4) {
        if (!za9Var.b) {
            return null;
        }
        ((db9) this.d).getClass();
        cb9 cb9Var = cb9.a;
        return null;
    }

    public final za9 b(boolean z, int i, long j, tbb tbbVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.b;
        int i6 = this.c;
        db9 db9Var = (db9) this.d;
        int i7 = i3 + i4;
        if (tbbVar == null) {
            return new za9(true, true);
        }
        long j2 = tbbVar.a;
        db9Var.getClass();
        cb9 cb9Var = cb9.a;
        cb9 cb9Var2 = cb9.a;
        return (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) ? new za9(true, true) : (i == 0 || (i < Integer.MAX_VALUE && ((int) (j >> 32)) - ((int) (j2 >> 32)) >= 0)) ? new za9(false, false) : z2 ? new za9(true, true) : new za9(true, b(z, 0, tbb.a(yo5.h(this.a), (((int) (j & 4294967295L)) - i6) - i4), new tbb(tbb.a(((int) (j2 >> 32)) - i5, (int) (j2 & 4294967295L))), i2 + 1, i7, 0, true, false).b);
    }
}
