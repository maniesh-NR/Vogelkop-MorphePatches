package defpackage;

/* loaded from: classes.dex */
public abstract class q83 implements kuh, bkg {
    public final byte b;
    public luh d;
    public int e;
    public fjg f;
    public kzk g;
    public byte h;
    public vhi i;
    public oj9[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public jrd q;
    public jx6 r;
    public final Object a = new Object();
    public final i16 c = new i16((byte) 18);
    public long m = Long.MIN_VALUE;
    public gql p = gql.a;

    /* JADX WARN: Multi-variable type inference failed */
    public q83(int i) {
        this.b = i;
    }

    public final void A(long j, boolean z, boolean z2) {
        this.n = false;
        this.l = j;
        this.m = j;
        if (!z2) {
            vhi vhiVar = this.i;
            vhiVar.getClass();
            z2 = vhiVar.skipData(j - this.k) != 0;
        }
        q(j, z, z2);
    }

    public void B(float f, float f2) {
    }

    public boolean C(long j) {
        return false;
    }

    public final zh8 a(Exception exc, oj9 oj9Var, boolean z, int i) {
        int iB;
        if (oj9Var == null || this.o) {
            iB = 4;
        } else {
            this.o = true;
            try {
                iB = b(oj9Var) & 7;
            } catch (zh8 unused) {
            } finally {
                this.o = false;
            }
        }
        return new zh8(1, exc, i, getName(), this.e, oj9Var, oj9Var == null ? 4 : iB, this.q, z);
    }

    @Override // defpackage.kuh
    public final void d() {
        synchronized (this.a) {
            this.r = null;
        }
    }

    @Override // defpackage.kuh
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.kuh
    public final int getTrackType() {
        return this.b;
    }

    public void h() {
    }

    public void handleMessage(int i, Object obj) {
    }

    public long i(long j, long j2) {
        if (this.h == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public hgd j() {
        return null;
    }

    public final boolean k() {
        return this.m == Long.MIN_VALUE;
    }

    public boolean l() {
        return k();
    }

    public boolean m() {
        return true;
    }

    public abstract void n();

    public void o(boolean z, boolean z2) {
    }

    @Override // defpackage.kuh
    public final void p(jx6 jx6Var) {
        synchronized (this.a) {
            this.r = jx6Var;
        }
    }

    public abstract void q(long j, boolean z, boolean z2);

    public void r() {
    }

    public void s() {
    }

    @Override // defpackage.kuh
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public void t() {
    }

    public void u() {
    }

    public void v(oj9[] oj9VarArr, long j, long j2, jrd jrdVar) {
    }

    public void w() {
    }

    public final int x(i16 i16Var, qj6 qj6Var, int i) {
        vhi vhiVar = this.i;
        vhiVar.getClass();
        int iC = vhiVar.c(i16Var, qj6Var, i);
        if (iC == -4) {
            if (qj6Var.d(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = qj6Var.g + this.k;
            qj6Var.g = j;
            this.m = Math.max(this.m, j);
            return iC;
        }
        if (iC == -5) {
            oj9 oj9Var = (oj9) i16Var.c;
            oj9Var.getClass();
            long j2 = oj9Var.s;
            if (j2 != Long.MAX_VALUE) {
                nj9 nj9VarA = oj9Var.a();
                nj9VarA.r = j2 + this.k;
                i16Var.c = new oj9(nj9VarA);
            }
        }
        return iC;
    }

    public abstract void y(long j, long j2);

    public final void z(oj9[] oj9VarArr, vhi vhiVar, long j, long j2, jrd jrdVar) {
        z4o.H(!this.n);
        this.i = vhiVar;
        this.q = jrdVar;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = oj9VarArr;
        this.k = j2;
        v(oj9VarArr, j, j2, jrdVar);
    }
}
