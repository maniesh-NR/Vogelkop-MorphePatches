package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class uog implements dh4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ev4 b;

    public /* synthetic */ uog(ev4 ev4Var, byte b) {
        this.a = b;
        this.b = ev4Var;
    }

    public final void onCancel() {
        byte b = this.a;
        ev4 ev4Var = this.b;
        switch (b) {
            case 0:
                ev4Var.b = false;
                break;
            default:
                ev4Var.c = true;
                break;
        }
    }
}
