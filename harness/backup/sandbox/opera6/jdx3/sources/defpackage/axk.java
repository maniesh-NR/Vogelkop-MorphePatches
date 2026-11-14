package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class axk implements ywk {
    public final qlk a;
    public final oml b;
    public final zwk c;
    public boolean d;
    public boolean e;

    public axk(qlk qlkVar, umi umiVar, zwk zwkVar) {
        this.a = qlkVar;
        this.c = zwkVar;
        oml omlVar = new oml(umiVar.d(new qlk(this, (byte) 13)));
        this.b = omlVar;
        omlVar.b(null, 2L, TimeUnit.SECONDS, null);
        zwkVar.F(this);
    }

    @Override // defpackage.ywk
    public final void G(int i) {
        this.d = true;
        if (this.e) {
            this.b.cancel(false);
            this.c.H(this);
            this.a.run();
        }
    }

    @Override // defpackage.ywk
    public final void c0() {
        this.e = true;
        if (this.d) {
            this.b.cancel(false);
            this.c.H(this);
            this.a.run();
        }
    }
}
