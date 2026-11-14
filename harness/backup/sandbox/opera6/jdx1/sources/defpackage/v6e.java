package defpackage;

/* loaded from: classes.dex */
public final class v6e extends gcf {
    public final nx5 Y;
    public final cd1 Z;
    public final q4b a0;

    public v6e(nx5 nx5Var, cd1 cd1Var, q4b q4bVar) {
        super(true);
        this.Y = nx5Var;
        this.Z = cd1Var;
        this.a0 = q4bVar;
    }

    @Override // defpackage.gcf
    public final void handleOnBackCancelled() {
        na2.B(this.Y, null, null, new agb((byte) 7, (mt5) null, this), 3);
    }

    @Override // defpackage.gcf
    public final void handleOnBackPressed() {
        this.a0.invoke();
    }

    @Override // defpackage.gcf
    public final void handleOnBackProgressed(jz2 jz2Var) {
        na2.B(this.Y, null, null, new u6e(this, jz2Var, null, (byte) 0), 3);
    }

    @Override // defpackage.gcf
    public final void handleOnBackStarted(jz2 jz2Var) {
        na2.B(this.Y, null, null, new u6e(this, jz2Var, null, (byte) 1), 3);
    }
}
