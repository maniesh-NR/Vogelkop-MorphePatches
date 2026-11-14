package defpackage;

/* loaded from: classes.dex */
public final class mig extends hkg {
    public final lig c;
    public tjg d;
    public final c5o e = new c5o((byte) 29);
    public final fql f = new fql();
    public final isd g = new isd(this);
    public boolean h;
    public final kig i;

    public mig(lig ligVar) {
        gig gigVar;
        jig jigVar = new jig(this);
        this.i = new kig(this);
        this.c = ligVar;
        eig eigVar = this.b;
        if (eigVar != jigVar) {
            if (eigVar != null && (gigVar = this.a) != null) {
                gigVar.g0(eigVar);
            }
            this.b = jigVar;
            gig gigVar2 = this.a;
            if (gigVar2 != null) {
                gigVar2.S(jigVar);
            }
        }
    }

    public static void f(gig gigVar, long j) {
        long currentPosition = gigVar.getCurrentPosition() + j;
        long duration = gigVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        gigVar.seekTo(Math.max(currentPosition, 0L));
    }

    @Override // defpackage.hkg
    public final void a(xbf xbfVar) {
        super.a(xbfVar);
        this.d = (tjg) xbfVar.b;
        g();
    }

    @Override // defpackage.hkg
    public final void b(xbf xbfVar) {
        super.b(xbfVar);
        this.d = null;
        vml.a((vdf) this.g.b);
    }

    @Override // defpackage.hkg
    public final void d(gig gigVar) {
        g();
    }

    public final boolean e() {
        int playbackState = c().getPlaybackState();
        if (playbackState != 1 && playbackState != 4 && c().getPlayWhenReady()) {
            c().setPlayWhenReady(false);
            return false;
        }
        int playbackState2 = c().getPlaybackState();
        if (playbackState2 == 1) {
            c().a();
        } else if (playbackState2 == 4) {
            c().seekTo(c().getCurrentWindowIndex(), -9223372036854775807L);
        }
        c().setPlayWhenReady(true);
        return true;
    }

    public final void g() {
        i();
        h();
        int repeatMode = c().getRepeatMode();
        lig ligVar = this.c;
        ligVar.setRepeatMode(repeatMode);
        ligVar.g(c().getShuffleModeEnabled());
        k();
        qjd qjdVarG = c().g();
        vjd vjdVar = qjdVarG != null ? qjdVarG.e : vjd.K;
        ligVar.i(vjdVar.a, vjdVar.f);
    }

    public final void h() {
        boolean z;
        boolean z2;
        gql currentTimeline = c().getCurrentTimeline();
        if (currentTimeline.p() || c().isPlayingAd()) {
            z = false;
            z2 = false;
        } else {
            int currentWindowIndex = c().getCurrentWindowIndex();
            fql fqlVar = this.f;
            currentTimeline.n(currentWindowIndex, fqlVar);
            boolean z3 = fqlVar.g;
            boolean z4 = z3 || !fqlVar.h || c().Z();
            z2 = z3;
            z = fqlVar.h || c().y();
            z = z4;
        }
        boolean z5 = z2;
        lig ligVar = this.c;
        ligVar.f(z, z);
        ligVar.j(z2, z5, z5);
    }

    public final void i() {
        boolean z = (c().getPlaybackState() == 4 || c().getPlaybackState() == 1 || !c().getPlayWhenReady()) ? false : true;
        boolean z2 = c().g() != null;
        lig ligVar = this.c;
        ligVar.d(z, z2);
        ligVar.a(c().getPlaybackState());
    }

    public final void j() {
        long currentPosition = c().getCurrentPosition();
        if (!this.h) {
            String strT = this.e.t(currentPosition);
            lig ligVar = this.c;
            ligVar.h(strT);
            ligVar.e(currentPosition);
        }
        int playbackState = c().getPlaybackState();
        boolean zE0 = c().e0();
        isd isdVar = this.g;
        if (!zE0 && (playbackState == 4 || playbackState == 1)) {
            vml.a((vdf) isdVar.b);
            return;
        }
        vdf vdfVar = (vdf) isdVar.b;
        vml.a(vdfVar);
        vml.d(vdfVar, 1000L);
    }

    public final void k() {
        long duration = c().getDuration();
        lig ligVar = this.c;
        if (duration == -9223372036854775807L) {
            ligVar.c("");
            ligVar.b(0L);
        } else {
            ligVar.c(this.e.t(duration));
            ligVar.b(duration);
        }
        j();
    }
}
