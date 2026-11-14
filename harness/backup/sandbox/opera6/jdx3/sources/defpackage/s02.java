package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class s02 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u02 b;
    public final /* synthetic */ gka c;

    public /* synthetic */ s02(u02 u02Var, gka gkaVar, byte b) {
        this.a = b;
        this.b = u02Var;
        this.c = gkaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gka gkaVar = this.c;
        u02 u02Var = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                ((g7m) u02Var.f).g(zBooleanValue);
                gkaVar.n(new sw7(zBooleanValue ? new uja() : new qja(new sja(rja.UNKNOWN))));
                break;
            default:
                ((g7m) u02Var.f).g(zBooleanValue);
                gkaVar.n(new sw7(zBooleanValue ? new uja() : new qja(new sja(rja.UNKNOWN))));
                break;
        }
        return Unit.a;
    }
}
