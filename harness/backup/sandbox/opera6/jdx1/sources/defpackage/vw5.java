package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class vw5 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw5 b;

    public /* synthetic */ vw5(xw5 xw5Var, byte b) {
        this.a = b;
        this.b = xw5Var;
    }

    public final Object invoke() throws pxb {
        r17 r17Var;
        byte b = this.a;
        xw5 xw5Var = this.b;
        switch (b) {
            case 0:
                ui6.b0(xw5Var);
                break;
            case 1:
                xw5Var.w.e(true);
                break;
            case 2:
                xw5Var.w.a(true);
                break;
            case 3:
                xw5Var.w.c();
                break;
            case 4:
                ui6.b0(xw5Var);
                break;
            case 5:
                xw5Var.w.o();
                break;
            case 6:
                xw5Var.s.w.b.r.a(xw5Var.x.e);
                break;
            default:
                gbc gbcVar = xw5Var.s;
                kg9 kg9Var = xw5Var.y;
                boolean z = xw5Var.t;
                if (!gbcVar.b()) {
                    kg9.a(kg9Var);
                } else if (!z && (r17Var = gbcVar.c) != null) {
                    r17Var.b();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
