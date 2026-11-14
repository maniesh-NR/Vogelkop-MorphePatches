package defpackage;

import android.os.Handler;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class th5 extends l73 {
    public final HashMap h = new HashMap();
    public Handler i;
    public pl6 j;

    @Override // defpackage.l73
    public void e() {
        for (sh5 sh5Var : this.h.values()) {
            sh5Var.a.d(sh5Var.b);
        }
    }

    @Override // defpackage.l73
    public void g() {
        for (sh5 sh5Var : this.h.values()) {
            sh5Var.a.f(sh5Var.b);
        }
    }

    @Override // defpackage.l73
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((sh5) it.next()).a.k();
        }
    }

    @Override // defpackage.l73
    public void q() {
        HashMap map = this.h;
        for (sh5 sh5Var : map.values()) {
            l73 l73Var = sh5Var.a;
            rh5 rh5Var = sh5Var.c;
            l73Var.p(sh5Var.b);
            l73Var.s(rh5Var);
            l73Var.r(rh5Var);
        }
        map.clear();
    }

    public jrd u(Object obj, jrd jrdVar) {
        gj5 gj5Var = (gj5) obj;
        for (int i = 0; i < gj5Var.c.size(); i++) {
            if (((jrd) gj5Var.c.get(i)).d == jrdVar.d) {
                Object obj2 = jrdVar.a;
                Object obj3 = gj5Var.b;
                int i2 = e4.g;
                return jrdVar.a(Pair.create(obj3, obj2));
            }
        }
        return null;
    }

    public long v(Object obj, long j) {
        return j;
    }

    public int w(Object obj, int i) {
        return i;
    }

    public abstract void x(Object obj, l73 l73Var, gql gqlVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [krd, qh5] */
    public final void y(final Object obj, l73 l73Var) {
        HashMap map = this.h;
        z4o.w(!map.containsKey(obj));
        ?? r1 = new krd() { // from class: qh5
            @Override // defpackage.krd
            public final void a(l73 l73Var2, gql gqlVar) {
                this.a.x(obj, l73Var2, gqlVar);
            }
        };
        rh5 rh5Var = new rh5(this, obj);
        map.put(obj, new sh5(l73Var, r1, rh5Var));
        Handler handler = this.i;
        handler.getClass();
        l73Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) l73Var.c.d;
        ord ordVar = new ord();
        ordVar.a = handler;
        ordVar.b = rh5Var;
        copyOnWriteArrayList.add(ordVar);
        Handler handler2 = this.i;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = l73Var.d.c;
        zl7 zl7Var = new zl7();
        zl7Var.a = handler2;
        zl7Var.b = rh5Var;
        copyOnWriteArrayList2.add(zl7Var);
        pl6 pl6Var = this.j;
        fjg fjgVar = this.g;
        fjgVar.getClass();
        l73Var.l(r1, pl6Var, fjgVar);
        if (this.b.isEmpty()) {
            l73Var.d(r1);
        }
    }
}
