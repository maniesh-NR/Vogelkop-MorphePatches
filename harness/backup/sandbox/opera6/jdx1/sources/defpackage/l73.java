package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class l73 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final ro9 c = new ro9(new CopyOnWriteArrayList(), 0, (jrd) null);
    public final am7 d = new am7(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public gql f;
    public fjg g;

    public boolean a(qjd qjdVar) {
        return false;
    }

    public final ro9 b(jrd jrdVar) {
        return new ro9((CopyOnWriteArrayList) this.c.d, 0, jrdVar);
    }

    public nkd c(jrd jrdVar, l45 l45Var, long j) {
        throw new UnsupportedOperationException();
    }

    public final void d(krd krdVar) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(krdVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        e();
    }

    public void e() {
    }

    public final void f(krd krdVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(krdVar);
        if (zIsEmpty) {
            g();
        }
    }

    public void g() {
    }

    public gql h() {
        return null;
    }

    public qjd i() {
        return ij5.u;
    }

    public boolean j() {
        return !(this instanceof ij5);
    }

    public void k() {
    }

    public final void l(krd krdVar, pl6 pl6Var, fjg fjgVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        z4o.w(looper == null || looper == looperMyLooper);
        this.g = fjgVar;
        gql gqlVar = this.f;
        this.a.add(krdVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(krdVar);
            m(pl6Var);
        } else if (gqlVar != null) {
            f(krdVar);
            krdVar.a(this, gqlVar);
        }
    }

    public void m(pl6 pl6Var) {
    }

    public final void n(gql gqlVar) {
        this.f = gqlVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((krd) obj).a(this, gqlVar);
        }
    }

    public void o(nkd nkdVar) {
    }

    public final void p(krd krdVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(krdVar);
        if (!arrayList.isEmpty()) {
            d(krdVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public void q() {
    }

    public final void r(bm7 bm7Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zl7 zl7Var = (zl7) it.next();
            if (zl7Var.b == bm7Var) {
                copyOnWriteArrayList.remove(zl7Var);
            }
        }
    }

    public final void s(prd prdVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ord ordVar = (ord) it.next();
            if (ordVar.b == prdVar) {
                copyOnWriteArrayList.remove(ordVar);
            }
        }
    }

    public void t(qjd qjdVar) {
    }
}
