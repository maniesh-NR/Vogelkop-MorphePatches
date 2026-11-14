package defpackage;

/* loaded from: classes.dex */
public final class ath implements j3d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nh4 b;

    public /* synthetic */ ath(nh4 nh4Var, byte b) {
        this.a = b;
        this.b = nh4Var;
    }

    @Override // defpackage.j3d
    public final void onResult(Object obj) {
        byte b = this.a;
        nh4 nh4Var = this.b;
        switch (b) {
            case 0:
                if (!nh4Var.w()) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(obj);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!nh4Var.w()) {
                    p0i p0iVar2 = t0i.b;
                    nh4Var.resumeWith(new q0i(th));
                    break;
                }
                break;
        }
    }
}
