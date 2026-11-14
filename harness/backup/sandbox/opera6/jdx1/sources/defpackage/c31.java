package defpackage;

import android.hardware.camera2.CaptureFailure;

/* loaded from: classes.dex */
public final class c31 implements hwh {
    public final CaptureFailure a;
    public final int b;
    public final boolean c;

    public c31(CaptureFailure captureFailure) {
        this.a = captureFailure;
        captureFailure.getFrameNumber();
        this.b = captureFailure.getReason();
        this.c = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CaptureFailure.class))) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.hwh
    public final int getReason() {
        return this.b;
    }

    @Override // defpackage.hwh
    public final boolean m() {
        return this.c;
    }
}
