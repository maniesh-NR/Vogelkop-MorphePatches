package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class e3n extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ f3n a;

    public e3n(f3n f3nVar) {
        this.a = f3nVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l == null) {
            return;
        }
        this.a.b.y = l.longValue();
    }
}
