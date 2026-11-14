package defpackage;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class u94 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ z1h a;

    public u94(z1h z1hVar) {
        this.a = z1hVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        sd4.a(str);
        sgb.g0(this.a, new sd4(str));
    }
}
