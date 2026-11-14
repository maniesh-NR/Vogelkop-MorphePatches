package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class f9d {
    public final wv1 a;
    public final LinkedHashSet b = new LinkedHashSet();

    public f9d(wv1 wv1Var) {
        this.a = wv1Var;
    }

    public final void a(oup oupVar) {
        boolean z = oupVar instanceof d9d;
        wv1 wv1Var = this.a;
        if (!z) {
            if (!(oupVar instanceof e9d)) {
                h9o.p();
                return;
            } else {
                ((x5f) ((orm) wv1Var.b.get())).R(16, "Fetch error: ".concat(((e9d) oupVar).f));
                return;
            }
        }
        d9d d9dVar = (d9d) oupVar;
        String str = d9dVar.f;
        long j = d9dVar.g;
        if (this.b.add(new Pair(str, Long.valueOf(j)))) {
            StringBuilder sbQ = sko.q(j, "Bad adlist: size=", ", name='", new File(str).getName());
            sbQ.append("'");
            ((x5f) ((orm) wv1Var.b.get())).R(16, sbQ.toString());
        }
    }
}
