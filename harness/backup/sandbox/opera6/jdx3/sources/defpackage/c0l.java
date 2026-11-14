package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c0l implements q9g {
    public static final dpj e = new dpj((byte) 4);
    public static c0l f;
    public final umi a;
    public final ydj b;
    public final qie c = new qie((byte) 19);
    public boolean d;

    public c0l(umi umiVar, ydj ydjVar) {
        this.a = umiVar;
        this.b = ydjVar;
    }

    @Override // defpackage.q9g
    public final void A() {
        Runnable rlVar = new rl((byte) 4);
        koj kojVar = new koj(this, (byte) 3);
        umi umiVar = this.a;
        nml nmlVarC = umiVar.c(kojVar);
        nmlVarC.b(umiVar.d(rlVar));
        this.c.n(new oml(nmlVarC), null);
    }

    public final void a() {
        gpk gpkVar = new gpk(this, (byte) 7);
        umi umiVar = this.a;
        nml nmlVarE = umiVar.e(gpkVar);
        nmlVarE.b(umiVar.f(new gpk(this, (byte) 8)));
        this.c.n(new oml(nmlVarE), null);
    }

    public final void b(HashMap map, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            jag jagVar = (jag) entry.getValue();
            if (!linkedHashMap.containsKey(str) && jagVar.a(lag.b, (kag) null) == kag.GRANTED) {
                rmj.a.j(System.currentTimeMillis(), true, str);
            }
        }
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            loj lojVar = (loj) it.next();
            lag lagVar = lojVar.b;
            if (lagVar != null ? lagVar.equals(lag.b) : true) {
                String str = lojVar.a;
                if (str.length() != 0) {
                    this.c.n(new oml(this.a.c(new et2(this, str))), null);
                }
            }
        }
    }
}
