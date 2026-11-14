package defpackage;

/* loaded from: classes.dex */
public final class tg9 extends i17 implements j7f, hi5 {
    public final vg9 q;
    public q5c r;

    public tg9() throws pxb {
        vg9 vg9Var = new vg9(0, new s2(2, this, tg9.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 9), 9);
        T0(vg9Var);
        this.q = vg9Var;
    }

    public final void J() {
        pqh pqhVar = new pqh();
        x7d.y(this, new gv8(pqhVar, this, (byte) 2));
        q5c q5cVar = (q5c) pqhVar.a;
        if (this.q.Y0().g()) {
            q5c q5cVar2 = this.r;
            if (q5cVar2 != null) {
                q5cVar2.b();
            }
            if (q5cVar != null) {
                q5cVar.a();
            } else {
                q5cVar = null;
            }
            this.r = q5cVar;
        }
    }
}
