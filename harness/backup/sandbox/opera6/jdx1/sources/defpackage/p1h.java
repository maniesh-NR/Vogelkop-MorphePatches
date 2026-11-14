package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class p1h implements qp5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7m b;

    public /* synthetic */ p1h(g7m g7mVar, byte b) {
        this.a = b;
        this.b = g7mVar;
    }

    @Override // defpackage.qp5
    public final void accept(Object obj) throws Exception {
        byte b = this.a;
        g7m g7mVar = this.b;
        jo2 jo2Var = (jo2) obj;
        switch (b) {
            case 0:
                if (!jo2Var.a.f.f) {
                    ((Executor) g7mVar.c).execute(new q1h(g7mVar, jo2Var, (byte) 1));
                    break;
                } else {
                    jo2Var.b.close();
                    break;
                }
            default:
                if (!jo2Var.a.f.f) {
                    ((Executor) g7mVar.c).execute(new q1h(g7mVar, jo2Var, (byte) 0));
                    break;
                } else {
                    jo2Var.b.close();
                    break;
                }
        }
    }
}
