package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i17 extends b8e {
    public final int o = xye.e(this);
    public b8e p;

    @Override // defpackage.b8e
    public final void J0() {
        super.J0();
        for (b8e b8eVar = this.p; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.S0(this.h);
            if (!b8eVar.n) {
                b8eVar.J0();
            }
        }
    }

    @Override // defpackage.b8e
    public final void K0() {
        for (b8e b8eVar = this.p; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.K0();
        }
        super.K0();
    }

    @Override // defpackage.b8e
    public final void O0() {
        super.O0();
        for (b8e b8eVar = this.p; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.O0();
        }
    }

    @Override // defpackage.b8e
    public final void P0() {
        for (b8e b8eVar = this.p; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.P0();
        }
        super.P0();
    }

    @Override // defpackage.b8e
    public final void Q0() {
        super.Q0();
        for (b8e b8eVar = this.p; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.Q0();
        }
    }

    @Override // defpackage.b8e
    public final void R0(b8e b8eVar) {
        this.a = b8eVar;
        for (b8e b8eVar2 = this.p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
            b8eVar2.R0(b8eVar);
        }
    }

    @Override // defpackage.b8e
    public final void S0(wye wyeVar) {
        this.h = wyeVar;
        for (b8e b8eVar = this.p; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.S0(wyeVar);
        }
    }

    public final f17 T0(f17 f17Var) throws pxb {
        b8e b8eVar = ((b8e) f17Var).a;
        if (b8eVar != f17Var) {
            b8e b8eVar2 = f17Var instanceof b8e ? (b8e) f17Var : null;
            b8e b8eVar3 = b8eVar2 != null ? b8eVar2.e : null;
            if (b8eVar != this.a || !Intrinsics.a(b8eVar3, this)) {
                qp2.n("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (b8eVar.n) {
                a8b.b("Cannot delegate to an already attached node");
            }
            b8eVar.R0(this.a);
            int i = this.c;
            int iF = xye.f(b8eVar);
            b8eVar.c = iF;
            int i2 = this.c;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof e3c)) {
                a8b.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + b8eVar);
            }
            b8eVar.f = this.p;
            this.p = b8eVar;
            b8eVar.e = this;
            V0(this.c | iF, false);
            if (this.n) {
                if (i3 == 0 || (i & 2) != 0) {
                    S0(this.h);
                } else {
                    tah tahVar = ui6.e0(this).F;
                    this.a.S0(null);
                    tahVar.P();
                }
                b8eVar.J0();
                b8eVar.P0();
                if (!b8eVar.n) {
                    a8b.b("autoInvalidateInsertedNode called on unattached node");
                }
                xye.a(b8eVar, -1, 1);
            }
        }
        return f17Var;
    }

    public final void U0(f17 f17Var) throws pxb {
        b8e b8eVar = null;
        for (b8e b8eVar2 = this.p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
            if (b8eVar2 == f17Var) {
                boolean z = b8eVar2.n;
                if (z) {
                    zde zdeVar = xye.a;
                    if (!z) {
                        a8b.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    xye.a(b8eVar2, -1, 2);
                    b8eVar2.Q0();
                    b8eVar2.K0();
                }
                b8eVar2.R0(b8eVar2);
                b8eVar2.d = 0;
                b8e b8eVar3 = b8eVar2.f;
                if (b8eVar == null) {
                    this.p = b8eVar3;
                } else {
                    b8eVar.f = b8eVar3;
                }
                b8eVar2.f = null;
                b8eVar2.e = null;
                int i = this.c;
                int iF = xye.f(this);
                V0(iF, true);
                if (this.n && (i & 2) != 0 && (iF & 2) == 0) {
                    tah tahVar = ui6.e0(this).F;
                    this.a.S0(null);
                    tahVar.P();
                    return;
                }
                return;
            }
            b8eVar = b8eVar2;
        }
        n57.h(f17Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void V0(int i, boolean z) {
        b8e b8eVar;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            b8e b8eVar2 = this.a;
            if (b8eVar2 == this) {
                this.d = i;
            }
            boolean z2 = this.n;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == b8eVar2) {
                        break;
                    } else {
                        r2 = r2.e;
                    }
                }
                if (z && r2 == b8eVar2) {
                    i = xye.f(b8eVar2);
                    b8eVar2.c = i;
                }
                int i3 = i | ((r2 == 0 || (b8eVar = r2.f) == null) ? 0 : b8eVar.d);
                for (b8e b8eVar3 = r2; b8eVar3 != null; b8eVar3 = b8eVar3.e) {
                    i3 |= b8eVar3.c;
                    b8eVar3.d = i3;
                }
            }
        }
    }
}
