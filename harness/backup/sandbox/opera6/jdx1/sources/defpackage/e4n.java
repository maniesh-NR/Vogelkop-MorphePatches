package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* loaded from: classes.dex */
public final class e4n extends c4n implements Choreographer$VsyncCallback {
    public final Handler e;

    public e4n(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = tym.p(null);
    }

    @Override // defpackage.c4n
    public final void a() {
        this.b.registerDisplayListener(this, tym.p(null));
        this.a.postVsyncCallback(this);
    }

    @Override // defpackage.c4n
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final /* synthetic */ void c() {
        this.a.postVsyncCallback(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.postDelayed(new y1n(this, (byte) 5), 500L);
    }
}
