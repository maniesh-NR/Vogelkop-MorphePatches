package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class k5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ k5f(byte b, long j, long j2) {
        this.a = b;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        byte b = this.a;
        long j = this.c;
        long j2 = this.b;
        switch (b) {
            case 0:
                vc0 vc0Var = (vc0) ((ck0) obj).f.getValue();
                vc0Var.a.getClass();
                pm0 pm0Var = new pm0(2443, -1, 2);
                uc0 uc0Var = vc0Var.b;
                List list = (List) uc0Var.n(11);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    uc0Var.q(11, 1, arrayList);
                    hf0Var = new hf0(uc0Var, 11, arrayList);
                } else {
                    hf0Var = new hf0(uc0Var, 11, list);
                }
                hf0Var.add(pm0Var);
                pm0Var.p(0, 1, j2);
                pm0Var.p(1, 1, j);
                break;
            default:
                ((jn0) ((ak0) obj).e.getValue()).a.p(7, 1, j2 - j);
                break;
        }
        return Unit.a;
    }
}
