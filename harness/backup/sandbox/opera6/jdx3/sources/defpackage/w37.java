package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class w37 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Map b;

    public /* synthetic */ w37(Map map, byte b) {
        this.a = b;
        this.b = map;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        byte b = this.a;
        byte b2 = 2;
        boolean z = false;
        Map map = this.b;
        switch (b) {
            case 0:
                ucd ucdVarI = y37.h.i((String) obj);
                if (ucdVarI != null) {
                    e5 e5Var = ucdVarI.c;
                    if (Intrinsics.a(map.get(e5Var.g(1).a), e5Var.g(2).a)) {
                        z = true;
                    }
                }
                break;
            case 1:
                new w37(map, b2).invoke((nn0) ((vo0) obj).c.getValue());
                break;
            case 2:
                nn0 nn0Var = (nn0) obj;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    mn0 mn0Var = nn0Var.a;
                    Map map2 = (Map) mn0Var.n(4);
                    if (map2 == null || map2.isEmpty()) {
                        HashMap map3 = new HashMap();
                        mn0Var.q(4, 1, map3);
                        if0Var = new if0(mn0Var, 4, map3);
                    } else {
                        if0Var = new if0(mn0Var, 4, map2);
                    }
                    if0Var.put(str, Long.valueOf(jLongValue));
                }
                break;
            default:
                x61 x61Var = (x61) obj;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (!CollectionsKt.E((List) entry2.getValue(), x61Var.c((CaptureResult.Key) entry2.getKey()))) {
                        break;
                    }
                }
                z = true;
        }
        return Unit.a;
    }
}
