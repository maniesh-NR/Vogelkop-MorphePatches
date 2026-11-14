package defpackage;

import android.text.TextUtils;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class a9d extends l7n implements abh, g8d {
    public final af3 b;
    public final xb c;
    public final slk d;
    public final jtg e;
    public final fmk f;
    public final ru9 g;
    public final orm h;
    public final z77 i;
    public final ysj j;
    public final yug k;
    public final qb7 l;
    public final ulp m = u55.Ro;
    public final nak n;
    public final nak o;
    public final nak p;
    public final rlh q;
    public wvg r;
    public uah s;
    public boolean t;
    public d3k u;
    public d3k v;
    public final d8d w;

    public a9d(af3 af3Var, xb xbVar, slk slkVar, jtg jtgVar, fmk fmkVar, ru9 ru9Var, orm ormVar, z77 z77Var, ysj ysjVar, yug yugVar, qb7 qb7Var) {
        this.b = af3Var;
        this.c = xbVar;
        this.d = slkVar;
        this.e = jtgVar;
        this.f = fmkVar;
        this.g = ru9Var;
        this.h = ormVar;
        this.i = z77Var;
        this.j = ysjVar;
        this.k = yugVar;
        this.l = qb7Var;
        nak nakVarF = z4o.f((Object) null);
        this.n = nakVarF;
        nak nakVarF2 = z4o.f((Object) null);
        this.o = nakVarF2;
        nak nakVarF3 = z4o.f(Boolean.valueOf(ru9Var.a.getBoolean("vpn_pro.kill_switch.on", false)));
        this.p = nakVarF3;
        this.q = a26.o0(nb6.l(nakVarF, nakVarF3, nakVarF2, new z8d((byte) 0, null, this)), p7n.a(this), aej.a, new v8d((u8d) null, lyi.a, (Integer) null));
        this.r = (wvg) slkVar.i.g();
        d8d d8dVar = new d8d(this, (byte) 1);
        this.w = d8dVar;
        slkVar.i.k(d8dVar);
    }

    @Override // defpackage.abh
    public final void D() {
        g();
    }

    @Override // defpackage.g8d
    public final void J() {
        f();
    }

    @Override // defpackage.g8d
    public final String Q() {
        hmk hmkVar;
        jmk jmkVar = this.r.h;
        if (jmkVar == null || (hmkVar = jmkVar.c) == null) {
            return null;
        }
        return hmkVar.a;
    }

    @Override // defpackage.abh
    public final void a(bbh bbhVar) {
        hmk hmkVar;
        jmk jmkVar = this.r.h;
        String str = (jmkVar == null || (hmkVar = jmkVar.c) == null) ? null : hmkVar.b;
        if (str != null) {
            a1b a1bVarU = bbhVar.a.u(0);
            while (a1bVarU.hasNext()) {
                uah uahVar = (uah) a1bVarU.next();
                if (TextUtils.equals(uahVar.a, str)) {
                    this.s = uahVar;
                    g();
                    return;
                }
            }
        }
        g();
    }

    public final void e() {
        this.d.i.p(this.w);
    }

    public final void f() {
        byte b = 1;
        this.t = true;
        g();
        d3k d3kVar = this.u;
        mt5 mt5Var = null;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.u = na2.B(p7n.a(this), (CoroutineContext) null, (rx5) null, new x8d(this, mt5Var, b), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9d.g():void");
    }

    @Override // defpackage.g8d
    public final void j(jg4 jg4Var) {
        ((dpf) this.c.e.g()).a(new y8d(jg4Var, (byte) 0));
    }

    @Override // defpackage.g8d
    public final String u() {
        uah uahVar = this.s;
        if (uahVar != null) {
            return uahVar.a;
        }
        qp2.n("Required value was null.");
        return null;
    }
}
