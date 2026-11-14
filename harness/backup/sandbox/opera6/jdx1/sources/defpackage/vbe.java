package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class vbe implements yb6, xb6 {
    public final ArrayList a;
    public final ua7 b;
    public int c;
    public nyg d;
    public xb6 e;
    public List f;
    public boolean g;

    public vbe(ArrayList arrayList, ua7 ua7Var) {
        this.b = ua7Var;
        if (arrayList.isEmpty()) {
            qp2.o("Must not be empty.");
            throw null;
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.yb6
    public final Class a() {
        return ((yb6) this.a.get(0)).a();
    }

    public final void b() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            e(this.d, this.e);
        } else {
            qyn.k(this.f);
            this.e.d(new ty9("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.yb6
    public final void c() {
        List list = this.f;
        if (list != null) {
            this.b.K(list);
        }
        this.f = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((yb6) obj).c();
        }
    }

    @Override // defpackage.yb6
    public final void cancel() {
        this.g = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((yb6) obj).cancel();
        }
    }

    @Override // defpackage.xb6
    public final void d(Exception exc) {
        List list = this.f;
        qyn.l(list, "Argument must not be null");
        list.add(exc);
        b();
    }

    @Override // defpackage.yb6
    public final void e(nyg nygVar, xb6 xb6Var) {
        this.d = nygVar;
        this.e = xb6Var;
        this.f = (List) this.b.h();
        ((yb6) this.a.get(this.c)).e(nygVar, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // defpackage.yb6
    public final int f() {
        return ((yb6) this.a.get(0)).f();
    }

    @Override // defpackage.xb6
    public final void g(Object obj) {
        if (obj != null) {
            this.e.g(obj);
        } else {
            b();
        }
    }
}
