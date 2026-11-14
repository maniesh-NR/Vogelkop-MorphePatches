package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class k28 {
    public static final k28 f = new k28(h28.a, 1, v08.a);
    public final h28 a;
    public final byte b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final Set e;

    /* JADX WARN: Multi-variable type inference failed */
    public k28(h28 h28Var, int i, Set set) {
        this.a = h28Var;
        this.b = i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ip7 ip7Var = (ip7) it.next();
            wh4 wh4Var = new wh4(new a13(this.a, ip7Var), this.b);
            if (!new ArrayList(wh4Var.a.keySet()).isEmpty()) {
                this.c.put(ip7Var, wh4Var);
            }
        }
        this.e = this.c.keySet();
    }

    public final wh4 a(ip7 ip7Var) {
        boolean zB = ip7Var.b();
        LinkedHashMap linkedHashMap = this.c;
        if (zB) {
            return (wh4) linkedHashMap.get(ip7Var);
        }
        LinkedHashMap linkedHashMap2 = this.d;
        Object wh4Var = linkedHashMap2.get(ip7Var);
        if (wh4Var == null) {
            wh4Var = ui6.k(ip7Var, linkedHashMap.keySet()) ? new wh4(new a13(this.a, ip7Var), this.b) : null;
            linkedHashMap2.put(ip7Var, wh4Var);
        }
        return (wh4) wh4Var;
    }
}
