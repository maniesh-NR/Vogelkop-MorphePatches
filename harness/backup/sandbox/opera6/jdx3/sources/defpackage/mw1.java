package defpackage;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mw1 implements AppsFlyerConversionListener {
    public final vzk a;
    public final x5f b;
    public final l45 c;

    public mw1(vzk vzkVar, x5f x5fVar, l45 l45Var) {
        this.a = vzkVar;
        this.b = x5fVar;
        this.c = l45Var;
    }

    public final void onAppOpenAttribution(Map map) {
    }

    public final void onAttributionFailure(String str) {
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        x5f x5fVar = this.b;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        hf0 hf0VarA = x56VarF.z(zpaVar).A();
        q70 q70Var = new q70(2443, -1, 2);
        q70Var.q(0, 1, p70.c);
        q70Var.q(1, 1, str);
        hf0VarA.add(q70Var);
        x5fVar.U0(x56VarF);
        this.c.M(tw1.ERROR_ATTRIBUTE, "");
    }

    public final void onConversionDataFail(String str) {
        this.a.b0(null);
        x5f x5fVar = this.b;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        hf0 hf0VarA = x56VarF.z(zpaVar).A();
        q70 q70Var = new q70(2443, -1, 2);
        q70Var.q(0, 1, p70.b);
        hf0VarA.add(q70Var);
        x5fVar.U0(x56VarF);
        this.c.M(tw1.ERROR_CONVERSION, "");
    }

    public final void onConversionDataSuccess(Map map) {
        HashMap map2;
        hf0 hf0Var;
        s6e s6eVarB = s6e.b(t8.a);
        boolean zC = s6eVarB.c();
        vq8 vq8Var = s6eVarB.b;
        if (zC) {
            map2 = new HashMap();
            String str = vq8Var != null ? (String) vq8Var.j : "";
            if (!str.isEmpty()) {
                map2.put("adset", str);
            }
            String str2 = vq8Var != null ? (String) vq8Var.k : "";
            if (!str2.isEmpty()) {
                map2.put("af_adset", str2);
            }
        } else {
            map2 = null;
        }
        if (map2 != null && !map2.isEmpty()) {
            if (map == null) {
                map = map2;
            } else {
                HashMap map3 = new HashMap(map);
                map3.putAll(map2);
                map = map3;
            }
        }
        this.a.b0(map);
        if (map == null || !"true".equals(map.get("is_first_launch"))) {
            return;
        }
        Object obj = map.get("af_message");
        Object obj2 = map.get("click_time");
        Object obj3 = map.get("install_time");
        String string = obj != null ? obj.toString() : null;
        String string2 = obj2 != null ? obj2.toString() : null;
        String string3 = obj3 != null ? obj3.toString() : null;
        x5f x5fVar = this.b;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        q56 q56VarZ = x56VarF.z(zpaVar);
        List list = (List) q56VarZ.n(11);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            q56VarZ.q(11, 1, arrayList);
            hf0Var = new hf0(q56VarZ, 11, arrayList);
        } else {
            hf0Var = new hf0(q56VarZ, 11, list);
        }
        r70 r70Var = new r70(2443, -1, 3);
        if (string != null) {
            r70Var.x(2, string);
        }
        if (string2 != null) {
            r70Var.x(0, string2);
        }
        if (string3 != null) {
            r70Var.x(1, string3);
        }
        hf0Var.add(r70Var);
        x5fVar.U0(x56VarF);
    }
}
