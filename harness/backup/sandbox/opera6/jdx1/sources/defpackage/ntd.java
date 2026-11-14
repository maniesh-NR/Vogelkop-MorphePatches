package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ntd {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public ntd(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(mud mudVar, ndc ndcVar) {
        this.b.add(mudVar);
        this.a.run();
        tcc lifecycle = ndcVar.getLifecycle();
        HashMap map = this.c;
        mtd mtdVar = (mtd) map.remove(mudVar);
        if (mtdVar != null) {
            mtdVar.a.b(mtdVar.b);
            mtdVar.b = null;
        }
        map.put(mudVar, new mtd(lifecycle, new nd5(this, mudVar, (byte) 1)));
    }

    public final void b(mud mudVar) {
        this.b.remove(mudVar);
        mtd mtdVar = (mtd) this.c.remove(mudVar);
        if (mtdVar != null) {
            mtdVar.a.b(mtdVar.b);
            mtdVar.b = null;
        }
        this.a.run();
    }
}
