package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class fo9 implements AutoCloseable {
    public final lo9 a;
    public final Set b;
    public final af2 c;

    public fo9(lo9 lo9Var) {
        ehc ehcVar = lo9Var.e;
        ArrayList arrayList = new ArrayList(k95.o(ehcVar, 10));
        mea meaVarListIterator = ehcVar.listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                break;
            } else {
                arrayList.add(new yfk(((jo9) meaVar.next()).o));
            }
        }
        Set setN0 = CollectionsKt.n0(arrayList);
        this.a = lo9Var;
        this.b = setN0;
        ArrayList arrayList2 = new ArrayList(k95.o(ehcVar, 10));
        mea meaVarListIterator2 = ehcVar.listIterator(0);
        while (true) {
            mea meaVar2 = meaVarListIterator2;
            if (!meaVar2.hasNext()) {
                CollectionsKt.n0(arrayList2);
                this.c = c26.i(false);
                return;
            }
            arrayList2.add(new fuf(((jo9) meaVar2.next()).p));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        h();
    }

    public final void finalize() {
        if (h()) {
            toString();
        }
    }

    public final boolean h() {
        if (!this.c.a()) {
            return false;
        }
        lo9 lo9Var = this.a;
        io9 io9Var = lo9Var.d;
        ehc ehcVar = lo9Var.e;
        io9Var.O();
        int iD = ehcVar.d();
        for (int i = 0; i < iD; i++) {
            jo9 jo9Var = (jo9) ehcVar.get(i);
            if (this.b.contains(new yfk(jo9Var.o))) {
                jo9Var.O();
            }
        }
        return true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
