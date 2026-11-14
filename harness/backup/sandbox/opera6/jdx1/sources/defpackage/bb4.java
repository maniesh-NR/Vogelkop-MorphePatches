package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final class bb4 implements cb4 {
    public final CameraDevice.CameraDeviceSetup a;
    public final String b;
    public final db4 c;

    public bb4(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, db4 db4Var) {
        this.a = cameraDeviceSetup;
        this.b = str;
        this.c = db4Var;
    }

    public final CaptureRequest.Builder a(int i) throws Exception {
        try {
            return this.a.createCaptureRequest(i);
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            String str = this.b;
            db4 db4Var = this.c;
            if (!z) {
                if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                    return null;
                }
                if (e instanceof IllegalStateException) {
                    return null;
                }
                throw e;
            }
            e.getMessage();
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    cameraAccessException.toString();
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            db4Var.a(i2, str, true);
            return null;
        }
    }
}
