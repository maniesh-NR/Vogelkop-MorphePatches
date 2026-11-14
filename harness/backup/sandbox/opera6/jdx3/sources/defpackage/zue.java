package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zue extends f92 {
    public final qre f;

    public zue(au8 au8Var, uqe uqeVar) {
        super(au8Var, uqeVar, "topnews");
        uqeVar.getClass();
        this.f = new qre("newsfeed", null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zue(au8 au8Var, uqe uqeVar, yqe yqeVar) {
        String str = yqeVar.a;
        super(au8Var, uqeVar, str);
        uqeVar.getClass();
        this.f = new qre("newsfeed" + str, yqeVar);
    }

    @Override // defpackage.f92
    public final u82 a() {
        tw2 tw2Var;
        uqe uqeVar = this.a;
        qre qreVar = this.f;
        if (qreVar == null) {
            uqeVar.getClass();
            tw2Var = null;
        } else {
            tw2Var = new tw2(uqeVar.f(qreVar));
        }
        return new wue(tw2Var);
    }

    @Override // defpackage.f92
    public final d53 b() {
        return new yue(this.a, this.f, ((wue) super.c()).b);
    }

    @Override // defpackage.f92
    public final u82 c() {
        return (wue) super.c();
    }

    @Override // defpackage.f92
    public final d53 d() {
        return (yue) super.d();
    }

    @Override // defpackage.f92
    public final void f(c53 c53Var) {
        yue yueVar = (yue) super.d();
        yueVar.getClass();
        ArrayList arrayList = ((k92) c53Var).d;
        if (arrayList == null) {
            return;
        }
        boolean z = c53Var.b != null;
        tw2 tw2Var = yueVar.e;
        if (!z) {
            ((xqe) tw2Var.b).b(arrayList, false);
            return;
        }
        xqe xqeVar = (xqe) tw2Var.b;
        List list = xqeVar.g;
        if (list == null) {
            xqeVar.h.addAll(arrayList);
            return;
        }
        if (list.addAll(arrayList)) {
            xqeVar.o(xqeVar.g);
            int size = arrayList.size();
            h7f h7fVar = xqeVar.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                wue wueVar = ((a53) g7fVarH.next()).a;
                tw2 tw2Var2 = wueVar.b;
                xqe xqeVar2 = (xqe) tw2Var2.b;
                List list2 = xqeVar2.g;
                if (list2 == null) {
                    list2 = xqeVar2.h;
                }
                int size2 = list2.size();
                int i = size2 - size;
                xqe xqeVar3 = (xqe) tw2Var2.b;
                List list3 = xqeVar3.g;
                if (list3 == null) {
                    list3 = xqeVar3.h;
                }
                List listUnmodifiableList = Collections.unmodifiableList(list3.subList(i, size2));
                g7f g7fVar = new g7f(wueVar.a);
                while (g7fVar.hasNext()) {
                    rw8 rw8Var = (rw8) g7fVar.next();
                    ow8 ow8Var = rw8Var.b;
                    g95 g95VarB = rw8Var.b(listUnmodifiableList);
                    ArrayList arrayList2 = ow8Var.a;
                    if (!g95VarB.isEmpty()) {
                        int size3 = arrayList2.size();
                        int size4 = arrayList2.size() - 1;
                        while (size4 >= 0 && (arrayList2.get(size4) instanceof pv8)) {
                            size4--;
                        }
                        arrayList2.addAll(size4 + 1, g95VarB);
                        Iterator it = ow8Var.b.values().iterator();
                        while (it.hasNext()) {
                            ((fa2) it.next()).S().d(size3, ow8Var.a);
                        }
                        int size5 = arrayList2.size();
                        ow8Var.l.g();
                        ow8Var.l.h();
                        if (ow8Var.Y(false)) {
                            ow8Var.notifyDataSetChanged();
                        } else {
                            ow8Var.notifyItemRangeInserted(size3, size5 - size3);
                        }
                    }
                }
            }
        }
    }
}
