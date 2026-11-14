package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class lvh {
    public final List a;
    public final Map b;
    public final Map c;
    public final List d;
    public final wwh e;
    public final f9b f;

    public lvh(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, wwh wwhVar, int i) {
        this(list, (i & 2) != 0 ? n08.a : linkedHashMap, (i & 4) != 0 ? n08.a : linkedHashMap2, (i & 8) != 0 ? l08.a : arrayList, (i & 16) != 0 ? null : wwhVar, (f9b) null);
    }

    public lvh(List list, Map map, Map map2, List list2, wwh wwhVar, f9b f9bVar) {
        this.a = list;
        this.b = map;
        this.c = map2;
        this.d = list2;
        this.e = wwhVar;
        this.f = f9bVar;
    }

    public final String toString() {
        String str;
        wwh wwhVar = this.e;
        if (wwhVar == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) wwh.b(wwhVar.a));
        }
        return "Request(streams=" + this.a + str + ")@" + Integer.toHexString(hashCode());
    }
}
