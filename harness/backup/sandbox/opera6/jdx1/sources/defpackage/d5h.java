package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d5h implements rsc {
    public final Uri a;
    public final vbk b;
    public final l45 c;
    public final g5h d;
    public final rj5 e;
    public volatile boolean g;
    public long i;
    public nd6 j;
    public hyl k;
    public boolean l;
    public final /* synthetic */ g5h m;
    public final hp2 f = new hp2((byte) 9, false);
    public boolean h = true;

    public d5h(g5h g5hVar, Uri uri, ed6 ed6Var, l45 l45Var, g5h g5hVar2, rj5 rj5Var) {
        this.m = g5hVar;
        this.a = uri;
        this.b = new vbk(ed6Var);
        this.c = l45Var;
        this.d = g5hVar2;
        this.e = rj5Var;
        bsc.g.getAndIncrement();
        this.j = a(0L, null);
    }

    public final nd6 a(long j, String str) {
        Map mapC = g5h.R;
        if (str != null && !str.startsWith("W/")) {
            mapC = l1b.d().f(mapC).e("If-Range", str).c();
        }
        Map map = Collections.EMPTY_MAP;
        String str2 = this.m.i;
        Uri uri = this.a;
        z4o.D(uri, "The uri must be set.");
        return new nd6(uri, 1, null, mapC, j, -1L, str2, 6);
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
        this.g = true;
    }

    @Override // defpackage.rsc
    public final void load() {
        oc6 huaVar;
        cn8 cn8Var;
        int i;
        int iB = 0;
        String str = null;
        while (iB == 0 && !this.g) {
            try {
                long j = this.f.b;
                nd6 nd6VarA = a(j, str);
                this.j = nd6VarA;
                long jB = this.b.b(nd6VarA);
                if (this.g) {
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jB != -1) {
                    jB += j;
                    g5h g5hVar = this.m;
                    g5hVar.r.post(new z4h(g5hVar, (byte) 0));
                }
                long j2 = jB;
                this.m.t = jua.d(this.b.a.getResponseHeaders());
                vbk vbkVar = this.b;
                jua juaVar = this.m.t;
                if (juaVar == null || (i = juaVar.f) == -1) {
                    huaVar = vbkVar;
                } else {
                    huaVar = new hua(vbkVar, i, this);
                    hyl hylVarQ = this.m.q(new f5h(0, true));
                    this.k = hylVarQ;
                    hylVarQ.g(g5h.S);
                }
                this.c.K(huaVar, this.a, this.b.a.getResponseHeaders(), j, j2, this.d);
                if (this.m.t != null && (cn8Var = (cn8) this.c.b) != null && (cn8Var instanceof vae)) {
                    ((vae) cn8Var).s = true;
                }
                if (this.h) {
                    l45 l45Var = this.c;
                    long j3 = this.i;
                    cn8 cn8Var2 = (cn8) l45Var.b;
                    cn8Var2.getClass();
                    cn8Var2.seek(j, j3);
                    this.h = false;
                }
                while (iB == 0 && !this.g) {
                    try {
                        rj5 rj5Var = this.e;
                        synchronized (rj5Var) {
                            while (!rj5Var.b) {
                                rj5Var.a.getClass();
                                rj5Var.wait();
                            }
                        }
                        l45 l45Var2 = this.c;
                        hp2 hp2Var = this.f;
                        cn8 cn8Var3 = (cn8) l45Var2.b;
                        cn8Var3.getClass();
                        lp6 lp6Var = (lp6) l45Var2.c;
                        lp6Var.getClass();
                        iB = cn8Var3.b(lp6Var, hp2Var);
                        long jC = this.c.C();
                        if (jC > this.m.j + j) {
                            rj5 rj5Var2 = this.e;
                            synchronized (rj5Var2) {
                                rj5Var2.b = false;
                            }
                            g5h g5hVar2 = this.m;
                            g5hVar2.r.post(g5hVar2.q);
                            j = jC;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iB == 1) {
                    iB = 0;
                } else if (this.c.C() != -1) {
                    this.f.b = this.c.C();
                }
                oup.P(this.b);
            } finally {
                if (iB != 1 && this.c.C() != -1) {
                    this.f.b = this.c.C();
                }
                oup.P(this.b);
            }
        }
    }
}
