package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class tq6 implements osc {
    public final Uri a;
    public final qb7 b = new qb7("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final ed6 c;
    public efa d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public IOException j;
    public boolean k;
    public final /* synthetic */ uq6 l;

    public tq6(uq6 uq6Var, Uri uri) {
        this.l = uq6Var;
        this.a = uri;
        this.c = ((bd6) uq6Var.a.b).createDataSource();
    }

    public final boolean a(long j) {
        this.h = SystemClock.elapsedRealtime() + j;
        uq6 uq6Var = this.l;
        if (!this.a.equals(uq6Var.k)) {
            return true;
        }
        List list = uq6Var.j.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            tq6 tq6Var = (tq6) uq6Var.d.get(((hfa) list.get(i)).a);
            tq6Var.getClass();
            if (jElapsedRealtime > tq6Var.h) {
                Uri uri = tq6Var.a;
                uq6Var.k = uri;
                tq6Var.f(uq6Var.b(uri));
                return true;
            }
        }
        return false;
    }

    public final Uri b() {
        efa efaVar = this.d;
        Uri uri = this.a;
        if (efaVar != null) {
            dfa dfaVar = efaVar.v;
            if (dfaVar.a != -9223372036854775807L || dfaVar.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                efa efaVar2 = this.d;
                if (efaVar2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(efaVar2.k + efaVar2.r.size()));
                    efa efaVar3 = this.d;
                    if (efaVar3.n != -9223372036854775807L) {
                        h1b h1bVar = efaVar3.s;
                        int size = h1bVar.size();
                        if (!h1bVar.isEmpty() && ((zea) sfe.c0(h1bVar)).m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                dfa dfaVar2 = this.d.v;
                if (dfaVar2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", dfaVar2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        f(z ? b() : this.a);
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        w1g w1gVar = (w1g) rscVar;
        long j3 = w1gVar.a;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        uq6 uq6Var = this.l;
        uq6Var.c.getClass();
        uq6Var.f.x(bscVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        uq6 uq6Var = this.l;
        v1g v1gVarD = uq6Var.b.d(uq6Var.j, this.d);
        Map map = Collections.EMPTY_MAP;
        z4o.D(uri, "The uri must be set.");
        w1g w1gVar = new w1g(this.c, new nd6(uri, 1, null, map, 0L, -1L, null, 1), 4, v1gVarD);
        this.b.C(w1gVar, this, uq6Var.c.k(w1gVar.c));
    }

    public final void f(Uri uri) {
        this.h = 0L;
        if (this.i) {
            return;
        }
        qb7 qb7Var = this.b;
        if (qb7Var.s() || qb7Var.q()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (jElapsedRealtime >= j) {
            e(uri);
        } else {
            this.i = true;
            this.l.h.postDelayed(new fh4(this, uri, (byte) 19), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.efa r72, defpackage.bsc r73) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq6.g(efa, bsc):void");
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        w1g w1gVar = (w1g) rscVar;
        jfa jfaVar = (jfa) w1gVar.f;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        if (jfaVar instanceof efa) {
            g((efa) jfaVar, bscVar);
            this.l.f.y(bscVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s1g s1gVarG = s1g.g("Loaded playlist has unexpected type.", null);
            this.j = s1gVarG;
            this.l.f.A(bscVar, 4, s1gVarG, true);
        }
        this.l.c.getClass();
    }

    @Override // defpackage.osc
    public final void r(rsc rscVar, long j, long j2, int i) {
        bsc bscVar;
        w1g w1gVar = (w1g) rscVar;
        if (i == 0) {
            long j3 = w1gVar.a;
            bscVar = new bsc(w1gVar.b, j);
        } else {
            long j4 = w1gVar.a;
            nd6 nd6Var = w1gVar.b;
            vbk vbkVar = w1gVar.d;
            bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        }
        this.l.f.B(bscVar, w1gVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.osc
    public final psc u(rsc rscVar, long j, long j2, IOException iOException, int i) {
        w1g w1gVar = (w1g) rscVar;
        psc pscVar = qb7.f;
        long j3 = w1gVar.a;
        byte b = w1gVar.c;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        Uri uri = vbkVar.c;
        bsc bscVar = new bsc(nd6Var, uri, vbkVar.d, j, j2, vbkVar.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof kfa;
        uq6 uq6Var = this.l;
        if (z || z2) {
            int i2 = iOException instanceof loa ? ((loa) iOException).c : Integer.MAX_VALUE;
            if (z2 || i2 == 400 || i2 == 503) {
                this.g = SystemClock.elapsedRealtime();
                c(false);
                ro9 ro9Var = uq6Var.f;
                String str = tym.a;
                ro9Var.A(bscVar, b, iOException, true);
                return pscVar;
            }
        }
        bp bpVar = new bp(iOException, i);
        Iterator it = uq6Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((nfa) it.next()).c(this.a, bpVar, false);
        }
        i06 i06Var = uq6Var.c;
        if (z3) {
            i06Var.getClass();
            long jL = i06.l(bpVar);
            pscVar = jL != -9223372036854775807L ? new psc(0, jL) : qb7.g;
        }
        boolean zA = pscVar.a();
        uq6Var.f.A(bscVar, b, iOException, !zA);
        if (!zA) {
            i06Var.getClass();
        }
        return pscVar;
    }
}
