package defpackage;

/* loaded from: classes.dex */
public abstract class p1f implements w6f {
    public final i7f a = new i7f();
    public final nrl b = new nrl((byte) 26);
    public final Runnable c;
    public Boolean d;

    public p1f(Runnable runnable) {
        this.c = runnable;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        if (this.a.b((t1f) obj)) {
            this.c.run();
        }
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        if (this.a.c((t1f) obj)) {
            this.c.run();
        }
    }

    public abstract boolean a();

    public final void b() {
        i7f i7fVar = this.a;
        if (i7fVar.c == 0) {
            return;
        }
        boolean zA = a();
        Boolean bool = this.d;
        if (bool == null || zA != bool.booleanValue()) {
            this.d = Boolean.valueOf(zA);
            g7f g7fVar = new g7f(i7fVar);
            while (g7fVar.hasNext()) {
                ((t1f) g7fVar.next()).a(this.d.booleanValue());
            }
        }
    }
}
