package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ghd implements gig {
    public final fql b;
    public boolean c;
    public final gid d;
    public final a36 e;
    public final Handler f;
    public final long g;
    public boolean h;
    public final mhd i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [ssa] */
    public ghd(Context context, m4j m4jVar, a36 a36Var, Looper looper, mhd mhdVar) {
        psa psaVar;
        Bundle bundle = Bundle.EMPTY;
        z4o.D(m4jVar, "token must not be null");
        w7d.G("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + tym.a + "]");
        this.b = new fql();
        this.g = -9223372036854775807L;
        this.e = a36Var;
        this.f = new Handler(looper);
        this.i = mhdVar;
        gid gidVar = new gid(context, this, m4jVar, looper);
        this.d = gidVar;
        IBinder iBinder = gidVar.e.a.e;
        iBinder.getClass();
        IBinder iBinder2 = iBinder;
        int i = xqd.g;
        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ssa)) {
            psa psaVar2 = new psa();
            psaVar2.a = iBinder2;
            psaVar = psaVar2;
        } else {
            psaVar = (ssa) iInterfaceQueryLocalInterface;
        }
        int iJ = gidVar.b.j();
        String packageName = gidVar.d.getPackageName();
        int iMyPid = Process.myPid();
        ghd ghdVar = gidVar.a;
        ghdVar.getClass();
        try {
            psaVar.F0(gidVar.c, iJ, new gm5(1009000300, 8, packageName, iMyPid, new Bundle(gidVar.f), 0).b());
        } catch (RemoteException e) {
            w7d.L("Failed to call connection request.", e);
            Objects.requireNonNull(ghdVar);
            ghdVar.u0(new dnb(ghdVar, (byte) 23));
        }
    }

    @Override // defpackage.gig
    public final void A(pf2 pf2Var, boolean z) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setAudioAttributes().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(35)) {
            gidVar.g(new hg7(gidVar, pf2Var, z));
            if (gidVar.p.q.equals(pf2Var)) {
                return;
            }
            gidVar.p = gidVar.p.a(pf2Var);
            ijcVar.d(20, new hi8(pf2Var, (byte) 1));
            ijcVar.c();
        }
    }

    @Override // defpackage.gig
    public final void B(vjd vjdVar) {
        v0();
        z4o.D(vjdVar, "playlistMetadata must not be null");
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setPlaylistMetadata().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(19)) {
            gidVar.g(new z0c(gidVar, vjdVar, (byte) 7));
            if (gidVar.p.m.equals(vjdVar)) {
                return;
            }
            gidVar.p = gidVar.p.g(vjdVar);
            ijcVar.d(15, new di8(vjdVar, (byte) 1));
            ijcVar.c();
        }
    }

    @Override // defpackage.gig
    public final boolean C(int i) {
        return P().a(i);
    }

    @Override // defpackage.gig
    public final void D(boolean z) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setDeviceMuted().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(26)) {
            gidVar.g(new xhd(gidVar, z, (byte) 2));
            ijg ijgVar = gidVar.p;
            if (ijgVar.u != z) {
                gidVar.p = ijgVar.c(ijgVar.t, z);
                ijcVar.d(30, new xhd(gidVar, z, (byte) 3));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void E(qjd qjdVar) throws d45 {
        v0();
        z4o.D(qjdVar, "mediaItems must not be null");
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setMediaItem().");
        } else if (gidVar.s(31)) {
            gidVar.g(new shd(gidVar, qjdVar, (byte) 0));
            gidVar.K(Collections.singletonList(qjdVar), true, -9223372036854775807L, -1);
        }
    }

    @Override // defpackage.gig
    public final boolean F() {
        v0();
        gql currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f0(), this.b, 0L).h;
    }

    @Override // defpackage.gig
    public final int G() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.z;
        }
        return 0;
    }

    @Override // defpackage.gig
    public final void H(int i, qjd qjdVar) throws d45 {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring replaceMediaItem().");
        } else if (gidVar.s(20)) {
            z4o.w(i >= 0);
            gidVar.g(new so4(gidVar, i, qjdVar, (byte) 5));
            gidVar.F(i, i + 1, h1b.v(qjdVar));
        }
    }

    @Override // defpackage.gig
    public final Looper I() {
        return this.f.getLooper();
    }

    @Override // defpackage.gig
    public final void J() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring mute().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(24)) {
            gidVar.g(new phd(gidVar, (byte) 14));
            ijg ijgVar = gidVar.p;
            if (ijgVar.n != 0.0f) {
                gidVar.p = ijgVar.n(0.0f);
                ijcVar.d(22, new uac((byte) 23));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void K() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring increaseDeviceVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(26)) {
            gidVar.g(new phd(gidVar, (byte) 9));
            ijg ijgVar = gidVar.p;
            int i = ijgVar.t + 1;
            int i2 = ijgVar.s.c;
            if (i2 == 0 || i <= i2) {
                gidVar.p = ijgVar.c(i, ijgVar.u);
                ijcVar.d(30, new nhd(gidVar, i, (byte) 3));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final nyl L() {
        v0();
        gid gidVar = this.d;
        return !gidVar.r() ? nyl.J : gidVar.p.G;
    }

    @Override // defpackage.gig
    public final void M() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekToNext().");
            return;
        }
        if (gidVar.s(9)) {
            gidVar.g(new phd(gidVar, (byte) 10));
            gql gqlVar = gidVar.p.j;
            if (gqlVar.p() || gidVar.t()) {
                return;
            }
            if (gidVar.p()) {
                gidVar.I(gidVar.m(), -9223372036854775807L);
                return;
            }
            fql fqlVarM = gqlVar.m(gid.j(gidVar.p), new fql(), 0L);
            if (fqlVarM.h && fqlVarM.a()) {
                gidVar.I(gid.j(gidVar.p), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.gig
    public final int N() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.t;
        }
        return 0;
    }

    @Override // defpackage.gig
    public final long O() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.h;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gig
    public final cig P() {
        v0();
        gid gidVar = this.d;
        return !gidVar.r() ? cig.b : gidVar.y;
    }

    @Override // defpackage.gig
    public final qjd Q(int i) {
        return getCurrentTimeline().m(i, this.b, 0L).b;
    }

    @Override // defpackage.gig
    public final long R() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.E;
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final void S(eig eigVar) {
        z4o.D(eigVar, "listener must not be null");
        this.d.i.a(eigVar);
    }

    @Override // defpackage.gig
    public final long T() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.i;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gig
    public final r4n U() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.l : r4n.d;
    }

    @Override // defpackage.gig
    public final float V() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.n;
        }
        return 1.0f;
    }

    @Override // defpackage.gig
    public final pf2 W() {
        v0();
        gid gidVar = this.d;
        return !gidVar.r() ? pf2.i : gidVar.p.q;
    }

    @Override // defpackage.gig
    public final u67 X() {
        v0();
        gid gidVar = this.d;
        return !gidVar.r() ? u67.e : gidVar.p.s;
    }

    @Override // defpackage.gig
    public final void Y(int i, int i2) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setDeviceVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(33)) {
            byte b = 1;
            gidVar.g(new thd(gidVar, i, i2, b));
            ijg ijgVar = gidVar.p;
            u67 u67Var = ijgVar.s;
            if (ijgVar.t == i || u67Var.b > i) {
                return;
            }
            int i3 = u67Var.c;
            if (i3 == 0 || i <= i3) {
                gidVar.p = ijgVar.c(i, ijgVar.u);
                ijcVar.d(30, new nhd(gidVar, i, b));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final boolean Z() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.q();
    }

    @Override // defpackage.gig
    public final void a() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring prepare().");
            return;
        }
        if (gidVar.s(2)) {
            gidVar.g(new phd(gidVar, (byte) 13));
            ijg ijgVar = gidVar.p;
            if (ijgVar.A == 1) {
                gidVar.O(ijgVar.f(ijgVar.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.gig
    public final long a0() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.D;
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final void b(float f) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setPlaybackSpeed().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(13)) {
            gidVar.g(new uhd(gidVar, f, (byte) 0));
            thg thgVar = gidVar.p.g;
            if (thgVar.a != f) {
                thg thgVar2 = new thg(f, thgVar.b);
                gidVar.p = gidVar.p.e(thgVar2);
                ijcVar.d(12, new vhd(thgVar2, (byte) 0));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void b0(int i, List list) throws d45 {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring addMediaItems().");
        } else if (gidVar.s(20)) {
            z4o.w(i >= 0);
            gidVar.g(new so4(gidVar, i, list, (byte) 6));
            gidVar.a(i, list);
        }
    }

    @Override // defpackage.gig
    public final void c(thg thgVar) {
        v0();
        z4o.D(thgVar, "playbackParameters must not be null");
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setPlaybackParameters().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(13)) {
            gidVar.g(new z0c(gidVar, thgVar, (byte) 9));
            if (gidVar.p.g.equals(thgVar)) {
                return;
            }
            gidVar.p = gidVar.p.e(thgVar);
            ijcVar.d(12, new vhd(thgVar, (byte) 1));
            ijcVar.c();
        }
    }

    @Override // defpackage.gig
    public final boolean c0() {
        v0();
        gql currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f0(), this.b, 0L).g;
    }

    @Override // defpackage.gig
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring clearVideoSurfaceView().");
            return;
        }
        if (gidVar.s(27)) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            if (gidVar.s(27) && holder != null && gidVar.A == holder) {
                gidVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void clearVideoTextureView(TextureView textureView) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring clearVideoTextureView().");
        } else if (gidVar.s(27) && textureView != null && gidVar.B == textureView) {
            gidVar.c();
        }
    }

    @Override // defpackage.gig
    public final long d() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.g;
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final vjd d0() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.m : vjd.K;
    }

    @Override // defpackage.gig
    public final void e(qjd qjdVar, long j) throws d45 {
        v0();
        z4o.D(qjdVar, "mediaItems must not be null");
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setMediaItem().");
        } else if (gidVar.s(31)) {
            gidVar.g(new zx(j, gidVar, qjdVar));
            gidVar.K(Collections.singletonList(qjdVar), false, j, -1);
        }
    }

    @Override // defpackage.gig
    public final boolean e0() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.p.x;
    }

    @Override // defpackage.gig
    public final void f() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring clearMediaItems().");
        } else if (gidVar.s(20)) {
            gidVar.g(new phd(gidVar, (byte) 6));
            gidVar.E(0, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.gig
    public final int f0() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gid.j(gidVar.p);
        }
        return -1;
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
    public final void g0(eig eigVar) {
        v0();
        z4o.D(eigVar, "listener must not be null");
        this.d.i.f(eigVar);
    }

    @Override // defpackage.gig
    public final int getBufferedPercentage() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.f;
        }
        return 0;
    }

    @Override // defpackage.gig
    public final long getBufferedPosition() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.e;
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final long getContentPosition() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.i();
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final int getCurrentAdGroupIndex() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.a.h;
        }
        return -1;
    }

    @Override // defpackage.gig
    public final int getCurrentAdIndexInAdGroup() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.a.i;
        }
        return -1;
    }

    @Override // defpackage.gig
    public final int getCurrentPeriodIndex() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.a.e;
        }
        return -1;
    }

    @Override // defpackage.gig
    public final long getCurrentPosition() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.k();
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final gql getCurrentTimeline() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.j : gql.a;
    }

    @Override // defpackage.gig
    public final int getCurrentWindowIndex() {
        return f0();
    }

    @Override // defpackage.gig
    public final long getDuration() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.l();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.gig
    public final int getNextWindowIndex() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.m();
        }
        return -1;
    }

    @Override // defpackage.gig
    public final boolean getPlayWhenReady() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.p.v;
    }

    @Override // defpackage.gig
    public final thg getPlaybackParameters() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.g : thg.d;
    }

    @Override // defpackage.gig
    public final int getPlaybackState() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.A;
        }
        return 1;
    }

    @Override // defpackage.gig
    public final int getRepeatMode() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.h;
        }
        return 0;
    }

    @Override // defpackage.gig
    public final boolean getShuffleModeEnabled() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.p.i;
    }

    @Override // defpackage.gig
    public final void h() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else if (gidVar.s(6)) {
            gidVar.g(new phd(gidVar, (byte) 4));
            if (gidVar.o() != -1) {
                gidVar.I(gidVar.o(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.gig
    public final void h0(int i, int i2) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring moveMediaItem().");
        } else if (gidVar.s(20)) {
            z4o.w(i >= 0 && i2 >= 0);
            gidVar.g(new thd(gidVar, i, i2, (byte) 2));
            gidVar.y(i, i + 1, i2);
        }
    }

    @Override // defpackage.gig
    public final void i(final int i, final boolean z) {
        v0();
        final gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setDeviceMuted().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(34)) {
            gidVar.g(new did() { // from class: whd
                @Override // defpackage.did
                public final void c(ssa ssaVar, int i2) {
                    ssaVar.O(gidVar.c, i2, z, i);
                }
            });
            ijg ijgVar = gidVar.p;
            if (ijgVar.u != z) {
                gidVar.p = ijgVar.c(ijgVar.t, z);
                ijcVar.d(30, new xhd(gidVar, z, (byte) 0));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void i0(int i, int i2, int i3) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring moveMediaItems().");
        } else if (gidVar.s(20)) {
            z4o.w(i >= 0 && i <= i2 && i3 >= 0);
            gidVar.g(new jo4(i, i2, i3, gidVar));
            gidVar.y(i, i2, i3);
        }
    }

    @Override // defpackage.gig
    public final boolean isCurrentWindowSeekable() {
        return c0();
    }

    @Override // defpackage.gig
    public final boolean isLoading() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.p.y;
    }

    @Override // defpackage.gig
    public final boolean isPlayingAd() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.t();
    }

    @Override // defpackage.gig
    public final void j() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring decreaseDeviceVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(26)) {
            gidVar.g(new phd(gidVar, (byte) 16));
            ijg ijgVar = gidVar.p;
            int i = ijgVar.t - 1;
            if (i >= ijgVar.s.b) {
                gidVar.p = ijgVar.c(i, ijgVar.u);
                ijcVar.d(30, new nhd(gidVar, i, (byte) 9));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void j0(List list) throws d45 {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring addMediaItems().");
        } else if (gidVar.s(20)) {
            gidVar.g(new yhd(gidVar, list, (byte) 1));
            gidVar.a(gidVar.p.j.o(), list);
        }
    }

    @Override // defpackage.gig
    public final void k(int i) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring increaseDeviceVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(34)) {
            gidVar.g(new nhd(gidVar, i, (byte) 4));
            ijg ijgVar = gidVar.p;
            int i2 = ijgVar.t + 1;
            int i3 = ijgVar.s.c;
            if (i3 == 0 || i2 <= i3) {
                gidVar.p = ijgVar.c(i2, ijgVar.u);
                ijcVar.d(30, new nhd(gidVar, i2, (byte) 5));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final boolean k0() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.u;
        }
        return false;
    }

    @Override // defpackage.gig
    public final void l(int i, int i2, List list) throws d45 {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring replaceMediaItems().");
        } else if (gidVar.s(20)) {
            z4o.w(i >= 0 && i <= i2);
            gidVar.g(new rhd(gidVar, list, i, i2, (byte) 1));
            gidVar.F(i, i2, list);
        }
    }

    @Override // defpackage.gig
    public final void l0(qjd qjdVar) throws d45 {
        v0();
        z4o.D(qjdVar, "mediaItems must not be null");
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setMediaItems().");
        } else if (gidVar.s(31)) {
            gidVar.g(new shd(gidVar, qjdVar, (byte) 1));
            gidVar.K(Collections.singletonList(qjdVar), true, -9223372036854775807L, -1);
        }
    }

    @Override // defpackage.gig
    public final void m(nyl nylVar) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(29)) {
            gidVar.g(new z0c(gidVar, nylVar, (byte) 8));
            ijg ijgVar = gidVar.p;
            if (nylVar != ijgVar.G) {
                gidVar.p = ijgVar.m(nylVar);
                ijcVar.d(19, new ii8(nylVar, (byte) 1));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final long m0() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.c.j;
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final boolean n() {
        return false;
    }

    @Override // defpackage.gig
    public final void n0(int i) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setDeviceVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(25)) {
            gidVar.g(new nhd(gidVar, i, (byte) 7));
            ijg ijgVar = gidVar.p;
            u67 u67Var = ijgVar.s;
            if (ijgVar.t == i || u67Var.b > i) {
                return;
            }
            int i2 = u67Var.c;
            if (i2 == 0 || i <= i2) {
                gidVar.p = ijgVar.c(i, ijgVar.u);
                ijcVar.d(30, new nhd(gidVar, i, (byte) 8));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void o(int i) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring removeMediaItem().");
        } else if (gidVar.s(20)) {
            z4o.w(i >= 0);
            gidVar.g(new nhd(gidVar, i, (byte) 2));
            gidVar.E(i, i + 1);
        }
    }

    @Override // defpackage.gig
    public final void o0() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekForward().");
        } else if (gidVar.s(12)) {
            gidVar.g(new phd(gidVar, (byte) 2));
            gidVar.J(gidVar.p.D);
        }
    }

    @Override // defpackage.gig
    public final int p() {
        return getCurrentTimeline().o();
    }

    @Override // defpackage.gig
    public final void p0() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekBack().");
        } else if (gidVar.s(11)) {
            gidVar.g(new phd(gidVar, (byte) 7));
            gidVar.J(-gidVar.p.C);
        }
    }

    @Override // defpackage.gig
    public final void pause() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring pause().");
        } else if (gidVar.s(1)) {
            gidVar.g(new phd(gidVar, (byte) 8));
            gidVar.L(false);
        }
    }

    @Override // defpackage.gig
    public final void play() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring play().");
        } else if (!gidVar.s(1)) {
            w7d.K("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            gidVar.g(new phd(gidVar, (byte) 11));
            gidVar.L(true);
        }
    }

    @Override // defpackage.gig
    public final void q(int i, int i2) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring removeMediaItems().");
        } else if (gidVar.s(20)) {
            byte b = 0;
            z4o.w(i >= 0 && i2 >= i);
            gidVar.g(new thd(gidVar, i, i2, b));
            gidVar.E(i, i2);
        }
    }

    @Override // defpackage.gig
    public final vjd q0() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.B : vjd.K;
    }

    @Override // defpackage.gig
    public final void r() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekToPrevious().");
            return;
        }
        if (gidVar.s(7)) {
            gidVar.g(new phd(gidVar, (byte) 5));
            gql gqlVar = gidVar.p.j;
            if (gqlVar.p() || gidVar.t()) {
                return;
            }
            boolean zQ = gidVar.q();
            fql fqlVarM = gqlVar.m(gid.j(gidVar.p), new fql(), 0L);
            if (fqlVarM.h && fqlVarM.a()) {
                if (zQ) {
                    gidVar.I(gidVar.o(), -9223372036854775807L);
                }
            } else if (!zQ || gidVar.k() > gidVar.p.E) {
                gidVar.I(gid.j(gidVar.p), 0L);
            } else {
                gidVar.I(gidVar.o(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.gig
    public final void r0(List list) throws d45 {
        v0();
        z4o.D(list, "mediaItems must not be null");
        byte b = 0;
        for (int i = 0; i < list.size(); i++) {
            z4o.t(i, "items must not contain null, index=%s", list.get(i) != null);
        }
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setMediaItems().");
        } else if (gidVar.s(20)) {
            gidVar.g(new yhd(gidVar, list, b));
            gidVar.K(list, true, -9223372036854775807L, -1);
        }
    }

    @Override // defpackage.gig
    public final void release() {
        String str;
        Handler handler = this.f;
        v0();
        if (this.c) {
            return;
        }
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.9.0] [");
        sb.append(tym.a);
        sb.append("] [");
        HashSet hashSet = rjd.a;
        synchronized (rjd.class) {
            str = rjd.b;
        }
        sb.append(str);
        sb.append("]");
        w7d.G(sb.toString());
        this.c = true;
        handler.removeCallbacksAndMessages(null);
        try {
            this.d.D();
        } catch (Exception e) {
            synchronized (w7d.e) {
                w7d.e("Exception while releasing impl", e);
            }
        }
        if (this.h) {
            z4o.H(Looper.myLooper() == handler.getLooper());
            this.e.getClass();
        } else {
            this.h = true;
            mhd mhdVar = this.i;
            mhdVar.getClass();
            mhdVar.setException(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.gig
    public final rhg s() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.a;
        }
        return null;
    }

    @Override // defpackage.gig
    public final long s0() {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            return gidVar.p.C;
        }
        return 0L;
    }

    @Override // defpackage.gig
    public final void seekTo(int i, long j) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekTo().");
        } else if (gidVar.s(10)) {
            z4o.w(i >= 0);
            gidVar.g(new oo4(i, j, gidVar));
            gidVar.I(i, j);
        }
    }

    @Override // defpackage.gig
    public final void seekTo(long j) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekTo().");
        } else if (gidVar.s(5)) {
            gidVar.g(new qhd(j, gidVar));
            gidVar.I(gid.j(gidVar.p), j);
        }
    }

    @Override // defpackage.gig
    public final void seekToDefaultPosition() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekTo().");
        } else if (gidVar.s(4)) {
            gidVar.g(new phd(gidVar, (byte) 3));
            gidVar.I(gid.j(gidVar.p), -9223372036854775807L);
        }
    }

    @Override // defpackage.gig
    public final void seekToDefaultPosition(int i) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekTo().");
        } else if (gidVar.s(10)) {
            byte b = 0;
            z4o.w(i >= 0);
            gidVar.g(new nhd(gidVar, i, b));
            gidVar.I(i, -9223372036854775807L);
        }
    }

    @Override // defpackage.gig
    public final void setPlayWhenReady(boolean z) {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            if (gidVar.s(1)) {
                gidVar.g(new xhd(gidVar, z, (byte) 4));
                gidVar.L(z);
            } else if (z) {
                w7d.K("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            }
        }
    }

    @Override // defpackage.gig
    public final void setRepeatMode(int i) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setRepeatMode().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(15)) {
            gidVar.g(new nhd(gidVar, i, (byte) 6));
            ijg ijgVar = gidVar.p;
            if (ijgVar.h != i) {
                gidVar.p = ijgVar.i(i);
                ijcVar.d(8, new gz3((byte) 7, i));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void setShuffleModeEnabled(boolean z) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setShuffleMode().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(14)) {
            gidVar.g(new xhd(gidVar, z, (byte) 1));
            ijg ijgVar = gidVar.p;
            if (ijgVar.i != z) {
                gidVar.p = ijgVar.k(z);
                ijcVar.d(9, new go4((byte) 5, z));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        v0();
        gid gidVar = this.d;
        if (gidVar.r()) {
            gidVar.M(surfaceHolder);
        } else {
            w7d.K("The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override // defpackage.gig
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setVideoSurfaceView().");
        } else if (gidVar.s(27)) {
            gidVar.M(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // defpackage.gig
    public final void setVideoTextureView(TextureView textureView) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setVideoTextureView().");
            return;
        }
        if (gidVar.s(27)) {
            if (textureView == null) {
                gidVar.c();
                return;
            }
            if (gidVar.B == textureView) {
                return;
            }
            gidVar.b();
            gidVar.B = textureView;
            textureView.setSurfaceTextureListener(gidVar.h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                gidVar.N(null, 0, 0);
                gidVar.B(0, 0);
            } else {
                Surface surface = new Surface(surfaceTexture);
                gidVar.z = surface;
                gidVar.N(surface, textureView.getWidth(), textureView.getHeight());
                gidVar.B(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override // defpackage.gig
    public final void setVolume(float f) {
        v0();
        byte b = 1;
        z4o.v("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(24)) {
            gidVar.g(new uhd(gidVar, f, b));
            ijg ijgVar = gidVar.p;
            if (ijgVar.n != f) {
                gidVar.p = ijgVar.n(f);
                ijcVar.d(22, new io4(f, (byte) 3));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void stop() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring stop().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(3)) {
            gidVar.g(new phd(gidVar, (byte) 12));
            ijg ijgVar = gidVar.p;
            c4j c4jVar = gidVar.p.c;
            fig figVar = c4jVar.a;
            boolean z = c4jVar.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c4j c4jVar2 = gidVar.p.c;
            long j = c4jVar2.d;
            long j2 = c4jVar2.a.f;
            int iQ = z5i.q(j2, j);
            c4j c4jVar3 = gidVar.p.c;
            ijg ijgVarJ = ijgVar.j(new c4j(figVar, z, jElapsedRealtime, j, j2, iQ, 0L, c4jVar3.h, c4jVar3.i, c4jVar3.a.f));
            gidVar.p = ijgVarJ;
            if (ijgVarJ.A != 1) {
                gidVar.p = ijgVarJ.f(1, ijgVarJ.a);
                ijcVar.d(4, new uac((byte) 22));
                ijcVar.c();
            }
        }
    }

    @Override // defpackage.gig
    public final void t() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring unmute().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(24)) {
            float f = gidVar.p.o;
            gidVar.g(new uhd(gidVar, f, (byte) 2));
            ijg ijgVar = gidVar.p;
            float f2 = ijgVar.n;
            if (f2 == ijgVar.o || f2 != 0.0f) {
                return;
            }
            gidVar.p = ijgVar.n(f);
            ijcVar.d(22, new io4(f, (byte) 4));
            ijcVar.c();
        }
    }

    @Override // defpackage.gig
    public final boolean t0() {
        v0();
        gql currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f0(), this.b, 0L).a();
    }

    @Override // defpackage.gig
    public final void u() {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring seekToNextMediaItem().");
        } else if (gidVar.s(8)) {
            gidVar.g(new phd(gidVar, (byte) 15));
            if (gidVar.m() != -1) {
                gidVar.I(gidVar.m(), -9223372036854775807L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        tym.S(this.f, runnable);
    }

    @Override // defpackage.gig
    public final void v(int i) {
        v0();
        gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring decreaseDeviceVolume().");
            return;
        }
        ijc ijcVar = gidVar.i;
        if (gidVar.s(34)) {
            gidVar.g(new nhd(gidVar, i, (byte) 10));
            ijg ijgVar = gidVar.p;
            int i2 = ijgVar.t - 1;
            if (i2 >= ijgVar.s.b) {
                gidVar.p = ijgVar.c(i2, ijgVar.u);
                ijcVar.d(30, new nhd(gidVar, i2, (byte) 11));
                ijcVar.c();
            }
        }
    }

    public final void v0() {
        z4o.G("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f.getLooper());
    }

    @Override // defpackage.gig
    public final fzl w() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.F : fzl.b;
    }

    @Override // defpackage.gig
    public final void x(final int i, final List list, final long j) throws d45 {
        v0();
        z4o.D(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            z4o.t(i2, "items must not contain null, index=%s", list.get(i2) != null);
        }
        final gid gidVar = this.d;
        if (!gidVar.r()) {
            w7d.K("The controller is not connected. Ignoring setMediaItems().");
        } else if (gidVar.s(20)) {
            gidVar.g(new did() { // from class: aid
                @Override // defpackage.did
                public final void c(ssa ssaVar, int i3) {
                    lid lidVar = gidVar.c;
                    z0b z0bVarP = h1b.p();
                    int i4 = 0;
                    while (true) {
                        List list2 = list;
                        if (i4 >= list2.size()) {
                            ssaVar.d0(lidVar, i3, new k14(z0bVarP.g()), i, j);
                            return;
                        } else {
                            z0bVarP.c(((qjd) list2.get(i4)).c(true));
                            i4++;
                        }
                    }
                }
            });
            gidVar.K(list, false, j, i);
        }
    }

    @Override // defpackage.gig
    public final boolean y() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() && gidVar.p();
    }

    @Override // defpackage.gig
    public final y36 z() {
        v0();
        gid gidVar = this.d;
        return gidVar.r() ? gidVar.p.r : y36.d;
    }
}
