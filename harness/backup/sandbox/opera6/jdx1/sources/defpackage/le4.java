package defpackage;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class le4 {
    public final CameraDevice.StateCallback a;
    public final f1p b;
    public final sn7 c;

    public le4(CameraDevice.StateCallback stateCallback, f1p f1pVar, sn7 sn7Var) {
        this.a = stateCallback;
        this.b = f1pVar;
        this.c = sn7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le4)) {
            return false;
        }
        le4 le4Var = (le4) obj;
        return Intrinsics.a(this.a, le4Var.a) && Intrinsics.a(this.b, le4Var.b) && Intrinsics.a(this.c, le4Var.c);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.a;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        f1p f1pVar = this.b;
        int iHashCode2 = (iHashCode + (f1pVar == null ? 0 : f1pVar.hashCode())) * 31;
        sn7 sn7Var = this.c;
        return iHashCode2 + (sn7Var != null ? Long.hashCode(sn7Var.a) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
