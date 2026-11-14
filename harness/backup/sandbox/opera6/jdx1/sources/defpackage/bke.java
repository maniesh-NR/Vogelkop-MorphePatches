package defpackage;

/* loaded from: classes.dex */
public abstract class bke {
    public xje a;
    public boolean b;

    public final void a() {
        xje xjeVar = this.a;
        if (xjeVar == null) {
            qp2.n("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            xjeVar.d(this, null);
        }
        cke ckeVar = xjeVar.b;
        if (equals(ckeVar.h) && -1 == ckeVar.g) {
            zje zjeVarC = ckeVar.f;
            if (zjeVarC == null) {
                zjeVarC = ckeVar.c(-1);
            }
            ckeVar.f = null;
            ckeVar.g = 0;
            ckeVar.h = null;
            if (zjeVarC != null) {
                zjeVarC.a();
            }
            ckeVar.a.k((Object) null, dke.j);
        }
        this.b = false;
    }

    public final void b() {
        xje xjeVar = this.a;
        if (xjeVar == null) {
            qp2.n("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            xjeVar.d(this, null);
        }
        cke ckeVar = xjeVar.b;
        kqd kqdVar = xjeVar.a;
        if (equals(ckeVar.h) && -1 == ckeVar.g) {
            zje zjeVarC = ckeVar.f;
            if (zjeVarC == null) {
                zjeVarC = ckeVar.c(-1);
            }
            ckeVar.f = null;
            ckeVar.g = 0;
            ckeVar.h = null;
            if (zjeVarC == null) {
                Runnable runnable = ((kcf) kqdVar.b).a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                zjeVarC.b();
            }
            ckeVar.a.k((Object) null, dke.j);
        }
        this.b = false;
    }

    public final void c(wje wjeVar) {
        xje xjeVar = this.a;
        if (xjeVar == null) {
            qp2.n("This input is not added to any dispatcher.");
            return;
        }
        if (this.b) {
            cke ckeVar = xjeVar.b;
            if (equals(ckeVar.h) && -1 == ckeVar.g) {
                zje zjeVarC = ckeVar.f;
                if (zjeVarC == null) {
                    zjeVarC = ckeVar.c(-1);
                }
                if (zjeVarC != null) {
                    zjeVarC.c(wjeVar);
                }
                ckeVar.a.k((Object) null, new eke(wjeVar));
            }
        }
    }

    public void d(boolean z) {
    }
}
