package defpackage;

/* loaded from: classes.dex */
public final class z9l implements jjm, kjm {
    public final b2l a;
    public final int b;
    public final jjm c;
    public final boolean d;
    public kjm e;

    public z9l(b2l b2lVar, int i, jjm jjmVar, boolean z) {
        this.a = b2lVar;
        this.b = i;
        this.c = jjmVar;
        this.d = z;
    }

    @Override // defpackage.jjm
    public final void finish(hjm hjmVar) {
        this.c.finish(hjm.b);
    }

    @Override // defpackage.jjm
    public final ijm getDefaultPriority() {
        return this.c.getDefaultPriority();
    }

    @Override // defpackage.kjm
    public final void o(jjm jjmVar, hjm hjmVar) {
        this.e.o(this, hjmVar);
    }

    @Override // defpackage.jjm
    public final void setRequestDismisser(kjm kjmVar) {
        this.c.setRequestDismisser(this);
        this.e = kjmVar;
    }
}
