package defpackage;

/* loaded from: classes.dex */
public final class bg9 {
    public final gg9 a;
    public final v31 b;
    public final tee c;
    public final tee d;
    public boolean e;

    public bg9(gg9 gg9Var, v31 v31Var) {
        this.a = gg9Var;
        this.b = v31Var;
        tee teeVar = jmi.a;
        this.c = new tee();
        this.d = new tee();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        qv7 qv7Var = new qv7(0, this, bg9.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 7);
        dee deeVar = this.b.p0;
        if (!deeVar.e(qv7Var)) {
            deeVar.a(qv7Var);
        }
        this.e = true;
    }
}
