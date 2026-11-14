package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class i22 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x22 b;

    public /* synthetic */ i22(x22 x22Var, byte b) {
        this.a = b;
        this.b = x22Var;
    }

    public final Object invoke() {
        r22 r22Var;
        byte b = this.a;
        x22 x22Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                if (!x22Var.m.a && x22Var.l.j.hasFocus() && (r22Var = x22Var.n) != null) {
                    r22Var.h().b.e().J0().b.requestFocus();
                }
                break;
            default:
                r22 r22Var2 = x22Var.n;
                if (r22Var2 != null) {
                    r22.p(r22Var2, false, 3);
                }
                break;
        }
        return Unit.a;
    }
}
