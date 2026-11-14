package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j5h extends l73 {
    public final bd6 h;
    public final r9g i;
    public final em7 j;
    public final i06 k;
    public final oj9 l;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public pl6 q;
    public qjd r;

    public j5h(qjd qjdVar, bd6 bd6Var, r9g r9gVar, em7 em7Var, i06 i06Var, oj9 oj9Var) {
        this.r = qjdVar;
        this.h = bd6Var;
        this.i = r9gVar;
        this.j = em7Var;
        this.k = i06Var;
        this.l = oj9Var;
    }

    @Override // defpackage.l73
    public final boolean a(qjd qjdVar) {
        mjd mjdVar = i().b;
        mjdVar.getClass();
        mjd mjdVar2 = qjdVar.b;
        return mjdVar2 != null && mjdVar2.a.equals(mjdVar.a) && mjdVar2.h == mjdVar.h && Objects.equals(mjdVar2.f, mjdVar.f);
    }

    @Override // defpackage.l73
    public final nkd c(jrd jrdVar, l45 l45Var, long j) {
        ed6 ed6VarCreateDataSource = this.h.createDataSource();
        pl6 pl6Var = this.q;
        if (pl6Var != null) {
            ed6VarCreateDataSource.c(pl6Var);
        }
        mjd mjdVar = i().b;
        mjdVar.getClass();
        Uri uri = mjdVar.a;
        this.g.getClass();
        fn8 fn8Var = (fn8) this.i.b;
        l45 l45Var2 = new l45();
        l45Var2.a = fn8Var;
        return new g5h(uri, ed6VarCreateDataSource, l45Var2, this.j, new am7(this.d.c, 0, jrdVar), this.k, b(jrdVar), this, l45Var, mjdVar.f, this.l, tym.N(mjdVar.h), null);
    }

    @Override // defpackage.l73
    public final synchronized qjd i() {
        return this.r;
    }

    @Override // defpackage.l73
    public final void k() {
    }

    @Override // defpackage.l73
    public final void m(pl6 pl6Var) {
        this.q = pl6Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        fjg fjgVar = this.g;
        fjgVar.getClass();
        em7 em7Var = this.j;
        em7Var.c(looperMyLooper, fjgVar);
        em7Var.a();
        u();
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        g5h g5hVar = (g5h) nkdVar;
        if (g5hVar.y) {
            for (uhi uhiVar : g5hVar.v) {
                uhiVar.k();
                xl7 xl7Var = uhiVar.h;
                if (xl7Var != null) {
                    xl7Var.d(uhiVar.e);
                    uhiVar.h = null;
                    uhiVar.g = null;
                }
            }
        }
        g5hVar.m.y(g5hVar);
        g5hVar.r.removeCallbacksAndMessages(null);
        g5hVar.s = null;
        g5hVar.Q = true;
    }

    @Override // defpackage.l73
    public final void q() {
        this.j.release();
    }

    @Override // defpackage.l73
    public final synchronized void t(qjd qjdVar) {
        this.r = qjdVar;
    }

    public final void u() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        qjd qjdVarI = i();
        gql vljVar = new vlj(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, qjdVarI, z2 ? qjdVarI.d : null);
        if (this.m) {
            vljVar = new h5h(vljVar);
        }
        n(vljVar);
    }

    public final void v(long j, twi twiVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        boolean zIsSeekable = twiVar.isSeekable();
        if (!this.m && this.n == j && this.o == zIsSeekable && this.p == z) {
            return;
        }
        this.n = j;
        this.o = zIsSeekable;
        this.p = z;
        this.m = false;
        u();
    }
}
