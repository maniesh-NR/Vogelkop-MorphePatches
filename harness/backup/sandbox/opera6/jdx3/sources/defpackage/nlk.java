package defpackage;

/* loaded from: classes.dex */
public final class nlk implements tdn {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nlk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // defpackage.tdn
    public final void C() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((olk) obj).s();
                break;
            case 1:
                ocn ocnVar = (ocn) obj;
                i9c i9cVar = ocnVar.e;
                boolean zIsEnabled = ocnVar.c.c.isEnabled();
                if (zIsEnabled != i9cVar.b) {
                    i9cVar.b = zIsEnabled;
                    i9cVar.a();
                    break;
                }
                break;
            case 2:
                ((i9c) obj).c();
                break;
            case 3:
                klk klkVar = (klk) obj;
                klkVar.r(Boolean.valueOf(((ydn) klkVar.m).c.isEnabled()));
                break;
            case 4:
                c1a c1aVar = (c1a) obj;
                ydn ydnVar = (ydn) c1aVar.c;
                if (ydnVar.p().a()) {
                    nlk nlkVar = (nlk) c1aVar.h;
                    if (nlkVar != null) {
                        ydnVar.H(nlkVar);
                    }
                    c1aVar.h = null;
                    z77 z77Var = (z77) c1aVar.e;
                    b23 b23VarR = c1aVar.R();
                    z77Var.getClass();
                    z77Var.b(b23VarR, ijm.b);
                    break;
                }
                break;
            default:
                ((ggn) obj).a();
                break;
        }
    }

    @Override // defpackage.tdn
    public final void s() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((olk) obj).s();
                break;
            case 1:
                ((ocn) obj).T();
                break;
            case 2:
                ((i9c) obj).c();
                break;
        }
    }

    @Override // defpackage.tdn
    public final void t() {
        byte b = this.a;
    }
}
