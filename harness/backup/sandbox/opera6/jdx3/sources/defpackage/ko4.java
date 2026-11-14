package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ko4 implements oyl, fjc {
    public final /* synthetic */ zo4 a;

    public /* synthetic */ ko4(zo4 zo4Var) {
        this.a = zo4Var;
    }

    public final void invoke(Object obj) {
        ((eig) obj).N(this.a.J);
    }

    public final void onTrackSelectionsInvalidated() {
        zo4 zo4Var = this.a;
        zo4Var.i.post(new lb4(zo4Var, (byte) 5));
    }
}
