package defpackage;

/* loaded from: classes.dex */
public abstract class b8e implements f17 {
    public a64 b;
    public int c;
    public b8e e;
    public b8e f;
    public k7f g;
    public wye h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public gv8 m;
    public boolean n;
    public b8e a = this;
    public int d = -1;

    public final nx5 H0() {
        a64 a64Var = this.b;
        if (a64Var != null) {
            return a64Var;
        }
        a64 a64VarB = sgb.b(ui6.f0(this).m.plus(new ynb(ui6.f0(this).m.get(ulp.h))));
        this.b = a64VarB;
        return a64VarB;
    }

    public boolean I0() {
        return !(this instanceof j03);
    }

    public void J0() {
        if (this.n) {
            a8b.b("node attached multiple times");
        }
        if (this.h == null) {
            a8b.b("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void K0() {
        if (!this.n) {
            a8b.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            a8b.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            a8b.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        a64 a64Var = this.b;
        if (a64Var != null) {
            sgb.k(a64Var, new g8e("The Modifier.Node was detached", (byte) 2));
            this.b = null;
        }
    }

    public void L0() {
    }

    public void M0() {
    }

    public void N0() {
    }

    public void O0() {
        if (!this.n) {
            a8b.b("reset() called on an unattached node");
        }
        N0();
    }

    public void P0() {
        if (!this.n) {
            a8b.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            a8b.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        L0();
        this.l = true;
    }

    public void Q0() {
        if (!this.n) {
            a8b.b("node detached multiple times");
        }
        if (this.h == null) {
            a8b.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            a8b.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        gv8 gv8Var = this.m;
        if (gv8Var != null) {
            gv8Var.invoke();
        }
        M0();
    }

    public void R0(b8e b8eVar) {
        this.a = b8eVar;
    }

    public void S0(wye wyeVar) {
        this.h = wyeVar;
    }
}
