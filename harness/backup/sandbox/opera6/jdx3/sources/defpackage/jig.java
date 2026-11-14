package defpackage;

/* loaded from: classes.dex */
public final class jig implements eig {
    public final /* synthetic */ mig a;

    public jig(mig migVar) {
        this.a = migVar;
    }

    public final void K(gql gqlVar, int i) {
        mig migVar = this.a;
        migVar.h();
        migVar.k();
        qjd qjdVarG = migVar.c().g();
        vjd vjdVar = qjdVarG != null ? qjdVarG.e : vjd.K;
        migVar.c.i(vjdVar.a, vjdVar.f);
    }

    public final void P(boolean z) {
        this.a.j();
    }

    public final void h(int i) {
        mig migVar = this.a;
        migVar.i();
        migVar.j();
    }

    public final void onPositionDiscontinuity(int i) {
        mig migVar = this.a;
        migVar.h();
        migVar.k();
        qjd qjdVarG = migVar.c().g();
        vjd vjdVar = qjdVarG != null ? qjdVarG.e : vjd.K;
        migVar.c.i(vjdVar.a, vjdVar.f);
    }

    public final void onRepeatModeChanged(int i) {
        mig migVar = this.a;
        migVar.c.setRepeatMode(migVar.c().getRepeatMode());
        migVar.h();
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        mig migVar = this.a;
        migVar.c.g(migVar.c().getShuffleModeEnabled());
        migVar.h();
    }

    public final void z(int i, boolean z) {
        mig migVar = this.a;
        migVar.i();
        migVar.j();
    }
}
