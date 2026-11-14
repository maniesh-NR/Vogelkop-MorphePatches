package ads_mobile_sdk;

import defpackage.bkp;
import defpackage.vkp;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class m41 implements bkp {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;

    public /* synthetic */ m41(d91 d91Var, Object obj, byte b) {
        this.c = b;
        this.a = obj;
        this.b = d91Var;
    }

    public /* synthetic */ m41(Object obj, Object obj2, byte b) {
        this.c = b;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.bkp
    public final Unit a() {
        switch (this.c) {
            case 0:
                bk1 bk1Var = (bk1) this.a;
                vz vzVar = (vz) this.b;
                bk1Var.getClass();
                bk1Var.p = vzVar;
                return Unit.a;
            case 1:
                g0 g0Var = (g0) this.a;
                Set set = (Set) this.b;
                g0Var.getClass();
                synchronized (g0Var) {
                    g0Var.h.addAll(set);
                }
                return Unit.a;
            case 2:
                ((vkp) this.a).a((d91) this.b);
                return Unit.a;
            case 3:
                ((vkp) this.a).a((ws) this.b);
                return Unit.a;
            case 4:
                yc2 yc2Var = (yc2) this.a;
                ae2 ae2Var = (ae2) this.b;
                yc2Var.getClass();
                yc2Var.g = ae2Var;
                return Unit.a;
            default:
                uo3 uo3Var = (uo3) this.a;
                d91 d91Var = (d91) this.b;
                uo3Var.getClass();
                uo3Var.r = d91Var;
                return Unit.a;
        }
    }
}
