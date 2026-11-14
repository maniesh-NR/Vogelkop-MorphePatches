package defpackage;

import android.os.Handler;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class bjg implements hyl {
    public final uhi a;
    public final i16 b = new i16((byte) 18);
    public final uxd c = new uxd(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ cjg e;

    public bjg(cjg cjgVar, l45 l45Var) {
        this.e = cjgVar;
        this.a = new uhi(l45Var, null, null);
    }

    @Override // defpackage.hyl
    public final void a(long j, int i, int i2, int i3, gyl gylVar) {
        long jI;
        long jQ;
        this.a.a(j, i, i2, i3, gylVar);
        while (this.a.x(false)) {
            uxd uxdVar = this.c;
            uxdVar.i();
            if (this.a.C(this.b, uxdVar, 0, false) == -4) {
                uxdVar.l();
            } else {
                uxdVar = null;
            }
            if (uxdVar != null) {
                long j2 = uxdVar.g;
                lxd lxdVarF = this.e.c.f(uxdVar);
                if (lxdVarF != null) {
                    uc8 uc8Var = (uc8) lxdVarF.a[0];
                    String str = uc8Var.a;
                    String str2 = uc8Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jQ = tym.Q(new String(uc8Var.e, StandardCharsets.UTF_8));
                        } catch (s1g unused) {
                            jQ = -9223372036854775807L;
                        }
                        if (jQ != -9223372036854775807L) {
                            ajg ajgVar = new ajg(j2, jQ);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, ajgVar));
                        }
                    }
                }
            }
        }
        uhi uhiVar = this.a;
        rhi rhiVar = uhiVar.a;
        synchronized (uhiVar) {
            int i4 = uhiVar.s;
            jI = i4 == 0 ? -1L : uhiVar.i(i4);
        }
        rhiVar.a(jI);
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        this.a.b(g1gVar, i, 0);
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        return this.a.d(oc6Var, i, z);
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
        this.a.g(oj9Var);
    }
}
