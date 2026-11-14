package defpackage;

/* loaded from: classes.dex */
public final class qfe {
    public final /* synthetic */ byte a = 1;
    public final af2 b = c26.i(false);
    public final Object c;

    public qfe(m59 m59Var) {
        this.c = m59Var;
    }

    public qfe(pfe pfeVar) {
        this.c = pfeVar;
    }

    public final boolean a() {
        byte b = this.a;
        af2 af2Var = this.b;
        switch (b) {
        }
        return af2Var.b();
    }

    public final boolean b() {
        mt5 mt5Var = null;
        switch (this.a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((pfe) this.c).l((Object) null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                m59 m59Var = (m59) this.c;
                synchronized (m59Var.f) {
                    int i = m59Var.b - 1;
                    m59Var.b = i;
                    if (i == 0 && !m59Var.c) {
                        m59Var.g = na2.B((nx5) m59Var.d, null, null, new zhl((byte) 6, mt5Var, (Object) m59Var), 3);
                    }
                }
                return true;
        }
    }
}
