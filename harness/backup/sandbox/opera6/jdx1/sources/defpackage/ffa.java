package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ffa extends l73 {
    public final rq6 h;
    public final qq6 i;
    public final ir5 j;
    public final em7 k;
    public final i06 l;
    public final boolean m;
    public final boolean n;
    public final uq6 o;
    public final long p;
    public ljd q;
    public pl6 r;
    public qjd s;

    static {
        rjd.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ffa(qjd qjdVar, qq6 qq6Var, rq6 rq6Var, ir5 ir5Var, em7 em7Var, i06 i06Var, uq6 uq6Var, long j, boolean z, int i) {
        this.s = qjdVar;
        this.q = qjdVar.d;
        this.i = qq6Var;
        this.h = rq6Var;
        this.j = ir5Var;
        this.k = em7Var;
        this.l = i06Var;
        this.o = uq6Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static zea u(h1b h1bVar, long j) {
        zea zeaVar = null;
        for (int i = 0; i < h1bVar.size(); i++) {
            zea zeaVar2 = (zea) h1bVar.get(i);
            if (zeaVar2.e > j) {
                break;
            }
            if (zeaVar2.l) {
                zeaVar = zeaVar2;
            }
        }
        return zeaVar;
    }

    @Override // defpackage.l73
    public final boolean a(qjd qjdVar) {
        qjd qjdVarI = i();
        mjd mjdVar = qjdVarI.b;
        mjdVar.getClass();
        mjd mjdVar2 = qjdVar.b;
        return mjdVar2 != null && mjdVar2.a.equals(mjdVar.a) && mjdVar2.e.equals(mjdVar.e) && Objects.equals(mjdVar2.c, mjdVar.c) && qjdVarI.d.equals(qjdVar.d);
    }

    @Override // defpackage.l73
    public final nkd c(jrd jrdVar, l45 l45Var, long j) {
        ro9 ro9VarB = b(jrdVar);
        am7 am7Var = new am7(this.d.c, 0, jrdVar);
        pl6 pl6Var = this.r;
        fjg fjgVar = this.g;
        fjgVar.getClass();
        return new vea(this.h, this.o, this.i, pl6Var, this.k, am7Var, this.l, ro9VarB, l45Var, this.j, this.m, this.n ? 1 : 0, fjgVar);
    }

    @Override // defpackage.l73
    public final synchronized qjd i() {
        return this.s;
    }

    @Override // defpackage.l73
    public final void k() throws IOException {
        uq6 uq6Var = this.o;
        qb7 qb7Var = uq6Var.g;
        if (qb7Var != null) {
            qb7Var.maybeThrowError();
        }
        Uri uri = uq6Var.k;
        if (uri != null) {
            tq6 tq6Var = (tq6) uq6Var.d.get(uri);
            tq6Var.b.maybeThrowError();
            IOException iOException = tq6Var.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.l73
    public final void m(pl6 pl6Var) {
        this.r = pl6Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        fjg fjgVar = this.g;
        fjgVar.getClass();
        em7 em7Var = this.k;
        em7Var.c(looperMyLooper, fjgVar);
        em7Var.a();
        ro9 ro9VarB = b(null);
        mjd mjdVar = i().b;
        mjdVar.getClass();
        Uri uri = mjdVar.a;
        Handler handlerP = tym.p(null);
        uq6 uq6Var = this.o;
        uq6Var.h = handlerP;
        uq6Var.f = ro9VarB;
        uq6Var.i = this;
        Map map = Collections.EMPTY_MAP;
        z4o.D(uri, "The uri must be set.");
        w1g w1gVar = new w1g(((bd6) uq6Var.a.b).createDataSource(), new nd6(uri, 1, null, map, 0L, -1L, null, 1), 4, uq6Var.b.k());
        z4o.H(uq6Var.g == null);
        qb7 qb7Var = new qb7("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        uq6Var.g = qb7Var;
        qb7Var.C(w1gVar, uq6Var, uq6Var.c.k(w1gVar.c));
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        vea veaVar = (vea) nkdVar;
        veaVar.b.e.remove(veaVar);
        for (sfa sfaVar : veaVar.t) {
            if (sfaVar.D) {
                for (rfa rfaVar : sfaVar.v) {
                    rfaVar.k();
                    xl7 xl7Var = rfaVar.h;
                    if (xl7Var != null) {
                        xl7Var.d(rfaVar.e);
                        rfaVar.h = null;
                        rfaVar.g = null;
                    }
                }
            }
            tea teaVar = sfaVar.d;
            tq6 tq6Var = (tq6) teaVar.g.d.get(teaVar.e[teaVar.r.getSelectedIndexInTrackGroup()]);
            if (tq6Var != null) {
                tq6Var.k = false;
            }
            teaVar.n = null;
            sfaVar.j.y(sfaVar);
            sfaVar.r.removeCallbacksAndMessages(null);
            sfaVar.H = true;
            sfaVar.s.clear();
        }
        veaVar.q = null;
    }

    @Override // defpackage.l73
    public final void q() {
        uq6 uq6Var = this.o;
        uq6Var.k = null;
        uq6Var.l = null;
        uq6Var.j = null;
        uq6Var.n = -9223372036854775807L;
        uq6Var.g.y((usc) null);
        uq6Var.g = null;
        HashMap map = uq6Var.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((tq6) it.next()).b.y((usc) null);
        }
        uq6Var.h.removeCallbacksAndMessages(null);
        uq6Var.h = null;
        map.clear();
        this.k.release();
    }

    @Override // defpackage.l73
    public final synchronized void t(qjd qjdVar) {
        this.s = qjdVar;
    }

    public final void v(efa efaVar) {
        long j;
        vlj vljVar;
        long jN;
        long j2;
        long j3;
        boolean z = efaVar.p;
        boolean z2 = efaVar.g;
        h1b h1bVar = efaVar.r;
        long j4 = efaVar.u;
        long jN2 = efaVar.e;
        byte b = efaVar.d;
        long j5 = efaVar.h;
        long jC0 = z ? tym.c0(j5) : -9223372036854775807L;
        long j6 = (b == 2 || b == 1) ? jC0 : -9223372036854775807L;
        uq6 uq6Var = this.o;
        uq6Var.j.getClass();
        j06 j06Var = new j06((byte) 12);
        if (uq6Var.m) {
            dfa dfaVar = efaVar.v;
            long j7 = dfaVar.c;
            long j8 = dfaVar.d;
            long j9 = j5 - uq6Var.n;
            boolean z3 = efaVar.o;
            long j10 = z3 ? j9 + j4 : -9223372036854775807L;
            long jN3 = efaVar.p ? tym.N(tym.z(this.p)) - (j5 + j4) : 0L;
            long j11 = this.q.a;
            if (j11 != -9223372036854775807L) {
                jN = tym.N(j11);
            } else {
                jN = (jN2 != -9223372036854775807L ? j4 - jN2 : (j8 == -9223372036854775807L || efaVar.n == -9223372036854775807L) ? j7 != -9223372036854775807L ? j7 : 3 * efaVar.m : j8) + jN3;
            }
            long j12 = j4 + jN3;
            long j13 = tym.j(jN, jN3, j12);
            ljd ljdVar = i().d;
            boolean z4 = false;
            boolean z5 = ljdVar.d == -3.4028235E38f && ljdVar.e == -3.4028235E38f && j7 == -9223372036854775807L && j8 == -9223372036854775807L;
            kjd kjdVarA = this.q.a();
            kjdVarA.a = tym.c0(j13);
            kjdVarA.d = z5 ? 1.0f : this.q.d;
            kjdVarA.e = z5 ? 1.0f : this.q.e;
            ljd ljdVar2 = new ljd(kjdVarA);
            this.q = ljdVar2;
            if (jN2 == -9223372036854775807L) {
                jN2 = j12 - tym.N(ljdVar2.a);
            }
            if (z2) {
                j3 = jN2;
            } else {
                zea zeaVarU = u(efaVar.s, jN2);
                if (zeaVarU != null) {
                    j2 = zeaVarU.e;
                } else if (h1bVar.isEmpty()) {
                    j3 = 0;
                } else {
                    bfa bfaVar = (bfa) h1bVar.get(tym.c(h1bVar, Long.valueOf(jN2), true));
                    zea zeaVarU2 = u(bfaVar.m, jN2);
                    j2 = zeaVarU2 != null ? zeaVarU2.e : bfaVar.e;
                }
                j3 = j2;
            }
            if (b == 2 && efaVar.f) {
                z4 = true;
            }
            vljVar = new vlj(j6, jC0, j10, efaVar.u, j9, j3, true, !z3, z4, j06Var, i(), this.q);
        } else {
            if (jN2 == -9223372036854775807L || h1bVar.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jN2 != j4) {
                    jN2 = ((bfa) h1bVar.get(tym.c(h1bVar, Long.valueOf(jN2), true))).e;
                }
                j = jN2;
            }
            long j14 = efaVar.u;
            vljVar = new vlj(j6, jC0, j14, j14, 0L, j, true, false, true, j06Var, i(), null);
        }
        n(vljVar);
    }
}
