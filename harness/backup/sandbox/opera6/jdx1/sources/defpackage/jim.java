package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jim implements kw1 {
    public final m3c a;
    public final ArrayList b = new ArrayList();
    public Object c;

    public jim(m3c m3cVar) {
        this.a = m3cVar;
        this.c = m3cVar;
    }

    public final void a() throws pxb {
        this.b.clear();
        this.c = this.a;
        this.a.P();
    }

    @Override // defpackage.kw1
    public final Object i() {
        return this.c;
    }

    @Override // defpackage.kw1
    public final void j(int i, int i2, int i3) {
        ((m3c) this.c).L(i, i2, i3);
    }

    @Override // defpackage.kw1
    public final void k(int i, int i2) throws pxb {
        ((m3c) this.c).Q(i, i2);
    }

    @Override // defpackage.kw1
    public final void m(int i, Object obj) {
    }

    @Override // defpackage.kw1
    public final void n() {
        v31 v31Var = this.a.n;
        if (v31Var != null) {
            v31Var.B();
        }
    }

    @Override // defpackage.kw1
    public final void p(int i, Object obj) throws pxb {
        ((m3c) this.c).B(i, (m3c) obj);
    }

    @Override // defpackage.kw1
    public final void r(Object obj) {
        this.b.add(this.c);
        this.c = obj;
    }

    @Override // defpackage.kw1
    public final void s() {
        yoh yohVar;
        p21 p21Var;
        yoh yohVar2;
        m3c m3cVar = (m3c) this.c;
        tah tahVar = m3cVar.F;
        if (!m3cVar.H()) {
            a8b.a("onReuse is only expected on attached node");
        }
        c6n c6nVar = m3cVar.o;
        if (c6nVar != null) {
            View view = c6nVar.b;
            if (view.getParent() != c6nVar) {
                c6nVar.addView(view);
            } else {
                c6nVar.f.invoke();
            }
        }
        z3c z3cVar = m3cVar.H;
        if (z3cVar != null) {
            z3cVar.i(false);
        }
        m3cVar.t = false;
        if (m3cVar.Q) {
            m3cVar.Q = false;
        } else {
            b8e b8eVar = (lbl) m3cVar.F.f;
            for (b8e b8eVar2 = b8eVar; b8eVar2 != null; b8eVar2 = b8eVar2.e) {
                if (b8eVar2.n) {
                    b8eVar2.O0();
                }
            }
            for (b8e b8eVar3 = b8eVar; b8eVar3 != null; b8eVar3 = b8eVar3.e) {
                if (b8eVar3.n) {
                    b8eVar3.Q0();
                }
            }
            while (b8eVar != null) {
                if (b8eVar.n) {
                    b8eVar.K0();
                }
                b8eVar = b8eVar.e;
            }
        }
        int i = m3cVar.b;
        v31 v31Var = m3cVar.n;
        if (v31Var != null && (yohVar2 = v31Var.t) != null) {
            yohVar2.h(m3cVar);
        }
        m3cVar.b = h0j.a.addAndGet(1);
        v31 v31Var2 = m3cVar.n;
        if (v31Var2 != null) {
            jde jdeVar = v31Var2.s;
            jdeVar.g(i);
            jdeVar.i(m3cVar.b, m3cVar);
        }
        for (b8e b8eVar4 = (b8e) tahVar.g; b8eVar4 != null; b8eVar4 = b8eVar4.f) {
            b8eVar4.J0();
        }
        tahVar.K();
        if (tahVar.w(8)) {
            m3cVar.F();
        }
        m3c.W(m3cVar);
        v31 v31Var3 = m3cVar.n;
        if (v31Var3 != null && (p21Var = v31Var3.I) != null) {
            v31 v31Var4 = p21Var.c;
            s6h s6hVar = p21Var.a;
            kde kdeVar = p21Var.h;
            if (kdeVar.f(i)) {
                s6hVar.L(v31Var4, i, false);
            }
            f0j f0jVarW = m3cVar.w();
            if (f0jVarW != null && f0jVarW.a.b(n0j.r)) {
                kdeVar.a(m3cVar.b);
                s6hVar.L(v31Var4, m3cVar.b, true);
            }
        }
        v31 v31Var5 = m3cVar.n;
        if (v31Var5 == null || (yohVar = v31Var5.t) == null) {
            return;
        }
        yohVar.g(m3cVar);
    }

    @Override // defpackage.kw1
    public final void u() {
        this.c = vep.r(1, this.b);
    }
}
