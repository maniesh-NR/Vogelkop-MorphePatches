package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fb6 extends l73 {
    public qb7 A;
    public pl6 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public wa6 G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public qjd O;
    public ljd P;
    public final boolean h;
    public final bd6 i;
    public final k5o j;
    public final ir5 k;
    public final em7 l;
    public final i06 m;
    public final r9i n;
    public final short o;
    public final int p;
    public final ro9 q;
    public final v1g r;
    public final xm5 s;
    public final Object t;
    public final SparseArray u;
    public final bb6 v;
    public final bb6 w;
    public final ole x;
    public final xsc y;
    public ed6 z;

    static {
        rjd.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [bb6] */
    /* JADX WARN: Type inference failed for: r2v11, types: [bb6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, short] */
    public fb6(qjd qjdVar, bd6 bd6Var, v1g v1gVar, k5o k5oVar, ir5 ir5Var, em7 em7Var, i06 i06Var, long j, long j2) {
        this.O = qjdVar;
        this.P = qjdVar.d;
        mjd mjdVar = qjdVar.b;
        mjdVar.getClass();
        Uri uri = mjdVar.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = bd6Var;
        this.r = v1gVar;
        this.j = k5oVar;
        this.l = em7Var;
        this.m = i06Var;
        this.o = (int) j;
        this.p = (int) j2;
        this.k = ir5Var;
        this.n = new r9i((byte) 6);
        final byte b = 0;
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new ole(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new xm5(this);
        this.y = new d06(this);
        this.v = new Runnable(this) { // from class: bb6
            public final /* synthetic */ fb6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                fb6 fb6Var = this.b;
                switch (b2) {
                    case 0:
                        fb6Var.A();
                        break;
                    default:
                        try {
                            fb6Var.y(false);
                            break;
                        } catch (Exception e) {
                            fb6Var.C = new IOException(e);
                        }
                }
            }
        };
        final byte b2 = 1;
        this.w = new Runnable(this) { // from class: bb6
            public final /* synthetic */ fb6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                fb6 fb6Var = this.b;
                switch (b22) {
                    case 0:
                        fb6Var.A();
                        break;
                    default:
                        try {
                            fb6Var.y(false);
                            break;
                        } catch (Exception e) {
                            fb6Var.C = new IOException(e);
                        }
                }
            }
        };
    }

    public static boolean u(j9g j9gVar) {
        List list = j9gVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((jr) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.q()) {
            return;
        }
        if (this.A.s()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        z4o.D(uri, "The uri must be set.");
        w1g w1gVar = new w1g(this.z, new nd6(uri, 1, null, map, 0L, -1L, null, 1), 4, this.r);
        xm5 xm5Var = this.s;
        this.m.getClass();
        this.A.C(w1gVar, xm5Var, 3);
    }

    @Override // defpackage.l73
    public final boolean a(qjd qjdVar) {
        mjd mjdVar = i().b;
        mjdVar.getClass();
        mjd mjdVar2 = qjdVar.b;
        return mjdVar2 != null && mjdVar2.a.equals(mjdVar.a) && mjdVar2.e.equals(mjdVar.e) && Objects.equals(mjdVar2.c, mjdVar.c);
    }

    @Override // defpackage.l73
    public final nkd c(jrd jrdVar, l45 l45Var, long j) {
        int iIntValue = ((Integer) jrdVar.a).intValue() - this.N;
        ro9 ro9VarB = b(jrdVar);
        am7 am7Var = new am7(this.d.c, 0, jrdVar);
        int i = this.N + iIntValue;
        wa6 wa6Var = this.G;
        pl6 pl6Var = this.B;
        long j2 = this.K;
        fjg fjgVar = this.g;
        fjgVar.getClass();
        ab6 ab6Var = new ab6(i, wa6Var, this.n, iIntValue, this.j, pl6Var, this.l, am7Var, this.m, ro9VarB, j2, this.y, l45Var, this.k, this.x, fjgVar);
        this.u.put(i, ab6Var);
        return ab6Var;
    }

    @Override // defpackage.l73
    public final synchronized qjd i() {
        return this.O;
    }

    @Override // defpackage.l73
    public final void k() {
        this.y.maybeThrowError();
    }

    @Override // defpackage.l73
    public final void m(pl6 pl6Var) {
        this.B = pl6Var;
        Looper looperMyLooper = Looper.myLooper();
        fjg fjgVar = this.g;
        fjgVar.getClass();
        em7 em7Var = this.l;
        em7Var.c(looperMyLooper, fjgVar);
        em7Var.a();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new qb7("DashMediaSource");
        this.D = tym.p(null);
        A();
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        ab6 ab6Var = (ab6) nkdVar;
        cjg cjgVar = ab6Var.m;
        cjgVar.i = true;
        cjgVar.d.removeCallbacksAndMessages(null);
        for (b05 b05Var : ab6Var.r) {
            b05Var.o(ab6Var);
        }
        ab6Var.q = null;
        this.u.remove(ab6Var.a);
    }

    @Override // defpackage.l73
    public final void q() {
        this.H = false;
        this.z = null;
        qb7 qb7Var = this.A;
        if (qb7Var != null) {
            qb7Var.y((usc) null);
            this.A = null;
        }
        ljd ljdVar = i().d;
        synchronized (this) {
            this.P = ljdVar;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.u.clear();
        r9i r9iVar = this.n;
        ((HashMap) r9iVar.b).clear();
        ((HashMap) r9iVar.c).clear();
        ((HashMap) r9iVar.d).clear();
        this.l.release();
    }

    @Override // defpackage.l73
    public final synchronized void t(qjd qjdVar) {
        this.O = qjdVar;
        this.P = qjdVar.d;
    }

    public final void v() {
        boolean z;
        qb7 qb7Var = this.A;
        zy9 zy9Var = new zy9(this);
        synchronized (z5i.t) {
            z = z5i.u;
        }
        if (z) {
            zy9Var.N();
            return;
        }
        if (qb7Var == null) {
            qb7Var = new qb7("SntpClient");
        }
        qb7Var.C(new avj((byte) 0), new eb6(zy9Var, (byte) 1), 1);
    }

    public final void w(w1g w1gVar, long j, long j2) {
        long j3 = w1gVar.a;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        this.m.getClass();
        this.q.x(bscVar, w1gVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        w7d.r("Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(boolean r43) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb6.y(boolean):void");
    }

    public final void z(qsh qshVar, v1g v1gVar) {
        ed6 ed6Var = this.z;
        Uri uri = Uri.parse((String) qshVar.c);
        Map map = Collections.EMPTY_MAP;
        z4o.D(uri, "The uri must be set.");
        this.A.C(new w1g(ed6Var, new nd6(uri, 1, null, map, 0L, -1L, null, 1), 5, v1gVar), new eb6(this, (byte) 0), 1);
    }
}
