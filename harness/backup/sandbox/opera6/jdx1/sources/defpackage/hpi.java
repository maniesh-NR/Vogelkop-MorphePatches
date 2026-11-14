package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class hpi implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jpi b;

    public /* synthetic */ hpi(jpi jpiVar, byte b) {
        this.a = b;
        this.b = jpiVar;
    }

    public final Object invoke() {
        byte b = this.a;
        jpi jpiVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(jpiVar.n);
            default:
                vg9 vg9Var = jpiVar.T;
                if (!vg9Var.a.n) {
                    return null;
                }
                qg9 qg9VarY0 = vg9Var.Y0();
                if (!qg9VarY0.d()) {
                    return null;
                }
                if (qg9VarY0.g()) {
                    return vg9Var.W0(null);
                }
                vg9 vg9VarF = ui6.f0(vg9Var).l.f();
                if (vg9VarF != null) {
                    return vg9VarF.W0(ui6.d0(vg9Var));
                }
                return null;
        }
    }
}
