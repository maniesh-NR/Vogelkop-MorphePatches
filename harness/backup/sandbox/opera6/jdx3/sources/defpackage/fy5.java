package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class fy5 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ fy5(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        hf0 hf0Var2;
        hf0 hf0Var3;
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                qg0 qg0Var = ((rg0) obj).a;
                List list2 = (List) qg0Var.n(11);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    qg0Var.q(11, 1, arrayList);
                    hf0Var = new hf0(qg0Var, 11, arrayList);
                } else {
                    hf0Var = new hf0(qg0Var, 11, list2);
                }
                hf0Var.addAll(list);
                break;
            case 2:
                qg0 qg0Var2 = ((rg0) obj).a;
                List list3 = (List) qg0Var2.n(10);
                if (list3 == null || list3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    qg0Var2.q(10, 1, arrayList2);
                    hf0Var2 = new hf0(qg0Var2, 10, arrayList2);
                } else {
                    hf0Var2 = new hf0(qg0Var2, 10, list3);
                }
                hf0Var2.addAll(list);
                break;
            case 3:
                qg0 qg0Var3 = ((rg0) obj).a;
                List list4 = (List) qg0Var3.n(12);
                if (list4 == null || list4.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    qg0Var3.q(12, 1, arrayList3);
                    hf0Var3 = new hf0(qg0Var3, 12, arrayList3);
                } else {
                    hf0Var3 = new hf0(qg0Var3, 12, list4);
                }
                hf0Var3.addAll(list);
                break;
            default:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((g07) it.next()).b();
                }
                break;
        }
        return Unit.a;
    }
}
