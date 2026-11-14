package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ah7 implements ati, qf7 {
    public final rf7 a;
    public final vx b;
    public final ode c = new ode();
    public final ArrayList d = new ArrayList();

    public ah7(rf7 rf7Var, vx vxVar) {
        this.a = rf7Var;
        this.b = vxVar;
        j();
    }

    @Override // defpackage.qf7
    public final void a(re7 re7Var) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((re7) obj).o == re7Var.o) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.set(i, re7Var);
            if (re7Var.q()) {
                k();
            }
        }
    }

    @Override // defpackage.qf7
    public final void b(re7 re7Var) {
    }

    @Override // defpackage.qf7
    public final void c(re7 re7Var) {
        if (re7Var.q()) {
            this.d.add(re7Var);
            k();
        }
    }

    @Override // defpackage.qf7
    public final void d(re7 re7Var) {
        this.d.remove(re7Var);
        if (re7Var.q()) {
            k();
        }
    }

    @Override // defpackage.qf7
    public final void e(re7 re7Var) {
    }

    @Override // defpackage.qf7
    public final void f(re7 re7Var) {
        if (re7Var.q()) {
            this.d.add(re7Var);
            k();
        }
    }

    @Override // defpackage.ysi
    public final void g(esi esiVar) {
    }

    @Override // defpackage.qf7
    public final void h(re7 re7Var) {
        this.d.remove(re7Var);
        if (re7Var.q()) {
            k();
        }
    }

    @Override // defpackage.ysi
    public final boolean i() {
        return true;
    }

    public final void j() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        List listUnmodifiableList = Collections.unmodifiableList(this.a.c);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listUnmodifiableList) {
            if (((re7) obj).q()) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        k();
    }

    public final void k() {
        this.c.n(this.d);
    }

    @Override // defpackage.ysi
    public final void l() {
        j();
    }

    @Override // defpackage.ysi
    public final ekc m() {
        return this.c;
    }

    @Override // defpackage.ati
    public final void remove(Object obj) {
        this.a.s((re7) obj);
    }
}
