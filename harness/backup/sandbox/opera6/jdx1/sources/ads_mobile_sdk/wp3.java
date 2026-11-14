package ads_mobile_sdk;

import defpackage.aop;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class wp3 implements aop {
    public final yq3 a;
    public final qr0 b;

    public wp3(yq3 yq3Var, qr0 qr0Var) {
        this.a = yq3Var;
        this.b = qr0Var;
    }

    @Override // defpackage.aop
    public final Object a(Map map, mt5 mt5Var) {
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        List list = (List) map.get((String) qr0Var.a("gads:webview_prefetch_resource_url_header", "X-Afma-Creative-Resource-Urls", fo.a$23));
        if (list == null) {
            return Unit.a;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!StringsKt.N((String) it.next())) {
                    Object objA = this.a.a(list, (nt5) mt5Var);
                    px5 px5Var = px5.a;
                    if (objA != px5Var) {
                        objA = Unit.a;
                    }
                    return objA == px5Var ? objA : Unit.a;
                }
            }
        }
        return Unit.a;
    }
}
