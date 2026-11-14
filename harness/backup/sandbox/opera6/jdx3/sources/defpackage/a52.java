package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a52 {
    public final i52 a;
    public fz1 b;
    public boolean c;

    public a52(i52 i52Var) {
        this.a = i52Var;
    }

    public final void a(z42 z42Var) {
        fz1 fz1Var = z42Var.b;
        String str = fz1Var != null ? fz1Var.a : null;
        fz1 fz1Var2 = this.b;
        if (Intrinsics.a(str, fz1Var2 != null ? fz1Var2.a : null)) {
            this.b = null;
        }
        ArrayList arrayList = z42Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h52 h52VarA = h52.a((h52) obj, false);
            this.a.a.put(h52VarA.a, h52VarA);
        }
        this.c = false;
    }

    public final z42 b() {
        List listK0 = CollectionsKt.k0(this.a.a.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (((h52) obj).e) {
                arrayList.add(obj);
            }
        }
        return new z42(arrayList, this.b, this.c);
    }

    public final void c(List list, ez1 ez1Var, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jx1 jx1Var = (jx1) it.next();
            if (jx1Var != null) {
                if (jx1Var instanceof vx1) {
                    String str = ((vx1) jx1Var).a;
                    i52 i52Var = this.a;
                    h52 h52Var = (h52) i52Var.a.get(str);
                    if (h52Var != null) {
                        h52 h52VarA = h52.a(h52Var, true);
                        i52Var.a.put(h52VarA.a, h52VarA);
                    }
                } else if (jx1Var instanceof fz1) {
                    fz1 fz1Var = (fz1) jx1Var;
                    this.b = new fz1(fz1Var.a, fz1Var.b, fz1Var.c, ez1Var);
                }
            }
            h9o.p();
            return;
        }
        this.c = z;
    }
}
