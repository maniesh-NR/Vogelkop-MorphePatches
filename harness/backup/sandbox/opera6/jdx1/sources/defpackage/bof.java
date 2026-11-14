package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class bof implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ xg5 b;
    public final /* synthetic */ c8e c;
    public final /* synthetic */ ue5 d;

    public /* synthetic */ bof(c8e c8eVar, ue5 ue5Var, xg5 xg5Var) {
        this.c = c8eVar;
        this.d = ue5Var;
        this.b = xg5Var;
    }

    public /* synthetic */ bof(xg5 xg5Var, c8e c8eVar, ue5 ue5Var, int i) {
        this.b = xg5Var;
        this.c = c8eVar;
        this.d = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int iIntValue = num.intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = vt9Var.K();
                    zpa zpaVar = hh5.a;
                    if (objK == zpaVar) {
                        objK = new ruj();
                        vt9Var.g0(objK);
                    }
                    ruj rujVar = (ruj) objK;
                    Object objK2 = vt9Var.K();
                    if (objK2 == zpaVar) {
                        objK2 = hyg.k((Object) null);
                        vt9Var.g0(objK2);
                    }
                    kfo.c(zsj.a.a(rujVar), gyg.P(556872377, new c39(this.c, (afe) objK2, this.d, this.b, rujVar, (byte) 3), vt9Var), vt9Var, 56);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                num.getClass();
                ic4.f(this.b, this.c, this.d, ih5Var, aoh.m(393));
                break;
        }
        return Unit.a;
    }
}
