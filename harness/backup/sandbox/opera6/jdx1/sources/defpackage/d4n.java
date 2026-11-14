package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class d4n extends c4n implements Choreographer.FrameCallback {
    @Override // defpackage.c4n
    public final void a() {
        long refreshRate;
        this.b.registerDisplayListener(this, tym.p(null));
        this.a.postFrameCallback(this);
        if (this.b.getDisplay(0) != null) {
            refreshRate = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            w7d.K("Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.d = refreshRate;
    }

    @Override // defpackage.c4n
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.c = j;
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.a.postFrameCallback(this);
            if (this.b.getDisplay(0) != null) {
                refreshRate = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                w7d.K("Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.d = refreshRate;
        }
    }
}
