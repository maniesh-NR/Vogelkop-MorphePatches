package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pdh implements ndh {
    public final pqi a;
    public final ndh b;

    public pdh(pqi pqiVar, ndh ndhVar) {
        this.a = pqiVar;
        this.b = ndhVar;
    }

    @Override // defpackage.ndh
    public final Set a() {
        mqi[] mqiVarArr = mqi.a;
        pqi pqiVar = this.a;
        Map map = pqiVar.b;
        if (map == null) {
            pqiVar.a.i();
            map = pqiVar.b;
        }
        String str = (String) map.get("rsd");
        if (str == null) {
            return this.b.a();
        }
        int i = 0;
        ArrayList arrayListR = aik.r(false, str, ',');
        ArrayList arrayList = new ArrayList(k95.o(arrayListR, 10));
        int size = arrayListR.size();
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            arrayList.add(Integer.valueOf(Integer.parseInt((String) obj)));
        }
        return CollectionsKt.n0(arrayList);
    }

    @Override // defpackage.ndh
    public final void b(int i) {
        mqi[] mqiVarArr = mqi.a;
        pqi pqiVar = this.a;
        Map map = pqiVar.b;
        oqi oqiVar = pqiVar.a;
        if (map == null) {
            oqiVar.i();
            map = pqiVar.b;
        }
        if (((String) map.get("rsd")) == null) {
            this.b.b(i);
            return;
        }
        String strP = CollectionsKt.P(b5j.f(a(), Integer.valueOf(i)), ",", (CharSequence) null, (String) null, 0, (Function1) null, 62);
        Map map2 = pqiVar.b;
        if (map2 == null) {
            oqiVar.i();
            map2 = pqiVar.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.put("rsd", strP);
        pqiVar.c(Collections.unmodifiableMap(linkedHashMap), oqiVar.l);
    }

    @Override // defpackage.ndh
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.ndh
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.ndh
    public final boolean e() {
        return this.b.e();
    }
}
