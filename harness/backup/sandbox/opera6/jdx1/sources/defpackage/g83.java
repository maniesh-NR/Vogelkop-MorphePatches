package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class g83 implements gig {
    public final fql b = new fql();

    @Override // defpackage.gig
    public final boolean C(int i) {
        return P().a(i);
    }

    @Override // defpackage.gig
    public final void E(qjd qjdVar) {
        r0(h1b.v(qjdVar));
    }

    @Override // defpackage.gig
    public final boolean F() {
        gql currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f0(), this.b, 0L).h;
    }

    @Override // defpackage.gig
    public final void H(int i, qjd qjdVar) {
        l(i, i + 1, h1b.v(qjdVar));
    }

    @Override // defpackage.gig
    public final void M() {
        if (getCurrentTimeline().p() || isPlayingAd()) {
            v0(9);
            return;
        }
        if (!y()) {
            if (t0() && F()) {
                w0(f0(), -9223372036854775807L, false);
                return;
            } else {
                v0(9);
                return;
            }
        }
        int iU0 = u0();
        if (iU0 == -1) {
            v0(9);
        } else if (iU0 == f0()) {
            w0(f0(), -9223372036854775807L, true);
        } else {
            w0(iU0, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gig
    public final long O() {
        gql currentTimeline = getCurrentTimeline();
        if (!currentTimeline.p()) {
            int iF0 = f0();
            fql fqlVar = this.b;
            if (currentTimeline.m(iF0, fqlVar, 0L).e != -9223372036854775807L) {
                return (tym.z(fqlVar.f) - fqlVar.e) - getContentPosition();
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gig
    public final qjd Q(int i) {
        return getCurrentTimeline().m(i, this.b, 0L).b;
    }

    @Override // defpackage.gig
    public final long T() {
        gql currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return -9223372036854775807L;
        }
        return tym.c0(currentTimeline.m(f0(), this.b, 0L).l);
    }

    @Override // defpackage.gig
    public final boolean Z() {
        int iK;
        gql currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iK = -1;
        } else {
            int iF0 = f0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK = currentTimeline.k(iF0, repeatMode, getShuffleModeEnabled());
        }
        return iK != -1;
    }

    @Override // defpackage.gig
    public final void b(float f) {
        c(new thg(f, getPlaybackParameters().b));
    }

    @Override // defpackage.gig
    public final boolean c0() {
        gql currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f0(), this.b, 0L).g;
    }

    @Override // defpackage.gig
    public final void e(qjd qjdVar, long j) {
        x(0, h1b.v(qjdVar), j);
    }

    @Override // defpackage.gig
    public final boolean e0() {
        return getPlaybackState() == 3 && getPlayWhenReady() && G() == 0;
    }

    @Override // defpackage.gig
    public final void f() {
        q(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.gig
    public final qjd g() {
        gql currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return null;
        }
        return currentTimeline.m(f0(), this.b, 0L).b;
    }

    @Override // defpackage.gig
    public final int getBufferedPercentage() {
        if (!C(16)) {
            return 0;
        }
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return tym.i(tym.R(bufferedPosition, duration), 0, 100);
    }

    @Override // defpackage.gig
    public final int getCurrentWindowIndex() {
        return f0();
    }

    @Override // defpackage.gig
    public final int getNextWindowIndex() {
        return u0();
    }

    @Override // defpackage.gig
    public final void h() {
        x0(6);
    }

    @Override // defpackage.gig
    public final void h0(int i, int i2) {
        if (i != i2) {
            i0(i, i + 1, i2);
        }
    }

    @Override // defpackage.gig
    public final boolean isCurrentWindowSeekable() {
        return c0();
    }

    @Override // defpackage.gig
    public final void j0(List list) {
        b0(Integer.MAX_VALUE, list);
    }

    @Override // defpackage.gig
    public final void l0(qjd qjdVar) {
        r0(h1b.v(qjdVar));
    }

    @Override // defpackage.gig
    public final boolean n() {
        return true;
    }

    @Override // defpackage.gig
    public final void o(int i) {
        q(i, i + 1);
    }

    @Override // defpackage.gig
    public final void o0() {
        long currentPosition = getCurrentPosition() + a0();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        w0(f0(), Math.max(currentPosition, 0L), false);
    }

    @Override // defpackage.gig
    public final int p() {
        return getCurrentTimeline().o();
    }

    @Override // defpackage.gig
    public final void p0() {
        long currentPosition = getCurrentPosition() + (-s0());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        w0(f0(), Math.max(currentPosition, 0L), false);
    }

    @Override // defpackage.gig
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // defpackage.gig
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // defpackage.gig
    public final void r() {
        if (getCurrentTimeline().p() || isPlayingAd()) {
            v0(7);
            return;
        }
        boolean Z = Z();
        if (t0() && !c0()) {
            if (Z) {
                x0(7);
                return;
            } else {
                v0(7);
                return;
            }
        }
        if (!Z || getCurrentPosition() > R()) {
            w0(f0(), 0L, false);
        } else {
            x0(7);
        }
    }

    @Override // defpackage.gig
    public final void seekTo(int i, long j) {
        w0(i, j, false);
    }

    @Override // defpackage.gig
    public final void seekTo(long j) {
        w0(f0(), j, false);
    }

    @Override // defpackage.gig
    public final void seekToDefaultPosition() {
        w0(f0(), -9223372036854775807L, false);
    }

    @Override // defpackage.gig
    public final void seekToDefaultPosition(int i) {
        w0(i, -9223372036854775807L, false);
    }

    @Override // defpackage.gig
    public final boolean t0() {
        gql currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f0(), this.b, 0L).a();
    }

    @Override // defpackage.gig
    public final void u() {
        int iU0 = u0();
        if (iU0 == -1) {
            v0(8);
        } else if (iU0 == f0()) {
            w0(f0(), -9223372036854775807L, true);
        } else {
            w0(iU0, -9223372036854775807L, false);
        }
    }

    public final int u0() {
        gql currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return -1;
        }
        int iF0 = f0();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.e(iF0, repeatMode, getShuffleModeEnabled());
    }

    public final void v0(int i) {
        w0(-1, -9223372036854775807L, false);
    }

    public abstract void w0(int i, long j, boolean z);

    public final void x0(int i) {
        int iK;
        gql currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iK = -1;
        } else {
            int iF0 = f0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK = currentTimeline.k(iF0, repeatMode, getShuffleModeEnabled());
        }
        if (iK == -1) {
            v0(i);
        } else if (iK == f0()) {
            w0(f0(), -9223372036854775807L, true);
        } else {
            w0(iK, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gig
    public final boolean y() {
        return u0() != -1;
    }
}
