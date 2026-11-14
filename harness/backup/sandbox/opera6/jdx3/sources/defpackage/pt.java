package defpackage;

/* loaded from: classes.dex */
public final class pt extends zrj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pt(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(na3 na3Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (u59.g == ((qt) obj)) {
                    u59.g = null;
                    break;
                }
                break;
            case 1:
                ((o93) obj).b((i == 0 || i == 1) ? hjm.a : hjm.b, i);
                break;
            case 2:
                ((gtj) obj).f = false;
                break;
            default:
                ami amiVar = (ami) obj;
                mgh mghVar = (mgh) amiVar.d;
                if (mghVar != null) {
                    mghVar.f();
                }
                amiVar.c = null;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ void b(na3 na3Var) {
        switch (this.a) {
            case 2:
                c((asj) na3Var);
                break;
            default:
                super.b(na3Var);
                break;
        }
    }

    public final void c(asj asjVar) {
        switch (this.a) {
            case 2:
                ((gtj) this.b).f = true;
                break;
        }
    }
}
