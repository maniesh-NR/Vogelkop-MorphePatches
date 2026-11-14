package defpackage;

/* loaded from: classes.dex */
public final class ege implements mb9 {
    public final zb9 a;
    public String b;
    public boolean c;
    public boolean d;
    public long e;
    public final /* synthetic */ fge f;

    public ege(fge fgeVar, String str) {
        this.f = fgeVar;
        zb9 zb9Var = new zb9(0L, System.currentTimeMillis(), str);
        zb9Var.e = "";
        zb9Var.f = "";
        this.a = zb9Var;
        ha2 ha2Var = fgeVar.y;
        ha2Var.H(ha2Var.a.size(), zb9Var);
        fgeVar.x.d.b(this);
    }

    public final void a() {
        b();
        rxh rxhVar = new rxh(2132019068);
        fge fgeVar = this.f;
        fgeVar.getClass();
        fgeVar.I0(new glj(rxhVar, 5000));
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        fge fgeVar = this.f;
        fgeVar.y.V(this.a);
        fgeVar.x.d.c(this);
    }

    @Override // defpackage.mb9
    public final void f(int i, int i2) {
    }

    @Override // defpackage.mb9
    public final void h(int i, int i2) {
        boolean z = this.d;
        int i3 = 0;
        fge fgeVar = this.f;
        if (z) {
            while (i3 < i2) {
                if (((hb9) fgeVar.x.c.get(i + i3)).b == this.e) {
                    b();
                    return;
                }
                i3++;
            }
            return;
        }
        if (this.b != null) {
            String strU = null;
            while (i3 < i2) {
                hb9 hb9Var = (hb9) fgeVar.x.c.get(i + i3);
                if ((hb9Var instanceof ib9) && ((ib9) hb9Var).e.equals(this.b)) {
                    if (strU == null) {
                        strU = fgeVar.t.a.u();
                    }
                    if (hb9Var.d.equals(strU)) {
                        b();
                        return;
                    }
                }
                i3++;
            }
        }
    }

    @Override // defpackage.mb9
    public final void m(int i) {
    }
}
