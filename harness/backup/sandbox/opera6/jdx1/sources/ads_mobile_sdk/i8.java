package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.nsd;
import defpackage.prb;
import defpackage.xzh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i8 {
    public final qr0 a;
    public String b;
    public xv c;
    public prb d;
    public defpackage.hq e;
    public List f = Collections.synchronizedList(new ArrayList());
    public final Map g = Collections.synchronizedMap(new LinkedHashMap());

    public i8(qr0 qr0Var) {
        this.a = qr0Var;
    }

    public final Bundle a(prb prbVar) {
        xv xvVar = this.c;
        if (xvVar == null) {
            xvVar = null;
        }
        prb prbVar2 = xvVar.q;
        prb prbVar3 = this.d;
        if (prbVar3 == null) {
            prbVar3 = new prb();
        }
        prb prbVarB = prbVar2.b();
        egc it = prbVar3.a.entrySet().iterator();
        while (it.hasNext()) {
            ggc ggcVarA = it.a();
            prbVarB.o((String) ggcVarA.getKey(), (pqb) ggcVarA.getValue());
        }
        if (prbVar != null) {
            qr0 qr0Var = this.a;
            qr0Var.getClass();
            if (((Boolean) qr0Var.a("gads:enable_ad_specific_response_info_extras:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
                egc it2 = prbVar.a.entrySet().iterator();
                while (it2.hasNext()) {
                    ggc ggcVarA2 = it2.a();
                    prbVarB.o((String) ggcVarA2.getKey(), (pqb) ggcVarA2.getValue());
                }
            }
        }
        Bundle bundleB = bw2.b(prbVarB);
        if (bundleB.containsKey("ad_value") && (bundleB.get("ad_value") instanceof Integer)) {
            bundleB.putDouble("ad_value", bundleB.getInt("ad_value"));
        }
        return bundleB;
    }

    public final xzh a() {
        if (this.c == null) {
            return null;
        }
        defpackage.hq hqVar = this.e;
        return new xzh(hqVar != null ? hqVar.getAdapterClassName() : null, this.b, a(null), this.e, this.f);
    }

    public final void a(a2 a2Var, int i) {
        String str = a2Var.d;
        if (str.length() != 0) {
            Map map = this.g;
            if (map.containsKey(str)) {
                return;
            }
            defpackage.hq hqVar = new defpackage.hq(a2Var.f, 0L, null, bw2.b(a2Var.c), a2Var.h, a2Var.i, a2Var.j, a2Var.k);
            this.f.add(i, hqVar);
            map.put(str, hqVar);
        }
    }

    public final void a(a2 a2Var, long j, nsd nsdVar) {
        String str = a2Var.d;
        Map map = this.g;
        defpackage.hq hqVar = (defpackage.hq) map.get(str);
        if (hqVar == null) {
            return;
        }
        defpackage.hq hqVar2 = new defpackage.hq(hqVar.getAdapterClassName(), pn7.f(j), nsdVar, hqVar.getCredentials(), hqVar.getName(), hqVar.getId(), hqVar.getInstanceName(), hqVar.getInstanceId());
        map.put(str, hqVar2);
        this.f.set(this.f.indexOf(hqVar), hqVar2);
    }
}
