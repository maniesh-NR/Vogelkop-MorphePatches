package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class x61 implements oxd, inm {
    public final CaptureResult a;
    public final String b;
    public final n08 c = n08.a;

    public x61(CaptureResult captureResult, String str) {
        this.a = captureResult;
        this.b = str;
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        boolean zEquals = s15Var.equals(uqh.a(CaptureResult.class));
        CaptureResult captureResult = this.a;
        if (zEquals) {
            return captureResult;
        }
        if (!s15Var.equals(uqh.a(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final Object c(CaptureResult.Key key) {
        this.c.getClass();
        return this.a.get(key);
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) sd4.b(this.b)) + ", frameNumber: " + this.a.getFrameNumber() + ')';
    }
}
