package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r63 implements am9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k24 b;

    public /* synthetic */ r63(k24 k24Var, byte b) {
        this.a = b;
        this.b = k24Var;
    }

    public final void onBackStackChanged() {
        byte b = this.a;
        k24 k24Var = this.b;
        switch (b) {
            case 0:
                ((s63) k24Var).x0();
                break;
            default:
                ((ltl) k24Var).D0();
                break;
        }
    }
}
