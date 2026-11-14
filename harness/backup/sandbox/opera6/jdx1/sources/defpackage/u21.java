package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;

/* loaded from: classes.dex */
public final class u21 extends t21 {
    public final CameraConstrainedHighSpeedCaptureSession e;

    public u21(v21 v21Var, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, db4 db4Var, Handler handler) {
        super(v21Var, cameraConstrainedHighSpeedCaptureSession, db4Var, handler);
        this.e = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.t21, defpackage.inm
    public final Object E(s15 s15Var) {
        return s15Var.equals(uqh.a(CameraConstrainedHighSpeedCaptureSession.class)) ? this.e : super.E(s15Var);
    }
}
