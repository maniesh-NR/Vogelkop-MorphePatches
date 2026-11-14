package defpackage;

/* loaded from: classes.dex */
public abstract class zje {
    public final alo a;
    public final l08 b;
    public final l08 c;
    public boolean d;
    public xje e;

    public zje(alo aloVar, boolean z) {
        this.a = aloVar;
        l08 l08Var = l08.a;
        this.b = l08Var;
        this.c = l08Var;
        this.d = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(wje wjeVar) {
    }

    public void d(wje wjeVar) {
        float f = wjeVar.c;
    }

    public final void e() {
        xje xjeVar = this.e;
        if (xjeVar == null || !xjeVar.c.remove(this)) {
            return;
        }
        cke ckeVar = xjeVar.b;
        if (equals(ckeVar.f)) {
            if (ckeVar.g == -1) {
                a();
            }
            ckeVar.f = null;
            ckeVar.g = 0;
            ckeVar.h = null;
        }
        ckeVar.d.remove(this);
        ckeVar.e.remove(this);
        this.e = null;
        ckeVar.b();
    }

    public final void f(boolean z) {
        if (this.d != z) {
            this.d = z;
            xje xjeVar = this.e;
            if (xjeVar != null) {
                xjeVar.b.b();
            }
        }
    }
}
