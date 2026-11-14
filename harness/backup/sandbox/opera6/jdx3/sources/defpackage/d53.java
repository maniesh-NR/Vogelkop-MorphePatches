package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d53 {
    public final ArrayList a = new ArrayList();
    public final h7f b = new h7f();
    public final b53 c = new b53(this);

    public c53 c(Object obj, oqe oqeVar, v82 v82Var) {
        return new c92(obj, oqeVar, v82Var);
    }

    public final void e(Object obj, oqe oqeVar, w82 w82Var) {
        v82 v82Var = new v82((byte) 0);
        ArrayList arrayList = (ArrayList) v82Var.b;
        arrayList.add(this.c);
        arrayList.add(w82Var);
        c53 c53VarC = c(obj, oqeVar, v82Var);
        if (this.a.add(c53VarC)) {
            h7f h7fVar = this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((x82) g7fVarH.next()).l();
            }
        }
        c53VarC.c();
    }

    public final boolean k(Object obj) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (((c53) obj2).a.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l(c53 c53Var) {
        if (this.a.remove(c53Var)) {
            h7f h7fVar = this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((x82) g7fVarH.next()).l();
            }
        }
    }

    public final void m(Object obj) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c53 c53Var = (c53) arrayList.get(size);
            if (c53Var.a.equals(obj)) {
                c53Var.a();
            }
        }
    }
}
