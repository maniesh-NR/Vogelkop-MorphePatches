package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* loaded from: classes.dex */
public final class eb4 extends zy9 {
    public static final an2 e = new an2("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final an2 f = new an2("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final an2 g = new an2("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final an2 h = new an2("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final an2 i;
    public static final an2 j;
    public static final an2 k;

    static {
        Class cls = Long.TYPE;
        i = new an2("camera2.cameraCaptureSession.streamUseCase", cls, null);
        j = new an2("camera2.cameraCaptureSession.streamUseHint", cls, null);
        k = new an2("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
