package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class f3b implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g3b b;

    public /* synthetic */ f3b(g3b g3bVar, byte b) {
        this.a = b;
        this.b = g3bVar;
    }

    public final Object invoke() {
        byte b = this.a;
        g3b g3bVar = this.b;
        switch (b) {
            case 0:
                g3bVar.g0();
                cqp.r0((ua7) g3bVar.u, -1);
                break;
            default:
                g3bVar.g0();
                cqp.r0((ua7) g3bVar.u, -1);
                break;
        }
        return Unit.a;
    }
}
