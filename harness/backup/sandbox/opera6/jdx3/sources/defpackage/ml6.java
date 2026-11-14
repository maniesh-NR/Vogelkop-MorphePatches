package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ml6 implements kz2 {
    public Set a;
    public z8b b;
    public Set c;
    public boolean d;
    public final wg5 e;

    public ml6() {
        v08 v08Var = v08.a;
        this.a = v08Var;
        this.c = v08Var;
        this.e = new wg5(this, (byte) 11);
    }

    public final void a(gz2 gz2Var) {
        if (this.a.contains(gz2Var)) {
            qp2.n("Callback is already registered");
            return;
        }
        this.a = b5j.f(this.a, gz2Var);
        gz2Var.b = b5j.f(gz2Var.b, this.e);
        f();
    }

    public final boolean b(gz2 gz2Var) {
        return this.a.contains(gz2Var);
    }

    public final void c(gz2 gz2Var) {
        if (!this.a.contains(gz2Var)) {
            qp2.n("Callback is not registered");
            return;
        }
        this.a = b5j.c(this.a, gz2Var);
        gz2Var.b = b5j.c(gz2Var.b, this.e);
        z8b z8bVar = this.b;
        if (gz2Var == (z8bVar != null ? (gz2) z8bVar.b : null)) {
            if (z8bVar != null) {
                z8bVar.b = null;
            }
            q2 q2Var = gz2Var.f;
            if (q2Var != null) {
                q2Var.invoke();
            }
        }
        f();
    }

    public final void d() {
        gz2 gz2VarO;
        z8b z8bVar = this.b;
        if (z8bVar == null || (gz2VarO = (gz2) z8bVar.b) == null) {
            gz2VarO = xvg.o(this.a);
        }
        this.b = null;
        if (gz2VarO != null) {
            gz2VarO.g.invoke();
        }
    }

    public final boolean e() {
        Set set = this.a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                fz2 fz2Var = ((gz2) it.next()).c;
                xtb xtbVar = gz2.h[0];
                if (((Boolean) fz2Var.b).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        boolean zE = e();
        if (this.d != zE) {
            this.d = zE;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Boolean.valueOf(zE));
            }
        }
    }

    public final void g(iz2 iz2Var) {
        r2 r2Var;
        z8b z8bVar = this.b;
        if (z8bVar != null) {
            if (((gz2) z8bVar.b) == null) {
                gz2 gz2VarO = xvg.o(this.a);
                z8bVar.b = gz2VarO;
                if (gz2VarO != null) {
                    iz2 iz2Var2 = (iz2) z8bVar.a;
                    xm6 xm6Var = gz2VarO.d;
                    if (xm6Var != null) {
                        xm6Var.invoke(iz2Var2);
                    }
                }
            }
            gz2 gz2Var = (gz2) z8bVar.b;
            if (gz2Var == null || (r2Var = gz2Var.e) == null) {
                return;
            }
            r2Var.invoke(iz2Var);
        }
    }
}
