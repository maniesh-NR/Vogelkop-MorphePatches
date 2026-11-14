package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class evh {
    public final oj9 a;
    public final h1b b;
    public final long c;
    public final List d;
    public final bjh e;

    public evh(oj9 oj9Var, h1b h1bVar, kxi kxiVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        z4o.w(!h1bVar.isEmpty());
        this.a = oj9Var;
        this.b = h1b.s(h1bVar);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = kxiVar.a(this);
        long j = kxiVar.c;
        long j2 = kxiVar.b;
        String str = tym.a;
        this.c = tym.W(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public String b() {
        return null;
    }

    public abstract gb6 c();

    public bjh d() {
        return null;
    }
}
