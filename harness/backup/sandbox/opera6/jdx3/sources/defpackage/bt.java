package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class bt implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ct b;

    public /* synthetic */ bt(ct ctVar, byte b) {
        this.a = b;
        this.b = ctVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ct ctVar = this.b;
        switch (b) {
            case 0:
                ju juVarG0 = ctVar.G0();
                qb7 qb7Var = juVarG0.c;
                if (qb7Var.v((st[]) obj)) {
                    qb7Var.E(juVarG0.k);
                    juVarG0.f();
                }
                break;
            default:
                orm ormVar = (orm) ctVar.G0().e.b;
                String strT = tw2.t((gt) obj);
                x5f x5fVar = (x5f) ormVar;
                if (x5fVar.h) {
                    x5fVar.j(0, strT, false);
                }
                break;
        }
        return Unit.a;
    }
}
