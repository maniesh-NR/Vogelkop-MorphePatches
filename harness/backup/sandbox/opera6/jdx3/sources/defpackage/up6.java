package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class up6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cq6 b;

    public /* synthetic */ up6(cq6 cq6Var, byte b) {
        this.a = b;
        this.b = cq6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        mt5 mt5Var = null;
        cq6 cq6Var = this.b;
        switch (b) {
            case 0:
                for (koc kocVar : (List) cq6Var.c.q.a.getValue()) {
                    if (kocVar.b) {
                        o0i o0iVar = cq6Var.f;
                        na2.B(o0iVar.a, o0iVar.c, (rx5) null, new p71(o0iVar, kocVar.a, mt5Var, (byte) 20), 2);
                    }
                }
                break;
            default:
                ti9 ti9Var = cq6Var.d;
                jdj jdjVar = ti9Var.q;
                nx5 nx5Var = cq6Var.a;
                w7d.i(jdjVar, nx5Var, new wp6(cq6Var, mt5Var, (byte) 1));
                w7d.i(ti9Var.o, nx5Var, new wp6(cq6Var, mt5Var, b2));
                w7d.i(ti9Var.p, nx5Var, new wp6(cq6Var, mt5Var, (byte) 3));
                break;
        }
    }
}
