package defpackage;

/* loaded from: classes.dex */
public final class olk extends ize {
    public final ydn l;
    public final nlk m;

    public olk(ydn ydnVar) {
        super(new mlk(ydnVar.d.a, ydnVar.c.isEnabled()));
        this.m = new nlk(this, (byte) 0);
        this.l = ydnVar;
    }

    public final void l() {
        s();
        this.l.F(this.m);
    }

    public final void m() {
        this.l.H(this.m);
    }

    public final void s() {
        ydn ydnVar = this.l;
        mlk mlkVar = new mlk(ydnVar.d.a, ydnVar.c.isEnabled());
        if (mlkVar.equals(g())) {
            return;
        }
        r(mlkVar);
    }
}
