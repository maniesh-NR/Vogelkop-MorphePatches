package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class tlc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wlc b;
    public final /* synthetic */ fh9 c;

    public /* synthetic */ tlc(wlc wlcVar, fh9 fh9Var, byte b) {
        this.a = b;
        this.b = wlcVar;
        this.c = fh9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        fh9 fh9Var = this.c;
        wlc wlcVar = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                wlcVar.d.Q(oskVar, fh9Var);
                break;
            default:
                wlcVar.j.X(oskVar, fh9Var);
                break;
        }
        return Unit.a;
    }
}
