package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class lo9 {
    public static final df2 i;
    public final long a;
    public final long b;
    public final long c;
    public final io9 d;
    public final ehc e;
    public final ef2 f;
    public final bf2 g;
    public final CopyOnWriteArrayList h;

    static {
        df2 df2Var = new df2();
        df2Var.a = 0L;
        i = df2Var;
    }

    public lo9(owh owhVar, long j, long j2, Set set) {
        Object next;
        this.a = j;
        this.b = j2;
        df2 df2Var = i;
        df2Var.getClass();
        this.c = df2.b.incrementAndGet(df2Var);
        this.d = new io9(this);
        ehc ehcVarB = a.b();
        Iterator it = owhVar.K().keySet().iterator();
        while (it.hasNext()) {
            int i2 = ((yfk) it.next()).a;
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((cg4) next).a == i2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            cg4 cg4Var = (cg4) next;
            if (cg4Var != null) {
                ArrayList arrayList = cg4Var.b;
                bf2 bf2VarJ = c26.j(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ehcVarB.add(new jo9(this, i2, ((wfk) arrayList.get(i3)).a, bf2VarJ));
                }
            }
        }
        ehc ehcVarA = a.a(ehcVarB);
        this.e = ehcVarA;
        this.f = c26.k(ko9.a);
        ArrayList arrayList2 = new ArrayList(k95.o(ehcVarA, 10));
        Iterator it3 = ehcVarA.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new yfk(((jo9) it3.next()).o));
        }
        this.g = c26.j(CollectionsKt.F(arrayList2).size());
        this.h = new CopyOnWriteArrayList();
    }

    public final String toString() {
        return "Frame-" + ((Object) ("FrameId(value=" + this.c + ')')) + '(' + this.a + '@' + this.b + ')';
    }
}
