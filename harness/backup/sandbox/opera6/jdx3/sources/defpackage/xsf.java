package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class xsf implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xsf(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        byte b = this.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                cq0 cq0Var = (cq0) obj;
                cq0Var.a.getClass();
                us0 us0Var = new us0(2431, -1, 1);
                bq0 bq0Var = cq0Var.b;
                List list = (List) bq0Var.n(2);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    bq0Var.q(2, 1, arrayList);
                    hf0Var = new hf0(bq0Var, 2, arrayList);
                } else {
                    hf0Var = new hf0(bq0Var, 2, list);
                }
                hf0Var.add(us0Var);
                us0Var.q(0, 1, z ? ts0.c : ts0.b);
                break;
            default:
                aq0 aq0Var = (aq0) obj;
                if (z) {
                    aq0Var.a.p(0, 1, 1L);
                } else {
                    aq0Var.a.p(1, 1, 1L);
                }
                break;
        }
        return Unit.a;
    }
}
