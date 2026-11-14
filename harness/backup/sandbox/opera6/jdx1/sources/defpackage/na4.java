package defpackage;

import android.hardware.camera2.CameraManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class na4 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ z1h b;
    public final /* synthetic */ Object c;

    public na4(z1h z1hVar, oa4 oa4Var) {
        this.b = z1hVar;
        this.c = oa4Var;
    }

    public na4(za4 za4Var, z1h z1hVar) {
        this.c = za4Var;
        this.b = z1hVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        switch (this.a) {
            case 0:
                sgb.g0(this.b, xf4.a);
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        byte b = this.a;
        z1h z1hVar = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (Intrinsics.a(str, ((oa4) obj).b)) {
                    sd4.a(str);
                    sgb.g0(z1hVar, new wf4(str));
                    break;
                }
                break;
            default:
                ((za4) obj).c(z1hVar, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        byte b = this.a;
        z1h z1hVar = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (Intrinsics.a(str, ((oa4) obj).b)) {
                    sd4.a(str);
                    sgb.g0(z1hVar, new yf4(str));
                    break;
                }
                break;
            default:
                ((za4) obj).c(z1hVar, str, false);
                break;
        }
    }
}
