package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class kw6 {
    public final Map a;
    public final HashMap b;

    public kw6(k2j k2jVar) {
        iw6 iw6Var;
        this.a = (k2jVar == null || (iw6Var = (iw6) k2jVar.a(iw6.Companion.serializer())) == null) ? null : iw6Var.a;
        this.b = new HashMap();
    }

    public final Object a(String str, KSerializer kSerializer) {
        k2j k2jVar;
        Map map = this.a;
        if (map == null || (k2jVar = (k2j) map.remove(str)) == null) {
            return null;
        }
        return k2jVar.a(kSerializer);
    }

    public final void b(String str, KSerializer kSerializer, Function0 function0) {
        HashMap map = this.b;
        if (map.containsKey(str)) {
            t14.c(sko.j("Another supplier is already registered with the key: ", str));
        } else {
            map.put(str, new jw6(kSerializer, function0));
        }
    }

    public final k2j c() {
        Map map = this.a;
        HashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new HashMap();
        Iterator it = this.b.entrySet().iterator();
        while (true) {
            k2j k2jVar = null;
            if (!it.hasNext()) {
                iw6 iw6Var = new iw6(linkedHashMap);
                KSerializer kSerializerSerializer = iw6.Companion.serializer();
                k2j k2jVar2 = new k2j(null);
                k2jVar2.b = new n9h((byte) 3, iw6Var, kSerializerSerializer, false);
                k2jVar2.a = null;
                return k2jVar2;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            jw6 jw6Var = (jw6) entry.getValue();
            Object objInvoke = jw6Var.b.invoke();
            if (objInvoke != null) {
                KSerializer kSerializer = jw6Var.a;
                k2j k2jVar3 = new k2j(null);
                k2jVar3.b = new n9h((byte) 3, objInvoke, kSerializer, false);
                k2jVar3.a = null;
                k2jVar = k2jVar3;
            }
            if (k2jVar != null) {
                linkedHashMap.put(str, k2jVar);
            }
        }
    }
}
