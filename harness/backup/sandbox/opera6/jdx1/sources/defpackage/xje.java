package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class xje {
    public final kqd a;
    public final cke b = new cke();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();

    public xje(kqd kqdVar) {
        this.a = kqdVar;
    }

    public static void a(xje xjeVar, zje zjeVar) {
        xjeVar.getClass();
        if (xjeVar.c.add(zjeVar)) {
            cke ckeVar = xjeVar.b;
            if (zjeVar.e != null) {
                j9h.t(zjeVar, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            ckeVar.e.addFirst(zjeVar);
            zjeVar.e = xjeVar;
            ckeVar.b();
        }
    }

    public final void b(bke bkeVar) {
        if (this.d.add(bkeVar)) {
            this.b.a(this, bkeVar, -1);
        }
    }

    public final void c(ecf ecfVar, int i) {
        if (i != 1 && i != 0) {
            bxl.d(sko.i(i, "Unsupported priority value: "));
        } else if (this.d.add(ecfVar)) {
            this.b.a(this, ecfVar, i);
        }
    }

    public final void d(bke bkeVar, wje wjeVar) {
        cke ckeVar = this.b;
        if (ckeVar.g == 0) {
            zje zjeVarC = ckeVar.c(-1);
            ckeVar.f = zjeVarC;
            ckeVar.g = -1;
            ckeVar.h = bkeVar;
            if (wjeVar != null) {
                if (zjeVarC != null) {
                    zjeVarC.d(wjeVar);
                }
                ckeVar.a.k((Object) null, new eke(wjeVar));
            }
        }
    }
}
