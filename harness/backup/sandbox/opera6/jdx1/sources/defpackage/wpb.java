package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wpb extends pqb implements Iterable {
    public final ArrayList a;

    public wpb() {
        this.a = new ArrayList();
    }

    public wpb(int i) {
        this.a = new ArrayList(i);
    }

    public final pqb b() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return new wpb();
        }
        wpb wpbVar = new wpb(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wpbVar.o(((pqb) obj).b());
        }
        return wpbVar;
    }

    public final boolean c() {
        return q().c();
    }

    public final double d() {
        return q().d();
    }

    public final float e() {
        return q().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof wpb) && ((wpb) obj).a.equals(this.a);
        }
        return true;
    }

    public final int f() {
        return q().f();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final long j() {
        return q().j();
    }

    public final Number m() {
        return q().m();
    }

    public final String n() {
        return q().n();
    }

    public final void o(pqb pqbVar) {
        if (pqbVar == null) {
            pqbVar = mrb.a;
        }
        this.a.add(pqbVar);
    }

    public final void p(String str) {
        this.a.add(str == null ? mrb.a : new zrb(str));
    }

    public final pqb q() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return (pqb) arrayList.get(0);
        }
        qp2.n(sko.i(size, "Array must have size 1, but has size "));
        return null;
    }

    public final int size() {
        return this.a.size();
    }
}
