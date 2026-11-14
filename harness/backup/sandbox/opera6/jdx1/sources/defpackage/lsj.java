package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class lsj implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nsj b;

    public /* synthetic */ lsj(nsj nsjVar, byte b) {
        this.a = b;
        this.b = nsjVar;
    }

    public final Object invoke() {
        byte b = this.a;
        nsj nsjVar = this.b;
        switch (b) {
            case 0:
                nh4 nh4Var = nsjVar.b;
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(ctj.a);
                }
                return Boolean.TRUE;
            default:
                nh4 nh4Var2 = nsjVar.b;
                if (nh4Var2.r() instanceof c0f) {
                    p0i p0iVar2 = t0i.b;
                    nh4Var2.resumeWith(ctj.b);
                }
                return Unit.a;
        }
    }
}
