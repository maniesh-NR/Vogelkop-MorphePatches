package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class uq6 implements osc {
    public static final cl6 o = new cl6((byte) 27);
    public final qq6 a;
    public final mfa b;
    public final i06 c;
    public ro9 f;
    public qb7 g;
    public Handler h;
    public ffa i;
    public ifa j;
    public Uri k;
    public efa l;
    public boolean m;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long n = -9223372036854775807L;

    public uq6(qq6 qq6Var, i06 i06Var, mfa mfaVar) {
        this.a = qq6Var;
        this.b = mfaVar;
        this.c = i06Var;
    }

    public final efa a(boolean z, Uri uri) {
        HashMap map = this.d;
        efa efaVar = ((tq6) map.get(uri)).d;
        if (efaVar != null && z) {
            if (!uri.equals(this.k)) {
                List list = this.j.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((hfa) list.get(i)).a)) {
                        efa efaVar2 = this.l;
                        if (efaVar2 == null || !efaVar2.o) {
                            this.k = uri;
                            tq6 tq6Var = (tq6) map.get(uri);
                            efa efaVar3 = tq6Var.d;
                            if (efaVar3 == null || !efaVar3.o) {
                                tq6Var.f(b(uri));
                            } else {
                                this.l = efaVar3;
                                this.i.v(efaVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            tq6 tq6Var2 = (tq6) map.get(uri);
            efa efaVar4 = tq6Var2.d;
            if (!tq6Var2.k) {
                tq6Var2.k = true;
                if (efaVar4 != null && !efaVar4.o) {
                    tq6Var2.c(true);
                }
            }
        }
        return efaVar;
    }

    public final Uri b(Uri uri) {
        afa afaVar;
        efa efaVar = this.l;
        if (efaVar == null || !efaVar.v.e || (afaVar = (afa) efaVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(afaVar.b));
        int i = afaVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        byte b;
        tq6 tq6Var = (tq6) this.d.get(uri);
        if (tq6Var.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, tym.c0(tq6Var.d.u));
        efa efaVar = tq6Var.d;
        return efaVar.o || (b = efaVar.d) == 2 || b == 1 || tq6Var.e + jMax > jElapsedRealtime;
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        w1g w1gVar = (w1g) rscVar;
        long j3 = w1gVar.a;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.c.getClass();
        this.f.x(bscVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        ifa ifaVar;
        w1g w1gVar = (w1g) rscVar;
        jfa jfaVar = (jfa) w1gVar.f;
        boolean z = jfaVar instanceof efa;
        if (z) {
            String str = jfaVar.a;
            ifa ifaVar2 = ifa.n;
            Uri uri = Uri.parse(str);
            nj9 nj9Var = new nj9();
            nj9Var.a = "0";
            nj9Var.l = dzd.p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new hfa(uri, new oj9(nj9Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            ifaVar = new ifa("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            ifaVar = (ifa) jfaVar;
        }
        this.j = ifaVar;
        this.k = ((hfa) ifaVar.e.get(0)).a;
        this.e.add(new sq6(this));
        List list2 = ifaVar.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.d.put(uri2, new tq6(this, uri2));
        }
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        tq6 tq6Var = (tq6) this.d.get(this.k);
        if (z) {
            tq6Var.g((efa) jfaVar, bscVar);
        } else {
            tq6Var.c(false);
        }
        this.c.getClass();
        this.f.y(bscVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
        this.f.B(bscVar, w1gVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.osc
    public final psc u(rsc rscVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        w1g w1gVar = (w1g) rscVar;
        long j3 = w1gVar.a;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        byte b = w1gVar.c;
        this.c.getClass();
        if ((iOException instanceof s1g) || (iOException instanceof FileNotFoundException) || (iOException instanceof ioa) || (iOException instanceof vsc)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof id6) && ((id6) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L;
        this.f.A(bscVar, b, iOException, z);
        return z ? qb7.g : new psc(0, jMin);
    }
}
