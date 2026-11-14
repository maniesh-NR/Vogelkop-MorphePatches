package defpackage;

import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gk9 implements gig {
    public final gig b;
    public final IdentityHashMap c = new IdentityHashMap();

    public gk9(gig gigVar) {
        this.b = gigVar;
    }

    @Override // defpackage.gig
    public final void A(pf2 pf2Var, boolean z) {
        this.b.A(pf2Var, z);
    }

    @Override // defpackage.gig
    public void B(vjd vjdVar) {
        this.b.B(vjdVar);
    }

    @Override // defpackage.gig
    public boolean C(int i) {
        return this.b.C(i);
    }

    @Override // defpackage.gig
    public void D(boolean z) {
        this.b.D(z);
    }

    @Override // defpackage.gig
    public void E(qjd qjdVar) {
        this.b.E(qjdVar);
    }

    @Override // defpackage.gig
    public boolean F() {
        return this.b.F();
    }

    @Override // defpackage.gig
    public int G() {
        return this.b.G();
    }

    @Override // defpackage.gig
    public void H(int i, qjd qjdVar) {
        this.b.H(i, qjdVar);
    }

    @Override // defpackage.gig
    public final Looper I() {
        return this.b.I();
    }

    @Override // defpackage.gig
    public void J() {
        this.b.J();
    }

    @Override // defpackage.gig
    public void K() {
        this.b.K();
    }

    @Override // defpackage.gig
    public nyl L() {
        return this.b.L();
    }

    @Override // defpackage.gig
    public void M() {
        this.b.M();
    }

    @Override // defpackage.gig
    public int N() {
        return this.b.N();
    }

    @Override // defpackage.gig
    public long O() {
        return this.b.O();
    }

    @Override // defpackage.gig
    public cig P() {
        return this.b.P();
    }

    @Override // defpackage.gig
    public qjd Q(int i) {
        return this.b.Q(i);
    }

    @Override // defpackage.gig
    public long R() {
        return this.b.R();
    }

    @Override // defpackage.gig
    public void S(eig eigVar) {
        synchronized (this.c) {
            fk9 fk9Var = (fk9) this.c.get(eigVar);
            if (fk9Var == null) {
                fk9Var = new fk9(this, eigVar);
            }
            this.b.S(fk9Var);
            this.c.put(eigVar, fk9Var);
        }
    }

    @Override // defpackage.gig
    public long T() {
        return this.b.T();
    }

    @Override // defpackage.gig
    public r4n U() {
        return this.b.U();
    }

    @Override // defpackage.gig
    public float V() {
        return this.b.V();
    }

    @Override // defpackage.gig
    public pf2 W() {
        return this.b.W();
    }

    @Override // defpackage.gig
    public u67 X() {
        return this.b.X();
    }

    @Override // defpackage.gig
    public void Y(int i, int i2) {
        this.b.Y(i, i2);
    }

    @Override // defpackage.gig
    public boolean Z() {
        return this.b.Z();
    }

    @Override // defpackage.gig
    public void a() {
        this.b.a();
    }

    @Override // defpackage.gig
    public long a0() {
        return this.b.a0();
    }

    @Override // defpackage.gig
    public void b(float f) {
        this.b.b(f);
    }

    @Override // defpackage.gig
    public void b0(int i, List list) {
        this.b.b0(i, list);
    }

    @Override // defpackage.gig
    public void c(thg thgVar) {
        this.b.c(thgVar);
    }

    @Override // defpackage.gig
    public boolean c0() {
        return this.b.c0();
    }

    @Override // defpackage.gig
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        this.b.clearVideoSurfaceView(surfaceView);
    }

    @Override // defpackage.gig
    public void clearVideoTextureView(TextureView textureView) {
        this.b.clearVideoTextureView(textureView);
    }

    @Override // defpackage.gig
    public long d() {
        return this.b.d();
    }

    @Override // defpackage.gig
    public vjd d0() {
        return this.b.d0();
    }

    @Override // defpackage.gig
    public void e(qjd qjdVar, long j) {
        this.b.e(qjdVar, j);
    }

    @Override // defpackage.gig
    public boolean e0() {
        return this.b.e0();
    }

    @Override // defpackage.gig
    public void f() {
        this.b.f();
    }

    @Override // defpackage.gig
    public int f0() {
        return this.b.f0();
    }

    @Override // defpackage.gig
    public qjd g() {
        return this.b.g();
    }

    @Override // defpackage.gig
    public void g0(eig eigVar) {
        synchronized (this.c) {
            eig eigVar2 = (eig) this.c.remove(eigVar);
            gig gigVar = this.b;
            if (eigVar2 != null) {
                eigVar = eigVar2;
            }
            gigVar.g0(eigVar);
        }
    }

    @Override // defpackage.gig
    public int getBufferedPercentage() {
        return this.b.getBufferedPercentage();
    }

    @Override // defpackage.gig
    public long getBufferedPosition() {
        return this.b.getBufferedPosition();
    }

    @Override // defpackage.gig
    public long getContentPosition() {
        return this.b.getContentPosition();
    }

    @Override // defpackage.gig
    public int getCurrentAdGroupIndex() {
        return this.b.getCurrentAdGroupIndex();
    }

    @Override // defpackage.gig
    public int getCurrentAdIndexInAdGroup() {
        return this.b.getCurrentAdIndexInAdGroup();
    }

    @Override // defpackage.gig
    public int getCurrentPeriodIndex() {
        return this.b.getCurrentPeriodIndex();
    }

    @Override // defpackage.gig
    public long getCurrentPosition() {
        return this.b.getCurrentPosition();
    }

    @Override // defpackage.gig
    public gql getCurrentTimeline() {
        return this.b.getCurrentTimeline();
    }

    @Override // defpackage.gig
    public int getCurrentWindowIndex() {
        return this.b.getCurrentWindowIndex();
    }

    @Override // defpackage.gig
    public long getDuration() {
        return this.b.getDuration();
    }

    @Override // defpackage.gig
    public int getNextWindowIndex() {
        return this.b.getNextWindowIndex();
    }

    @Override // defpackage.gig
    public boolean getPlayWhenReady() {
        return this.b.getPlayWhenReady();
    }

    @Override // defpackage.gig
    public thg getPlaybackParameters() {
        return this.b.getPlaybackParameters();
    }

    @Override // defpackage.gig
    public int getPlaybackState() {
        return this.b.getPlaybackState();
    }

    @Override // defpackage.gig
    public int getRepeatMode() {
        return this.b.getRepeatMode();
    }

    @Override // defpackage.gig
    public boolean getShuffleModeEnabled() {
        return this.b.getShuffleModeEnabled();
    }

    @Override // defpackage.gig
    public void h() {
        this.b.h();
    }

    @Override // defpackage.gig
    public void h0(int i, int i2) {
        this.b.h0(i, i2);
    }

    @Override // defpackage.gig
    public void i(int i, boolean z) {
        this.b.i(i, z);
    }

    @Override // defpackage.gig
    public void i0(int i, int i2, int i3) {
        this.b.i0(i, i2, i3);
    }

    @Override // defpackage.gig
    public final boolean isCurrentWindowSeekable() {
        return this.b.isCurrentWindowSeekable();
    }

    @Override // defpackage.gig
    public boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // defpackage.gig
    public boolean isPlayingAd() {
        return this.b.isPlayingAd();
    }

    @Override // defpackage.gig
    public void j() {
        this.b.j();
    }

    @Override // defpackage.gig
    public void j0(List list) {
        this.b.j0(list);
    }

    @Override // defpackage.gig
    public void k(int i) {
        this.b.k(i);
    }

    @Override // defpackage.gig
    public boolean k0() {
        return this.b.k0();
    }

    @Override // defpackage.gig
    public void l(int i, int i2, List list) {
        this.b.l(i, i2, list);
    }

    @Override // defpackage.gig
    public void l0(qjd qjdVar) {
        this.b.l0(qjdVar);
    }

    @Override // defpackage.gig
    public void m(nyl nylVar) {
        this.b.m(nylVar);
    }

    @Override // defpackage.gig
    public long m0() {
        return this.b.m0();
    }

    @Override // defpackage.gig
    public final boolean n() {
        return this.b.n();
    }

    @Override // defpackage.gig
    public void n0(int i) {
        this.b.n0(i);
    }

    @Override // defpackage.gig
    public void o(int i) {
        this.b.o(i);
    }

    @Override // defpackage.gig
    public void o0() {
        this.b.o0();
    }

    @Override // defpackage.gig
    public int p() {
        return this.b.p();
    }

    @Override // defpackage.gig
    public void p0() {
        this.b.p0();
    }

    @Override // defpackage.gig
    public void pause() {
        this.b.pause();
    }

    @Override // defpackage.gig
    public void play() {
        this.b.play();
    }

    @Override // defpackage.gig
    public void q(int i, int i2) {
        this.b.q(i, i2);
    }

    @Override // defpackage.gig
    public vjd q0() {
        return this.b.q0();
    }

    @Override // defpackage.gig
    public void r() {
        this.b.r();
    }

    @Override // defpackage.gig
    public void r0(List list) {
        this.b.r0(list);
    }

    @Override // defpackage.gig
    public void release() {
        this.b.release();
    }

    @Override // defpackage.gig
    public rhg s() {
        return this.b.s();
    }

    @Override // defpackage.gig
    public long s0() {
        return this.b.s0();
    }

    @Override // defpackage.gig
    public void seekTo(int i, long j) {
        this.b.seekTo(i, j);
    }

    @Override // defpackage.gig
    public void seekTo(long j) {
        this.b.seekTo(j);
    }

    @Override // defpackage.gig
    public void seekToDefaultPosition() {
        this.b.seekToDefaultPosition();
    }

    @Override // defpackage.gig
    public void seekToDefaultPosition(int i) {
        this.b.seekToDefaultPosition(i);
    }

    @Override // defpackage.gig
    public void setPlayWhenReady(boolean z) {
        this.b.setPlayWhenReady(z);
    }

    @Override // defpackage.gig
    public void setRepeatMode(int i) {
        this.b.setRepeatMode(i);
    }

    @Override // defpackage.gig
    public void setShuffleModeEnabled(boolean z) {
        this.b.setShuffleModeEnabled(z);
    }

    @Override // defpackage.gig
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.b.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // defpackage.gig
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        this.b.setVideoSurfaceView(surfaceView);
    }

    @Override // defpackage.gig
    public void setVideoTextureView(TextureView textureView) {
        this.b.setVideoTextureView(textureView);
    }

    @Override // defpackage.gig
    public void setVolume(float f) {
        this.b.setVolume(f);
    }

    @Override // defpackage.gig
    public void stop() {
        this.b.stop();
    }

    @Override // defpackage.gig
    public void t() {
        this.b.t();
    }

    @Override // defpackage.gig
    public boolean t0() {
        return this.b.t0();
    }

    @Override // defpackage.gig
    public void u() {
        this.b.u();
    }

    @Override // defpackage.gig
    public void v(int i) {
        this.b.v(i);
    }

    @Override // defpackage.gig
    public fzl w() {
        return this.b.w();
    }

    @Override // defpackage.gig
    public void x(int i, List list, long j) {
        this.b.x(i, list, j);
    }

    @Override // defpackage.gig
    public boolean y() {
        return this.b.y();
    }

    @Override // defpackage.gig
    public y36 z() {
        return this.b.z();
    }
}
