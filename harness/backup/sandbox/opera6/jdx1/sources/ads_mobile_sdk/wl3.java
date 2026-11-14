package ads_mobile_sdk;

import ads_mobile_sdk.vl3;
import ads_mobile_sdk.wl3;
import defpackage.anp;
import defpackage.bql;
import defpackage.dkp;
import defpackage.glo;
import defpackage.kip;
import defpackage.mjp;
import defpackage.pkp;
import defpackage.qw8;
import defpackage.tgp;
import defpackage.xq9;
import defpackage.yjp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wl3 {
    public final dkp a;
    public final glo b;
    public final yjp c;
    public final th3 d;
    public final anp e;
    public final boolean f;
    public final long g;
    public final long h;

    public wl3(dkp dkpVar, glo gloVar, yjp yjpVar, th3 th3Var, anp anpVar, boolean z, long j, long j2) {
        this.a = dkpVar;
        this.b = gloVar;
        this.c = yjpVar;
        this.d = th3Var;
        this.e = anpVar;
        this.f = z;
        this.g = j;
        this.h = j2;
    }

    public final ef9 a() {
        ef9 ef9VarH = ef9.h(this.c.a());
        bql bqlVar = new bql((byte) 17);
        m97 m97Var = m97.a;
        n3 n3VarI = o3.i(ef9VarH, Throwable.class, bqlVar, m97Var);
        dkp dkpVar = this.a;
        Objects.requireNonNull(dkpVar);
        return g7.j(g7.i(n3VarI, new qw8(dkpVar, (byte) 9), m97Var), new pkp(this, (byte) 0), m97Var);
    }

    public final ef9 c(final int i) {
        fl0 fl0Var = fl0.EVENT_ID_PRIMARY_UPDATE_PROGRAM;
        ef9 ef9VarH = ef9.h(this.b.a());
        qw8 qw8Var = new qw8(this, (byte) 10);
        m97 m97Var = m97.a;
        ef9 ef9VarI = o3.i(o3.i(o3.i(g7.i(g7.j(g7.i(ef9VarH, qw8Var, m97Var), new pkp(this, (byte) 1), m97Var), new bql((byte) 18), m97Var), kip.class, new bql((byte) 19), m97Var), mjp.class, new bql((byte) 20), m97Var), tgp.class, new xq9() { // from class: qkp
            @Override // defpackage.xq9
            public final Object apply(Object obj) {
                wl3 wl3Var = this.a;
                if (wl3Var.f) {
                    int i2 = i;
                    if (i2 < wl3Var.g) {
                        wl3Var.e.a(new okp(wl3Var, i2, (byte) 0), wl3Var.h * ((long) Math.pow(2.0d, i2)));
                    }
                }
                return vl3.f;
            }
        }, m97Var);
        this.d.a(fl0Var, ef9VarI);
        return ef9VarI;
    }
}
