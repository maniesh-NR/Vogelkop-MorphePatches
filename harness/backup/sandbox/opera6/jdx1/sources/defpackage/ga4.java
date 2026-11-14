package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
public final class ga4 implements uc4 {
    public final CameraDevice.CameraDeviceSetup a;

    public ga4(CameraManager cameraManager, String str) {
        this.a = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // defpackage.uc4
    public final ng2 a(SessionConfiguration sessionConfiguration) throws NumberFormatException {
        int i = this.a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new ng2((byte) 1, i);
    }
}
