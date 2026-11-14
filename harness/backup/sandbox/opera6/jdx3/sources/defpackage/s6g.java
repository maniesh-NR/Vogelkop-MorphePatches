package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class s6g implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6g b;

    public /* synthetic */ s6g(t6g t6gVar, byte b) {
        this.a = b;
        this.b = t6gVar;
    }

    public final Object invoke() {
        byte b = this.a;
        gm0 gm0Var = gm0.o;
        gm0 gm0Var2 = gm0.n;
        t6g t6gVar = this.b;
        switch (b) {
            case 0:
                ((x5f) t6gVar.k).l0(gm0Var2);
                if (!xgh.s(t6gVar.h, t6gVar.i)) {
                    t6gVar.h();
                }
                break;
            case 1:
                ((x5f) t6gVar.k).l0(gm0Var);
                break;
            case 2:
                ((x5f) t6gVar.k).l0(gm0Var2);
                t6gVar.r.r(Boolean.TRUE);
                break;
            case 3:
                ((x5f) t6gVar.k).l0(gm0Var);
                break;
            default:
                ((x5f) t6gVar.k).l0(gm0Var2);
                t6gVar.r.r(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
