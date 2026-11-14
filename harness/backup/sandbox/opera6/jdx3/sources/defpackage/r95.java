package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class r95 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ r95(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ r95(int i, f58 f58Var) {
        this.a = (byte) 1;
        this.b = i;
    }

    public /* synthetic */ r95(u6c u6cVar, int i) {
        this.a = (byte) 3;
        this.b = i;
    }

    public final Object invoke(Object obj) throws Exception {
        hf0 hf0Var;
        hf0 hf0Var2;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(fki.r("Collection doesn't contain element at index ", i, '.'));
            case 1:
                wsk wskVarH = ((osk) obj).h("SELECT * FROM entry WHERE tabId = ?");
                try {
                    wskVarH.T0(1, i);
                    return wskVarH.n() ? new m7l((int) wskVarH.getLong(hyg.f(wskVarH, "tabId")), auj.j(wskVarH.l(hyg.f(wskVarH, "descriptionMedium"))), auj.j(wskVarH.l(hyg.f(wskVarH, "descriptionMini")))) : null;
                } finally {
                    wskVarH.close();
                }
            case 2:
                return Boolean.valueOf(((vg9) obj).T0(i));
            case 3:
                s5c s5cVar = (s5c) obj;
                ttj ttjVarT = bwg.t();
                bwg.A(ttjVarT, bwg.x(ttjVarT), ttjVarT != null ? ttjVarT.e() : null);
                int i2 = s5cVar.a;
                int i3 = i2 != -1 ? i2 : 2;
                for (int i4 = 0; i4 < i3; i4++) {
                    s5cVar.a(i + i4);
                }
                return Unit.a;
            case 4:
                o0j.d((q0j) obj, "Tier " + i);
                return Unit.a;
            case 5:
                el0 el0Var = (el0) obj;
                el0Var.a.p(1, 1, 1L);
                long[] jArr = {i};
                dl0 dl0Var = el0Var.a;
                List list = (List) dl0Var.n(2);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    dl0Var.q(2, 1, arrayList);
                    hf0Var = new hf0(dl0Var, 2, arrayList);
                } else {
                    hf0Var = new hf0(dl0Var, 2, list);
                }
                hf0Var.addAll(new a82(jArr, (byte) 1));
                return Unit.a;
            default:
                yj0 yj0Var = (yj0) obj;
                psp pspVar = yj0Var.a;
                fm0 fm0Var = new fm0(2169, -1, 1);
                t56 t56Var = yj0Var.b;
                List list2 = (List) t56Var.n(16);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    t56Var.q(16, 1, arrayList2);
                    hf0Var2 = new hf0(t56Var, 16, arrayList2);
                } else {
                    hf0Var2 = new hf0(t56Var, 16, list2);
                }
                hf0Var2.add(fm0Var);
                fm0Var.p(0, 1, i);
                return Unit.a;
        }
    }
}
