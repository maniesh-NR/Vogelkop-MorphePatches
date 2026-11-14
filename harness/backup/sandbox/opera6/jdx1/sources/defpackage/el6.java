package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class el6 implements eig, prd, bm7 {
    public final kzk a;
    public final dql b;
    public final fql c;
    public final igi d;
    public final SparseArray e;
    public ijc f;
    public qi8 g;
    public szk h;
    public boolean i;

    public el6(kzk kzkVar) {
        kzkVar.getClass();
        this.a = kzkVar;
        String str = tym.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new ijc((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        dql dqlVar = new dql();
        this.b = dqlVar;
        this.c = new fql();
        this.d = new igi(dqlVar);
        this.e = new SparseArray();
    }

    @Override // defpackage.eig
    public final void A(float f) {
        V(U(), 22, new cl6((byte) 10));
    }

    @Override // defpackage.eig
    public final void B(int i, qjd qjdVar) {
        V(Q(), 1, new cl6((byte) 23));
    }

    @Override // defpackage.prd
    public final void C(int i, jrd jrdVar, bsc bscVar, tjd tjdVar) {
        V(T(i, jrdVar), 1002, new zk6((byte) 22));
    }

    @Override // defpackage.prd
    public final void D(int i, jrd jrdVar, bsc bscVar, tjd tjdVar) {
        V(T(i, jrdVar), 1001, new zk6((byte) 27));
    }

    @Override // defpackage.eig
    public final void E(y36 y36Var) {
        V(Q(), 27, new zk6((byte) 12));
    }

    @Override // defpackage.eig
    public final void F(rhg rhgVar) {
        jrd jrdVar;
        d11 d11VarQ = (!(rhgVar instanceof zh8) || (jrdVar = ((zh8) rhgVar).o) == null) ? Q() : R(jrdVar);
        V(d11VarQ, 10, new al6(d11VarQ, rhgVar));
    }

    @Override // defpackage.eig
    public final void G(fzl fzlVar) {
        V(Q(), 2, new zk6((byte) 4));
    }

    @Override // defpackage.eig
    public final void H(rhg rhgVar) {
        jrd jrdVar;
        V((!(rhgVar instanceof zh8) || (jrdVar = ((zh8) rhgVar).o) == null) ? Q() : R(jrdVar), 10, new zk6((byte) 1));
    }

    @Override // defpackage.eig
    public final void I(vjd vjdVar) {
        V(Q(), 14, new zk6((byte) 20));
    }

    @Override // defpackage.eig
    public final void J(long j) {
        V(Q(), 17, new cl6((byte) 19));
    }

    @Override // defpackage.eig
    public final void K(gql gqlVar, int i) {
        qi8 qi8Var = this.g;
        qi8Var.getClass();
        igi igiVar = this.d;
        igiVar.e = igi.H(qi8Var, (h1b) igiVar.c, (jrd) igiVar.f, (dql) igiVar.b);
        igiVar.D0(qi8Var.getCurrentTimeline());
        V(Q(), 0, new cl6((byte) 22));
    }

    @Override // defpackage.bm7
    public final void L(int i, jrd jrdVar) {
        V(T(i, jrdVar), 1027, new cl6((byte) 5));
    }

    @Override // defpackage.eig
    public final void M(thg thgVar) {
        V(Q(), 12, new kp5((byte) 24));
    }

    @Override // defpackage.eig
    public final void N(cig cigVar) {
        V(Q(), 13, new cl6((byte) 20));
    }

    @Override // defpackage.eig
    public final void O(long j) {
        V(Q(), 18, new cl6((byte) 18));
    }

    @Override // defpackage.eig
    public final void P(boolean z) {
        V(Q(), 7, new kp5((byte) 27));
    }

    public final d11 Q() {
        return R((jrd) this.d.e);
    }

    public final d11 R(jrd jrdVar) {
        this.g.getClass();
        gql gqlVar = jrdVar == null ? null : (gql) ((hsh) this.d.d).get(jrdVar);
        if (jrdVar != null && gqlVar != null) {
            return S(gqlVar, gqlVar.g(jrdVar.a, this.b).c, jrdVar);
        }
        int iF0 = this.g.f0();
        gql currentTimeline = this.g.getCurrentTimeline();
        if (iF0 >= currentTimeline.o()) {
            currentTimeline = gql.a;
        }
        return S(currentTimeline, iF0, null);
    }

    public final d11 S(gql gqlVar, int i, jrd jrdVar) {
        jrd jrdVar2 = gqlVar.p() ? null : jrdVar;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = gqlVar.equals(this.g.getCurrentTimeline()) && i == this.g.f0();
        long jC0 = 0;
        if (jrdVar2 == null || !jrdVar2.b()) {
            if (z) {
                jC0 = this.g.getContentPosition();
            } else if (!gqlVar.p()) {
                jC0 = tym.c0(gqlVar.m(i, this.c, 0L).k);
            }
        } else if (z && this.g.getCurrentAdGroupIndex() == jrdVar2.b && this.g.getCurrentAdIndexInAdGroup() == jrdVar2.c) {
            jC0 = this.g.getCurrentPosition();
        }
        return new d11(jElapsedRealtime, gqlVar, i, jrdVar2, jC0, this.g.getCurrentTimeline(), this.g.f0(), (jrd) this.d.e, this.g.getCurrentPosition(), this.g.d());
    }

    public final d11 T(int i, jrd jrdVar) {
        this.g.getClass();
        if (jrdVar != null) {
            return ((gql) ((hsh) this.d.d).get(jrdVar)) != null ? R(jrdVar) : S(gql.a, i, jrdVar);
        }
        gql currentTimeline = this.g.getCurrentTimeline();
        if (i >= currentTimeline.o()) {
            currentTimeline = gql.a;
        }
        return S(currentTimeline, i, null);
    }

    public final d11 U() {
        return R((jrd) this.d.g);
    }

    public final void V(d11 d11Var, int i, fjc fjcVar) {
        this.e.put(i, d11Var);
        this.f.i(i, fjcVar);
    }

    public final void W(qi8 qi8Var, Looper looper) {
        z4o.H(this.g == null || ((h1b) this.d.c).isEmpty());
        this.g = qi8Var;
        this.h = this.a.a(looper, null);
        ijc ijcVar = this.f;
        ge5 ge5Var = new ge5((Object) this, (Object) qi8Var, (byte) 10);
        kzk kzkVar = this.a;
        z4o.H(kzkVar != null);
        this.f = new ijc((CopyOnWriteArraySet) ijcVar.f, looper, looper.getThread(), kzkVar, ge5Var, ijcVar.b);
    }

    @Override // defpackage.eig
    public final void a(r4n r4nVar) {
        d11 d11VarU = U();
        V(d11VarU, 25, new dl6(d11VarU, r4nVar));
    }

    @Override // defpackage.eig
    public final void b(int i) {
        V(Q(), 6, new kp5((byte) 29));
    }

    @Override // defpackage.eig
    public final void c(dig digVar) {
    }

    @Override // defpackage.bm7
    public final void d(int i, jrd jrdVar, Exception exc) {
        V(T(i, jrdVar), 1024, new zk6((byte) 26));
    }

    @Override // defpackage.prd
    public final void e(int i, jrd jrdVar, tjd tjdVar) {
        V(T(i, jrdVar), 1005, new cl6((byte) 4));
    }

    @Override // defpackage.bm7
    public final void f(int i, jrd jrdVar, int i2) {
        d11 d11VarT = T(i, jrdVar);
        V(d11VarT, 1022, new zk6(d11VarT, i2));
    }

    @Override // defpackage.eig
    public final void g(int i) {
        V(U(), 21, new cl6((byte) 0));
    }

    @Override // defpackage.eig
    public final void h(int i) {
        V(Q(), 4, new zk6((byte) 7));
    }

    @Override // defpackage.prd
    public final void i(int i, jrd jrdVar, bsc bscVar, tjd tjdVar, IOException iOException, boolean z) {
        d11 d11VarT = T(i, jrdVar);
        V(d11VarT, 1003, new uk6(d11VarT, bscVar, tjdVar, iOException, z));
    }

    @Override // defpackage.bm7
    public final void j(int i, jrd jrdVar, ix5 ix5Var) {
        V(T(i, jrdVar), 1023, new cl6((byte) 14));
    }

    @Override // defpackage.bm7
    public final void k(int i, jrd jrdVar) {
        V(T(i, jrdVar), 1025, new cl6((byte) 15));
    }

    @Override // defpackage.eig
    public final void l(int i, boolean z) {
        V(Q(), 30, new zk6((byte) 19));
    }

    @Override // defpackage.eig
    public final void m(long j) {
        V(Q(), 16, new cl6((byte) 17));
    }

    @Override // defpackage.eig
    public final void n(int i, fig figVar, fig figVar2) {
        if (i == 1) {
            this.i = false;
        }
        qi8 qi8Var = this.g;
        qi8Var.getClass();
        igi igiVar = this.d;
        igiVar.e = igi.H(qi8Var, (h1b) igiVar.c, (jrd) igiVar.f, (dql) igiVar.b);
        d11 d11VarQ = Q();
        V(d11VarQ, 11, new gz3(d11VarQ, i, figVar, figVar2));
    }

    @Override // defpackage.eig
    public final void o(vjd vjdVar) {
        V(Q(), 15, new cl6((byte) 16));
    }

    @Override // defpackage.eig
    public final void onLoadingChanged(boolean z) {
    }

    @Override // defpackage.eig
    public final void onPlayerStateChanged(boolean z, int i) {
        V(Q(), -1, new kp5((byte) 25));
    }

    @Override // defpackage.eig
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // defpackage.eig
    public final void onRenderedFirstFrame() {
    }

    @Override // defpackage.eig
    public final void onRepeatModeChanged(int i) {
        V(Q(), 8, new zk6((byte) 9));
    }

    @Override // defpackage.eig
    public final void onShuffleModeEnabledChanged(boolean z) {
        V(Q(), 9, new zk6((byte) 13));
    }

    @Override // defpackage.eig
    public final void p(csh cshVar) {
        d11 d11VarQ = Q();
        V(d11VarQ, 27, new zk6(d11VarQ, cshVar));
    }

    @Override // defpackage.eig
    public final void q(boolean z) {
        V(U(), 23, new cl6((byte) 8));
    }

    @Override // defpackage.eig
    public final void r(u67 u67Var) {
        V(Q(), 29, new zk6((byte) 25));
    }

    @Override // defpackage.eig
    public final void s(int i, int i2) {
        V(U(), 24, new zk6((byte) 14));
    }

    @Override // defpackage.prd
    public final void t(int i, jrd jrdVar, bsc bscVar, tjd tjdVar, int i2) {
        V(T(i, jrdVar), 1000, new zk6((byte) 15));
    }

    @Override // defpackage.prd
    public final void u(int i, jrd jrdVar, tjd tjdVar) {
        d11 d11VarT = T(i, jrdVar);
        V(d11VarT, 1004, new ge5((Object) d11VarT, (Object) tjdVar, (byte) 11));
    }

    @Override // defpackage.eig
    public final void v(pf2 pf2Var) {
        V(U(), 20, new cl6((byte) 12));
    }

    @Override // defpackage.eig
    public final void w(nyl nylVar) {
        V(Q(), 19, new cl6((byte) 7));
    }

    @Override // defpackage.eig
    public final void x(boolean z) {
        V(Q(), 3, new cl6((byte) 1));
    }

    @Override // defpackage.eig
    public final void y(lxd lxdVar) {
        V(Q(), 28, new kp5((byte) 26));
    }

    @Override // defpackage.eig
    public final void z(int i, boolean z) {
        V(Q(), 5, new zk6((byte) 2));
    }
}
