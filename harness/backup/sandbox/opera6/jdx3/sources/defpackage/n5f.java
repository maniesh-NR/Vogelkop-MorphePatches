package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class n5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ LinkedHashMap d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ nm0 f;

    public /* synthetic */ n5f(List list, String str, LinkedHashMap linkedHashMap, boolean z, nm0 nm0Var, byte b) {
        this.a = b;
        this.b = list;
        this.c = str;
        this.d = linkedHashMap;
        this.e = z;
        this.f = nm0Var;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        if0 if0Var;
        switch (this.a) {
            case 0:
                ((td0) obj).b(new n5f(this.b, this.c, this.d, this.e, this.f, (byte) 1));
                break;
            case 1:
                yb0 yb0Var = (yb0) obj;
                n5f n5fVar = new n5f(this.b, this.c, this.d, this.e, this.f, (byte) 2);
                zpa zpaVar = yb0Var.a;
                zpaVar.getClass();
                lm0 lm0Var = new lm0(2443, -1, 5);
                xb0 xb0Var = yb0Var.b;
                List list = (List) xb0Var.n(56);
                ((list == null || list.isEmpty()) ? new hf0(xb0Var, 56, am2.q(xb0Var, 56, 1)) : new hf0(xb0Var, 56, list)).add(lm0Var);
                n5fVar.invoke(new mm0(zpaVar, lm0Var));
                break;
            default:
                mm0 mm0Var = (mm0) obj;
                lm0 lm0Var2 = mm0Var.b;
                List list2 = (List) lm0Var2.n(0);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    lm0Var2.q(0, 1, arrayList);
                    hf0Var = new hf0(lm0Var2, 0, arrayList);
                } else {
                    hf0Var = new hf0(lm0Var2, 0, list2);
                }
                hf0Var.addAll(this.b);
                String str = this.c;
                if (str != null) {
                    lm0Var2.q(1, 1, str);
                }
                for (Map.Entry entry : this.d.entrySet()) {
                    String str2 = (String) entry.getKey();
                    pcg pcgVar = (pcg) entry.getValue();
                    mm0Var.a.getClass();
                    jt0 jt0Var = new jt0(2443, -1, 2);
                    Map map = (Map) lm0Var2.n(2);
                    if (map == null || map.isEmpty()) {
                        HashMap map2 = new HashMap();
                        lm0Var2.q(2, 1, map2);
                        if0Var = new if0(lm0Var2, 2, map2);
                    } else {
                        if0Var = new if0(lm0Var2, 2, map);
                    }
                    if0Var.put(str2, jt0Var);
                    jt0Var.q(0, 1, pcgVar.a);
                    jt0Var.q(1, 1, pcgVar.b);
                }
                lm0Var2.r(3, 1, this.e);
                lm0Var2.q(4, 1, this.f);
                break;
        }
        return Unit.a;
    }
}
