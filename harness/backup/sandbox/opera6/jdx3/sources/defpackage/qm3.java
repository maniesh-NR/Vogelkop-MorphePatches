package defpackage;

import com.opera.android.bookmarks.c;
import com.opera.android.bookmarks.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qm3 {
    public static final qm3 b = new qm3(Collections.EMPTY_LIST);
    public final List a;

    public qm3(List list) {
        this.a = list;
    }

    public static qm3 a(ml3 ml3Var, c cVar) {
        if (ml3Var.h()) {
            return b;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kkj(ml3Var.getId(), ml3Var.getTitle(), ml3Var.b(), ml3Var.h()));
        ml3 ml3VarA = ml3Var.a(cVar);
        while (ml3VarA != null && !ml3VarA.h()) {
            arrayList.add(new kkj(ml3VarA.getId(), ml3VarA.getTitle(), ml3VarA.b(), ml3VarA.h()));
            ml3VarA = ml3VarA.a(cVar);
        }
        return new qm3(arrayList);
    }

    public final ml3 b(i53 i53Var) {
        ml3 ml3VarO = ((h) i53Var).o();
        List list = this.a;
        for (int size = list.size() - 1; size >= 0; size--) {
            kkj kkjVar = (kkj) list.get(size);
            al3 al3VarL = alo.L(kkjVar.a, ml3VarO, false);
            ml3VarO = al3VarL instanceof ml3 ? (ml3) al3VarL : (ml3) h.i(kkjVar, ml3VarO);
        }
        return ml3VarO;
    }
}
