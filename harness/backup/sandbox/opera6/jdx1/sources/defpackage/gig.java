package defpackage;

import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

/* loaded from: classes.dex */
public interface gig {
    void A(pf2 pf2Var, boolean z);

    void B(vjd vjdVar);

    boolean C(int i);

    void D(boolean z);

    void E(qjd qjdVar);

    boolean F();

    int G();

    void H(int i, qjd qjdVar);

    Looper I();

    void J();

    void K();

    nyl L();

    void M();

    int N();

    long O();

    cig P();

    qjd Q(int i);

    long R();

    void S(eig eigVar);

    long T();

    r4n U();

    float V();

    pf2 W();

    u67 X();

    void Y(int i, int i2);

    boolean Z();

    void a();

    long a0();

    void b(float f);

    void b0(int i, List list);

    void c(thg thgVar);

    boolean c0();

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    long d();

    vjd d0();

    void e(qjd qjdVar, long j);

    boolean e0();

    void f();

    int f0();

    qjd g();

    void g0(eig eigVar);

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    gql getCurrentTimeline();

    int getCurrentWindowIndex();

    long getDuration();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    thg getPlaybackParameters();

    int getPlaybackState();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    void h();

    void h0(int i, int i2);

    void i(int i, boolean z);

    void i0(int i, int i2, int i3);

    boolean isCurrentWindowSeekable();

    boolean isLoading();

    boolean isPlayingAd();

    void j();

    void j0(List list);

    void k(int i);

    boolean k0();

    void l(int i, int i2, List list);

    void l0(qjd qjdVar);

    void m(nyl nylVar);

    long m0();

    boolean n();

    void n0(int i);

    void o(int i);

    void o0();

    int p();

    void p0();

    void pause();

    void play();

    void q(int i, int i2);

    vjd q0();

    void r();

    void r0(List list);

    void release();

    rhg s();

    long s0();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void setPlayWhenReady(boolean z);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f);

    void stop();

    void t();

    boolean t0();

    void u();

    void v(int i);

    fzl w();

    void x(int i, List list, long j);

    boolean y();

    y36 z();
}
