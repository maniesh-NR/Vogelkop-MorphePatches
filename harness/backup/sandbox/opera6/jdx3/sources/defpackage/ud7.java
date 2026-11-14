package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class ud7 implements mo7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ud7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wd7 wd7Var = (wd7) obj;
                String str = ((cj9) wd7Var.e.i()).a;
                if (str != null) {
                    hd hdVar = (hd) wd7Var.c.get();
                    if (hdVar.b) {
                        y55 y55Var = (y55) hdVar.d;
                        u56 u56VarW = y55.w();
                        new zj0(y55Var, u56VarW);
                        u56VarW.x(8, str);
                        if (!((mgh) hdVar.g).c(u56VarW)) {
                            new rml(Unit.a, (umi) hdVar.c).a(new o5f((Object) hdVar, (byte) 16)).m((qie) hdVar.f);
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((p0c) obj).a();
                break;
            case 2:
                dyf dyfVar = (dyf) obj;
                if (!z) {
                    dyfVar.d();
                    dyfVar.c();
                    break;
                }
                break;
            default:
                pom pomVar = (pom) obj;
                int i = hom.t(pomVar.a).c().b;
                if (i != 0) {
                    pomVar.T(i);
                    pomVar.S();
                    break;
                }
                break;
        }
    }
}
