package defpackage;

import com.opera.android.bookmarks.b;
import com.opera.android.bookmarks.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class in3 implements kkm, lkm {
    public final i53 a;
    public final ArrayList b = new ArrayList();
    public final i7f c = new i7f();

    public in3(i53 i53Var) {
        this.a = i53Var;
        i53Var.a(new hn3(this, (byte) 1));
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        if (list == null) {
            list = l08.a;
        }
        List<al3> list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        for (al3 al3Var : list2) {
            this.b.add(al3Var);
            arrayList.add(new guh(al3Var, 0));
        }
        a();
        return new e5d(arrayList, l08.a, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final void R(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            al3 al3Var = (al3) obj;
            if (this.b.remove(al3Var)) {
                h hVar = (h) this.a;
                hVar.getClass();
                hVar.q((b) al3Var);
            }
        }
    }

    public final void a() {
        i7f i7fVar = this.c;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((qbf) g7fVarC.next()).a.q();
        }
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            this.b.remove(((guh) it.next()).a);
        }
        a();
    }
}
