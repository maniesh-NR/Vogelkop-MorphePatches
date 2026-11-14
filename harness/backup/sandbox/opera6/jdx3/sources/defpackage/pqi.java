package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pqi {
    public final oqi a;
    public Map b;

    public pqi(Context context, umi umiVar) {
        oqi oqiVar = new oqi(this, context, umiVar);
        this.a = oqiVar;
        oqiVar.h();
    }

    public final pne a(pne pneVar) {
        String host;
        mqi[] mqiVarArr = mqi.a;
        Map map = this.b;
        if (map == null) {
            this.a.i();
            map = this.b;
        }
        String str = (String) map.get("bu");
        return (str == null || str.length() == 0 || (host = Uri.parse(str).getHost()) == null || host.length() == 0 || host.equals(pneVar.a)) ? pneVar : new pne(host, pneVar.b, l08.a);
    }

    public final jqi b(jqi jqiVar) throws NumberFormatException {
        Map map = this.b;
        if (map == null) {
            this.a.i();
            map = this.b;
        }
        if (map.isEmpty()) {
            return jqiVar;
        }
        String str = jqiVar.a;
        String str2 = jqiVar.k;
        long j = jqiVar.l;
        List list = jqiVar.n;
        Integer num = jqiVar.v;
        mqi[] mqiVarArr = mqi.a;
        String str3 = (String) map.getOrDefault("cc", jqiVar.b);
        String str4 = (String) map.getOrDefault("lc", jqiVar.c);
        String str5 = (String) map.getOrDefault("pl", jqiVar.d);
        String str6 = (String) map.getOrDefault("o", jqiVar.e);
        String str7 = (String) map.getOrDefault("b", jqiVar.f);
        String str8 = (String) map.getOrDefault("ai", jqiVar.g);
        String str9 = (String) map.getOrDefault("hi", jqiVar.h);
        String str10 = (String) map.getOrDefault("uc", jqiVar.i);
        ArrayList arrayListR = aik.r(false, (String) map.getOrDefault("rsd", CollectionsKt.P(jqiVar.j, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62)), ',');
        ArrayList arrayList = new ArrayList(k95.o(arrayListR, 10));
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            arrayList.add(Integer.valueOf(Integer.parseInt((String) obj)));
            arrayListR = arrayListR;
        }
        Set setN0 = CollectionsKt.n0(arrayList);
        mqi[] mqiVarArr2 = mqi.a;
        int i2 = Integer.parseInt((String) map.getOrDefault("usd", String.valueOf(jqiVar.m)));
        String str11 = (String) map.getOrDefault("cb", jqiVar.o);
        String str12 = (String) map.getOrDefault("rs", jqiVar.p);
        String str13 = (String) map.getOrDefault("v", jqiVar.q);
        String str14 = (String) map.getOrDefault("rc", jqiVar.r);
        String str15 = (String) map.getOrDefault("up", jqiVar.s);
        String str16 = (String) map.getOrDefault("ab", jqiVar.t);
        String str17 = (String) map.get("cw");
        return new jqi(str, str3, str4, str5, str6, str7, str8, str9, str10, setN0, str2, j, i2, list, str11, str12, str13, str14, str15, str16, str17 != null ? Boolean.valueOf(Boolean.parseBoolean(str17)) : jqiVar.u, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Map r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqi.c(java.util.Map, boolean):void");
    }
}
