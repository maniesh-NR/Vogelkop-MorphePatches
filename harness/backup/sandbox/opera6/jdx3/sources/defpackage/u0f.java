package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class u0f implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x0f b;

    public /* synthetic */ u0f(x0f x0fVar, byte b) {
        this.a = b;
        this.b = x0fVar;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        x0f x0fVar = this.b;
        switch (b) {
            case 0:
                Set set = (Set) obj;
                int iA = qbd.a(k95.o(set, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : set) {
                    int iM = wbh.m(x0fVar.a, (String) obj2);
                    linkedHashMap.put(obj2, iM != -1 ? iM != 0 ? iM != 1 ? v0f.a : v0f.c : v0f.b : v0f.a);
                }
                return linkedHashMap;
            case 1:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    v0f v0fVar = (v0f) entry.getValue();
                    ode odeVar = (ode) x0fVar.d.get(str);
                    if (odeVar != null) {
                        xf8.E0(odeVar, v0fVar);
                    }
                }
                return Unit.a;
            case 2:
                x0fVar.getClass();
                Iterator it = ((Set) obj).iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    int iM2 = wbh.m(x0fVar.a, (String) it.next());
                    if ((iM2 != -1 ? iM2 != 0 ? iM2 != 1 ? v0f.a : v0f.c : v0f.b : v0f.a) == v0f.c) {
                        z = true;
                    } else {
                        z2 = true;
                    }
                }
                return z ? z2 ? w0f.c : w0f.a : w0f.b;
            default:
                return Boolean.valueOf(xf8.E0(x0fVar.e, (w0f) obj));
        }
    }
}
