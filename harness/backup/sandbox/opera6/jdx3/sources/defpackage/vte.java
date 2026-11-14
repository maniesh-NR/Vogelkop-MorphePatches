package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class vte extends oh4 {
    public final /* synthetic */ wte b;

    public vte(wte wteVar) {
        this.b = wteVar;
    }

    @Override // defpackage.oh4
    public final void b() {
        wte wteVar = this.b;
        wteVar.r = null;
        wteVar.p = null;
        e();
    }

    @Override // defpackage.oh4
    public final void d(Object obj) {
        nre nreVar = (nre) obj;
        if ((nreVar != null ? nreVar.c : null) == null) {
            return;
        }
        l0c l0cVar = nreVar.c;
        wte wteVar = this.b;
        wteVar.r = l0cVar;
        wteVar.p = nreVar.g;
        List list = nreVar.e;
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((yqe) it.next()).a()) {
                    z = true;
                    break;
                }
            }
        }
        wteVar.o = z;
        wteVar.b.b = new x77(nreVar);
        wteVar.b();
    }

    @Override // defpackage.oh4
    public final void e() {
        this.b.c.c().g(this);
    }
}
