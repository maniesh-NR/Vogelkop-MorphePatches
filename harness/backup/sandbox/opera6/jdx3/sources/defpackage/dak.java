package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class dak implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nh4 b;

    public /* synthetic */ dak(nh4 nh4Var, byte b) {
        this.a = b;
        this.b = nh4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nh4 nh4Var = this.b;
        switch (b) {
            case 0:
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(Unit.a);
                    break;
                }
                break;
            default:
                p0i p0iVar2 = t0i.b;
                nh4Var.resumeWith(Boolean.TRUE);
                break;
        }
    }
}
