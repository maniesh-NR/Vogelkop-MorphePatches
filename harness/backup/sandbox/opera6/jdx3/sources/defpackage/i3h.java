package defpackage;

import com.opera.android.suggestion.Suggestion;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class i3h implements odb {
    public final x5f a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public i3h(x5f x5fVar) {
        this.a = x5fVar;
    }

    public final void a(Suggestion suggestion) {
        Object obj = suggestion.k;
        if (obj != null) {
            c3h c3hVar = (c3h) obj;
            String str = c3hVar.c;
            if (this.c.add(str.concat(c3hVar.g))) {
                h3h h3hVar = new h3h(c3hVar.h, str);
                LinkedHashMap linkedHashMap = this.b;
                Object g3hVar = linkedHashMap.get(h3hVar);
                if (g3hVar == null) {
                    g3hVar = new g3h();
                    linkedHashMap.put(h3hVar, g3hVar);
                }
                ((g3h) g3hVar).a++;
            }
        }
    }

    public final void b(Suggestion suggestion) {
        Object obj = suggestion.k;
        if (obj == null) {
            return;
        }
        c3h c3hVar = (c3h) obj;
        h3h h3hVar = new h3h(c3hVar.h, c3hVar.c);
        LinkedHashMap linkedHashMap = this.b;
        Object g3hVar = linkedHashMap.get(h3hVar);
        if (g3hVar == null) {
            g3hVar = new g3h();
            linkedHashMap.put(h3hVar, g3hVar);
        }
        ((g3h) g3hVar).b++;
    }

    public final void reset() {
        LinkedHashMap linkedHashMap = this.b;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            h3h h3hVar = (h3h) entry.getKey();
            g3h g3hVar = (g3h) entry.getValue();
            String str = h3hVar.a;
            String str2 = h3hVar.b;
            long j = g3hVar.a;
            long j2 = g3hVar.b;
            x5f x5fVar = this.a;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new ck0(zpaVar, x56VarF).j(new ao3(j, j2, str, str2));
                x5fVar.U0(x56VarF);
            }
        }
        linkedHashMap.clear();
        this.c.clear();
    }
}
