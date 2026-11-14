package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class j99 implements hxl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j99(Object obj, byte b) {
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

    private final void f(int i) {
    }

    @Override // defpackage.hxl
    public final void i() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((k99) obj).b.c();
                break;
            case 2:
                swf swfVar = (swf) obj;
                bf9 bf9Var = swfVar.c;
                swfVar.e = wxe.C(bf9Var.t() && bf9Var.r() >= 2 && swfVar.d.i("my_flow_visible"));
                break;
        }
    }

    @Override // defpackage.hxl
    public final void x(int i) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                if (i == 0) {
                    ((rma) obj).l();
                    break;
                }
                break;
            case 2:
                swf swfVar = (swf) obj;
                bf9 bf9Var = swfVar.c;
                if (bf9Var.t() && bf9Var.r() >= 2 && swfVar.d.i("my_flow_visible")) {
                    z = true;
                }
                swfVar.e = wxe.C(z);
                break;
            default:
                if (i < 2) {
                    ((myf) obj).b(0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hxl
    public final void z() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                myf myfVar = (myf) this.b;
                String str = myfVar.g;
                bf9 bf9Var = myfVar.b;
                if (str != null) {
                    if (bf9Var.l(str) == null) {
                        myfVar.b(0);
                        break;
                    }
                } else {
                    List listU = bf9Var.u();
                    if (!listU.isEmpty()) {
                        myfVar.c(listU);
                        break;
                    }
                }
                break;
        }
    }
}
