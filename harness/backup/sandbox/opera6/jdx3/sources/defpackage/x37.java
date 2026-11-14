package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class x37 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ x37(LinkedHashMap linkedHashMap, byte b) {
        this.a = b;
        this.b = linkedHashMap;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        byte b = this.a;
        boolean z = false;
        byte b2 = 1;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                ArrayList arrayListR = aik.r(true, (String) obj, ' ');
                if (arrayListR.size() == 6) {
                    String str = (String) arrayListR.get(2);
                    String strH = (String) arrayListR.get(5);
                    if (StringsKt.c0(strH, '(') && StringsKt.I(strH, ')')) {
                        strH = p3p.h(2, 1, strH);
                    }
                    ArrayList arrayListR2 = aik.r(false, strH, ',');
                    int size = arrayListR2.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj2 = arrayListR2.get(i);
                            i++;
                            if (Intrinsics.a((String) obj2, "rw")) {
                                z = true;
                            }
                        }
                    }
                    linkedHashMap.put(str, Boolean.valueOf(z));
                }
                return Boolean.FALSE;
            case 1:
                ld0 ld0Var = (ld0) obj;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    rkm rkmVar = (rkm) entry.getValue();
                    ld0Var.a.getClass();
                    hd0 hd0VarY = zpa.y();
                    kd0 kd0Var = ld0Var.b;
                    Map map = (Map) kd0Var.n(10);
                    if (map == null || map.isEmpty()) {
                        HashMap map2 = new HashMap();
                        kd0Var.q(10, 1, map2);
                        if0Var = new if0(kd0Var, 10, map2);
                    } else {
                        if0Var = new if0(kd0Var, 10, map);
                    }
                    if0Var.put(str2, hd0VarY);
                    hd0VarY.y(0, rkmVar.a);
                    hd0VarY.p(1, 1, rkmVar.b);
                    hd0VarY.p(2, 1, rkmVar.c);
                }
                return Unit.a;
            case 2:
                new x37(linkedHashMap, b2).invoke((ld0) ((nd0) obj).c.getValue());
                return Unit.a;
            case 3:
                return (aln) linkedHashMap.get((String) obj);
            default:
                List list = (List) linkedHashMap.get((String) obj);
                if (list != null && list.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
