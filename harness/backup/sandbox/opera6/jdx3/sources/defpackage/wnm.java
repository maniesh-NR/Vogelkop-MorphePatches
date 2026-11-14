package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class wnm extends tsd {
    public final Function0 m;
    public final Function0 n;
    public final LinkedHashSet o;

    public wnm(Object obj, Iterable iterable, Function0 function0, Function0 function02) {
        super(obj);
        this.m = function0;
        this.n = function02;
        this.o = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t((ekc) it.next());
        }
    }

    @Override // defpackage.tsd
    public final void s(ekc ekcVar, f7f f7fVar) {
        this.o.add(ekcVar);
        super.s(ekcVar, new o2g(this, ekcVar, f7fVar));
    }

    public final void t(ekc ekcVar) {
        this.o.add(ekcVar);
        super.s(ekcVar, new o2g(this, ekcVar, (f7f) null));
    }

    public final void u() {
        if (((Boolean) this.m.invoke()).booleanValue()) {
            r(this.n.invoke());
        }
    }
}
