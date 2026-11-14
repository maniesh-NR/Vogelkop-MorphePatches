package defpackage;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.av0;
import ads_mobile_sdk.n13;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class j3p extends k8 implements r7p {
    @Override // defpackage.r7p
    public final Object a(av0 av0Var, xzh xzhVar, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            av0 av0Var2 = av0Var;
            xzh xzhVar2 = xzhVar;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new bhj(str, value, (mt5) null, (Object) av0Var2, (Object) xzhVar2, (byte) 7), null, (byte) 3), 2);
            av0Var = av0Var2;
            xzhVar = xzhVar2;
        }
        return Unit.a;
    }

    @Override // defpackage.r7p
    public final Object a(n13 n13Var, a2 a2Var, xzh xzhVar, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            n13 n13Var2 = n13Var;
            a2 a2Var2 = a2Var;
            xzh xzhVar2 = xzhVar;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new r71(str, value, (mt5) null, n13Var2, a2Var2, xzhVar2), null, (byte) 3), 2);
            n13Var = n13Var2;
            a2Var = a2Var2;
            xzhVar = xzhVar2;
        }
        return Unit.a;
    }
}
